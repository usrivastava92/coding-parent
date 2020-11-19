package com.ds.graph;


import javafx.util.Pair;

import java.util.*;

public class UndirectedUnweightedGraph<Node> implements IUndirectedGraph<Node>, IUnweightedGraph<Node> {

    private final Map<Node, Set<Node>> map;
    private final Set<Pair<Node, Node>> edges;

    public UndirectedUnweightedGraph() {
        map = new HashMap<>();
        edges = new HashSet<>();
    }

    @Override
    public Set<Node> getNeighbours(Node node) {
        return map.getOrDefault(node, Collections.emptySet());
    }

    @Override
    public Set<Node> getAllNodes() {
        return map.keySet();
    }

    @Override
    public boolean isConnected(Node node1, Node node2) {
        return map.getOrDefault(node1, Collections.emptySet()).contains(node2);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public void addEdge(Node from, Node to) {
        edges.add(new Pair<>(from, to));
        Set<Node> neighbours1 = map.getOrDefault(from, new HashSet<>());
        Set<Node> neighbours2 = map.getOrDefault(to, new HashSet<>());
        neighbours1.add(to);
        neighbours2.add(from);
        map.put(from, neighbours1);
        map.put(to, neighbours2);
    }

    @Override
    public Set<Pair<Node, Node>> getAllEdges() {
        return edges;
    }

    @Override
    public void removeEdge(Node from, Node to) {
        edges.remove(new Pair<>(from, to));
        map.getOrDefault(from, Collections.emptySet()).remove(to);
        map.getOrDefault(to, Collections.emptySet()).remove(from);
    }

    @Override
    public String toString() {
        return "UndirectedUnweightedGraph{" +
                "map=" + map +
                '}';
    }

}