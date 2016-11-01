public class Triangle {

	public static void main(String[] args) {
		String etoile=" ";
		// i reprsente le nombre de ligne//
		for (int i=0;i<8;i++){
			int espace=8-i;
			//j nombre des etoiles//
			for (int j=0;j<espace;j++){
				System.out.print(" ");
			}
			etoile=etoile+" ";
			System.out.println(etoile);
		}

	}
 }
