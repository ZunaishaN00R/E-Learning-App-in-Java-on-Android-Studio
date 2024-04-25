package com.zunaisha.e_learning_app.ui.code;

import java.util.HashMap;
import java.util.Map;

public class ProgramExample {
    public static final String ex1a = "class GraphAdjacencyMatrix:\n" +
            "    def __init__(self, num_vertices):\n" +
            "        self.num_vertices = num_vertices\n" +
            "        self.matrix = [[0] * num_vertices for _ in range(num_vertices)]\n" +
            "    \n" +
            "    def add_edge(self, v1, v2):\n" +
            "        if 0 <= v1 < self.num_vertices and 0 <= v2 < self.num_vertices:\n" +
            "            self.matrix[v1][v2] = 1\n" +
            "            self.matrix[v2][v1] = 1\n" +
            "    \n" +
            "    # Other methods...\n";

    public static final String ex1b = "\nfrom collections import defaultdict\n" +
            "\n" +
            "class GraphAdjacencyList:\n" +
            "    def __init__(self):\n" +
            "        self.adj_list = defaultdict(list)\n" +
            "    \n" +
            "    def add_edge(self, v1, v2):\n" +
            "        self.adj_list[v1].append(v2)\n" +
            "        self.adj_list[v2].append(v1)\n" +
            "    \n" +
            "    # Other methods...\n";

    public static final String ex1 = ex1a + "\n\n" + ex1b;
    public static final String ex2="" +
            "from collections import defaultdict\n" +
            "\n" +
            "class Graph:\n" +
            "    def __init__(self):\n" +
            "        self.adj_list = defaultdict(list)\n" +
            "\n" +
            "    def add_edge(self, v1, v2):\n" +
            "        self.adj_list[v1].append(v2)\n" +
            "        # Uncomment the line below for undirected graph\n" +
            "        # self.adj_list[v2].append(v1)\n" +
            "\n" +
            "    def dfs_recursive(self, start):\n" +
            "        visited = set()\n" +
            "\n" +
            "        def dfs(node):\n" +
            "            visited.add(node)\n" +
            "            print(node, end=' ')  # Process the node\n" +
            "\n" +
            "            for neighbor in self.adj_list[node]:\n" +
            "                if neighbor not in visited:\n" +
            "                    dfs(neighbor)\n" +
            "\n" +
            "        dfs(start)\n" +
            "\n" +
            "# Usage:\n" +
            "# graph = Graph()\n" +
            "# graph.add_edge(0, 1)\n" +
            "# graph.add_edge(0, 2)\n" +
            "# graph.add_edge(1, 3)\n" +
            "# graph.add_edge(2, 4)\n" +
            "# graph.dfs_recursive(0)  # Start DFS from node 0\n" +
            "\n" +
            "\n";
    public static final String ex3="" +
            "from collections import defaultdict, deque\n" +
            "\n" +
            "class Graph:\n" +
            "    def __init__(self):\n" +
            "        self.adj_list = defaultdict(list)\n" +
            "\n" +
            "    def add_edge(self, v1, v2):\n" +
            "        self.adj_list[v1].append(v2)\n" +
            "        # Uncomment the line below for undirected graph\n" +
            "        # self.adj_list[v2].append(v1)\n" +
            "\n" +
            "    def bfs(self, start):\n" +
            "        visited = set()\n" +
            "        queue = deque([start])\n" +
            "        visited.add(start)\n" +
            "\n" +
            "        while queue:\n" +
            "            node = queue.popleft()\n" +
            "            print(node, end=' ')  # Process the node\n" +
            "\n" +
            "            for neighbor in self.adj_list[node]:\n" +
            "                if neighbor not in visited:\n" +
            "                    visited.add(neighbor)\n" +
            "                    queue.append(neighbor)\n" +
            "\n" +
            "# Usage:\n" +
            "# graph = Graph()\n" +
            "# graph.add_edge(0, 1)\n" +
            "# graph.add_edge(0, 2)\n" +
            "# graph.add_edge(1, 3)\n" +
            "# graph.add_edge(2, 4)\n" +
            "# graph.bfs(0)  # Start BFS from node 0";

    public static final String ex4="" +
            "from collections import defaultdict, deque\n" +
            "\n" +
            "class Graph:\n" +
            "    def __init__(self):\n" +
            "        self.adj_list = defaultdict(list)\n" +
            "\n" +
            "    def add_edge(self, v1, v2):\n" +
            "        self.adj_list[v1].append(v2)\n" +
            "        # Uncomment the line below for undirected graph\n" +
            "        # self.adj_list[v2].append(v1)\n" +
            "\n" +
            "    def bfs(self, start):\n" +
            "        visited = set()\n" +
            "        queue = deque([start])\n" +
            "        visited.add(start)\n" +
            "\n" +
            "        while queue:\n" +
            "            node = queue.popleft()\n" +
            "            print(node, end=' ')  # Process the node\n" +
            "\n" +
            "            for neighbor in self.adj_list[node]:\n" +
            "                if neighbor not in visited:\n" +
            "                    visited.add(neighbor)\n" +
            "                    queue.append(neighbor)\n" +
            "\n" +
            "# Usage:\n" +
            "# graph = Graph()\n" +
            "# graph.add_edge(0, 1)\n" +
            "# graph.add_edge(0, 2)\n" +
            "# graph.add_edge(1, 3)\n" +
            "# graph.add_edge(2, 4)\n" +
            "# graph.bfs(0)  # Start BFS from node 0";
    public static final String ex5="from collections import defaultdict\n" +
            "\n" +
            "def has_cycle_dfs(graph):\n" +
            "    visited = set()\n" +
            "    recursion_stack = set()\n" +
            "\n" +
            "    def dfs(node):\n" +
            "        if node in recursion_stack:\n" +
            "            return True  # Cycle detected\n" +
            "\n" +
            "        if node in visited:\n" +
            "            return False\n" +
            "\n" +
            "        visited.add(node)\n" +
            "        recursion_stack.add(node)\n" +
            "\n" +
            "        for neighbor in graph[node]:\n" +
            "            if dfs(neighbor):\n" +
            "                return True\n" +
            "\n" +
            "        recursion_stack.remove(node)\n" +
            "        return False\n" +
            "\n" +
            "    # Iterate over all nodes in the graph\n" +
            "    for node in graph:\n" +
            "        if dfs(node):\n" +
            "            return True\n" +
            "\n" +
            "    return False\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = {\n" +
            "#     0: [1, 2],\n" +
            "#     1: [2],\n" +
            "#     2: [3],\n" +
            "#     3: [0, 4],\n" +
            "#     4: []\n" +
            "# }\n" +
            "# print(has_cycle_dfs(graph))  # Output: True (Cycle exists)\n" +
            "\n";
    public static final String ex6="from collections import defaultdict\n" +
            "\n" +
            "def find_connected_components(graph):\n" +
            "    visited = set()\n" +
            "    components = []\n" +
            "\n" +
            "    def dfs(node, component):\n" +
            "        stack = [node]\n" +
            "        while stack:\n" +
            "            current = stack.pop()\n" +
            "            if current not in visited:\n" +
            "                visited.add(current)\n" +
            "                component.append(current)\n" +
            "                for neighbor in graph[current]:\n" +
            "                    if neighbor not in visited:\n" +
            "                        stack.append(neighbor)\n" +
            "\n" +
            "    for node in graph:\n" +
            "        if node not in visited:\n" +
            "            component = []\n" +
            "            dfs(node, component)\n" +
            "            components.append(component)\n" +
            "\n" +
            "    return components\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = {\n" +
            "#     0: [1, 2],\n" +
            "#     1: [0, 3],\n" +
            "#     2: [0],\n" +
            "#     3: [1],\n" +
            "#     4: [5],\n" +
            "#     5: [4]\n" +
            "# }\n" +
            "# components = find_connected_components(graph)\n" +
            "# print(components)  # Output: [[0, 1, 3, 2], [4, 5]]\n" +
            "\n";
    public static final String ex7="from collections import defaultdict, deque\n" +
            "\n" +
            "class Graph:\n" +
            "    def __init__(self):\n" +
            "        self.adj_list = defaultdict(list)\n" +
            "\n" +
            "    def add_edge(self, u, v):\n" +
            "        self.adj_list[u].append(v)\n" +
            "\n" +
            "    def dfs(self, node, visited, stack):\n" +
            "        visited.add(node)\n" +
            "        for neighbor in self.adj_list[node]:\n" +
            "            if neighbor not in visited:\n" +
            "                self.dfs(neighbor, visited, stack)\n" +
            "        stack.append(node)\n" +
            "\n" +
            "    def transpose(self):\n" +
            "        transposed_graph = Graph()\n" +
            "        for node in self.adj_list:\n" +
            "            for neighbor in self.adj_list[node]:\n" +
            "                transposed_graph.add_edge(neighbor, node)\n" +
            "        return transposed_graph\n" +
            "\n" +
            "    def dfs_scc(self, node, visited, component):\n" +
            "        visited.add(node)\n" +
            "        component.append(node)\n" +
            "        for neighbor in self.adj_list[node]:\n" +
            "            if neighbor not in visited:\n" +
            "                self.dfs_scc(neighbor, visited, component)\n" +
            "\n" +
            "    def kosaraju_scc(self):\n" +
            "        visited = set()\n" +
            "        stack = []\n" +
            "\n" +
            "        # Step 1: Perform DFS to fill the stack based on finish times\n" +
            "        for node in self.adj_list:\n" +
            "            if node not in visited:\n" +
            "                self.dfs(node, visited, stack)\n" +
            "\n" +
            "        # Step 2: Transpose the graph\n" +
            "        transposed_graph = self.transpose()\n" +
            "\n" +
            "        # Step 3: Perform DFS on the transposed graph in reverse order of finish times\n" +
            "        visited.clear()\n" +
            "        sccs = []\n" +
            "        while stack:\n" +
            "            node = stack.pop()\n" +
            "            if node not in visited:\n" +
            "                component = []\n" +
            "                transposed_graph.dfs_scc(node, visited, component)\n" +
            "                sccs.append(component)\n" +
            "\n" +
            "        return sccs\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = Graph()\n" +
            "# graph.add_edge(0, 1)\n" +
            "# graph.add_edge(1, 2)\n" +
            "# graph.add_edge(2, 0)\n" +
            "# graph.add_edge(1, 3)\n" +
            "# graph.add_edge(3, 4)\n" +
            "# graph.add_edge(4, 5)\n" +
            "# graph.add_edge(5, 3)\n" +
            "# sccs = graph.kosaraju_scc()\n" +
            "# print(sccs)  # Output: [[0, 2, 1], [5, 4, 3]]\n" +
            "\n";
    public static final String ex8="import heapq\n" +
            "from collections import defaultdict\n" +
            "\n" +
            "class Graph:\n" +
            "    def __init__(self):\n" +
            "        self.adj_list = defaultdict(list)\n" +
            "\n" +
            "    def add_edge(self, u, v, weight):\n" +
            "        self.adj_list[u].append((v, weight))\n" +
            "\n" +
            "    def dijkstra(self, source):\n" +
            "        # Initialize distances with infinity for all nodes\n" +
            "        distances = {node: float('inf') for node in self.adj_list}\n" +
            "        distances[source] = 0  # Distance to source node is 0\n" +
            "        priority_queue = [(0, source)]  # (distance, node)\n" +
            "\n" +
            "        while priority_queue:\n" +
            "            current_distance, current_node = heapq.heappop(priority_queue)\n" +
            "\n" +
            "            # If current node's distance is greater than the popped distance, skip processing\n" +
            "            if current_distance > distances[current_node]:\n" +
            "                continue\n" +
            "\n" +
            "            # Explore neighbors of the current node\n" +
            "            for neighbor, weight in self.adj_list[current_node]:\n" +
            "                distance = current_distance + weight\n" +
            "\n" +
            "                # Update the distance if a shorter path is found\n" +
            "                if distance < distances[neighbor]:\n" +
            "                    distances[neighbor] = distance\n" +
            "                    heapq.heappush(priority_queue, (distance, neighbor))\n" +
            "\n" +
            "        return distances\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = Graph()\n" +
            "# graph.add_edge('A', 'B', 4)\n" +
            "# graph.add_edge('A', 'C', 2)\n" +
            "# graph.add_edge('B', 'C', 5)\n" +
            "# graph.add_edge('B', 'D', 10)\n" +
            "# graph.add_edge('C', 'D', 3)\n" +
            "\n" +
            "# source_node = 'A'\n" +
            "# shortest_distances = graph.dijkstra(source_node)\n" +
            "\n" +
            "# Print shortest distances from source node to all other nodes\n" +
            "# for node, distance in shortest_distances.items():\n" +
            "#     print(f\"Shortest distance from {source_node} to {node} is {distance}\")\n" +
            "\n";
    public static final String ex9="class Graph:\n" +
            "    def __init__(self):\n" +
            "        self.edges = []\n" +
            "\n" +
            "    def add_edge(self, u, v, weight):\n" +
            "        # Add directed edge (u -> v) with specified weight\n" +
            "        self.edges.append((u, v, weight))\n" +
            "\n" +
            "    def bellman_ford(self, source):\n" +
            "        # Step 1: Initialize distances from source to all other nodes\n" +
            "        distances = {node: float('inf') for node in range(max(self._get_nodes()) + 1)}\n" +
            "        distances[source] = 0\n" +
            "\n" +
            "        # Step 2: Relax edges repeatedly (|V| - 1) times\n" +
            "        num_nodes = len(distances)\n" +
            "        for _ in range(num_nodes - 1):\n" +
            "            for u, v, weight in self.edges:\n" +
            "                if distances[u] != float('inf') and distances[u] + weight < distances[v]:\n" +
            "                    distances[v] = distances[u] + weight\n" +
            "\n" +
            "        # Step 3: Check for negative-weight cycles (optional)\n" +
            "        for u, v, weight in self.edges:\n" +
            "            if distances[u] != float('inf') and distances[u] + weight < distances[v]:\n" +
            "                raise ValueError(\"Graph contains a negative-weight cycle\")\n" +
            "\n" +
            "        return distances\n" +
            "\n" +
            "    def _get_nodes(self):\n" +
            "        # Helper method to extract all unique nodes from edges\n" +
            "        nodes = set()\n" +
            "        for u, v, _ in self.edges:\n" +
            "            nodes.add(u)\n" +
            "            nodes.add(v)\n" +
            "        return nodes\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = Graph()\n" +
            "# graph.add_edge(0, 1, 4)\n" +
            "# graph.add_edge(0, 2, 2)\n" +
            "# graph.add_edge(1, 3, 1)\n" +
            "# graph.add_edge(2, 1, -3)\n" +
            "# graph.add_edge(2, 3, 5)\n" +
            "\n" +
            "# source_node = 0\n" +
            "# shortest_distances = graph.bellman_ford(source_node)\n" +
            "\n" +
            "# Print shortest distances from source node to all other nodes\n" +
            "# for node, distance in shortest_distances.items():\n" +
            "#     print(f\"Shortest distance from {source_node} to {node} is {distance}\")\n";
    public static final String ex10="class UnionFind:\n" +
            "    def __init__(self, n):\n" +
            "        self.parent = list(range(n))\n" +
            "        self.rank = [0] * n\n" +
            "\n" +
            "    def find(self, u):\n" +
            "        if self.parent[u] != u:\n" +
            "            self.parent[u] = self.find(self.parent[u])  # Path compression\n" +
            "        return self.parent[u]\n" +
            "\n" +
            "    def union(self, u, v):\n" +
            "        root_u = self.find(u)\n" +
            "        root_v = self.find(v)\n" +
            "\n" +
            "        if root_u != root_v:\n" +
            "            # Union by rank\n" +
            "            if self.rank[root_u] > self.rank[root_v]:\n" +
            "                self.parent[root_v] = root_u\n" +
            "            elif self.rank[root_u] < self.rank[root_v]:\n" +
            "                self.parent[root_u] = root_v\n" +
            "            else:\n" +
            "                self.parent[root_v] = root_u\n" +
            "                self.rank[root_u] += 1\n" +
            "\n" +
            "def kruskal_mst(graph):\n" +
            "    # Step 1: Sort all the edges of the graph by weight\n" +
            "    edges = []\n" +
            "    for u in graph:\n" +
            "        for v, weight in graph[u]:\n" +
            "            edges.append((weight, u, v))\n" +
            "    edges.sort()  # Sort edges by weight\n" +
            "\n" +
            "    num_vertices = len(graph)\n" +
            "    mst = []\n" +
            "    uf = UnionFind(num_vertices)\n" +
            "\n" +
            "    # Step 2: Iterate through sorted edges and add to MST if no cycle is formed\n" +
            "    for weight, u, v in edges:\n" +
            "        if uf.find(u) != uf.find(v):  # Check if adding this edge forms a cycle\n" +
            "            uf.union(u, v)\n" +
            "            mst.append((u, v, weight))\n" +
            "\n" +
            "    return mst\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = {\n" +
            "#     0: [(1, 4), (2, 2)],\n" +
            "#     1: [(0, 4), (2, 5), (3, 1)],\n" +
            "#     2: [(0, 2), (1, 5), (3, 3)],\n" +
            "#     3: [(1, 1), (2, 3)]\n" +
            "# }\n" +
            "# mst = kruskal_mst(graph)\n" +
            "# print(mst)\n" +
            "\n";
    public static final String ex11="import heapq\n" +
            "from collections import defaultdict\n" +
            "\n" +
            "def prim_mst(graph):\n" +
            "    mst = []\n" +
            "    min_heap = []\n" +
            "    visited = set()\n" +
            "\n" +
            "    # Choose an arbitrary starting node (here we choose the first node)\n" +
            "    start_node = next(iter(graph))\n" +
            "\n" +
            "    # Push all edges from the start_node to the min_heap\n" +
            "    for neighbor, weight in graph[start_node]:\n" +
            "        heapq.heappush(min_heap, (weight, start_node, neighbor))\n" +
            "\n" +
            "    visited.add(start_node)\n" +
            "\n" +
            "    while min_heap:\n" +
            "        weight, u, v = heapq.heappop(min_heap)\n" +
            "\n" +
            "        if v not in visited:\n" +
            "            # Add the edge to the MST\n" +
            "            mst.append((u, v, weight))\n" +
            "            visited.add(v)\n" +
            "\n" +
            "            # Push all edges from v to the min_heap\n" +
            "            for neighbor, edge_weight in graph[v]:\n" +
            "                if neighbor not in visited:\n" +
            "                    heapq.heappush(min_heap, (edge_weight, v, neighbor))\n" +
            "\n" +
            "    return mst\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = {\n" +
            "#     0: [(1, 4), (2, 2)],\n" +
            "#     1: [(0, 4), (2, 5), (3, 1)],\n" +
            "#     2: [(0, 2), (1, 5), (3, 3)],\n" +
            "#     3: [(1, 1), (2, 3)]\n" +
            "# }\n" +
            "# mst = prim_mst(graph)\n" +
            "# print(mst)\n";
    public static final String ex12="from collections import defaultdict\n" +
            "\n" +
            "def topological_sort(graph):\n" +
            "    visited = set()\n" +
            "    stack = []\n" +
            "\n" +
            "    def dfs(node):\n" +
            "        visited.add(node)\n" +
            "        for neighbor in graph[node]:\n" +
            "            if neighbor not in visited:\n" +
            "                dfs(neighbor)\n" +
            "        stack.append(node)\n" +
            "\n" +
            "    # Iterate over all nodes in the graph\n" +
            "    for node in graph:\n" +
            "        if node not in visited:\n" +
            "            dfs(node)\n" +
            "\n" +
            "    # Reverse the stack to get the topological order\n" +
            "    return stack[::-1]\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = {\n" +
            "#     'A': ['B', 'C'],\n" +
            "#     'B': ['C', 'D'],\n" +
            "#     'C': ['E'],\n" +
            "#     'D': ['E'],\n" +
            "#     'E': []\n" +
            "# }\n" +
            "# sorted_order = topological_sort(graph)\n" +
            "# print(sorted_order)  # Output: ['A', 'B', 'D', 'C', 'E']\n" +
            "\n";
    public static final String ex13="from collections import defaultdict, deque\n" +
            "\n" +
            "def topological_sort_kahn(graph):\n" +
            "    # Calculate indegrees of all nodes\n" +
            "    indegree = {node: 0 for node in graph}\n" +
            "    for node in graph:\n" +
            "        for neighbor in graph[node]:\n" +
            "            indegree[neighbor] += 1\n" +
            "\n" +
            "    # Initialize a queue with nodes having zero indegree\n" +
            "    queue = deque([node for node in graph if indegree[node] == 0])\n" +
            "    sorted_order = []\n" +
            "\n" +
            "    while queue:\n" +
            "        node = queue.popleft()\n" +
            "        sorted_order.append(node)\n" +
            "\n" +
            "        # Reduce the indegree of each neighbor by 1\n" +
            "        for neighbor in graph[node]:\n" +
            "            indegree[neighbor] -= 1\n" +
            "            if indegree[neighbor] == 0:\n" +
            "                queue.append(neighbor)\n" +
            "\n" +
            "    # Check if all nodes are visited (no cycle) and return the sorted order\n" +
            "    if len(sorted_order) == len(graph):\n" +
            "        return sorted_order\n" +
            "    else:\n" +
            "        raise ValueError(\"Graph contains a cycle\")\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = {\n" +
            "#     'A': ['B', 'C'],\n" +
            "#     'B': ['D'],\n" +
            "#     'C': ['D'],\n" +
            "#     'D': []\n" +
            "# }\n" +
            "# sorted_order = topological_sort_kahn(graph)\n" +
            "# print(sorted_order)  # Output: ['A', 'B', 'C', 'D']\n";
    public static final String ex14="def graph_coloring(graph, num_colors):\n" +
            "    # Initialize a dictionary to store assigned colors for each node\n" +
            "    color_assignment = {}\n" +
            "\n" +
            "    def is_valid(node, color):\n" +
            "        # Check if the given color is valid for the node (no adjacent nodes have the same color)\n" +
            "        for neighbor in graph[node]:\n" +
            "            if neighbor in color_assignment and color_assignment[neighbor] == color:\n" +
            "                return False\n" +
            "        return True\n" +
            "\n" +
            "    def backtrack(node):\n" +
            "        # Base case: all nodes have been colored\n" +
            "        if node is None:\n" +
            "            return True\n" +
            "\n" +
            "        # Try assigning each color to the current node\n" +
            "        for color in range(1, num_colors + 1):\n" +
            "            if is_valid(node, color):\n" +
            "                color_assignment[node] = color\n" +
            "                if backtrack(next_node(node)):\n" +
            "                    return True\n" +
            "                # Backtrack (remove color assignment)\n" +
            "                color_assignment.pop(node)\n" +
            "\n" +
            "        return False\n" +
            "\n" +
            "    def next_node(node):\n" +
            "        # Helper function to get the next uncolored node\n" +
            "        for vertex in graph:\n" +
            "            if vertex not in color_assignment:\n" +
            "                return vertex\n" +
            "        return None\n" +
            "\n" +
            "    # Start backtracking from the first node\n" +
            "    start_node = next_node(None)\n" +
            "    if start_node is None:\n" +
            "        return color_assignment  # Graph is empty\n" +
            "\n" +
            "    backtrack(start_node)\n" +
            "    return color_assignment\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = {\n" +
            "#     'A': ['B', 'C'],\n" +
            "#     'B': ['A', 'C', 'D'],\n" +
            "#     'C': ['A', 'B', 'D'],\n" +
            "#     'D': ['B', 'C']\n" +
            "# }\n" +
            "# num_colors = 3\n" +
            "# result = graph_coloring(graph, num_colors)\n" +
            "# print(result)  # Output: {'A': 1, 'B': 2, 'C': 3, 'D': 1} (example coloring with 3 colors)\n" +
            "\n" +
            "\n" +
            "\n";
    public static final String ex15="def has_eulerian_path_or_circuit(graph):\n" +
            "    if not graph:\n" +
            "        return False\n" +
            "\n" +
            "    # Count the degree of each vertex\n" +
            "    degree = defaultdict(int)\n" +
            "    for u in graph:\n" +
            "        degree[u] += len(graph[u])  # Count edges incident to vertex u\n" +
            "        for v in graph[u]:\n" +
            "            degree[v] += 1  # Each undirected edge is counted twice\n" +
            "\n" +
            "    # Check the number of vertices with odd degree\n" +
            "    odd_degree_count = sum(1 for v in degree if degree[v] % 2 != 0)\n" +
            "\n" +
            "    # Determine if the graph has an Eulerian path or circuit\n" +
            "    if odd_degree_count == 0:\n" +
            "        return \"Eulerian Circuit\"  # All vertices have even degree\n" +
            "    elif odd_degree_count == 2:\n" +
            "        return \"Eulerian Path\"  # Exactly two vertices have odd degree\n" +
            "    else:\n" +
            "        return False  # Neither Eulerian Circuit nor Eulerian Path\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = {\n" +
            "#     'A': ['B', 'C'],\n" +
            "#     'B': ['A', 'C', 'D'],\n" +
            "#     'C': ['A', 'B', 'D'],\n" +
            "#     'D': ['B', 'C']\n" +
            "# }\n" +
            "# result = has_eulerian_path_or_circuit(graph)\n" +
            "# print(result)  # Output: \"Eulerian Path\" (example graph with Eulerian Path)\n" +
            "\n" +
            "# graph = {\n" +
            "#     'A': ['B', 'C', 'D'],\n" +
            "#     'B': ['A', 'C'],\n" +
            "#     'C': ['A', 'B', 'D'],\n" +
            "#     'D': ['A', 'C']\n" +
            "# }\n" +
            "# result = has_eulerian_path_or_circuit(graph)\n" +
            "# print(result)  # Output: False (example graph without Eulerian Path or Circuit)\n" +
            "\n";
    public static final String ex16="def fleury_algorithm(graph):\n" +
            "    def dfs(current, visited_edges):\n" +
            "        stack = [current]\n" +
            "        path = []\n" +
            "\n" +
            "        while stack:\n" +
            "            u = stack[-1]\n" +
            "            found_next = False\n" +
            "\n" +
            "            # Explore all edges from the current node\n" +
            "            for v in graph[u]:\n" +
            "                edge = (u, v)\n" +
            "                \n" +
            "                # Check if the edge can be used (not a bridge or not a critical edge)\n" +
            "                if edge not in visited_edges or (visited_edges[edge] > 1):\n" +
            "                    visited_edges[edge] -= 1\n" +
            "                    graph[v].remove(u)  # Remove the edge from the graph\n" +
            "                    graph[u].remove(v)\n" +
            "\n" +
            "                    stack.append(v)\n" +
            "                    found_next = True\n" +
            "                    break\n" +
            "\n" +
            "            if not found_next:\n" +
            "                path.append(stack.pop())\n" +
            "\n" +
            "        return path[::-1]\n" +
            "\n" +
            "    # Check the initial degrees of all nodes\n" +
            "    odd_degrees = [node for node in graph if len(graph[node]) % 2 != 0]\n" +
            "    start_node = odd_degrees[0] if len(odd_degrees) > 0 else next(iter(graph))\n" +
            "\n" +
            "    # Create a copy of the graph to modify during traversal\n" +
            "    graph_copy = defaultdict(list)\n" +
            "    for u in graph:\n" +
            "        graph_copy[u] = graph[u][:]\n" +
            "\n" +
            "    visited_edges = defaultdict(int)\n" +
            "    for u in graph:\n" +
            "        for v in graph[u]:\n" +
            "            visited_edges[(u, v)] += 1\n" +
            "\n" +
            "    # Find the Eulerian path or circuit using Fleury's algorithm\n" +
            "    path = dfs(start_node, visited_edges)\n" +
            "\n" +
            "    # Check if all edges have been used (graph is Eulerian) and return the path\n" +
            "    if all(len(graph_copy[node]) == 0 for node in graph_copy):\n" +
            "        return path\n" +
            "    else:\n" +
            "        return None  # No Eulerian path or circuit exists\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = {\n" +
            "#     'A': ['B', 'C'],\n" +
            "#     'B': ['A', 'C', 'D'],\n" +
            "#     'C': ['A', 'B', 'D'],\n" +
            "#     'D': ['B', 'C']\n" +
            "# }\n" +
            "# eulerian_path = fleury_algorithm(graph)\n" +
            "# print(eulerian_path)  # Output: ['A', 'B', 'C', 'A', 'C', 'D', 'B']\n" +
            "\n" +
            "# graph = {\n" +
            "#     'A': ['B', 'C', 'D'],\n" +
            "#     'B': ['A', 'C'],\n" +
            "#     'C': ['A', 'B', 'D'],\n" +
            "#     'D': ['A', 'C']\n" +
            "# }\n" +
            "# eulerian_path = fleury_algorithm(graph)\n" +
            "# print(eulerian_path)  # Output: None (no Eulerian path or circuit exists)";
    public static final String ex17="from collections import deque, defaultdict\n" +
            "\n" +
            "def is_bipartite(graph):\n" +
            "    if not graph:\n" +
            "        return True  # An empty graph is trivially bipartite\n" +
            "\n" +
            "    color = {}  # Dictionary to store the color of each node\n" +
            "\n" +
            "    def bfs(start_node):\n" +
            "        queue = deque([start_node])\n" +
            "        color[start_node] = 0  # Color the start node with 0 (or any color)\n" +
            "\n" +
            "        while queue:\n" +
            "            node = queue.popleft()\n" +
            "\n" +
            "            for neighbor in graph[node]:\n" +
            "                if neighbor not in color:\n" +
            "                    # Color the neighbor with a different color than the current node\n" +
            "                    color[neighbor] = 1 - color[node]\n" +
            "                    queue.append(neighbor)\n" +
            "                elif color[neighbor] == color[node]:\n" +
            "                    return False  # Conflict found (not bipartite)\n" +
            "\n" +
            "        return True\n" +
            "\n" +
            "    # Iterate over all nodes in the graph (in case it's not fully connected)\n" +
            "    for node in graph:\n" +
            "        if node not in color:\n" +
            "            if not bfs(node):\n" +
            "                return False  # Found a component that is not bipartite\n" +
            "\n" +
            "    return True\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph1 = {\n" +
            "#     0: [1, 3],\n" +
            "#     1: [0, 2],\n" +
            "#     2: [1, 3],\n" +
            "#     3: [0, 2]\n" +
            "# }\n" +
            "# print(is_bipartite(graph1))  # Output: True (example of a bipartite graph)\n" +
            "\n" +
            "# graph2 = {\n" +
            "#     0: [1, 2, 3],\n" +
            "#     1: [0, 2],\n" +
            "#     2: [0, 1],\n" +
            "#     3: [0]\n" +
            "# }\n" +
            "# print(is_bipartite(graph2))  # Output: False (example of a non-bipartite graph)\n" +
            "\n";
    public static final String ex18="from collections import deque, defaultdict\n" +
            "\n" +
            "def bfs_capacity_residual(graph, source, sink, parent):\n" +
            "    # Perform BFS to find an augmenting path using residual capacities\n" +
            "    visited = set()\n" +
            "    queue = deque([source])\n" +
            "    visited.add(source)\n" +
            "    \n" +
            "    while queue:\n" +
            "        u = queue.popleft()\n" +
            "        \n" +
            "        for v in graph[u]:\n" +
            "            if v not in visited and graph[u][v] > 0:  # Capacity residual > 0\n" +
            "                queue.append(v)\n" +
            "                visited.add(v)\n" +
            "                parent[v] = u\n" +
            "                if v == sink:\n" +
            "                    return True  # Found augmenting path\n" +
            "    \n" +
            "    return False\n" +
            "\n" +
            "def edmonds_karp(graph, source, sink):\n" +
            "    # Initialize parent dictionary to store the path and maximum flow\n" +
            "    parent = {}\n" +
            "    max_flow = 0\n" +
            "    \n" +
            "    # Copy the original graph to create the residual graph\n" +
            "    residual_graph = defaultdict(lambda: defaultdict(int))\n" +
            "    for u in graph:\n" +
            "        for v in graph[u]:\n" +
            "            residual_graph[u][v] = graph[u][v]  # Capacity of the edge\n" +
            "    \n" +
            "    # Use BFS to find augmenting paths and update the flow\n" +
            "    while bfs_capacity_residual(residual_graph, source, sink, parent):\n" +
            "        # Find the maximum flow in the augmenting path\n" +
            "        path_flow = float('Inf')\n" +
            "        s = sink\n" +
            "        \n" +
            "        while s != source:\n" +
            "            path_flow = min(path_flow, residual_graph[parent[s]][s])\n" +
            "            s = parent[s]\n" +
            "        \n" +
            "        # Update residual capacities of the edges and reverse edges\n" +
            "        v = sink\n" +
            "        while v != source:\n" +
            "            u = parent[v]\n" +
            "            residual_graph[u][v] -= path_flow\n" +
            "            residual_graph[v][u] += path_flow\n" +
            "            v = parent[v]\n" +
            "        \n" +
            "        max_flow += path_flow\n" +
            "    \n" +
            "    return max_flow\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = {\n" +
            "#     's': {'a': 10, 'b': 5},\n" +
            "#     'a': {'b': 15, 't': 10},\n" +
            "#     'b': {'c': 10, 't': 10},\n" +
            "#     'c': {'a': 5, 't': 10}\n" +
            "# }\n" +
            "# source = 's'\n" +
            "# sink = 't'\n" +
            "# max_flow = edmonds_karp(graph, source, sink)\n" +
            "# print(\"Maximum Flow:\", max_flow)\n";
    public static final String ex19="def articulation_points(graph):\n" +
            "    if not graph:\n" +
            "        return []\n" +
            "\n" +
            "    # Initialize variables to store discovery time, low time, parent and articulation points\n" +
            "    discovery = {}\n" +
            "    low = {}\n" +
            "    parent = {}\n" +
            "    articulation_set = set()\n" +
            "    time = [0]  # Mutable integer to keep track of time during DFS\n" +
            "\n" +
            "    # Helper function to perform DFS and find articulation points\n" +
            "    def dfs(u):\n" +
            "        children = 0  # Count of children in DFS tree\n" +
            "        discovery[u] = low[u] = time[0]\n" +
            "        time[0] += 1\n" +
            "\n" +
            "        for v in graph[u]:\n" +
            "            if v not in discovery:  # v is not visited\n" +
            "                parent[v] = u\n" +
            "                children += 1\n" +
            "                dfs(v)\n" +
            "\n" +
            "                # Check if the subtree rooted at v has a connection back to one of the ancestors of u\n" +
            "                low[u] = min(low[u], low[v])\n" +
            "\n" +
            "                # (1) u is root of DFS tree and has two or more children\n" +
            "                if parent[u] is None and children > 1:\n" +
            "                    articulation_set.add(u)\n" +
            "                \n" +
            "                # (2) u is not root and low value of one of its child is more than discovery value of u\n" +
            "                if parent[u] is not None and low[v] >= discovery[u]:\n" +
            "                    articulation_set.add(u)\n" +
            "            \n" +
            "            elif v != parent[u]:  # Update low value of u for parent function calls\n" +
            "                low[u] = min(low[u], discovery[v])\n" +
            "\n" +
            "    # Perform DFS traversal from each unvisited node\n" +
            "    for node in graph:\n" +
            "        if node not in discovery:\n" +
            "            parent[node] = None\n" +
            "            dfs(node)\n" +
            "\n" +
            "    return list(articulation_set)\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = {\n" +
            "#     0: [1, 2],\n" +
            "#     1: [0, 2],\n" +
            "#     2: [0, 1, 3, 5],\n" +
            "#     3: [2, 4],\n" +
            "#     4: [3],\n" +
            "#     5: [2, 6, 8],\n" +
            "#     6: [5, 7],\n" +
            "#     7: [6, 8],\n" +
            "#     8: [5, 7]\n" +
            "# }\n" +
            "# result = articulation_points(graph)\n" +
            "# print(\"Articulation Points:\", result)\n" +
            "\n" +
            "\n";
    public static final String ex20="from collections import defaultdict\n" +
            "\n" +
            "def find_bridges(graph):\n" +
            "    if not graph:\n" +
            "        return []\n" +
            "\n" +
            "    discovery = {}\n" +
            "    low = {}\n" +
            "    parent = {}\n" +
            "    bridges = []\n" +
            "\n" +
            "    # Helper function to perform DFS and find bridges\n" +
            "    def dfs(u):\n" +
            "        nonlocal time\n" +
            "        discovery[u] = low[u] = time\n" +
            "        time += 1\n" +
            "\n" +
            "        for v in graph[u]:\n" +
            "            if v not in discovery:  # v is not visited\n" +
            "                parent[v] = u\n" +
            "                dfs(v)\n" +
            "\n" +
            "                # Update low value of u for parent function calls\n" +
            "                low[u] = min(low[u], low[v])\n" +
            "\n" +
            "                # If low[v] > discovery[u], then u-v is a bridge\n" +
            "                if low[v] > discovery[u]:\n" +
            "                    bridges.append((u, v))\n" +
            "\n" +
            "            elif v != parent[u]:  # Update low value of u for back edge\n" +
            "                low[u] = min(low[u], discovery[v])\n" +
            "\n" +
            "    # Perform DFS traversal from each unvisited node\n" +
            "    time = 0\n" +
            "    for node in graph:\n" +
            "        if node not in discovery:\n" +
            "            parent[node] = None\n" +
            "            dfs(node)\n" +
            "\n" +
            "    return bridges\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = {\n" +
            "#     0: [1, 2],\n" +
            "#     1: [0, 2],\n" +
            "#     2: [0, 1, 3, 5],\n" +
            "#     3: [2, 4],\n" +
            "#     4: [3],\n" +
            "#     5: [2, 6, 8],\n" +
            "#     6: [5, 7],\n" +
            "#     7: [6, 8],\n" +
            "#     8: [5, 7]\n" +
            "# }\n" +
            "# result = find_bridges(graph)\n" +
            "# print(\"Bridges (Cut Edges):\", result)";
    public static final String ex21="import random\n" +
            "\n" +
            "def karger_min_cut(graph):\n" +
            "    # Helper function to perform one iteration of Karger's algorithm\n" +
            "    def karger_algorithm(graph):\n" +
            "        # Make a copy of the graph\n" +
            "        contracted_graph = {node: neighbors[:] for node, neighbors in graph.items()}\n" +
            "        \n" +
            "        # Contract edges until only two nodes remain\n" +
            "        while len(contracted_graph) > 2:\n" +
            "            # Select a random edge (u, v) to contract\n" +
            "            u = random.choice(list(contracted_graph.keys()))\n" +
            "            v = random.choice(contracted_graph[u])\n" +
            "            \n" +
            "            # Merge node v into node u (contract edge)\n" +
            "            contracted_graph[u].extend(contracted_graph[v])\n" +
            "            \n" +
            "            # Update references to node v in other nodes' neighbor lists\n" +
            "            for neighbor in contracted_graph[v]:\n" +
            "                contracted_graph[neighbor].remove(v)\n" +
            "                if neighbor != u:\n" +
            "                    contracted_graph[neighbor].append(u)\n" +
            "            \n" +
            "            # Remove node v from the graph\n" +
            "            del contracted_graph[v]\n" +
            "        \n" +
            "        # Return the size of the cut (number of edges between the two remaining nodes)\n" +
            "        remaining_nodes = list(contracted_graph.keys())\n" +
            "        return len(contracted_graph[remaining_nodes[0]])\n" +
            "\n" +
            "    # Number of vertices in the graph\n" +
            "    vertices = list(graph.keys())\n" +
            "    num_vertices = len(vertices)\n" +
            "    \n" +
            "    # Determine the number of iterations (empirically chosen)\n" +
            "    num_iterations = num_vertices * num_vertices\n" +
            "    \n" +
            "    # Run Karger's algorithm multiple times to find the minimum cut\n" +
            "    min_cut = float('inf')\n" +
            "    for _ in range(num_iterations):\n" +
            "        current_cut = karger_algorithm(graph)\n" +
            "        if current_cut < min_cut:\n" +
            "            min_cut = current_cut\n" +
            "    \n" +
            "    return min_cut\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph = {\n" +
            "#     'A': ['B', 'C', 'D'],\n" +
            "#     'B': ['A', 'C', 'D'],\n" +
            "#     'C': ['A', 'B', 'D'],\n" +
            "#     'D': ['A', 'B', 'C']\n" +
            "# }\n" +
            "# min_cut = karger_min_cut(graph)\n" +
            "# print(\"Minimum Cut (number of edges):\", min_cut)";
    public static final String ex22="def is_planar(graph):\n" +
            "    # Helper function to check if the graph contains a subdivision of K5\n" +
            "    def contains_subdivision_of_k5(graph):\n" +
            "        # Check for a complete subgraph on 5 vertices (K5)\n" +
            "        if len(graph) < 5:\n" +
            "            return False\n" +
            "        \n" +
            "        for v in graph:\n" +
            "            if len(graph[v]) >= 5:\n" +
            "                # Check if the neighborhood of v contains a complete subgraph on 4 vertices\n" +
            "                neighbors = graph[v]\n" +
            "                for a in neighbors:\n" +
            "                    for b in neighbors:\n" +
            "                        if a != b and b in graph[a]:\n" +
            "                            for c in neighbors:\n" +
            "                                if c != a and c != b and c in graph[b]:\n" +
            "                                    for d in neighbors:\n" +
            "                                        if d != a and d != b and d != c and d in graph[c]:\n" +
            "                                            return True\n" +
            "        return False\n" +
            "\n" +
            "    # Helper function to check if the graph contains a subdivision of K3,3\n" +
            "    def contains_subdivision_of_k33(graph):\n" +
            "        # Check for a complete bipartite subgraph with partitions of size 3 (K3,3)\n" +
            "        if len(graph) < 6:\n" +
            "            return False\n" +
            "        \n" +
            "        for v in graph:\n" +
            "            if len(graph[v]) >= 3:\n" +
            "                # Check if the neighborhood of v can be split into two partitions of size 3\n" +
            "                partition1 = [a for a in graph[v]]\n" +
            "                for a in partition1:\n" +
            "                    for b in graph[a]:\n" +
            "                        if b != v and b in partition1:\n" +
            "                            # Check if the second partition is also valid\n" +
            "                            partition2 = [c for c in graph[v] if c != a and c != b]\n" +
            "                            valid_partition2 = all(d in graph[b] for d in partition2)\n" +
            "                            if valid_partition2:\n" +
            "                                return True\n" +
            "        return False\n" +
            "\n" +
            "    # Check if the graph contains a subdivision of either K5 or K3,3\n" +
            "    if contains_subdivision_of_k5(graph) or contains_subdivision_of_k33(graph):\n" +
            "        return False  # Graph is non-planar\n" +
            "    else:\n" +
            "        return True  # Graph is planar\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph1 = {\n" +
            "#     'A': ['B', 'C', 'D', 'E'],\n" +
            "#     'B': ['A', 'C', 'D', 'E'],\n" +
            "#     'C': ['A', 'B', 'D', 'E'],\n" +
            "#     'D': ['A', 'B', 'C', 'E'],\n" +
            "#     'E': ['A', 'B', 'C', 'D']\n" +
            "# }\n" +
            "# print(\"Graph 1 is planar:\", is_planar(graph1))  # Output: False (contains K5)\n" +
            "\n" +
            "# graph2 = {\n" +
            "#     'A': ['B', 'C', 'D'],\n" +
            "#     'B': ['A', 'C', 'D'],\n" +
            "#     'C': ['A', 'B', 'D'],\n" +
            "#     'D': ['A', 'B', 'C']\n" +
            "# }\n" +
            "# print(\"Graph 2 is planar:\", is_planar(graph2))  # Output: True (does not contain K5 or K3,3)\n" +
            "\n";
    public static final String ex23="def are_isomorphic(graph1, graph2):\n" +
            "    # Helper function to generate a canonical form (signature) of a graph\n" +
            "    def generate_signature(graph):\n" +
            "        # Sort adjacency lists of each vertex for canonical order\n" +
            "        sorted_graph = {k: sorted(v) for k, v in graph.items()}\n" +
            "        # Sort vertices by their degree and adjacency lists for canonical labeling\n" +
            "        sorted_vertices = sorted(sorted_graph.items(), key=lambda x: (len(x[1]), x[1]))\n" +
            "        # Generate a signature string based on the canonical order\n" +
            "        signature = \"|\".join(f\"{vertex}:{','.join(map(str, neighbors))}\" for vertex, neighbors in sorted_vertices)\n" +
            "        return signature\n" +
            "\n" +
            "    # Check if the number of vertices and edges are the same\n" +
            "    if len(graph1) != len(graph2) or sum(len(neighbors) for neighbors in graph1.values()) != sum(len(neighbors) for neighbors in graph2.values()):\n" +
            "        return False\n" +
            "\n" +
            "    # Generate canonical forms (signatures) of both graphs\n" +
            "    signature1 = generate_signature(graph1)\n" +
            "    signature2 = generate_signature(graph2)\n" +
            "\n" +
            "    # Compare the signatures to check for isomorphism\n" +
            "    return signature1 == signature2\n" +
            "\n" +
            "# Example usage:\n" +
            "# graph1 = {\n" +
            "#     1: [2, 3],\n" +
            "#     2: [1, 3],\n" +
            "#     3: [1, 2]\n" +
            "# }\n" +
            "# graph2 = {\n" +
            "#     'A': ['B', 'C'],\n" +
            "#     'B': ['A', 'C'],\n" +
            "#     'C': ['A', 'B']\n" +
            "# }\n" +
            "# graph3 = {\n" +
            "#     1: [2, 4],\n" +
            "#     2: [1, 3],\n" +
            "#     3: [2, 4],\n" +
            "#     4: [1, 3]\n" +
            "# }\n" +
            "# print(\"Graph 1 and Graph 2 are isomorphic:\", are_isomorphic(graph1, graph2))  # Output: True\n" +
            "# print(\"Graph 1 and Graph 3 are isomorphic:\", are_isomorphic(graph1, graph3))  # Output: False\n" +
            "\n";


}
