"""Graph data structure with DFS traversal support."""

from typing import Any


class Graph:
    """Directed graph using an adjacency list representation."""

    def __init__(self) -> None:
        self.adj_list: dict[Any, list[Any]] = {}

    def add_edge(self, u: Any, v: Any) -> None:
        self.adj_list.setdefault(u, [])
        self.adj_list.setdefault(v, [])
        self.adj_list[u].append(v)

    def dfs_pre_order(self, start: Any) -> list[Any]:
        visited: set[Any] = set()
        result: list[Any] = []

        def dfs(node: Any) -> None:
            if node in visited:
                return
            visited.add(node)
            result.append(node)
            for neighbor in self.adj_list[node]:
                dfs(neighbor)

        dfs(start)
        return result

    def dfs_in_order(self, start: Any) -> list[Any]:
        visited: set[Any] = set()
        result: list[Any] = []

        def dfs(node: Any) -> None:
            if node in visited:
                return
            visited.add(node)
            neighbors = self.adj_list[node]
            if neighbors:
                dfs(neighbors[0])
            result.append(node)
            for i in range(1, len(neighbors)):
                dfs(neighbors[i])

        dfs(start)
        return result

    def dfs_post_order(self, start: Any) -> list[Any]:
        visited: set[Any] = set()
        result: list[Any] = []

        def dfs(node: Any) -> None:
            if node in visited:
                return
            visited.add(node)
            for neighbor in self.adj_list[node]:
                dfs(neighbor)
            result.append(node)

        dfs(start)
        return result
