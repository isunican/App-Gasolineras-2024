package es.unican.gasolineras;

import static org.junit.Assert.assertEquals;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import es.unican.gasolineras.model.Dummy;

@RunWith(RobolectricTestRunner.class)
public class ExampleTest {

    @Test
    public void test() {
        Context context = ApplicationProvider.getApplicationContext();
        assertEquals(10, 5+5);

        Dummy dummy = new Dummy();
        assertEquals(60, dummy.operation(5, 10));

        //
    }
}
