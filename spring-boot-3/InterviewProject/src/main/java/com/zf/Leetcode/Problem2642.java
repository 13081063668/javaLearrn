package com.zf.Leetcode;

import java.util.*;

class Graph {
    List<int[]>[] graph;
    public Graph(int n, int[][] edges) {
        // 带权邻接表
        graph = new List[n];
        for(int i = 0; i < n; i++)graph[i] = new LinkedList<>();
        for(int i = 0; i < edges.length; i++){
            graph[edges[i][0]].add(new int[]{edges[i][1], edges[i][2]});
        }
    }

    public void addEdge(int[] edge) {
        graph[edge[0]].add(new int[]{edge[1], edge[2]});
    }

    public int shortestPath(int node1, int node2) {
        // 迪杰斯特拉
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        int[] dist = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[node1] = 0;
        pq.add(new int[]{0, node1});
        while(! pq.isEmpty()){
            int node = pq.peek()[1], cost = pq.peek()[0];
            pq.poll();
            if(node == node2) return cost;
            for(int[] nextArr: graph[node]){
               int nextNode = nextArr[0], ncost = nextArr[1];
               if(dist[nextNode] > dist[node] + ncost){
                   dist[nextNode] = cost + ncost;
                   pq.offer(new int[]{cost + ncost, nextNode});
               }
            }
        }
        return -1;
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */
public class Problem2642 {
    public static void main(String[] args) {

    }
}
