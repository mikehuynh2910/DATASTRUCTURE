import java.util.*;
import java.lang.*;
import java.io.*;
class graph
{
// a category to represent a graph edge
class edge implements comparable<edge>
{
int src, dest, weight;
// comparator function used for
// sorting edgesbased on their weight
public int compareto (edge compareedge)
{
return this.weight - compareedge.weight;
}
};
// a category to represent a subset for
// union-find
class subset
{
int parent, rank;
};
int v, e; // v-> no. of vertices & e->no.of edges
edge edge[]; // collection of all edges
// creates a graph with v vertices and e edges
graph (int v, int e)
{
v = v;
e = e;
edge = new edge[e];
for (int i = 0; i < e; ++i)
edge[i] = new edge ();
}
// a utility function to hunt out set of an
// element i (uses path compression technique)
int find (subset subsets[], int i)
{
// find root and make root as parent of i
// (path compression)
if (subsets[i].parent != i)
subsets[i].parent = find (subsets, subsets[i].parent);
return subsets[i].parent;
}
// a function that does union of two sets
// of x and y (uses union by rank)
void union (subset subsets[], int x, int y)
{
int xroot = find (subsets, x);
int yroot = find (subsets, y);
// attach smaller rank tree under root
// of high rank tree (union by rank)
if (subsets[xroot].rank < subsets[yroot].rank)
subsets[xroot].parent = yroot;
else if (subsets[xroot].rank > subsets[yroot].rank)
subsets[yroot].parent = xroot;
// if ranks are same, then make one as
// root and increment its rank by one
else
{
subsets[yroot].parent = xroot;
subsets[xroot].rank++;
}
}
// the foremost function to construct mst using kruskal's
// algorithm
void kruskalmst ()
{
// tnis will store the resultant mst
edge result[] = new edge[v];
// an index variable, used for result[]
int e = 0;
// an index variable, used for sorted edges
int i = 0;
for (i = 0; i < v; ++i)
result[i] = new edge ();
// step 1: sort all the edges in non-decreasing
// order of their weight. if we aren't allowed to
// change the given graph, we'll create a reproduction of
// array of edges
arrays.sort (edge);
// allocate memory for creating v ssubsets
subset subsets[] = new subset[v];
for (i = 0; i < v; ++i)
subsets[i] = new subset ();
// create v subsets with single elements
for (int v = 0; v < v; ++v)
{
subsets[v].parent = v;
subsets[v].rank = 0;
}
i = 0; // index wont to pick next edge
// number of edges to be taken is capable v-1
while (e < v - 1)
{
// step 2: pick the littlest edge. and increment
// the index for next iteration
edge next_edge = new edge ();
next_edge = edge[i++];
int x = find (subsets, next_edge.src);
int y = find (subsets, next_edge.dest);
// if including this edge does't cause cycle,
// include it in result and increment the index
// of result for next edge
if (x != y)
{
result[e++] = next_edge;
union (subsets, x, y);
}
// else discard the next_edge
}
// print the contents of result[] to display
// the built mst
system.out.println ("the sides in "
+ "the constructed mst");
int minimumcost = 0;
for (i = 0; i < e; ++i)
{
system.out.println (result[i].src + " -- "
+ result[i].dest + " == " + result[i].weight);
minimumcost += result[i].weight;
}
system.out.println ("minimum spanning tree cost" + minimumcost);
}
public static void main (string[]args)
{
//create graph like this
//graph graph = new graph(v, e);
//add edges like this
//graph.edge[0].src = 0;
//graph.edge[0].dest = 1;
//graph.edge[0].weight = 10;
// call graph.kruskalmst();

//create graph as per your need
}
}