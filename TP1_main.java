
// la reponse de chaque question est mit en commentaire , enleves les /* */ pour executer ( l'execution de chaque question est independante ) .
// ******************************************************************************************************************************************

public class TP1_main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
	// la question 4/a (Calculer l’inverse des matrices):
		
		/*
		float[][] B = {{2,1},{3,1}};
		float[][] A = {{2,-1,0},{-1,2,-1},{0,-1,2}};
		 

		Matrix Matrix_A = new Matrix(A);
		Matrix_A.gaussJordanInverse();
		System.out.println("l'inverse de la matrice A :");
		Matrix_A.Afficher();
		
		Matrix Matrix_B = new Matrix(B);
		Matrix_B.gaussJordanInverse();
		System.out.println("l'inverse de la matrice B :");
		Matrix_B.Afficher();

		*/
		
   //la question 4/b :
		
		/*
		float[][] A = {{2,-1,0,10},{-1,2,-1,-4},{0,-1,2,2}};
		
		Matrix Matrix_A = new Matrix(A);
		Matrix_A.gaussJordanSolveEquations();
		*/
		
	//la question/c :
		
		/*
		float[][] B = {{2,1},{3,1}};
		float[][] A = {{2,-1,0},{-1,2,-1},{0,-1,2}};
		Matrix Matrix_A = new Matrix(A);
		Matrix Matrix_B = new Matrix(B);
		Matrix MltpA = Matrix_A.Multiplication_matrix(Matrix_A.Transpose_Matrix());
		Matrix MltpB = Matrix_A.Multiplication_matrix(Matrix_A.Transpose_Matrix());
		System.out.println("A*A^(-1) :");
		MltpA.Afficher();
		System.out.println("B*B^(-1) :");
		MltpB.Afficher();
		*/
		
  // la question 4/d (Résoudre le système d’équations) :
		/*
		float[][] M = {{2,1,4,16},{3,2,1,10},{1,3,3,16}};
		Matrix Matrix_M = new Matrix(M);
		Matrix_M.gaussJordanSolveEquations();
       */

	
  // le teste de simplexe : 

		
		float[] z = {60,30,20};
		float[][] A = {{8,6,1},{4,2,1},{2,1,0}};
		Matrix Matrix_A = new Matrix(A);
		float[] b = {48,20,8};
		
		float[] solution  =Matrix_A.simplex( z,A,b,objectif.MAX );
		
		 
		
	}

}
