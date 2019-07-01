
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class main {
    public static void main(String[] args) {
        int voltasMontanha;
        int quantidadeVagasCarrinho;
        int quantidadePassageiros;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao parque de diversões da UFG\n");
        
        System.out.println("Quantos passageiros virão para a montanha russa?");
        quantidadePassageiros = Integer.parseInt(scanner.nextLine());
       
        System.out.println("Quantas vagas há no carrinho?");
        quantidadeVagasCarrinho = Integer.parseInt(scanner.nextLine());
       
        voltasMontanha = quantidadePassageiros / quantidadeVagasCarrinho;
        
        new Parque().iniciaMontanhaRussa(quantidadeVagasCarrinho, voltasMontanha, quantidadePassageiros);
    }
}
