package lentes;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Lentes extends javax.swing.JFrame {
    
    //<editor-fold defaultstate="collapsed" desc=" Variables">
    //DECLARACION DE VARIABLES GENERALES:
    int lente=1;
    int[] l = new int[6];
    float imagenfinal;
    float[] o = new float[6];
    float[] i = new float[6];
    float[] f = new float[6];
    float[] altura = new float[6];
    float[] radio1 = new float[6];
    float[] radio2 = new float[6];
    float[] d = new float[5];
    float[] m = new float[6];
    float[] nl = new float[6];
    float[] nm = new float[6];
    float[] alfa = new float[6];
    ImageIcon[] lentes = new ImageIcon[6];
    //</editor-fold>
    
    public Lentes() {
        initComponents();
        lentes[0] = new ImageIcon(getClass().getResource("biconvexa.png"));
        lentes[1] = new ImageIcon(getClass().getResource("biconcava.png"));
        lentes[2] = new ImageIcon(getClass().getResource("concavoconvexa.png"));
        lentes[3] = new ImageIcon(getClass().getResource("convexoconcava.png"));
        lentes[4] = new ImageIcon(getClass().getResource("planoconcava.png"));
        lentes[5] = new ImageIcon(getClass().getResource("planoconvexa.png"));
        jradio1.setEnabled(false);
        jradio2.setEnabled(false);
        l[0]=0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcolocar = new javax.swing.JButton();
        jsalir = new javax.swing.JButton();
        jinstrucciones1 = new javax.swing.JLabel();
        jlentes = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jcalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jinstrucciones2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jradio1 = new javax.swing.JTextField();
        jvalido2 = new javax.swing.JLabel();
        jvalido3 = new javax.swing.JLabel();
        jinstrucciones3 = new javax.swing.JLabel();
        jd1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jd2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jd3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jobjeto = new javax.swing.JTextField();
        jlente1 = new javax.swing.JLabel();
        jlente2 = new javax.swing.JLabel();
        jlente3 = new javax.swing.JLabel();
        jlente4 = new javax.swing.JLabel();
        jlente5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jobjetoimagen = new javax.swing.JLabel();
        jcalcularfoco = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jd4 = new javax.swing.JTextField();
        jradio2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jnl = new javax.swing.JTextField();
        jnm = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jaltura = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jlente0 = new javax.swing.JLabel();
        jvalido1 = new javax.swing.JLabel();
        jimagen = new javax.swing.JLabel();
        jm0 = new javax.swing.JLabel();
        jfoco1 = new javax.swing.JLabel();
        jfoco2 = new javax.swing.JLabel();
        jfoco3 = new javax.swing.JLabel();
        jfoco4 = new javax.swing.JLabel();
        jfoco5 = new javax.swing.JLabel();
        jm1 = new javax.swing.JLabel();
        jm2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Física moderna y óptica - Lentes");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jcolocar.setText("Colocar");
        jcolocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcolocarActionPerformed(evt);
            }
        });

        jsalir.setText("Salir");
        jsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsalirActionPerformed(evt);
            }
        });

        jinstrucciones1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jinstrucciones1.setText("Introduce los índices de refracción, una lente y oprime \"colocar\":");

        jlentes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Biconvexa", "Biconcava", "Concavoconvexa", "Convexoconcava", "Planoconvexa", "Planoconcava" }));
        jlentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlentesActionPerformed(evt);
            }
        });

        jLabel1.setText("Lente:");

        jcalcular.setText("Calcular");
        jcalcular.setEnabled(false);
        jcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcalcularActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lentes/IPN.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lentes/UPIITA.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INSTITUTO POLITECNICO NACIONAL");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("UNIDAD PROFESIONAL INTERDISCIPLINARIA DE INGENIERÍA Y TECNOLOGÍAS AVANZADAS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FISICA MODERNA Y ÓPTICA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("2012640131");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jinstrucciones2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jinstrucciones2.setText("Introduce los radios de las lentes y oprime \"calcular foco\":");

        jLabel8.setText("Radio 1:");

        jLabel10.setText("Radio 2:");

        jradio1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jradio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradio1ActionPerformed(evt);
            }
        });

        jvalido2.setForeground(new java.awt.Color(255, 0, 51));
        jvalido2.setText("*Introduce valores válidos");
        jvalido2.setEnabled(false);

        jvalido3.setForeground(new java.awt.Color(255, 0, 51));
        jvalido3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jvalido3.setText("*Introduce valores validos");
        jvalido3.setEnabled(false);

        jinstrucciones3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jinstrucciones3.setText("Introduce la altura y posicion del objeto así como las distancias entre lentes (si es el caso) y oprime el botón \"calcular\":");

        jd1.setEnabled(false);

        jLabel9.setText("D1 =");

        jd2.setEnabled(false);

        jLabel11.setText("D2 =");

        jd3.setEnabled(false);

        jLabel12.setText("D3 =");

        jLabel13.setText("D4 =");

        jLabel14.setText("Objeto:");

        jlente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlente1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlente2.setToolTipText("");

        jlente3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlente4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlente5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jobjetoimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jobjetoimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lentes/objeto.png"))); // NOI18N

        jcalcularfoco.setText("Calcular foco");
        jcalcularfoco.setEnabled(false);
        jcalcularfoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcalcularfocoActionPerformed(evt);
            }
        });

        jLabel15.setText("cm");

        jLabel16.setText("cm");

        jLabel17.setText("cm");

        jLabel18.setText("cm");

        jLabel19.setText("cm");

        jLabel20.setText("cm");

        jLabel21.setText("cm");

        jd4.setEnabled(false);

        jradio2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jradio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradio2ActionPerformed(evt);
            }
        });

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("nl =");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("nm =");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Altura:");

        jaltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jalturaActionPerformed(evt);
            }
        });

        jLabel25.setText("cm");

        jlente0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlente0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lentes/biconvexa.png"))); // NOI18N
        jlente0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jvalido1.setForeground(new java.awt.Color(255, 0, 51));
        jvalido1.setText("*Introduce valores válidos");
        jvalido1.setEnabled(false);

        jimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jm0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jfoco1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jfoco2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jfoco3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jfoco4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jfoco5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jm2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jinstrucciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(10, 10, 10)
                                        .addComponent(jlentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcolocar))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jvalido1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(4, 4, 4)
                                            .addComponent(jnl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(4, 4, 4)
                                            .addComponent(jnm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlente0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jinstrucciones2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addComponent(jradio1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel19))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10)
                                .addGap(4, 4, 4)
                                .addComponent(jradio2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(jcalcularfoco))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jvalido2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jinstrucciones3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel14)
                        .addGap(10, 10, 10)
                        .addComponent(jobjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel21)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(jd1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel15)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(jd2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel16)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addComponent(jd3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel17)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel13)
                        .addGap(4, 4, 4)
                        .addComponent(jd4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jcalcular)
                                .addGap(18, 18, 18)
                                .addComponent(jimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jm0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jm1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jm2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jsalir))
                            .addComponent(jvalido3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jobjetoimagen)
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel25)
                                .addGap(11, 11, 11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlente1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jfoco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlente2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jfoco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jfoco3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlente3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jfoco4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlente4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlente5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jfoco5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7))
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jinstrucciones2)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jradio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel19))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jradio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(jcalcularfoco))))
                        .addGap(8, 8, 8)
                        .addComponent(jvalido2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jinstrucciones1)
                            .addGap(11, 11, 11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel22)
                                                .addComponent(jLabel23))))
                                    .addGap(6, 6, 6)
                                    .addComponent(jvalido1)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jLabel1))
                                        .addComponent(jlentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcolocar)))
                                .addComponent(jlente0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jinstrucciones3)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel24)
                                .addComponent(jLabel25))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jfoco2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfoco1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfoco3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfoco4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfoco5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jobjetoimagen)
                    .addComponent(jlente1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlente2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlente3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlente4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlente5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jobjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel21)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15)
                            .addComponent(jLabel11)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18))))
                .addGap(6, 6, 6)
                .addComponent(jvalido3)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcalcular)
                            .addComponent(jsalir))
                        .addComponent(jm0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jm1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jm2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcolocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcolocarActionPerformed
        jvalido1.setEnabled(false);
                
        try {
            nl[lente] = Float.parseFloat(jnl.getText());
            nm[lente] = Float.parseFloat(jnm.getText());
            
            boolean pos = false;
            
            if (nl[lente]>=1 && nm[lente]>=1) { pos=true; }
            else { jvalido1.setEnabled(true); }
            
            if (pos) {
                jcolocar.setEnabled(false);
                jnl.setEnabled(false);
                jnm.setEnabled(false);
                jcalcular.setEnabled(false);
                jlentes.setEnabled(false);
                jcalcularfoco.setEnabled(true);
                jradio2.setEnabled(true);
                jradio2.setText("");
                l[lente]=l[0];
                alfa[lente]=nl[lente]/nm[lente]-1;
                if (l[lente]<4) { jradio1.setEnabled(true); jradio1.setText(""); }
                switch (lente) {
                    case 1:
                        jlente1.setIcon(lentes[l[lente]]);
                        break;
                    case 2:
                        jlente2.setIcon(lentes[l[lente]]);
                        break;
                    case 3:
                        jlente3.setIcon(lentes[l[lente]]);
                        break;
                    case 4:
                        jlente4.setIcon(lentes[l[lente]]);
                        break;
                    case 5:
                        jlente5.setIcon(lentes[l[lente]]);
                        break;
                }
            }
        } catch (Exception e) {
            jvalido1.setEnabled(true);
        }
    }//GEN-LAST:event_jcolocarActionPerformed
                           
    private void jsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jsalirActionPerformed

    private void jlentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlentesActionPerformed
        jradio1.setText("");
        jradio2.setText("");
        switch (jlentes.getSelectedItem().toString()) {
            case "Biconvexa":
                jlente0.setIcon(lentes[0]);
                l[0]=0;
                break;            
            case "Biconcava":
                jlente0.setIcon(lentes[1]);
                l[0]=1;
                break;
            case "Concavoconvexa":
                jlente0.setIcon(lentes[2]);
                l[0]=2;
                break;
            case "Convexoconcava":
                jlente0.setIcon(lentes[3]);
                l[0]=3;
                break;
            case "Planoconcava":
                jlente0.setIcon(lentes[4]);
                jradio1.setText("Infinito");
                l[0]=4;
                break;
            case "Planoconvexa":
                jlente0.setIcon(lentes[5]);
                jradio1.setText("Infinito");
                l[0]=5;
                break;
        }
    }//GEN-LAST:event_jlentesActionPerformed

    private void jcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcalcularActionPerformed
        jvalido3.setEnabled(false);
        
        try {
            altura[0] = Float.parseFloat(jaltura.getText());
            o[1] = Float.parseFloat(jobjeto.getText());
            
            int lentefinal;
            
            //Leer focos:
            if ( jfoco1.getText().equals("") ) {
                jvalido3.setEnabled(true);
            } else {
                if ( jfoco2.getText().equals("") ) {
                    lentefinal=1;
                } else {
                    if ( jfoco3.getText().equals("") ) {
                        lentefinal=2;
                        d[1] = Float.parseFloat(jd1.getText());
                    } else {
                        if ( jfoco4.getText().equals("") ) {
                            lentefinal=3;
                            d[1] = Float.parseFloat(jd1.getText());
                            d[2] = Float.parseFloat(jd2.getText());
                        } else {
                            if ( jfoco5.getText().equals("") ) {
                                lentefinal=4;
                                d[1] = Float.parseFloat(jd1.getText());
                                d[2] = Float.parseFloat(jd2.getText());
                                d[3] = Float.parseFloat(jd3.getText());
                            } else {
                                lentefinal=5;
                                d[1] = Float.parseFloat(jd1.getText());
                                d[2] = Float.parseFloat(jd2.getText());
                                d[3] = Float.parseFloat(jd3.getText());
                                d[4] = Float.parseFloat(jd4.getText());
                            }
                        }
                    }
                }
                
                imagenfinal = o[1];
                for (int k=1;k<=lentefinal;k++) {
                    i[k] = 1 / ( 1/f[k] - 1/o[k] );
                    m[k] = - i[k] / o[k];
                    altura[k] = m[k] * altura[k-1];
                    if (lentefinal>1 && k<lentefinal) {
                        o[k+1] = d[k] - i[k];
                        imagenfinal += d[k];
                    }
                }
                
                imagenfinal += i[lentefinal];
                jimagen.setText("Imagen final = " + (float) (Math.round(imagenfinal*100))/100 + " cm");
                m[0] = altura[lentefinal]/altura[0];
                if (m[0]>0) { jm0.setText("Ergida"); }
                else {
                    if (m[0]==0) { jm0.setText("Puntual");; }
                    else { jm0.setText("Invertida"); }
                }
                if (Math.abs(m[0])>1) { jm1.setText("Aumentada"); }
                else {
                    if (Math.abs(m[0])==1) { jm1.setText("Igual"); }
                    else { jm1.setText("Reducida"); }
                }
                jm2.setText("Altura final = " + (float) (Math.round(altura[lentefinal]*100))/100 + " cm");
            }
        } catch (Exception e) {
            jvalido3.setEnabled(true);
        }
    }//GEN-LAST:event_jcalcularActionPerformed

    //<editor-fold defaultstate="collapsed" desc="otros">
    private void jradio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jradio1ActionPerformed
//</editor-fold>
    
    private void jcalcularfocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcalcularfocoActionPerformed
        jvalido2.setEnabled(false);
        
        try {
            radio2[lente] = Float.parseFloat(jradio2.getText());
            boolean pos = false;
            
            switch (l[lente]) {
                case 0:
                    radio1[lente] = Float.parseFloat(jradio1.getText());
                    if (radio1[lente]>0.0 && radio2[lente]<0.0) { pos = true; } 
                    else { jvalido2.setEnabled(true); }
                    break;
                case 1:
                    radio1[lente] = Float.parseFloat(jradio1.getText());
                    if (radio1[lente]<0.0 && radio2[lente]>0.0) { pos = true; } 
                    else { jvalido2.setEnabled(true); }
                    break;
                case 2:
                    radio1[lente] = Float.parseFloat(jradio1.getText());
                    if (radio1[lente]<0.0 && radio2[lente]<0.0 && radio1[lente] != radio2[lente]) { pos = true; } 
                    else { jvalido2.setEnabled(true); }
                    break;
                case 3:
                    radio1[lente] = Float.parseFloat(jradio1.getText());
                    if (radio1[lente]>0.0 && radio2[lente]>0.0 && radio1[lente] != radio2[lente]) { pos = true; } 
                    else { jvalido2.setEnabled(true); }
                    break;
                case 4:
                    radio1[lente] = 0;
                    if (radio2[lente]>0.0) { pos = true;} 
                    else { jvalido2.setEnabled(true); }
                    break;
                case 5:
                    radio1[lente] = 0;
                    if (radio2[lente]<0.0) { pos = true; } 
                    else { jvalido2.setEnabled(true); }
                    break;
            }
            if (pos) {
                if (l[lente]<4){ 
                    radio1[lente] = Float.parseFloat(jradio1.getText());
                    f[lente] = 1/(alfa[lente]*(1/radio1[lente]-1/radio2[lente])); 
                } 
                else { f[lente] = 1 / ( alfa[lente] * (0 - 1/radio2[lente]) ); }
                switch (lente) {
                    case 1:
                        jfoco1.setText("f = " + (float) (Math.round(f[lente]*100))/100 + " cm");
                        jlente2.setBorder(jlente1.getBorder());
                        jlente1.setBorder(null);
                        break;
                    case 2:
                        jfoco2.setText("f = " + (float) (Math.round(f[lente]*100))/100 + " cm");
                        jlente3.setBorder(jlente2.getBorder());
                        jlente2.setBorder(null);
                        jd1.setEnabled(true);
                        break;
                    case 3:
                        jfoco3.setText("f = " + (float) (Math.round(f[lente]*100))/100 + " cm");
                        jlente4.setBorder(jlente3.getBorder());
                        jlente3.setBorder(null);
                        jd2.setEnabled(true);                                        
                        break;
                    case 4:
                        jfoco4.setText("f = " + (float) (Math.round(f[lente]*100))/100 + " cm");
                        jlente5.setBorder(jlente4.getBorder());
                        jlente4.setBorder(null);
                        jd3.setEnabled(true);                    
                        break;
                    case 5:
                        jfoco5.setText("f = " + (float) (Math.round(f[lente]*100))/100 + " cm");
                        jd4.setEnabled(true);
                        break;
                }
                if (lente<5) {lente++;}
                jcalcular.setEnabled(true);
                jnl.setEnabled(true);
                jnm.setEnabled(true);
                jlentes.setEnabled(true);
                jcolocar.setEnabled(true);
                jcalcularfoco.setEnabled(false);
                jradio1.setEnabled(false);
                jradio2.setEnabled(false);
            }
        } catch (Exception e) {
            jvalido2.setEnabled(true);
        }
    }//GEN-LAST:event_jcalcularfocoActionPerformed

    //<editor-fold defaultstate="collapsed" desc="otros">
    private void jradio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jradio2ActionPerformed

    private void jalturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jalturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jalturaActionPerformed
    //</editor-fold>
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    }
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
            java.util.logging.Logger.getLogger(Lentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new instrucciones().setVisible(true);
            }
        });
    }
    
    //<editor-fold defaultstate="collapsed" desc="swing">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jaltura;
    private javax.swing.JButton jcalcular;
    private javax.swing.JButton jcalcularfoco;
    private javax.swing.JButton jcolocar;
    private javax.swing.JTextField jd1;
    private javax.swing.JTextField jd2;
    private javax.swing.JTextField jd3;
    private javax.swing.JTextField jd4;
    private javax.swing.JLabel jfoco1;
    private javax.swing.JLabel jfoco2;
    private javax.swing.JLabel jfoco3;
    private javax.swing.JLabel jfoco4;
    private javax.swing.JLabel jfoco5;
    private javax.swing.JLabel jimagen;
    private javax.swing.JLabel jinstrucciones1;
    private javax.swing.JLabel jinstrucciones2;
    private javax.swing.JLabel jinstrucciones3;
    private javax.swing.JLabel jlente0;
    private javax.swing.JLabel jlente1;
    private javax.swing.JLabel jlente2;
    private javax.swing.JLabel jlente3;
    private javax.swing.JLabel jlente4;
    private javax.swing.JLabel jlente5;
    private javax.swing.JComboBox jlentes;
    private javax.swing.JLabel jm0;
    private javax.swing.JLabel jm1;
    private javax.swing.JLabel jm2;
    private javax.swing.JTextField jnl;
    private javax.swing.JTextField jnm;
    private javax.swing.JTextField jobjeto;
    private javax.swing.JLabel jobjetoimagen;
    private javax.swing.JTextField jradio1;
    private javax.swing.JTextField jradio2;
    private javax.swing.JButton jsalir;
    private javax.swing.JLabel jvalido1;
    private javax.swing.JLabel jvalido2;
    private javax.swing.JLabel jvalido3;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
    
}