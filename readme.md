# haddop definitive way

* hadoop test(hadoop qausi mode)
java version set to 1.8
./java/max-temperature/mvn package
export HADOOP_CLASSPATH=./java/max-temperature/target/max-temperature-1.0-SNAPSHOT.jar
hadoop fs -put sample.txt /
hadoop fs -rm -r -f /user
hadoop com.ciel.app.MaxTemperature /sample.txt /output
open browser http://localhost:9870/explorer.html#
