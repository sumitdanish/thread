package com.sumit.practice.DP;

public class MinCostPathInMattrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] c = { {1, 2, 3},
                 			{4, 8, 2},
                 			{1, 5, 3} 
                 		  };
		 System.out.println(new MinCostPathInMattrix().getMinCost1(c, 2, 2));
	}
	
	public int getMinCost(int[][] c,int row,int col){
		if(row <0 || col < 0){
			return 0;
		}
		if(row == 0 && col == 0){
			return c[row][col];
		}
		return c[row][col]+getMin1(
										getMinCost(c, row-1, col-1),
										getMinCost(c, row-1, col),
										getMinCost(c, row, col-1)
									);
	}
	
	public int getMinCost1(int[][] c,int row,int col){
		int[][] tab = new int[row+1][col+1];
		tab[0][0] = c[0][0];
		for(int i = 1;i<=row;i++){
		tab[i][0] = tab[i-1][0]+c[i][0];
		}
		for(int j = 1;j<=col;j++){
			tab[0][j] = tab[0][j-1]+c[0][j];
		}
		
		for(int i = 1;i<=row;i++){
			for(int j = 1;j<=col;j++){
				tab[i][j] = getMin1(tab[i-1][j-1], tab[i-1][j], tab[i][j-1])+c[i][j];
			}
		}
		return tab[row][col];
		
	}
	
	
	public int getMin(int a,int b){
		return a > b ? b:a;
	}
	
	public int getMin1(int a,int b,int c){
		return a > getMin(b,c)?getMin(b,c):a;
	}
	
}
