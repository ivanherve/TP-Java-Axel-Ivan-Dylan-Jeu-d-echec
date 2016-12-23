package echec_controller;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import jeu_echec.*;

import javax.swing.ImageIcon;

public class initduJeu extends JPanel{
	
	/**
	 * Attribut
	 */
	private static final long serialVersionUID = -7248249855158747263L;
	private JFrame frame;
	private ImageIcon imgTourB, imgTourN, imgCavalierB, imgCavalierN, imgFouB, imgFouN, imgRoiB,
			  imgRoiN, imgReineB, imgReineN, imgPionB, imgPionN, imgCases ;
	private echiquier ech1 = new echiquier(); // tableau de piece

	private ImageIcon img = null;
	private Graphics2D g2;
	private int dimCase = 50;

	
	public JFrame getFrame(){
		return frame;
	}
	
	/* 
	 * Construction de l'échiquier 
	 * @param g
	 */
	public void paint(Graphics g){
		g2 = (Graphics2D) g;
		dimCase = 50;
		boolean estBlanc = true;
		g2.fillRect(100, 100, 400, 400);
		for (int i = 100; i <= 400; i+=100){
			for (int j=100; j<=400; j+=100){
				g2.clearRect(i, j, 50, 50);
				g2.fill(new Rectangle2D.Double((j+1)*dimCase, (i+1)*dimCase, dimCase, dimCase));
				//img.paintIcon(null, g2, (j+1)*dimCase, (i+1)*dimCase); 
			}
			estBlanc = !estBlanc;
			}
		estBlanc = !estBlanc;
		for(int i = 150; i <= 450; i += 100){
			for(int j = 150; j <= 450; j += 100){
				g.clearRect(i, j, 50, 50);
				g2.fill(new Rectangle2D.Double((j+1)*dimCase, (i+1)*dimCase, dimCase, dimCase));
			//	img.paintIcon(null, g2, (j+1)*dimCase, (i+1)*dimCase); 
			}
			estBlanc = !estBlanc;
		}	
		estBlanc = !estBlanc;
	}

	/*
	 * Création d'une nouvelle fenêtre
	 * 
	 */
	public initduJeu() {
		// TODO Auto-generated constructor stub
		frame = new JFrame();
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.lightGray);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(false);
		
		//Insertion d'Images de pieces
		imgTourB = new ImageIcon(getClass().getResource("/imgPiece/TourB.png"));
		imgTourN = new ImageIcon(getClass().getResource("/imgPiece/TourN.png"));
		imgCavalierB = new ImageIcon(getClass().getResource("/imgPiece/CavaliersB.png"));
		imgCavalierN = new ImageIcon(getClass().getResource("/imgPiece/CavaliersN.png"));
		imgFouB = new ImageIcon(getClass().getResource("/imgPiece/FouB.png"));
		imgFouN = new ImageIcon(getClass().getResource("/imgPiece/FouN.png"));
		imgRoiB = new ImageIcon(getClass().getResource("/imgPiece/RoiB.png"));
		imgRoiN = new ImageIcon(getClass().getResource("/imgPiece/RoiN.png"));
		imgReineB = new ImageIcon(getClass().getResource("/imgPiece/ReineB.png"));
		imgReineN = new ImageIcon(getClass().getResource("/imgPiece/ReineN.png"));
		imgPionB = new ImageIcon(getClass().getResource("/imgPiece/PionB.png"));
		imgPionN = new ImageIcon(getClass().getResource("/imgPiece/PionN.png"));
		
		//Placement des images(les pièces)
		img = null;
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				
					if(ech1.pion[i][0] == new piece(i, 6, 1)){ // position y = 6 ; idC = 1 donc Noir
						img = imgPionN;
					} else if (ech1.pion[i][0] == new piece(i, 1, 0)){
						img = imgPionB;
					} 
			}
				
				for(int k=24; k<28; k++){
					  for(int l=0; l<32; l++){
						if(ech1.tour[k][0]!=null){
							if(ech1.tour[k][0] == new tour(0,7,1,3,k) || ech1.tour[l][0] == new tour(0,7,1,3,l)){
								img = imgTourN;
							} else if(ech1.tour[k][0] == new tour(0,7,0,3,k) || ech1.tour[l][0] == new tour(7,0,1,3,l)){
									img = imgTourB;
								} 
							} 
					  	}
					  }
						
				for(int a=21; a<25; a++){
					for(int z=0; z<32; z++){
					if(ech1.cavaliers[a][0]!=null){
						if(ech1.cavaliers[a][0] == new cavaliers(6,7,1,2,23) || ech1.cavaliers[a][0]== new cavaliers(1,7,1,2,22)){
							img = imgCavalierN;
						} else if(ech1.cavaliers[a][0] == new cavaliers(1,0,0,2,20) ||ech1.cavaliers[a][0]==new cavaliers(6,0,0,2,21)){
								img = imgCavalierB;
								} 
							}
						}
					}
					
			for(int k=21; k<25; k++){
					for(int l=0; l<32; l++){
					if(ech1.fou[i][0]!=null){
						if(ech1.fou[i][0] == new fou(5 , 0 , 0 , 1 , 17)|| ech1.fou[i][0] == new fou(2 , 7 , 1 , 1 , 18)){
							img = imgFouN;
						} else if(ech1.fou[i][0] == new fou(2 , 0 , 0 , 1 , 16) ||ech1.fou[i][0] == new fou(5 , 7 , 1 , 1 , 19)){
								img = imgFouB;
							} 
					}
					}
				}
					
				for(int k=21; k<25; k++){
					for(int j=0; j<32; j++){
					if(ech1.roi[k][j]!=null){
						if(ech1.roi[k][j] == new piece(k, j, 1)){
							img = imgRoiN;
						} else if(ech1.roi[k][j] == new piece(k, j, 0)){
								img = imgRoiB;
							} 
					}
					}
				}
				for(int o=21; o<25; o++){
					for(int j=0; j<32; j++){
					if(ech1.reine[o][j]!=null){
						if(ech1.reine[o][j] == new piece(o, j, 1)){
							img = imgReineN;
						} else if(ech1.reine[o][j] == new piece(o, j, 0)){
								img = imgReineB;
							} 
					}
				}
						 // positions x = i et y = 1 ; idC = 1 donc Noir	
						
				
			} 
	}
   }
}