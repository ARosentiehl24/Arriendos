package com.unimagdalena.edu.co.arriendos;

import java.io.Serializable;

public class Arriendos implements Serializable {

    private String codigo_arriendo;
    private String ciudad;
    private String direccion;
    private String tipo_vivienda;
    private String agencia;
    private String valor_arriendo;

    public Arriendos() {
    }

    public Arriendos(String codigo_arriendo, String ciudad, String direccion, String tipo_vivienda, String agencia, String valor_arriendo) {
        this.codigo_arriendo = codigo_arriendo;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.tipo_vivienda = tipo_vivienda;
        this.agencia = agencia;
        this.valor_arriendo = valor_arriendo;
    }

    public String getCodigo_arriendo() {
        return codigo_arriendo;
    }

    public void setCodigo_arriendo(String codigo_arriendo) {
        this.codigo_arriendo = codigo_arriendo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo_vivienda() {
        return tipo_vivienda;
    }

    public void setTipo_vivienda(String tipo_vivienda) {
        this.tipo_vivienda = tipo_vivienda;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getValor_arriendo() {
        return valor_arriendo;
    }

    public void setValor_arriendo(String valor_arriendo) {
        this.valor_arriendo = valor_arriendo;
    }
}
