/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PracticaTres.demo.dao;

import PracticaTres.demo.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Victor
 */
public interface ArbolDao extends JpaRepository<Arbol, Long>{
    
}
