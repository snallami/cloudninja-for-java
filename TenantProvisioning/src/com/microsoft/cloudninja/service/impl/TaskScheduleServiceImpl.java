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
package com.microsoft.cloudninja.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microsoft.cloudninja.dao.TaskScheduleDao;
import com.microsoft.cloudninja.domainobject.TaskScheduleEntity;
import com.microsoft.cloudninja.service.TaskScheduleService;

@Service("taskScheduleService")
public class TaskScheduleServiceImpl implements TaskScheduleService {

	@Autowired
	TaskScheduleDao taskScheduleDao;

	@Override
	public List<TaskScheduleEntity> getTaskScheduleList() {

		List<TaskScheduleEntity> taskScheduleList = new ArrayList<TaskScheduleEntity>();
		taskScheduleList = taskScheduleDao.getTaskScheduledList();

		return taskScheduleList;
	}

	@Override
	public void updateTaskSchedule(TaskScheduleEntity taskScheduleEntity) {
		taskScheduleDao.updateTaskSchedule(taskScheduleEntity);
	}

}
