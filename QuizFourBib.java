package qu.iz;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
	
	public class QuizFourBib extends JDialog implements ActionListener {
		public static final long serialVersionUID = 1L;
	

		
		int	score = 0;
        
        ButtonGroup group = new ButtonGroup();
        JButton btnOk = new JButton("", new ImageIcon("BreakableCoordinatedGosling-small.gif"));
        JButton exit = new JButton("", new ImageIcon("exit.1.jpg"));
        
    	List<Question> questions = new ArrayList<Question>();
            
 
        public QuizFourBib(){
            super();
            setModal(true);
         	
            
            setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
            this.setUndecorated(true);
            this.addMouseListener(new MouseAdapter()
            {
               public void mousePressed(MouseEvent e)
               {
                  posX=e.getX();
                  posY=e.getY();
               }
            });
            this.addMouseMotionListener(new MouseAdapter()
            {
                 public void mouseDragged(MouseEvent evt)
                 {
            		//sets frame position when mouse dragged			
            		setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
            					
                 }
            });
            
            btnOk.addActionListener(new ActionListener(){
            	
            	
                public void actionPerformed(ActionEvent e) {
                	
                                          
                    setVisible(false);
                }
            });
            
     	   
            
            questions.add(new Question("<html>Die Marketing-Entscheidungen der Frankfurter Bremsen AG basieren auf Daten, die aus vielen Informationsquellen stammen.<br/> Bei welcher Quelle handelt & sich um eine externe Informationsquelle?</html>", 
            		new String[]{"ABC-Analyse", "Auftragsstatistik", "Fachzeitschriften", "Lieferantendatei", "Marktberichte der Handlungsreisenden"}, 
            		"Fachzeitschriften"));
            		
            questions.add(new Question("Welche Ma??nahme geh??rt NICHT zu den Aufgabenbereichen des Marketing?", 
            		new String[]{"Die Produktpolitik", "Die Preispolitik", "Die Service und Konditionenpolitik", "Die Gewinnanalysen", "Die Vertriebspolitik"}, 
            		"Die Gewinnanalysen"));
       
            questions.add(new Question("Was ist unter dem Begriff Diversifikation zu verstehen??  ", 
            		new String[]{"Verbreiterung des Sortiments durch neue, andersartige, bisher nicht angebotene Produktgruppen ", "Bereinigung des Programms durch Herausnahme von Produkten bzw. Produktgruppen", "Umstellen des Fertigungsprogrammes auf wenige Produkte", "Erweiterung einer bereits angebotenen Produktgruppe", "Ver??nderung bereits eingef??hrter Produkte"}, 
            		"Verbreiterung des Sortiments durch neue, andersartige, bisher nicht angebotene Produktgruppen "));
          
            questions.add(new Question("  Was versteht man in der Marktforschung unter einem repr??sentativen Querschnitt??  ", 
            		new String[]{"Eine Auswahl typischer Erzeugnisse eines Produktionsunternehmens", "Eine Auswahl der besten Erzeugnisse eines Industrieunternehmens", "Einen Vergleich des Umsatzes eines Produktes mit dem Gesamtumsatz", "Eine Auswahl m??glicher K??ufer, die nach Geschlecht, Alter und Kaufkraft mit dem gesamten Abnehmerkreis vergleichbar ist", "Eine willk??rliche Auswahl m??glicher K??ufer" }, 
            		"Eine Auswahl m??glicher K??ufer, die nach Geschlecht, Alter und Kaufkraft mit dem gesamten Abnehmerkreis vergleichbar ist"));
    
            questions.add(new Question("Welche Aussage ??ber die Marktanalyse ist richtig", 
            		new String[]{"Sie will mit Mitteln der Psychologie und der Soziologie herausfinden, welche bewussten oder unbewussten Gr??nde die Kaufentscheidungen der Kunden beeinflussen", "Sie versucht durch Befragungen die Konsumgewohnheiten der K??ufer zu erfassen", "Sie untersucht den Markt zu einem gegebenen Zeitpunkt und gibt ein Bild der Marktlage n diesem Augenblick", "Sie stellt Ver??nderungen der volkswirtschaftlichen Daten fest", "Sie umfasst alle Ma??nahmen, die sich daraufrichten, die Meinung und die Entscheidung eines anderen zugunsten des Werbenden zu beeinflussen"}, 
            		"Sie untersucht den Markt zu einem gegebenen Zeitpunkt und gibt ein Bild der Marktlage n diesem Augenblick"));
           
            questions.add(new Question("<html>Um den Absatz im Ausland zu f??rdern, entschlie??t sich die Textilwerke AG, eine r??umliche Preisdifferenzierung vorzunchmen.<br/> Welches Beispiel beschreibt diese Ma??nahme</html>?", 
            		new String[]{"Bettw??sche aus auslaufenden Serien wird ??berall billiger angeboten", "Tischw??sche wird in England in anderen Ausf??hrungen angeboten als in Holland", " Bettw??sche wird im Herbst teurer angeboten als sonst im Jahr", "Tischw??sche wird in Holland billiger angeboten als ??n Belgien", "Bettw??sche aus einer neu entwickelten Kunstfaser wird mit einem hohen Preis eingef??hrt", "Tisch und Bettw??sche wird in verschiedenen Qualit??ten und Preisen angeboten"}, 
            		"Tischw??sche wird in Holland billiger angeboten als ??n Belgien"));
         
            questions.add(new Question("Welche Aussage ??ber Mengen und Preispolitik als absatzpolitische Ma??nahme ist richtig???", 
            		new String[]{"Durch Gew??hrung von Sonderrabatten kann der Absatz zu Lasten des Gewinns je St??ck erh??ht werden", "tarre Preispolitik wirkt sich auf den Absatz nicht aus, da es nur aufdie Qualit??t der Ware ankommt", "Rabatte und Skonti sind als Instrumente zur Ausweitung des Absatzes ungeeignet", "Durch Rabattgew??hrung kann der Absatz gesteigert werden; das Betriebsergebnis wird hierdurch nicht ber??hrt", "Die Entwicklung des Absatzes ist von der Preispolitik in der Regel unabh??ngig"}, 
            		"Durch Gew??hrung von Sonderrabatten kann der Absatz zu Lasten des Gewinns je St??ck erh??ht werden"));
                  
            questions.add(new Question("<html>Welche Voraussetzung muss gegeben sein,<br/> damit ein Unternehmen eine r??umliche Preisdifferenzierung durchf??hren kann?</html>", 
            		new String[]{"Die Produkte m??ssen unterschiedlich verwendet werden k??nnen", "Die Produkte miissen in unterschiedlichen Qualit??tsstufen hergestellt werden ???k??nnen", "Die Teilm??rkte m??ssen sich regional abgrenzen lassen", "Zwischen den einzelnen Teilm??rkten mu?? eine m??glichst gro??e Markttransparenz bestehen", " Die Transportkosten m??ssen unterschiedlich hoch sein"}, 
            		"Die Teilm??rkte m??ssen sich regional abgrenzen lassen"));

            questions.add(new Question("<html>Em Industriebetrieb fertigt N??hmaschinen f??r Industrie und Haushalt<br/>im Unternehmen werden folgende absatzf??rdernde Ma??nahmen diskutiert.<br/> Welche Ma??nahme verst????t gegen gesetzliche Vorschriften???</html>", 
            		new String[]{"Die neue Haushaltsn??hmaschine Electronica soll im Versandhaus mit einem Sonderrabatt von 25% angeboten werden", "in einer Fachzeitschrift f??r die Textilund Bekleidungsindustrie soll diese Anzeige erscheinen: Die neue Electronica ist die beste, die esje gab. Bitte vergleichen Sie!", "im Gesch??ftsbericht f??r das abgelaufene Wirtschaftsjahr soll der hohe Marktanteil des Unternehmens f??r Industrien??hmaschinen aufdem deutschen Markt ver??ffentlicht werden","Den Einzelh??ndlern soll mitgeteilt werden, dass Ihnen die neue Haushaltsn??hmaschine Elektronica nur geliefert wird, wenn Sie das Ger??t f??r 950,??? weiterverkaufen","F??r die N??hmaschinen soll erstmals auch der ausl??ndische Markt erschlossenwerden. Dabei entf??llt die Mehrwertsteuer"}, 
            		"Den Einzelh??ndlern soll mitgeteilt werden, dass Ihnen die neue Haushaltsn??hmaschine Elektronica nur geliefert wird, wenn Sie das Ger??t f??r 950,??? weiterverkaufen"));
          
            
            questions.add(new Question(" Welchen Aussage kennzeichnet den Begriff Marktprognose?", 
            		new String[]{"Der Markt f??r Rasenm??her wird z. Z. von 5 Herstellern beherrscht, die zusammen einen Marktanteil von 9 ??o besitzen",
            				"Die Vorteile des Modells RM Ill liegen ??n der auch f??r Hausfrauen einfachen Bedienung",
            				"Das Modell RM TI wird k??nftig auch im Ausland einen gr????eren K??uferkreis ansprechen, wenn die Verkaufspreise nicht erh??ht werden",
            				"Alle H??ndler f??r den \"RM IIl\"-Rasenm??her sind im Branchenverzeichnis der Telefon b??cher verzeichnet.",
            				"Der Trend zum Elektrorasenm??her hat sich im vergangenen Jahr wiederum best??tigt"}, 
            		"Das Modell RM TI wird k??nftig auch im Ausland einen gr????eren K??uferkreis ansprechen, wenn die Verkaufspreise nicht erh??ht werden"));
        
            
            questions.add(new Question("<html>Dem Warengesch??ft zwischen einem Wiesbadener Lieferer und einem M??nchner Kunden liegt neben anderen Vereinbarungen die Lieferbedingung:<br/>  frei Haus<br/>  zugrunde. ??ber den Erf??llungsort und den Gefahren??bergang wurden keine Vereinbarungen getroffen.<br/>  Welche rechtliche Wirkung hat die Vereinbarung grei Haus auf den Erf??llungsort und den Gefahren??bergang?</html>", 
            		new String[]{"Die Vereinbarung frei Haus hat aufden Erf??llungsort keinen Einfluss; durch sie ???wird nur der Gefahren??bergang nach M??nchen verlegt",
            				"Die Bestimmung \"frei Haus\" hat keinen Einfluss aufErf??llungsort und Gefahren??bergang, sie regelt nur die ??bernahme der Transportkosten",
            				"Durch die Lieferbedingung \"frei Haus\" werden Erf??llungsort und Gefahren??bergang nach M??nchen verlegt",
            				"Erf??llungsort und Gefahren??bergang befinden sich trotz der Vereinbarung \"frei Haus\" gem???? den gesetzlichen Bestimmungen des BGB in M??nchen",
            				"Durch die Vereinbarung \"frei Haus??? wird der Erf??llungsort nach M??nchen verlegt, der Gefahren??bergang jedoch ist weiterhin in Wiesbaden. "}, 
            		"Die Bestimmung \"frei Haus\" hat keinen Einfluss aufErf??llungsort und Gefahren??bergang, sie regelt nur die ??bernahme der Transportkosten"));
        
            
            questions.add(new Question("95 % aller Haushalte haben einen K??hlschrank ... Welche Aussage ??ber Absatzm??glichkeiten l????t sich daraus ableiten?", 
            		new String[]{"1% der Markt einen hohen S??ttigungsgrad erreicht hat, sollten keine K??hlschr??nke mehr produziert werden",
            				"K??nftig k??nnen j??hrlich nur noch 5 % Umsatzsteigerung erreicht werden",
            				"Der Markt ist w??hrend der n??chsten 10 Jahre f??r die Marktf??hrer absolut uninteressant",
            				"Man kann von dieser Zahl nicht ableiten, dass K??hlschr??nke generell unverk??uflich geworden sind",
            				"Auch mit Billigst-Angeboten ist nichts mehr zu verkaufen"}, 
            		"Man kann von dieser Zahl nicht ableiten, dass K??hlschr??nke generell unverk??uflich geworden sind"));
          
            questions.add(new Question("<html> Welchen Einfluss hat das kaufm??nnische Mahnverfahren auf die Verj??hrung von Forderungen <br/> aus zweiseitigen Handelsgesch??ften?</html>", 
            		new String[]{"Es hat keinen Einfluss auf die Verj??hrung",
            				"Die Verj??hrung wird unterbrochen",
            				"Die Verj??hrung wird gehemmt",
            				"Die Forderung verj??hrt",
            				"Die Verj??hrungsfrist wird von 2 auf4 Jahre verl??ngert"}, 
            		"Die Verj??hrung wird gehemmt"));
            
            questions.add(new Question("Was wird unter Marketing-Mix verstanden?", 
            		new String[]{"Die horizontale Aufgliederung der Absatzm??rkte f??r die verschiedenen Produktarten",
            				"Der Einsatz eines absatzpolitschen Instruments, abgestimmt aufdie verschiedenen Produktarten",
            				"Der Verkaufder verschiedenen Produkte zu unterschiedlichen Preisen aufmehreren M??rkten",
            				"Der kombinierte Einsatz verschiedener Marketing-Instrumente",
            				"Der Verkauf verschiedener Produktarten ??ber differenzierte Absatzwege aufden verschiedenen M??rkten"}, 
            		"Der kombinierte Einsatz verschiedener Marketing-Instrumente"));
            
            questions.add(new Question("Welche Aussage ??ber die Sekund??rerbebung ist richtig", 
            		new String[]{"Im Rahmen der Sekund??rerhebung wird f??r andere Zwecke erhobenes und aufbereitetes Material ausgewertet",
            				"Nur die Sekund??rerhebung dient als Grundlage f??r die amtlichen Statistiken",
            				"Die Sekund??rerhebung wird insbesondere in Form von Befragungen und Beobachtungen durchgef??hrt",
            				"Die Sekund??rerhebung liefert stets die genaueren Ergebnisse als die Prim??rerhebung",
            				"Die Sekund??rerhebung ist im allgemeinen teurer und aufw??ndiger als die Prim??rerhebung"}, 
            		"Im Rahmen der Sekund??rerhebung wird f??r andere Zwecke erhobenes und aufbereitetes Material ausgewertet"));
         
        }
        public int startQuiz(){
            int score=0;
            for (Question quizM : questions){
                displayQuestion(quizM);
                if (group.getSelection().getActionCommand().equals(quizM.getCorrectAnswer())){
                                  
                	 JOptionPane.showMessageDialog(null,"Kooooorekt","Richtig",JOptionPane.INFORMATION_MESSAGE); 
                	
                    score++;
                    
                }else if (group.getSelection().getActionCommand().equals(null))
                {
                	JOptionPane.showMessageDialog(null, "", "Bitte Antwort w??hlen", JOptionPane.ERROR_MESSAGE);	
                	
                }
                
                else JOptionPane.showMessageDialog(null, quizM.getCorrectAnswer(), "Die richtige Antwort w??hre...", JOptionPane.ERROR_MESSAGE);
                
            }
            dispose();
            return score;           
        }
         int posX=0;
     		 int posY=0;
     
        
        private void displayQuestion(Question quizM){
         
            getContentPane().removeAll();
            for (Enumeration<?> buttonGroup=group.getElements(); buttonGroup.hasMoreElements(); ){
            	           	
                group.remove((AbstractButton)buttonGroup.nextElement());
               
            }
         
            JLabel questionText = new JLabel(quizM.getQuestion());

            ImageIcon icon = new ImageIcon("fr.jpg");    
            icon = new ImageIcon(icon.getImage().getScaledInstance(150, 100, BufferedImage.SCALE_SMOOTH));
            questionText.setIcon(icon);
            Font font = new Font("Consolas", Font.BOLD, 22);
            Font font1 = new Font("Arial", Font.BOLD, 16);
            questionText.setFont(font);
            questionText.setForeground(Color.yellow);
            questionText.setAlignmentX(CENTER_ALIGNMENT);
       
            getContentPane().setBackground(Color.black);
            getContentPane().add(questionText);
            for (String answer : quizM.getAnswers()){
            	
                JRadioButton radio = new JRadioButton(answer);
                radio.setActionCommand(answer);
                radio.setFont(font1);
                radio.setForeground(Color.WHITE);
                radio.setBackground(Color.black);
                radio.setAlignmentX(CENTER_ALIGNMENT);
                       
                group.add(radio);
                getContentPane().setBackground(Color.black);
               
             
                getContentPane().add(radio);
            }
            getContentPane().add(btnOk);
            btnOk.setOpaque(false);
            btnOk.setBackground(new Color(0,0,0,0));
            btnOk.setBorderPainted(false);
            btnOk.setAlignmentX(CENTER_ALIGNMENT);
            
            getContentPane().add(exit);
            exit.setOpaque(false);
            exit.setBackground(new Color(0,0,0,0));
            exit.setBorderPainted(false);
            exit.setAlignmentX(CENTER_ALIGNMENT);
            exit.addActionListener(this);
            pack();
            setVisible(true);        
            
        }
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == this.exit) {
				System.exit(0);
			}			
		}    
	}


		 
	   
	  
	  
	  	
    