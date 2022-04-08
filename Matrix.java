import java.util.Arrays;
public class Matrix {
	
	public float matrix[][];
    public int nbr_lignes;
    public int nbr_colonnes;
    
    public Matrix(int nbr_lignes, int nbr_colonnes) {
    	this.nbr_lignes = nbr_lignes;
    	this.nbr_colonnes = nbr_colonnes;
    	this.matrix = new float[nbr_lignes][nbr_colonnes];
    }
    

    public Matrix(float [][] matrix) {
    	
    	this.nbr_lignes = matrix.length;
    	this.nbr_colonnes = matrix[0].length;
		this.matrix = new float[nbr_lignes][nbr_colonnes];
		
		for (int i = 0; i < this.nbr_lignes; i++)
			for (int j = 0; j < this.nbr_colonnes; j++)
				this.matrix[i][j] = matrix[i][j];
    }
    
    
    
    public void Afficher()
    {
    	System.out.println(" \n");

        for (int i = 0; i < this.nbr_lignes ; i++) {
            for (int j = 0; j < this.nbr_colonnes; j++) {
            	System.out.print(this.matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println(" \n");
        
    }
    
    public Matrix Transpose_Matrix() {
    	
		Matrix M = new Matrix(this.nbr_colonnes, this.nbr_lignes);
		for (int i = 0; i < this.nbr_lignes; i++)
			for (int j = 0; j < this.nbr_colonnes; j++)
				M.matrix[j][i] = this.matrix[i][j];
		return M;
		
	}
    
    public Matrix identite(int i) {
    	
		Matrix identite = new Matrix(i, i);
		for (int j = 0; j < i; j++)
			identite.matrix[j][j] = 1;
		return identite;
	}
    
    

    public Matrix Multiplication_matrix(Matrix M) throws Exception {
		if (this.nbr_colonnes != M.nbr_lignes) {
			throw new Exception("le nombre de colonnes de la premiere matrice doit etre égale aux nombre des lignes de la deuxieme matrice ");
		}
		else {
		Matrix resultat = new Matrix(this.nbr_lignes, M.nbr_colonnes);
		
		for (int i = 0; i < this.nbr_lignes; i++) {
			for (int j = 0; j < M.nbr_colonnes; j++) {
				float sum = 0;
				for (int k = 0; k < this.nbr_colonnes; k++)
					sum += this.matrix[i][k] * M.matrix[k][j];
				resultat.matrix[i][j] = sum;
			}
		}
		return resultat;
		}
	}
    
    
// la question 01 ( Implémenter l’algorithme iteration_GJ ):
    
    public float[][] iteration_GJ(float [][] A, int r, int s) throws Exception {
    	
        float Pivot = A[r][s];
        
        if(Pivot == 0) {
        	throw new Exception("Solution Impossible");
        }
        else {
        
	        for(int j = 0; j < A[0].length; j++) {
	            A[r][j] = A[r][j] / Pivot;
	        }
	        
	
	        for(int i = 0; i < A.length; i++) {
	            if(i != r) {
	                float Ais = A[i][s];
	                for(int j = 0; j < A[0].length; j++) {
	                	float Arj = A[r][j];
	                    A[i][j] = A[i][j] - Ais * Arj;
	                }
	            }
	        }
	    
	        return A;
        }
    }
   
 // la question 02 (calcule l’inverse d’une matrice en utilise le code de l’algorithme iteration_GJ) :

	public Matrix augmente() {
		
	    Matrix M = new Matrix(this.nbr_lignes, this.nbr_colonnes * 2);
	    
 	    for (int i = 0; i < this.nbr_lignes; i++) {
 			for (int j = 0; j < this.nbr_colonnes; j++) {
 				M.matrix[i][j] = this.matrix[i][j];
 				M.matrix[i][j + this.nbr_colonnes] =  i == j ? 1 : 0;
 			}
 		}
 	    
	    return M;
	}
	
    
    public void gaussJordanInverse() throws Exception {
    	
    	Matrix M = new Matrix(this.matrix);
    	
    	M = M.augmente();
    	int l;
    	if(matrix[0].length%2 == 0)
    	{
    		l = (int)matrix[0].length/2+1;
    	}
    	else 
    	{
    		l = (int)matrix[0].length/2 +1+1;
    	}
    	
    	
    	for(int i = 0; i < M.matrix.length; i++) {
    		M.matrix = this.iteration_GJ(M.matrix, i, i);
    	}
    	for(int i = 0; i < M.matrix.length; i++) {
    		for(int j = 0; j < M.matrix.length; j++) {
        		M.matrix[i][j] = M.matrix[i][j+l];
        	}
    	}
    	

    	this.nbr_colonnes = l;
    	this.nbr_lignes = l;
    	this.matrix = M.matrix;
    }
   
    // la question 3 ( fonction qui calcule la solution d’un système d’équations) :
    
    public void gaussJordanSolveEquations() throws Exception {
    	
    	for(int i = 0; i < this.matrix.length; i++) {
    		this.matrix = this.iteration_GJ(this.matrix, i, i);
    	}
    	
		System.out.println("Solution de système d'équations:");
		System.out.println(" \n");

        for (int i = 0; i < this.nbr_lignes ; i++) {
            	System.out.print("	x"+(i+1)+" = "+this.matrix[i][this.nbr_lignes] + "\t \n");
            
        }
        System.out.println(" \n");
        

    }
  
    
    // simplex :
    

    public void simplex() throws Exception {
    	

    }
    
    

}
