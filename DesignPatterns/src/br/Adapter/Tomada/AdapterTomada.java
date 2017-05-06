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
public class AdapterTomada extends TomadaDeDoisPinos{
    private TomadaDeTresPinos tomadadeTresPinos;
    
    public AdapterTomada(TomadaDeTresPinos tomadaDeTresPinos){
        this.tomadadeTresPinos = tomadaDeTresPinos;
    }

    public void LigarNaTomadaDeTresPinos() {
        tomadadeTresPinos.LigarNaTomadaDeTresPinos();
    }
}
