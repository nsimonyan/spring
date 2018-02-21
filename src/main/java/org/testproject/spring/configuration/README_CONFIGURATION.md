## Configuration annotation

@Configuration indicates that the class can be used by the Spring IoC container as a source of bean definitions.

## Bean annotation

 The @Bean annotation tells Spring that a method annotated with @Bean will return an object that should be registered as a bean in the Spring application context. 
 
## Injecting Bean Dependencies
 
When @Beans have dependencies on one another, expressing that the dependency is as simple as having one bean method calling another as follows 

## The @Import Annotation

The @Import annotation allows for loading @Bean definitions from another configuration class.

## Lifecycle Callbacks

The @Bean annotation supports specifying arbitrary initialization and destruction callback methods, much like Spring XML's init-method and destroy-method attributes on the bean element
   @Bean(initMethod = "init", destroyMethod = "cleanup" )

## Specifying Bean Scope

The default scope is singleton, but you can override this with the @Scope annotation as follows
   @Scope("prototype")

