package TestCases.Auth;

import Endpoints.Auth.CreateClient;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateClientTest {

    @Test
    public void testCreateClient() {
        CreateClient createClientEndpoint = new CreateClient();
        Response response = createClientEndpoint.createClient();
        
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200");
    }
}
