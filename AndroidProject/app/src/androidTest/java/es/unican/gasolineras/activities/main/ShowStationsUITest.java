package es.unican.gasolineras.activities.main;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;

import static es.unican.gasolineras.utils.Matchers.isNotEmpty;
import static es.unican.gasolineras.utils.MockRepositories.getTestRepository;

import android.content.Context;

import androidx.test.espresso.DataInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Rule;
import org.junit.Test;

import dagger.hilt.android.testing.BindValue;
import dagger.hilt.android.testing.HiltAndroidRule;
import dagger.hilt.android.testing.HiltAndroidTest;
import dagger.hilt.android.testing.UninstallModules;
import es.unican.gasolineras.injection.RepositoriesModule;
import es.unican.gasolineras.repository.IRepository;

import es.unican.gasolineras.R;

@UninstallModules(RepositoriesModule.class)
@HiltAndroidTest
public class ShowStationsUITest {

    @Rule(order = 0)  // the Hilt rule must execute first
    public HiltAndroidRule hiltRule = new HiltAndroidRule(this);

    @Rule(order = 1)
    public ActivityScenarioRule<MainView> activityRule = new ActivityScenarioRule<>(MainView.class);

    // I need the context to access resources, such as the json with test gas stations
    final Context context = InstrumentationRegistry.getInstrumentation().getTargetContext();

    @BindValue
    final IRepository repository = getTestRepository(context, R.raw.gasolineras_ccaa_06);

    @Test
    public void showStationsTest() {
        onView(withId(R.id.lvStations)).check(matches(isNotEmpty()));
        DataInteraction interaction = onData(anything())
                .inAdapterView(withId(R.id.lvStations)).atPosition(0);
        interaction.onChildView(withId(R.id.tvName)).check(matches(withText("CEPSA")));
    }

}
