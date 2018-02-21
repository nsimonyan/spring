##BEAN Properties & Description
> 1	class

This attribute is mandatory and specifies the bean class to be used to create the bean.

>2	name

This attribute specifies the bean identifier uniquely. In XMLbased configuration metadata, you use the id and/or name attributes to specify the bean identifier(s).

>3	scope

This attribute specifies the scope of the objects created from a particular bean definition and it will be discussed in bean scopes chapter.

>4	constructor-arg

This is used to inject the dependencies and will be discussed in subsequent chapters.

>5	properties

This is used to inject the dependencies and will be discussed in subsequent chapters.

>6	 autowiring mode

This is used to inject the dependencies and will be discussed in subsequent chapters.

>7	lazy-initialization mode

A lazy-initialized bean tells the IoC container to create a bean instance when it is first requested, rather than at the startup.

>8	initialization method

A callback to be called just after all necessary properties on the bean have been set by the container. It will be discussed in bean life cycle chapter.

>9	destruction method

A callback to be used when the container containing the bean is destroyed. It will be discussed in bean life cycle chapter.

>10 parent

by using parent attribute the bean which use this attribute become child . The child bean inherits parent properties, and can overrides the same property also can introduces more new properties .

## Bean Scope & Description
>1 singleton

If a scope is set to singleton, the Spring IoC container creates exactly one instance of the object defined by that bean definition. This single instance is stored in a cache of such singleton beans, and all subsequent requests and references for that named bean return the cached object
The singleton scope is the default scope in Spring

>2	prototype

If the scope is set to prototype, the Spring IoC container creates a new bean instance of the object every time a request for that specific bean is made. 

>3	request

This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.

>4	session

This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
>5	global-session

This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.