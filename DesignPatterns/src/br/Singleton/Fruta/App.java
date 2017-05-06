/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton.Fruta;

/**
 *
 * @author onascimento
 */
public class App {
    public static void main(String[] args) {
        Fruta f = Fruta.getInstancia();
        f.setNome("Laranja");
        
        System.out.println("Nome: " + f.getNome());
        
        Fruta f2 = Fruta.getInstancia();
        f2.setNome("Abacaxi");
        
        System.out.println("Nomes: " + f.getNome() + ", " + f2.getNome());
        System.out.println("Numero de Referencias: " + Fruta.getNumeroDeReferencia());
    }
}
