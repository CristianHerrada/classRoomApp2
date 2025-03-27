package com.example.classRoomAPI.modelos;

import java.math.BigDecimal;
import java.util.Date;

public class Calificacion {
    private Integer idCalificacion;
    private BigDecimal nota;
    private Date fechaEvaluacion;

    public Calificacion() {
    }

    public Calificacion(Integer idCalificacion, BigDecimal nota, Date fechaEvaluacion) {
        this.idCalificacion = idCalificacion;
        this.nota = nota;
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public Integer getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(Integer idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }

    public Date getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(Date fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }
}
