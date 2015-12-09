package abnamro.poc.communication.indirection.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * This is not specific to Feign: just Spring web + boot.
 * (combined all in a single class, you probably don't want to mix concerns)
 */
@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Server {
	// For the sake of persistencein this PoC.
	private static final Map<String, Result> results = new HashMap();

	public static void main(String[] args) {
		SpringApplication.run(Server.class, args);
	}

	@RequestMapping(method = GET, value = "/result/{author}")
	public Result getNewResult(@PathVariable(value = "author") String author) {
		return results.get(author);
	}

	/**
	 * Create/update
	 */
	@RequestMapping(method = POST, value = "/result")
	public Result createNewResult(@RequestBody String author) {
		Result res = results.get(author);
		if(res == null) {
			res = new Result(author, 0L, 0L);
		} else {
			res = new Result(author, res.getResult() + 1L, res.getResult2() + 2L);
		}
		results.put(author, res);
		return res;
	}
}
