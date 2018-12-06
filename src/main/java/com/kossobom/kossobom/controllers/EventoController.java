/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kossobom.kossobom.controllers;

import com.kossobom.kossobom.models.Evento;
import com.kossobom.kossobom.repository.IEvento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventoController {
    
    @Autowired
    private IEvento er;
    
    @RequestMapping(value="/cadastro", method=RequestMethod.GET)
    public String form(){
        return "form";
    }
    @RequestMapping(value="/cadastro", method=RequestMethod.POST)
    public String form(Evento evento){
        
        er.save(evento);
        return "redirect:/cadastrarEvento";
    }    
}
