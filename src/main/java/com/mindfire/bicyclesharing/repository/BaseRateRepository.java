/*
 * Copyright 2016 Mindfire Solutions
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mindfire.bicyclesharing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.bicyclesharing.model.BaseRate;

/**
 * Repository for {@link BaseRate} Entity used for CRUD operation on BaseRate.
 * 
 * @author mindfire
 * @version 1.0
 * @since 10/03/2016
 */
@Repository
public interface BaseRateRepository extends JpaRepository<BaseRate, Long> {

	/**
	 * This method is used to retrieve Base rate details
	 * 
	 * @param rateGroup
	 *            the name of the rate group
	 * @return {@link BaseRate} object
	 */
	public BaseRate findByGroupType(String rateGroup);
}
