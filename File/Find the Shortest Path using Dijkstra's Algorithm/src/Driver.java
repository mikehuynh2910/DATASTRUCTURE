
public class Driver {
	public static void main(String[] args)
	{
		//(A, Q, G, P,N,C,T,F,H,R)
	int[][] adjacencyMatrix = { { 2,0,2,0,0,0,3,0,3,0 },
			{ 0,2,0,2,0,0,0,0,0,0 },
			{ 0,0,2,0,4,0,0,0,3,0 },
			{ 0,0,0,4,0,2,0,0,0,2 },
			{ 0,0,0,0,2,0,7,0,0,0 },
			{ 0,0,0,0,0,7,0,4,0,0 },
			{ 0,0,0,0,0,0,4,0,0,0 },
			{ 3,3,0,0,0,0,0,0,0,6 },
			{3,3,0,0,0,0,0,0,0,6},
			{2,0,2,0,0,0,3,0,3,0 }};
			;
	ShortestPath t = new ShortestPath();
			t.dijkstra(adjacencyMatrix, 0);
	}
}
	


