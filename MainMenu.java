package qu.iz;


	import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;

	public class MainMenu extends JFrame implements ActionListener {
	
		public static void main(String[] args){
		    
	
			/*
			 *  Hauptmen� zum ausw�hlen der Pr�fung
			 */
			
			Einlog frame = new Einlog();
			frame.setSize(600,200);
			frame.setVisible(true);	
			}
		 		  		
		public static final long serialVersionUID = 1L;
	    
			int posX=0;
			int posY=0;
			
		   JButton exit;
	       JButton WISO;
	       JButton WebSysteme;    
	       JButton Regestry;
	       JButton HTML;
	       JButton Virtualisierung;
	       JPanel panel;
	
	  MainMenu() 
	  {super();
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
		  
		  
		  
	       exit = new JButton("",new ImageIcon("exit.1.jpg"));
		   exit.setMnemonic('O');
	       exit.setOpaque(false);
	       exit.setBackground(new Color(0,0,0,0));
	       exit.setBorderPainted(false);
	       add(exit);
	
		   ImageIcon animatedGif;
		  
		   WISO = new JButton("", new ImageIcon("WISO_Static.png"));
		   WISO.setBorderPainted(false);
		   WISO.setOpaque(true);
		   WISO.setMnemonic('O');
		   WISO.setBackground(Color.darkGray);
		   WISO.setRolloverEnabled(true);
   
		   animatedGif = new ImageIcon("WISO1.gif");
		   add(WISO);
		   WISO.setRolloverIcon(animatedGif);
		   
		   
		   WISO.addMouseListener(new MouseAdapter() {
    	
          @Override
          public void mouseEntered(MouseEvent e) {
              animatedGif.getImage().flush();
          }}
      );
		   
		   ImageIcon animatedGif1;
		   WebSysteme=new JButton("", new ImageIcon("Web_Static.png"));
		   WebSysteme.setBorderPainted(false);
		   WebSysteme.setOpaque(true);
		   WebSysteme.setBackground(Color.darkGray);
		   animatedGif1 = new ImageIcon("web2.gif");
		   add(WebSysteme);
		   WebSysteme.setRolloverIcon(animatedGif1);
		   WebSysteme.addMouseListener(new MouseAdapter() {
    	
          @Override
          public void mouseEntered(MouseEvent e) {
              animatedGif.getImage().flush();
          }}
      );

		ImageIcon animatedGif2;
      	Regestry = new JButton("", new ImageIcon("reg_Static.png"));
	    Regestry.setMnemonic('O');
	    Regestry.setOpaque(true);
   	    Regestry.setBorderPainted(false);
	    Regestry.setBackground(Color.darkGray);
	    animatedGif2 = new ImageIcon("regestry1.gif");
        add(Regestry);
        Regestry.setRolloverIcon(animatedGif2);
        Regestry.addMouseListener(new MouseAdapter() {
    	
          @Override
          public void mouseEntered(MouseEvent e) {
              animatedGif.getImage().flush();
          }}
      );

      ImageIcon animatedGif3;
	  Virtualisierung=new JButton("", new ImageIcon("virt_Static.png"));
	  Virtualisierung.setMnemonic('O');
	  Virtualisierung.setOpaque(true);
	  Virtualisierung.setBorderPainted(false);
	  Virtualisierung.setBackground(Color.darkGray);
	  animatedGif3 = new ImageIcon("virt.gif");
      add(Virtualisierung);
      Virtualisierung.setRolloverIcon(animatedGif3);
      Virtualisierung.addMouseListener(new MouseAdapter() {
    	
          @Override
          public void mouseEntered(MouseEvent e) {
              animatedGif.getImage().flush();
          }}
      );

      ImageIcon animatedGif4;
	  HTML = new JButton("", new ImageIcon("htm_stat.png"));
	  HTML.setMnemonic('O');
	  HTML.setOpaque(true);
	  HTML.setBorderPainted(false);
	  HTML.setBackground(Color.darkGray);
	  animatedGif4 = new ImageIcon("html.gif");
      add(HTML);
      HTML.setRolloverIcon(animatedGif4);
      HTML.addMouseListener(new MouseAdapter() {
    	
          @Override
          public void mouseEntered(MouseEvent e) {
              animatedGif.getImage().flush();
          }}
      );

	  
	  panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
	  panel.setOpaque(true);
	  panel.setBackground(Color.darkGray);
	  panel.setForeground(Color.darkGray);
	  
	  panel.add(WISO);
	  panel.add(WebSysteme);
	  panel.add(HTML);
	  panel.add(Regestry);
	  panel.add(Virtualisierung);	
	  panel.add(exit);	
	  add(panel);
	  WISO.addActionListener(this);
	  
	  
	  WebSysteme.addActionListener(this);
	  setTitle("Web.");
	  this.setUndecorated(true);
		 
	  Regestry.addActionListener(this);
	  setTitle("Reg.");
	  this.setUndecorated(true);
	  
	  HTML.addActionListener(this);
	  setTitle("htl.");
	  this.setUndecorated(true);
	  
	  exit.addActionListener(this);
	  setTitle("ex.");
	  this.setUndecorated(true);
	  pack();
}


	@Override	
	/*
	 *  ActionEvents f�r Teststart
	 *  ist in Arbeit
	 */
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.WISO)
		{ 
			   
			setVisible(false);
			
 }
		if(e.getSource() == this.WebSysteme)
			
		{   

		if(e.getSource() == this.Regestry)
		{  
		}
		if(e.getSource() == this.Virtualisierung)
		{ 
			
			
		}
		if(e.getSource() == this.HTML)
		{ 
			
			
			
		}
		if(e.getSource() == this.exit)
		{ System.exit(0);
	}
	}}}