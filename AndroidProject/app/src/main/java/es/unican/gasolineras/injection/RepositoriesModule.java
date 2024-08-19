package es.unican.gasolineras.injection;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import es.unican.gasolineras.repository.GasolinerasService;
import es.unican.gasolineras.repository.IRepository;
import es.unican.gasolineras.repository.Repository;

/**
 * This class is the provider of IRepository implementations
 * Any time somebody demands an IRepository, Hilt will inject the implementation
 * provided by this module
 *
 * InstalllIn: this tells Hilt that this is available to every Activity that is annotated with
 * @AndroidEntryPoint.
 * Alternatively I could use SingletonComponent.class, and it seems to work too
 */
@Module
@InstallIn(ActivityComponent.class)
public abstract class RepositoriesModule {

    @Provides
    public static IRepository provideRepository() {
        return new Repository(GasolinerasService.api);
    }

}
