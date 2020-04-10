## spring-beans模块
Bean在spring中作用就像Object对OOP的意义一样，没有对象的概念就像没有面向对象编程，Spring中没有Bean也就没有
没有spring存在的意义。为什么要Bean这个角色或者为何在Spring中如此重要，这由spring框架设计的目标决定的，依赖注入，控制反转。
Bean组件在spring中org.springframework.beans包下，主要解决：Bean的定义、Bean的创建、以及对Bean的解析。

## 源码包解读
org.springframework.beans, 包含了操作java bean的接口和类。
org.springframework.beans.annotation, 支持包，提供对java 5注解处理bean样式的支持。
org.springframework.beans.factory, 实现spring轻量级IoC容器的核心包。
org.springframework.beans.factory.access, 定位和获取bean工程的辅助工具类。
org.springframework.beans.factory.access.el,从统一样式的EL 获取spring beanFactory的支持类
org.springframework.beans.factory.annotation, 配置基于注解驱动的bean的支持包。
org.springframework.beans.factory.config, bean工厂的SPI接口和配置相关的处理类。
org.springframework.beans.factory.parsing, bean definition解析的支持基础类
org.springframework.beans.factory.serviceloader, jdk1.6 ServiceLoader基础类的支持包。
org.springframework.beans.factory.support,org.springframework.beans.factory包的支持类
org.springframework.beans.factory.wiring, 一种决定一个bean实例的元数据的机制。
org.springframework.beans.factory.xml, 包含了一个基于xml的beanFactory实现，也包含一个标准的spring-beans的dtd
org.springframework.beans.propertyeditors, 属性编辑器，用来将string类型的值转换为object类型，例如：java.util.Properties
org.springframework.beans.support,org.springframework.beans的支持包，像：一组bean的排序和保持工具类等。

1. org.springframework.beans包含的类和接口有：

1.1 BeanInfoFactory：创建java.beans.BeanInfo实例的策略
1.1 BeanMetaDataElement: 传送配置源对象的超级接口。定义了唯一的方法： Object.getSource();其子类和子接口如下

1.1 PropertyAccessor: 获取和设置属性（例如对象bean的属性，对象Field)的通用接口，它用来作为BeanWrapper的基础接口。
主要方法有：
``` Class getPropertyType(String propertyName) 
    TypeDescriptor getPropertyTypeDescriptor(String propertyName) 
    Object getPropertyValue(String propertyName) 
    boolean isReadableProperty(String propertyName) 
    boolean isWritableProperty(String propertyName) 
    void setPropertyValue(PropertyValue pv)
    
```      
1.1 BeanWapper: spring底层JavaBean公共基础的核心接口。
1.1 ConfigurablePropertyAccessor: PropertyAccessor配置方法的封装接口
1.1 Mergeable 代表一个对象的值组可以和父对象的值组合并的接口。其主要子类ManagedList、ManageMap、ManagedProperties、 ManageSet
1.1 PropertyEditorRegister: 用一个属性编辑注册器注册一个自定义的属性编辑器的策略接口
1.1 PropertyEditorEditorRegistry: 封装JavaBean属性编辑器的注册方法
1.1 PropertyValues: 包含一个或者多个PropertyValue对象，通常用作特定的一个目的bean的属性更新。
1.1 TypeConverter: 定义类型转换方法的接口。
1.1 AbstractPropertyAccessor: propertyAccessor接口的抽象实现
1.1 BeanMetaDataAttribute: BeanDefinition定义的属性健值对容器
1.1 BeanMetaDataAttributeAccessor: AttributeAccessorSupport的扩展，为了追踪对象定义源
1.1 BeanUtils: JavaBean静态工具方法：用来初始化bean、检查bean的属性，复制bean的属性值等等。
1.1 BeanWrapperImpl: BeanWrapper的默认实现，能够适用于绝大多数应用场合
1.1 CachedIntrospectionResults：.内部类，缓存一个类的javabean的属性描述信息
1.1 DirectFieldAccessor: PropertyAccessor的实现类，直接获取实例的field。
1.1 ExtendedBeanInfoFactory: BeanInfoFactory接口实现，评估bean的class是否有不满足javaBean规范的set方法，因而是否满足spring ExtendedBeanInfo作为内省的候选
1.1 MutablePropertyValues Default implementation of the PropertyValues interface.  
1.1 PropertyAccessorFactory：获取PropertyAccessor实例的简单工厂门面, 特别是获取BeanWrapper实例   
1.1 PropertyAccessorUtils：工具方法或者工具类，根据PropertyAccessor 获取bean属性
1.1 PropertyEditorRegistrySupport：PropertyEditorRegistry接口的基本实现类
1.1 PropertyValue：一个对象，它保存一个bean的单独属性的值信息。
1.1 PropertyValuesEditor Editor for a PropertyValues object
1.1 SimpleTypeConverter TypeConverter接口的简单实现类，它不会针对一个特定的目标对象进行操作
1.1 TypeConverterSupport TypeConverter接口的基本实现类,使用包私有的代理

4. org.springframework.beans.support包含的类有：

ArgumentConvertingMethodInvoker：MethodInvoker的子类，通过TypeConverter将zhen实目标方法的指定参数进行转换。 
MutableSortDefinition：SortDefinition接口的可变实现。
PagedListHolder<E>：PagedListHolder是一个简单的状态保持，它处理一组对象，将它们分页。 
PropertyComparator：比较对象为两个bean，通过BeanWrapper来比较指定bean的属性。 
ResourceEditorRegistrar：继承了PropertyEditorRegistrar，使用资源编辑器来填充指定的PropertyEditorRegistry。

