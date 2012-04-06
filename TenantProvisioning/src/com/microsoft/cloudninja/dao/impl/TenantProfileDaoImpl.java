/*******************************************************************************
 * Copyright 2012 Persistent Systems Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.microsoft.cloudninja.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.microsoft.cloudninja.dao.TenantProfileDao;
import com.microsoft.cloudninja.utils.TenantProfileUtility;

@Repository("tenantProfileDao")
public class TenantProfileDaoImpl implements TenantProfileDao {

	@Autowired
	TenantProfileUtility tenantProfileUtility;
	
	
	@Override
	public void deleteTenant(String tenantId) {
		
		String tenantDB = "tnt_" + tenantId;
		
		//Tenant Database deletion 
		tenantProfileUtility.deleteTenant(tenantDB);
		
		//Member Table:Primary DB 
		tenantProfileUtility.deleteMemberRecords(tenantId,tenantDB);
	}
}
