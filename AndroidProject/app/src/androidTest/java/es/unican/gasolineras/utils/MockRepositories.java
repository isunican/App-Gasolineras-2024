package es.unican.gasolineras.utils;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import android.content.Context;

import es.unican.gasolineras.common.Utils;
import es.unican.gasolineras.repository.ICallBack;
import es.unican.gasolineras.repository.IRepository;

public class MockRepositories {

    public static IRepository getTestRepository(Context context, int jsonId) {
        IRepository mock = mock(IRepository.class);
        doAnswer(invocation ->  {
            ICallBack callBack = invocation.getArgument(0);
            callBack.onSuccess(Utils.parseGasolineras(context, jsonId));
            return null;
        }).when(mock).requestStations(any(ICallBack.class), any(String.class));
        return mock;
    }

}
