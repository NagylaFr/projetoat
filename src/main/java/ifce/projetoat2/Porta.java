/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifce.projetoat2;

/**
 *
 * @author pc
 */

//ATRIBUTOS - aberta, cor, altura e comprimento 
//METODOS - abrir e fechar 
public class Porta {
     private boolean aberta;

    public Porta() {
        this.aberta = false;
    }

    public void abrir() {
        this.aberta = true;
        System.out.println("A porta foi aberta.");
    }

    public void fechar() {
        this.aberta = false;
        System.out.println("A porta foi fechada.");
    }

    public void pintar(String novaCor) {
        System.out.println("A porta foi pintada de " + novaCor + ".");
    }

    public boolean estaAberta() {
        return this.aberta;
    }

    public void alterarDimensoes(double novaAltura, double novoComprimento) {
        System.out.println("As dimensões da porta foram alteradas para " + novaAltura + "m de altura e " + novoComprimento + "m de comprimento.");
    }
}

   