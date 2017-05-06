/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.Singleton.Fruta;

/**
 *
 * @author onascimento
 */
public class Fruta {

    private static Fruta instancia;
    private static int numeroDeReferencia;
    private String nome;

    protected Fruta() {
        this.instancia = null;
        this.numeroDeReferencia = 0;
    }

    public static Fruta getInstancia() {
        if (instancia == null) {
            instancia = new Fruta();
        }
        numeroDeReferencia++;
        return instancia;
    }

    public static int getNumeroDeReferencia() {
        return numeroDeReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
