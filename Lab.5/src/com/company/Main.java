package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    // static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    // static PrintWriter out = new PrintWriter(System.out);

//    static int nextInt() throws IOException, IOException {
//        in.nextToken();
//        return (int) in.nval;
//    }

    public static void main(String[] args) throws IOException {

//        int n = 0;
//        try {
//            n = nextInt();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (int i = 0; i < n; i++) {
//            int counter = 0, x;
//            for (int j = 0; j < n; j++) {
//                x = nextInt();
//                if (x > 0) counter += (i == j ? 2 : 1);
//            }
//            out.print(counter + " ");
//            out.flush();

       Scanner in = new Scanner(System.in);
        //Exercise 3 (Construct and implement an algorithm that checks whether the input graph is bipartite.)
        int G[][] = new int[4][4];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                G[i][j] = in.nextInt();
               // System.out.println(G);

            }
        }

        Exercise3 b = new Exercise3();

        if (b.isBipartite(G, 0)) System.out.println("It is a bipartite graph");

        else {

            System.out.println("It is not a bipartite graph");
        }
        // Exercise 2 (Construct and implement an algorithm that checks if there exists a cycle in this undirected graph)

//        Cycle g1 = new Cycle(5);
//        g1.addEdge(1, 0);
//        g1.addEdge(0, 2);
//        g1.addEdge(2, 1);
//        g1.addEdge(0, 3);
//        g1.addEdge(3, 4);
//        if (g1.isCyclic())
//            System.out.println("Graph contains  a cycle");
//        else
//            System.out.println("Graph doesn't contain  a cycle");
//
//        Cycle g2 = new Cycle(4);
//        g2.addEdge(0, 1);
//        g2.addEdge(0, 2);
//        g2.addEdge(0, 3);
//        if (g2.isCyclic())
//            System.out.println("Graph contains a cycle");
//        else
//            System.out.println("Graph doesn't contain a cycle");

    }

}


