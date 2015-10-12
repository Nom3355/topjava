package ua.com.karre.topjava.service.jdbc;

import org.springframework.test.context.ActiveProfiles;
import ua.com.karre.topjava.service.UserServiceTest;

import static ua.com.karre.topjava.Profiles.JDBC;
import static ua.com.karre.topjava.Profiles.POSTGRES;

@ActiveProfiles({POSTGRES, JDBC})
public class JdbcUserServiceTest extends UserServiceTest {
}