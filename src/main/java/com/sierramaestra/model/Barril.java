package com.sierramaestra.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;  // Importa la clase LocalDate

@Entity
@Table(name = "barril")
public class Barril {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "litros", nullable = false)
    private Integer litros;
    
    @Column(name = "estado")
    private String estado;
    
    @Column(name = "notas")
    private String notas;

    // Atributos para las fechas
    @Column(name = "fecha_carga")
    private LocalDate fechaCarga;  // Aquí se almacena la fecha de carga

    @Column(name = "fecha_vencimiento")
    private LocalDate fechaVencimiento;  // Aquí se almacena la fecha de vencimiento

    // Atributos para las fechas formateadas
    private String formattedFechaCarga;
    private String formattedFechaVencimiento;

    // Relación ManyToOne con Lote
    @ManyToOne
    @JoinColumn(name = "lote_id")  // Crea la columna lote_id en la tabla barril para asociar barriles con un lote
    private Lote lote;

    // Relación ManyToOne con Cerveza
    @ManyToOne
    @JoinColumn(name = "cerveza_id")  // Crea la columna cerveza_id en la tabla barril para asociar un barril con una cerveza
    private Cerveza cerveza;

    // Constructores
    public Barril(Long id, Integer litros, String estado, String notas, LocalDate fechaCarga, LocalDate fechaVencimiento, Lote lote, Cerveza cerveza) {
        this.id = id;
        this.litros = litros;
        this.estado = estado;
        this.notas = notas;
        this.fechaCarga = fechaCarga;
        this.fechaVencimiento = fechaVencimiento;  // Asigna la fecha de vencimiento
        this.lote = lote;
        this.cerveza = cerveza;
    }

    public Barril() {
    }

    public Barril(Integer litros, String estado, String notas, LocalDate fechaCarga, LocalDate fechaVencimiento, Cerveza cerveza) {
        this.litros = litros;
        this.estado = estado;
        this.notas = notas;
        this.fechaCarga = fechaCarga;
        this.fechaVencimiento = fechaVencimiento;  // Asigna la fecha de vencimiento
        this.cerveza = cerveza;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLitros() {
        return litros;
    }

    public void setLitros(Integer litros) {
        this.litros = litros;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;  // Getter para fechaVencimiento
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;  // Setter para fechaVencimiento
    }

    public String getFormattedFechaCarga() {
        return formattedFechaCarga;
    }

    public void setFormattedFechaCarga(String formattedFechaCarga) {
        this.formattedFechaCarga = formattedFechaCarga;
    }

    public String getFormattedFechaVencimiento() {
        return formattedFechaVencimiento;
    }

    public void setFormattedFechaVencimiento(String formattedFechaVencimiento) {
        this.formattedFechaVencimiento = formattedFechaVencimiento;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Cerveza getCerveza() {
        return cerveza;
    }

    public void setCerveza(Cerveza cerveza) {
        this.cerveza = cerveza;
    }
}





