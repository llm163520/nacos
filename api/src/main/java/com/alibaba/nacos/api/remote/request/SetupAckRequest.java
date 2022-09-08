/*
 * Copyright 1999-2022 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.api.remote.request;

import static com.alibaba.nacos.api.common.Constants.Remote.INTERNAL_MODULE;

/**.
 * @author Daydreamer
 * @description Server tells the client that the connection is established
 * @date 2022/7/12 19:21
 **/
public class SetupAckRequest extends ServerRequest {
    
    private String connectionId;
    
    public SetupAckRequest() {
    }
    
    public SetupAckRequest(String connectionId) {
        this.connectionId = connectionId;
    }
    
    public String getConnectionId() {
        return connectionId;
    }
    
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }
    
    @Override
    public String getModule() {
        return INTERNAL_MODULE;
    }
}
