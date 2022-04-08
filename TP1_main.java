
public class TP1_main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
	// la question 4/a (Calculer l’inverse des matrices):
		float[][] B = {{2,1},{3,1}};
		float[][] A = {{2,-1,0},{-1,2,-1},{0,-1,2}};
		float[][] C = {{2,1},{3,1}};

		Matrix Matrix_B = new Matrix(B);
		Matrix_B.gaussJordanInverse();
		System.out.println("l'inverse de la matrice B :");
		Matrix_B.Afficher();

		
		Matrix Matrix_A = new Matrix(A);
		Matrix_A.gaussJordanInverse();
		System.out.println("l'inverse de la matrice A :");
		Matrix_A.Afficher();
		
		Matrix Matrix_C = new Matrix(C);
		Matrix_C.Afficher();
		
		
		// la question 4/d (Résoudre le système d’équations) :
		float[][] M = {{2,1,4,16},{3,2,1,10},{1,3,3,16}};
		Matrix Matrix_M = new Matrix(M);
		Matrix_M.gaussJordanSolveEquations();

		//la question 4/b :
		
		float[][] A = {{2,-1,0,10},{-1,2,-1,-4},{0,-1,2,2}};
		
		Matrix Matrix_A = new Matrix(A);
		Matrix_A.gaussJordanSolveEquations();

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
		float[][] A = {{1,0,1,0,0,6},{1/4,1,0,1,0,6},{3,2,0,0,1,22}};
		Matrix Matrix_A = new Matrix(A);
		Matrix_A.gaussJordanSolveEquations();



		Matrix_A.Afficher();
	}

}
