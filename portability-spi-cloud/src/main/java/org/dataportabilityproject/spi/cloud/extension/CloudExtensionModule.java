/*
 * Copyright 2018 The Data Transfer Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dataportabilityproject.spi.cloud.extension;

import com.google.inject.AbstractModule;
import org.dataportabilityproject.spi.cloud.storage.BucketStore;
import org.dataportabilityproject.spi.cloud.storage.CryptoKeyStore;
import org.dataportabilityproject.spi.cloud.storage.JobStore;

/**
 * Guice module that must be implemented by Cloud extensions who want to use Guice. See example in
 * extensions/cloud/portability-cloud-google. Extensions may also opt to manually construct storage
 * interfaces (i.e. 'new' them), see extensions/cloud/portability-cloud-microsoft for an example.
 */
public class CloudExtensionModule extends AbstractModule {

  @Override
  protected void configure() {
    requireBinding(JobStore.class);
    requireBinding(BucketStore.class);
    requireBinding(CryptoKeyStore.class);
  }
}
