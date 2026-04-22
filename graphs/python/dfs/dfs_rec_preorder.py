
def search(graph, vertex, visited=None):
    if visited is None:
        visited = set()
    
    visited.add(vertex)
    print(vertex)

    for neighbor in graph[vertex]:
        if neighbor not in visited:
            search(graph, neighbor, visited)
