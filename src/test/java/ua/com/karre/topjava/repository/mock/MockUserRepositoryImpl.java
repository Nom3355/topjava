package ua.com.karre.topjava.repository.mock;

import org.springframework.stereotype.Repository;
import ua.com.karre.topjava.LoggerWrapper;
import ua.com.karre.topjava.model.User;
import ua.com.karre.topjava.repository.UserRepository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collections;
import java.util.List;

/**
 * User: gkislin
 * Date: 22.08.2014
 */
@Repository
public class MockUserRepositoryImpl implements UserRepository {
    private static final LoggerWrapper LOG = LoggerWrapper.get(MockUserRepositoryImpl.class);

    @PostConstruct
    public void postConstruct() {
        LOG.info("PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        LOG.info("PreDestroy");
    }

    @Override
    public boolean delete(int id) {
        LOG.info("delete " + id);
        return id != 0;
    }

    @Override
    public User save(User user) {
        LOG.info("save " + user);
        return user;
    }

    @Override
    public User get(int id) {
        LOG.info("get " + id);
        return null;
    }

    @Override
    public List<User> getAll() {
        LOG.info("getAll");
        return Collections.emptyList();
    }

    @Override
    public User getByEmail(String email) {
        LOG.info("getByEmail " + email);
        return null;
    }
}
