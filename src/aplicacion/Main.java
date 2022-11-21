/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion;


import java.util.ArrayList;
import java.util.List;

import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;

import com.jwetherell.algorithms.graph.AStar;

/**
 *
 * @author elena
 */
public class Main {
    
    public static class Grafo { // Se crea la clase grafo y se añade sus vertices y  con sus costes 
    final List<Vertex<Integer>> node = new ArrayList<Vertex<Integer>>();
   
    final Graph.Vertex<Integer> s1 = new Graph.Vertex<Integer>(1);
    final Graph.Vertex<Integer> a1 = new Graph.Vertex<Integer>(2);
    final Graph.Vertex<Integer> b1 = new Graph.Vertex<Integer>(3);
    final Graph.Vertex<Integer> c1 = new Graph.Vertex<Integer>(4);
    final Graph.Vertex<Integer> d1 = new Graph.Vertex<Integer>(5);
    final Graph.Vertex<Integer> e1 = new Graph.Vertex<Integer>(6);
    final Graph.Vertex<Integer> f1 = new Graph.Vertex<Integer>(7);
   
    {
      // añadir vertices a la lista   
      node.add(s1); 
      node.add(a1);
      node.add(b1);
      node.add(c1);
      node.add(d1);
      node.add(e1);
      node.add(f1);
    }
    //Se crea las aristas con sus costes 
    final List<Edge<Integer>> edges = new ArrayList<Edge<Integer>>(); 
    
    final Graph.Edge<Integer> e1_1 = new Graph.Edge<Integer>(1, s1, a1);  // S->A
    final Graph.Edge<Integer> e1_2 = new Graph.Edge<Integer>(5, s1, b1);  // S->B
    final Graph.Edge<Integer> e1_3 = new Graph.Edge<Integer>(2, s1, c1);  // S->C
    final Graph.Edge<Integer> e2_1 = new Graph.Edge<Integer>(8, a1, d1);  // A->D
    final Graph.Edge<Integer> e2_2 = new Graph.Edge<Integer>(4, b1, e1);  // B->E
    final Graph.Edge<Integer> e2_3 = new Graph.Edge<Integer>(1, c1, b1);  // C->B 
    final Graph.Edge<Integer> e2_4 = new Graph.Edge<Integer>(7, c1, d1);  // C->D
    final Graph.Edge<Integer> e3_1 = new Graph.Edge<Integer>(3, d1, f1);  // D->F
    final Graph.Edge<Integer> e3_2 = new Graph.Edge<Integer>(1, e1, d1);  // E->D 

    {
    edges.add(e1_1);
    edges.add(e1_2);
    edges.add(e1_3);
    edges.add(e2_1);
    edges.add(e2_2);
    edges.add(e2_3);
    edges.add(e2_4);
    edges.add(e3_1);
    edges.add(e3_2);

    }

    final Graph<Integer> graph = new Graph<Integer>(node, edges);

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // System.out.println("Esto es una prueba");
        final Grafo grafo = new Grafo(); //Instanciar objeto grafo en main

        final Graph.Vertex<Integer> start = grafo.s1; //Empezamos en v1
        final Graph.Vertex<Integer> finish = grafo.f1; // Vamos a v10

        {
        final AStar<Integer> aStar = new AStar<Integer>();
        
        final List<Graph.Edge<Integer>> path = aStar.aStar(grafo.graph, start, finish); //Se pasan los parámetros necesarios
        
        System.out.println("El camino óptimo que va de origen a destino es\n" + path);
  	} 
        
    }
} 

   