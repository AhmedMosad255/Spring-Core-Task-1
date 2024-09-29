package spring.core.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserRepoService teacherService =
                context.getBean("teacherService",TeacherService.class);
        teacherService.save("John Doe");
        teacherService.update("Ahmed");
        System.out.println("-------------------------");
        UserRepoService studentService =
                context.getBean("studentService",StudentService.class);
        studentService.save("John Doe");
        studentService.update("Ahmed");
    }
}
