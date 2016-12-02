/**
 * 
 */
package echiquier;

/**
 * @author ASUS R511LJ
 *
 */
public class pion extends piece {
      
	 private String nom ; /*le nom de la piece*/
	 private int idpiece ; /*id de la piece par exemple pion = 0 , fou = 1 et etc*/
	 private int idDeLaPiece ; /*id de la piece en elle meme*/
	 
	 /*construction d'un pion de base */
	public pion(int xP, int yP, int idC ,int idP , int iddlP) {
		super(xP,  yP ,  idC) ; 
		this.idpiece = idP ;
		this.nom = "pion" ;
		this.idDeLaPiece = iddlP ;
	}
    
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getIdpiece() {
		return idpiece;
	}

	public void setIdpiece(int idpiece) {
		this.idpiece = idpiece;
	}

	public int getIdDeLaPiece() {
		return idDeLaPiece;
	}

	public void setIdDeLaPiece(int idDeLaPiece) {
		this.idDeLaPiece = idDeLaPiece;
	}
	/*
	 * deplacement d'un pion blanche d'une seul case 
	 * @parem : x (la position x qu'on veux deplace) , y (la position y qu'on veux déplacer ) , ech1 (sur qu'elle echiquier on doit deplacer la piece )
	 * @return true ou false , si le deplacement est valider par tout les parametre en jeux , le mouvement est accepter , sinon refusé
	 * 
	 * */
	public boolean deplacementvalideB1(int x , int y , echiquier ech1) {
		/*verifie si la piece sort pas du plateau*/
		if (this.getxP()+ x > 7 || this.getxP() + x < 0 || this.getyP() + y  < 0 || this.getyP() + y  > 7 )
		  { return false ; } 
		/*verifie si c'est bon son tour et qu'il peux bouger*/
		if( joueur.getCompterebour()%2 != this.getIdC() || this.isPeuxBouger() == false  )
		  { return false ;}
		/*verifie si le deplacement est bon pour faire une case*/
		if( x != 0 || y != 1 || this.getIdC() != 0)
		{return false ; }
		/*verifie pour tout les pieces si une se trouve pas en face , car le pion ne peux manger de face , il sera bloquer donc interdit de bouger*/
		for(int i = 0 ; i <=15  ; i++ ){
	      if((ech1.pion[i][0].getxP() == this.getxP()+ x && ech1.pion[i][0].getyP() == (this.getyP()+y) && ech1.pion[i][0].isEnVie() ==  true )){
	         return false ; 
	      }				
		}
		for(int i = 16 ; i <=19  ; i++ ){
		      if((ech1.fou[i][0].getxP() == this.getxP()+ x && ech1.fou[i][0].getyP() == (this.getyP()+y) && ech1.fou[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i = 20 ; i <=23  ; i++ ){
		      if((ech1.cavaliers[i][0].getxP() == this.getxP()+ x && ech1.cavaliers[i][0].getyP() == (this.getyP()+y) && ech1.cavaliers[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i = 24 ; i <=27  ; i++ ){
		      if((ech1.tour[i][0].getxP() == this.getxP()+ x && ech1.tour[i][0].getyP() == (this.getyP()+y) && ech1.tour[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i =28  ; i <=29  ; i++ ){
		      if((ech1.reine[i][0].getxP() == this.getxP()+ x && ech1.reine[i][0].getyP() == (this.getyP()+y) && ech1.reine[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i = 30 ; i <=31  ; i++ ){
		      if((ech1.roi[i][0].getxP() == this.getxP()+ x && ech1.roi[i][0].getyP() == (this.getyP()+y) && ech1.roi[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
					 
					
		return true ;
	}
	
	
	/*
	 * deplacement d'un pion blanche de deux case 
	 * @parem : x (la position x qu'on veux deplace) , y (la position y qu'on veux déplacer ) , ech1 (sur qu'elle echiquier on doit deplacer la piece )
	 * @return true ou false , si le deplacement est valider par tout les parametre en jeux , le mouvement est accepter , sinon refusé
	 * 
	 * 
	 * 
	 * */
	public boolean deplacementvalideB2(int x , int y , echiquier ech1) {
		/*verifie que la piece demarre bien des cases y = 1  car le pion ne faire une mouvement de y+2 que si il est sur sa ligne d'origine*/
		if(this.getyP() != 1 ){
			return false ;
		}
		if (this.getxP()+ x > 7 || this.getxP() + x < 0 || this.getyP() + y  < 0 || this.getyP() + y  > 7 )
		  { return false ; } 
		if( joueur.getCompterebour()%2 != this.getIdC() || this.isPeuxBouger() == false  )
		  { return false ;}
		if( x != 0 || y != 2 || this.getIdC() != 0)
		{return false ; }
		for(int i = 0 ; i <=15  ; i++ ){
	      if((ech1.pion[i][0].getxP() == this.getxP()+ x && ech1.pion[i][0].getyP() == (this.getyP()+y) && ech1.pion[i][0].isEnVie() ==  true )){
	         return false ; 
	      }				
		}
		for(int i = 16 ; i <=19  ; i++ ){
		      if((ech1.fou[i][0].getxP() == this.getxP()+ x && ech1.fou[i][0].getyP() == (this.getyP()+y) && ech1.fou[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i = 20 ; i <=23  ; i++ ){
		      if((ech1.cavaliers[i][0].getxP() == this.getxP()+ x && ech1.cavaliers[i][0].getyP() == (this.getyP()+y) && ech1.cavaliers[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i = 24 ; i <=27  ; i++ ){
		      if((ech1.tour[i][0].getxP() == this.getxP()+ x && ech1.tour[i][0].getyP() == (this.getyP()+y) && ech1.tour[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i =28  ; i <=29  ; i++ ){
		      if((ech1.reine[i][0].getxP() == this.getxP()+ x && ech1.reine[i][0].getyP() == (this.getyP()+y) && ech1.reine[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i = 30 ; i <=31  ; i++ ){
		      if((ech1.roi[i][0].getxP() == this.getxP()+ x && ech1.roi[i][0].getyP() == (this.getyP()+y) && ech1.roi[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		
		/*je fais à nouveau une recherche car la piece  ne doit pas sauté une piece qui se trouve à son y+1 */
		for(int i = 0 ; i <=15  ; i++ ){
		      if((ech1.pion[i][0].getxP() == this.getxP() + x && ech1.pion[i][0].getyP() == (this.getyP()+(y-1)) && ech1.pion[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
			for(int i = 16 ; i <=19  ; i++ ){
			      if((ech1.fou[i][0].getxP() == this.getxP()+ x && ech1.fou[i][0].getyP() == (this.getyP()+y-1) && ech1.fou[i][0].isEnVie() ==  true )){
			         return false ; 
			      }				
				}
			for(int i = 20 ; i <=23  ; i++ ){
			      if((ech1.cavaliers[i][0].getxP() == this.getxP()+ x && ech1.cavaliers[i][0].getyP() == (this.getyP()+y-1) && ech1.cavaliers[i][0].isEnVie() ==  true )){
			         return false ; 
			      }				
				}
			for(int i = 24 ; i <=27  ; i++ ){
			      if((ech1.tour[i][0].getxP() == this.getxP()+ x && ech1.tour[i][0].getyP() == (this.getyP()+y-1) && ech1.tour[i][0].isEnVie() ==  true )){
			         return false ; 
			      }				
				}
			for(int i =28  ; i <=29  ; i++ ){
			      if((ech1.reine[i][0].getxP() == this.getxP()+ x && ech1.reine[i][0].getyP() == (this.getyP()+y-1) && ech1.reine[i][0].isEnVie() ==  true )){
			         return false ; 
			      }				
				}
			for(int i = 30 ; i <=31  ; i++ ){
			      if((ech1.roi[i][0].getxP() == this.getxP()+ x && ech1.roi[i][0].getyP() == (this.getyP()+y-1) && ech1.roi[i][0].isEnVie() ==  true )){
			         return false ; 
			      }				
				}
					 
					
		return true ;
	}
	/*
	*deplacement d'un pion noir de deux  case 
	*@parem : x (la position x qu'on veux deplace) , y (la position y qu'on veux déplacer ) , ech1 (sur qu'elle echiquier on doit deplacer la piece )
	*@return true ou false , si le deplacement est valider par tout les parametre en jeux , le mouvement est accepter , sinon refusé
	*/
	public boolean deplacementvalideN2(int x , int y , echiquier ech1) {
		if(this.getyP() != 6 ){
			return false ;
		}
		if (this.getxP()+ x > 7 || this.getxP() + x < 0 || this.getyP() + y  < 0 || this.getyP() + y  > 7 )
		  { return false ; } 
		if( joueur.getCompterebour()%2 != this.getIdC() || this.isPeuxBouger() == false  )
		  { return false ;}
		if( x != 0 || y != -2 || this.getIdC() != 1)
		{return false ; }
		for(int i = 0 ; i <=15  ; i++ ){
	      if((ech1.pion[i][0].getxP() == this.getxP()+ x && ech1.pion[i][0].getyP() == (this.getyP()+y) && ech1.pion[i][0].isEnVie() ==  true )){
	         return false ; 
	      }				
		}
		for(int i = 16 ; i <=19  ; i++ ){
		      if((ech1.fou[i][0].getxP() == this.getxP()+ x && ech1.fou[i][0].getyP() == (this.getyP()+y) && ech1.fou[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i = 20 ; i <=23  ; i++ ){
		      if((ech1.cavaliers[i][0].getxP() == this.getxP()+ x && ech1.cavaliers[i][0].getyP() == (this.getyP()+y) && ech1.cavaliers[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i = 24 ; i <=27  ; i++ ){
		      if((ech1.tour[i][0].getxP() == this.getxP()+ x && ech1.tour[i][0].getyP() == (this.getyP()+y) && ech1.tour[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i =28  ; i <=29  ; i++ ){
		      if((ech1.reine[i][0].getxP() == this.getxP()+ x && ech1.reine[i][0].getyP() == (this.getyP()+y) && ech1.reine[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i = 30 ; i <=31  ; i++ ){
		      if((ech1.roi[i][0].getxP() == this.getxP()+ x && ech1.roi[i][0].getyP() == (this.getyP()+y) && ech1.roi[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		
		
		for(int i = 0 ; i <=15  ; i++ ){
		      if((ech1.pion[i][0].getxP() == this.getxP() + x && ech1.pion[i][0].getyP() == (this.getyP()+(y+1)) && ech1.pion[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
			for(int i = 16 ; i <=19  ; i++ ){
			      if((ech1.fou[i][0].getxP() == this.getxP()+ x && ech1.fou[i][0].getyP() == (this.getyP()+y+1) && ech1.fou[i][0].isEnVie() ==  true )){
			         return false ; 
			      }				
				}
			for(int i = 20 ; i <=23  ; i++ ){
			      if((ech1.cavaliers[i][0].getxP() == this.getxP()+ x && ech1.cavaliers[i][0].getyP() == (this.getyP()+y+1) && ech1.cavaliers[i][0].isEnVie() ==  true )){
			         return false ; 
			      }				
				}
			for(int i = 24 ; i <=27  ; i++ ){
			      if((ech1.tour[i][0].getxP() == this.getxP()+ x && ech1.tour[i][0].getyP() == (this.getyP()+y+1) && ech1.tour[i][0].isEnVie() ==  true )){
			         return false ; 
			      }				
				}
			for(int i =28  ; i <=29  ; i++ ){
			      if((ech1.reine[i][0].getxP() == this.getxP()+ x && ech1.reine[i][0].getyP() == (this.getyP()+y+1) && ech1.reine[i][0].isEnVie() ==  true )){
			         return false ; 
			      }				
				}
			for(int i = 30 ; i <=31  ; i++ ){
			      if((ech1.roi[i][0].getxP() == this.getxP()+ x && ech1.roi[i][0].getyP() == (this.getyP()+y+1) && ech1.roi[i][0].isEnVie() ==  true )){
			         return false ; 
			      }				
				}
					 
					
		return true ;
	}
	
	
	
	/*
	 *deplacement d'un pion noir d'une seul case 
	 *@parem : x (la position x qu'on veux deplace) , y (la position y qu'on veux déplacer ) , ech1 (sur qu'elle echiquier on doit deplacer la piece )
	 * @return true ou false , si le deplacement est valider par tout les parametre en jeux , le mouvement est accepter , sinon refusé
	*/
	public boolean deplacementvalideN1(int x , int y , echiquier ech1) {
		if (this.getxP()+ x > 7 || this.getxP() + x < 0 || this.getyP() + y  < 0 || this.getyP() + y  > 7 )
		  { return false ; } 
		if(  joueur.getCompterebour()%2 != this.getIdC() || this.isPeuxBouger() == false  )
		  { return false ;}
		if( x != 0 || y != -1 || this.getIdC() != 1)
		{return false ; }
		for(int i = 0 ; i <=15  ; i++ ){
	      if((ech1.pion[i][0].getxP() == this.getxP()+ x && ech1.pion[i][0].getyP() == (this.getyP()+y) && ech1.pion[i][0].isEnVie() ==  true )){
	         return false ; 
	      }				
		}
		for(int i = 16 ; i <=19  ; i++ ){
		      if((ech1.fou[i][0].getxP() == this.getxP()+ x && ech1.fou[i][0].getyP() == (this.getyP()+y) && ech1.fou[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i = 20 ; i <=23  ; i++ ){
		      if((ech1.cavaliers[i][0].getxP() == this.getxP()+ x && ech1.cavaliers[i][0].getyP() == (this.getyP()+y) && ech1.cavaliers[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i = 24 ; i <=27  ; i++ ){
		      if((ech1.tour[i][0].getxP() == this.getxP()+ x && ech1.tour[i][0].getyP() == (this.getyP()+y) && ech1.tour[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i =28  ; i <=29  ; i++ ){
		      if((ech1.reine[i][0].getxP() == this.getxP()+ x && ech1.reine[i][0].getyP() == (this.getyP()+y) && ech1.reine[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
		for(int i = 30 ; i <=31  ; i++ ){
		      if((ech1.roi[i][0].getxP() == this.getxP()+ x && ech1.roi[i][0].getyP() == (this.getyP()+y) && ech1.roi[i][0].isEnVie() ==  true )){
		         return false ; 
		      }				
			}
					 
					
		return true ;
	}
	
	
	
	/*
	 * deplacement d'un pion  (c'est une fonction qui gere les 4 deplacements  
	 * @parem : x (la position x qu'on veux deplace) , y (la position y qu'on veux déplacer ) , ech1 (sur qu'elle echiquier on doit deplacer la piece )
	 * @return true ou false , si le deplacement est valider par tout les parametre en jeux , le mouvement est accepter , sinon refusé
	 * 
	 * 
	 * */
	public boolean deplacementvalide(int x , int y , echiquier ech1){
		/*si une resort vrai , alors on peux effectue le deplacement*/
		if(deplacementvalideB1(x , y , ech1) == true || deplacementvalideN1(x , y , ech1) ==  true  || deplacementvalideN2(x , y , ech1)==  true || deplacementvalideB2(x , y , ech1) ==  true ){
			return true ;
		}
			
	    return false ;
	}
	
	
	
	/*
	 * 
	 * voir si un pion blanche  peux manger une autre piece  
	 * @parem : x (la position x qu'on veux deplace) , y (la position y qu'on veux déplacer ) , ech1 (sur qu'elle echiquier on doit deplacer la piece )
	 * @return true ou false , si le deplacement est valider par tout les parametre en jeux , le mouvement est accepter , sinon refusé
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	public boolean peutBManger(int x , int y , echiquier ech1){
		if (this.getxP()+ x <=7 || this.getxP() + x >= 0 || this.getyP() + y  >=0 || this.getyP() + y  <=7 ) /*Pour que ca reste dans l'echiquier'*/
		  {  if( joueur.getCompterebour()%2 == this.getIdC() && this.isPeuxBouger() == true  ){ /* indique si c'est son tour*/
			   if(this.getIdC() == 0 && (x == -1||x == 1) && y == 1){
				  for(int i = 0 ; i <=15  ; i++ ){
					  if((ech1.pion[i][0].getxP() == this.getxP()+ x && ech1.pion[i][0].getyP() == (this.getyP()+y))&& ech1.pion[i][0].isEnVie() == true && ech1.pion[i][0].getIdC() != this.getIdC() ){
						  return true ;
				      }
				  }
				  for(int i = 16 ; i <=19  ; i++ ){
					  if((ech1.fou[i][0].getxP() == this.getxP()+ x && ech1.fou[i][0].getyP() == (this.getyP()+y))&& ech1.fou[i][0].isEnVie() == true && ech1.fou[i][0].getIdC() != this.getIdC()  ){
						  return true ;
					  }

				  }
				  for(int i = 20 ; i <=23  ; i++ ){
					  if((ech1.cavaliers[i][0].getxP() == this.getxP()+ x && ech1.cavaliers[i][0].getyP() == (this.getyP()+y))&& ech1.cavaliers[i][0].isEnVie() == true && ech1.cavaliers[i][0].getIdC() != this.getIdC() ){
						  return true ;
					  }

				  }
				  
				  for(int i = 24 ; i <=27  ; i++ ){
					  if((ech1.tour[i][0].getxP() == this.getxP()+ x && ech1.tour[i][0].getyP() == (this.getyP()+y))&& ech1.tour[i][0].isEnVie() == true && ech1.tour[i][0].getIdC() != this.getIdC() ){
						  return true ;
					  }

				  }
				  for(int i = 28 ; i <=29  ; i++ ){
					  if((ech1.reine[i][0].getxP() == this.getxP()+ x && ech1.reine[i][0].getyP() == (this.getyP()+y))&& ech1.reine[i][0].isEnVie() == true && ech1.reine[i][0].getIdC() != this.getIdC() ){
						  return true ;
					  }
				  }
				  for(int i = 30 ; i <=31  ; i++ ){
					  if((ech1.roi[i][0].getxP() == this.getxP()+ x && ech1.roi[i][0].getyP() == (this.getyP()+y))&& ech1.roi[i][0].isEnVie() == true && ech1.roi[i][0].getIdC() != this.getIdC() ){
						return true ;
						  }

					  }
				   }
			    }
		     }
		 
		
					
		return false ;
	}
	
	/*
	 * 
	 * voir si un pion noir  peux manger une autre piece  
	 * @parem : x (la position x qu'on veux deplace) , y (la position y qu'on veux déplacer ) , ech1 (sur qu'elle echiquier on doit deplacer la piece )
	 * @return true ou false , si le deplacement est valider par tout les parametre en jeux , le mouvement est accepter , sinon refusé
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	public boolean peutNManger(int x , int y , echiquier ech1){
		if (this.getxP()+ x <=7 || this.getxP() + x >= 0 || this.getyP() + y  >=0 || this.getyP() + y  <=7 ) /*Pour que ca reste dans l'echiquier */
		  {  if( joueur.getCompterebour()%2 == this.getIdC() && this.isPeuxBouger() == true  ){ /* indique si c'est son tour*/
			   if(this.getIdC() == 1 && (x == -1||x == 1) && y == -1){
				  for(int i = 0 ; i <=15  ; i++ ){
					  if((ech1.pion[i][0].getxP() == this.getxP()+ x && ech1.pion[i][0].getyP() == (this.getyP()+y))&& ech1.pion[i][0].isEnVie() == true && ech1.pion[i][0].getIdC() != this.getIdC() ){
						  return true ;
				      }
				  }
				  for(int i = 16 ; i <=19  ; i++ ){
					  if((ech1.fou[i][0].getxP() == this.getxP()+ x && ech1.fou[i][0].getyP() == (this.getyP()+y))&& ech1.fou[i][0].isEnVie() == true && ech1.fou[i][0].getIdC() != this.getIdC()  ){
						  return true ;
					  }

				  }
				  for(int i = 20 ; i <=23  ; i++ ){
					  if((ech1.cavaliers[i][0].getxP() == this.getxP()+ x && ech1.cavaliers[i][0].getyP() == (this.getyP()+y))&& ech1.cavaliers[i][0].isEnVie() == true && ech1.cavaliers[i][0].getIdC() != this.getIdC() ){
						  return true ;
					  }

				  }
				  
				  for(int i = 24 ; i <=27  ; i++ ){
					  if((ech1.tour[i][0].getxP() == this.getxP()+ x && ech1.tour[i][0].getyP() == (this.getyP()+y))&& ech1.tour[i][0].isEnVie() == true && ech1.tour[i][0].getIdC() != this.getIdC() ){
						  return true ;
					  }

				  }
				  for(int i = 28 ; i <=29  ; i++ ){
					  if((ech1.reine[i][0].getxP() == this.getxP()+ x && ech1.reine[i][0].getyP() == (this.getyP()+y))&& ech1.reine[i][0].isEnVie() == true && ech1.reine[i][0].getIdC() != this.getIdC() ){
						  return true ;
					  }
				  }
				  for(int i = 30 ; i <=31  ; i++ ){
					  if((ech1.roi[i][0].getxP() == this.getxP()+ x && ech1.roi[i][0].getyP() == (this.getyP()+y))&& ech1.roi[i][0].isEnVie() == true && ech1.roi[i][0].getIdC() != this.getIdC() ){
						return true ;
						  }

					  }
				  }
			    }
		     }
		 
		
					
		return false ;
	}
	/*
	 * 
	 * voir si un pion peux manger une autre piece  
	 * @parem : x (la position x qu'on veux deplace) , y (la position y qu'on veux déplacer ) , ech1 (sur qu'elle echiquier on doit deplacer la piece )
	 * @return true ou false , si le deplacement est valider par tout les parametre en jeux , le mouvement est accepter , sinon refusé
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	public boolean deplacementMvalide(int x , int y , echiquier ech1){
		if(peutNManger( x ,  y , ech1) == true || peutBManger(x , y ,ech1 ) ==  true  ){
			return true ;
		}
			
	    return false ;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
