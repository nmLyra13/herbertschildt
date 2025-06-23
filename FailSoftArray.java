package herbertschildt;

public class FailSoftArray {
	private int a[]; // referência ao array
	private int errval; // valor a ser retornado se get() falhar.
	public int length; // length é publica

	/*
	 * Constroi um array dados seu tamanho e o valor a ser retornado se get()
	 * falhar.
	 */
	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}

	// Retorna o valor do indice especificado.
	public int get(int index) {
		if (indexOK(index))
			return a[index];
		return errval;
	}

	// Insere um valor em um índice. Retorna false em caso de falha.
	public boolean put(int index, int val) {
		if (indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}

	// Retorna true se index estiver dentro dos limites.
	private boolean indexOK(int index) {
		if (index >= 0 & index < length)
			return true;
		return false;
	}

}
