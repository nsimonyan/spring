
## BeanFactory vs ApplicationContext
+---------------------------------------+-----------------+--------------------------------+
|                                       | BeanFactory     |       ApplicationContext       |
+---------------------------------------+-----------------+--------------------------------+
| Annotation support                    | No              | Yes                            |
| BeanPostProcessor Registration        | Manual          | Automatic                      |
| implementation                        | XMLBeanFactory  | ClassPath FileSystem           |      															WebXmlApplicationContext   	   |
| internationalization                  | No              | Yes                            |
| Enterprise services                   | No              | Yes (for example: JNDI access) |
| ApplicationEvent publication          | No              | Yes                            |
+---------------------------------------+-----------------+--------------------------------+

BeanFactory: By default its support Lazy loading
ApplicationContext: It's By default support Aggresive loading.

BeanFactory uses lazy initialization but ApplicationContext uses eager initialization. In case of BeanFactory, bean is created when you call getBeans() method, but bean is created upfront in case of ApplicationContext when the ApplicationContext object is created.
