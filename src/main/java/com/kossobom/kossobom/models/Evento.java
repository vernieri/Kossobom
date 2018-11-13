/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kossobom.kossobom.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Joao TI
 */
@Entity
public class Evento implements Serializable {
    
    private static final long serialVersionUID = 1L;

  
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private String nome;
    private String local;
    private String data;
    private String horario;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }    
    
}
