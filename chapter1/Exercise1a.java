class Exercise1a {
	public static void main(String[] args) {
		// o codigo do exercicio nao compilava porque x sempre seria menor que 10 e nunca seria maior que 3
		int x = 20;
		while(x > 10) {
			if (x > 3) {
				System.out.println("big x");
			}
		}
	}
}