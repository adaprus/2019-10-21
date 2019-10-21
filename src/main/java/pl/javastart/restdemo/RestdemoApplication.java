package pl.javastart.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.javastart.restdemo.repository.UserRepository;

@SpringBootApplication
public class RestdemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RestdemoApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);

        System.out.println(userRepository.saveUser("Ada"));
        System.out.println(userRepository.saveUser("Ada"));
        System.out.println(userRepository.saveUser("Ada"));
        System.out.println(userRepository.saveUser("Ada"));
        System.out.println(userRepository.saveUser("Ada"));
        System.out.println(userRepository.saveUser("Ada"));
        System.out.println(userRepository.saveUser("Ada"));
        System.out.println(userRepository.saveUser("Ada"));
        System.out.println(userRepository.saveUser("Ada"));
        System.out.println(userRepository.saveUser("Ada"));
        System.out.println(userRepository.saveUser("Ada"));
    }

}
