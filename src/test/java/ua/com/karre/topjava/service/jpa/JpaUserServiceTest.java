package ua.com.karre.topjava.service.jpa;

import org.springframework.test.context.ActiveProfiles;
import ua.com.karre.topjava.service.UserServiceTest;

import static ua.com.karre.topjava.Profiles.JPA;
import static ua.com.karre.topjava.Profiles.POSTGRES;

@ActiveProfiles({POSTGRES, JPA})
public class JpaUserServiceTest extends UserServiceTest {
}