package api.baseurl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class BaseUrl_HerOkuApp {

    protected RequestSpecification spec;
    @Before
    public void setupbaserl(){
        spec = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build();




    }


}
