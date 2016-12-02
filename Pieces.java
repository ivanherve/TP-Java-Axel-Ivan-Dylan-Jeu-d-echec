/**
 * 
 */
package echiquier;

/**
 * @author ASUS R511LJ
 *
 */
public class piece {
    private int xP ; /*le xPosition*/
    private int yP ; /*le yPosition*/
    private boolean peuxBouger ;  /*si la piece peux bouger(false en cas de echec ou echec et mat)*/
    private int idC ;       /*id de la couleur 0 = blanc , 1 = noir */
    private boolean enVie ; /*si la piece est en vie ou pas  ,  true = en vie , false est morte */
     
    
	public int getxP() {
		return xP;
	}

	public void setxP(int xP) {
		this.xP = xP;
	}

	public int getyP() {
		return yP;
	}
    
	
	/* constructeur de piece de base*/
	public piece(int xP, int yP, int idC ) {
		this.xP = xP;
		this.yP = yP;
		this.peuxBouger = true ;
		this.idC = idC;
		this.enVie =  true ; 
	}

	public boolean isEnVie() {
		return enVie;
	}

	public void setEnVie(boolean enVie) {
		this.enVie = enVie;
	}

	public void setyP(int yP) {
		this.yP = yP;
	}

	public boolean isPeuxBouger() {
		return peuxBouger;
	}

	public void setPeuxBouger(boolean peuxBouger) {
		this.peuxBouger = peuxBouger;
	}

	public int getIdC() {
		return idC;
	}

	public void setIdC(int idC) {
		if(idC == 0 || idC == 1){
		this.idC = idC;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

