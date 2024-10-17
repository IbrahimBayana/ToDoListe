package ToDoListe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ToDoListe toDo = new ToDoListe("tue");

        Scanner sc = new Scanner(System.in);
while (true){
    System.out.println(/*"Meine Aufgabe muss ich täglich erledigen." +
            "1. Früh aufwachen." +
            "2. Etwas vorbereiten für Frühstück." +
            "3. Anziehen." +
            "4. Computer öffnen und zuk Unterricht beteiligen." +
            "5. Ich gehe Zum Supermarkt , um Etwas zu kaufen."
            "6. Am Abend muss ich Aufgaben fertigen, falls ich sie habe. "
            */
            "1. Bitte geben Sie eine Augabe : \n" +
                    "2. Ausdruck Liste : \n" +
                    "3.Beendet das Program! \n"
            );



    System.out.println("Wählen Sie ein Nummer : ");

    switch (sc.nextInt()){
        case 1:
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Bitte geben Sie eine Aufgabe : ");
            String MeineAufgabe = sc1.nextLine();
            ToDoListe.aufgabe.add(MeineAufgabe);
            System.out.println();
            System.out.println();
            System.out.println();
            break;

        case 2:
        for(String tmp : ToDoListe.aufgabe ) {
            System.out.println(tmp);
        }
        break;
        case 3:
            System.out.println("Wiedersehen!");
            System.exit(3);


        default:
            System.out.println("Das ist ungültig!");

        }

    }


}


    }

