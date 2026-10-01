package com.calculadora.imc.controller;

/**
 * @author Elena Sáez Lascurain
 */

import com.calculadora.imc.model.CalculadoraIMC;
import com.calculadora.imc.view.VistaIMC;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

// implements ActionListener: obliga a definir actionPerformed más abajo.
// Es lo que permite que esta clase "escuche" el clic del botón
public class IMCController implements ActionListener {

    // final: una vez asignados en el constructor, no se reasignan
    private final CalculadoraIMC calculadora = new CalculadoraIMC();
    private final VistaIMC vista;
    private final JTextField txtPeso;
    private final JTextField txtAltura;
    private final JButton btnCalcular;
    private final JLabel lblResultado;
    private final JLabel lblClasificacion;


    public IMCController(VistaIMC vista) {
        this.vista = vista;
        this.txtPeso = vista.getTxtPeso();
        this.txtAltura = vista.getTxtAltura();
        this.btnCalcular = vista.getBtnCalcular();
        this.lblResultado = vista.getLblResultado();
        this.lblClasificacion = vista.getLblClasificacion();

        btnCalcular.addActionListener(this);
    }

    // Se llama desde App para mostrar la ventana ya conectada
    public void iniciar() {
        vista.setVisible(true);
    }

    // Método exigido por ActionListener. Swing lo llama solo cuando
    // se pulsa btnCalcular (una vez enlazado con addActionListener)
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            calcularIMC();
        }
    }

    // Método propio, no de Swing: aquí irá la lógica de leer los
    // campos, validar, llamar al modelo y actualizar la vista
    private void calcularIMC() {
        String textoPeso,textoAltura;
        double peso,altura;

        textoPeso = txtPeso.getText().trim();
        textoAltura = txtAltura.getText().trim();

        try {
            peso = Double.parseDouble(textoPeso.replace(',', '.'));
            altura = Double.parseDouble(textoAltura.replace(',', '.'));
        } catch (NumberFormatException nfe) {
            mostrarError("Error: Introduce solo números válidos");
            return;
        }

        if (peso <= 0 || altura <= 0) {
            mostrarError("Error: Peso y altura deben ser mayores que 0");
            return;
        }
        
        if (altura > 3) {
            mostrarError("Error: La altura debe ir en metros (ej. 1,75)");
            return;
        }

        double imc = calculadora.calcular(peso, altura);
        String clasificacion = calculadora.clasificar(imc);

        lblResultado.setText(String.format("Tu IMC es: %.2f", imc));
        lblClasificacion.setText("Clasificación: " + clasificacion);
        lblClasificacion.setForeground(colorPara(clasificacion));
    }
    
    private void mostrarError(String mensaje) {
    lblResultado.setText("");
    lblClasificacion.setText(mensaje);
    lblClasificacion.setForeground(Color.RED);
    }

    private Color colorPara(String clasificacion) {
        switch (clasificacion) {
            case "Peso Normal":
                return new Color(0, 128, 0);
            case "Bajo Peso":
            case "Sobrepeso":
                return new Color(255, 140, 0);
            default:
                return Color.RED;
        }   
    }
}
