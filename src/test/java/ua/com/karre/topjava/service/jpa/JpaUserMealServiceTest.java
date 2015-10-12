package ua.com.karre.topjava.service.jpa;

import org.springframework.test.context.ActiveProfiles;
import ua.com.karre.topjava.service.UserMealServiceTest;

import static ua.com.karre.topjava.Profiles.JPA;
import static ua.com.karre.topjava.Profiles.POSTGRES;

@ActiveProfiles({POSTGRES, JPA})
public class JpaUserMealServiceTest extends UserMealServiceTest {
}