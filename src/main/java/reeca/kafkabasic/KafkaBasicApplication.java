package reeca.kafkabasic;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableKafka
public class KafkaBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaBasicApplication.class, args);
	}

}

@Component
@Slf4j
class Consumer{

	private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

	@KafkaListener(topics = {"my_topic"}, groupId = "g1")
	public void consume(ConsumerRecord<String, String> record){
		logger.info(record.value().toString());
	}
}