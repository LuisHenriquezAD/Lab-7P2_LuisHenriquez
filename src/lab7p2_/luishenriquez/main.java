/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_.luishenriquez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUIS HENRIQUEZ
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        marcas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        marcaCarro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        anios = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        colors = new javax.swing.JTextField();
        precioventas = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        modelos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_1 = new javax.swing.JTextArea();
        listar = new javax.swing.JButton();
        abrir = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        CREAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        marcas.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Agregar un vehiculo a la lista");

        jLabel8.setText("Ingrese el color del vehiculo");

        jLabel1.setText("Anos del vehiculo");

        anios.setValue(20);

        jLabel9.setText("Ingrese la marca");

        colors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorsActionPerformed(evt);
            }
        });

        precioventas.setValue(20);

        jLabel3.setText("Ingrese el precio del vehiculo");

        guardar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        guardar.setText("GUARDAR");
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });

        modelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelosActionPerformed(evt);
            }
        });

        jLabel10.setText("Ingrese el modelo del vehiculo");

        ta_1.setColumns(20);
        ta_1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ta_1.setRows(5);
        jScrollPane1.setViewportView(ta_1);

        listar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        listar.setText("LISTAR");
        listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarMouseClicked(evt);
            }
        });
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        abrir.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        abrir.setText("ABRIR");
        abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirMouseClicked(evt);
            }
        });

        MODIFICAR.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        MODIFICAR.setText("MODIFICAR");
        MODIFICAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MODIFICARMouseClicked(evt);
            }
        });

        CREAR.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        CREAR.setText("CREAR");
        CREAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CREARMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout marcasLayout = new javax.swing.GroupLayout(marcas);
        marcas.setLayout(marcasLayout);
        marcasLayout.setHorizontalGroup(
            marcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marcasLayout.createSequentialGroup()
                .addGroup(marcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, marcasLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(listar)
                        .addGap(72, 72, 72)
                        .addComponent(abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CREAR, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(MODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(marcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(marcasLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(colors, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(precioventas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(marcasLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(marcasLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(marcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(marcasLayout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(modelos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(marcasLayout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(marcaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(anios, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(marcasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        marcasLayout.setVerticalGroup(
            marcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marcasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(marcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(marcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(marcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(colors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(marcasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CREAR, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        jTabbedPane1.addTab("Empresa de vehiculos recios", marcas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorsActionPerformed

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter(
                        "Archivos de Texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;

        ArrayList<Object> lista = new ArrayList<Object>();

        String marca = " ";

        marca = marcaCarro.getText();

        String color = colors.getText();

        String modelo = modelos.getText();

        int anio = Integer.parseInt(anios.getValue().toString());

        int precio = Integer.parseInt(precioventas.getValue().toString());

        lista.add(new VEHICULO(marca, color, modelo, anio, precio));

        String total = "[" + "\n";

        for (Object dato : lista) {
            total += dato;
        }

        total += "\n";
        total += "]" + "\n";

        int dia = 1;
        String totaldias = "Dia" + "\n";
        totaldias += "Venta" + dia;
        totaldias += "[" + "\n";

        for (Object dato : lista) {
            totaldias += dato;
        }

        totaldias += "\n";
        totaldias += "]" + "\n";

        marcaCarro.setText("");
        colors.setText("");
        modelos.setText("");
        anios.setValue(0);
        precioventas.setValue(0);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {

                File fichero = null;
                if (jfc.getFileFilter().getDescription().equals(
                        "Archivos de Texto")) {
                    fichero
                            = new File(jfc.getSelectedFile().getPath() + ".txt");
                } else {
                    fichero = jfc.getSelectedFile();
                }
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);
                bw.write(total);
                bw.flush();
                JOptionPane.showMessageDialog(this,
                        "Archivo guardado exitosamente");

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        }//fin IF

        total = "";
        
    
        dias ++;
        
        JOptionPane.showMessageDialog(this,
                   "Esta en el dia : " +dias+" cuando llegue al dia 4 tendra que guardar un archivo con todos datos");
        
        if (dias == 2) {
            
                JFileChooser JF = new JFileChooser();
        FileNameExtensionFilter filtroS
                = new FileNameExtensionFilter(
                        "Archivos de Texto", "txt");
        
        JF.addChoosableFileFilter(filtroS);
        
        int selecciones = JF.showSaveDialog(this);
        FileWriter FW = null;
        BufferedWriter BW = null;
            
            if (selecciones == JFileChooser.APPROVE_OPTION) {
                try {

                    File fichero = null;
                    if (JF.getFileFilter().getDescription().equals(
                            "Archivos de Texto")) {
                        fichero
                                = new File(JF.getSelectedFile().getPath() + ".txt");
                    } else {
                        fichero = JF.getSelectedFile();
                    }
                    FW = new FileWriter(fichero);
                    BW = new BufferedWriter(fw);
                    BW.write(totaldias);
                    BW.flush();
                    JOptionPane.showMessageDialog(this,
                            "Archivo guardado exitosamente");

                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    BW.close();
                    FW.close();
                } catch (IOException ex) {
                }
            }//fin IF
            totaldias = "";
            dias = 0;
        }

    }//GEN-LAST:event_guardarMouseClicked

    private void modelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelosActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarActionPerformed

    private void listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarMouseClicked
       // TODO add your handling code here:
        ta_1.setText("");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(
                JFileChooser.DIRECTORIES_ONLY);
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File dir = fileChooser.getSelectedFile();
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    ta_1.append("Directorio:" + file.getName() + "\n");
                }
                if (file.isFile()) {
                    ta_1.append("Archivo:" + file.getName() + "\n");
                }
            }
        }
    }//GEN-LAST:event_listarMouseClicked

    private void abrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirMouseClicked
         // TODO add your handling code here:
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        ta_1.setText("");
        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro = 
                    new FileNameExtensionFilter(
                            "Archivos de Texto", "txt");
            FileNameExtensionFilter filtro2 = 
                new FileNameExtensionFilter(
                        "Imagenes", "jpg", "png", "bmp");
            jfc.setFileFilter(filtro);
            jfc.addChoosableFileFilter(filtro2);            
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION)
            {
               fichero = jfc.getSelectedFile();
               fr = new FileReader(fichero);
               br=new BufferedReader(fr);
               String linea;
               ta_1.setText("");
               while(  (linea=br.readLine()) !=null  ){                    
                    ta_1.append(linea);
                    ta_1.append("\n");
                }
            } //fin if
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_abrirMouseClicked

    private void MODIFICARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFICARMouseClicked
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = 
                    new FileNameExtensionFilter(
                            "Archivos de Texto", "txt");
         jfc.addChoosableFileFilter(filtro); 
        int seleccion = jfc.showSaveDialog(this);        
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
             try {
                 
                  File fichero=null;
                if (jfc.getFileFilter().getDescription().equals(
                        "Archivos de Texto")) {
                    fichero = 
                        new File(jfc.getSelectedFile().getPath()+".txt");
                }else{
                    fichero = jfc.getSelectedFile();
                }                             
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);
                bw.write(ta_1.getText());
                ta_1.setText("");
                bw.flush();         
                JOptionPane.showMessageDialog(this, 
                        "Archivo guardado exitosamente");  
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
           }                     
        }//fin IF
    }//GEN-LAST:event_MODIFICARMouseClicked

    private void CREARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CREARMouseClicked
               JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File dir = fileChooser.getSelectedFile();
            boolean fueCreado = dir.mkdir();
            if (fueCreado) {
                JOptionPane.showMessageDialog(this,
                        "Directorio Creado exitosamente");
            } else {
                JOptionPane.showMessageDialog(this,
                        "El directorio no fue creado");
            }
        }
    }//GEN-LAST:event_CREARMouseClicked

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CREAR;
    private javax.swing.JButton MODIFICAR;
    private javax.swing.JButton abrir;
    private javax.swing.JSpinner anios;
    private javax.swing.JTextField colors;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton listar;
    private javax.swing.JTextField marcaCarro;
    private javax.swing.JPanel marcas;
    private javax.swing.JTextField modelos;
    private javax.swing.JSpinner precioventas;
    private javax.swing.JTextArea ta_1;
    // End of variables declaration//GEN-END:variables
private int dias = 0;
}
