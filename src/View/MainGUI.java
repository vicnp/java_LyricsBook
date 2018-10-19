package View;

import Control.Control;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Victor Nascimento
 */
public class MainGUI extends javax.swing.JFrame {

    public MainGUI(Control c) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        initComponents();
        setLocationRelativeTo(null);
        Control.Recover_db();
        Double sizeA = width*0.35;
        Double sizeB = height*0.4;
        //InsertPane.setSize(sizeA.intValue(),sizeB.intValue());
        InsertPane.setLocationRelativeTo(null);
        InsertPane.pack();
        //EditPane.setSize(sizeA.intValue(),sizeB.intValue());
        EditPane.setLocationRelativeTo(null);
        EditPane.pack();
        EditPane.setModal(true);
        InsertPane.setModal(true);
        //InsertPane.setSize(700, 420);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InsertPane = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        musica_insert = new javax.swing.JTextField();
        artista_insert = new javax.swing.JTextField();
        ano_insert = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        letra_insert = new javax.swing.JTextArea();
        cancel_insert = new javax.swing.JButton();
        ok_insert = new javax.swing.JButton();
        EditPane = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        musica_insert1 = new javax.swing.JTextField();
        artista_insert1 = new javax.swing.JTextField();
        ano_insert1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        letra_insert1 = new javax.swing.JTextArea();
        cancel_insert1 = new javax.swing.JButton();
        ok_insert1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Caixa_Letra = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        musica_table = new javax.swing.JTable();
        Button_Pane = new javax.swing.JPanel();
        deleta_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Menu_Bar = new javax.swing.JMenuBar();
        Programa = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();
        Ajuda = new javax.swing.JMenu();
        AjudaDiag = new javax.swing.JMenuItem();
        Sobre = new javax.swing.JMenuItem();
        aumentaletra = new javax.swing.JMenuItem();
        diminuiletra = new javax.swing.JMenuItem();

        InsertPane.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        InsertPane.setTitle("Adicionar Musica");
        InsertPane.setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Inserir Dados"));

        jLabel1.setText("Nome:");

        jLabel2.setText("Artista:");

        jLabel3.setText("Ano:");

        jLabel4.setText("Letra:");

        letra_insert.setColumns(20);
        letra_insert.setRows(5);
        jScrollPane3.setViewportView(letra_insert);

        cancel_insert.setText("Cancelar");
        cancel_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_insertActionPerformed(evt);
            }
        });

        ok_insert.setText("OK");
        ok_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_insertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(musica_insert)
                            .addComponent(artista_insert)
                            .addComponent(ano_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cancel_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ok_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(musica_insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(artista_insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ano_insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_insert)
                    .addComponent(ok_insert))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout InsertPaneLayout = new javax.swing.GroupLayout(InsertPane.getContentPane());
        InsertPane.getContentPane().setLayout(InsertPaneLayout);
        InsertPaneLayout.setHorizontalGroup(
            InsertPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsertPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InsertPaneLayout.setVerticalGroup(
            InsertPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsertPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EditPane.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        EditPane.setTitle("Editar Musica");
        EditPane.setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar Dados"));

        jLabel5.setText("Nome:");

        jLabel6.setText("Artista:");

        jLabel7.setText("Ano:");

        jLabel8.setText("Letra:");

        letra_insert1.setColumns(20);
        letra_insert1.setRows(5);
        jScrollPane4.setViewportView(letra_insert1);

        cancel_insert1.setText("Cancelar");
        cancel_insert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_insert1ActionPerformed(evt);
            }
        });

        ok_insert1.setText("OK");
        ok_insert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_insert1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(musica_insert1)
                            .addComponent(artista_insert1)
                            .addComponent(ano_insert1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(cancel_insert1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ok_insert1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(musica_insert1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(artista_insert1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ano_insert1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_insert1)
                    .addComponent(ok_insert1))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout EditPaneLayout = new javax.swing.GroupLayout(EditPane.getContentPane());
        EditPane.getContentPane().setLayout(EditPaneLayout);
        EditPaneLayout.setHorizontalGroup(
            EditPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EditPaneLayout.setVerticalGroup(
            EditPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LyricsBook");

        Caixa_Letra.setEditable(false);
        Caixa_Letra.setColumns(10);
        Caixa_Letra.setLineWrap(true);
        Caixa_Letra.setRows(5);
        Caixa_Letra.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Caixa_Letra);

        musica_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Artista", "Ano"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        musica_table.getTableHeader().setReorderingAllowed(false);
        musica_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                musica_tableMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(musica_table);
        if (musica_table.getColumnModel().getColumnCount() > 0) {
            musica_table.getColumnModel().getColumn(0).setResizable(false);
            musica_table.getColumnModel().getColumn(0).setPreferredWidth(10);
            musica_table.getColumnModel().getColumn(3).setPreferredWidth(35);
            musica_table.getColumnModel().getColumn(3).setMaxWidth(300);
        }

        Button_Pane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        deleta_btn.setBackground(new java.awt.Color(255, 51, 51));
        deleta_btn.setText("Deletar");
        deleta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleta_btnActionPerformed(evt);
            }
        });

        add_btn.setBackground(new java.awt.Color(102, 255, 102));
        add_btn.setText("Adicionar");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Button_PaneLayout = new javax.swing.GroupLayout(Button_Pane);
        Button_Pane.setLayout(Button_PaneLayout);
        Button_PaneLayout.setHorizontalGroup(
            Button_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Button_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleta_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(128, 128, 128)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        Button_PaneLayout.setVerticalGroup(
            Button_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Button_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleta_btn)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Programa.setText("Programa");

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/Close.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Programa.add(Sair);

        Menu_Bar.add(Programa);

        Ajuda.setText("Ajuda");

        AjudaDiag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/Help.png"))); // NOI18N
        AjudaDiag.setText("Ajuda");
        AjudaDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjudaDiagActionPerformed(evt);
            }
        });
        Ajuda.add(AjudaDiag);

        Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/About.png"))); // NOI18N
        Sobre.setText("Sobre");
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        Ajuda.add(Sobre);

        aumentaletra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_EQUALS, java.awt.event.InputEvent.SHIFT_MASK));
        aumentaletra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/Add.png"))); // NOI18N
        aumentaletra.setText("Aumentar Fonte");
        aumentaletra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentaletraActionPerformed(evt);
            }
        });
        Ajuda.add(aumentaletra);

        diminuiletra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_MINUS, java.awt.event.InputEvent.SHIFT_MASK));
        diminuiletra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/Remove.png"))); // NOI18N
        diminuiletra.setText("Diminuir Fonte");
        diminuiletra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuiletraActionPerformed(evt);
            }
        });
        Ajuda.add(diminuiletra);

        Menu_Bar.add(Ajuda);

        setJMenuBar(Menu_Bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Button_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        Control.Exit();
    }//GEN-LAST:event_SairActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
       Control.About();
    }//GEN-LAST:event_SobreActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        Control.showInsertDialog();
    }//GEN-LAST:event_add_btnActionPerformed

    private void deleta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleta_btnActionPerformed
       Control.Undo_Remove();
    }//GEN-LAST:event_deleta_btnActionPerformed

    private void musica_tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musica_tableMouseReleased
       Control.showSelectedIten();
    }//GEN-LAST:event_musica_tableMouseReleased

    private void ok_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_insertActionPerformed
       Control.Make_Insert();
       Control.Close_clean();
    }//GEN-LAST:event_ok_insertActionPerformed

    private void cancel_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_insertActionPerformed
       Control.showInsertDialog();
       Control.Close_clean();
    }//GEN-LAST:event_cancel_insertActionPerformed

    private void diminuiletraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuiletraActionPerformed
       Control.fontSize(false);
    }//GEN-LAST:event_diminuiletraActionPerformed

    private void aumentaletraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentaletraActionPerformed
        Control.fontSize(true);
    }//GEN-LAST:event_aumentaletraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Control.Make_Update();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancel_insert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_insert1ActionPerformed
       Control.showEditDialog();
       Control.Close_clean();
    }//GEN-LAST:event_cancel_insert1ActionPerformed

    private void ok_insert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_insert1ActionPerformed
        Control.Update();
        Control.Close_clean();
    }//GEN-LAST:event_ok_insert1ActionPerformed

    private void AjudaDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjudaDiagActionPerformed
       Control.Help();
    }//GEN-LAST:event_AjudaDiagActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ajuda;
    private javax.swing.JMenuItem AjudaDiag;
    private javax.swing.JPanel Button_Pane;
    public static javax.swing.JTextArea Caixa_Letra;
    public static javax.swing.JDialog EditPane;
    public static javax.swing.JDialog InsertPane;
    private javax.swing.JMenuBar Menu_Bar;
    private javax.swing.JMenu Programa;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JButton add_btn;
    public static javax.swing.JTextField ano_insert;
    public static javax.swing.JTextField ano_insert1;
    public static javax.swing.JTextField artista_insert;
    public static javax.swing.JTextField artista_insert1;
    private javax.swing.JMenuItem aumentaletra;
    private javax.swing.JButton cancel_insert;
    private javax.swing.JButton cancel_insert1;
    private javax.swing.JButton deleta_btn;
    private javax.swing.JMenuItem diminuiletra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTextArea letra_insert;
    public static javax.swing.JTextArea letra_insert1;
    public static javax.swing.JTextField musica_insert;
    public static javax.swing.JTextField musica_insert1;
    public static javax.swing.JTable musica_table;
    private javax.swing.JButton ok_insert;
    private javax.swing.JButton ok_insert1;
    // End of variables declaration//GEN-END:variables
}
