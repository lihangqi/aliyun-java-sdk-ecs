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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeMaintenancePropertyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMaintenancePropertyResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<MaintenanceProperty> maintenancePropertySet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<MaintenanceProperty> getMaintenancePropertySet() {
		return this.maintenancePropertySet;
	}

	public void setMaintenancePropertySet(List<MaintenanceProperty> maintenancePropertySet) {
		this.maintenancePropertySet = maintenancePropertySet;
	}

	public static class MaintenanceProperty {

		private String instanceId;

		private String startTime;

		private String endTime;

		private String actionOnMaintenance;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getActionOnMaintenance() {
			return this.actionOnMaintenance;
		}

		public void setActionOnMaintenance(String actionOnMaintenance) {
			this.actionOnMaintenance = actionOnMaintenance;
		}
	}

	@Override
	public DescribeMaintenancePropertyResponse getInstance(UnmarshallerContext context) {
		return	DescribeMaintenancePropertyResponseUnmarshaller.unmarshall(this, context);
	}
}
