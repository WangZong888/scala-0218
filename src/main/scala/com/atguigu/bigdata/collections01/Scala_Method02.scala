package com.atguigu.bigdata.collections01

object Scala_Method02 {

  def main(args: Array[String]): Unit = {

    //TODO 集合通用的方法和属性
    val list = List(7, 4, 2, 3,1,6)
    //println(list)
    //反转--将前后顺序颠倒
    //val reverse: List[Int] = list.reverse
    //println(reverse)
    //拿（取）多少条数据,从头开始数
    //println(list.take(3))
    //是否包含
    //println(list.contains(4))
    //过滤数据
    //需要通过过滤规则对集合的每一条数据进行筛选过滤
    //如果结果为true,那么保留数据，否则，数据不要
//   println(list.filter(num => num%2 != 0))
   // println(list.filter(_%2 == 0))
    //通过指定的条件进行分组
    //需要通过分组规则对集合中的每一条数据进行处理，通过处理后的key决定数据放置的组
//    println(list.groupBy(num => num))
//    println(list.groupBy(num => num%2))
   // println(list.groupBy(_%2))

    //排序(降序，升序)
    //println(list.sortWith((left,right) => {left < right})) //升序
    //println(list.sortWith( _ < _))
    //println(list.sortWith((left,right) => {left > right})) //降序
   // println(list.sortWith( _ > _))
    //默认升序排序--可以根据自己定义的规则去排序
    //println(list.sortBy(num => num))
    //以奇数和偶数进行排序--7, 4, 2, 3,1,6
    //println(list.sortBy(num => num%2))

    //map:映射--转换 K-V，把其中一个数据转换成另一个数据
    //map方法可以将指定结构的数据转换成其他结构的数据
    //map方法可以对集合的每一个数据进行转化
    //println(list.map(num => num  * 2))
    //println(list.map(_ * 2))
//    println(list.map(num => (num,1)))
  // println(list.map((_,1)))
    //val tuples: List[(Int, Int)] = list.map((_,1))
    //val map: Map[Int, Int] = tuples.toMap
    //println(map)
    //对map中的数据进行排序，需要转化成List（map无序的）
    //println(map.toList.sortBy(num => num))

    //扁平化
//    val ints: List[Int] = list:::Nil
//    println(ints)

    //list(5,6,3,2,1,4)
    //val lists1 = List(List(5,6),List(3,2),List(1,4))
    //TODO 扁平化操作可以将集合的每一条数据进行分解，形成多个数据的集合（可迭代）
    //println(lists1.flatMap(liss => liss))
    //字符串也称为字符序列--char[]可以迭代
    //val strings = List("wangshiwei")
    //println(strings.flatMap(word => word))

    //val ints = List(1,3,2,4)
    //Int不能迭代
    //val value = ints.flatMap(num => num)
    //本身不能迭代，但是有人可以迭代--(Array，List，Char....)，使用其他类型包装就OK
//    println(ints.flatMap(num => Array(num)))
    //    println(ints.flatMap(Array(_)))
//    println(ints.flatMap(num => List(num)))

  }
}
