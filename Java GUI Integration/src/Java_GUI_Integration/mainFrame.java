package Java_GUI_Integration;

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
 * @author juana
 */
public class mainFrame extends javax.swing.JFrame {
    
    int Ancho = 284;
    int Alto = 330;
    
    String[] meses = new String[]{"Enero", "Febrero", "Marzo", "Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    
    String MES;
    int DIA;
    
    String txtCapricornio = "<html>CAPRICORNIO es un signo cardinal y de tierra, y uno de los signos del zodíaco más constante, sólido y apacible. También se caracteriza por ser prudente y práctico en todos los asuntos que le conciernen. Sus aspectos más negativos tienden hacia el pesimismo, la fijeza y la melancolía.<html>";
    String txtAcuario = "<html>ACUARIO es un signo fijo y de aire, y sin duda, es el signo con mayor capacidad para la invención de toda la rueda zodiacal. Simpático, original y brillante, Acuario también es un signo muy humanitario, al mismo tiempo que independiente e intelectual.<html>";
    String txtPiscis = "<html>PISCIS es un signo mutable y de agua, también es el último signo del zodiaco,       precisamente por eso, es el más rico y complejo de todos. Sensible ante el sufrimiento de los demás, responde con buena voluntad y ganas de ayudar.<html>";
    String txtAries = "<html>ARIES forma parte de los signos cardinales y al mismo tiempo es un signo de fuego; también es el primer signo del zodíaco, precisamente por eso, simboliza el inicio, la creación. Se caracteriza por ser una persona rebosante de energía y entusiasmo; avanzada y aventurera, adora la libertad, los retos y las nuevas ideas.<html>";
    String txtTauro = "<html>TAURO pertenece a los signos fijos y simultáneamente es un signo de tierra. La proyección del Sol en su nacimiento suele influir para que sean personas firmes, decididas y constantes en varios sentidos. También adoran sentir seguridad, por eso la buscan tanto, es como una necesidad constante en sus vidas.<html>";
    String txtGeminis = "<html>GEMINIS es un signo mutable que forma parte del elemento aire; como signo de los gemelos, su carácter es doble y bastante contradictorio por complejo. Por una parte es capaz de adaptarse con facilidad y rapidez a todo, pero por otra puede resultar hipócrita. Su distintivo común es la comunicación y el ingenio.<html>";
    String txtCancer = "<html>CANCER Los nacidos bajo el signo de cáncer son personas completamente emocionales, muy sentimentales, imaginativos, cariñosos, protectores y muy sensuales. A la vez, pueden ser tímidos y muy sensibles, pero excelentes amantes. Es un signo muy divertido, amigable y confiado.<html>";
    String txtLeo = "<html>LEO El signo de Leo es fijo y de fuego, también el signo más dominante del zodíaco. Creativo y abierto, tiene ambición, valor, fuerza, autonomía y total seguridad en sí mismo: sabe dónde quiere llegar y nada ni nadie podrá evitarlo.<html>";
    String txtVirgo = "<html>VIRGO es un signo mutable y de tierra; representado por una virgen, es un signo caracterizado por su espíritu crítico, precisión, reserva, paciencia y convencionalismo. También es lógico, metódico y aplicado, le gusta aprender y es capaz de analizar las situaciones más complejas con una claridad pasmosa.<html>";
    String txtLibra = "<html>LIBRA es un signo cardinal y de aire, se encuentra además entre los signos más refinados del zodíaco; tiene elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos. Sus puntos negativos a veces son la frivolidad y un carácter voluble.<html>";
    String txtEscorpio = "<html>ESCORPIO es un signo fijo y de agua; su potencia y energía emocional son únicas en todo el zodíaco. Tiene mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza, aunque también es muy sensible y emocional consigo mismo y con el entorno.<html>"; 
    String txtSagitario = "<html>SAGITARIO es un signo zodiacal muy honesto, fiel en el amor pero también muy temperamental. Un Sagitario es para siempre hasta que se le traiciona. Optimistas, positivos, modestos, sinceros y simpáticos, los Sagitario suelen ser la alegría de la huerta del zodiaco.<html>";
    
    ImageIcon leo = new ImageIcon("src/Imagenes/Leo.jpg");
    ImageIcon leoR = new ImageIcon(leo.getImage().getScaledInstance(Ancho, Alto, Image.SCALE_SMOOTH));
    
    ImageIcon acuario = new ImageIcon("src/Imagenes/Acuario.jpg");
    ImageIcon acuarioR = new ImageIcon(acuario.getImage().getScaledInstance(Ancho, Alto, Image.SCALE_SMOOTH));
    
    ImageIcon aries = new ImageIcon("src/Imagenes/Aries.jpg");
    ImageIcon ariesR = new ImageIcon(aries.getImage().getScaledInstance(Ancho, Alto, Image.SCALE_SMOOTH));
    
    ImageIcon cancer = new ImageIcon("src/Imagenes/Cancer.jpg");
    ImageIcon cancerR = new ImageIcon(cancer.getImage().getScaledInstance(Ancho, Alto, Image.SCALE_SMOOTH));
    
    ImageIcon capricornio = new ImageIcon("src/Imagenes/Capricornio.jpg");
    ImageIcon capricornioR = new ImageIcon(capricornio.getImage().getScaledInstance(Ancho, Alto, Image.SCALE_SMOOTH));
    
    ImageIcon escorpio = new ImageIcon("src/Imagenes/Escorpio.jpg");
    ImageIcon escorpioR = new ImageIcon(escorpio.getImage().getScaledInstance(Ancho, Alto, Image.SCALE_SMOOTH));
    
    ImageIcon geminis = new ImageIcon("src/Imagenes/Geminis.jpg");
    ImageIcon geminisR = new ImageIcon(geminis.getImage().getScaledInstance(Ancho, Alto, Image.SCALE_SMOOTH));
    
    ImageIcon libra = new ImageIcon("src/Imagenes/Libra.jpg");
    ImageIcon libraR = new ImageIcon(libra.getImage().getScaledInstance(Ancho, Alto, Image.SCALE_SMOOTH));
    
    ImageIcon piscis = new ImageIcon("src/Imagenes/Piscis.jpg");
    ImageIcon piscisR = new ImageIcon(piscis.getImage().getScaledInstance(Ancho, Alto, Image.SCALE_SMOOTH));
    
    ImageIcon sagitario = new ImageIcon("src/Imagenes/Sagitario.jpg");
    ImageIcon sagitarioR = new ImageIcon(sagitario.getImage().getScaledInstance(Ancho, Alto, Image.SCALE_SMOOTH));
    
    ImageIcon tauro = new ImageIcon("src/Imagenes/Tauro.jpg");
    ImageIcon tauroR = new ImageIcon(tauro.getImage().getScaledInstance(Ancho, Alto, Image.SCALE_SMOOTH));
    
    ImageIcon virgo = new ImageIcon("src/Imagenes/Virgo.jpg");
    ImageIcon virgoR = new ImageIcon(virgo.getImage().getScaledInstance(Ancho, Alto, Image.SCALE_SMOOTH));     
    
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
            
            MES = selectMes.getSelectedItem();
            DIA = selectDia.getSelectedIndex() +1;
            
            switch (MES){
                
                case("Enero") : {
                    
                    if (DIA > 0 && DIA < 21)
                    {
                        lblResultado.setText("CAPRICORNIO");
                        lblResultadoText.setText(txtCapricornio);
                        lblImagen.setIcon(capricornioR);
                    }else if (DIA > 21 && DIA < 32)
                    {
                        lblResultado.setText("ACUARIO");
                        lblResultadoText.setText(txtAcuario);
                        lblImagen.setIcon(acuarioR);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }break;
                case("Febrero") : {
                    
                    if (DIA > 0 && DIA < 20) {
                        lblResultado.setText("ACUARIO");
                        lblResultadoText.setText(txtAcuario);
                        lblImagen.setIcon(acuarioR);
                    }else if(DIA > 21 && DIA < 29){
                        lblResultado.setText("PICSIS");
                        lblResultadoText.setText(txtPiscis);
                        lblImagen.setIcon(piscisR);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }break;
                case("Marzo") : {
                    
                    if (DIA > 0 && DIA < 21) {
                        lblResultado.setText("PICSIS");
                        lblResultadoText.setText(txtPiscis);
                        lblImagen.setIcon(piscisR);
                    }else if(DIA > 21 && DIA < 32){
                        lblResultado.setText("ARIES");
                        lblResultadoText.setText(txtAries);
                        lblImagen.setIcon(ariesR);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }break;
                case("Abril") : {
                    
                    if (DIA > 0 && DIA < 21) {
                        lblResultado.setText("ARIES");
                        lblResultadoText.setText(txtAries);
                        lblImagen.setIcon(ariesR);
                    }else if(DIA > 20 && DIA < 31){
                        lblResultado.setText("TAURO");
                        lblResultadoText.setText(txtTauro);
                        lblImagen.setIcon(tauroR);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }break;
                case("Mayo") : {
                    
                    if (DIA > 0 && DIA < 22) {
                        lblResultado.setText("TAURO");
                        lblResultadoText.setText(txtTauro);
                        lblImagen.setIcon(tauroR);
                    }else if(DIA > 21 && DIA < 32){
                        lblResultado.setText("GEMINIS");
                        lblResultadoText.setText(txtGeminis);
                        lblImagen.setIcon(geminisR);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }break;
                case("Junio") : {
                    
                    if (DIA > 0 && DIA < 22) {
                        lblResultado.setText("GEMINIS");
                        lblResultadoText.setText(txtGeminis);
                        lblImagen.setIcon(geminisR);
                    }else if(DIA > 21 && DIA < 31){
                        lblResultado.setText("CANCER");
                        lblResultadoText.setText(txtCancer);
                        lblImagen.setIcon(cancerR);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }break;
                case("Julio") : {
                    
                    if (DIA > 0 && DIA < 23) {
                        lblResultado.setText("CANCER");
                        lblResultadoText.setText(txtCancer);
                        lblImagen.setIcon(cancerR);
                    }else if(DIA > 22 && DIA < 32){
                        lblResultado.setText("LEO");
                        lblResultadoText.setText(txtLeo);
                        lblImagen.setIcon(leoR);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }break;
                case("Agosto") : {
                    
                    if (DIA > 0 && DIA < 24) {
                        lblResultado.setText("LEO");
                        lblResultadoText.setText(txtLeo);
                        lblImagen.setIcon(leoR);
                    }else if(DIA > 22 && DIA < 32){
                        lblResultado.setText("VIRGO");
                        lblResultadoText.setText(txtVirgo);
                        lblImagen.setIcon(virgoR);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }break;
                case("Septiembre") : {
                    
                    if (DIA > 0 && DIA < 24) {
                        lblResultado.setText("VIRGO");
                        lblResultadoText.setText(txtVirgo);
                        lblImagen.setIcon(virgoR);
                    }else if(DIA > 23 && DIA < 31){
                        lblResultado.setText("LIBRA");
                        lblResultadoText.setText(txtLibra);
                        lblImagen.setIcon(libraR);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }break;
                case("Octubre") : {
                    
                    if (DIA > 0 && DIA < 24) {
                        lblResultado.setText("LIBRA");
                        lblResultadoText.setText(txtLibra);
                        lblImagen.setIcon(libraR);
                    }else if(DIA > 23 && DIA < 32){
                        lblResultado.setText("ESCORPIO");
                        lblResultadoText.setText(txtEscorpio);
                        lblImagen.setIcon(escorpioR);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }break;
                case("Noviembre") : {
                    
                    if (DIA > 0 && DIA < 23) {
                        lblResultado.setText("ESCORPIO");
                        lblResultadoText.setText(txtEscorpio);
                        lblImagen.setIcon(escorpioR);
                    }else if(DIA > 22 && DIA < 31){
                        lblResultado.setText("SAGITARIO");
                        lblResultadoText.setText(txtSagitario);
                        lblImagen.setIcon(sagitarioR);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }break;
                case("Diciembre") : {
                    
                    if (DIA > 0 && DIA < 23) {
                        lblResultado.setText("SAGITARIO");
                        lblResultadoText.setText(txtSagitario);
                        lblImagen.setIcon(sagitarioR);
                    }else if(DIA > 22 && DIA < 32){
                        lblResultado.setText("CAPRICORNIO");
                        lblResultadoText.setText(txtCapricornio);
                        lblImagen.setIcon(capricornioR);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Haz ingresado valores invalidos. Intenta de nuevo.");
                    }
                }break;
            }
        }
    };
    
    
            
    public void selectorData(){
        selectMes.add(meses[0]);
        selectMes.add(meses[1]);
        selectMes.add(meses[2]);
        selectMes.add(meses[3]);
        selectMes.add(meses[4]);
        selectMes.add(meses[5]);
        selectMes.add(meses[6]);
        selectMes.add(meses[7]);
        selectMes.add(meses[8]);
        selectMes.add(meses[9]);
        selectMes.add(meses[10]);
        selectMes.add(meses[11]);
        
        for(int i = 1; i<=31; i++){
            selectDia.add(""+i);
        }
    }
    
    public void agregarDataElements(){
        dataPanel.add(btnConsultar);
        btnConsultar.addActionListener(consultar);
        dataPanel.add(lblBienvenido);
        dataPanel.add(lblDia);
        dataPanel.add(lblMes);
        dataPanel.add(selectMes);
        dataPanel.add(selectDia);   
    }

    public void agregarResultElements(){
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataPanel = new javax.swing.JPanel();
        selectMes = new java.awt.Choice();
        selectDia = new java.awt.Choice();
        lblBienvenido = new java.awt.Label();
        lblMes = new java.awt.Label();
        lblDia = new java.awt.Label();
        lblInstruccion = new java.awt.Label();
        btnConsultar = new javax.swing.JButton();
        resultPanel = new javax.swing.JPanel();
        lblResultado = new java.awt.Label();
        lblImagen = new javax.swing.JLabel();
        lblResultadoText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Signos Zodiaco Java GUI");
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 450));
        setSize(new java.awt.Dimension(700, 450));

        lblBienvenido.setAlignment(java.awt.Label.CENTER);
        lblBienvenido.setBackground(new java.awt.Color(0, 0, 0));
        lblBienvenido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setText("Bienvenido al Sistema");

        lblMes.setAlignment(java.awt.Label.CENTER);
        lblMes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMes.setText("Mes de Nacimiento:");

        lblDia.setAlignment(java.awt.Label.CENTER);
        lblDia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDia.setText("Dia de Nacimiento:");

        lblInstruccion.setAlignment(java.awt.Label.CENTER);
        lblInstruccion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblInstruccion.setText("Para conocer su signo Zodiacal, por favor ingrese los datos soliditados.");

        btnConsultar.setLabel("Consultar Signo");

        javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
        dataPanel.setLayout(dataPanelLayout);
        dataPanelLayout.setHorizontalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstruccion, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMes, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(selectMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDia, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(selectDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dataPanelLayout.setVerticalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addComponent(lblBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectMes, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(selectDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(dataPanel, java.awt.BorderLayout.NORTH);

        lblResultado.setAlignment(java.awt.Label.CENTER);
        lblResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblImagen.setIconTextGap(1);

        lblResultadoText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
                .addContainerGap()
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResultadoText, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResultadoText, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(resultPanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(714, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

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
