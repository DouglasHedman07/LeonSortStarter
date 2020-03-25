package edu.ujcv.progra1;
import java.util.Scanner;
public class LectorDeArreglos {
    private Scanner scanner;
    private static LectorDeArreglos instance;

    public LectorDeArreglos(){
        scanner = new Scanner(System.in);
    }
    public static LectorDeArreglos getInstance(){
        if (instance == null){
            instance = new LectorDeArreglos();
        }
        return instance;
    }
    public int leerTamano(String Mensaje, String Reintento){
        System.out.println(Mensaje);
        do {
            if (scanner.hasNextInt()){
                return scanner.nextInt();
            }
            scanner.next();
            System.out.println(Reintento);
        }while (true);
    }
}

