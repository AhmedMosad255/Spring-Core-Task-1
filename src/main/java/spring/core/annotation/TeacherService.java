package spring.core.annotation;

import org.springframework.stereotype.Component;

@Component
public class TeacherService implements UserRepoService {
    @Override
    public void save(String name) {
        System.out.println("Saving Teacher " + name);
    }

    @Override
    public void update(String name) {
        System.out.println("Updating Teacher " + name);
    }
}
