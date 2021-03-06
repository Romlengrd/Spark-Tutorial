name := "MLlib"

version := "1.0"

scalaVersion := "2.11.11"


libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.2.0"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.2.0"
libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % "2.2.0"
libraryDependencies += "ai.h2o" % "sparkling-water-core_2.11" % "2.1.13"


libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.2.0"

//Fix bug with KMeans model reading
libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.7.2" excludeAll ExclusionRule(organization = "javax.servlet")

// https://mvnrepository.com/artifact/saurfang/spark-knn
resolvers += "bintray-spark-packages" at "https://dl.bintray.com/spark-packages/maven/"
libraryDependencies += "saurfang" % "spark-knn" % "0.2.0"
