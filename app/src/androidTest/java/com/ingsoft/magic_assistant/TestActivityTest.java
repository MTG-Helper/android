package com.ingsoft.magic_assistant;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.runner.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class TestActivityTest {

    @Rule public final ActivityRule<HomeActivity> home = new ActivityRule<>(HomeActivity.class);

    @Test
    public void shouldBeAbleToLaunchHomeScreen(){
        onView(withText("Contadores de vidas")).check(ViewAssertions.matches(isDisplayed()));
    }

    @Test
    public void shouldNotAbleToLaunchHomeScreen(){
        // TO CHECK Circle CI
        onView(withText("Contadovidas")).check(ViewAssertions.matches(isDisplayed()));
    }
}