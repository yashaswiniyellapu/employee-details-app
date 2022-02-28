package com.everest.employeedetails

import androidx.test.core.app.ActivityScenario
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    private lateinit var scenario: ActivityScenario<HomeActivity>
    @Before
    fun setup() {
        scenario

    }


    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.everest.employeedetails", appContext.packageName)
    }
    @Test
    fun shouldDisplayAsStringNumbreFormatWithSemicolon()
    {
        val empName="yashu"
        val empId =1
        val role="intern"
        val precExp=0


    }

}