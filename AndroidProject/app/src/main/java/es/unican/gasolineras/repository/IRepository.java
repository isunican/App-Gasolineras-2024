package es.unican.gasolineras.repository;

/**
 * A repository to retrieve gas stations
 */
public interface IRepository {

        /**
         * Asynchronously requests a list of gas stations.
         * @param cb the callback that will asynchronously process the returned gas stations
         * @param ccaa id of the "comunidad autonoma", as defined in IDCCAAs
         */
        public void requestStations(ICallBack cb, String ccaa);

}
