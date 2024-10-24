/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetoresidade;

/**
 *
 * @author Noa
 */
public class VetoresIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ler 10 idades em vetores
        
        int idades [] = new int [10];
        
        //leitura
        for (int i = 0; i < 10; i++) {
            idades [i] = Entrada.leiaInt("Informe idade: ");
        }
        
        
        //escrita ou saida
        for (int i = 0; i < 10; i++) {
            System.out.println("Idade: " + idades[i]);
        }
        
        
        System.exit(0);
    }
    
}
