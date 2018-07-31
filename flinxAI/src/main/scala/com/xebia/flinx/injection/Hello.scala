package com.xebia.flinx.injection

import org.apache.spark.sql.SparkSession



object Hello {
  def main(args:Array[String]): Unit = {
    print("hello xebia");


    val sparkSession = SparkSession.builder().master("local[*]").appName("test").getOrCreate();

    import sparkSession.implicits._

    var text = sparkSession.read.option("header",true).csv("/home/user/text.csv");

    text.show();
  }

}
