package com.atguigu.bigdata.packagefunction

object Interface2 {

  def main(args: Array[String]): Unit = {
      val mysql = new Mysql()
    mysql.insert()
  }
}
//特质是不能创建对象的
trait Operate{
  println("Operate....")
  def insert(): Unit ={
    println("插入数据...")
  }
}
trait DB extends Operate{
  println("DBOperate....")
  override def insert(): Unit ={
    println("向数据库")
    super.insert()
  }
}
trait File extends Operate{
  println("FileOperate....")
  override def insert(): Unit ={
    println("向文件")
    //特质中的super，不是表示上一级的特质对象，表示上一个特质对象（如：对下面的例子File上一个是DB）
    super.insert()
    //如果想要super指向上一级，可以增加约束[特质的上一级],就没有上一个了
    //super[Operate].insert()
  }
}
//特质的初始化顺序是从左到右-->
//特质的功能执行顺序是从右到左的<--
class ParentMysql{
  println("ParentMysql...")
  def test(): Unit ={
    println("--------")
  }

}
class Mysql extends ParentMysql with DB with File {
}