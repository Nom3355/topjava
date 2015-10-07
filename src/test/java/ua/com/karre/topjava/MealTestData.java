package ua.com.karre.topjava;


import ua.com.karre.topjava.matcher.ModelMatcher;
import ua.com.karre.topjava.model.UserMeal;

import java.util.function.Function;

/**
 * GKislin
 * 13.03.2015.
 */
public class MealTestData {

    public static final ModelMatcher<UserMeal, String> MATCHER = new ModelMatcher<>(
            new Function<UserMeal, String>() {
                @Override
                public String apply(UserMeal meal) {
                    return meal.toString();
                }
            });

}
