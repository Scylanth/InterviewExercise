package exercise

import org.scalatest.flatspec.AnyFlatSpec

/**
  * Entry point for tests
  */

class MainTest extends AnyFlatSpec with SparkSessionWrapper {

  it should "exercise" in {
    val sparkSession = getSparkSession()

    // write here your answers

    // 1 Open the aggregated_source.csv document and load the dataset in memory and print it

    // 2 Write a script that computes only for Europe to Europe trips:

    // -3.1 How many total bookings are sold by Canoe

    // -3.2 The percentage of bookings sold per(website, airline)

    // 3.3 The most popular airline by website
  }

}
