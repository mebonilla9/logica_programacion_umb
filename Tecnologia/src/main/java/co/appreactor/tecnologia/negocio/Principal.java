/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.tecnologia.negocio;

import co.appreactor.tecnologia.modelo.archivos.ArchivoUtil;
import co.appreactor.tecnologia.modelo.entidades.Computador;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal extends javax.swing.JFrame {

    private List<Computador> listaComputadores;
    private String rutaImagenActual;
    private ItemListener cambioConsultar;

    /**
     * Creates new form Principal
     */
    public Principal() {
        try {
            if (System.getProperty("os.name").equals("Mac OS X")) {
                System.setProperty("apple.laf.useScreenMenuBar", "true");
                System.setProperty("com.apple.mrj.application.apple.menu.about.name", "WikiTeX");
            }
            initComponents();
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.listaComputadores = new ArchivoUtil().leerComputadores();
            asignarGrupo();
            cargarComboConsultar();
        } catch (IOException e) {
            e.printStackTrace(System.err);
            this.listaComputadores = new ArrayList<>();
        }
    }

    private void asignarGrupo() {
        rbgProcesador.add(rbAmd);
        rbgProcesador.add(rbIntel);

        rbgRam.add(rbCuatroGb);
        rbgRam.add(rbOchoGb);
        rbgRam.add(rbDiecisesGb);
    }

    private void cargarComboConsultar() {

        DefaultComboBoxModel<Computador> listaCbo = new DefaultComboBoxModel();
        listaCbo.addElement(new Computador());
        for (Computador computador : listaComputadores) {
            listaCbo.addElement(computador);
        }
        cboListaComputadores.setModel(listaCbo);
        cambioConsultar = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (cboListaComputadores.getSelectedIndex() <= 0) {
                    limpiar();
                    return;
                }
                Computador cp = (Computador) cboListaComputadores.getSelectedItem();
                cargarComputador(cp);
            }
        };
        cboListaComputadores.addItemListener(cambioConsultar);
    }

    private void cargarComputador(Computador compu) {
        txtSerial.setText(String.valueOf(compu.getSerial()));
        cboMarca.setSelectedItem(compu.getMarca());
        if (compu.getProcesador().equals("AMD")) {
            rbAmd.setSelected(true);
        } else {
            rbIntel.setSelected(true);
        }
        cboDisco.setSelectedItem(compu.getDisco());
        cbxCamara.setSelected(compu.isCamara());
        cbxCd.setSelected(compu.isCd());
        cbxMaletin.setSelected(compu.isMaletin());
        if (compu.getDisco().startsWith("4")) {
            rbCuatroGb.setSelected(true);
        } else if (compu.getDisco().startsWith("8")) {
            rbOchoGb.setSelected(true);
        } else {
            rbDiecisesGb.setSelected(true);
        }
        ImageIcon imagenOriginal = new ImageIcon(compu.getRutaImagen());
        imgImagen.setIcon(new ImageIcon(imagenOriginal.getImage().getScaledInstance(imgImagen.getWidth(), imgImagen.getHeight(), Image.SCALE_SMOOTH)));

    }

    private boolean validarFormulario() {
        String mensaje = "";
        boolean valido = true;
        if (txtSerial.getText().length() < 9) {
            mensaje += "Debe ingresar un numero de serial valido de mas de 9 digitos\n";
            valido = false;
        }
        if (!rbAmd.isSelected() && !rbIntel.isSelected()) {
            mensaje += "Debe Seleccionar un tipo de procesador\n";
            valido = false;
        }
        if (cboMarca.getSelectedIndex() < 1) {
            mensaje += "Debe seleccionar una marca del equipo\n";
            valido = false;
        }
        if (cboDisco.getSelectedIndex() < 1) {
            mensaje += "Debe seleccionar una Disco para el computador\n";
            valido = false;
        }
        if (!rbAmd.isSelected() && !rbIntel.isSelected()) {
            mensaje += "Debe Seleccionar un tipo de procesador\n";
            valido = false;
        }
        if (!rbCuatroGb.isSelected() && !rbOchoGb.isSelected() && !rbDiecisesGb.isSelected()) {
            mensaje += "Debe Seleccionar un tamaño de memoria al procesador\n";
            valido = false;
        }
        if (!valido) {
            JOptionPane.showMessageDialog(rootPane, mensaje, "Error en el registro del formulario", JOptionPane.ERROR_MESSAGE);
        }
        return valido;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgProcesador = new javax.swing.ButtonGroup();
        rbgRam = new javax.swing.ButtonGroup();
        plHeader = new javax.swing.JPanel();
        cboListaComputadores = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSerial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboMarca = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        rbAmd = new javax.swing.JRadioButton();
        rbIntel = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cboDisco = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        cbxCamara = new javax.swing.JCheckBox();
        cbxCd = new javax.swing.JCheckBox();
        cbxMaletin = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        rbCuatroGb = new javax.swing.JRadioButton();
        rbOchoGb = new javax.swing.JRadioButton();
        rbDiecisesGb = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        imgImagen = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        plHeader.setBackground(new java.awt.Color(13, 186, 238));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buscar");

        javax.swing.GroupLayout plHeaderLayout = new javax.swing.GroupLayout(plHeader);
        plHeader.setLayout(plHeaderLayout);
        plHeaderLayout.setHorizontalGroup(
            plHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(plHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboListaComputadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        plHeaderLayout.setVerticalGroup(
            plHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboListaComputadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Caracteristicas"));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Serial:");

        jLabel3.setText("Marca");

        cboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Apple", "Asus", "Hp", "Lenovo", "Sony" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSerial)
                    .addComponent(cboMarca, 0, 133, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Procesador"));

        rbAmd.setText("AMD");

        rbIntel.setText("Intel");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAmd)
                    .addComponent(rbIntel))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAmd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbIntel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Disco Duro:");

        cboDisco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "64 GigaBytes", "128 GigaBytes", "256 GigaBytes", "512 GigaBytes" }));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Accesorios"));

        cbxCamara.setText("Cámara");

        cbxCd.setText("Cd-Rom");

        cbxMaletin.setText("Maletín");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxCamara)
                    .addComponent(cbxCd)
                    .addComponent(cbxMaletin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxCamara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxCd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxMaletin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("RAM"));

        rbCuatroGb.setText("4 GigaBytes");

        rbOchoGb.setText("8 GigaBytes");

        rbDiecisesGb.setText("16 GigaBytes");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCuatroGb)
                    .addComponent(rbOchoGb)
                    .addComponent(rbDiecisesGb))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(rbCuatroGb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOchoGb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbDiecisesGb)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnCargar.setText("Cargar Foto");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(plHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCargar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnListar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        JFileChooser archivador = new JFileChooser(System.getProperty("user.home") + File.separator + "Pictures");
        archivador.setDialogTitle("Seleccione una imagen");
        archivador.setAcceptAllFileFilterUsed(false);
        archivador.addChoosableFileFilter(new FileNameExtensionFilter("PNG and JPG images", "png", "jpg", "jpeg"));
        String rutaImagen = "";
        switch (archivador.showOpenDialog(this)) {
            case JFileChooser.APPROVE_OPTION:
                rutaImagen = archivador.getSelectedFile().getAbsolutePath();
                rutaImagenActual = rutaImagen;
                ImageIcon imagenOriginal = new ImageIcon(rutaImagen);
                //Image imagenScale = imagenOriginal.getImage();
                //Image imagenEscalada = imagenScale.getScaledInstance(imgImagen.getWidth(), imgImagen.getHeight(), Image.SCALE_SMOOTH);
                imgImagen.setIcon(new ImageIcon(imagenOriginal.getImage().getScaledInstance(imgImagen.getWidth(), imgImagen.getHeight(), Image.SCALE_SMOOTH)));
                //imgImagen.repaint();
                break;
            case JFileChooser.CANCEL_OPTION:
                JOptionPane.showMessageDialog(rootPane, "Operación cancelada", "Cargar Imagen", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if (!this.validarFormulario()) {
                return;
            }
            Computador cp = new Computador();
            cp.setSerial(txtSerial.getText());
            cp.setMarca(cboMarca.getSelectedItem().toString());
            cp.setProcesador(obtenerValorProcesador());
            cp.setDisco(cboDisco.getSelectedItem().toString());
            cp.setCamara(cbxCamara.isSelected());
            cp.setCd(cbxCd.isSelected());
            cp.setMaletin(cbxMaletin.isSelected());
            cp.setMemoriaRam(obtenerMemoriaRam());
            cp.setRutaImagen(rutaImagenActual);
            getListaComputadores().add(cp);
            new ArchivoUtil().escribirComputadores(this.listaComputadores);
            JOptionPane.showMessageDialog(rootPane, "Registro de equipo", "Equipo insertado correctamente", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
            cargarComboConsultar();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        new TablaDatos(this, false, this).setVisible(true);
    }//GEN-LAST:event_btnListarActionPerformed

    private String obtenerValorProcesador() {
        if (rbAmd.isSelected()) {
            return rbAmd.getText();
        } else {
            return rbIntel.getText();
        }
    }

    private String obtenerMemoriaRam() {
        if (rbCuatroGb.isSelected()) {
            return rbCuatroGb.getText();
        } else if (rbOchoGb.isSelected()) {
            return rbOchoGb.getText();
        } else {
            return rbDiecisesGb.getText();
        }
    }

    public void limpiar() {
        if (cboListaComputadores.getSelectedIndex() > 0) {
            cboListaComputadores.setSelectedIndex(0);
        }
        txtSerial.setText("");
        cboMarca.setSelectedIndex(0);
        rbgProcesador.clearSelection();
        cboDisco.setSelectedIndex(0);
        rbgRam.clearSelection();
        cbxCamara.setSelected(false);
        cbxCd.setSelected(false);
        cbxMaletin.setSelected(false);
        rutaImagenActual = "";
        imgImagen.setIcon(null);
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JComboBox<String> cboDisco;
    private javax.swing.JComboBox<Computador> cboListaComputadores;
    private javax.swing.JComboBox<String> cboMarca;
    private javax.swing.JCheckBox cbxCamara;
    private javax.swing.JCheckBox cbxCd;
    private javax.swing.JCheckBox cbxMaletin;
    private javax.swing.JLabel imgImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel plHeader;
    private javax.swing.JRadioButton rbAmd;
    private javax.swing.JRadioButton rbCuatroGb;
    private javax.swing.JRadioButton rbDiecisesGb;
    private javax.swing.JRadioButton rbIntel;
    private javax.swing.JRadioButton rbOchoGb;
    private javax.swing.ButtonGroup rbgProcesador;
    private javax.swing.ButtonGroup rbgRam;
    private javax.swing.JTextField txtSerial;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the listaComputadores
     */
    public List<Computador> getListaComputadores() {
        return listaComputadores;
    }
}
