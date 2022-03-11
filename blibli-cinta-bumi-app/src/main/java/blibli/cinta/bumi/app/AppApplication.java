package blibli.cinta.bumi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {
    MongoAutoConfiguration.class,
    MongoDataAutoConfiguration.class
})
@EnableFeignClients
public class AppApplication {

  public static void main(String[] args) {
    SpringApplication.run(AppApplication.class, args);
  }

}
