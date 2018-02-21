##What is autowiring
The Spring container can autowire relationships between collaborating beans without using <constructor-arg> and <property> elements, which helps cut down on the amount of XML configuration you write for a big Spring-based application.

##Modes
> 1 no

This is default setting which means no autowiring and you should use explicit bean reference for wiring. You have nothing to do special for this wiring. 

> 2	byName

Autowiring by property name. Spring container looks at the properties of the beans on which autowire attribute is set to byName in the XML configuration file. It then tries to match and wire its properties with the beans defined by the same names in the configuration file.

 For this type of autowiring, setter method is used for dependency injection. Also the variable name should be same in the class where we will inject the dependency and in the spring bean configuration file.
 
> 3	byType

Autowiring by property datatype. Spring container looks at the properties of the beans on which autowire attribute is set to byType in the XML configuration file. It then tries to match and wire a property if its type matches with exactly one of the beans name in configuration file. If more than one such beans exists, a fatal exception is thrown.

For this type of autowiring, class type is used. So there should be only one bean configured for this type in the spring bean configuration file.
 
 
> 4	constructor

Similar to byType, but type applies to constructor arguments. If there is not exactly one bean of the constructor argument type in the container, a fatal error is raised.

This is almost similar to autowire byType, the only difference is that constructor is used to inject the dependency.


>5 @Autowired annotation 

 We can use Spring @Autowired annotation for spring bean autowiring. @Autowired annotation can be applied on variables and methods for autowiring byType. We can also use @Autowired annotation on constructor for constructor based spring autowiring.
For @Autowired annotation to work, we also need to enable annotation based configuration in spring bean configuration file. This can be done by context:annotation-config element or by defining a bean of type org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.

> 6 @Qualifier annotation 

This annotation is used to avoid conflicts in bean mapping and we need to provide the bean name that will be used for autowiring. This way we can avoid issues where multiple beans are defined for same type. This annotation usually works with the @Autowired annotation. For constructors with multiple arguments, we can use this annotation with the argument names in the method.
> 1 Overriding possibility

You can still specify dependencies using <constructor-arg> and <property> settings which will always override autowiring.

> 2	Primitive data types

You cannot autowire so-called simple properties such as primitives, Strings, and Classes.

> 3	Confusing nature

Autowiring is less exact than explicit wiring, so if possible prefer using explict wiring.



## Annotations
> 1	@Required

The @Required annotation applies to bean property setter methods and it indicates that the affected bean property must be populated in XML configuration file at configuration time. Otherwise, the container throws a BeanInitializationException exception. 

>2	@Autowired

The @Autowired annotation can apply to bean property setter methods, non-setter methods, constructor and properties.

The @Autowired annotation can be used to autowire bean on the setter method just like @Required annotation, constructor, a property or methods with arbitrary names and/or multiple arguments.

You can use @Autowired annotation on setter methods to get rid of the <property> element in XML configuration file. When Spring finds an @Autowired annotation used with setter methods, it tries to perform byType autowiring on the method.


You can use @Autowired annotation on properties to get rid of the setter methods. When you pass the values of autowired properties using <property>, Spring will automatically assign those properties with the passed values or references.

You can apply @Autowired to constructors as well. A constructor @Autowired annotation indicates that the constructor should be autowired when creating the bean, even if no <constructor-arg> elements are used while configuring the bean in XML file.

By default, the @Autowired annotation implies the dependency is required similar to @Required annotation, however, you can turn off the default behavior by using the (required=false) option with @Autowired.


>3	@Qualifier

There may be a situation when you create more than one bean of the same type and want to wire only one of them with a property. In such cases, you can use the @Qualifier annotation along with @Autowired to remove the confusion by specifying which exact bean will be wired. 
The @Qualifier annotation along with @Autowired can be used to remove the confusion by specifiying which exact bean will be wired.

> 4	JSR-250 Annotations

Spring supports JSR-250 based annotations which include @Resource, @PostConstruct and @PreDestroy annotations. Though these annotations are not really required because you already have other alternates, yet let us get a brief idea about them.

You can use @PostConstruct annotation as an alternate of initialization callback and @PreDestroy annotation as an alternate of destruction callback 

You can use @Resource annotation on fields or setter methods and it works the same as in Java EE 5. The @Resource annotation takes a 'name' attribute which will be interpreted as the bean name to be injected. You can say, it follows by-name autowiring semantics as demonstrated in the following 

If no 'name' is specified explicitly, the default name is derived from the field name or setter method. In case of a field, it takes the field name; in case of a setter method, it takes the bean property name.

