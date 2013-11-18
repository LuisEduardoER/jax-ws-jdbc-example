package guermann.samples.wssample;
import javax.jws.WebService;

@WebService
   public class WSSample {
     public String sayHello(String param) {
           return "Hello " + param;
     }
}  