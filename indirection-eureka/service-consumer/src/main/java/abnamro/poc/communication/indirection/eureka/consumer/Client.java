package abnamro.poc.communication.indirection.eureka.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("myService")
interface Client {
	@RequestMapping(
			  method = {RequestMethod.GET},
			  value = {"/result/{author}"}
	)
	Result get(@RequestParam("author") String author);

	@RequestMapping(
			  method = {RequestMethod.POST},
			  value = {"/result"},
			  consumes = "application/json"
	)
	Result upsert(@RequestBody() String author);
}
