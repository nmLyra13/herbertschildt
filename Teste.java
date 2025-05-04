package herbertschildt;

import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {

        int[][] tri = new int[5][];          // Cria 1ª dimensão com 5 linhas (todas ainda null)

        for (int i = 0; i < tri.length; i++) {
            System.out.println(i);
            tri[i] = new int[i + 1];         // Cada linha recebe i+1 colunas (1, 2, 3, 4, 5)
            for (int j = 0; j < tri[i].length; j++) {
                tri[i][j] = j + 1;           // Preenche a linha com 1,2,3… (didático)
            }
        }

        // Impressão para visualizar
        for (int[] linha : tri) {
            System.out.println(Arrays.toString(linha)); // Exibe cada linha com tamanho diferente
        }
    }
}
