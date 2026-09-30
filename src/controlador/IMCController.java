package com.calculadora.imc.controller;

import com.calculadora.imc.model.CalculadoraIMC;
import com.calculadora.imc.view.VistaIMC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// implements ActionListener: obliga a definir actionPerformed más abajo.
// Es lo que permite que esta clase "escuche" el clic del botón
public class IMCController implements ActionListener {

    // final: una vez asignados en el constructor, no se reasignan
    private final CalculadoraIMC calculadora;
    private final VistaIMC vista;

    public IMCController(VistaIMC vista) {
        this.calculadora = null;
        this.vista = vista;
    }

    // Se llama desde App para mostrar la ventana ya conectada
    public void iniciar() {
    }

    // Método exigido por ActionListener. Swing lo llama solo cuando
    // se pulsa btnCalcular (una vez enlazado con addActionListener)
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    // Método propio, no de Swing: aquí irá la lógica de leer los
    // campos, validar, llamar al modelo y actualizar la vista
    private void calcularIMC() {
    }
}
