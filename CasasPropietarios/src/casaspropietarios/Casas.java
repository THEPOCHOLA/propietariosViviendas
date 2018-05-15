/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casaspropietarios;

/**
 *
 * @author daw
 */
public class Casas {
    public String direccion;
    public String localidad;
    public String pais;
    public double valor;

    public Casas() {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Casas{" + "direccion=" + direccion + ", localidad=" + localidad + ", pais=" + pais + ", valor=" + valor + '}';
    }
}
