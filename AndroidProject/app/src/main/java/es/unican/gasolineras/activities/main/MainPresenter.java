package es.unican.gasolineras.activities.main;

import java.util.List;

import es.unican.gasolineras.model.Gasolinera;
import es.unican.gasolineras.model.IDCCAAs;
import es.unican.gasolineras.repository.ICallBack;
import es.unican.gasolineras.repository.IRepository;

public class MainPresenter implements IMainContract.Presenter {

    private IMainContract.View view;

    @Override
    public void init(IMainContract.View view) {
        this.view = view;
        this.view.init();
        load();
    }

    @Override
    public void onStationClicked(Gasolinera station) {
        view.showStationDetails(station);
    }

    @Override
    public void onMenuInfoClicked() {

    }

    private void load() {
        IRepository repository = view.getRepository();

        ICallBack callBack = new ICallBack() {

            @Override
            public void onSuccess(List<Gasolinera> stations) {
                view.showStations(stations);
            }

            @Override
            public void onFailure(Throwable e) {
                view.showLoadError();
            }
        };

        repository.requestStations(callBack, IDCCAAs.CANTABRIA.id);
    }
}
