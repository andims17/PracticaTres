/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTres.demo.controller;

import PracticaTres.demo.domain.Arbol;
import PracticaTres.demo.service.ArbolService;
import PracticaTres.demo.service.impl.FirebaseStorageServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller

 @RequestMapping("/arbol")
public class ArbolController {
    @Autowired
    ArbolService arbolService;
    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        List <Arbol> arboles = arbolService.getArboles();
        model.addAttribute("arboles", arboles);
        return "/arbol/listado";
    }
    @GetMapping("/nuevo")
    public String arbolNuevo(Arbol arbol) {
        return "/arbol/modifica";
    }

   
    @PostMapping("/guardar")
    public String arbolGuardar(Arbol arbol,
            @RequestParam("imagenFile") MultipartFile imagenFile) {        
        if (!imagenFile.isEmpty()) {
            arbolService.save(arbol);
            arbol.setRutaImagen(
                    firebaseStorageService.cargaImagen(
                            imagenFile, 
                            "arbol", 
                            arbol.getIdArbol()));
        }
        arbolService.save(arbol);
        return "redirect:/arbol/listado";
    }

    @GetMapping("/eliminar/{idArbol}")
    public String arbolEliminar(Arbol arbol) {
        arbolService.delete(arbol);
        return "redirect:/arbol/listado";
    }

    @GetMapping("/modificar/{idArbol}")
    public String ArbolModificar(Arbol arbol, Model model) {
        arbol = arbolService.getArbol(arbol);
        model.addAttribute("categoria", arbol);
        return "/arbol/modifica";
    }
    
}
