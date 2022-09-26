package exercise

import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession

trait SparkSessionWrapper {
  Logger.getLogger("org").setLevel(Level.OFF)
  Logger.getLogger("akka").setLevel(Level.OFF)

  def getSparkSession(): SparkSession = {
    lazy val spark: SparkSession = {
      SparkSession.builder()
        .master("local")
        .appName("spark")
        .getOrCreate()
    }
    spark
  }
}
