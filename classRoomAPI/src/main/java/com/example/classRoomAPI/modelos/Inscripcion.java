package com.example.classRoomAPI.modelos;

import java.util.Date;

public class Inscripcion {
    private Integer idInscripcion;
    private Date fechaInscripcion;

    public Inscripcion() {
    }

    public Inscripcion(Integer idInscripcion, Date fechaInscripcion) {
        this.idInscripcion = idInscripcion;
        this.fechaInscripcion = fechaInscripcion;
    }

    public Integer getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(Integer idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
}
