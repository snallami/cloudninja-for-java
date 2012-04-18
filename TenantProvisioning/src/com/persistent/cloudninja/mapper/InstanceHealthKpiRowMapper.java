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
package com.persistent.cloudninja.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.persistent.cloudninja.domainobject.InstanceHealthKPIEntity;

/**
 * Maps InstanceHealthKPIEntity to KpiType table in database.
 */
public class InstanceHealthKpiRowMapper implements RowMapper<InstanceHealthKPIEntity>{

    @Override
    public InstanceHealthKPIEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        InstanceHealthKPIEntity kpiType = new InstanceHealthKPIEntity();
        kpiType.setKpiId(rs.getInt("KpiTypeId"));
        kpiType.setKpiName(rs.getString("Name"));
        return kpiType;
    }

}