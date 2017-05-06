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
public abstract class JanelaAbstrata implements JanelaImplementada{
    private JanelaImplementada janela;
    
    public JanelaAbstrata(JanelaImplementada j){
        this.janela = j;
    }

    @Override
    public void DesenharJanela(String titulo) {
        janela.DesenharJanela(titulo);
    }

    @Override
    public void Botao(String titulo) {
        janela.Botao(titulo);
    }
    
    public abstract void desenhar();
}
