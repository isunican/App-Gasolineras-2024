package es.unican.gasolineras.activities.main;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import org.parceler.Parcels;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import es.unican.gasolineras.R;
import es.unican.gasolineras.activities.details.DetailsView;
import es.unican.gasolineras.model.Gasolinera;
import es.unican.gasolineras.repository.GasolinerasService;
import es.unican.gasolineras.repository.IRepository;
import es.unican.gasolineras.repository.Repository;

@AndroidEntryPoint
public class MainView extends AppCompatActivity implements IMainContract.View {

    /** */
    private MainPresenter presenter;

    /** */
    @Inject IRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter();
        presenter.init(this);
    }

    @Override
    public void init() {
        ListView list = findViewById(R.id.lvStations);
        list.setOnItemClickListener((parent, view, position, id) -> {
            Gasolinera station = (Gasolinera) parent.getItemAtPosition(position);
            presenter.onStationClicked(station);
        });
    }

    @Override
    public IRepository getRepository() {
        return repository;
    }

    @Override
    public void showStations(List<Gasolinera> stations) {
        ListView list = findViewById(R.id.lvStations);
        GasolinerasArrayAdapter adapter = new GasolinerasArrayAdapter(this, stations);
        list.setAdapter(adapter);
    }

    @Override
    public void showLoadCorrect(int stations) {

    }

    @Override
    public void showLoadError() {

    }

    @Override
    public void showStationDetails(Gasolinera station) {
        Intent intent = new Intent(this, DetailsView.class);
        intent.putExtra(DetailsView.INTENT_STATION, Parcels.wrap(station));
        startActivity(intent);
    }

    @Override
    public void showInfoActivity() {

    }
}