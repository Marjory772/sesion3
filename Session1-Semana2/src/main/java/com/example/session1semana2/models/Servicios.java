package com.example.session1semana2.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "servicios")
@Getter
@Setter
public class Servicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servicio")
    private Integer id_servicio;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "precio")
    private BigDecimal precio;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "proveedor")
    private String proveedor;

    @Column(name = "fecha_inicio")
    private LocalDate fecha_inicio;

    @Column(name = "fecha_fin")
    private LocalDate fecha_fin;

    @Column(name = "duracion")
    private String duracion;

    @Column(name = "estado")
    private String estado;

    @Column(name = "descuento")
    private BigDecimal descuento;

    @Column(name = "tipo_servicio")
    private String tipo_servicio;

    @Column(name = "comentarios", columnDefinition = "TEXT")
    private String comentarios;

    @Column(name = "condiciones", columnDefinition = "TEXT")
    private String condiciones;

    @Column(name = "fecha_creacion")
    private LocalDateTime fecha_creacion;

    // Constructor vacío necesario para JPA
    public Servicios() {
    }

    // Constructor con parámetros opcional
    public Servicios(Integer id_servicio, String nombre, String descripcion, BigDecimal precio, String categoria,
                     String proveedor, LocalDate fecha_inicio, LocalDate fecha_fin, String duracion, String estado,
                     BigDecimal descuento, String tipo_servicio, String comentarios, String condiciones,
                     LocalDateTime fecha_creacion) {
        this.id_servicio = id_servicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.duracion = duracion;
        this.estado = estado;
        this.descuento = descuento;
        this.tipo_servicio = tipo_servicio;
        this.comentarios = comentarios;
        this.condiciones = condiciones;
        this.fecha_creacion = fecha_creacion;
    }
}

