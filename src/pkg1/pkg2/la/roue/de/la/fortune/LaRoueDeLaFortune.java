/*
Lors de l'examen final à la fin de leurs études, la tradition veut que les élèves tirent un sujet au hasard. Tirer un numéro dans un chapeau n'étant pas très amusant, ils utilisent une roue comme celle-ci, qu'ils peuvent faire tourner dans un sens ou dans l'autre.


Les enseignants, par expérience, arrivent toujours à estimer de combien de "zones" la roue va tourner et peuvent aller chercher le sujet et revenir, pendant que la roue tourne encore. Il faut, pour cela, calculer rapidement sur quelle zone le curseur va s'arrêter, en fonction du nombre de zones dont la roue va tourner. A vous de jouer !

Ce que doit faire votre programme :
Votre programme doit commencer par lire un entier nbZones. Sachant que la roue va tourner de nbZones zones, vous devez calculer (puis afficher) sur quelle zone le curseur va arriver.

Ainsi, si la route tourne de +2 zones alors le curseur arrive sur la zone 2, et si la roue tourne de -2 zones, alors le curseur arrive sur la zone 22.

EXAMPLEs
EXAMPLE 1
input:

25
output:

1
EXAMPLE 2
input:

-50
output:

22
 */
package pkg1.pkg2.la.roue.de.la.fortune;
import java.util.Scanner;

/**
 *
 * @author hichem
 */
public class LaRoueDeLaFortune {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        int totalZones = 24; // La roue a 24 zones numérotées de 0 à 23

        System.out.println("Veuillez saisir le nombre de zones de déplacement :");
        int nbZones = scanner.nextInt();

        int position = (nbZones % totalZones);

        if (position < 0) {
            position += totalZones;
        }

        // Afficher la position finale
        System.out.println("La position finale est : " +position);
    }
}