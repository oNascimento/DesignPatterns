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
public class JanelaMac implements JanelaImplementada{

    @Override
    public void DesenharJanela(String titulo) {
        System.out.println("Para mostrar essa tela e necessario a compra...");
    }

    @Override
    public void Botao(String titulo) {
        System.out.println("Para mostrar esse botao e necessario a compra...");
    }
    
}
