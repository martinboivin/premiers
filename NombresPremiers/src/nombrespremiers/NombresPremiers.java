/*
 * Gabarit de projet.
 * 
 * Utilisation :
 * Par Martin, mai 2024
 * 
 */
package nombrespremiers;

public class NombresPremiers {

	public static void main(String[] args) {
        int low = 2, high = 100;

        while (low < high) {
            boolean flag = false;
            // Um programme par Martin !!! !!!
            for(int i = 2; i <= low/2; ++i) {
                // Détermine si le nombre est premier
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }             		
	}
}
