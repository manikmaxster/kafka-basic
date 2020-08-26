# Kafka Basics
Sample Spring Boot Project with Kafka Consumer

# To Build Jar
./gradlew bootJar

# Kafka Working
- If a topic has a single partition only one of the running application with the same groupId will get the data from the topic.
- If more than one partitions for a topic exists then the partitions will be distributed in the group.

# Running the Application
    docker-compose up -d
    ./gradlew bootRun

In a new terminal enter the broker.

    docker exec -it broker /bin/bash
    python /tmp/my-data/gen_data.py
    /bin/bash /tmp/my-data/produce.sh

Press any key to produce sample data to topic.
