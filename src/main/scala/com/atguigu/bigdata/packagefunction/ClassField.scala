package com.atguigu.bigdata.packagefunction

import scala.beans.BeanProperty

object ClassField {

  def main(args: Array[String]): Unit = {
    var field : Field = new ChildField
    //field.name = "zhangsan"
    //field.age = 12
    field.sex = "男"
    field.setEmail("1i2i1i2")
    //println(field.test) //多态调用不能直接使用子类新增的方法,可以使用隐式转换-implicit
    implicit def transform(field: Field): ChildField ={
      new ChildField
    }
    println(field.test())
    println(field.score)
  }

}
class Field{
  //类的属性-对象属性,会自动加上private关键字

  //默认添加private，而set 、get 默认的是public
  //var name:String = _
  //如果类的属性声明private,那么编译器在编译时，也会将get、set方法声明为private
  val score:String = "12"
  private var name:String = _
  //不可修改的，没得set()
  //private(同类)、protected(同类，子类，同包不能访问)、public(公共的)
  //private[包名](同包)
  protected val age :Int = 12
  private[packagefunction] var sex : String = _
  //加上这个注解，就可以增加所谓的get、set方法 ，所以会有4个方法
  //方便以后框架进行反射操作
  @BeanProperty var email : String = _
}

class ChildField extends Field {
  override val score: String = "14"
  def test(): Unit ={
    println(age)
  }
}