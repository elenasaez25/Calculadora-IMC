package com.calculadora.imc.main;

// Punto de entrada del programa: aquí empieza a ejecutarse la aplicación
public class App {
    public static void main(String[] args) {
        VistaIMC vista;
        IMCController controlador;

        vista = new VistaIMC();
        controlador = new IMCController(vista);
        
        controlador.iniciar();
    }
}
