package com.example.session1semana2.controllers;

import com.example.session1semana2.models.Servicios;
import com.example.session1semana2.models.Servicios;
import com.example.session1semana2.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Repository repo;

    @GetMapping
    public String index(){
        return "Conectado a la base de datos";
    }

    @GetMapping("servicios")
    public List<Servicios> getServicios(){
        return repo.findAll();
    }

    @PostMapping("grabar")
    public String post(@RequestBody Servicios servicios){
        repo.save(servicios);
        return "Grabado";
    }

    @PutMapping("editar/{id}")
    public String update(@PathVariable Long id, @RequestBody Servicios servicios){
        Servicios updateServicios = repo.findById(id).get();
        updateServicios.setId_servicio(servicios.getId_servicio());
        updateServicios.setNombre(servicios.getNombre());
        updateServicios.setDescripcion(servicios.getDescripcion());
        updateServicios.setEstado(servicios.getEstado());
        updateServicios.setCategoria(servicios.getCategoria());
        updateServicios.setPrecio(servicios.getPrecio());
        updateServicios.setDescuento(servicios.getDescuento());
        updateServicios.setTipo_servicio(servicios.getTipo_servicio());
        updateServicios.setPrecio(servicios.getPrecio());
        updateServicios.setDuracion(servicios.getDuracion());
        updateServicios.setFecha_creacion(servicios.getFecha_creacion());
        updateServicios.setFecha_fin(servicios.getFecha_fin());
        updateServicios.setFecha_inicio(servicios.getFecha_inicio());
        updateServicios.setProveedor(servicios.getProveedor());
        updateServicios.setCondiciones(servicios.getCondiciones());
        repo.save(updateServicios);
        return "Actualizado";
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        Servicios deleteServicios = repo.findById(id).get();
        repo.delete(deleteServicios);
        return "Eliminado";
    }

}
