public class KrushkalAlgorithm 
{
    
    public static void main(String[] args) 
{
        /* Let us create following longwayed graph
        10
   1--------2
   |  \     |
  6|   5\   |15
   |      \ |
   3--------4
       4       */   // set cities at the edge, get tour
        
        Graph graph = new Graph(4);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addEdge(1, 2, 10);
        graph.addEdge(1, 3, 6);
        graph.addEdge(1, 4, 5);
        graph.addEdge(3, 4, 4);
        graph.addEdge(2, 4, 15);
        graph.applyKrushkalAlgo();
      	System.out.println(" following above step to visit the cities  ");
    }
    public static class Graph 
{
        Vertex[] vertices;
        Edge edgeList;
        int maxSize;
        int size;
        int edgeNum;

        public Graph(int maxSize) 
{
            this.maxSize = maxSize;
            vertices = new Vertex[maxSize];
        }

        public class Vertex 
{
            int rank;
            Vertex representative;
            int name;
            Neighbour adj;

            Vertex(int name) 
{
                this.name = name;
                representative = this; // makeset
            }
        }

        public class Neighbour 
{
            int index;
            Neighbour next;
            int longway;

            Neighbour(int index, int longway, Neighbour next)
 {
                this.index = index;
                this.longway = longway;
                this.next = next;
            }
        }

        public class Edge 
{
            Vertex src;
            Vertex desti;
            Edge next;
            int longway;

            Edge(Vertex src, Vertex desti, int longway, Edge next) 
{
                this.src = src;
                this.desti = desti;
                this.longway = longway;
                this.next = next;
            }
        }

        public void addVertex(int name) 
{
            vertices[size++] = new Vertex(name);
        }

        public void addEdge(int src, int dest, int longway) 
{
            vertices[src - 1].adj = new Neighbour(dest - 1, longway, vertices[src - 1].adj);
            edgeList = new Edge(vertices[src - 1], vertices[dest - 1], longway, edgeList);
            edgeNum++;
        }

        public void applyKrushkalAlgo() 
{
            Edge[] edges = new Edge[edgeNum];
            int i = 0;
            while (edgeList != null) 
{
                edges[i] = edgeList;
                i++;
                edgeList = edgeList.next;
            }
            quicksort(edges, 0, edgeNum - 1);
            for (i = 0; i < edgeNum; i++) 
{
                Vertex u = findSet(edges[i].src);
                Vertex v = findSet(edges[i].desti);
                if (u != v) 
{
              
                    System.out.println(edges[i].src.name + " - " + edges[i].desti.name+" longway "+edges[i].longway);
                    union(u, v);
                }
            }
        }

        public Vertex findSet(Vertex u) 
{
            if (u.representative != u)
 {
                u.representative = findSet(u.representative); // path compression
            }
            return u.representative;
        }

        public void union(Vertex u, Vertex v)
 {
            if(u.rank == v.rank)
{
                v.representative = u;
                u.rank++;
            }
          else if(u.rank < v.rank)
                {
                v.representative = u;
            }
              else
               {
                u.representative = v;
            }
        }

        public void quicksort(Edge[] edges, int start, int end) 
{
            if (start < end) 
{
                swap(edges, end, start + (end - start) / 2);
                int pIndex = pivot(edges, start, end);
                quicksort(edges, start, pIndex - 1);
                quicksort(edges, pIndex + 1, end);
            }
        }

        public int pivot(Edge[] edges, int start, int end) 
{
            int pIndex = start;
            Edge pivot = edges[end];
            for (int i = start; i < end; i++) 
{
                if (edges[i].longway < pivot.longway) 
{
                    swap(edges, i, pIndex);
                    pIndex++;
                }
            }
            swap(edges, end, pIndex);
            return pIndex;
        }

        public void swap(Edge[] edges, int index1, int index2) 
{
            Edge temp = edges[index1];
            edges[index1] = edges[index2];
            edges[index2] = temp;
        }
    }
}
