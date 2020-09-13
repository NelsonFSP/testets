package br.com.principal;


public class ControleFluxo5 {
	
	public static void main(String[] args) {
		//Dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
		//Porém as parcelas não podem ser menores do que 1000
		
		Double valorTotal = 30000.00;
		
		for (int parcela = 1; parcela <= valorTotal; parcela++) {
			Double valorParcela = valorTotal / parcela;
			if(valorParcela < 1000) {
				continue;
			}
			System.out.println("parcela " + parcela + " R$" + valorParcela);
		}
		
	}

}
