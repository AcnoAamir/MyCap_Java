package prac;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j,k;
		System.out.print("Enter the dimension of Matrix(nxn) : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mat1[][] = new int[n][n];
		int mat2[][] = new int[n][n];
		int add_mat[][] = new int[n][n];
		int mul_mat[][] = new int[n][n];
		System.out.print("Enter values of Matrix 1 : ");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter values of Matrix 2 : ");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				mat2[i][j] = sc.nextInt();
				add_mat[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				mul_mat[i][j]=0;
				for(k=0;k<n;k++) {
					mul_mat[i][j]+=mat1[i][k]*mat2[k][j];
				}
			}
		}
		System.out.println("\nMatrix 1 -");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(mat1[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("\nMatrix 2 -");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(mat1[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("\nAdd Matrix  -");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(add_mat[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("\nMultiple Matrix  -");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(mul_mat[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

}
