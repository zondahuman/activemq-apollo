/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.apollo.stomp;

import org.apache.activemq.transport.Transport;
import org.apache.activemq.transport.tcp.TcpTransportFactory;

/**
 * A <a href="http://activemq.apache.org/stomp/">STOMP</a> transport factory
 * 
 * @version $Revision: 1.1.1.1 $
 */
public class StompTransportFactory extends TcpTransportFactory {

    protected String getDefaultWireFormatType() {
        return "stomp";
    }
    
    protected boolean isUseInactivityMonitor(Transport transport) {
        // lets disable the inactivity monitor as stomp does not use keep alive
        // packets
        return false;
    }

}