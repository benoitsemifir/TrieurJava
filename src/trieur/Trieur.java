package trieur;

import java.util.Arrays;

public class Trieur {

	/**
	 * 		Tri par selection
	 *	On trouve l'element le plus petit du tableau et on le place en premier
	 *	ensuite on recommence sans prendre en compte l'element qui vient d'�tre placer
	 *	(on commence la boucle un cran plus loin)
	 *	on place le deuxi�me �l�ment et on recommence (boucle)
	 *
	 *	trouver un moyen d'�changer deux valeurs sans perdre de donn�e:
	 *	- utiliser une variable temporaire pour faire l'�change
	 *	- mettre la valeur faible dans la variable temporaire
	 *	- la valeur faible va prendre la valeur initiale
	 *	- la valeur initiale va recevoir la valeur temporaire
	 *
	 * @param tabNombre Le tableau d'entiers � trier
	 */
	public static void triSelection(int[] tabNombre) {

		// il faut r�p�ter l'op�ration pour chaque �lements du tableau
		for ( int j = 0 ; j < tabNombre.length - 1 ; j++) {

			// garder en m�moire l'indice du plus petit nombre
			int indiceMin = j;
			// on it�re sur le tableau
			for(int i = j ; i < tabNombre.length ; i++) {
				// trouver l'indice de l'�l�ment le plus petit
				if(tabNombre[i] < tabNombre[indiceMin]) {
					// garder en m�moire l'indice de l'element trouv�
					indiceMin = i;
				}
			}
			echangerValeurs(tabNombre, j, indiceMin);
		}
	}

	/**
	 * �changer les emplacements des valeurs d'un tableau
	 * @param tableau
	 * @param valeur1
	 * @param valeur2
	 */
	protected static void echangerValeurs(int[] tableau, int valeur1, int valeur2) {
		int temp = tableau[valeur1];
		tableau[valeur1] = tableau[valeur2];
		tableau[valeur2] = temp;
	}

	/**
	 * Parcourrir le tableau, comparer l'�lement sur lequel j'it�re avec l'�lement
	 * suivant.
	 * 
	 * Si l'�lement actuel est plus grand que l'�lement suivant, j'�change leurs
	 * positions.
	 * 
	 * Je recommence jusqu'� avoir un tableau tri�.
	 * 
	 * @param tabNombre
	 */
	public static void triBulle(int[] tabNombre) {

		boolean doitEtreTriee = true;
		
		int compteur = 1;
		
		while(doitEtreTriee) {
			
			doitEtreTriee = false;
			// parcours du tableau
			for (int i = 0 ; i < tabNombre.length - compteur ; i ++) {

				// �change de position si l'�lement suivant est plus grand que l'�lement actuel
				if( tabNombre[i] > tabNombre[i + 1] ) {
					echanger(tabNombre, i);
					doitEtreTriee = true;
				}
			}
			compteur++;
			System.out.println(Arrays.toString(tabNombre));
		}
	}

	/**
	 * @param tableau
	 * @param i
	 */
	protected static void echanger(int[] tableau, int i) {
		int temp = tableau[i];
		tableau[i] = tableau[i+1];
		tableau[i +1 ] = temp;
	}



}
