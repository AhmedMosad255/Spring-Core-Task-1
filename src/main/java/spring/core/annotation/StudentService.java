package spring.core.annotation;

import org.springframework.stereotype.Component;

@Component
public class StudentService implements UserRepoService {
    @Override
    public void save(String name) {
        System.out.println("Saving student " + name);
    }

    @Override
    public void update(String name) {
        System.out.println("Updating student " + name);
    }
}
