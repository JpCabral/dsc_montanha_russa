/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class MontanhaRussa {
    int lugaresDisponiveis;
    int quantidadeVoltasRestantes;
    int passageirosDentro;
    
    MontanhaRussa(int lugaresVagos, int voltasParaDar){
        lugaresDisponiveis = lugaresVagos;
        quantidadeVoltasRestantes = voltasParaDar;
        passageirosDentro = 0;
    }
}
