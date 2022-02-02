package com.example.scan;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> MainActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void test_scanData(){
        onView(withId(R.id.btn_scan)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_scan)).perform(click());
        onView(withText("Scan a barcode or QR Code")) .check(matches(isDisplayed()));

    }


}