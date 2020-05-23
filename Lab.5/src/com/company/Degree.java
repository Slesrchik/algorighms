package com.company;

public class Degree {
    // returns the sum of degree of all
    // the nodes in a undirected graph
    static int count(int[][] edges, int len, int n) {
        int degree[] = new int[n + 1];

        // compute the degree of each node
        for (int i = 0; i < len; i++) {

            // increase the degree of the
            // nodes
            degree[edges[i][0]]++;
            degree[edges[i][1]]++;
            System.out.println(degree[edges[i][1]]);
        }

        // return degree;

        //calculate the sum of degree
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += degree[i];
           // System.out.println(degree[i]);
            return sum;

        }
       return 1;
    }

}