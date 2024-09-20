package es.unican.gasolineras.repository;

import androidx.annotation.NonNull;

import java.util.List;

import es.unican.gasolineras.model.Gasolinera;
import es.unican.gasolineras.model.GasolinerasResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Implementation of @link{IRepository} that access the real
 * <a href="https://sedeaplicaciones.minetur.gob.es/ServiciosRESTCarburantes/PreciosCarburantes/help">Gasolineras API</a>
 */
public class Repository implements IRepository {

    /** Since this class does not have any state, it can be a singleton */
    public static final IRepository INSTANCE = new Repository();

    /** Singleton pattern with private constructor */
    private Repository() {}

    /**
     * Request gas stations from the Gasolineras real API.
     * @see IRepository#requestStations(ICallBack, String)
     * @param cb the callback that will asynchronously process the returned gas stations
     * @param ccaa id of the "comunidad autonoma"
     */
    @Override
    public void requestStations(ICallBack cb, String ccaa) {
        Call<GasolinerasResponse> call = GasolinerasService.api.gasolineras(ccaa);
        call.enqueue(new Callback<GasolinerasResponse>() {
            @Override
            public void onResponse(@NonNull Call<GasolinerasResponse> call, @NonNull Response<GasolinerasResponse> response) {
                GasolinerasResponse body = response.body();
                assert body != null;  // to avoid warning in the following line
                cb.onSuccess(body.getGasolineras());
            }

            @Override
            public void onFailure(@NonNull Call<GasolinerasResponse> call, @NonNull Throwable t) {
                cb.onFailure(t);
            }
        });
    }
}
