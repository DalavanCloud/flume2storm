/**
 * Copyright 2014 Comcast Cable Communications Management, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.comcast.viper.flume2storm.connection.receptor;

import org.apache.commons.configuration.Configuration;

import com.comcast.viper.flume2storm.F2SConfigurationException;
import com.comcast.viper.flume2storm.connection.KryoNetParameters;
import com.comcast.viper.flume2storm.connection.parameters.KryoNetConnectionParameters;
import com.comcast.viper.flume2storm.connection.receptor.EventReceptor;
import com.comcast.viper.flume2storm.connection.receptor.EventReceptorFactory;

/**
 * Implementation of the EventReceptor factory for KryoNet
 */
public class KryoNetEventReceptorFactory implements EventReceptorFactory<KryoNetConnectionParameters> {
  /**
   * @see com.comcast.viper.flume2storm.connection.receptor.EventReceptorFactory#create(com.comcast.viper.flume2storm.connection.parameters.ConnectionParameters,
   *      org.apache.commons.configuration.Configuration)
   */
  @Override
  public EventReceptor<KryoNetConnectionParameters> create(KryoNetConnectionParameters connectionParams,
      Configuration config) throws F2SConfigurationException {
    return new KryoNetEventReceptor(connectionParams, KryoNetParameters.from(config
        .subset(KryoNetParameters.CONFIG_BASE_NAME)));
  }
}
