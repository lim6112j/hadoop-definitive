# haddop definitive way

* hadoop install and setting - https://medium.com/@MinatoNamikaze02/installing-hadoop-on-macos-m1-m2-2023-d963abeab38e

* hadoop test(hadoop qausi mode)

java version set to 1.8

./java/max-temperature/mvn package

cd /usr/local/Cellar/hadoop/3.4.0/sbin

./start-all.sh

export HADOOP_CLASSPATH=./java/max-temperature/target/max-temperature-1.0-SNAPSHOT.jar

hadoop fs -put sample.txt /

hadoop fs -rm -r -f /user

hadoop com.ciel.app.MaxTemperature /sample.txt /output

open browser http://localhost:9870/explorer.html#

cd /usr/local/Cellar/hadoop/3.4.0/sbin

./stop-all.sh
