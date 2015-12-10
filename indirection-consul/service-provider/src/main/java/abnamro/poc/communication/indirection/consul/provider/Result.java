package abnamro.poc.communication.indirection.consul.provider;

import lombok.Data;

@Data
public class Result {
    private final String lastAuthor;
    private final Long result;
    private final Long result2;
    private final String hiddenSecret;

}
