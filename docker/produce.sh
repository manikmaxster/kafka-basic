#!/bin/bash

python /tmp/my-data/gen_data.py

kafka-topics --create --topic my_topic --bootstrap-server broker:9092 --replication-factor 1 --partitions 2

echo "Press any key to continue"
while true ; do
read -t 3 -n 1
if [ $? = 0 ] ; then
break ;
else
echo "waiting for the keypress"
fi
done

kafka-console-producer --topic my_topic --bootstrap-server broker:9092 --property parse.key=true --property key.separator=":" < /tmp/my-data/tmp_data