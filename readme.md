### 设计模式

----

> 设计模式并非类库

为了方便地写 Java 程序，我们会使用类库，但是设计模式并非类库。

 与类库相比，设计模式是一种更为普遍的概念。类库是由程序组合而成的组件，而设计模式则用来表现内部组件是如何被组装的，以及每一个组件是如何通过相互关联来构成一个庞大系统的。

<b>类库中使用了设计模式</b>

设计模式并非类库，但是 Java 标准类库中使用了许多设计模式。掌握了设计模式可以帮助我们理解这些类库所扮演的角色。

典型的例子如下所示：

* java.util.Iterator 是用于遍历元素集合的接口，这里使用了 <b>Iterator</b> 模式

* Java.util.Observer 是用于观察对象状态变化的接口，这里使用了 <b>Observer</b> 模式

* 以下的方法中使用了 <b>Factory Method</b> 模式
  Java.util.Calendar 类的 getInstance 方法

  java.secure.SecureRandom 类的 getInstance 方法

  java.text.NumberFormat 类的 getInstance 方法

* java.awt.Component 和 java.awt.Container 这两个类中使用了 <b>Composite</b> 模式

设计模式的目标之一是 提高程序的可复用性；也就是说，设计模式考虑的是怎样才能将程序作为"组件"重复使用。因此，不应该将示例程序看作是成品，而应当将其作为扩展和变更的基础。

* 有哪些功能可以被扩展
* 扩展功能时必须修改哪些地方
* 有哪些类不需要修改