package ua.com.karre.topjava.service.datajpa;

import org.springframework.test.context.ActiveProfiles;
import ua.com.karre.topjava.service.UserMealServiceTest;

import static ua.com.karre.topjava.Profiles.DATAJPA;
import static ua.com.karre.topjava.Profiles.POSTGRES;

@ActiveProfiles({POSTGRES, DATAJPA})
public class DataJpaUserMealServiceTest extends UserMealServiceTest {
}