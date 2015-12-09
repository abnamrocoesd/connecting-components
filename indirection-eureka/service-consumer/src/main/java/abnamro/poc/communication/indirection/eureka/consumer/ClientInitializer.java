package abnamro.poc.communication.indirection.eureka.consumer;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@EnableAutoConfiguration
public class ClientInitializer {
	public ClientInitializer() { }
}
