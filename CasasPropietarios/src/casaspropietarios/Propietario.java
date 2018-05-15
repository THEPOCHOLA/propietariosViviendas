/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casaspropietarios;

import java.util.ArrayList;

/**
 *
 * @author daw
 */
public class Propietario {
    public String nombre;
    public String apellidos;
    public int edad;
    public String dni;
    public String vivienda;
    ArrayList<String> propietarios = new ArrayList<String>();
    ArrayList<Casas> viviendas = new ArrayList<>();
    public Propietario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getVivienda() {
        return vivienda;
    }

    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad + "\nDNI: " + dni + "\nVivienda: " + vivienda + "\n";
    }
    
    public void introducirUsuario(){
        propietarios.add(toString());
    }
    
}
