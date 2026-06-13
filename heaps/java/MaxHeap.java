import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxHeap {

    private List<Integer> heap;

    public MaxHeap() {
        this.heap = new ArrayList<>();
    }

    public MaxHeap(List<Integer> items) {
        this.heap = new ArrayList<>();
        buildHeap(items);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return 2 * index + 1;
    }

    private int right(int index) {
        return 2 * index + 2;
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public void heapify(int index) {
        int largest = index;

        int left = left(index);
        int right = right(index);

        if (
            left < heap.size() &&
            heap.get(left) > heap.get(largest)
        ) {
            largest = left;
        }

        if (
            right < heap.size() &&
            heap.get(right) > heap.get(largest)
        ) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    public void buildHeap(List<Integer> items) {
        heap = new ArrayList<>(items);

        int start = (heap.size() / 2) - 1;

        for (int i = start; i >= 0; i--) {
            heapify(i);
        }
    }

    public Integer peek() {
        if (heap.isEmpty()) {
            return null;
        }

        return heap.get(0);
    }

    public void insert(int value) {
        heap.add(value);

        int index = heap.size() - 1;

        while (index > 0) {
            int parent = parent(index);

            if (heap.get(parent) < heap.get(index)) {
                swap(parent, index);
                index = parent;
            } else {
                break;
            }
        }
    }

    public Integer extractMax() {
        if (heap.isEmpty()) {
            return null;
        }

        if (heap.size() == 1) {
            return heap.remove(0);
        }

        int maxValue = heap.get(0);

        heap.set(0, heap.remove(heap.size() - 1));

        heapify(0);

        return maxValue;
    }

    public List<Integer> extractMaxN(int n) {
        List<Integer> result = new ArrayList<>();

        int count = Math.min(n, heap.size());

        for (int i = 0; i < count; i++) {
            result.add(extractMax());
        }

        return result;
    }

    public int search(int value) {
        for (int i = 0; i < heap.size(); i++) {
            if (heap.get(i) == value) {
                return i;
            }
        }

        return -1;
    }

    public boolean delete(int value) {
        int index = search(value);

        if (index == -1) {
            return false;
        }

        int lastIndex = heap.size() - 1;

        if (index == lastIndex) {
            heap.remove(lastIndex);
            return true;
        }

        heap.set(index, heap.remove(lastIndex));

        int parent = parent(index);

        if (
            index > 0 &&
            heap.get(index) > heap.get(parent)
        ) {
            int current = index;

            while (current > 0) {
                int parentIndex = parent(current);

                if (
                    heap.get(parentIndex) <
                    heap.get(current)
                ) {
                    swap(parentIndex, current);
                    current = parentIndex;
                } else {
                    break;
                }
            }
        } else {
            heapify(index);
        }

        return true;
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public void printHeap() {
        System.out.println(heap);
    }

    public static void main(String[] args) {

        MaxHeap heap = new MaxHeap(
            Arrays.asList(3, 10, 5, 6, 2, 8, 1)
        );

        System.out.println("Initial Heap:");
        heap.printHeap();

        System.out.println("\nPeek:");
        System.out.println(heap.peek());

        System.out.println("\nInsert 15:");
        heap.insert(15);
        heap.printHeap();

        System.out.println("\nExtract Max:");
        System.out.println(heap.extractMax());
        heap.printHeap();

        System.out.println("\nExtract Top 3:");
        System.out.println(heap.extractMaxN(3));
        heap.printHeap();

        System.out.println("\nSearch 5:");
        System.out.println(heap.search(5));

        System.out.println("\nDelete 5:");
        heap.delete(5);
        heap.printHeap();
    }
}
