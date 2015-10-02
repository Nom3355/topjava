package ua.com.karre.topjava.service;



import ua.com.karre.topjava.model.User;
import ua.com.karre.topjava.util.exception.NotFoundException;

import java.util.List;

/**
 * User: gkislin
 * Date: 22.08.2014
 */
public interface UserService {

    User save(User user);

    void delete(int id) throws NotFoundException;

    User get(int id) throws NotFoundException;

    User getByEmail(String email) throws NotFoundException;

    List<User> getAll();

    void update(User user) throws NotFoundException;
}
