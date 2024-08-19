package es.unican.gasolineras.repository;

import java.util.List;

import es.unican.gasolineras.model.Gasolinera;
import es.unican.gasolineras.model.GasolinerasResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository implements IRepository {

    private final IGasolinerasAPI api;

    public Repository(IGasolinerasAPI api) {
        this.api = api;
    }

    @Override
    public void requestStations(ICallBack cb, String ccaa) {
        Call<GasolinerasResponse> call = api.gasolineras(ccaa);
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
