package application;

public class Program {

	public static void main(String[] args) {

		int[] vetor = { 5, 3, 1, 4, 2 };
		int[] ordenado;

		// bubbleSort(vetor);
		// selectionSort(vetor);
		// insertionSort(vetor);
		quickSort(vetor);

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

	}

	public static void bubbleSort(int vetor[]) {
		int aux;
		int tam = vetor.length;

		for (int i = 0; i < tam - 1; i++) {
			for (int j = 0; j < tam - 1 - i; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
	}

	public static void selectionSort(int vetor[]) {
		int aux;
		int tam = vetor.length;

		for (int i = 0; i < tam - 1; i++) {
			for (int j = i + 1; j < tam; j++) {
				if (vetor[j] < vetor[i]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
	}

	public static void insertionSort(int vetor[]) {
		int aux;
		int tam = vetor.length;
		int j;

		for (int i = 1; i < tam; i++) {
			aux = vetor[i];
			j = i - 1;
			while (j >= 0 && aux < vetor[j]) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = aux;
		}

	}

	public static void quickSort(int vetor[]) {
		quickSort(vetor, 0, vetor.length - 1);
	}

	public static void quickSort(int vetor[], int i, int s) {
		int e = i, d = s;
		int item = vetor[((e + d) / 2)];
		while (e <= d) {
			while (vetor[e] < item)
				e++;
			while (vetor[d] > item)
				d--;
			if (e <= d) {
				int aux; // Variável auxiliar para as trocas
				aux = vetor[e];
				vetor[e] = vetor[d];
				vetor[d] = aux;
				d--;
				e++;
			}
		}
		if (d - i > 0)
			quickSort(vetor, i, d);
		if (s - e > 0)
			quickSort(vetor, e, s);
	}
}
