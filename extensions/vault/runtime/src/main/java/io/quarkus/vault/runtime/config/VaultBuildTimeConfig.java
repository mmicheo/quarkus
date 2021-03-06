package io.quarkus.vault.runtime.config;

import io.quarkus.runtime.annotations.ConfigDocSection;
import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(name = "vault", phase = ConfigPhase.BUILD_AND_RUN_TIME_FIXED)
public class VaultBuildTimeConfig {

    /**
     * Health check configuration.
     */
    @ConfigItem
    @ConfigDocSection
    public HealthConfig health;

}
