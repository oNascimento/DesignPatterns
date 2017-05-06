/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.Bridge.Janela;

/**
 *
 * @author onascimento
 */
public class JanelaLinux implements JanelaImplementada{

    @Override
    public void DesenharJanela(String titulo) {
        System.out.println("Janela Linux - " + titulo);
    }

    @Override
    public void Botao(String titulo) {
        System.out.println("Botao Linux - " + titulo);
    }
    
}
