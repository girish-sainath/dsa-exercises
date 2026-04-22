
def dfs_iter_postorder(graph, start, visited=None):
    if visited is None:
        visited = set()

    stack = [start]

    while stack:
        vertex = stack.pop()
        if vertex not in visited:
            visited.add(vertex)

            for neighbor in reversed(graph[vertex]):
                if neighbor not in visited:
                    stack.append(neighbor)

            print(vertex)
