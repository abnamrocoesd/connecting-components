package abnamro.poc.communication.indirection.eureka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableAutoConfiguration
//@Import(Array(classOf[ConsulAutoConfiguration]))
public class ClientInitializer {
	@Autowired
	Client client;

	public ClientInitializer() { }
}
