package ToDoListe;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ToDoListe {
   public static ArrayList <String> aufgabe = new ArrayList <>();
    String macht;
    LocalDateTime now = LocalDateTime.now();

    public ToDoListe(String macht) {
        this.macht = macht;
    }


    @Override
    public String toString() {
        return "ToDoListe{" +
                "aufgabe=" + aufgabe +
                ", macht='" + macht + '\'' +
                ", now=" + now +
                '}';
    }
}
