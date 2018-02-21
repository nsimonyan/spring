## Aspect
 Aspect-Oriented Programming entails breaking down program logic into distinct parts called so-called concerns. The functions that span multiple points of an application are called cross-cutting concerns and these cross-cutting concerns are conceptually separate from the application's business logic. 

AOP addresses the problem of cross-cutting concerns, which would be any kind of code that is repeated in different methods and can't normally be completely refactored into its own module, like with logging or verification.

Logging is the prototypical example of a cross-cutting concern. E.g. an application might use logging in multiple classes when methods are entered or exited. So even though the classes themselves have different responsibilities and are implemented differently they still perform the same secondary functionality, in this case, logging (for yet another example of a cross-cutting functionality see section one of article

## concern
concern is behavior that we want to have in particular module . A concern can be defined as functionality we want to implement

##CROSS CUTTING CONCERNS

Is concern which is applicable throughout the application and it affect the entire application .
For example logging , security ,data transfer is applicable for every module of an application

Means non business idea or non business logic its not part of our main problem it is related to below…
Security
Logging
Transaction

## Aspects Oriented Programming

In this style of code we are make Aspects means Aspects are also specific classes which some special methods for particular tasks like logging, security and transactions etc.

Aspect-Oriented Programming (AOP) complements Object-Oriented Programming (OOP) by providing another way of thinking about program structure. The key unit of modularity in OOP is the class, whereas in AOP the unit of modularity is the aspect. Aspects enable the modularization of concerns such as transaction management that cut across multiple types and objects. (Such concerns are often termed crosscutting concerns in AOP literature.)

Aspect-oriented programming entails breaking down program logic into distinct parts (so-called concerns, cohesive areas of functionality). All programming paradigms support some level of grouping and encapsulation of concerns into separate, independent entities by providing abstractions (e.g., procedures, modules, classes, methods) that can be used for implementing, abstracting, and composing these concerns. But some concerns defy these forms of implementation, and are called crosscutting concerns because they “cut across” multiple abstractions in a program.




## Terms & Description
>1	
Aspect

This is a module which has a set of APIs providing cross-cutting requirements. For example, a logging module would be called AOP aspect for logging. An application can have any number of aspects depending on the requirement.

>2	
Join point

This represents a point in your application where you can plug-in the AOP aspect. You can also say, it is the actual place in the application where an action will be taken using Spring AOP framework.

 A joinpoint is a candidate point in the Program Execution of the application where an aspect can be plugged in. This point could be a method being called, an exception being thrown, or even a field being modified. These are the points where your aspect’s code can be inserted into the normal flow of your application to add new behavior.
 
>3	
Advice

This is the actual action to be taken either before or after the method execution. This is an actual piece of code that is invoked during the program execution by Spring AOP framework.

>4	
Pointcut

This is a set of one or more join points where an advice should be executed. You can specify pointcuts using expressions or patterns as we will see in our AOP examples.

A pointcut defines at what joinpoints, the associated Advice should be applied. Advice can be applied at any joinpoint supported by the AOP framework. Of course, you don’t want to apply all of your aspects at all of the possible joinpoints. Pointcuts allow you to specify where you want your advice to be applied. Often you specify these pointcuts using explicit class and method names or through regular expressions that define matching class and method name patterns. Some AOP frameworks allow you to create dynamic pointcuts that determine whether to apply advice based on runtime decisions, such as the value of method parameters.


The method declaration after pointcut annotation is called the pointcut signature. It provides a name that can be used by advice annotations to refer to that pointcut.

When you go out to a restaurant, you look at a menu and see several options to choose from. You can order one or more of any of the items on the menu. But until you actually order them, they are just "opportunities to dine". Once you place the order and the waiter brings it to your table, it's a meal.

Join points are the options on the menu and pointcuts are the items you select. A joinpoint is an opportunity within code for you to apply an aspect...just an opportunity. Once you take that opportunity and select one or more joinpoints and apply an aspect to them, you've got a pointcut.



>5	
Introduction

An introduction allows you to add new methods or attributes to the existing classes.

>6	
Target object

The object being advised by one or more aspects. This object will always be a proxied object, also referred to as the advised object.

>7	
Weaving

Weaving is the process of linking aspects with other application types or objects to create an advised object. This can be done at compile time, load time, or at runtime.


## Advice & Description
>1	
before

Run advice before the a method execution.

>2	
after

Run advice after the method execution, regardless of its outcome.

>3	
after-returning

Run advice after the a method execution only if method completes successfully.

>4	
after-throwing

Run advice after the a method execution only if method exits by throwing an exception.

>5	
around

Run advice before and after the advised method is invoked.

##Approach & Description

>1	XML Schema based

Aspects are implemented using the regular classes along with XML based configuration.

>2	@AspectJ based

@AspectJ refers to a style of declaring aspects as regular Java classes annotated with Java 5 annotations.



## Spring AOP and AspectJ


Spring AOP	                                   AspectJ
Implemented in pure Java					Implemented using extensions of Java programming language
No need for separate compilation process	Needs AspectJ compiler (ajc) unless LTW is set up
Only runtime weaving is available			Runtime weaving is not available. Supports compile-time, 											post-compile, and load-time Weaving
Less Powerful – only supports method level  More Powerful – can weave fields, methods,
 weaving									 constructors, static initializers, final class/methods,etc…
Can only be implemented on beans managed	Can be implemented on all domain objects
 by Spring container	
Supports only method execution pointcuts	Support all pointcuts
Proxies are created of targeted objects,    Aspects are weaved directly into code before application
 and aspects are applied on these proxies    is executed (before runtime)
 Much slower than AspectJ					Better Performance
 Easy to learn and apply					Comparatively more complicated than Spring AOP
 