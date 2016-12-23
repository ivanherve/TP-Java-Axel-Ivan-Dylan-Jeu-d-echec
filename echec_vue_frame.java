package echec_vue;
import javax.swing.*;
import echec_controller.*;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class echec_vue_frame implements Observer {
	
 /*
	* Variable
	*/
	
	private JButton Start;
	private JButton Restart;
	private JFrame echec;
	private JPanel panel_Start;
	private JLabel fndEcran;
	private initduJeu plateaudj;

	public echec_vue_frame() {
		
	 /*
		* Création de la fenetre d'acceuil
		*/
		
		// TODO Auto-generated constructor stub
		echec = new JFrame("Jeu d'Echec");
		echec.setTitle("Jeu d'Echec");
		echec.setSize(950, 550);
		Start = new JButton("Commencer");
		Restart = new JButton("Recommencer");
		panel_Start = new JPanel();
		panel_Start.add(Start);
		fndEcran = new JLabel();
		fndEcran.setOpaque(false);
		fndEcran.setLayout(new FlowLayout());
		fndEcran.setIcon(new ImageIcon("C:\\Users\\Axel\\Desktop\\echecBckg.jpg"));
		fndEcran.setLayout(new BorderLayout());
		echec.add(fndEcran);
		echec.add(panel_Start);
		panel_Start.setLayout(new FlowLayout());
		plateaudj = new initduJeu();
		plateaudj.getFrame().getContentPane().add(new initduJeu());
		echec.setVisible(true);
		Start.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				plateaudj.getFrame().setVisible(true);
				
				}
		});	
													
			Restart.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
				
				}
			});														
		echec.setVisible(true);
		echec.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		echec.getContentPane().add(panel_Start, BorderLayout.CENTER);
		
	}

	

	public static void main(String[] args) {
		
		
		
	}


	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
