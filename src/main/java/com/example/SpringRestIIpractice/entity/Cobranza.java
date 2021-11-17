package com.example.SpringRestIIpractice.entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cobranza {
    private int numero;
    private String fecha;
    private Cliente cliente;
    private Inmueble inmueble;

    public Cobranza(int numero, String fecha) {
        this.numero = numero;
        this.fecha = fecha;
    }
}
