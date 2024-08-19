package es.unican.gasolineras.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Getter;

/**
 * Model that represents the response obtained from the Gasolineras REST API:
 * https://sedeaplicaciones.minetur.gob.es/ServiciosRESTCarburantes/PreciosCarburantes/help/operations/PreciosEESSTerrestres#response-json
 *
 * The API returns an object with these 4 properties: "fecha", "nota", "gasolineras", "consulta".
 * The actual list of gas stations is the property "gasolineras".
 *
 * The #SerializedName annotation is a GSON annotation that defines the name of the property
 * in the json file, as obtained from the REST API.
 */
@Getter
public class GasolinerasResponse {

    @SerializedName(value="Fecha")              private String fecha;
    @SerializedName(value="Nota")               private String nota;
    @SerializedName(value="ListaEESSPrecio")    private List<Gasolinera> gasolineras;
    @SerializedName(value="ResultadoConsulta")  private String consulta;

}
