import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    JFrame FinestraPincipale;
    Container Contenitore;
    JPanel PanelloTitolo;
    JPanel  Textpannel;
    JLabel LableTitolo;
    Font TitoloFont = new Font("Algerian" , Font.BOLD, 80);
    Font FontBottone = new Font("Algerian" , Font.BOLD, 40);
    JButton BottoneInizio;
    JButton BottoneScelta1;
    JButton BottoneScelta2;
    JButton BottoneScelta3;
    JButton BottoneScelta4;
    JTextArea AreaDialogo;
    JPanel PanelloBottoni;
    JPanel PanelloStatistiche;
    JLabel vita;
    JLabel vitaQuantita;
    JLabel arma;
    JLabel armaNome;

    int VitaGiocatore ;
    int VitaMostro;
    int NucleoDiGolem;
    String ArmaGiocatore;
    String posizione;

    CambioScena Cs = new CambioScena();
    EventoScelta ES = new EventoScelta();

void main() {

    FinestraPincipale = new JFrame();
    FinestraPincipale.setSize(800 , 600);
    FinestraPincipale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FinestraPincipale.getContentPane().setBackground(Color.black);
    FinestraPincipale.setLayout(null);
    FinestraPincipale.setVisible(true);

    Contenitore = FinestraPincipale.getContentPane();

        PanelloTitolo = new JPanel();
        PanelloTitolo.setBounds(100 ,100 ,600 ,150 );
        PanelloTitolo.setBackground(Color.black);

        LableTitolo = new JLabel("ADVENTURE");
        LableTitolo.setForeground(Color.white);
        LableTitolo.setFont(TitoloFont);


        BottoneInizio = new JButton("START");
        BottoneInizio.setBounds(300, 400, 200,100);
        LableTitolo.setForeground(Color.white);
        BottoneInizio.setFont(FontBottone);
        BottoneInizio.addActionListener(Cs);

            PanelloTitolo.add(LableTitolo);
            Contenitore.add(PanelloTitolo);
            Contenitore.add(BottoneInizio);

}

public void GameScreen(){

    PanelloTitolo.setVisible(false);
    BottoneInizio.setVisible(false);

    Textpannel = new JPanel();
    Textpannel.setBounds(100 , 100 , 600,250);
    Textpannel.setBackground(Color.black);
    Contenitore.add(Textpannel);

    PanelloStatistiche = new JPanel();
    PanelloStatistiche.setBounds(10, 15 , 600, 50);
    PanelloStatistiche.setBackground(Color.black);
    PanelloStatistiche.setLayout(new GridLayout(1,2));
    Textpannel.add(PanelloStatistiche);

    vita = new JLabel("HP: ");
    vita.setFont(FontBottone);
    vita.setForeground(Color.white);
    PanelloStatistiche.add(vita);

    vitaQuantita = new JLabel();
    vitaQuantita.setFont(FontBottone);
    vitaQuantita.setForeground(Color.white);
    PanelloStatistiche.add(vitaQuantita);

    arma = new JLabel("Arma:");
    arma.setFont(FontBottone);
    arma.setForeground(Color.white);
    PanelloStatistiche.add(arma);

    armaNome = new JLabel();
    armaNome.setFont(FontBottone);
    armaNome.setForeground(Color.white);
    PanelloStatistiche.add(armaNome);



    AreaDialogo = new JTextArea("AREA PRINCIPALE");
    AreaDialogo.setBounds(100 , 100 , 600 ,250);
    AreaDialogo.setBackground(Color.black);
    AreaDialogo.setForeground(Color.white);
    AreaDialogo.setFont(FontBottone);
    AreaDialogo.setLineWrap(true);
    Textpannel.add(AreaDialogo);

    PanelloBottoni = new JPanel();
    PanelloBottoni.setBounds(250 , 350 , 300, 150);
    PanelloBottoni.setBackground(Color.black);
    PanelloBottoni.setLayout(new GridLayout(4, 1));
    Contenitore.add(PanelloBottoni);

        BottoneScelta1 = new  JButton("1");
        BottoneScelta1.setBounds(250 , 350 , 600 , 100);
        BottoneScelta1.setFont(FontBottone);
        BottoneScelta1.addActionListener(ES);
        BottoneScelta1.setActionCommand("c1");
        PanelloBottoni.add(BottoneScelta1);

        BottoneScelta2 = new  JButton("2");
        BottoneScelta2.setBounds(250 , 350 , 600 , 100);
        BottoneScelta2.setFont(FontBottone);
        BottoneScelta2.addActionListener(ES);
        BottoneScelta2.setActionCommand("c2");
        PanelloBottoni.add(BottoneScelta2);

        BottoneScelta3 = new  JButton("3");
        BottoneScelta3.setBounds(250 , 350 , 600 , 100);
        BottoneScelta3.setFont(FontBottone);
        BottoneScelta3.addActionListener(ES);
        BottoneScelta3.setActionCommand("c3");
        PanelloBottoni.add(BottoneScelta3);
        BottoneScelta1.setActionCommand("c1");

        BottoneScelta4 = new  JButton("4");
        BottoneScelta4.setBounds(250 , 350 , 600 , 100);
        BottoneScelta4.setFont(FontBottone);
        BottoneScelta4.addActionListener(ES);
        BottoneScelta4.setActionCommand("c4");
        PanelloBottoni.add(BottoneScelta4);

        Giocatore();
}
public void Giocatore(){
    VitaGiocatore = 80;
    VitaMostro = 16;
    ArmaGiocatore = "Pugnale";

    armaNome.setText(ArmaGiocatore);
    vitaQuantita.setText("" + VitaGiocatore);

    PorteDellaCitta();

}
public void PorteDellaCitta(){
    posizione = "PorteDellaCitta";
    AreaDialogo.setText("Guardia: Benvenuto alle porte della città");
    BottoneScelta1.setText("Parla alla Guardia");
    BottoneScelta2.setText("Combatti la Guardia");
    BottoneScelta3.setText("Vattene");
    BottoneScelta4.setText("");
}

    public void ParlaAllaGuardia(){
        posizione = "ParlaAllaGuardia";
        AreaDialogo.setText("Guardia: Non Accettiamo gli Estranei");
        BottoneScelta1.setText(">");
        BottoneScelta2.setText("");
        BottoneScelta3.setText("");
        BottoneScelta4.setText("");
    }

    public void CombattiLaGuardia(){
        posizione = "CombattiLaGuardia";
        AreaDialogo.setText("Guardia: Stai facendo un errore, stai indietro \n\n(Perdi 20 HP)");
        VitaGiocatore = VitaGiocatore - 20;
        vitaQuantita.setText("" + VitaGiocatore);
        BottoneScelta1.setText(">");
        BottoneScelta2.setText("");
        BottoneScelta3.setText("");
        BottoneScelta4.setText("");
    }

    public void Vattene(){
        posizione = "Vattene";
        AreaDialogo.setText("Sei al crocevia: \n\n (vai a Nord per tornare alle porte della città)");
        vitaQuantita.setText("" + VitaGiocatore);
        BottoneScelta1.setText("vai a Nord");
        BottoneScelta2.setText("vai a Sud");
        BottoneScelta3.setText("vai a Est");
        BottoneScelta4.setText("vai a Ovest");
    }

    public void Sud(){
        posizione = "Sud";
        AreaDialogo.setText("Trovi una locanda \n Locandiera:Tieni prendi una birra avventuriero \n(Recuperi 20 HP)");
        VitaGiocatore = VitaGiocatore + 20;
        vitaQuantita.setText("" + VitaGiocatore);
        BottoneScelta1.setText("Torna al crocevia");
        BottoneScelta2.setText("");
        BottoneScelta3.setText("");
        BottoneScelta4.setText("");
    }

    public void Est(){
    posizione = "Est";
    AreaDialogo.setText("Ti ritrovi davanti all'oceano: \n\n non puoi attraversarlo \n(torna indietro)");
        BottoneScelta1.setText("Torna al crocevia");
        BottoneScelta2.setText("");
        BottoneScelta3.setText("");
        BottoneScelta4.setText("");
    }

    public void Ovest(){
    posizione = "Ovest";
    VitaMostro = 16;
    AreaDialogo.setText("Un golem ti sbarra la strada:");
        BottoneScelta1.setText("Combatti");
        BottoneScelta2.setText("Fuggi");
        BottoneScelta3.setText("");
        BottoneScelta4.setText("");

    }

    public void Combattimento(){
    posizione = "Combattimento";
    AreaDialogo.setText("HP mostro: " + VitaMostro);
        BottoneScelta1.setText("Attacca");
        BottoneScelta2.setText("Fuggi");
        BottoneScelta3.setText("");
        BottoneScelta4.setText("");
    }

    public void AttaccoDelGiocatore(){
    posizione = "AttaccoDelGiocatore";
    int DannoDelGiocatore = 0;

    if (ArmaGiocatore.equals("Pugnale")){
        DannoDelGiocatore = new java.util.Random().nextInt(7);
    }

    AreaDialogo.setText("Hai inflitto " + DannoDelGiocatore + " danni");

     VitaMostro = VitaMostro - DannoDelGiocatore;

        BottoneScelta1.setText("Attacca");
        BottoneScelta2.setText("");
        BottoneScelta3.setText("");
        BottoneScelta4.setText("");
    }


    public void AttaccoDelMostro(){
    posizione = "AttaccoDelMostro";

    int DannoDelMostro = 0;

        DannoDelMostro = new java.util.Random().nextInt(8);

        AreaDialogo.setText("Hai subito " + DannoDelMostro + " danni");

        VitaGiocatore = VitaGiocatore - DannoDelMostro;
        vitaQuantita.setText("" + VitaGiocatore);

        BottoneScelta1.setText("Attacca");
        BottoneScelta2.setText("");
        BottoneScelta3.setText("");
        BottoneScelta4.setText("");
    }

    public void Vittoria(){
    posizione = "Vittoria";
    AreaDialogo.setText("Hai sconfitto il golem \n\n Il golem lascia terra il suo nucleo \n lo raccogli");

    NucleoDiGolem = 1;

        BottoneScelta1.setText("Vai ad est");
        BottoneScelta2.setText("");
        BottoneScelta3.setText("");
        BottoneScelta4.setText("");

    }

    public void Sconfitta(){
    posizione = "Sconfitta";

    AreaDialogo.setText("GAME OVER");

        BottoneScelta1.setText("");
        BottoneScelta2.setText("");
        BottoneScelta3.setText("");
        BottoneScelta4.setText("");
        BottoneScelta1.setVisible(false);
        BottoneScelta2.setVisible(false);
        BottoneScelta3.setVisible(false);
        BottoneScelta4.setVisible(false);

    }

    public void Finale(){
    posizione = "Finale";

    AreaDialogo.setText("Guardia: Oh hai sconfitto il golem \n Grazie avventuriero! \n\n <THE END>");

        BottoneScelta1.setText("");
        BottoneScelta2.setText("");
        BottoneScelta3.setText("");
        BottoneScelta4.setText("");
        BottoneScelta1.setVisible(false);
        BottoneScelta2.setVisible(false);
        BottoneScelta3.setVisible(false);
        BottoneScelta4.setVisible(false);
    }



public class CambioScena implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent event) {

        GameScreen();
    }

}

public class EventoScelta implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        String Scelta = actionEvent.getActionCommand();

        switch (posizione) {
            case "PorteDellaCitta":
                switch (Scelta) {
                    case "c1":
                        if (NucleoDiGolem == 1){
                            Finale();
                    } else {
                            ParlaAllaGuardia();
                        }
                        break;
                    case "c2": CombattiLaGuardia();break;
                    case "c3": Vattene();break;
                    case "c4":
                        break;

                }
                break;
            case "ParlaAllaGuardia":
                switch (Scelta) {
                    case "c1": PorteDellaCitta();break;
                }
                break;

            case "CombattiLaGuardia":
                switch (Scelta) {
                    case "c1":
                        if (VitaGiocatore == 0){
                            Sconfitta();
                        }
                        else{
                            PorteDellaCitta();break;
                        }
                }
                break;

            case "Vattene":
                switch (Scelta) {
                    case "c1": PorteDellaCitta();break;
                    case "c2": Sud();break;
                    case "c3": Est();break;
                    case "c4": Ovest();break;
                }
                break;

            case "Sud":
                switch (Scelta) {
                    case "c1": Vattene();break;
                }
                break;

            case "Est":
                switch (Scelta) {
                    case "c1": Vattene();break;
                }
                break;

            case "Ovest":
                switch (Scelta) {
                    case "c1": Combattimento();break;
                    case "c2": Vattene();break;
                }
                break;

            case "Combattimento":
                switch (Scelta) {
                    case "c1": AttaccoDelGiocatore();break;
                    case "c2": Vattene();break;
                }
                break;

            case "AttaccoDelGiocatore":
                switch (Scelta) {
                    case "c1":
                        if(VitaMostro < 1){
                            Vittoria();
                        }
                        else {
                            AttaccoDelMostro();
                        }
                        break;
                }
                break;

            case "AttaccoDelMostro":
                switch (Scelta) {
                    case "c1":

                        if (VitaGiocatore < 1) {
                            Sconfitta();
                        } else {
                            Combattimento();
                        }
                        break;
                }
                        break;

            case "Vittoria":
                switch (Scelta) {
                    case "c1": Vattene();break;
                    case "c2": break;
                }
                break;


        }

        }

    }
