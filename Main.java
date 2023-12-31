import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		//lezione su metodi di output
		Metodi_output.main(null);
		
		//lezione su variabili
		Variabili.main(null);
		
		//lezione sui tipi di dati
		Tipi_di_dati.main(null);

		//lezione su input da utente
		Input_utente.main(null);

		//lezione su operazioni aritmetiche
		Operazioni_aritmetiche.main(null);

		//lezione sulla classe Math
		Classe_math.main(null);

		//lezione su operatori di comparazione
		Operatori_comparazione.main(null);

		//lezione su operatori logici
		Operatori_logici.main(null);

		//lezione sulla struttura di controllo if
		Struttura_if.main(null);

		//lezione sulla struttura di controllo switch
		Struttura_switch.main(null);

		//lezione sui cicli While / Do while
		Ciclo_while.main(null);

		//lezione sul ciclo for
		Ciclo_for.main(null);

		//lezione su array
		Array.main(null);
		
		//lezione su array bidimensionali
		Array_2d.main(null);

		//lezione su metodi stringhe
		Metodi_stringhe.main(null);

		//lezione sulle wrapper class
		Wrapper_class.main(null);

		//lezione sulle ArrayList
		Array_list.main(null);

		//lezione sui metodi
		Metodi.main(null);

		//lezione su overload di metodi
		Overloaded_methods.main(null);

		//lezione di introduzione OOP
		Introduzione_OOP.main(null);

		//lezione su scope variabili
		Scope_variabili.main(null);

		//lezione su metodo toString()
		Metodo_toString.main(null);

		//lezione su array di oggetti
		Array_oggetti.main(null);

		//lezione sul passaggio di oggetti come parametri
		Oggetti_parametri.main(null);

		//lezione sulle keyword final e static
		Final_static.main(null);

		//lezione su ereditarietà
		Ereditarieta.main(null);

		//lezione sulle classi astratte
		Classi_astratte.main(null);

		//lezione su modificatori d'accesso: vedere pacchetto1 e pacchetto2

		//lezione su incapsulamento
		Incapsulamento.main(null);

		//lezione sulla copia di oggetti
		Copiare_oggetti.main(null);

		//lezione sulle interfacce
		Interfacce.main(null);

		//lezione sul polimorfismo
		Polimorfismo.main(null);

		//lezione sulla gestione delle exceptions
		Exception_handling.main(null);

		//lezione sui file
		Usare_file.main(null);

		//lezione sul casting
		Casting.main(null);

		//lezione su data e ora
		Data_ora.main(null);

		//lezione sulle hashmap
		Hashmap.main(null);

		//lezione sugli iteratori
		Iteratori.main(null);

	}

}

class Metodi_output{

	public static void main(String[] args){
		System.out.print("Ciao");  //manda a schermo
		System.out.print("Ciao di nuovo\n");  //utilizza \n per newline
		
		System.out.println("Ciao");  //manda a schermo nuova riga
		System.out.println("Ciao di nuovo");  //manda a schermo nuova riga
	}

}

class Variabili{

	public static void main(String[] args){
		int x;	//dichiarazione
		x = 45;	//assegnazione
		
		int y = 30;	//inizializzazione (comprende dichiarazione e assegnazione)
		
		System.out.println(x);
		
		int camelCase;	//usato per le variabili
		int SNAKE_CASE; //usato per le costanti
	}

}

class Tipi_di_dati{

	public static void main(String[] args){
		boolean bool = true;
		byte b = 127;
		short s = -32768;
		int i = 2000000000;
		long l = 3000000000000L;
		
		float f = 5.12345f;
		double d = 5.12345678912345;
		
		char c = 'f';
		String stringa = "fffffffff";
		
		//I tipi di dati si dividono tra primitive e reference (come String)
		//le primitive sono fornite dal sistema e cominciano con la minuscola
		//le reference cominciano con la maiuscola
		
		stringa.toLowerCase(); //le reference forniscono anche metodi e attributi per lavorare su quel tipo di dati
	}

}

class Input_utente{
	
	public static void main(String[] args){	
		/* 
		 * LEZIONE SU INPUT DA UTENTE
		 * importare java.util.Scanner
		 * creare oggetto scanner
		 * creare domande per utente: nome, cognome, eta, citta
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual è il tuo nome?");
		String nome = scanner.nextLine();
		
		System.out.println("Qual è il tuo cognome?");
		String cognome = scanner.nextLine();
		
		System.out.println("Qual è la tua età?");
		int eta = scanner.nextInt();
		
		scanner.nextLine(); // spiegazione sotto l'output
		
		System.out.println("In che città vivi?");
		String citta = scanner.nextLine();
		
		System.out.println("Ciao " + nome + " " + cognome);
		System.out.println("Hai " + eta + " anni");
		System.out.println("Vivi a " + citta);
		
		/*
		 * Si è aggiunto uno scanner.nextLine() dopo lo scanner.nextInt()
		 * poiché, se questo non ci fosse allora il programma non permetterebbe 
		 * l'inserimento dell'input successivo:
		 * 
		 * ESEMPIO: 
		 * (1) quando inserisco il nome, inserisco "Marco" e il carattere \n (newline)
		 * con il tasto invio. Poiché scanner.nextLine() legge l'intera riga,
		 * inclusi nome e \n, non avrò piu \n nel buffer
		 * 
		 * (2) quando inserisco l'età, inserisco "20" e il carattere \n, ma poiché
		 * scanner.nextInt() consuma solo parzialmente la riga, questo legge il numero
		 * ma lascia \n nel buffer; in questo modo, il \n rimasto nel buffer verrà letto
		 * dal prossimo scanner.nextLine() come riga vuota
		 */
	}
	
}

class Operazioni_aritmetiche{
	
	public static void main(String[] args){	
		/* 
		 * LEZIONE SU OPERAZIONI ARITMETICHE
		 * operatori aritmetici + - / * %
		 * shorthand
		 * incremento e decremento
		 * esempi di espressioni
		 */
		
		int x = 11;
		int y = 5;
		int z;
		
		z = x + y;
		z = x - y;
		z = x * y;
		z = x / y;
		z = x % y;
		
		z = x + y;
		System.out.println(z);
		System.out.println(x+y);
		
		x = x + 3;	//incrementa se stesso di 3
		x += 3;		//shorthand dell'addizione a se stesso
		
		//ESEMPI DI SHORTHAND
		x *= 3;
		x /= 3;
		
		x++;	//incrementa di 1 il valore di x
		x--;	//decrementa di 1 il valore di x
		
		x = 11;
		y = 3;
		z = 9;
		int result = ((x + y) * y + (4-2)) * z; //espressione aritmetica
	
		System.out.println(result);	
	}
	
}

class Classe_math{
	
	public static void main(String[] args){	
		/* 
		 * LEZIONE SULLA CLASSE MATH
		 * alcuni metodi: abs, min, max, pow, sqrt
		 * attributi: PI
		 */
		
		System.out.println(Math.abs(-55));	//valore assoluto di 55
		System.out.println(Math.min(55,21));	//valore minimo tra un insieme di valori
		System.out.println(Math.max(55,21));	//valore massimo tra un insieme di valori
		System.out.println(Math.pow(5, 2));	//potenza con base 5 ed esponente 2
		System.out.println(Math.sqrt(25));	//radice quadrata di 25
		
		System.out.println(Math.PI);	//pi greco
	}
	
}

class Operatori_comparazione{
	
	public static void main(String[] args){	
		/* 
		 * LEZIONE SUGLI OPERATORI DI COMPARAZIONE
		 * operatori:
		 * >
		 * >=
		 * <
		 * <=
		 * ==
		 * !=
		 */
		
		boolean risultato = 3 > 10;
		
		System.out.println(risultato);	//tue o false
		System.out.println(3 < 10);		//true o false
		
		risultato = 33 > 10;
		System.out.println(risultato);
		
		risultato = 10 >= 10;
		System.out.println(risultato);
		
		risultato = 9 < 10;
		System.out.println(risultato);
		
		risultato = 9 <= 9;
		System.out.println(risultato);
		
		risultato = 10 == 10;
		System.out.println(risultato);
		
		risultato = 11 != 10;
		System.out.println(risultato);
	}
	
}

class Operatori_logici{
	
	public static void main(String[] args){	
		/* 
		 * LEZIONE SUGLI OPERATORI LOGICI
		 * operatori: AND OR NOT
		 */

		boolean x;
		x = 3 > 10;		//true se 3 è maggiore di 10, false altrimenti
		x = 3 % 2 == 0;	//true se 3 è pari, false altrimenti
		
		x = 3 < 10 && 3 % 2 == 0;	//true se entrambe le condizioni sono verificate, false altrimenti
		System.out.println(x);
		
		x = 3 < 10 || 3 % 2 == 0;	//true se almeno una delle due condizioni è verificata, false altrimenti
		System.out.println(x);
		
		x = !(3 < 10);			//negazione del risultato di (3 < 10)
		System.out.println(x);
		
		boolean y = ((3 < 10 && 3 % 2 == 0) || (6 < 10 && 6 % 2 == 0)) && 10 < 100;
		System.out.println(y);
	}
	
}

class Struttura_if{
	
	public static void main(String[] args){	
		/* 
		 * LEZIONE SULLA STRUTTURA IF
		 * L'if è una struttura di controllo condizionale
		 * che permette di eseguire un blocco di codice solo se
		 * una determinata condizione è vera.
		 * 
		 * IF
		 * ELSE
		 * ELSE IF
		 * if annidati
		 * ternary operator
		 */
		
		boolean isOnline = true;
		String nome = "Luca";
		int num = 3;
		
		if(3 < 10) {
			System.out.println("ok");
		}
		
		if(isOnline){
			System.out.println("è online");
		}else {
			System.out.println("non è online");
		}
		
		if(nome == "Luca") {
			System.out.println("è Luca");
		}else if(nome == "Marco") {
			System.out.println("è Marco");
		}else {
			System.out.println("è qualcun'altro");
		}
		
		if(num < 10) {
			System.out.println("è minore di 10");
			if(num % 2 == 0) {
				System.out.println("è pari");
			}else {
				System.out.println("è dispari");
			}
		}else {
			System.out.println("non è minore di 10");
		}
		
		String x = 3 < 10 ? "buongiorno" : "buonasera";	//if con operatore ternario
		System.out.println(x);
	}
	
}

class Struttura_switch{

	public static void main(String[] args){
		/*
		 * LEZIONE SULLA STRUTTURA SWITCH
		 * Lo switch è una struttura di controllo di flusso che consente di eseguire
		 * diverse istruzioni a seconda del valore di una variabile o di un'espressione.
		 * Uno switch è spesso utilizzato quando si desidera eseguire un blocco di codice
		 * diverso in base al valore di una variabile.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual è il tuo nome?");
		String nome = scanner.nextLine();
		
		switch(nome) {
		case "Luca":
			System.out.println("ciao Luca");
			break;
		case "Marco":
			System.out.println("ciao Marco");
			break;
		case "Anna":
			System.out.println("ciao Anna");
			break;
		case "Antonio":
			System.out.println("ciao Antonio");
			break;
		case "Edoardo":
			System.out.println("ciao Edoardo");
			break;
		default:
			System.out.println("ciao!");
		}
	}

}

class Ciclo_while{

	public static void main(String[] args){
		/*
		 * LEZIONE SUI CICLI WHILE / DO WHILE
		 * Il while è una struttura di controllo iterativa che consente di eseguire ripetutamente
		 * un blocco di istruzioni fintanto che una determinata condizione è vera.
		 * In altre parole, il "while" crea un ciclo che continua ad eseguire il suo blocco di codice
		 * finché la condizione specificata è valutata come vera.
		 * 
		 * Cos'è un ciclo
		 * A cosa serve un ciclo
		 * Ciclo while
		 * Ciclo do while
		 * 
		 * Un ciclo è un porzione di codice che ci permette di eseguire ripetutamente
		 * una o piu istruzioni finché una condizione è verificata.
		 * E' necessario quando non ci conosce a priori il numero di volte che occorre
		 * ripetere le istruzioni.
		 */
		
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println("do while " + i);
			i++;
		} while(i<5);
		
		/*
		 * il do while differisce dal while per il fatto che permette
		 * di eseguire almeno una volta il blocco di codice anche se la
		 * condizione non è verificata
		 */
	}

}

class Ciclo_for{

	public static void main(String[] args){
		/*
		 * LEZIONE SUL CICLO FOR
		 * Il costrutto for è una struttura di controllo iterativa,
		 * spesso utilizzata quando si conosce a priori il numero
		 * di iterazioni che si desidera eseguire
		 * 
		 * Ciclo for
		 * for annidati
		 * versione enhanced/foreach
		 * break e continue
		 */
		
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("riga " + i);
			for(int j=0; j<5; j++) {
				System.out.println("colonna " + j);
			}
		}
		
		int[] numeri = {10, 20, 30, 40, 50};
		for(int numero: numeri) {			//versione enhanced del ciclo for, chiamata foreach in altri linguaggi;
			System.out.println(numero);		//si usa con gli array
		}
		
		for(int i=0; i<5; i++) {
			if(i == 4) {
				break;
			}else if(i == 2) {
				continue;
			}
			System.out.println(i);
		}
		
		/*
		 * break e continue sono istruzioni di controllo utilizzate
		 * all'interno di cicli per alterare il flusso di esecuzione
		 * del programma:
		 * - break consente di uscire dal ciclo
		 * - continue consente di saltare l'iterazione corrente
		 */
	}

}

class Array{

	public static void main(String[] args){
		/*
		 * LEZIONE SUGLI ARRAY
		 * Che cosa sono gli array
		 * Creare un array vuoto
		 * Associare elementi
		 * Array.tostring
		 * lunghezza array
		 * modificare elementi
		 * mostrare elementi
		 * ciclare array con for e foreach
		 * 
		 * Gli array sono strutture dati che consentono di memorizzare
		 * una collezione di elementi dello stesso tipo in una sequenza
		 * contigua di memoria.
		 * 
		 * Gli array in Java si comportano come oggetti, infatti:
		 * - sono gestiti per riferimento: una variaile array è una reference
		 * - vengono creati dinamicamente con new
		 * - vengono distrutti automaticamente dal garbage collector quando
		 *   non servono piu, ovvero quando non ci sono piu riferimenti a quell'oggetto
		 * 
		 * Tuttavia non sono propriamente oggetti poiché non sono istanze di una classe;
		 * non esiste infatti una classe Array
		 *
		 * Il tipo di elemento di un array può essere un tipo di dato primitivo
		 * o una reference, che quindi punta a un oggetto (istanza di String o un'altra classe).
		 * 
		 * E' importante notare che quando dichiariamo un array in questo modo:
		 * int[] a;
		 * stiamo semplicemente creando una reference ad un array,
		 * e non propriamente un array, poiché infatti non è stata
		 * specificata la dimensione
		 * 
		 * Per creare l'array usiamo l'operatore new, specificandone la dimensione:
		 * a = new int[50];
		 * 
		 * In questo modo abbiamo creato un array di 50 interi
		 * e a è una reference ad esso.
		 * 
		 * In java possiamo anche avere array di oggetti, o meglio array di reference ad oggetti.
		 * Se scriviamo:
		 * String[] a;
		 * a = new String[4];
		 * 
		 * Abbiamo creato un array di riferimenti a[], infatti creando l'array non ho creato
		 * automaticamente anche gli oggetti di tipo String: devo farlo esplicitamente
		 * 
		 * a[0] = new String();
		 * a[1] = new String();
		 * ...
		 * ...
		 * OPPURE
		 * for(int i=0; i<4; i++){
		 * 	a[i] = new String();
		 * 
		 */
		
		int[] numeri = new int[3];
		int[] numeri2 = {10, 20, 30, 40}; 	//estensione sintattica che consente di creare un array
											//di n elementi e assegnare loro un valore in un'unica istruzione.
											//L'elenco di valori tra parentesi graffa prende il nome
											//di inizializzatore e consente in un colpo solo di creare l'array,
											//definre la dimensione dell'array e attribuire i valori iniziali
											//dei suoi elementi; è solo una scorciatoia, infatti l'effetto
											//è lo stesso della serie di istruzioni standard
		numeri[0] = 10;
		numeri[1] = 20;
		numeri[2] = 30;
		
		System.out.println(numeri.length);	//numero di elementi dell'array
		
		System.out.println(numeri[0]);	//primo elemento dell'array
		numeri[0] = 100;
		System.out.println(numeri[0]);
		
		System.out.println(numeri[numeri.length-1]);	//ultimo elemento dell'array
		
		for(int i=0; i<numeri.length; i++) {	//iterare un array stampandone gli elementi
			System.out.println(numeri[i]);
		}
		
		for(int numero: numeri2) {				//iterare un array con foreach
			System.out.println(numero);
		}
		
		System.out.println(numeri.toString());

		String[] a = new String[3];		//crea un array di tre reference di tipo String
		for(int i=0; i<3; i++){
			a[i] = new String();	//crea un istanza (oggetto) di String e la associa alla reference a[i]		
		}

		/*
		 * In questo esempio si è utilizzata la classe String per semplicità:
		 * E' importante notare che l'uso di "new String()" per creare nuove instanze
		 * di String non è comune in Java; si preferisce di solito invece la sintassi
		 * delle stringhe letterali (a[i]="") come convenzione comune, in particolare a causa
		 * di alcune ottimizzazioni automatiche per le stringhe letterali che Java effettua automaticamente
		 * per migliorare l'efficienza e risparmiare risorse.
		 * Utilizzare stringhe letterali quando possibile contribuisce a sfruttare queste ottimizzazioni,
		 * di conseguenza a meno che non ve ne sia motivo si tende a non utilizzare il "new String()".
		 */
	}

}

class Array_2d{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SU ARRAY 2D
		 * Cosa sono gli array 2D
		 * Creare un array 2D in entrambi i modi: creazione e poi assegnamento o inizializzazione diretta
		 * accedere agli elementi degli array
		 * ciclare con for e foreach
		 * 
		 * Gli array 2D sono array di array, anche chiamati array multidimensionali.
		 * Un array 2D è essenzialmente la rappresentazione di una
		 * tabella (o matrice) sottoforma di array
		 */
		
		String[][] classi = new String[3][3];	//dichiara e crea un array bidimensionale di dimensione 3*3,
												//e quindi un array di tre array di stringhe di dimensione 3
		
		classi[0][0] = "Luca";
		classi[0][1] = "Anna";
		classi[0][2] = "Marco";
		
		classi[1][0] = "Edoardo";
		classi[1][1] = "Leonardo";
		classi[1][2] = "Antonio";
		
		classi[2][0] = "Arianna";
		classi[2][1] = "Paolo";
		classi[2][2] = "Andrea";
		
		System.out.println(classi[2][1]);
		classi[2][1] = "Giovanni";
		System.out.println(classi[2][1]);
		
		for(int classe=0; classe<classi.length; classe++) {							//stampa dell'array 2D con for
			System.out.println();
			for(int studente=0; studente<classi[classe].length; studente++) {
				System.out.print(classi[classe][studente] + " ");
			}
		}
		
		String[][] classi2 = {														//inizializzazione diretta di array 2D
									{"Luca", "Anna", "Marco"},
									{"Edoardo", "Leonardo", "Antonio"},
									{"Arianna", "Paolo", "Andrea"}
							 };
		
		System.out.println();
		for(String[] classe: classi) {						//stampa dell'array 2D con foreach
			System.out.println();
			for(String studente: classe) {
				System.out.print(studente + " ");
			}
		}
	}
	
}

class Metodi_stringhe{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SU METODI STRINGHE
		 * equals, equalsIgnoreCase, length, charAt,
		 * indexOf, isEmpty, toUpperCase, toLowerCase,
		 * trim, replace
		 */
		
		String nome = "Leonardo";
		boolean risultato;
		
		risultato = nome.equals("Leonardo");	//restituisce true se nome è uguale a "Leonardo", false altrimenti
		System.out.println(risultato);
		
		risultato = nome.equalsIgnoreCase("leoNardo");	//uguale ad equals ma non case sensitive
		System.out.println(risultato);
		
		int result1 = nome.length();	//restituisce il numero di caratteri
		System.out.println(result1);
		
		char result2 = nome.charAt(7);	//restituisce il carattere presente alla posizione 7
		System.out.println(result2);
		
		int result3 = nome.indexOf("a");	//restituisce l'indice della lettera a nella parola
		System.out.println(result3);
		
		risultato = nome.isEmpty();		//restituisce true se nome è una stringa vuota, false altrimenti
		System.out.println(risultato);
		
		String result4;
		result4 = nome.toUpperCase();	//restituisce la stessa stringa ma in maiuscolo
		System.out.println(result4);
		
		result4 = nome.toLowerCase();	//restituisce la stessa stringa ma in minuscolo
		System.out.println(result4);
		
		nome = "   Leonardo  ";
		nome = nome.trim();			//restituisce la stessa stringa rimuovendo gli spazi all'inizio e alla fine
		System.out.println(nome);
		
		result4 = nome.replace('o', 'w');	//restituisce la stessa stringa rimpiazzando tutte le occorrenze di o con w
		System.out.println(result4);
	}
	
}

class Wrapper_class{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SULLE WRAPPER CLASS
		 * Le wrapper class permettono di utilizzare tipi di dati primitivi come reference
		 * boolean -> Boolean
		 * char -> Character
		 * int -> Integer
		 * double -> Double
		 * 
		 * Una wrapper class è una classe che incapsula un tipo di dato primitivo in un oggetto,
		 * fornendo la possibilità di usare dei metodi, e per questo motivo è anche generalmente
		 * piu lenta rispetto a una primitiva (ma spesso è un overhead trascurabile).
		 */
		
		Boolean vero = true;
		Character carattere = 'a';
		Integer numero = 5;
		Double virgola = 5.23;
		String stringa = "corso";
		
		boolean a = true;
		char b = 'a';
		int c = 5;
		double d = 5.23;
		
		if(vero == a) {					
			System.out.println("ciao");		
		}
		/*
		 * I due valori sono effettivamente uguali, infatti Java
		 * impacchetta (autoboxing) la primitiva quando servono i metodi,
		 * e la spacchetta (unboxing) quando serve la primitiva
		 */
	} 
	
}

class Array_list{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SULLE ARRAYLIST
		 * Le arraylist sono array ridimensionabili, ma accettano solo reference
		 * 
		 * Importare java.util.ArrayList
		 * Creare un ArrayList
		 * Aggiungere elementi add()
		 * Ottenere elementi get()
		 * Modificare elementi set()
		 * Rimuovere elementi remove(), clear()
		 * ArrayList 2D
		 */
		
		ArrayList<String> persone = new ArrayList<String>();	//crea un ArrayList di tipo String
		persone.add("Luca");
		persone.add("Marco");
		persone.add("Anna");
		
		System.out.println(persone.get(0));
		for(int i=0; i<persone.size(); i++) {
			System.out.println(persone.get(i));		//ottiene l'elemento in posizione i
		}
		
		persone.set(2, "Paola");	//modifica (setta) l'elemento in posizione 2
		for(int i=0; i<persone.size(); i++) {
			System.out.println(persone.get(i));
		}
	
		persone.remove(0);	//rimuove l'elemento in posizione 0
		for(int i=0; i<persone.size(); i++) {
			System.out.println(persone.get(i));
		}
		
		persone.clear();	//svuota l'ArrayList
		for(int i=0; i<persone.size(); i++) {
			System.out.println(persone.get(i));
		}
		
		ArrayList<Integer> eta = new ArrayList<Integer>();	//crea un ArrayList utilizzando la wrapper class della primitiva int
		eta.add(20);
		eta.add(28);
		
		ArrayList<ArrayList<String>> classi = new ArrayList();	//crea un ArrayList 2D, e quindi un ArrayList di tipo ArrayList di tipo String
		
		//E' quindi necessario creare ArrayList di tipo String che saranno gli elementi dell'ArrayList 2D
		
		ArrayList<String> classe1 = new ArrayList<String>();
		classe1.add("Luca");
		classe1.add("Marco");
		
		ArrayList<String> classe2 = new ArrayList<String>();
		classe2.add("Anna");
		classe2.add("Edoardo");
		
		classi.add(classe1);
		classi.add(classe2);
		
		for(int i=0; i<classi.size(); i++) {				//per le ArrayList si usa size() invece di length()
			System.out.println();
			for(int j=0; j<classi.get(i).size(); j++) {
				System.out.print(classi.get(i).get(j) + " ");
			}
		}
	} 
	
}

class Metodi{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SUI METODI
		 * Cosa sono i metodi
		 * Creiamo un semplice metodo void
		 * Parametri dei metodi
		 * il return
		 * 
		 * I metodi sono blocchi di codice riutilizzabili
		 * Di base sono funzioni, ma vengono chiamati metodi poiché sono strettamente
		 * legati agli oggetti e alle classi nel paradigma orientato agli oggetti, riflettendo
		 * l'incapsulamento delle operazioni all'interno delle strutture di dati e enfatizzando
		 * l'interazione tra gli oggetti.
		 */
		
		faiPasta();
		cucinaPranzo("carne");
		int tot = addizione(102,3);
		System.out.println(tot);
	} 

	static void faiPasta() {
		System.out.println("Sto cucinando pasta");
	}
	
	static void cucinaPranzo(String cibo) {
		System.out.println("Sto cucinando " + cibo);
	}
	
	static int addizione(int a, int b) {
		int result = a+b;
		return result;
	}
	
}

class Overloaded_methods{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SU OVERLOADED METHODS
		 * Cosa sono
		 * Creiamo diversi metodi con numero di parametri differente
		 * Creiamo diversi metodi con tipi di dati differenti
		 * 
		 * L'overload è in Java la capacità di creare diversi metodi che hanno
		 * lo stesso nome ma una signature diversa (ovvero i parametri)
		 */
		
		int doppioInt = addizione(2,3);
		int triploInt = addizione(5, 12, 8);
		double doppioDouble = addizione(2.5, 7.4);
		
		System.out.println(doppioInt);
		System.out.println(triploInt);
		System.out.println(doppioDouble);
	}
	
	static int addizione(int a, int b) {
		int result = a + b;
		return result;
	}
	static double addizione(double a, double b) {
		double result = a + b;
		return result;
	}
	static int addizione(int a, int b, int c) {
		int result = a + b;
		return result;
	}
	
}

class Introduzione_OOP{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE DI INTRODUZIONE OOP (Object Oriented Programming)
		 * Cos'è la programmazione ad oggetti
		 * classi, metodi e attributi
		 * classe con file esterno
		 * cosa sono gli oggetti e le istanze di classe
		 * usare attributi e metodi
		 * Cos'è un costruttore
		 * 
		 * La programmazione a oggetti è un paradigma di programmazione che si basa sul concetto di oggetto.
		 * Gli oggetti sono rappresentazioni di entità del mondo reale e contengono dati e metodi che operano
		 * su questi dati. Questo approccio consente agli sviluppatori di organizzare il codice in modo più modulare,
		 * riutilizzabile e facile da mantenere.
		 * Ogni oggetto ha determinate caratteristiche, e ogni cosa del mondo reale è definibile come oggetto
		 * in un contesto di programmazione.
		 * 
		 * OGGETTI: Gli oggetti sono istanze di classi e rappresentano entità con caratteristiche specifiche.
		 * Ad esempio, una classe "Auto" potrebbe avere oggetti come "Ferrari" o "Toyota".
		 * 
		 * CLASSI: Una classe è un modello o un prototipo per creare oggetti.
		 * Definisce gli attributi (dati) e i metodi (comportamenti) che gli oggetti di quella classe avranno.
		 * 
		 * Cos'è un costruttore
		 * creiamone uno
		 * parola chiave this
		 * 
		 * Un costruttore è un metodo speciale di una classe che viene chiamato automaticamente quando si crea
		 * un nuovo oggetto di quella classe. Il suo scopo principale è inizializzare gli attributi dell'oggetto
		 * o eseguire altre operazioni necessarie prima che l'oggetto venga utilizzato.
		 * 
		 * I costruttori sono di solito dichiarati con lo stesso nome della classe e possono avere parametri
		 * o essere senza parametri. Se un costruttore è definito senza parametri, viene chiamato
		 * "costruttore senza argomenti". Se ha parametri, viene chiamato "costruttore con argomenti".
		 * Quando si crea un nuovo oggetto, il costruttore viene chiamato implicitamente.
		 * 
		 * Se si tenta di creare una nuova istanza di una classe senza specificare argomenti, e non è stato
		 * dichiarato esplicitamente alcun costruttore, allora Java aggiunge automaticamente un costruttore senza argomenti.
		 * 
		 * Se invece si è dichiarato esplicitamente almeno un costruttore (con o senza argomenti),
		 * il compilatore non aggiungerà automaticamente il costruttore senza argomenti.
		 * Quindi, se si tenta di creare un'istanza della classe senza specificare argomenti e non si ha
		 * un costruttore senza argomenti, si verificherà un errore di compilazione.
		 * 
		 * E' importante notare che in questi esempi si rende possibile l'accesso e la manipolazione diretta
		 * degli attributi, che ovviamente si vuole evitare.
		 * Si approfondisce questo aspetto (variabili private) in altre lezioni.
		 */
		
		Persona persona1 = new Persona("Luca", "Rossi", 25, "Blu");
		Persona persona2 = new Persona("Marco", "Verdi", 35, "Rosso");
		
		System.out.println(persona1.cognome);
		System.out.println(persona2.cognome);
		
		persona1.saluta();
		
		Prova personaProva = new Prova();
		System.out.println(personaProva.nome);
	}
	
}

class Scope_variabili{
	
	String nome;
	String cognome;
	int eta;
	
	Scope_variabili(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	Scope_variabili() {}
	
	/*
		 * LEZIONE SULLO SCOPE DELLE VARIABILI
		 * Cos'è lo scope di una variabile
		 * Scope locale
		 * Scope globale
		 * 
		 * Lo scope (ambito di visibilità) di una variabile determina dove la variabile
		 * può essere utilizzata all'interno di un programma.
		 * 
		 * Java definisce diversi livelli di scope per variabili, tra cui:
		 * 
		 * Scope di blocco (Block Scope): Le variabili definite all'interno di un blocco di codice sono visibili solo all'interno di quel blocco.
		 * Scope di metodo (Method Scope): Le variabili definite all'interno di un metodo sono visibili solo all'interno di quel metodo. 
		 * Scope di classe (Class Scope): Le variabili di istanza (campi di classe) sono visibili in tutta la classe.
		 * Scope di parametro: I parametri di un metodo sono visibili solo all'interno del corpo del metodo. 
		 * 
		 * Dal punto di vista di una classe, le variabili definite fuori dai metodi hanno scope globale,
		 * e quindi sono accessibili da ogni parte della classe;
		 * le variabii definite all'interno dei metodi hanno invece scope locale, limitato al metodo stesso.
	 */		
	
	void metodo() {
		System.out.println(this.nome);		//nome ed eta sono accessibili ovunque
		int stipendio = this.eta * 100;
		this.altroMetodo(stipendio);
	}
	
	void altroMetodo(int salario) {
//		System.out.println(stipendio);		//non posso farlo poiché stipendio ha scope limitato al corpo di metodo
		System.out.println(salario);
	}

	public static void main(String[] args) {
		Scope_variabili persona = new Scope_variabili("Luca", "Rossi", 25);
		persona.metodo();
	}
	
}

class Overloaded_constructors{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SU OVERLOADED CONSTRUCTORS
		 * Creare classe Pizza
		 * Creare multipli costruttori
		 */
		
		Pizza pizza1 = new Pizza("integreale", "pomodoro", "mozzarella", "ananas");
		Pizza pizz2 = new Pizza("5 cereali");
		Pizza pizza3 = new Pizza("normale", "pomdoro", "mozzarella");
	}
	
}

class Metodo_toString{
	
	public static void main(String[] args) {
		/*
		 * In Java, tutte le classi ereditano implicitamente dalla classe Object,
		 * e la classe Object ha un metodo toString() che restituisce una rappresentazione
		 * in formato stringa dell'oggetto, predefinita come il nome della classe, seguito da @
		 * e dall'hashcode dell'oggetto.
		 * 
		 * Quando si prova a ottenere il valore di una reference Java chiama implicitamente
		 * il metodo toString(): è pratica comune sovrascrivere il metodo toString() in una classe
		 * per ottenere una rappresentazione piu significativa e leggibile di un'istanza utilizzando
		 * la reference che punta ad essa
		 */

		Persona persona = new Persona("Luca", "Rossi", 25, "blu");
		System.out.println(persona);
	}
	
	static class Persona{
		String nome;
		String cognome;
		int eta;
		String colorePreferito;
		
		Persona(String nome, String cognome, int eta, String colorePreferito){
			this.nome = nome;
			this.cognome = cognome;
			this.eta = eta;
			this.colorePreferito = colorePreferito;
	    }
		
		public String toString() {
			String stringa = this.nome + "\n" + this.cognome + "\n" + this.eta + "\n" + this.colorePreferito;
			return stringa;
		}
	}
	
}

class Array_oggetti{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SU ARRAY DI OGGETTI
		 * creare array di tipo oggetto vuoto
		 * creare oggetti
		 * assegnare oggetti come elementi array
		 * accedere agli elementi
		 * inizializzare un array
		 */
		
		int[] numeri = new int[3];	//array di interi
		
		Persona[] persone = new Persona[3];
		
		Persona persona1 = new Persona("Luca", "Rossi", 25, "blu"); 
		Persona persona2 = new Persona("Marco", "Verdi", 35, "rosso");
		Persona persona3 = new Persona("Anna", "Neri", 23, "giallo");
		
		persone[0] = persona1;
		persone[1] = persona2;
		persone[2] = persona3;
		
		System.out.println(persone[1].nome);
		
		Persona[] persone2 = {persona1, persona2, persona3};
	}
	
}

class Oggetti_parametri{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SUL PASSAGGIO DI OGGETTI COME PARAMETRI
		 */
		Persona persona1 = new Persona("Luca", "Rossi");
		Persona persona2 = new Persona("Marco", "Verdi");
		
		persona1.saluta(persona2);
	}
	
	static class Persona{
		String nome;
		String cognome;
		
		Persona(String nome, String cognome){
			this.nome = nome;
			this.cognome = cognome;
	    }
		
		void saluta(Persona persona) {
			System.out.println("Ciao " + persona.nome + " sono " + this.nome);
		}
	}
	
}

class Final_static{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SULLE KEYWORD FINAL E STATIC
		 * (1) final indica una variabile che non può essere modificata nel corso del programma
		 * (2) static ci permette di rendere una variabile o un metodo unico per una classe e condiviso
		 *     da tutte le istanze; un metodo statico può accedere solo a variabili statiche.
		 */
		
		final int prova = 5;
//		prova = 10;		//genera un errore
		
		Persona persona1 = new Persona("Luca", "Rossi");
		Persona persona2 = new Persona("Marco", "Verdi");
		
		System.out.println("Numero persone: " + Persona.numeroPersone);
		Persona.mostraNumPersone();
	}
	
	static class Persona{
		String nome;
		String cognome;
		static int numeroPersone = 0;
		
		Persona(String nome, String cognome){
			this.nome = nome;
			this.cognome = cognome;
			numeroPersone++;
			System.out.println(numeroPersone);
	    }
		
		static void mostraNumPersone() {
			System.out.println("Il numero di persone è: " + numeroPersone);
		}
	}
	
}

class Ereditarieta{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SULL'EREDITARIETA'
		 * cos'è l'ereditarietà
		 * metodi e attributi aggiuntivi
		 * overriding dei metodi (@Override)
		 * costruttore classi figlie e super keyword
		 * 
		 * L'ereditarietà è un meccanismo che permette a una classe di derivare
		 * da un'altra classe ed ereditarne metodi e attributi
		 * 
		 * Ogni classe figlia avrà a disposizione quindi tutti i metodi e gli attributi
		 * ereditati piu tutti i suoi attributi e metodi aggiuntivi.
		 * 
		 * La keyword super è utilizzata, all'interno del costruttore di una sottoclasse (classe figlia),
		 * per invocare il costruttore della superclasse (classe padre).
		 *(in generale, permette di fare riferimento ai membri, attributi o metodi che siano, di una classe genitore:
		 * super.attributo = valore;	super.metodo();	).
		 * 
		 * Una sottoclasse eredita automaticamente tutti i costruttori della superclasse; se nel costruttore della sottoclasse
		 * non si invoca esplicitamente il costruttore da chiamare, Java invocherà automaticamente il costruttore di default
		 * (senza argomenti) della superclasse. Se la superclasse ha un costruttore con argomenti e non un costruttore di default
		 * (in questo caso Java non lo aggiunge automaticamente), allora nella sottoclasse deve essere specificato esplicitamente
		 * il costruttore da invocare altrimenti si verificherà un errore di compilazione.
		 * 
		 * Ovviamente, se nella superclasse vi è un costruttore di default, allora la sottoclasse può anche non definire
		 * un proprio costruttore poiché Java ne aggiungerà uno automaticamente, che automaticamente invocherà anche
		 * il costruttore di default della superclasse.
		 * 
		 * Attraverso l'override una classe figlia può sovrascrivere un metodo ereditato;
		 * utilizziamo la notazione @Override (non obbligatoria) per indicare che si sta
		 * sovrascrivendo un metodo che non è proprio della classe ma ereditato da una classe padre
		 */
		
		System.out.print("Persona: ");
		Persona persona1 = new Persona("Luca", "Rossi", 25, "blu");
		persona1.saluta();
		
		System.out.print("Studente: ");
		Studente studente1 = new Studente("Marco", "Verdi", 25, "informatica", "4B");
		studente1.saluta();
		System.out.println(studente1.nome);
		studente1.studia();
		System.out.println(studente1.materiaPreferita);
		
		System.out.print("Insegnante: ");
		Insegnante insegnante1 = new Insegnante("Edoardo", "Neri", 28, "informatica");
		insegnante1.saluta();
		insegnante1.insegna();
		System.out.println(insegnante1.materia);
	}
	
}

class Classi_astratte{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SULLE CLASSI ASTRATTE
		 * cosa sono?
		 * creare classe astratta veicolo
		 * creare classe figlia macchina
		 * metodi astratti
		 * 
		 * Le classi astratte sono classi che non possono essere utilizzate per creare oggetti,
		 * create affinché vengano esclusivamente ereditate da altre classi
		 * 
		 * Una classe astratta introduce metodi astratti, che sono metodi privi di implementazione (senza corpo).
		 * Questi metodi devono essere obbligatoriamente implementati, ossia sovrascritti,
		 * dalle sottoclassi che ereditano dalla classe astratta."
		 */
		
		Macchina macchina = new Macchina();
		macchina.muovi();
		macchina.frena();
	}
	
}

class Incapsulamento{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SU INCAPSULAMENTO
		 * L'incapsulamento è un processo con cui nascondiamo attributi di una classe all'esterno
		 * dichiarandoli come private; diventano accessibili solo tramite dei metodi (getters/setters)
		 * 
		 * creiamo classe persona
		 * aggiungiamo attributi private
		 * definiamo getters e setters
		 */
		
		Persona_encapsulated persona = new Persona_encapsulated("Luca", "Rossi");
		
//		System.out.println(persona.nome);	//non posso accedere direttamente a nome
		System.out.println("Nome: " + persona.getNome());
		
		System.out.println("Sto modificando il nome...");
		persona.setNome("Marco");
		
		System.out.println("Nome: " + persona.getNome());
	}
	
}

class Copiare_oggetti{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SUL COPIARE OGGETTI
		 * tramite metodo
		 * tramite costruttore
		 * 
		 * (Modificata classe Persona_encapsulated)
		 */
		
		Persona_encapsulated persona1 = new Persona_encapsulated("Luca", "Rossi");
		Persona_encapsulated persona2 = new Persona_encapsulated("Marco", "Verdi");
		
		/*
		 * Se faccio un assegnamento del tipo persona2 = persona1, non sto realmente copiando l'oggetto,
		 * ma sto facendo in modo che la reference persona2 punti allo stesso oggetto puntato dalla reference persona1:
		 * quindi le reference persona1 e persona2 punteranno alla stessa locazione di memoria.
		 */
		persona2 = persona1;			//persona1 e persona2 puntano allo stesso oggetto
		
		persona1.setNome("Edoardo");
		
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println();
		System.out.println(persona1.getNome());
		System.out.println(persona1.getCognome());
		System.out.println();
		System.out.println(persona2.getNome());
		System.out.println(persona2.getCognome());
		System.out.println();
		
		Persona_encapsulated persona3 = new Persona_encapsulated("Luca", "Rossi");
		Persona_encapsulated persona4 = new Persona_encapsulated("Marco", "Verdi");
	
		persona4.copy(persona3);				//sto utilizzando un metodo aggiunto nella classe Persona_encapsulated
		persona3.setNome("Edoardo");
		
		System.out.println(persona3);
		System.out.println(persona4);
		System.out.println();
		System.out.println(persona3.getNome());
		System.out.println(persona3.getCognome());
		System.out.println();
		System.out.println(persona4.getNome());
		System.out.println(persona4.getCognome());
		
		Persona_encapsulated persona5 = new Persona_encapsulated(persona3);		//sto utilizzando un costruttore aggiunto nella classe Persona_encapsulated
		System.out.println();
		System.out.println("Persona 5:");
		System.out.println(persona5.getNome());
		System.out.println(persona5.getCognome());
	}
	
}

class Interfacce{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SULLE INTERFACCE
		 * Le interfacce sono simili alle classi astratte, con la differenza che
		 * mentre una classe puo estendere solo un'altra classe, al contrario può
		 * implementare piu interfacce.
		 * 
		 * Mentre la classe astratta viene ereditata, e quindi dobbiamo implementare i metodi ereditati
		 * dalla classe astratta, le interfacce aggiungono funzionalità extra a una classe senza la relazione di "eredità".
		 * Potremmo ad esempio voler aggiungere delle funzionalità a un insieme di classi che non hanno alcuna correlazione tra loro.
		 * 
		 * create classi Leone, Gazzella, Pesce
		 * create interfacce Preda, Predatore
		 */
		
		Leone leone = new Leone();
		Gazzella gazzella = new Gazzella();
		
		leone.caccia();
		gazzella.scappa();
		
		Pesce pesce = new Pesce();
		pesce.scappa();
	}
	
}

class Polimorfismo{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SUL POLIMORFISMO
		 * Il polimorfismo è la capacità di un oggetto di identificarsi con piu tipi di dato.
		 * Essenzialmente un oggetto si collega quindi a piu tipi di dato.
		 */
		
		Studente studente1 = new Studente("Luca", "Rossi", 0, null, null);
		Studente studente2 = new Studente("Anna", "Neri", 0, null, null);
		Insegnante insegnante1 = new Insegnante("Marco", "Verdi", 0, null);
		
		/*
		 * Essendo le classi Studente e Insegnante derivate dalla classe Persona,
		 * il polimorfismo ci permette, ad esempio, di creare un array di tipo Persona che contiene
		 * oggetti di tipo Studente e di tipo Insegnante.
		 * 
		 * Ovviamente, dato che stiamo lavorando con il polimorfismo, possiamo utilizzare metodi solo se
		 * sono definiti nella classe Persona. Quindi nell'esempio:
		 * - utilizziamo il metodo saluta() definito in Persona e poi sovrascritto nelle classi Studente e Insegnante;
		 * - in sostanza, gli elementi dell'array cambiano forma a seconda del fatto che siano studenti o insegnanti
		 */
		
		Persona[] classe = {studente1, studente2, insegnante1};
		
		for(Persona persona: classe) {
			persona.saluta();
		}
	}
	
}

class Exception_handling{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SULLA GESTIONE DELLE EXCEPTION
		 * esempi con ArithmeticException e InputMismatchException
		 * try cath e finally
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Inserire primo numero");
			int x = scanner.nextInt();
			
			System.out.println("Inserire secondo numero");
			int y = scanner.nextInt();
			
			int result = x/y;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("non puoi dividere per 0");
		}catch(InputMismatchException e) {
			System.out.println("non puoi dividere un numero per una stringa");
		}catch(Exception e) {
			System.out.println("c'è stato un problema");
		}finally {				
			scanner.close();
		}
		/*
		 * Il blocco finally viene eseguito a prescindere, potremmo quindi specificarlo
		 * per operazioni che vogliamo siano eseguite a prescindere, sia se l'operazione è andata a buon fine
		 * sia se viene eseguita una catch; in questo caso ad esempio chiudiamo lo scanner aperto precedentemente.
		 * Come ulteriori esempi, potremmo utilizzarlo per chiudere un file usato nell'operazione o ad esempio
		 * per chiudere una connessione ad un database.
		*/
	}
	
}

class Usare_file{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SUI FILE
		 * importare java.io.file per creare oggetti di tipo File
		 * importare java.io.FileReader per creare oggetti di tipo FileReader
		 * importare java.io.FileWriter per creare oggetti di tipo FileWriter
		 * 
		 * Ovviamente bisogna importare anche tutte le eccezioni che vanno utilizzate:
		 * importare java.io.FileNotFoundException		PER LETTURA
		 * importare java.io.IOException 				PER LETTURA E SCRITTURA
		 * 
		 * verificare se file esiste nel progetto o nel computer
		 * getPath, getAbsolutePath, isFile
		 * eliminare file
		 * scrivere in un file con filewriter: write e append
		 * leggere un file con filereader
		 */
	
		File file = new File("prova.txt");		//crea un oggetto di tipo file
		
		if(file.exists()) {							
			System.out.println("Il file esiste");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		}else {
			System.out.println("Il file non esiste");
		}
		
		File cartella = new File("src");
		System.out.println(cartella.isFile());
		
		try {
			FileWriter writer = new FileWriter("prova.txt");
			writer.write("Ciao sono marco\nSto seguendo il corso di Java\nmi sto divertendo");
			writer.append("\nBellissimo file");
			writer.append("\nTesto aggiuntivo");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader reader = new FileReader("prova.txt");
			int data = reader.read();										//il reader legge un singolo carattere in formato ASCII
			while(data != -1) {												//se data è -1 allora non è nessun carattere ASCII
				System.out.print((char)data);								//stampo con print facendo il casting a char di ogni ASCII	
				data = reader.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

class Casting{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SUL CASTING
		 * Il casting è quel processo che modifica un tipo di dato
		 * Implicito: automatico quando passiamo ad un tipo piu ampio (int-->double, float-->double)
		 * Esplicito: manuale quando passiamo ad un tipo piu ristretto
		 */
		
		double x = 9;			//anche se gli assegno un int, Java effettua un casting implicito
		System.out.println(x);
		
		int y = (int) 9.5;		//casting esplicito da double a int
		System.out.println(y);
		
		/*
		 * Il casting implicito viene fatto automaticamente perché non vi è perdita di dati, mentre il casting esplicito
		 * va fatto manualmente poiché si passa da un tipo di dato con range piu ampio a un tipo di dato con range piu ristretto,
		 * e quindi si ha una perdita di dati.
		 */
	}
	
}

class Data_ora{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SU DATA/ORA
		 * data, ora, data e ora
		 * formattare date
		 * 
		 * importare java.time.LocalDate 					PER LA DATA
		 * importare java.time.LocalTime					PER L'ORA
		 * importare java.time.LocalDateTime 				PER DATA E ORA
		 * importare java.time.format.DateTimeFormatter 	PER FORMATTARE UNA DATA
		 */
		
		LocalDate data = LocalDate.now();
		System.out.println(data);
		
		LocalTime ora = LocalTime.now();
		System.out.println(ora);
		
		LocalDateTime dataOra = LocalDateTime.now();
		System.out.println(dataOra);
		
		DateTimeFormatter x = DateTimeFormatter.ofPattern("dd-MM-yyyy");	//formatto la data
		System.out.println(data.format(x));
		
		x = DateTimeFormatter.ofPattern("dd MMM yyyy");		//con tre M si ha il nome del mese
		System.out.println(data.format(x));
		
		x = DateTimeFormatter.ofPattern("dd MMMM yyyy");	//con quattro M si ha il nome intero del mese
		System.out.println(data.format(x));
		
		x = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");	//con la E si fa riferimento al nome del giorno e il funzionamento è analogo alle M 
		System.out.println(data.format(x));
	}
	
}

class Hashmap{
	
	public static void main(String[] args) {
		/*
		 * LEZIONE SULLE HASHMAP
		 * cosa sono
		 * crearne una
		 * aggiungere elementi
		 * accedere agli elementi
		 * rimuovere un elemento
		 * pulire hashmap
		 * 
		 * Le hashmap, a differenza delle ArrayList ci permettono di salavre
		 * gli elementi come coppie <chiave, valore>.
		 * 
		 * importare java.util.HashMap
		 */
		
		HashMap<String, String> capitali = new HashMap<String, String>();
		
		capitali.put("Italia", "Roma");
		capitali.put("Inghilterra", "Londra");
		capitali.put("Germania", "Berlino");
		capitali.put("Francia", "Parigi");
		
		System.out.println(capitali.get("Germania"));	//ottengo il valore associato alla chiave "Germania"
		System.out.println(capitali);					//ottengo la conformazione dell'intero hashmap
		
		capitali.remove("Francia");		//rimuovo l'element con chiave "Francia"
		System.out.println(capitali);
		
		capitali.clear();				//elimino tutti gli elementi dell'hashmap
		System.out.println(capitali);
	}
	
}

class Iteratori{
	
	public static void main(String[] args) {
		/*
		 * Un iteratore è un oggetto che cicla una collezione (ArrayList)
		 * 
		 * loop di un ArrayList
		 * rimuovere un elemento
		 * 
		 * importare java.util.Iterator
		 */
		
		ArrayList<String> persone = new ArrayList<String>();
		
		persone.add("Luca");
		persone.add("Marco");
		persone.add("Anna");
		persone.add("Paolo");
		
		Iterator<String> it = persone.iterator();
		
		System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		it = persone.iterator();	//rimetto it all'inizio dell'ArrayList
		
		while(it.hasNext()) {
			String persona = it.next();
			if(persona == "Anna") {
				System.out.println("Ho rimosso " + persona);
				it.remove();
			}
		}
		
		System.out.println(persone);
	}
	
}





