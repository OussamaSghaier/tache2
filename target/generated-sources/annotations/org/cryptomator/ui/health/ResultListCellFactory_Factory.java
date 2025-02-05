package org.cryptomator.ui.health;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.cryptomator.ui.common.FxmlLoaderFactory;

@ScopeMetadata("org.cryptomator.ui.health.HealthCheckScoped")
@QualifierMetadata("org.cryptomator.ui.health.HealthCheckWindow")
@DaggerGenerated
@Generated(value = "dagger.internal.codegen.ComponentProcessor", comments = "https://dagger.dev")
@SuppressWarnings({"unchecked", "rawtypes", "KotlinInternal", "KotlinInternalInJava", "cast"})
public final class ResultListCellFactory_Factory implements Factory<ResultListCellFactory> {
  private final Provider<FxmlLoaderFactory> fxmlLoadersProvider;

  public ResultListCellFactory_Factory(Provider<FxmlLoaderFactory> fxmlLoadersProvider) {
    this.fxmlLoadersProvider = fxmlLoadersProvider;
  }

  @Override
  public ResultListCellFactory get() {
    return newInstance(fxmlLoadersProvider.get());
  }

  public static ResultListCellFactory_Factory create(
      Provider<FxmlLoaderFactory> fxmlLoadersProvider) {
    return new ResultListCellFactory_Factory(fxmlLoadersProvider);
  }

  public static ResultListCellFactory newInstance(FxmlLoaderFactory fxmlLoaders) {
    return new ResultListCellFactory(fxmlLoaders);
  }
}
