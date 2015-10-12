package ua.com.karre.topjava.service.jdbc;

import org.springframework.test.context.ActiveProfiles;
import ua.com.karre.topjava.service.UserMealServiceTest;

import static ua.com.karre.topjava.Profiles.JDBC;
import static ua.com.karre.topjava.Profiles.POSTGRES;

@ActiveProfiles({POSTGRES, JDBC})
public class JdbcUserMealServiceTest extends UserMealServiceTest {
}