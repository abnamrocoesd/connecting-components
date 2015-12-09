package abnamro.poc.communication.point2point.fixedip.consumer;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableAutoConfiguration
public class ClientInitializer {
	public ClientInitializer() { }
}
