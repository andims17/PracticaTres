/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTres.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;      
import lombok.Data;

@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_arbol")
    private long idArbol;// Se transforma en id_Categoria
    private String nombre;
    private String tipoFlor;
    private String rutaImagen;
    private long altura;

    public Arbol() {
    }

    public Arbol(String nombre, String tipoFlor, String rutaImagen, long altura) {
        this.nombre = nombre;
        this.tipoFlor = tipoFlor;
        this.rutaImagen = rutaImagen;
        this.altura = altura;
    }

    
}
