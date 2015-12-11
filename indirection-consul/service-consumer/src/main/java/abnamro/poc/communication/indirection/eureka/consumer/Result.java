package abnamro.poc.communication.indirection.eureka.consumer;

import lombok.Data;

// On purpose we don't store all the received information in our result object.
@Data
public class Result {
	private String lastAuthor;
	private long result;
}
