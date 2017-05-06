/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter.Tomada;

/**
 *
 * @author onascimento
 */
public class App {
    public static void main(String[] args) {
        TomadaDeTresPinos t3 = new TomadaDeTresPinos();
        AdapterTomada ad = new AdapterTomada(t3);
        
        ad.LigarNaTomadaDeDoisPinos();
    }
}
