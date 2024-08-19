package es.unican.gasolineras.model;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import lombok.Getter;

@Parcel
@Getter
public class Gasolinera {

    @SerializedName("IDEESS") @NonNull              protected String id;

    @SerializedName("Rótulo")                       protected String rotulo;
    @SerializedName("C.P.")                         protected String cp;
    @SerializedName("Dirección")                    protected String direccion;
    @SerializedName("Municipio")                    protected String municipio;

    @SerializedName("Precio Gasoleo A")             protected double gasoleoA;
    @SerializedName("Precio Gasolina 95 E5")        protected double gasolina95E5;
}
