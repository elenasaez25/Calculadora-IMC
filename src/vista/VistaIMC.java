package com.calculadora.imc.view;
/**
 * @author Elena Sáez Lascurain
 */

// Extiende JFrame: esta clase ES una ventana, no solo la contiene
public class VistaIMC extends JFrame {

    public VistaIMC() {
        initComponents(); //crea y coloca los componentes (lo genera Matisse)
        pack(); //ajusta la ventana al tamaño de sus componentes
        setLocationRelativeTo(null); //la centra en la pantalla
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
}
