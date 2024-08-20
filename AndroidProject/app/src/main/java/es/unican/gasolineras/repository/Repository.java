package es.unican.gasolineras.repository;

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

    @Override
    public void requestStations(ICallBack cb, String ccaa) {
        Call<GasolinerasResponse> call = GasolinerasService.api.gasolineras(ccaa);
        call.enqueue(new Callback<GasolinerasResponse>() {
            @Override
            public void onResponse(Call<GasolinerasResponse> call, Response<GasolinerasResponse> response) {
                GasolinerasResponse body = response.body();
                cb.onSuccess(body.getGasolineras());
            }

            @Override
            public void onFailure(Call<GasolinerasResponse> call, Throwable t) {
                cb.onFailure(t);
            }
        });
    }
}
