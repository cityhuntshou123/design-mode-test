### Abstract Factory (归类于创建者模式)
> 将关联零件组装成产品
###
 Abstract 的意思是“抽象的”，Factory 的意思是 “工厂”。将它们组合起来表示 “抽象工厂”的意思。<br/>
 在 Abstract Factory模式中将会出现抽象工厂，它会将抽象零件组装成抽象产品。也就是说，我们并不关心零件的
 具体实现，而是只关系接口。我们仅使用该接口将零件组装成产品。<br/>

#### 示例类一览表
| 包 | 名字 | 说明 |
|:---:|:---:|:--:|
|factory | Factory | 表示抽象工厂的类(制作Link Tray Page)  |
|factory |Item |方便统一处理 Link 类和 Tray 的类|
|factory |Link |抽象零件：表示HTML 的链接的类|
|factory |Tray| 抽象零件：表示含有 Link 和 Tray 的类|
|factory |Page| 抽象零件：表示 HTML 页面的类 |
|无 |Main |测试程序行为的类 |
|listfactory |ListFactory | 表示具体工厂的类(制作ListLink ListTray ListPage)|
|listfactory |ListLink|具体零件：表示 HTML 的链接的类 |
|listfactory |ListTray |具体零件： 表示含有 Link 和 Tray 的类|
|listfactory |ListPage| 具体零件： 表示 HTML 页面的类|

#### 拓展思路的要点

> 易于增加具体的工厂
####
 在Abstract Factory模式中增加具体的工厂是非常容易的。这里说的容易指的是需要编写哪些类和需要实现哪些方法
都非常清楚。
####
> 难以增加新的零件
####
要在Abstract Factory模式中增加新的零件时应当如何做，例如，我们要在factory包中增加一个表示图像的
Picture零件。 这时，我们必须要对所有的具体工厂进行相应的修改才行。

