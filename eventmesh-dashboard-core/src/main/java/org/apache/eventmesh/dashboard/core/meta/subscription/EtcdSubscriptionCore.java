/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.eventmesh.dashboard.core.meta.subscription;

import org.apache.eventmesh.dashboard.common.dto.Result;
import org.apache.eventmesh.dashboard.common.model.SubscriptionInfo;
import org.apache.eventmesh.dashboard.service.meta.SubscriptionCore;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EtcdSubscriptionCore implements SubscriptionCore {

    @Override
    public String retrieveConfig(String dataId, String group) {
        return null;
    }

    @Override
    public Result<List<SubscriptionInfo>> retrieveConfigs(Integer page, Integer size, String dataId, String group) {
        return null;
    }
}