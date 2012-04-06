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
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.microsoft.cloudninja.dao.MeteringDao;
import com.microsoft.cloudninja.domainobject.MeteringEntity;


/**
 * Implementation class for Metering DAO.
 *
 */
@Repository("meteringDao")
public class MeteringDaoImpl implements MeteringDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	/**
	 * Adds an metering entity.
	 */
	@Override
	public void add(MeteringEntity metering) {
		hibernateTemplate.save(metering);
	}
}