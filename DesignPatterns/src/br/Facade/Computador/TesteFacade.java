/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade.Computador;

/**
 *
 * @author onascimento
 */
public class TesteFacade {
    public static void main(String[] args) {
        ComputadorFacade comp = new ComputadorFacade(new Cpu(), new Memoria(), new Hd());
        comp.ligarComputador();
    }
}
