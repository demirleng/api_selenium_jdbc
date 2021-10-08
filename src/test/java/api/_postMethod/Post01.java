package api._postMethod;

import api.baseurl.BaseUrl_HerOkuApp;
import api.myPojo.DagittinBiziPojo;
import api.myPojo.InnerPojo;
import api.myPojo.OuterPojo;
import org.junit.Test;

public class Post01 extends BaseUrl_HerOkuApp {

    /**

     Given
     https://restful-booker.herokuapp.com/booking
             {
                 "firstname": "Emrah",
                 "lastname": "Selek",
                 "totalprice": 1000,
                 "depositpaid": true,
                 "bookingdates": {
                         "checkin": "2021-10-01",
                         "checkout": "2021-10-05"
                         }
                 "additionalneeds": "Dinner, smoothie, openbar"
             }
     When
        I send POST Request to the Url
     Then
         Status code is 200
     And
        response body should be like;
             {
                 "firstname": "Emrah",
                 "lastname": "Selek",
                 "totalprice": 1000,
                 "depositpaid": true,
                 "bookingdates": {
                         "checkin": "2021-10-01",
                         "checkout": "2021-10-05"
                         }
                "additionalneeds": "Dinner, smoothie, openbar"
             }
     */
@Test
    public void posttest(){
    //1.set the url
    spec.pathParam("first", "booking");

    //2.expected data
    InnerPojo bookingdates = new InnerPojo("2021-10-01", "2021-10-05");
    OuterPojo requestBody = new OuterPojo("Emrah","Selek",1000, true, bookingdates, "Dinner, smoothie, openbar" );


    System.out.println("requestBody : " requestBody);


}


}
