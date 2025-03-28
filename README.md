## Objectif

Ce travail a pour objectif de mettre en pratique le principe de couplage faible en Java,

**Étapes de réalisation :**

1. Création de l’interface IDao :

   Une interface nommée IDao a été définie. Elle déclare une méthode abstraite getData() qui sera implémentée ultérieurement :

![Interface IDao](captures/IDao-image1.JPG)

2. Implémentation de l’interface IDao :

   Une classe DaoImpl a été créée pour implémenter l’interface IDao. Elle fournit une version concrète de la méthode getData() :

![Implementation de l'interface IDao](captures/DaoImpl-image2.JPG)

3. Création de l’interface IMetier :

   L’interface IMetier a été créée afin de représenter une couche métier. Elle contient une méthode abstraite calcul() :

![Interface Imetier](captures/IMetier-image3.JPG)

4. Implémentation de l’interface IMetier avec couplage faible :

   Pour respecter le principe de couplage faible, une classe MetierImpl a été développée. Cette classe dépend de l’interface IDao et non de sa classe d’implémentation :

![Implementation de l'interface IMetier](captures/MetierImpl-image4.JPG)
