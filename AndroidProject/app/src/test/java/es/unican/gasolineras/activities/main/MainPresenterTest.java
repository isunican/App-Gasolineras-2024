package es.unican.gasolineras.activities.main;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;

import java.util.List;

import es.unican.gasolineras.R;
import es.unican.gasolineras.common.Utils;
import es.unican.gasolineras.model.Gasolinera;
import es.unican.gasolineras.repository.ICallBack;
import es.unican.gasolineras.repository.IRepository;

@RunWith(RobolectricTestRunner.class)
public class MainPresenterTest {

    @Mock IMainContract.View view;
    private IMainContract.Presenter sut;
    private AutoCloseable closeable;

    @Before
    public void before() {
        closeable = MockitoAnnotations.openMocks(this);
        sut = new MainPresenter();
    }

    @After
    public void after() throws Exception {
        closeable.close();
    }

    @Test
    @SuppressWarnings("unchecked")
    public void test() {
        Context context = ApplicationProvider.getApplicationContext();

        // Mock repository, with mocked callback that returns a list of gasolineras from the json
        IRepository mock = mock(IRepository.class);
        doAnswer(invocation ->  {
            ICallBack callBack = invocation.getArgument(0);
            callBack.onSuccess(Utils.parseGasolineras(context, R.raw.gasolineras_ccaa_06));
            return null;
        }).when(mock).requestStations(any(ICallBack.class), any(String.class));

        when(view.getRepository()).thenReturn(mock);
        sut.init(view);
        verify(view, times(1)).showStations(anyList());

        ArgumentCaptor<List<Gasolinera>> captor = ArgumentCaptor.forClass(List.class);
        verify(view).showStations(captor.capture());
        List<Gasolinera> gasolineras = captor.getValue();
        assertEquals(gasolineras.get(0).getRotulo(), "CEPSA");
    }
}
