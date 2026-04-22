from Graph import Graph

def main():
    g = Graph()

    # Constructing the graph
    # Example graph:
    #        A
    #      /   \
    #     B     C
    #    / \     \
    #   D   E     F

    g.add_edge('A', 'B')
    g.add_edge('A', 'C')
    g.add_edge('B', 'D')
    g.add_edge('B', 'E')
    g.add_edge('C', 'F')

    traversal = g.dfs_pre_order('A')

    print("DFS Pre Order Traversal:")
    print(traversal)

    traversal = g.dfs_in_order('A')

    print("DFS In Order Traversal:")
    print(traversal)

    traversal = g.dfs_post_order('A')

    print("DFS Post Order Traversal:")
    print(traversal)


if __name__ == "__main__":
    main()