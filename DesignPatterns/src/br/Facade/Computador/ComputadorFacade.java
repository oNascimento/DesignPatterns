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
public class ComputadorFacade {
    private static int BOOT_SECTOR = 21221;
    private static int SECTOR_SIZE = 32134;
    private static int BOOT_ADDRESS = 32134;
    
    private Cpu cpu = null;
    private Memoria memoria = null;
    private Hd hd = null;
    
    public ComputadorFacade(Cpu cpu, Memoria memoria, Hd hd){
        this.cpu = cpu;
        this.memoria=memoria;
        this.hd=hd;
    }
    
    public void ligarComputador(){
        cpu.start();
        String hdBootInfo = hd.read(BOOT_SECTOR, SECTOR_SIZE);
        memoria.load(BOOT_SECTOR, hdBootInfo);
        cpu.execute();
        memoria.free(BOOT_SECTOR, hdBootInfo);
    }
    
}
