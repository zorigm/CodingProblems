package endstarttesting;

public class ZeroMatrix {
	
	public void printMatrix(int[][] matrix, int m, int n )
	{
		if(n == 0)
		{
			for(int i = 0; i < m; i++)
			{
				for(int j = 0; j < m; j++)
				{
					System.out.print(matrix[j][i] + " ");
				}
				System.out.print("\n");
			}
		}
		else
		{
			for(int i = 0; i < m; i++)
			{
				for(int j = 0; j < n; j++)
				{
					System.out.print(matrix[j][i] + " ");
				}
				System.out.print("\n");
			}
		}
	}
	
	public void loadMatrix(int[][] matrix, int row, int column)
	{
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			{
				matrix[j][i] = 1;
			}
		}
	}
	
	public void matrixZeros(int m[][], int row, int column)
	{
		int[] rows = new int[row];
		int[] columns = new int[column];
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			{
				if(m[j][i] == 0)
				{
					rows[i] = 1;
					columns[j] = 1;
				}
			}
		}
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			{
				if(rows[i] == 1 || columns[j] == 1)
				{
					m[i][j] = 0;
				}
			}
		}
	}

}
