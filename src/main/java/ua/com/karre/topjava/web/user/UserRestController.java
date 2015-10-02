package ua.com.karre.topjava.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ua.com.karre.topjava.LoggedUser;
import ua.com.karre.topjava.LoggerWrapper;
import ua.com.karre.topjava.model.User;
import ua.com.karre.topjava.service.UserService;


/**
 * GKislin
 * 06.03.2015.
 */
@Controller
public class UserRestController {
    private static final LoggerWrapper LOG = LoggerWrapper.get(UserRestController.class);

    @Autowired
    private UserService service;

    public User get() {
        int id = LoggedUser.id();
        LOG.info("get", id);
        return service.get(id);
    }

    public void delete() {
        int id = LoggedUser.id();
        LOG.info("delete {}", id);
        service.delete(id);
    }

    public void update(User user) {
        int id = LoggedUser.id();
        LOG.info("update");
        service.update(user);
    }
}
