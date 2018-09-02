package core.springframework.dependencyinjectiondemo;

import core.springframework.dependencyinjectiondemo.controller.SpringContextController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {
       ApplicationContext ctx =  SpringApplication.run(DependencyInjectionDemoApplication.class, args);
        SpringContextController control = (SpringContextController)ctx.getBean("springContextController");
        System.out.println(control.Hello());
    }
}
