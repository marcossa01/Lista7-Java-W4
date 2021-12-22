package com.company.domain;

import com.company.interfaces.Precedente;
import com.sun.management.UnixOperatingSystemMXBean;

public class Celular implements Precedente<Celular> {
    private String numero;
    private String proprietario;

    public Celular(){

    }

    public Celular(String numero, String proprietario) {
        this.numero = numero;
        this.proprietario = proprietario;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }


    @Override
    public int precedeA(Celular celular) {
        return this.proprietario.compareTo(celular.proprietario);
    }

    @Override
    public String toString() {
        return "Número de Telefone: " + numero + ", Proprietário: " + proprietario;
    }
}
