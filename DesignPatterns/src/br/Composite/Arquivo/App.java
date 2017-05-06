/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.Composite.Arquivo;

/**
 *
 * @author onascimento
 */
public class App {

    public static void main(String[] args) {
        ArquivoComponent minhaPasta = new ArquivoComposite("home/");
        ArquivoComponent meuVideo = new ArquivoVideo("HAVAINA_DE_PAU.mp4");
        ArquivoComponent meuVideo2 = new ArquivoVideo("Star Wars EP1.mkv");

        try {
            meuVideo.adicionar(meuVideo2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            minhaPasta.adicionar(meuVideo);
            minhaPasta.adicionar(meuVideo2);
            minhaPasta.printNomeDoArquivo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\nPesquisando arquivos:");
            minhaPasta.getArquivo(meuVideo.getNomeDoArquivo())
                    .printNomeDoArquivo();
            System.out.println("\nRemover arquivos");
            minhaPasta.remover(meuVideo.getNomeDoArquivo());
            minhaPasta.printNomeDoArquivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
