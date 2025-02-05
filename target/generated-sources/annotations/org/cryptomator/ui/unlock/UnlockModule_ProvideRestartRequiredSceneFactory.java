package org.cryptomator.ui.unlock;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javafx.scene.Scene;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.cryptomator.ui.common.FxmlLoaderFactory;

@ScopeMetadata("org.cryptomator.ui.unlock.UnlockScoped")
@QualifierMetadata({
  "org.cryptomator.ui.common.FxmlScene",
  "org.cryptomator.ui.unlock.UnlockWindow"
})
@DaggerGenerated
@Generated(value = "dagger.internal.codegen.ComponentProcessor", comments = "https://dagger.dev")
@SuppressWarnings({"unchecked", "rawtypes", "KotlinInternal", "KotlinInternalInJava", "cast"})
public final class UnlockModule_ProvideRestartRequiredSceneFactory implements Factory<Scene> {
  private final Provider<FxmlLoaderFactory> fxmlLoadersProvider;

  public UnlockModule_ProvideRestartRequiredSceneFactory(
      Provider<FxmlLoaderFactory> fxmlLoadersProvider) {
    this.fxmlLoadersProvider = fxmlLoadersProvider;
  }

  @Override
  public Scene get() {
    return provideRestartRequiredScene(fxmlLoadersProvider.get());
  }

  public static UnlockModule_ProvideRestartRequiredSceneFactory create(
      Provider<FxmlLoaderFactory> fxmlLoadersProvider) {
    return new UnlockModule_ProvideRestartRequiredSceneFactory(fxmlLoadersProvider);
  }

  public static Scene provideRestartRequiredScene(FxmlLoaderFactory fxmlLoaders) {
    return Preconditions.checkNotNullFromProvides(
        UnlockModule.provideRestartRequiredScene(fxmlLoaders));
  }
}
