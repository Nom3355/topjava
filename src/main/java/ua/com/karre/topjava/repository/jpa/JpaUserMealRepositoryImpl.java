package ua.com.karre.topjava.repository.jpa;

import org.springframework.stereotype.Repository;
import ua.com.karre.topjava.model.UserMeal;
import ua.com.karre.topjava.repository.UserMealRepository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * GKislin
 * 20.03.2015.
 */
@Repository
public class JpaUserMealRepositoryImpl implements UserMealRepository {
    @Override
    public UserMeal save(UserMeal UserMeal, int userId) {
        return null;
    }

    @Override
    public boolean delete(int id, int userId) {
        return false;
    }

    @Override
    public UserMeal get(int id, int userId) {
        return null;
    }

    @Override
    public List<UserMeal> getAll(int userId) {
        return null;
    }

    @Override
    public void deleteAll(int userId) {

    }

    @Override
    public List<UserMeal> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId) {
        return null;
    }
}
