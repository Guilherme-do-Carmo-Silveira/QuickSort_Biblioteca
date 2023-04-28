package docarmo.quicksort;

public class Ordenacao {

	public Ordenacao() {
		super();
	}
	
	public int[] QuickSort(int []vetor, int inicio, int fim) {
		if(fim > inicio) {
			int PosicaoPivoFixo = dividir(vetor, inicio, fim);
			QuickSort(vetor, inicio, PosicaoPivoFixo - 1);
			QuickSort(vetor, PosicaoPivoFixo + 1, fim);
		}
		return vetor;
	}
	
	private int dividir (int [] vetor, int inicio, int fim) {
		int PonteiroEsquerda = inicio + 1;
		int PonteiroDireita = fim;
		int pivo = vetor[inicio];
		
		while(PonteiroEsquerda <= PonteiroDireita) {
			while(PonteiroEsquerda <= PonteiroDireita && vetor[PonteiroEsquerda] <= pivo) {
				PonteiroEsquerda++;
			}
			while(PonteiroDireita >= PonteiroEsquerda && vetor[PonteiroDireita] > pivo) {
				PonteiroDireita--;
			}
			if(PonteiroEsquerda < PonteiroDireita) {
				trocar(vetor, PonteiroEsquerda, PonteiroDireita);
				PonteiroEsquerda++;
				PonteiroDireita--;
			}
		}
		trocar(vetor, inicio, PonteiroDireita);
		return PonteiroDireita;
	}

	private void trocar(int[] vetor, int i, int j) {
		 int aux = vetor[j];
		 vetor[j] = vetor[i];
		 vetor[i] = aux;	
	}
}
