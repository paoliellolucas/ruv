/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruv.repository;

import com.ruv.entity.CalendarioEntity;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author matias
 */

public interface CalendarioRepository extends CrudRepository<CalendarioEntity, Integer> {
	
}