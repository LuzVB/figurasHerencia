/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherencia;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Luz
 */
public class Ventana extends javax.swing.JFrame {

    private String figura;
    private String color;
    private String coordenada1;
    private String coordenada2;
    private String coordenada3;
    private String coordenada4;
    private int coordenada1X, coordenada1Y;
    private int coordenada2X, coordenada2Y;
    private int coordenada3X, coordenada3Y;
    private int coordenada4X, coordenada4Y;

    /**
     * Creates new form ventana
     */
    public Ventana() {
        initComponents();
        coordenada4 = "0,0";
        //le da color a la ventana 
        //this.getContentPane().setBackground(Color.white);
    }

    /*cambiar por comentario luz:
     el metodo paint se sobreescribe de la clase JFrame
     para inicializar el plano cartesiano y hacer visible = false
     a los textFile
     */
    @Override
    public void paint(Graphics ventana) {
        //llamamos al constructor 
        super.paint(ventana);
        //Dibujamos una linea para el eje X y Y
        //Y
        ventana.drawLine(450, 80, 450, 500);
        //X
        ventana.drawLine(250, 290, 650, 290);
        //Dibujamos la escala de los ejes
        //X
        for (int i = 251; i < 650; i += 10) {
            ventana.drawLine(i, 285, i, 295);
        }
        //Y
        for (int i = 79; i < 500; i += 10) {
            ventana.drawLine(445, i, 455, i);
        }

        //Igualamos componentes visible a false
        lbCoordenadas.setVisible(false);
        lbNumero1.setVisible(false);
        lbNumero2.setVisible(false);
        lbNumero3.setVisible(false);
        lbNumero4.setVisible(false);
        tfCoordenada1.setVisible(false);
        tfCoordenada2.setVisible(false);
        tfCoordenada3.setVisible(false);
        tfCoordenada4.setVisible(false);
        taResultados.setVisible(false);
        panelInformacionFiguras.setVisible(false);
        btGraficar.setVisible(false);
    }

    // obtiene los datos ingresados en la parte grafica 
    private void obtenerDatos() {
        //Para traer el valor del menu desplegable
        figura = cbSeleccionFigura.getSelectedItem().toString();
        color = cbSeleccionColor.getSelectedItem().toString();
        coordenada1 = tfCoordenada1.getText();
        coordenada2 = tfCoordenada1.getText();
        coordenada3 = tfCoordenada1.getText();
        coordenada4 = tfCoordenada1.getText();

    }

    //obtiene las coordenadas en la forma x,y los separa para crear variables X y Y diferentes
    private void seperarCoordenadas() {
        String puntoX, puntoY;
        String[] separacion;

        obtenerDatos();

        separacion = coordenada1.split(",");
        puntoX = separacion[0];
        puntoY = separacion[1];
        coordenada1X = Integer.parseInt(puntoX);
        coordenada1Y = Integer.parseInt(puntoY);

        separacion = coordenada2.split(",");
        puntoX = separacion[0];
        puntoY = separacion[1];
        coordenada2X = Integer.parseInt(puntoX);
        coordenada2Y = Integer.parseInt(puntoY);

        separacion = coordenada3.split(",");
        puntoX = separacion[0];
        puntoY = separacion[1];
        coordenada3X = Integer.parseInt(puntoX);
        coordenada3Y = Integer.parseInt(puntoY);

        separacion = coordenada4.split(",");
        puntoX = separacion[0];
        puntoY = separacion[1];
        coordenada4X = Integer.parseInt(puntoX);
        coordenada4Y = Integer.parseInt(puntoY);
    }
    
    private boolean recibirVerificacion(){
        boolean poderGraficar = false;
       // seperarCoordenadas();
        switch (figura) {
            case "Cuadrado":
                Cuadrado cudradoVerificar = new Cuadrado(coordenada1X,coordenada1Y,coordenada2X,coordenada2Y,coordenada3X,coordenada3Y,coordenada4X,coordenada4Y);
                poderGraficar = cudradoVerificar.verificarCoordenadas();
                break;
            case "Rectangulo":
                Rectangulo rectanguloVerificar = new Rectangulo(coordenada1X,coordenada1Y,coordenada2X,coordenada2Y,coordenada3X,coordenada3Y,coordenada4X,coordenada4Y);
                poderGraficar = rectanguloVerificar.verificarCoordenadas();
                break;
            case "Triangulo":
                Triangulo trianguloVerificar = new Triangulo(coordenada1X,coordenada1Y,coordenada2X,coordenada2Y,coordenada3X,coordenada3Y);
                poderGraficar = trianguloVerificar.verificarCoordenadas();
                break;
            default:
                break;
        }
        //validar segun logica del cuadrado
        //System.out.print(poderGraficar);
        return poderGraficar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloVentana = new javax.swing.JLabel();
        lbSeleccionFigura = new javax.swing.JLabel();
        cbSeleccionFigura = new javax.swing.JComboBox();
        lbSeleccionColor = new javax.swing.JLabel();
        cbSeleccionColor = new javax.swing.JComboBox();
        lbCoordenadas = new javax.swing.JLabel();
        lbNumero1 = new javax.swing.JLabel();
        tfCoordenada1 = new javax.swing.JTextField();
        lbNumero2 = new javax.swing.JLabel();
        tfCoordenada2 = new javax.swing.JTextField();
        tfCoordenada3 = new javax.swing.JTextField();
        tfCoordenada4 = new javax.swing.JTextField();
        lbNumero3 = new javax.swing.JLabel();
        lbNumero4 = new javax.swing.JLabel();
        panelInformacionFiguras = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResultados = new javax.swing.JTextArea();
        btGraficar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloVentana.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        tituloVentana.setForeground(new java.awt.Color(0, 0, 255));
        tituloVentana.setText("Figuras Geometricas");

        lbSeleccionFigura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSeleccionFigura.setText("Seleccione una figura");

        cbSeleccionFigura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cuadrado", "Rectangulo", "Triangulo", " " }));
        cbSeleccionFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionFiguraActionPerformed(evt);
            }
        });

        lbSeleccionColor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSeleccionColor.setText("Seleccione un color ");

        cbSeleccionColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rojo ", "Amarrillo ", "Azul ", "Verde ", " " }));

        lbCoordenadas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCoordenadas.setText("Ingrese las coordenadas");

        lbNumero1.setText("1.");

        tfCoordenada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCoordenada1ActionPerformed(evt);
            }
        });

        lbNumero2.setText("2.");

        lbNumero3.setText("3.");

        lbNumero4.setText("4.");

        panelInformacionFiguras.setBackground(new java.awt.Color(204, 255, 204));

        taResultados.setColumns(20);
        taResultados.setRows(5);
        jScrollPane1.setViewportView(taResultados);

        javax.swing.GroupLayout panelInformacionFigurasLayout = new javax.swing.GroupLayout(panelInformacionFiguras);
        panelInformacionFiguras.setLayout(panelInformacionFigurasLayout);
        panelInformacionFigurasLayout.setHorizontalGroup(
            panelInformacionFigurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionFigurasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelInformacionFigurasLayout.setVerticalGroup(
            panelInformacionFigurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionFigurasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );

        btGraficar.setText("Graficar ");
        btGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGraficarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(tituloVentana))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbSeleccionFigura, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbSeleccionFigura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 253, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSeleccionColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSeleccionColor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCoordenadas)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbNumero1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfCoordenada1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbNumero2)
                                            .addComponent(lbNumero3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfCoordenada3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfCoordenada2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbNumero4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfCoordenada4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btGraficar)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInformacionFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloVentana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSeleccionFigura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSeleccionFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbSeleccionColor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSeleccionColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCoordenadas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumero1)
                    .addComponent(tfCoordenada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumero2)
                    .addComponent(tfCoordenada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCoordenada3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumero3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNumero4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCoordenada4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btGraficar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInformacionFiguras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbSeleccionFigura.getAccessibleContext().setAccessibleName("Seleccione una figura");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Accion al momento de seleccionar una figura
    //cambiar la visibilidad del panel al graficar 
    private void cbSeleccionFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionFiguraActionPerformed
        // TODO add your handling code here:
        obtenerDatos();
        switch (figura) {
            case "Cuadrado":
                lbCoordenadas.setVisible(true);
                lbNumero1.setVisible(true);
                lbNumero2.setVisible(true);
                lbNumero3.setVisible(true);
                lbNumero4.setVisible(true);
                tfCoordenada1.setVisible(true);
                tfCoordenada2.setVisible(true);
                tfCoordenada3.setVisible(true);
                tfCoordenada4.setVisible(true);
                taResultados.setVisible(true);
                taResultados.setEditable(false);
                btGraficar.setVisible(true);
                panelInformacionFiguras.setVisible(true);
                break;
            case "Rectangulo":
                lbCoordenadas.setVisible(true);
                lbNumero1.setVisible(true);
                lbNumero2.setVisible(true);
                lbNumero3.setVisible(true);
                lbNumero4.setVisible(true);
                tfCoordenada1.setVisible(true);
                tfCoordenada2.setVisible(true);
                tfCoordenada3.setVisible(true);
                tfCoordenada4.setVisible(true);
                taResultados.setVisible(true);
                taResultados.setEditable(false);
                btGraficar.setVisible(true);
                panelInformacionFiguras.setVisible(true);
                break;
            case "Triangulo":
                lbCoordenadas.setVisible(true);
                lbNumero1.setVisible(true);
                lbNumero2.setVisible(true);
                lbNumero3.setVisible(true);
                lbNumero4.setVisible(false);
                tfCoordenada1.setVisible(true);
                tfCoordenada2.setVisible(true);
                tfCoordenada3.setVisible(true);
                tfCoordenada4.setVisible(false);
                taResultados.setVisible(true);
                taResultados.setEditable(false);
                btGraficar.setVisible(true);
                panelInformacionFiguras.setVisible(true);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_cbSeleccionFiguraActionPerformed


    private void btGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGraficarActionPerformed
        // TODO add your handling code here:
        obtenerDatos();
        seperarCoordenadas();
        recibirVerificacion();
        
    }//GEN-LAST:event_btGraficarActionPerformed

    private void tfCoordenada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCoordenada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCoordenada1ActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGraficar;
    private javax.swing.JComboBox cbSeleccionColor;
    private javax.swing.JComboBox cbSeleccionFigura;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCoordenadas;
    private javax.swing.JLabel lbNumero1;
    private javax.swing.JLabel lbNumero2;
    private javax.swing.JLabel lbNumero3;
    private javax.swing.JLabel lbNumero4;
    private javax.swing.JLabel lbSeleccionColor;
    private javax.swing.JLabel lbSeleccionFigura;
    private javax.swing.JPanel panelInformacionFiguras;
    private javax.swing.JTextArea taResultados;
    private javax.swing.JTextField tfCoordenada1;
    private javax.swing.JTextField tfCoordenada2;
    private javax.swing.JTextField tfCoordenada3;
    private javax.swing.JTextField tfCoordenada4;
    private javax.swing.JLabel tituloVentana;
    // End of variables declaration//GEN-END:variables
}
