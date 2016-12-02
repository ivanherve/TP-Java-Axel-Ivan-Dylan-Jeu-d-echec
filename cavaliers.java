package echiquier;

public class cavaliers extends piece {
	 private String nom ;
	 private int idpiece ;
	 private int idDeLaPiece ;
	public cavaliers(int xP, int yP, int idC ,int idP , int iddlP) {
		super(xP,  yP,  idC) ; 
		this.idpiece = idP ;
		this.nom = "cavaliers" ;
		this.idDeLaPiece = iddlP ;
	}
    
	    /*
       * permet de renvoyer la variable nom
       * @return nom
       */
	public String getNom() {
		return nom;
	}

      /*
       * permet de modifier la variable nom
       * @param nom
       */  
	public void setNom(String nom) {
		this.nom = nom;
	}

      /*
       * permet de renvoyer la variable Idpiece
       * @return idpiece
       */
	public int getIdpiece() {
		return idpiece;
	}

      /*
       * permet de modifier la variable idpiece
       * @param idpiece
       */
	public void setIdpiece(int idpiece) {
		this.idpiece = idpiece;
	}

      /*
       * permet de renvoyer la variable idDeLaPiece
       * @return idDeLaPiece
       */
	public int getIdDeLaPiece() {
		return idDeLaPiece;
	}

      /*
       * permet de modifier la variable idDeLaPiece
       * @param idDeLaPiece
       */
	public void setIdDeLaPiece(int idDeLaPiece) {
		this.idDeLaPiece = idDeLaPiece;
	}

      /*
       * permet de determiner une position pour la pièce en question
       * en fonction de X (absisse) et Y (ordonnée) grâce aux getters getxP et getyP
       * @return c
       */	
	public String position (){
		String c = "on a pour x = "+this.getxP() +"et pour y "+ this.getyP() ;
		return c ;
	}
	
	/*
   * Dans unne situation d'echec, comment déplacer le roi,
   * @param x, y
   * @param ech1
   */  
  public boolean simulationPourRdep(int x , int y , echiquier ech1){
		/*verifie si la piece sort pas du plateau*/
		if (this.getxP()+ x > 7 || this.getxP() + x < 0 || this.getyP() + y  < 0 || this.getyP() + y  > 7 )
		  { return false ; } 
		/*verifie si le deplacement est bon pour faire une case*/
		if(Math.abs(x) * Math.abs(y) != 2  )
		{return false ; }
		if (this.isEnVie() == false )
		  { return false ; }
		for(int i = 0 ; i <=15  ; i++ ){
		      if((ech1.pion[i][0].getxP() == this.getxP()+ x && ech1.pion[i][0].getyP() == (this.getyP()+y) && ech1.pion[i][0].isEnVie() ==  true && ech1.pion[i][0].getIdC() == this.getIdC() )){
		         return false ; 
		      }				
			}
			for(int i = 16 ; i <=19  ; i++ ){
			      if((ech1.fou[i][0].getxP() == this.getxP()+ x && ech1.fou[i][0].getyP() == (this.getyP()+y) && ech1.fou[i][0].isEnVie() ==  true && ech1.fou[i][0].getIdC() == this.getIdC())){
			         return false ; 
			      }				
				}
			for(int i = 20 ; i <=23  ; i++ ){
			      if((ech1.cavaliers[i][0].getxP() == this.getxP()+ x && ech1.cavaliers[i][0].getyP() == (this.getyP()+y) && ech1.cavaliers[i][0].isEnVie() ==  true && ech1.cavaliers[i][0].getIdC() == this.getIdC() )){
			         return false ; 
			      }				
				}
			for(int i = 24 ; i <=27  ; i++ ){
			      if((ech1.tour[i][0].getxP() == this.getxP()+ x && ech1.tour[i][0].getyP() == (this.getyP()+y) && ech1.tour[i][0].isEnVie() ==  true && ech1.tour[i][0].getIdC() == this.getIdC())){
			         return false ; 
			      }				
				}
			for(int i =28  ; i <=29  ; i++ ){
			      if((ech1.reine[i][0].getxP() == this.getxP()+ x && ech1.reine[i][0].getyP() == (this.getyP()+y) && ech1.reine[i][0].isEnVie() ==  true &&  ech1.reine[i][0].getIdC() == this.getIdC() )){
			         return false ; 
			      }				
				}
		return true ;
	}
	
  /*
   * permet de voir une simulation de deplacement sans le systeme des tours
   * @param x, y
   * @param ech1
   */  
	public boolean simulationdep(int x , int y , echiquier ech1){
		/*verifie si la piece sort pas du plateau*/
		if (this.getxP()+ x > 7 || this.getxP() + x < 0 || this.getyP() + y  < 0 || this.getyP() + y  > 7 )
		  { return false ; } 
		/*verifie si le deplacement est bon pour faire une case*/
		if(Math.abs(x) * Math.abs(y) != 2  )
		{return false ; }
		if (this.isEnVie() == false )
		  { return false ; }
		for(int i = 0 ; i <=15  ; i++ ){
		      if((ech1.pion[i][0].getxP() == this.getxP()+ x && ech1.pion[i][0].getyP() == (this.getyP()+y) && ech1.pion[i][0].isEnVie() ==  true && ech1.pion[i][0].getIdC() == this.getIdC() )){
		         return false ; 
		      }				
			}
			for(int i = 16 ; i <=19  ; i++ ){
			      if((ech1.fou[i][0].getxP() == this.getxP()+ x && ech1.fou[i][0].getyP() == (this.getyP()+y) && ech1.fou[i][0].isEnVie() ==  true && ech1.fou[i][0].getIdC() == this.getIdC())){
			         return false ; 
			      }				
				}
			for(int i = 20 ; i <=23  ; i++ ){
			      if((ech1.cavaliers[i][0].getxP() == this.getxP()+ x && ech1.cavaliers[i][0].getyP() == (this.getyP()+y) && ech1.cavaliers[i][0].isEnVie() ==  true && ech1.cavaliers[i][0].getIdC() == this.getIdC() )){
			         return false ; 
			      }				
				}
			for(int i = 24 ; i <=27  ; i++ ){
			      if((ech1.tour[i][0].getxP() == this.getxP()+ x && ech1.tour[i][0].getyP() == (this.getyP()+y) && ech1.tour[i][0].isEnVie() ==  true && ech1.tour[i][0].getIdC() == this.getIdC())){
			         return false ; 
			      }				
				}
			for(int i =28  ; i <=29  ; i++ ){
			      if((ech1.reine[i][0].getxP() == this.getxP()+ x && ech1.reine[i][0].getyP() == (this.getyP()+y) && ech1.reine[i][0].isEnVie() ==  true &&  ech1.reine[i][0].getIdC() == this.getIdC() )){
			         return false ; 
			      }				
				}
			for(int i = 30 ; i <=31  ; i++ ){
			      if((ech1.roi[i][0].getxP() == this.getxP()+ x && ech1.roi[i][0].getyP() == (this.getyP()+y) && ech1.roi[i][0].isEnVie() ==  true  )){
			         return false ; 
			      }				
				}
		return true ;
	}
	
	/*
   * permet de donner la possibilité de se déplacer
   * verifier si soit chaques autres pieces sont sur sa trajectoire ou soit le roi est en echec
   * @param x, y
   * @param ech1
   */	
  public boolean deplacementvalide(int x , int y, echiquier ech1) {
		/*verifie si la piece sort pas du plateau*/
		if (this.getxP()+ x > 7 || this.getxP() + x < 0 || this.getyP() + y  < 0 || this.getyP() + y  > 7 )
		  { return false ; } 
		/*verifie si c'est bon son tour et qu'il peux bouger*/
		if( joueur.getCompterebour()%2 != this.getIdC() || this.isPeuxBouger() == false || this.isEnVie() ==  false  )
		  { return false ;}
		/*verifie si le deplacement est bon pour faire une case*/
		if(Math.abs(x) * Math.abs(y) != 2  )
		{return false ; }
		for(int i = 0 ; i <=15  ; i++ ){
		      if((ech1.pion[i][0].getxP() == this.getxP()+ x && ech1.pion[i][0].getyP() == (this.getyP()+y) && ech1.pion[i][0].isEnVie() ==  true && ech1.pion[i][0].getIdC() == this.getIdC() )){
		         return false ; 
		      }				
			}
			for(int i = 16 ; i <=19  ; i++ ){
			      if((ech1.fou[i][0].getxP() == this.getxP()+ x && ech1.fou[i][0].getyP() == (this.getyP()+y) && ech1.fou[i][0].isEnVie() ==  true && ech1.fou[i][0].getIdC() == this.getIdC())){
			         return false ; 
			      }				
				}
			for(int i = 20 ; i <=23  ; i++ ){
			      if((ech1.cavaliers[i][0].getxP() == this.getxP()+ x && ech1.cavaliers[i][0].getyP() == (this.getyP()+y) && ech1.cavaliers[i][0].isEnVie() ==  true && ech1.cavaliers[i][0].getIdC() == this.getIdC() )){
			         return false ; 
			      }				
				}
			for(int i = 24 ; i <=27  ; i++ ){
			      if((ech1.tour[i][0].getxP() == this.getxP()+ x && ech1.tour[i][0].getyP() == (this.getyP()+y) && ech1.tour[i][0].isEnVie() ==  true && ech1.tour[i][0].getIdC() == this.getIdC())){
			         return false ; 
			      }				
				}
			for(int i =28  ; i <=29  ; i++ ){
			      if((ech1.reine[i][0].getxP() == this.getxP()+ x && ech1.reine[i][0].getyP() == (this.getyP()+y) && ech1.reine[i][0].isEnVie() ==  true &&  ech1.reine[i][0].getIdC() == this.getIdC() )){
			         return false ; 
			      }				
				}
			for(int i = 30 ; i <=31  ; i++ ){
			      if((ech1.roi[i][0].getxP() == this.getxP()+ x && ech1.roi[i][0].getyP() == (this.getyP()+y) && ech1.roi[i][0].isEnVie() ==  true && ech1.roi[i][0].getIdC() == this.getIdC() )){
			         return false ; 
			      }				
				}
		return true ;
	}
	
    /*
     * Met le roi en échec dès que celui-ci se trouve sur sa trajectoire
     * @param x, y, ech1
     */
	public boolean metEnEchec(int x , int y , echiquier ech1){
		if(Math.abs(x)* Math.abs(y) == 2){
			for(int i = 30 ; i <=31  ; i++ ){
			      if((ech1.roi[i][0].getxP() == this.getxP()+ x && ech1.roi[i][0].getyP() == (this.getyP()+y) && ech1.roi[i][0].getIdC() != this.getIdC() )){
			         return true  ; 
			      }				
		     }
		}
		return false ; 
	}
	
  /*
   * permet le deplacement une fois qu'il lui ai possible de le faire,
   * grace à la méthode "deplacementvalide"
   * @param x,y
   * @param ech1
   */  
	public void deplacement(int x , int y , echiquier ech1){
		if (this.deplacementvalide(x , y , ech1) ==  true ){
			for(int i = 0 ; i <=15  ; i++ ){
			      if((ech1.pion[i][0].getxP() == this.getxP()+ x && ech1.pion[i][0].getyP() == (this.getyP()+y) && ech1.pion[i][0].isEnVie() ==  true && ech1.pion[i][0].getIdC() != this.getIdC() )){
			          ech1.pion[i][0].setxP(20); 
			          ech1.pion[i][0].setPeuxBouger(false);
			          ech1.pion[i][0].setyP(20);
			          ech1.pion[i][0].setEnVie(false);
			          
			      }				
				}
		    for(int i = 16 ; i <=19  ; i++ ){
				      if((ech1.fou[i][0].getxP() == this.getxP()+ x && ech1.fou[i][0].getyP() == (this.getyP()+y) && ech1.fou[i][0].isEnVie() ==  true && ech1.fou[i][0].getIdC() != this.getIdC())){
				    	  ech1.fou[i][0].setxP(20); 
				          ech1.fou[i][0].setPeuxBouger(false);
				          ech1.fou[i][0].setyP(20);
				          ech1.fou[i][0].setEnVie(false);
				      }				
					}
			for(int i = 20 ; i <=23  ; i++ ){
				      if((ech1.cavaliers[i][0].getxP() == this.getxP()+ x && ech1.cavaliers[i][0].getyP() == (this.getyP()+y) && ech1.cavaliers[i][0].isEnVie() ==  true && ech1.cavaliers[i][0].getIdC() != this.getIdC() )){
				    	  ech1.cavaliers[i][0].setxP(20); 
				          ech1.cavaliers[i][0].setPeuxBouger(false);
				          ech1.cavaliers[i][0].setyP(20);
				          ech1.cavaliers[i][0].setEnVie(false);
				      }				
					}
			for(int i = 24 ; i <=27  ; i++ ){
				      if((ech1.tour[i][0].getxP() == this.getxP()+ x && ech1.tour[i][0].getyP() == (this.getyP()+y) && ech1.tour[i][0].isEnVie() ==  true && ech1.tour[i][0].getIdC() != this.getIdC())){
				    	  ech1.tour[i][0].setxP(20); 
				          ech1.tour[i][0].setPeuxBouger(false);
				          ech1.tour[i][0].setyP(20);
				          ech1.tour[i][0].setEnVie(false);
				      }				
					}
			for(int i =28  ; i <=29  ; i++ ){
				      if((ech1.reine[i][0].getxP() == this.getxP()+ x && ech1.reine[i][0].getyP() == (this.getyP()+y) && ech1.reine[i][0].isEnVie() ==  true &&  ech1.reine[i][0].getIdC() != this.getIdC() )){
				    	  ech1.reine[i][0].setxP(20); 
				          ech1.reine[i][0].setPeuxBouger(false);
				          ech1.reine[i][0].setyP(20);
				          ech1.reine[i][0].setEnVie(false);
				      }				
					}
			this.setxP(this.getxP() + x);
			this.setyP(this.getyP() + y);
			joueur.setCompterebour(joueur.getCompterebour() + 1);
			for(int m = -2 ; m<=2 ; m++ ){
				for(int j = -2 ; j<=2 ; j++){
					if(this.metEnEchec(m, j, ech1)== true ){
						for(int i = 0 ; i <=15  ; i++ ){
						      if((ech1.pion[i][0].getIdC() != this.getIdC() )){
						          ech1.pion[i][0].setPeuxBouger(false);
						      }				
							}
					    for(int i = 16 ; i <=19  ; i++ ){
							      if(( ech1.fou[i][0].getIdC() != this.getIdC())){
							          ech1.fou[i][0].setPeuxBouger(false);
							      }				
								}
						for(int i = 20 ; i <=23  ; i++ ){
							      if(( ech1.cavaliers[i][0].getIdC() != this.getIdC() )){
							          ech1.cavaliers[i][0].setPeuxBouger(false);
							      }				
								}
						for(int i = 24 ; i <=27  ; i++ ){
							      if(( ech1.tour[i][0].getIdC() != this.getIdC())){
							    	 
							          ech1.tour[i][0].setPeuxBouger(false);
							      }				
								}
						for(int i =28  ; i <=29  ; i++ ){
							      if((ech1.reine[i][0].getIdC() != this.getIdC() )){
							          ech1.reine[i][0].setPeuxBouger(false);
							      }				
								}
						for(int i =30  ; i <=31  ; i++ ){
						      if((ech1.roi[i][0].getIdC() != this.getIdC() )){
						          ech1.roi[i][0].setEchec(1);
						      }				
							}
					}
				}
			}
			}
		}
	
    /* 
     * Verifie les deplacements possible en cas d'echec 
     * @param x, y, ech1
     */  
  public boolean verifdeplacementEchec(int x , int y , echiquier ech1){
		if(this.simulationdep(x, y, ech1) ==  true && joueur.getCompterebour()%2 == this.getIdC()){
			for(int i = 0 ; i <=15  ; i++ ){
			      if((ech1.pion[i][0].getxP() == this.getxP()+ x && ech1.pion[i][0].getyP() == (this.getyP()+y) && ech1.pion[i][0].isEnVie() ==  true && ech1.pion[i][0].getIdC() != this.getIdC() )){
			          for(int j = -7 ; j<=7 ; j++){
			        	  for(int f = -7 ; f<=7 ; f++){
			        		  if(ech1.pion[i][0].metEnEchec(j, f, ech1)== true ){
			        			  return true ;
			        		  }
			        	  }
			          }
			      }				
				}
		    
			for(int i = 16 ; i <=19  ; i++ ){
			      if((ech1.fou[i][0].getxP() == this.getxP()+ x && ech1.fou[i][0].getyP() == (this.getyP()+y) && ech1.fou[i][0].isEnVie() ==  true && ech1.fou[i][0].getIdC() != this.getIdC() )){
			          for(int j = -7 ; j<=7 ; j++){
			        	  for(int f = -7 ; f<=7 ; f++){
			        		  if(ech1.fou[i][0].metEnEchec(j, f, ech1)== true ){
			        			  return true ;
			        		  }
			        	  }
			          }
			      }				
				}
			
			for(int i = 24 ; i <=27  ; i++ ){
			      if((ech1.tour[i][0].getxP() == this.getxP()+ x && ech1.tour[i][0].getyP() == (this.getyP()+y) && ech1.tour[i][0].isEnVie() ==  true && ech1.tour[i][0].getIdC() != this.getIdC() )){
			          for(int j = -7 ; j<=7 ; j++){
			        	  for(int f = -7 ; f<=7 ; f++){
			        		  if(ech1.tour[i][0].metEnEchec(j, f, ech1)== true ){
			        			  return true ;
			        		  }
			        	  }
			          }
			      }				
				}
			for(int i = 28 ; i <=29  ; i++ ){
			      if((ech1.reine[i][0].getxP() == this.getxP()+ x && ech1.reine[i][0].getyP() == (this.getyP()+y) && ech1.reine[i][0].isEnVie() ==  true && ech1.reine[i][0].getIdC() != this.getIdC() )){
			          for(int j = -7 ; j<=7 ; j++){
			        	  for(int f = -7 ; f<=7 ; f++){
			        		  if(ech1.reine[i][0].metEnEchec(j, f, ech1)== true ){
			        			  return true ;
			        		  }
			        	  }
			          }
			      }				
				}
			for(int i = 20 ; i <=23  ; i++ ){
				      if((ech1.cavaliers[i][0].getxP() == this.getxP()+ x && ech1.cavaliers[i][0].getyP() == (this.getyP()+y) && ech1.cavaliers[i][0].isEnVie() ==  true && ech1.cavaliers[i][0].getIdC() != this.getIdC() )){
				    	  for(int j = -7 ; j<=7 ; j++){
				        	  for(int f = -7 ; f<=7 ; f++){
				        		  if(ech1.cavaliers[i][0].metEnEchec(j, f, ech1)== true ){
				        			  return true ;
				        		  }
				        	  }
				          }
				      }				
					}
			
			
			for(int i = 16  ; i <=19  ; i++ ){
				  for(int m = -7 ; m<=7 ; m++ ){
					for(int j = -7 ; j<=7 ; j++){
						if(ech1.fou[i][0].metEnEchec(m, j, ech1)== true ){
							if (m<0 && j<0){
								for(int l = 0 ; l>= m ; l--){
									for(int o = 0 ; o>=j ; o--){
										if(Math.abs(l)* Math.abs(o) == 1 ){
											if(ech1.fou[i][0].getxP() + l ==  this.getxP() + x && ech1.fou[i][0].getyP() + o == this.getyP()+y && ech1.fou[i][0].getIdC() != this.getIdC() ){
												return true ;
											}
										}
									}
								}
							}
							if (m>0 && j<0){
								for(int l = 0 ; l <= m ; l++){
									for(int o = 0 ; o>=j ; o--){
                                        if(Math.abs(l)* Math.abs(o) == 1 ){
											if(ech1.fou[i][0].getxP() + l ==  this.getxP() + x && ech1.fou[i][0].getyP() + o == this.getyP()+y && ech1.fou[i][0].getIdC() != this.getIdC() ){
												return true ;
											}
										}
									}
								}
							}
							if (m>0 && j>0){
								for(int l = 0 ; l<= m ; l++){
									for(int o = 0 ; o<=j ; o++){
                                        if(Math.abs(l)* Math.abs(o) == 1 ){
											if(ech1.fou[i][0].getxP() + l ==  this.getxP() + x && ech1.fou[i][0].getyP() + o == this.getyP()+y && ech1.fou[i][0].getIdC() != this.getIdC() ){
												return true ;
											}
										}
									}
								}
							}
							if (m<0 && j>0){
								for(int l = 0 ; l>= m ; l--){
									for(int o = 0 ; o<=j ; o++){
                                        if(Math.abs(l)* Math.abs(o) == 1 ){
											if(ech1.fou[i][0].getxP() + l ==  this.getxP() + x && ech1.fou[i][0].getyP() + o == this.getyP()+y && ech1.fou[i][0].getIdC() != this.getIdC() ){
												return true ;
											}
										}
									}
								}
							}
							}
						}
					}
				  }
				
			for(int i = 24  ; i <=27  ; i++ ){
				  for(int m = -7 ; m<=7 ; m++ ){
					for(int j = -7 ; j<=7 ; j++){
						if(ech1.tour[i][0].metEnEchec(m, j, ech1)== true ){
							if (m<0 && j==0){
								for(int l = 0 ; l>m ; l--){
									if(ech1.tour[i][0].getxP() + l ==  this.getxP() + x && ech1.tour[i][0].getyP() + j == this.getyP()+y && ech1.tour[i][0].getIdC() != this.getIdC() ){
										return true ;
									}
								}
							}
							if (m>0 && j==0){
                                for(int l = 0 ; l>m ; l--){
									if(ech1.tour[i][0].getxP() + l ==  this.getxP() + x && ech1.tour[i][0].getyP() + j == this.getyP()+y && ech1.tour[i][0].getIdC() != this.getIdC() ){
										return true ;
									}
								}
							}
							if (m==0 && j<0){
                                for(int l = 0 ; l>m ; l--){
									if(ech1.tour[i][0].getxP() + l ==  this.getxP() + x && ech1.tour[i][0].getyP() + j == this.getyP()+y && ech1.tour[i][0].getIdC() != this.getIdC() ){
										return true ;
									}
								}
							}
							if (m==0 && j>0){
                                for(int l = 0 ; l>m ; l--){
									if(ech1.tour[i][0].getxP() + l ==  this.getxP() + x && ech1.tour[i][0].getyP() + j == this.getyP()+y && ech1.tour[i][0].getIdC() != this.getIdC() ){
										return true ;
									}
								}
							}
							}
						}
					}
				  }
			for(int i = 28  ; i <=29  ; i++ ){
				  for(int m = -7 ; m<=7 ; m++ ){
					for(int j = -7 ; j<=7 ; j++){
						if(ech1.reine[i][0].metEnEchec(m, j, ech1)== true ){
							if (m<0 && j<0){
								for(int l = 0 ; l>= m ; l--){
									for(int o = 0 ; o>=j ; o--){
										if(Math.abs(l)* Math.abs(o) == 1 ){
											if(ech1.reine[i][0].getxP() + l ==  this.getxP() + x && ech1.reine[i][0].getyP() + o == this.getyP()+y && ech1.reine[i][0].getIdC() != this.getIdC() ){
												return true ;
											}
										}
									}
								}
							}
							if (m>0 && j<0){
								for(int l = 0 ; l <= m ; l++){
									for(int o = 0 ; o>=j ; o--){
                                        if(Math.abs(l)* Math.abs(o) == 1 ){
											if(ech1.reine[i][0].getxP() + l ==  this.getxP() + x && ech1.reine[i][0].getyP() + o == this.getyP()+y && ech1.reine[i][0].getIdC() != this.getIdC() ){
												return true ;
											}
										}
									}
								}
							}
							if (m>0 && j>0){
								for(int l = 0 ; l<= m ; l++){
									for(int o = 0 ; o<=j ; o++){
                                        if(Math.abs(l)* Math.abs(o) == 1 ){
											if(ech1.reine[i][0].getxP() + l ==  this.getxP() + x && ech1.reine[i][0].getyP() + o == this.getyP()+y && ech1.reine[i][0].getIdC() != this.getIdC() ){
												return true ;
											}
										}
									}
								}
							}
							if (m<0 && j>0){
								for(int l = 0 ; l>= m ; l--){
									for(int o = 0 ; o<=j ; o++){
                                        if(Math.abs(l)* Math.abs(o) == 1 ){
											if(ech1.reine[i][0].getxP() + l ==  this.getxP() + x && ech1.reine[i][0].getyP() + o == this.getyP()+y && ech1.reine[i][0].getIdC() != this.getIdC() ){
												return true ;
											}
										}
									}
								}
							}
							if (m<0 && j==0){
								for(int l = 0 ; l>m ; l--){
									if(ech1.reine[i][0].getxP() + l ==  this.getxP() + x && ech1.reine[i][0].getyP() + j == this.getyP()+y && ech1.reine[i][0].getIdC() != this.getIdC() ){
										return true ;
									}
								}
							}
							if (m>0 && j==0){
                                for(int l = 0 ; l>m ; l--){
									if(ech1.reine[i][0].getxP() + l ==  this.getxP() + x && ech1.reine[i][0].getyP() + j == this.getyP()+y && ech1.reine[i][0].getIdC() != this.getIdC() ){
										return true ;
									}
								}
							}
							if (m==0 && j<0){
                                for(int l = 0 ; l>m ; l--){
									if(ech1.reine[i][0].getxP() + l ==  this.getxP() + x && ech1.reine[i][0].getyP() + j == this.getyP()+y && ech1.reine[i][0].getIdC() != this.getIdC() ){
										return true ;
									}
								}
							}
							if (m==0 && j>0){
                                for(int l = 0 ; l>m ; l--){
									if(ech1.reine[i][0].getxP() + l ==  this.getxP() + x && ech1.reine[i][0].getyP() + j == this.getyP()+y && ech1.reine[i][0].getIdC() != this.getIdC() ){
										return true ;
									}
								}
							}
						
						}
					}
				  }
				}
			
		}
		
		return false ;
	}
	
  /*
   * Spécifie les déplacements en cas d'echec
   * @param x, y
   * @param ech1
   */
  public void deplacementEnEchec(int x , int y , echiquier ech1){
		if (verifdeplacementEchec(x , y , ech1) == true ){
			for(int i = 0 ; i <=15  ; i++ ){
			      if((ech1.pion[i][0].getxP() == this.getxP()+ x && ech1.pion[i][0].getyP() == (this.getyP()+y) && ech1.pion[i][0].isEnVie() ==  true && ech1.pion[i][0].getIdC() != this.getIdC() )){
			          ech1.pion[i][0].setxP(20); 
			          ech1.pion[i][0].setPeuxBouger(false);
			          ech1.pion[i][0].setyP(20);
			          ech1.pion[i][0].setEnVie(false);
			          
			      }				
				}
		    for(int i = 16 ; i <=19  ; i++ ){
				      if((ech1.fou[i][0].getxP() == this.getxP()+ x && ech1.fou[i][0].getyP() == (this.getyP()+y) && ech1.fou[i][0].isEnVie() ==  true && ech1.fou[i][0].getIdC() != this.getIdC())){
				    	  ech1.fou[i][0].setxP(20); 
				          ech1.fou[i][0].setPeuxBouger(false);
				          ech1.fou[i][0].setyP(20);
				          ech1.fou[i][0].setEnVie(false);
				      }				
					}
			for(int i = 20 ; i <=23  ; i++ ){
				      if((ech1.cavaliers[i][0].getxP() == this.getxP()+ x && ech1.cavaliers[i][0].getyP() == (this.getyP()+y) && ech1.cavaliers[i][0].isEnVie() ==  true && ech1.cavaliers[i][0].getIdC() != this.getIdC() )){
				    	  ech1.cavaliers[i][0].setxP(20); 
				          ech1.cavaliers[i][0].setPeuxBouger(false);
				          ech1.cavaliers[i][0].setyP(20);
				          ech1.cavaliers[i][0].setEnVie(false);
				      }				
					}
			for(int i = 24 ; i <=27  ; i++ ){
				      if((ech1.tour[i][0].getxP() == this.getxP()+ x && ech1.tour[i][0].getyP() == (this.getyP()+y) && ech1.tour[i][0].isEnVie() ==  true && ech1.tour[i][0].getIdC() != this.getIdC())){
				    	  ech1.tour[i][0].setxP(20); 
				          ech1.tour[i][0].setPeuxBouger(false);
				          ech1.tour[i][0].setyP(20);
				          ech1.tour[i][0].setEnVie(false);
				      }				
					}
			for(int i =28  ; i <=29  ; i++ ){
				      if((ech1.reine[i][0].getxP() == this.getxP()+ x && ech1.reine[i][0].getyP() == (this.getyP()+y) && ech1.reine[i][0].isEnVie() ==  true &&  ech1.reine[i][0].getIdC() != this.getIdC() )){
				    	  ech1.reine[i][0].setxP(20); 
				          ech1.reine[i][0].setPeuxBouger(false);
				          ech1.reine[i][0].setyP(20);
				          ech1.reine[i][0].setEnVie(false);
				      }				
					}
			this.setxP(this.getxP() + x);
			this.setyP(this.getyP() + y);
			for(int j = 30  ; j<=31 ; j++){
				if(ech1.roi[j][0].getEchec() == 1 && this.getIdC() == ech1.roi[j][0].getIdC() ){
					for(int i = 0 ; i <=15  ; i++ ){
					      if((ech1.pion[i][0].getIdC() == this.getIdC() )){
					          ech1.pion[i][0].setPeuxBouger(true);
					      }				
						}
				    for(int i = 16 ; i <=19  ; i++ ){
						      if(( ech1.fou[i][0].getIdC() == this.getIdC())){
						          ech1.fou[i][0].setPeuxBouger(true);
						      }				
							}
					for(int i = 20 ; i <=23  ; i++ ){
						      if(( ech1.cavaliers[i][0].getIdC() == this.getIdC() )){
						          ech1.cavaliers[i][0].setPeuxBouger(true);
						      }				
							}
					for(int i = 24 ; i <=27  ; i++ ){
						      if(( ech1.tour[i][0].getIdC() == this.getIdC())){
						    	 
						          ech1.tour[i][0].setPeuxBouger(true);
						      }				
							}
					for(int i =28  ; i <=29  ; i++ ){
						      if((ech1.reine[i][0].getIdC() == this.getIdC() )){
						          ech1.reine[i][0].setPeuxBouger(true);
						      }				
							}
					for(int i =30  ; i <=31  ; i++ ){
					      if((ech1.roi[i][0].getIdC() == this.getIdC() )){
					          ech1.roi[i][0].setEchec(0);
					      }				
						}
				}
			}
			joueur.setCompterebour(joueur.getCompterebour() + 1);
			for(int m = -7 ; m<=7 ; m++ ){
				for(int j = -7 ; j<=7 ; j++){
					if(this.metEnEchec(m, j, ech1)== true ){
						for(int i = 0 ; i <=15  ; i++ ){
						      if((ech1.pion[i][0].getIdC() != this.getIdC() )){
						          ech1.pion[i][0].setPeuxBouger(false);
						      }				
							}
					    for(int i = 16 ; i <=19  ; i++ ){
							      if(( ech1.fou[i][0].getIdC() != this.getIdC())){
							          ech1.fou[i][0].setPeuxBouger(false);
							      }				
								}
						for(int i = 20 ; i <=23  ; i++ ){
							      if(( ech1.cavaliers[i][0].getIdC() != this.getIdC() )){
							          ech1.cavaliers[i][0].setPeuxBouger(false);
							      }				
								}
						for(int i = 24 ; i <=27  ; i++ ){
							      if(( ech1.tour[i][0].getIdC() != this.getIdC())){
							    	 
							          ech1.tour[i][0].setPeuxBouger(false);
							      }				
								}
						for(int i =28  ; i <=29  ; i++ ){
							      if((ech1.reine[i][0].getIdC() != this.getIdC() )){
							          ech1.reine[i][0].setPeuxBouger(false);
							      }				
								}
						for(int i =30  ; i <=31  ; i++ ){
						      if((ech1.roi[i][0].getIdC() != this.getIdC() )){
						          ech1.roi[i][0].setEchec(1);
						      }				
							}
					}
				}
			}
			}
			
		}
	
    
}

