package abnamro.poc.communication.indirection.eureka.consumer;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableAutoConfiguration
public class ClientInitializer {
	public ClientInitializer() { }
}
