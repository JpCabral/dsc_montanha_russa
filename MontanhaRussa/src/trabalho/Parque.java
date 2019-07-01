
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Parque {
    MontanhaRussa montanhaRussa;
    
    public void iniciaMontanhaRussa(int vagas, int voltas, int passageiros){
        boolean funcionando;
        
        montanhaRussa = new MontanhaRussa(vagas, voltas);
        
        funcionando = true;
        
        Carrinho carrinho = new Carrinho(montanhaRussa);
        
        List<Passageiro> listaPassageiros = new ArrayList<>();
        
        carrinho.start();
        
        for(int i = 0; i < passageiros; i++){
            new Passageiro(montanhaRussa).start();
        }
        
        while(funcionando){
            if(montanhaRussa.quantidadeVoltasRestantes == 0){
                System.out.println("A montanha russa fechou!");
                funcionando = false;
            }
        }
    }
}
