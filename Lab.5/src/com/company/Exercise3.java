package com.company;

import java.util.LinkedList;

public class Exercise3 {
    final static int V = 4; // Amount of vertices

//this method returns true,if the graphic G [V][V] is bipartite




    boolean isBipartite(int G[][], int src) {
       //create the array to store colors
       //all vertices are marked by colors
       // the number of the vertex is used as an iterator
       // value «-1»
       // of colorArr [i] is used to show
       //  that color is not used
       // for the vertex 'i'. Value 1
       //  is used to mark the first color
       // used  and value 0 shows
       // that the second color is used

        int colorArr[] = new int[V];

        for (int i = 0; i < V; ++i)

            colorArr[i] = -1;


       // mark the source with the first color

        colorArr[src] = 1;


       // create queue (FIFO) of vertices number

       //and queue the original vertex to bypass the BFS

        LinkedList<Integer> q = new LinkedList<Integer>();

        q.add(src);


        //Run when there are vertices in the queue (similar to BFS)

        while (q.size() != 0) {

            // delete the vertex from queue

            int u = q.poll();


            // return false, if there is a cycle

            if (G[u][u] == 1)

                return false;


            // find all unmarked vertices

            for (int v = 0; v < V; ++v) {

                // there exist an edge from u to v

                // and destination v is not marked

                if (G[u][v] == 1 && colorArr[v] == -1) {

                    // Assign an alternate color to this adjacent v of you

                    colorArr[v] = 1 - colorArr[u];

                    q.add(v);

                }


                // there exist an edge from u to v and destination

                //  for v is used the same color as for u

                else if (G[u][v] == 1 && colorArr[v] == colorArr[u])

                    return false;

            }

        }

        // all adjacent vertices can

        // be marked with alternative color

        return true;

    }


}
