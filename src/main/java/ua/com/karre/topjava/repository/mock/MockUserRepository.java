package ua.com.karre.topjava.repository.mock;

import ua.com.karre.topjava.LoggerWrapper;
import ua.com.karre.topjava.model.User;
import ua.com.karre.topjava.repository.UserRepository;

import java.util.List;

/**
 * User: gkislin
 * Date: 22.08.2014
 */
public class MockUserRepository implements UserRepository {
    private static final LoggerWrapper LOG = LoggerWrapper.get(MockUserRepository.class);

    @Override
    public boolean delete(int id) {
        LOG.info("Delete " + id);
        return true;
    }

    @Override
    public User save(User user) {
        LOG.info("Save " + user);
        return user;
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getByEmail(String email) {
        return null;
    }
}
