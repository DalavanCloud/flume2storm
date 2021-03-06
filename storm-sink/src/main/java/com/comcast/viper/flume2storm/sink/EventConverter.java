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
package com.comcast.viper.flume2storm.sink;

import org.apache.flume.Event;

import com.comcast.viper.flume2storm.event.F2SEvent;
import com.comcast.viper.flume2storm.event.F2SEventBuilder;

/**
 * Converts from a Flume event to a Flume2Storm event
 */
public class EventConverter {
  /**
   * Constructor
   */
  public EventConverter() {
  }

  /**
   * Convert from Flume event to flume2storm event
   * 
   * @param event
   *          A Flume event
   * @return The corresponding flume2storm event
   */
  public F2SEvent convert(Event event) {
    return new F2SEventBuilder().body(event.getBody()).headers(event.getHeaders()).get();
  }
}
