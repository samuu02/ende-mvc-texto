package es.etg.ende.mvc.texto.controller;

import es.etg.ende.mvc.texto.model.TextoModelo;
import es.etg.ende.mvc.texto.view.TextoVista;

public class TextoControlador {
    
    private TextoModelo modelo;
    private TextoVista vista;

    public TextoControlador(TextoModelo modelo, TextoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        String texto = vista.solicitarTexto();
        String resultado = modelo.transformarAMayusculas(texto);
        vista.mostrarResultado(resultado);
    }
}
