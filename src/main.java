public class main {
	
	private static char[][] prada = new char[16][16];
	
	public static void main(String[] args) {
		
		for(int i=0;i<16;i++) {
			for (int j=0; j<16;j++) {
				prada[i][j] = '#';
				System.out.print(prada[i][j] + " ");
			}
			System.out.println("");
		}
		

	}

}
