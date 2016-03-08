package pl.kodujdlapolski.na4lapy;

import android.content.Intent;
import android.os.Bundle;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import pl.kodujdlapolski.na4lapy.ui.about_shelter.AboutShelterActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static org.hamcrest.Matchers.not;


/**
 * Created by Natalia on 2016-03-08.
 */
public class AboutShelterActivityTest {

    @Rule
    public ActivityTestRule<AboutShelterActivity> mActivityRule = new ActivityTestRule<>(AboutShelterActivity.class, false, false);

    @Test
    public void isProperMockShelterIsDisplayed() {
        mActivityRule.launchActivity(getIntentById(1l));

        onView(withId(R.id.about_shelter_content)).check(matches(isDisplayed()));
        onView(withId(R.id.about_shelter_progress)).check(matches(not(isDisplayed())));
        onView(withId(R.id.error_container)).check(matches(not(isDisplayed())));
    }

    @Test
    public void isErrorDownloadingDataDisplayed() {
        mActivityRule.launchActivity(getIntentById(-1l));

        onView(withId(R.id.error_container)).check(matches(isDisplayed()));
        onView(withId(R.id.about_shelter_content)).check(matches(not(isDisplayed())));
        onView(withId(R.id.about_shelter_progress)).check(matches(not(isDisplayed())));
    }

    private static Intent getIntentById(long id) {
        Intent i = new Intent();
        Bundle b = new Bundle();
        b.putLong(AboutShelterActivity.EXTRA_SHELTER_ID, id);
        i.putExtras(b);
        return i;
    }
}