package com.wadda.spring.cloud.stream;





import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import com.wadda.spring.cloud.stream.domain.Book;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SpringCloudStreamConsumerApplication {
	
	private Logger logger=LoggerFactory.getLogger(SpringCloudStreamConsumerApplication.class);	
	
	
	@StreamListener("input")
	public void condumeMessage (Book book) {
		logger.info("Consumer payload  "+book);
		
		
	}

	

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamConsumerApplication.class, args);
	}

}
