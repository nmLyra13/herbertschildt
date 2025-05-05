package herbertschildt;

public class Ragged {

	/*
	 * Trabalhando com Arrays irregulares Quando alocamos memória para um array
	 * multidimensional, só temos de especificar a memória da primeira dimensão (a
	 * da extrema esquerda). As outras dimensões podem ser alocadas separadamente.
	 * Por exemplo, o código a seguir aloca memória para a primeira dimensão so
	 * array table quando este é declarado. A segunda dimensão é alocada
	 * manualmente. Aparentemente pode não ter vantagens em alocar individualmente
	 * os conjuntos da segunda dimensão separadamente, não precisamos alocar o mesmo
	 * número de elementos como arrays compostos por arrays, temos o controle do
	 * tamanho de cada array.
	 */
	public static void main(String[] args) {

		int riders[][] = new int[7][];
		riders[0] = new int[10]; // 2ª dimensao com 10 elementos
		riders[1] = new int[10]; // 2ª dimensao com 10 elementos
		riders[2] = new int[10]; // 2ª dimensao com 10 elementos
		riders[3] = new int[10]; // 2ª dimensao com 10 elementos
		riders[4] = new int[10]; // 2ª dimensao com 10 elementos
		riders[5] = new int[2]; // 2ª dimensao com 2 elementos
		riders[6] = new int[2]; // 2ª dimensao com 2 elementos

		int i, j;

		// Vamos forjar alguns dados fictícios.

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 10; j++) {
				riders[i][j] = i + j + 10;
			}
			for (i = 5; i < 7; i++) {
				for (j = 0; j < 2; j++) {
					riders[i][j] = i + j + 10;
				}
			}
			System.out.println("Riders per trip during the  week: ");
			for (i = 0; i < 5; i++) {
				for (j = 0; j < 10; j++) {
					System.out.println(riders[i][j] + " ");
					System.out.println();
				}
				System.out.println();
				System.out.println("Riders per trip on the weekend:");
				for (i = 5; i < 7; i++) {
					for (j = 0; j < 2; j++) {
						System.out.println(riders[i][j] + " ");
						System.out.println();
					}
				}
			}

		}
	}

}
