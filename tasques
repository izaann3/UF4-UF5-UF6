package tasques;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Tasques{
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int opcio;

        while(opcio != 6) {
            System.out.println("Selecciona la opcion del menu que deseas hacer");
            System.out.println("1 - Afegir una nova tasca");
            System.out.println("2 - Marcar una tasca com a completada");
            System.out.println("3 - Esborrar una tasca");
            System.out.println("4 - Mostrar totes les tasques");
            System.out.println("5 - Mostrar les tasques per prioritat (baixa, mitjana o alta)");
            System.out.println("6 - Sortir del programa");
            System.out.print("Opcio: ");
            opcio = scanner.nextInt();               
        }

        return opcio; 
    }
}

class Principal{
    public static void Main(String[] args) {
        Tasques tasques = new Tasques();
        tasques.menu();
    }
}
