package es.etg.ende.mvc.texto.view;

import java.util.Scanner;

public class TextoVista {
    
    private Scanner scanner = new Scanner(System.in);

    public String solicitarTexto() {
        System.out.print("Introduce un texto: ");
        return scanner.nextLine();
    }

    public void mostrarResultado(String resultado) {
        System.out.println("Resultado: " + resultado);
    }
}
