package abnamro.poc.communication.point2point.configuredaddress.consumer;

import lombok.Data;

// On purpose we don't store all the received information in our result object.
@Data
public class Result {
	private String lastAuthor;
	private long result;
}
