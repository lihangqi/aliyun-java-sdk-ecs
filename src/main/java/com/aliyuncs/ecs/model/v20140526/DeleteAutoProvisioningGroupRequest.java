/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteAutoProvisioningGroupRequest extends RpcAcsRequest<DeleteAutoProvisioningGroupResponse> {
	
	public DeleteAutoProvisioningGroupRequest() {
		super("Ecs", "2014-05-26", "DeleteAutoProvisioningGroup", "ecs");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private Boolean terminateInstances;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String autoProvisioningGroupId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Boolean getTerminateInstances() {
		return this.terminateInstances;
	}

	public void setTerminateInstances(Boolean terminateInstances) {
		this.terminateInstances = terminateInstances;
		if(terminateInstances != null){
			putQueryParameter("TerminateInstances", terminateInstances.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getAutoProvisioningGroupId() {
		return this.autoProvisioningGroupId;
	}

	public void setAutoProvisioningGroupId(String autoProvisioningGroupId) {
		this.autoProvisioningGroupId = autoProvisioningGroupId;
		if(autoProvisioningGroupId != null){
			putQueryParameter("AutoProvisioningGroupId", autoProvisioningGroupId);
		}
	}

	@Override
	public Class<DeleteAutoProvisioningGroupResponse> getResponseClass() {
		return DeleteAutoProvisioningGroupResponse.class;
	}

}