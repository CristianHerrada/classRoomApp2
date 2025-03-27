package com.example.classRoomAPI.modelos;

import java.util.Date;

public class Estudiante {
    private Integer idEstudiante;
    private String  grado;
    private Date fechaNacimiento;
    private String direccion;

    public Estudiante() {
    }

    public Estudiante(Integer idEstudiante, String grado, Date fechaNacimiento, String direccion) {
        this.idEstudiante = idEstudiante;
        this.grado = grado;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
