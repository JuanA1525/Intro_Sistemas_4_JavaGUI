package Java_GUI_Integration;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Andres Benjumea Reinoso
 * @author Juan Andres Porras
 */
public class mainFrame extends javax.swing.JFrame {

    int ancho = 284;
    int alto = 330;

    String[] meses = new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre" };

    String mes;
    int dia;

    String txtCapricornio = "<html>CAPRICORNIO es un signo cardinal y de tierra, y uno de los signos del zodiaco mas constante, solido y apacible. Tambien se caracteriza por ser prudente y practico en todos los asuntos que le conciernen. Sus aspectos mas negativos tienden hacia el pesimismo, la fijeza y la melancolia.<html>";
    String txtAcuario = "<html>ACUARIO es un signo fijo y de aire, y sin duda, es el signo con mayor capacidad para la invencion de toda la rueda zodiacal. Simpatico, original y brillante, Acuario tambien es un signo muy humanitario, al mismo tiempo que independiente e intelectual.<html>";
    String txtPiscis = "<html>PISCIS es un signo mutable y de agua, tambien es el ultimo signo del zodiaco,       precisamente por eso, es el mas rico y complejo de todos. Sensible ante el sufrimiento de los demas, responde con buena voluntad y ganas de ayudar.<html>";
    String txtAries = "<html>ARIES forma parte de los signos cardinales y al mismo tiempo es un signo de fuego; tambien es el primer signo del zodiaco, precisamente por eso, simboliza el inicio, la creacion. Se caracteriza por ser una persona rebosante de energia y entusiasmo; avanzada y aventurera, adora la libertad, los retos y las nuevas ideas.<html>";
    String txtTauro = "<html>TAURO pertenece a los signos fijos y simultaneamente es un signo de tierra. La proyeccion del Sol en su nacimiento suele influir para que sean personas firmes, decididas y constantes en varios sentidos. Tambien adoran sentir seguridad, por eso la buscan tanto, es como una necesidad constante en sus vidas.<html>";
    String txtGeminis = "<html>GEMINIS es un signo mutable que forma parte del elemento aire; como signo de los gemelos, su caracter es doble y bastante contradictorio por complejo. Por una parte es capaz de adaptarse con facilidad y rapidez a todo, pero por otra puede resultar hipocrita. Su distintivo comun es la comunicacion y el ingenio.<html>";
    String txtCancer = "<html>CANCER Los nacidos bajo el signo de cancer son personas completamente emocionales, muy sentimentales, imaginativos, carii±osos, protectores y muy sensuales. A la vez, pueden ser ti­midos y muy sensibles, pero excelentes amantes. Es un signo muy divertido, amigable y confiado.<html>";
    String txtLeo = "<html>LEO El signo de Leo es fijo y de fuego, tambien el signo mas dominante del zodiaco. Creativo y abierto, tiene ambicion, valor, fuerza, autonomia y total seguridad en si­ mismo: sabe donde quiere llegar y nada ni nadie podra evitarlo.<html>";
    String txtVirgo = "<html>VIRGO es un signo mutable y de tierra; representado por una virgen, es un signo caracterizado por su espi­ritu cri­tico, precision, reserva, paciencia y convencionalismo. Tambien es logico, metodico y aplicado, le gusta aprender y es capaz de analizar las situaciones mas complejas con una claridad pasmosa.<html>";
    String txtLibra = "<html>LIBRA es un signo cardinal y de aire, se encuentra ademas entre los signos mas refinados del zodiaco; tiene elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos. Sus puntos negativos a veces son la frivolidad y un caracter voluble.<html>";
    String txtEscorpio = "<html>ESCORPIO es un signo fijo y de agua; su potencia y energia emocional son unicas en todo el zodiaco. Tiene mucha imaginacion e intuicion, ademas de una gran capacidad para el analisis, fuerza de voluntad y firmeza, aunque tambien es muy sensible y emocional consigo mismo y con el entorno.<html>";
    String txtSagitario = "<html>SAGITARIO es un signo zodiacal muy honesto, fiel en el amor pero tambien muy temperamental. Un Sagitario es para siempre hasta que se le traiciona. Optimistas, positivos, modestos, sinceros y simpaticos, los Sagitario suelen ser la alegria de la huerta del zodiaco.<html>";

    ImageIcon leo = new ImageIcon("src/Imagenes/Leo.jpg");
    ImageIcon leoR = new ImageIcon(leo.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));

    ImageIcon acuario = new ImageIcon("src/Imagenes/Acuario.jpg");
    ImageIcon acuarioR = new ImageIcon(acuario.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));

    ImageIcon aries = new ImageIcon("src/Imagenes/Aries.jpg");
    ImageIcon ariesR = new ImageIcon(aries.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));

    ImageIcon cancer = new ImageIcon("src/Imagenes/Cancer.jpg");
    ImageIcon cancerR = new ImageIcon(cancer.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));

    ImageIcon capricornio = new ImageIcon("src/Imagenes/Capricornio.jpg");
    ImageIcon capricornioR = new ImageIcon(capricornio.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));

    ImageIcon escorpio = new ImageIcon("src/Imagenes/Escorpio.jpg");
    ImageIcon escorpioR = new ImageIcon(escorpio.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));

    ImageIcon geminis = new ImageIcon("src/Imagenes/Geminis.jpg");
    ImageIcon geminisR = new ImageIcon(geminis.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));

    ImageIcon libra = new ImageIcon("src/Imagenes/Libra.jpg");
    ImageIcon libraR = new ImageIcon(libra.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));

    ImageIcon piscis = new ImageIcon("src/Imagenes/Piscis.jpg");
    ImageIcon piscisR = new ImageIcon(piscis.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));

    ImageIcon sagitario = new ImageIcon("src/Imagenes/Sagitario.jpg");
    ImageIcon sagitarioR = new ImageIcon(sagitario.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));

    ImageIcon tauro = new ImageIcon("src/Imagenes/Tauro.jpg");
    ImageIcon tauroR = new ImageIcon(tauro.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));

    ImageIcon virgo = new ImageIcon("src/Imagenes/Virgo.jpg");
    ImageIcon virgoR = new ImageIcon(virgo.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
        agregarDataElements();
        agregarResultElements();
        selectorData();
    }

    ActionListener consultar = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            mes = selectMes.getSelectedItem();
            dia = selectDia.getSelectedIndex() + 1;

            switch (mes) {

                case ("Enero"): {

                    if (dia > 0 && dia < 21) {
                        lblResultado.setText("CAPRICORNIO");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtCapricornio);
                        lblImagen.setIcon(capricornioR);
                    } else if (dia > 21 && dia < 32) {
                        lblResultado.setText("ACUARIO");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtAcuario);
                        lblImagen.setIcon(acuarioR);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }
                    break;
                case ("Febrero"): {

                    if (dia > 0 && dia < 20) {
                        lblResultado.setText("ACUARIO");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtAcuario);
                        lblImagen.setIcon(acuarioR);
                    } else if (dia > 21 && dia < 29) {
                        lblResultado.setText("PISCIS");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtPiscis);
                        lblImagen.setIcon(piscisR);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }
                    break;
                case ("Marzo"): {

                    if (dia > 0 && dia < 21) {
                        lblResultado.setText("PISCIS");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtPiscis);
                        lblImagen.setIcon(piscisR);
                    } else if (dia > 21 && dia < 32) {
                        lblResultado.setText("ARIES");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtAries);
                        lblImagen.setIcon(ariesR);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }
                    break;
                case ("Abril"): {

                    if (dia > 0 && dia < 21) {
                        lblResultado.setText("ARIES");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtAries);
                        lblImagen.setIcon(ariesR);
                    } else if (dia > 20 && dia < 31) {
                        lblResultado.setText("TAURO");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtTauro);
                        lblImagen.setIcon(tauroR);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }
                    break;
                case ("Mayo"): {

                    if (dia > 0 && dia < 22) {
                        lblResultado.setText("TAURO");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtTauro);
                        lblImagen.setIcon(tauroR);
                    } else if (dia > 21 && dia < 32) {
                        lblResultado.setText("GEMINIS");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtGeminis);
                        lblImagen.setIcon(geminisR);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }
                    break;
                case ("Junio"): {

                    if (dia > 0 && dia < 22) {
                        lblResultado.setText("GEMINIS");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtGeminis);
                        lblImagen.setIcon(geminisR);
                    } else if (dia > 21 && dia < 31) {
                        lblResultado.setText("CANCER");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtCancer);
                        lblImagen.setIcon(cancerR);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }
                    break;
                case ("Julio"): {

                    if (dia > 0 && dia < 23) {
                        lblResultado.setText("CANCER");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtCancer);
                        lblImagen.setIcon(cancerR);
                    } else if (dia > 22 && dia < 32) {
                        lblResultado.setText("LEO");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtLeo);
                        lblImagen.setIcon(leoR);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }
                    break;
                case ("Agosto"): {

                    if (dia > 0 && dia < 24) {
                        lblResultado.setText("LEO");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtLeo);
                        lblImagen.setIcon(leoR);
                    } else if (dia > 22 && dia < 32) {
                        lblResultado.setText("VIRGO");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtVirgo);
                        lblImagen.setIcon(virgoR);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }
                    break;
                case ("Septiembre"): {

                    if (dia > 0 && dia < 24) {
                        lblResultado.setText("VIRGO");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtVirgo);
                        lblImagen.setIcon(virgoR);
                    } else if (dia > 23 && dia < 31) {
                        lblResultado.setText("LIBRA");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtLibra);
                        lblImagen.setIcon(libraR);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }
                    break;
                case ("Octubre"): {

                    if (dia > 0 && dia < 24) {
                        lblResultado.setText("LIBRA");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtLibra);
                        lblImagen.setIcon(libraR);
                    } else if (dia > 23 && dia < 32) {
                        lblResultado.setText("ESCORPIO");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtEscorpio);
                        lblImagen.setIcon(escorpioR);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }
                    break;
                case ("Noviembre"): {

                    if (dia > 0 && dia < 23) {
                        lblResultado.setText("ESCORPIO");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtEscorpio);
                        lblImagen.setIcon(escorpioR);
                    } else if (dia > 22 && dia < 31) {
                        lblResultado.setText("SAGITARIO");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtSagitario);
                        lblImagen.setIcon(sagitarioR);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }
                    break;
                case ("Diciembre"): {

                    if (dia > 0 && dia < 23) {
                        lblResultado.setText("SAGITARIO");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtSagitario);
                        lblImagen.setIcon(sagitarioR);
                    } else if (dia > 22 && dia < 32) {
                        lblResultado.setText("CAPRICORNIO");
                        lblResultado.setBackground(new Color(0, 102, 153));
                        lblResultadoText.setText(txtCapricornio);
                        lblImagen.setIcon(capricornioR);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }
                    break;
            }
        }
    };

    public void selectorData() {

        for (int j = 0; j <= 11; j++) {
            selectMes.add(meses[j]);
        }
        
        for (int i = 1; i <= 31; i++) {
            selectDia.add("" + i);
        }
    }

    public void agregarDataElements() {
        dataPanel.add(btnConsultar);
        btnConsultar.addActionListener(consultar);
        dataPanel.add(lblBienvenido);
        dataPanel.add(lblDia);
        dataPanel.add(lblMes);
        dataPanel.add(selectMes);
        dataPanel.add(selectDia);
    }

    public void agregarResultElements() {
        resultPanel.add(lblResultadoText);
        resultPanel.add(lblResultado);
        resultPanel.add(lblImagen);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataPanel = new javax.swing.JPanel();
        selectMes = new java.awt.Choice();
        selectDia = new java.awt.Choice();
        lblBienvenido = new java.awt.Label();
        lblMes = new java.awt.Label();
        lblDia = new java.awt.Label();
        lblInstruccion = new java.awt.Label();
        btnConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultPanel = new javax.swing.JPanel();
        lblResultado = new java.awt.Label();
        lblImagen = new javax.swing.JLabel();
        lblResultadoText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Signos Zodiaco Java GUI");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("mainFrame"); // NOI18N
        setSize(new java.awt.Dimension(700, 450));

        dataPanel.setBackground(new java.awt.Color(0, 102, 153));

        lblBienvenido.setAlignment(java.awt.Label.CENTER);
        lblBienvenido.setBackground(new java.awt.Color(0, 102, 153));
        lblBienvenido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setText("Bienvenid@ al Sistema Zodiacal en JAVA");

        lblMes.setAlignment(java.awt.Label.CENTER);
        lblMes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMes.setForeground(new java.awt.Color(255, 255, 255));
        lblMes.setText("Mes de Nacimiento:");

        lblDia.setAlignment(java.awt.Label.CENTER);
        lblDia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDia.setForeground(new java.awt.Color(255, 255, 255));
        lblDia.setText("Dia de Nacimiento:");

        lblInstruccion.setAlignment(java.awt.Label.CENTER);
        lblInstruccion.setBackground(new java.awt.Color(0, 153, 255));
        lblInstruccion.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        lblInstruccion.setForeground(new java.awt.Color(255, 255, 255));
        lblInstruccion.setText("Para conocer su signo Zodiacal, por favor seleccione los datos solicitados.");

        btnConsultar.setBackground(new java.awt.Color(153, 153, 255));
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flecha_Azul.png"))); // NOI18N
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flecha_Azul.png"))); // NOI18N
        btnConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flecha_Azul_R.png"))); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
        dataPanel.setLayout(dataPanelLayout);
        dataPanelLayout.setHorizontalGroup(
                dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dataPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(dataPanelLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(dataPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblMes, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                Short.MAX_VALUE)
                                        .addComponent(selectMes, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71,
                                        Short.MAX_VALUE)
                                .addGroup(dataPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblDia, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(selectDia, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 252,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addComponent(lblInstruccion, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        dataPanelLayout.setVerticalGroup(
                dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dataPanelLayout.createSequentialGroup()
                                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, 41,
                                                Short.MAX_VALUE)
                                        .addGroup(dataPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dataPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(dataPanelLayout.createSequentialGroup()
                                                .addGroup(dataPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblMes, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblDia, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(1, 1, 1)
                                                .addGroup(dataPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(selectMes, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                30, Short.MAX_VALUE)
                                                        .addComponent(selectDia, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));

        getContentPane().add(dataPanel, java.awt.BorderLayout.NORTH);

        resultPanel.setBackground(new java.awt.Color(0, 153, 255));

        lblResultado.setAlignment(java.awt.Label.CENTER);
        lblResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 255, 255));

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblImagen.setIconTextGap(1);

        lblResultadoText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblResultadoText.setForeground(new java.awt.Color(255, 255, 255));
        lblResultadoText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblResultadoText.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblResultadoText.setAutoscrolls(true);
        lblResultadoText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblResultadoText.setMaximumSize(new java.awt.Dimension(442, 269));
        lblResultadoText.setPreferredSize(new java.awt.Dimension(442, 269));

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
                resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(resultPanelLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(resultPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 386,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(resultPanelLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(lblResultadoText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30,
                                        Short.MAX_VALUE)
                                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 226,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)));
        resultPanelLayout.setVerticalGroup(
                resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultPanelLayout.createSequentialGroup()
                                .addGap(20, 68, Short.MAX_VALUE)
                                .addGroup(resultPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 337,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(resultPanelLayout.createSequentialGroup()
                                                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblResultadoText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15)));

        getContentPane().add(resultPanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(721, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnConsultarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label lblBienvenido;
    private java.awt.Label lblDia;
    private javax.swing.JLabel lblImagen;
    private java.awt.Label lblInstruccion;
    private java.awt.Label lblMes;
    private java.awt.Label lblResultado;
    private javax.swing.JLabel lblResultadoText;
    private javax.swing.JPanel resultPanel;
    private java.awt.Choice selectDia;
    private java.awt.Choice selectMes;
    // End of variables declaration//GEN-END:variables
}
