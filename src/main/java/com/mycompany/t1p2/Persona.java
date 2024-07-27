package com.mycompany.t1p2;

public class Persona {
    private int id;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String genero;
    private String dpi;
    private int edad;
    private String ciudad;

    public Persona(int id, String primerNombre, String segundoNombre, String primerApellido, 
                   String segundoApellido, String genero, String dpi, int edad, String ciudad) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.genero = genero;
        this.dpi = dpi;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    @Override
    public String toString() {
        return primerNombre + " " + segundoNombre + " " + primerApellido + " " + segundoApellido;
    }
}
