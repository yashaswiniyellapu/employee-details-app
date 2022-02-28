package com.everest.employeedetails

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule

import org.junit.Rule
import org.junit.Test

class HomeActivityTest {

    @get :Rule
    val activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun shouldDisplayTextWhenClickIsPerformed() {
        val name = "yashu"
        val id = "1"
        val role = "intern"
        val prevEx = "0"
        onView(withId(R.id.emp_name)).perform(typeText(name))
        onView(withId(R.id.emp_id)).perform(typeText("1"))
        onView(withId(R.id.profession)).perform(typeText(role))
        onView(withId(R.id.experience)).perform(typeText(prevEx))
        onView(withId(R.id.confirm_button)).perform(click())
        onView(withId(R.id.dis_name)).check(matches(withText(name)))
        onView(withId(R.id.dis_id)).check(matches(withText(id)))
        onView(withId(R.id.dis_prof)).check(matches(withText(role)))
        onView(withId(R.id.dis_preEX)).check(matches(withText(prevEx)))
    }
}