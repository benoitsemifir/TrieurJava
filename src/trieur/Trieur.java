package trieur;

import java.util.Arrays;

public class Trieur {

	/**
	 * 		Tri par selection
	 *	On trouve l'element le plus petit du tableau et on le place en premier
	 *	ensuite on recommence sans prendre en compte l'element qui vient d'être placer
	 *	(on commence la boucle un cran plus loin)
	 *	on place le deuxième élément et on recommence (boucle)
	 *
	 *	trouver un moyen d'échanger deux valeurs sans perdre de donnée:
	 *	- utiliser une variable temporaire pour faire l'échange
	 *	- mettre la valeur faible dans la variable temporaire
	 *	- la valeur faible va prendre la valeur initiale
	 *	- la valeur initiale va recevoir la valeur temporaire
	 *
	 * @param tabNombre Le tableau d'entiers à trier
	 */
	public static void triSelection(int[] tabNombre) {

		// il faut répéter l'opération pour chaque élements du tableau
		for ( int j = 0 ; j < tabNombre.length - 1 ; j++) {

			// garder en mémoire l'indice du plus petit nombre
			int indiceMin = j;
			// on itére sur le tableau
			for(int i = j ; i < tabNombre.length ; i++) {
				// trouver l'indice de l'élément le plus petit
				if(tabNombre[i] < tabNombre[indiceMin]) {
					// garder en mémoire l'indice de l'element trouvé
					indiceMin = i;
				}
			}
			echangerValeurs(tabNombre, j, indiceMin);
		}
	}

	/**
	 * Échanger les emplacements des valeurs d'un tableau
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
	 * Parcourrir le tableau, comparer l'élement sur lequel j'itére avec l'élement
	 * suivant.
	 * 
	 * Si l'élement actuel est plus grand que l'élement suivant, j'échange leurs
	 * positions.
	 * 
	 * Je recommence jusqu'à avoir un tableau trié.
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

				// échange de position si l'élement suivant est plus grand que l'élement actuel
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
