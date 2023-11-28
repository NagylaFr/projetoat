/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ifce.projetoat2;

/**
 *
 * @author pc
 */
public class Projetoat2 {

    public static void main(String[] args) {
         Porta minhaPorta = new Porta();

        minhaPorta.abrir();
        minhaPorta.estaAberta(); // retorna true

        minhaPorta.fechar();
        minhaPorta.estaAberta(); // retorna false

        minhaPorta.pintar("Azul");
        minhaPorta.alterarDimensoes(2.2, 1.0);
    }
 }
