package com.calculadora.imc.view;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

// Extiende JFrame: esta clase ES una ventana, no solo la contiene
public class VistaIMC extends JFrame {

    public VistaIMC() {
        initComponents(); // Crea y coloca los componentes (lo genera Matisse)
    }

    // Getters: el controlador no puede tocar los componentes directamente
    // (son private), así que los pide a través de estos métodos:
    public JTextField getTxtPeso() {
        return txtPeso;
    }

    public JTextField getTxtAltura() {
        return txtAltura;
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public JLabel getLblResultado() {
        return lblResultado;
    }

    public JLabel getLblClasificacion() {
        return lblClasificacion;
    }

    private void initComponents() {
        // Generado por el diseñador de NetBeans (Matisse).
        // No se edita a mano: se sobrescribe cada vez que guardas en Design
    }

    private JTextField txtPeso;
    private JTextField txtAltura;
    private JButton btnCalcular;
    private JLabel lblResultado;
    private JLabel lblClasificacion;
}
