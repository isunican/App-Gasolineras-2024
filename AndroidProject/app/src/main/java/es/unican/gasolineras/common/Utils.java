package es.unican.gasolineras.common;

import static es.unican.gasolineras.repository.GasolinerasService.deserializer;

import android.content.Context;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;

import es.unican.gasolineras.model.Gasolinera;
import es.unican.gasolineras.model.GasolinerasResponse;

public class Utils {

    /**
     * Parses a list of gas stations from a json resource file.
     * The json must contain a serialized GasolinerasResponse object
     * @param context
     * @param jsonId
     * @return
     */
    public static List<Gasolinera> parseGasolineras(Context context, int jsonId) {
        InputStream is = context.getResources().openRawResource(jsonId);
        Type typeToken = new TypeToken<GasolinerasResponse>() { }.getType();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        GasolinerasResponse response = new GsonBuilder()
                .registerTypeAdapter(double.class, deserializer)
                .create()
                .fromJson(reader, typeToken);
        List<Gasolinera> gasolineras = response.getGasolineras();
        return gasolineras;
    }
}
