class MaxHeap:
    def __init__(self, items=None):
        self.heap = []
        if items:
            self.build_heap(items)

    def parent(self, index):
        return (index - 1) // 2

    def left(self, index):
        return 2 * index + 1

    def right(self, index):
        return 2 * index + 2

    def swap(self, i, j):
        self.heap[i], self.heap[j] = self.heap[j], self.heap[i]

    def heapify(self, index):
        size = len(self.heap)
        largest = index

        left = self.left(index)
        right = self.right(index)

        if left < size and self.heap[left] > self.heap[largest]:
            largest = left

        if right < size and self.heap[right] > self.heap[largest]:
            largest = right

        if largest != index:
            self.swap(index, largest)
            self.heapify(largest)

    def build_heap(self, items):
        self.heap = list(items)

        start = (len(self.heap) // 2) - 1

        for i in range(start, -1, -1):
            self.heapify(i)

    def peek(self):
        if not self.heap:
            return None
        return self.heap[0]

    def insert(self, value):
        self.heap.append(value)
        index = len(self.heap) - 1

        while index > 0:
            parent = self.parent(index)

            if self.heap[parent] < self.heap[index]:
                self.swap(parent, index)
                index = parent
            else:
                break

    def extract_max(self):
        if not self.heap:
            return None

        if len(self.heap) == 1:
            return self.heap.pop()

        max_value = self.heap[0]

        self.heap[0] = self.heap.pop()

        self.heapify(0)

        return max_value

    def extract_max_n(self, n):
        result = []

        for _ in range(min(n, len(self.heap))):
            result.append(self.extract_max())

        return result

    def search(self, value):
        for index, item in enumerate(self.heap):
            if item == value:
                return index
        return -1

    def delete(self, value):
        index = self.search(value)

        if index == -1:
            return False

        last_index = len(self.heap) - 1

        if index == last_index:
            self.heap.pop()
            return True

        self.heap[index] = self.heap.pop()

        parent = self.parent(index)

        if index > 0 and self.heap[index] > self.heap[parent]:
            while index > 0:
                parent = self.parent(index)

                if self.heap[parent] < self.heap[index]:
                    self.swap(parent, index)
                    index = parent
                else:
                    break
        else:
            self.heapify(index)

        return True

    def size(self):
        return len(self.heap)

    def is_empty(self):
        return len(self.heap) == 0

    def print_heap(self):
        print(self.heap)


heap = MaxHeap([3, 10, 5, 6, 2, 8, 1])

print("Initial Heap:")
heap.print_heap()

print("\nPeek:")
print(heap.peek())

print("\nInsert 15:")
heap.insert(15)
heap.print_heap()

print("\nExtract Max:")
print(heap.extract_max())
heap.print_heap()

print("\nExtract Top 3:")
print(heap.extract_max_n(3))
heap.print_heap()

print("\nSearch 5:")
print(heap.search(5))

print("\nDelete 5:")
heap.delete(5)
heap.print_heap()

