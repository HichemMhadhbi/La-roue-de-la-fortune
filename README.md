# La roue de la fortune

## Description 
Lors de l'examen final à la fin de leurs études, la tradition veut que les élèves tirent un sujet au hasard. Tirer un numéro dans un chapeau n'étant pas très amusant, ils utilisent une roue comme celle-ci, qu'ils peuvent faire tourner dans un sens ou dans l'autre.

## Explication de l'image et de l'exercice
### Description de la roue :
La roue est divisée en 24 zones numérotées de 0 à 23.
Chaque zone représente une position sur la roue.
Le curseur (indiqué par la flèche rouge en haut de l'image) pointe initialement sur la zone 0.

### Rotation de la roue :
La roue peut tourner dans les deux sens :
Sens horaire (+) : La roue tourne vers les zones avec des numéros croissants.
Sens antihoraire (-) : La roue tourne vers les zones avec des numéros décroissants.
Le nombre de zones dont la roue tourne peut être positif ou négatif.

Les enseignants, par expérience, arrivent toujours à estimer de combien de "zones" la roue va tourner et peuvent aller chercher le sujet et revenir, pendant que la roue tourne encore. Il faut, pour cela, calculer rapidement sur quelle zone le curseur va s'arrêter, en fonction du nombre de zones dont la roue va tourner. A vous de jouer !

## Ce que doit faire votre programme :
Votre programme doit commencer par lire un entier nbZones. Sachant que la roue va tourner de nbZones zones, vous devez calculer (puis afficher) sur quelle zone le curseur va arriver.

Ainsi, si la route tourne de +2 zones alors le curseur arrive sur la zone 2, et si la roue tourne de -2 zones, alors le curseur arrive sur la zone 22.

EXAMPLEs

### EXAMPLE 1
input:
25
output:
1

### EXAMPLE 2
input:
-50
output:
22
