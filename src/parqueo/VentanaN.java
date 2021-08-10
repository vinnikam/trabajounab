/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueo;

import javax.swing.JFrame;

/**
 *
 * @author Vinni
 */
public class VentanaN extends JFrame {

    private javax.swing.JButton btAddMoto;
    private javax.swing.JButton btAddCarro;
    private javax.swing.JButton btRetVeh;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField cjPlaca;

    public VentanaN() {
        this.iniciar();
    }

    private void iniciar() {
        jLabel1 = new javax.swing.JLabel();
        cjPlaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btAddMoto = new javax.swing.JButton();
        btAddCarro = new javax.swing.JButton();
        btRetVeh = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("PARQUEADERO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 20, 150, 30);

        
        getContentPane().add(cjPlaca);
        cjPlaca.setBounds(180, 80, 100, 30);

        jLabel2.setText("PLACA :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 80, 50, 20);

        btAddMoto.setText("ADICIONAR MOTO");
        getContentPane().add(btAddMoto);
        btAddMoto.setBounds(340, 63, 160, 30);

        btAddCarro.setText("ADICIONAR CARRO");
        getContentPane().add(btAddCarro);
        btAddCarro.setBounds(340, 103, 160, 30);

        btRetVeh.setText("RETIRAR VEHICULO");
        getContentPane().add(btRetVeh);
        btRetVeh.setBounds(340, 140, 160, 30);

        btSalir.setText("SALIR");
        getContentPane().add(btSalir);
        btSalir.setBounds(401, 330, 100, 23);

        jLabel3.setText("CUPOS DISPONIBLES CARROS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 300, 200, 14);

        jLabel4.setText("CUPOS DISPONIBLES MOTOS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 320, 200, 14);

        jLabel5.setText("18");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 300, 20, 14);

        jLabel6.setText("10");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(250, 320, 20, 14);

        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        btAddMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddMotoActionPerformed(evt);
            }
        });
        btAddCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCarroActionPerformed(evt);
            }
        });
        btRetVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetVehActionPerformed(evt);
            }
        });
        
        
        
        setSize(new java.awt.Dimension(559, 408));
        setLocationRelativeTo(null);
    }
    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.salir();
    }                                       

    private void btAddMotoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.addMoto();
    }                                         

    private void btAddCarroActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.addCarro();
    }                                          

    private void btRetVehActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.salidaVehiculo();
    }    
    private void salir(){
        
    }
    private void addMoto(){
        
    }
    private void addCarro(){
        
    }
    private void salidaVehiculo(){
        
    }
    
    public static void main(String[] args) {
        VentanaN v = new VentanaN();
        v.setVisible(true);
    }

}
