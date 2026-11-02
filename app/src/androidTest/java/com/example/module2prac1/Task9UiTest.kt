package com.example.module2prac1

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.example.module2prac1.ui.theme.Module2Prac1Theme
import org.junit.Rule
import org.junit.Test

class Task9UiTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun waterTracker_WaterTrackerFullScenarioTest() {
        composeTestRule.setContent {
            Module2Prac1Theme {
                WaterTracker()
            }
        }

        composeTestRule.onNodeWithText("+250 мл").assertExists()

        composeTestRule.onNodeWithText("+250 мл").performClick()
        composeTestRule.onNodeWithText("+250 мл").performClick()

        composeTestRule.onNodeWithText("500 мл").assertExists()


        composeTestRule.onNodeWithText("Завершить день").assertExists()

        composeTestRule.onNodeWithText("Завершить день").performClick()


        composeTestRule.onNodeWithText("0 мл").assertExists()

        composeTestRule.onNodeWithText("Дней подряд (1500+ мл): 0").assertExists()

        repeat(6) {
            composeTestRule.onNodeWithText("+250 мл").performClick()
        }

        composeTestRule.onNodeWithText("1500 мл").assertExists()

        composeTestRule.onNodeWithText("Завершить день").performClick()

        composeTestRule.onNodeWithText("0 мл").assertExists()

        composeTestRule.onNodeWithText("Дней подряд (1500+ мл): 1").assertExists()
    }
}