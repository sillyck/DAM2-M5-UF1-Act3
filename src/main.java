public class main {

	public static void main(String[] args) {
		 int v=0;
		 int t=0;
		 int i=0;
		 int j=0;
		 int alpha=1;
		 int o=2;
		int upsilon=2;
		double numRandom1 = 0;
		double numRandom2 = 0;
		int pastoMillor = 0;
		int x = 0;
		int g = 0;
		double proximaPosicio = 0, proximaPosicio2 = 0, proximaPosicio3 = 0, formulaCompleta = 0;
		double f = 0;
		
			int random1 = (int) (-4 + Math.random()*8);
			int random2 = (int) (-4 + Math.random()*8);
			numRandom1 = (double) (Math.random()*1);
			numRandom2 = (double) (Math.random()*1);
			double arrodonit1 = Math.round(numRandom1*10.0) / 10.0;
			double arrodonit2 = Math.round(numRandom2*10.0) / 10.0;

			f = -((random1-1)^2+(random2-2)^2);
			
			System.out.println(f);
			
		for(t=0;t<20;t++) {
			for(i=0;i<10;i++) {
				
			proximaPosicio = alpha*v^t;
			
			proximaPosicio2 = o*arrodonit1*((pastoMillor-x)^t);
			
			proximaPosicio3 = upsilon*arrodonit2*(g-x^t);
			
			formulaCompleta = proximaPosicio + proximaPosicio2 + proximaPosicio3;
			
			
			
			
			
			}
			System.out.println(Math.round(formulaCompleta*10.0)/10.0);
			
		}
	
	}

}
