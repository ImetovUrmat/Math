package com.example.math

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Rule
    @JvmField

    val rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun simpleAdd() {
        runBlocking {
            Espresso.onView(withId(R.id.num1)).perform(ViewActions.typeText("5"))
            delay(1500)
            Espresso.onView(withId(R.id.num2)).perform(ViewActions.typeText("5"))
            delay(1500)
            Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.tvResult)).
            check(ViewAssertions.matches(ViewMatchers.withText("10")))
            delay(1500)}


    }

    @Test
    fun simpleMinus(){
        runBlocking {
            Espresso.onView(withId(R.id.num1)).perform(ViewActions.typeText("15"))
            delay(1500)
            Espresso.onView(withId(R.id.num2)).perform(ViewActions.typeText("5"))
            delay(1500)
            Espresso.onView(withId(R.id.btnMinus)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.tvResult)).
            check(ViewAssertions.matches(ViewMatchers.withText("10")))
            delay(1500)}
    }

    @Test
    fun simpleDivision(){
        runBlocking {
            Espresso.onView(withId(R.id.num1)).perform(ViewActions.typeText("16"))
            delay(1500)
            Espresso.onView(withId(R.id.num2)).perform(ViewActions.typeText("4"))
            delay(1500)
            Espresso.onView(withId(R.id.btnDivision)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.tvResult)).
            check(ViewAssertions.matches(ViewMatchers.withText("4")))
            delay(1500)}

    }
    @Test
    fun simpleMultiply(){
        runBlocking {
            Espresso.onView(withId(R.id.num1)).perform(ViewActions.typeText("5"))
            delay(1500)
            Espresso.onView(withId(R.id.num2)).perform(ViewActions.typeText("5"))
            delay(1500)
            Espresso.onView(withId(R.id.btnMultiply)).perform(ViewActions.click())
            delay(1500)
            Espresso.onView(withId(R.id.tvResult)).
            check(ViewAssertions.matches(ViewMatchers.withText("25")))
            delay(1500)}

    }
}