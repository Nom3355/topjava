package ua.com.karre.topjava;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.karre.topjava.web.user.AdminUserRestController;

import java.util.Arrays;

/**
 * User: gkislin
 * Date: 22.08.2014
 */
public class SpringMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        System.out.println("\n" + Arrays.toString(appCtx.getBeanDefinitionNames()) + "\n");
        AdminUserRestController adminController = appCtx.getBean(AdminUserRestController.class);
        adminController.delete(7);
        adminController.getByMail("dummy");
        appCtx.close();
    }
}

