package org.dataportabilityproject.cloud;

import com.google.inject.AbstractModule;
import org.dataportabilityproject.cloud.types.TypeManagerImpl;
import org.dataportabilityproject.spi.cloud.types.TypeManager;

public class PortabilityCloudModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(TypeManager.class).to(TypeManagerImpl.class);
  }
}
