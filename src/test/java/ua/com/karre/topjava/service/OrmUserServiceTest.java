package ua.com.karre.topjava.service;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import ua.com.karre.topjava.repository.JpaUtil;

/**
 * GKislin
 * 07.04.2015.
 */
abstract public class OrmUserServiceTest extends UserServiceTest {
    @Autowired
    private JpaUtil jpaUtil;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        jpaUtil.clear2ndLevelHibernateCache();
    }
}
