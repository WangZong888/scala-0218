package com.atguigu.bigdata.packagefunction

object Interface1 {

  def main(args: Array[String]): Unit = {
    var emp03 = new Emp03
    emp03.test()//可以使用特质的所有
    //使用动态混入,新添加功能，直接创建新对象
//    var emp03 = new Emp03 with MyTrait
//    emp03.test()

  }
}

class ParentEmp03{

}
//特质是不能创建对象的(类似于java中的抽象)
//如果当前类没有父类，可以将特质作为父类来使用
//如果当前类存在父类，那么特征是需要混入(with)到对象中的
//如果特质是不完整的，要求子类是抽象类或者补充不完整
//如果重写父类（特质）的完整属性或者方法，需要添加override关键字
//特质有继承关系，混入多个特质采用with
//java所有的接口在scala中都是特质
//scala中的特质不仅仅可以继承其他特质，还可以继承类
//父类，子类，特质的初始化顺序是从左到右依次执行---->
//如果特质已经初始化，就不会再次初始化
class Emp03 extends  MyTrait{
  var age : Int = _
  def test01():Unit ={}

  override val name : String = "lisi"
  //可以声明方法
  override def test(): Unit ={
    println("test1...")
  }
}
//可以使用动态混入
//class Emp03 extends ParentEmp03 {
//
//}

//抽象类，
abstract class Tes{
  val tet :String
  def test1():Unit
}