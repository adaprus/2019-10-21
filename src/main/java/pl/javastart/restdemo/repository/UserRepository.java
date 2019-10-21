package pl.javastart.restdemo.repository;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.javastart.restdemo.model.User;

@Component
public class UserRepository {

    private RestTemplate restTemplate;
    int age = 0;

    public UserRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public User getUser(String name){
        return  restTemplate.getForObject("/api/user?name=" + name, User.class);
    }

    public User saveUser(String userName){
        User user = new User();
        user.setName(userName);
        user.setAge(age++);

        User user1 = restTemplate.postForObject("/api/user", user, User.class);
        String userString = restTemplate.postForObject("/api/user", user, String.class);

        System.out.println("User " + user);
        System.out.println("User 1 " + user1);
        System.out.println(userString);

        return user1;
    }
}
