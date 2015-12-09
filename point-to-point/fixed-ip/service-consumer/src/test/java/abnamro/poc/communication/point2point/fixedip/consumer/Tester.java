package abnamro.poc.communication.point2point.fixedip.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes={ClientInitializer.class})
public class Tester {
    @Autowired
    Client client;

	/**
    * This test requires the service to run on port 9000
    */
   @Test
    public void doTest() {
        Result result = client.upsert("test");
        assertNotNull(result);
        assertEquals("test", result.getLastAuthor());
     }

}
