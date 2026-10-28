package com.example.demo.modelos;

public class estudiante extends persona{
    private String codigo;
    private String carrera;

    public estudiante(){
        
    }
    public estudiante(String codigo , String carrera){
        this.codigo = codigo;
        this.carrera = carrera;
    }
    
    public estudiante(String nombre, String apellido, int edad, String codigo, String carrera) {
        super(nombre, apellido, edad);
        this.codigo = codigo;
        this.carrera = carrera;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
