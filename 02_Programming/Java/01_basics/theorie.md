# Theorie Java Basics

In dit document zal ik de Java vragen beantwoorden.

# Java vragen hoofdstuk 1

Object: Objecten zijn code die met elkaar interacten om zo Java te kunnen runnen.

Class: In de class bevinden zich de objecten en Java code.

Package: De map waar de Java classes in staan.

Constructor: Een constructor wordt "opgeroepen" als er een class of object wordt aangemaakt, om zo objecten te initialiseren. 

Field: Een field is een variabele binnen een class.

Method: Een method is een block van code die alleen werkt als het opgeroepen wordt.

Parameter: Parameters zijn variabelen binnen methods.

public static void main(string[] args): Dit is de method die nodig is om Java code te kunnen runnen.

<br>

# Java vragen hoofdstuk 2
### **Opdracht 1**
*int wordt gebruikt als de waarde een cijfer is. long wordt gebruikt als de waarde een lang cijfer is. double wordt gebruikt als de waarde een cijfer met 2x zoveel decimalen heeft als float. float wordt gebruikt als de waarde een cijfer met 6-7 decimalen is.*

<br>

### **Opdracht 7**
Wat is een voordeel van Strict Typing?

*Een voordeel van Strict Typing is dat er minder errors zullen onstaan vanwege de strikte regels.*

<br>

Wat is een voordeel van Weak Typing?

*Een voordeel van Weak Typing is dat er minder moeite gedaan hoeft te worden over het coderen. De compiler heeft minder strikte regels, waardoor code sneller geschreven kan worden.*

<br>

# Java vragen hoofdstuk 3
### **Opdracht 1**
*Public: is bruikbaar overal in het programma.*

*Private: is alleen bruikbaar in die class.*

*Protected: is bruikbaar binnen dezelfde package of subclasses.*

*Default: als er geen access modifier wordt aangegeven, dan wordt default gebruikt. Default is alleen bruikbaar binnen dezelfde package.*

<br>

### **Opdracht 2**

*Static kan alleen gebruikt worden bij static dingen. Het kan aangepast worden en past zich onafhankelijk toe op een class of object. Final kan niet aangepast worden en wordt gebruikt op classes die niet inherited kunnen worden. Static is handig voor het gebruiken van constanten zonder extra geheugen te gebruiken. Final is handig voor het verbeteren van performance. Ze cachen data zodat het makkelijk te sharen is zonder extra synchronisatie.*

<br>

### **Opdracht 3**

*.equals is een method die gebruikt wordt voor het vergelijken van content. == is een operator die gebruikt wordt om references te vergelijken.*

<br>

# Java vragen hoofdstuk 5
### **Opdracht 7**
Wat is deze standaardmaat van een ArrayList en hoeveel groeit deze als hij eroverheen gaat?

*De standaardmaat van een ArrayList is 10. De standaardmaat groeit steeds met 1,5 keer als je eroverheen gaat.*

<br>

# Java vragen hoofdstuk 6
## **Opdracht 1**
### **Opdracht 1.4**
*Je komt nooit bij de else uit, omdat 27 altijd kleiner zal zijn dan 30.*

<br>

### **Opdracht 1.5**
*Dit lukt niet goed, omdat de statements booleans zijn in plaats van de int die gevraagd wordt.*

<br>

### **Opdracht 1.7**
*Het print de case "Friday" niet uit als de value niet hetzelfde is. Maar als de value wel matched, dan zal Java de code uit blijven voeren tot het een break vindt, zonder te checken of een waarde true of false is van de andere cases.*

<br>

## **Opdracht 2**
### **Opdracht 2.1**
*True, true en false*
<br>

### **Opdracht 2.2**
*De uitkomst voldoet aan mijn verwachtingen.*
<br>

### **Opdracht 2.3**
*Laten we beginnen met isMathFun1. Als we de PEMDAS volgorde gebruiken, dan betekent dat dat we eerst moeten kijken naar alles wat tussen de haakjes staat. In dit geval is dat (a == 7 && (b >= a || a != a)). Binnen de haakjes hebben de haakjes ook voorrang, dus (b >= a || a != a) is het eerste waar we naar gaan kijken. In deze haakjes staat dat b groter is dan a OF a is niet gelijk aan a. Als we dan naar de haakjes erbuiten kijken, staat er dan a gelijk is aan 7 EN dat de waarden binnen de andere haakjes ook true moeten zijn. Dus tussen de haakjes staat dat a gelijk is aan 7 EN (b is groter dan a OF a is niet gelijk aan a). Voordat de haakjes geopend werden, stond er een uitroepteken voor. Dit betekent dat alles tussen de haakjes dus NIET het geval moet zijn. Dit klopt, want alles tussen de haakjes is false, maar omdat het uitroepteken juist wil dat het false is, maakt het de statement true.*

<br>

*Bij isMathFun2 wordt er maar op 1 plek gebruik gemaakt van haakjes en dat is ook de eerste plek waar we naar gaan kijken. (b > 3) betekent dat b groter is dan 3. Voor de haakjes staat een uitroepteken, wat dus betekent dat de statement juist false moet zijn. b is gelijk aan 3, dus de statement is inderdaad false, wat door het uitroepteken dus true wordt. Voor de statement van de haakjes staat a == b. a is dus gelijk aan b. De hele statement is a == b || !(b > 3). a is gelijk aan b OF b is niet groter dan 3. b is 3, dus het is niet groter dan 3. Omdat het een "of" statement is, maakt het de statement dus true, omdat de statement na het "of" teken true is.*

<br>

*Bij isMathFun3 hebben we weer bijna de hele statement tussen de haakjes. (b <= a && b != a + b). Dit staat voor b is kleiner of gelijk aan a EN b is niet gelijk aan (a + b). Vanwege PEMDAS zal de optelsom van a + b voorrang hebben, dus het is niet b is niet gelijk aan a en DAN + b, maar b is niet gelijk aan (a + b). De statements tussen de haakjes kloppen. b is namelijk kleiner of gelijk aan a EN b is niet gelijk aan (a + b), MAAR voor de haakjes staat een uitroepteken, wat betekent dat de statement false moet zijn. Omdat de statement true is en het uitroepteken de statement false maakt, zal de statement false zijn.*

<br>

## **Opdracht 3**
### **Opdracht 3.1**
*De loop zal oneindig doorgaan, omdat een while loop doorgaat tot de statement false wordt. Als de statement true blijft, zal de loop nooit eindigen.*

<br>

# Theorie Java Object Oriented