/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge.Janela;

/**
 *
 * @author onascimento
 */
public class JanelaDialogo extends JanelaAbstrata{
    
    public JanelaDialogo(JanelaImplementada j){
        super(j);
    }
    
    @Override
    public void desenhar() {
        DesenharJanela("Janela Dialogo");
        Botao("Sim");
        Botao("Nao");
        Botao("Cancelar");
    }
    
}
