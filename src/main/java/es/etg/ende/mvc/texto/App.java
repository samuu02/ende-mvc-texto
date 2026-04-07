package es.etg.ende.mvc.texto;

import es.etg.ende.mvc.texto.controller.TextoControlador;
import es.etg.ende.mvc.texto.model.TextoModelo;
import es.etg.ende.mvc.texto.view.TextoVista;

public class App {
    public static void main(String[] args) {
        TextoModelo modelo = new TextoModelo();
        TextoVista vista = new TextoVista();
        TextoControlador controlador = new TextoControlador(modelo, vista);

        controlador.ejecutar();
    }
}