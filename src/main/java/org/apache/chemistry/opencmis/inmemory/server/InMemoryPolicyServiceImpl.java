/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.chemistry.opencmis.inmemory.server;

import java.util.List;

import org.apache.chemistry.opencmis.commons.data.ExtensionsData;
import org.apache.chemistry.opencmis.commons.data.ObjectData;
import org.apache.chemistry.opencmis.inmemory.storedobj.api.StoreManager;

public class InMemoryPolicyServiceImpl extends AbstractServiceImpl {

    protected InMemoryPolicyServiceImpl(StoreManager storeManager) {
        super(storeManager);
    }

    public List<ObjectData> getAppliedPolicies(String repositoryId, String objectId, String filter,
            ExtensionsData extension) {
        return null;
    }

    public void removePolicy(String repositoryId, String policyId, String objectId, ExtensionsData extension) {
        
    }

    public void applyPolicy(String repositoryId, String policyId, String objectId, ExtensionsData extension) {
    }

}
