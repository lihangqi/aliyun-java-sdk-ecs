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
public class ModifyAutoSnapshotPolicyRequest extends RpcAcsRequest<ModifyAutoSnapshotPolicyResponse> {
	
	public ModifyAutoSnapshotPolicyRequest() {
		super("Ecs", "2014-05-26", "ModifyAutoSnapshotPolicy", "ecs");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Boolean dataDiskPolicyEnabled;

	private Long resourceOwnerId;

	private Integer dataDiskPolicyRetentionDays;

	private String resourceOwnerAccount;

	private Boolean systemDiskPolicyRetentionLastWeek;

	private String ownerAccount;

	private Integer systemDiskPolicyTimePeriod;

	private Long ownerId;

	private Boolean dataDiskPolicyRetentionLastWeek;

	private Integer systemDiskPolicyRetentionDays;

	private Integer dataDiskPolicyTimePeriod;

	private Boolean systemDiskPolicyEnabled;

	public Boolean getDataDiskPolicyEnabled() {
		return this.dataDiskPolicyEnabled;
	}

	public void setDataDiskPolicyEnabled(Boolean dataDiskPolicyEnabled) {
		this.dataDiskPolicyEnabled = dataDiskPolicyEnabled;
		if(dataDiskPolicyEnabled != null){
			putQueryParameter("DataDiskPolicyEnabled", dataDiskPolicyEnabled.toString());
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getDataDiskPolicyRetentionDays() {
		return this.dataDiskPolicyRetentionDays;
	}

	public void setDataDiskPolicyRetentionDays(Integer dataDiskPolicyRetentionDays) {
		this.dataDiskPolicyRetentionDays = dataDiskPolicyRetentionDays;
		if(dataDiskPolicyRetentionDays != null){
			putQueryParameter("DataDiskPolicyRetentionDays", dataDiskPolicyRetentionDays.toString());
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

	public Boolean getSystemDiskPolicyRetentionLastWeek() {
		return this.systemDiskPolicyRetentionLastWeek;
	}

	public void setSystemDiskPolicyRetentionLastWeek(Boolean systemDiskPolicyRetentionLastWeek) {
		this.systemDiskPolicyRetentionLastWeek = systemDiskPolicyRetentionLastWeek;
		if(systemDiskPolicyRetentionLastWeek != null){
			putQueryParameter("SystemDiskPolicyRetentionLastWeek", systemDiskPolicyRetentionLastWeek.toString());
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

	public Integer getSystemDiskPolicyTimePeriod() {
		return this.systemDiskPolicyTimePeriod;
	}

	public void setSystemDiskPolicyTimePeriod(Integer systemDiskPolicyTimePeriod) {
		this.systemDiskPolicyTimePeriod = systemDiskPolicyTimePeriod;
		if(systemDiskPolicyTimePeriod != null){
			putQueryParameter("SystemDiskPolicyTimePeriod", systemDiskPolicyTimePeriod.toString());
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

	public Boolean getDataDiskPolicyRetentionLastWeek() {
		return this.dataDiskPolicyRetentionLastWeek;
	}

	public void setDataDiskPolicyRetentionLastWeek(Boolean dataDiskPolicyRetentionLastWeek) {
		this.dataDiskPolicyRetentionLastWeek = dataDiskPolicyRetentionLastWeek;
		if(dataDiskPolicyRetentionLastWeek != null){
			putQueryParameter("DataDiskPolicyRetentionLastWeek", dataDiskPolicyRetentionLastWeek.toString());
		}
	}

	public Integer getSystemDiskPolicyRetentionDays() {
		return this.systemDiskPolicyRetentionDays;
	}

	public void setSystemDiskPolicyRetentionDays(Integer systemDiskPolicyRetentionDays) {
		this.systemDiskPolicyRetentionDays = systemDiskPolicyRetentionDays;
		if(systemDiskPolicyRetentionDays != null){
			putQueryParameter("SystemDiskPolicyRetentionDays", systemDiskPolicyRetentionDays.toString());
		}
	}

	public Integer getDataDiskPolicyTimePeriod() {
		return this.dataDiskPolicyTimePeriod;
	}

	public void setDataDiskPolicyTimePeriod(Integer dataDiskPolicyTimePeriod) {
		this.dataDiskPolicyTimePeriod = dataDiskPolicyTimePeriod;
		if(dataDiskPolicyTimePeriod != null){
			putQueryParameter("DataDiskPolicyTimePeriod", dataDiskPolicyTimePeriod.toString());
		}
	}

	public Boolean getSystemDiskPolicyEnabled() {
		return this.systemDiskPolicyEnabled;
	}

	public void setSystemDiskPolicyEnabled(Boolean systemDiskPolicyEnabled) {
		this.systemDiskPolicyEnabled = systemDiskPolicyEnabled;
		if(systemDiskPolicyEnabled != null){
			putQueryParameter("SystemDiskPolicyEnabled", systemDiskPolicyEnabled.toString());
		}
	}

	@Override
	public Class<ModifyAutoSnapshotPolicyResponse> getResponseClass() {
		return ModifyAutoSnapshotPolicyResponse.class;
	}

}
