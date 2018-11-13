/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kossobom.kossobom.repository;

import com.kossobom.kossobom.models.Evento;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Joao TI
 */
public interface IEvento extends CrudRepository<Evento, String>{
    
    
}
