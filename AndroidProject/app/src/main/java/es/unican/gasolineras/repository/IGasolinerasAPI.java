package es.unican.gasolineras.repository;

import es.unican.gasolineras.model.GasolinerasResponse;
import retrofit2.Call;
import retrofit2.http.Path;
import retrofit2.http.GET;

/**
 * Gasolineras API access using Retrofit
 * API: https://sedeaplicaciones.minetur.gob.es/ServiciosRESTCarburantes/PreciosCarburantes/help
 */
public interface IGasolinerasAPI {

    @GET("EstacionesTerrestres/FiltroCCAA/{IDCCAA}")
    Call<GasolinerasResponse> gasolineras(@Path("IDCCAA") String ccaa);

}
