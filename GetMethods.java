import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetMethods {

    @Test
    public void getCases01(){
        given().
                get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200).
                body("data.id[0]", Matchers.equalTo(7)).
                log().all();
    }
}
