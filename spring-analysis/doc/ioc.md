## Bean的实例化过程
1. 转换beanName 
- 传入的名字可能是别名，也可能是FactoryBean, 所以需要一系列解析
    - 取出FactoryBean中的name = "&aa", 首先去除& 而使 name= "aa"
    - 取指定的alias表示最终的beanName
    
2. 尝试从缓存中加载单例Bean
- 单例Bean在同一容器中只会被创建一次，后续再获取bean, 就直接从单例缓存中获取。
尝试加载指的是如果加载不成功，则再次尝试从singletonFactories中加载
- 解决循环依赖问题

3. Bean的实例化
- 如果缓存中得到bean的原始状态，则需要对Bean进行实例化。

4. 原型的依赖检查
- 只有在单例bean的情况下，才会尝试解决循环依赖

5. 检测parentBeanfactory
- 从代码上看如果缓存没有数据的话，直接转到父工厂上去加载

6. 将GenernicBeanDefinition转换成RootBeandefinition
- 从配置文件或者配置类中读取到Bean信息是存储在GenernicBeanDefinition中，
但所有的Bean的后续处理都是针对RootBeanDefinition的，这里需要一个转换
同时如果父类的Bean不为空的话，则会一并合并父类的属性

7. 寻找依赖
- 因为Bean的初始化过程很可能会用到某些属性，而这些属性很可能是动态配置的，并且
配置成依赖于其他的Bean， 那么这个时候需要先加载依赖的Bean,所以在Spring的加载顺序中，
在初始化某个Bean的时候，首先会初始化这个bean所对应的依赖

8. 针对不同scope进行Bean的创建

9. 类型转换


