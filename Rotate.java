package endstarttesting;

public class Rotate {
	
	public void printMatrix(int[][] matrix, int n )
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(matrix[j][i] + " ");
			}
			System.out.print("\n");
		}
	}
	
	public void rotateMatrix(int[][] m, int n)
	{
		for(int layer = 0; layer < n/2; ++layer)
		{
			int first = layer;
			int last = n - 1 - layer;
			
			for(int i = first; i < last; ++i)
			{
				int offset = i - first;
				//save top
				int top = m[first][i];
				//copy left to top
				m[first][i] = m[last-offset][first];
				//bottom to left
				m[last-offset][first] = m[last][last-offset];
				//right to bottom
				m[last][last-offset] = m[i][last];
				//top to right
				m[i][last] = top;
			}
		}
	}

}
