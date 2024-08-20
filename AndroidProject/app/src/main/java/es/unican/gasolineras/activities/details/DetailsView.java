package es.unican.gasolineras.activities.details;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.parceler.Parcels;

import es.unican.gasolineras.R;
import es.unican.gasolineras.model.Gasolinera;

/**
 * View that shows the details of one gas station. Since this view does not have business logic,
 * it can be implemented as an activity directly, without the MVP pattern.
 */
public class DetailsView extends AppCompatActivity {

    public static final String INTENT_STATION = "INTENT_STATION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_view);

        // Link to view elements
        ImageView ivRotulo = findViewById(R.id.ivRotulo);
        TextView tvRotulo = findViewById(R.id.tvRotulo);
        TextView tvMunicipio = findViewById(R.id.tvMunicipio);

        // Get Gas Station from the intent that triggered this activity
        Gasolinera gasolinera = Parcels.unwrap(getIntent().getExtras().getParcelable(INTENT_STATION));

        // Set logo
        int imageID = getResources().getIdentifier("generic", "drawable", getPackageName());
        ivRotulo.setImageResource(imageID);

        // Set Texts
        tvRotulo.setText(gasolinera.getRotulo());
        tvMunicipio.setText(gasolinera.getMunicipio());
    }
}