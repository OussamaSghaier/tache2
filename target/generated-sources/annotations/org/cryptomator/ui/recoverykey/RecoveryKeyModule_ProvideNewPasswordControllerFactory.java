package org.cryptomator.ui.recoverykey;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.ResourceBundle;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.cryptomator.ui.changepassword.PasswordStrengthUtil;
import org.cryptomator.ui.common.FxController;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(value = "dagger.internal.codegen.ComponentProcessor", comments = "https://dagger.dev")
@SuppressWarnings({"unchecked", "rawtypes", "KotlinInternal", "KotlinInternalInJava", "cast"})
public final class RecoveryKeyModule_ProvideNewPasswordControllerFactory
    implements Factory<FxController> {
  private final Provider<ResourceBundle> resourceBundleProvider;

  private final Provider<PasswordStrengthUtil> strengthRaterProvider;

  public RecoveryKeyModule_ProvideNewPasswordControllerFactory(
      Provider<ResourceBundle> resourceBundleProvider,
      Provider<PasswordStrengthUtil> strengthRaterProvider) {
    this.resourceBundleProvider = resourceBundleProvider;
    this.strengthRaterProvider = strengthRaterProvider;
  }

  @Override
  public FxController get() {
    return provideNewPasswordController(resourceBundleProvider.get(), strengthRaterProvider.get());
  }

  public static RecoveryKeyModule_ProvideNewPasswordControllerFactory create(
      Provider<ResourceBundle> resourceBundleProvider,
      Provider<PasswordStrengthUtil> strengthRaterProvider) {
    return new RecoveryKeyModule_ProvideNewPasswordControllerFactory(
        resourceBundleProvider, strengthRaterProvider);
  }

  public static FxController provideNewPasswordController(
      ResourceBundle resourceBundle, PasswordStrengthUtil strengthRater) {
    return Preconditions.checkNotNullFromProvides(
        RecoveryKeyModule.provideNewPasswordController(resourceBundle, strengthRater));
  }
}
