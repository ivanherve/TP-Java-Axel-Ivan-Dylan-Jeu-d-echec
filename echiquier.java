package echiquier;

public class echiquier {
		
		private int Xmin ; /*le Xminimal à attribuer à l'échiquier */
		private int Xmax ; /*le Xmaximal à attribuer à l'échiquier */
		private int Ymax ; /*le Ymaximal à attribuer à l'échiquier */
		private int Ymin ; /*le Yminimal à attribuer à l'échiquier */
		/*tableau d'objet des pieces */
		public pion [][] pion ;       
		public tour [][] tour ;
		public roi [][] roi ;
		public reine [][] reine ;
		public cavaliers [][] cavaliers ;
		public  fou [][] fou ;
		
		
		/**
		 * permet de retourne le Xmin 
		 * @return Xmin 
		 */
		public int getXmin() {
			return Xmin;
		}


		/**
		 *  permet de modifier le Xmin 
		 * @param xm (qui est le Xminimal qu'on veux mettre)
		 */
		public void setXmin(int xm) {
			Xmin = xm;
		}


		/**
		 *  permet de retourne le Xmax
		 * @return Xmax 
		 */
		public int getXmax() {
			return Xmax;
		}


		/**
		 * permet de modifier le Xmax
		 * @param xma (qui est le Xmaximal qu'on veux mettre)
		 */
		public void setXmax(int xma) {
			Xmax = xma;
		}


		/**
		 * permet de retourne le Ymax
		 * @return Ymax 
		 */
		public int getYmax() {
			return Ymax;
		}


		/**
		 * permet de modifier le Ymax
		 * @param yma (qui est le Ymaximal qu'on veux mettre)
		 */
		public void setYmax(int yma) {
			Ymax = yma;
		}


		/**
		 * permet de retourne le Ymin
		 * @return Ymin
		 */
		public int getYmin() {
			return Ymin;
		}


		/**
		 * permet de modifier le Ymin
		 * @param ymi (qui est le Yminimal qu'on veux mettre ) 
		 */
		public void setYmin(int ymi) {
			Ymin = ymi;
		}



		/*
		 *construteur d'un echiquier basique  
		 */
	    public echiquier (){
	    	this.Xmin = 0 ;
	    	this.Xmax = 7 ;
	    	this.Ymin = 0 ;
	    	this.Ymax = 7 ;
	    	pion =  new pion[32][1] ;
	    	
	    	for(int i =  0 ; i <= 7 ; i++  ){
          /* de la class Pion (xP , yP , idC , idP , iddlP)*/
	    		pion [i][0] = new pion(i, 1, 0 ,0 , i);
	       }
	       for (int i = 8 ; i<=15 ; i++){
	    	   pion[i][0] = new pion (i-8 , 6 ,1, 0 ,i);
	       }
	       fou = new fou [32][1] ;
	       fou [16][0] = new fou(2 , 0 , 0 , 1 , 16) ;
	       fou [17][0] = new fou(5 , 0 , 0 , 1 , 17) ;
	       fou [18][0] = new fou(2 , 7 , 1 , 1 , 18) ;
	       fou [19][0] = new fou(5 , 7 , 1 , 1 , 19) ;
	       cavaliers = new cavaliers [32][1] ;
	       cavaliers [20][0] = new cavaliers(1,0,0,2,20) ;
	       cavaliers [21][0] = new cavaliers(6,0,0,2,21);
	       cavaliers [22][0] = new cavaliers(1,7,1,2,22);
	       cavaliers [23][0] = new cavaliers(6,7,1,2,23);
	       tour = new tour [32][1] ;
	       tour [24][0] = new tour(0,0,0,3,24);
	       tour [25][0] = new tour(7,0,0,3,25);
	       tour [26][0] = new tour(0,7,1,3,26);
	       tour [27][0] = new tour(7,7,1,3,27);
	       reine = new reine [32][1] ;
	       reine [28][0] = new reine(3,0,0,4,28);
	       reine [29][0] = new reine(3,7,1,4,29);
	       roi = new roi [32][1] ;
	       roi[30][0] = new roi (4,0,0,5,30);
	       roi[31][0] = new roi (4,7,1,5,31);
	    }


	    

		/**
		 * @param args
		 */
		public static void main(String[] args) {
		}

	}




