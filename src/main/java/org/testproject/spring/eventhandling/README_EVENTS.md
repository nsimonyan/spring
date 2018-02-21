## Application event handling

Spring Framework also provide an another feature to promote loose coupling ,which is Application Event handling. Using Events, an Event publisher object can communicate with other objects without even knowing which object is listen.and event listener can work to event without knowing which object publish the events. Publisher Object that object ,who publish the event or call the event and Listener always listen the events that are occurs.

Event handling in the ApplicationContext is provided through the ApplicationEvent class and ApplicationListener interface. Hence, if a bean implements the ApplicationListener, then every time an ApplicationEvent gets published to the ApplicationContext, that bean is notified

## Spring Built-in Events & Description
> 1	
ContextRefreshedEvent

This event is published when the ApplicationContext is either initialized or refreshed. This can also be raised using the refresh() method on the ConfigurableApplicationContext interface.

> 2	
ContextStartedEvent

This event is published when the ApplicationContext is started using the start() method on the ConfigurableApplicationContext interface. You can poll your database or you can restart any stopped application after receiving this event.

> 3	
ContextStoppedEvent

This event is published when the ApplicationContext is stopped using the stop() method on the ConfigurableApplicationContext interface. You can do required housekeep work after receiving this event.

> 4	
ContextClosedEvent

This event is published when the ApplicationContext is closed using the close() method on the ConfigurableApplicationContext interface. A closed context reaches its end of life; it cannot be refreshed or restarted.

> 5	
RequestHandledEvent

This is a web-specific event telling all beans that an HTTP request has been serviced.