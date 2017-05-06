/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.Facade.Computador;

/**
 *
 * @author onascimento
 */
public class Hd {
    public String read(int startPosition, int size){
        System.out.println("Le dados");
        return "Texto lido";
    }
    
    public void write(int position, String info){
        System.out.println("Escreve Dados");
    }
}
