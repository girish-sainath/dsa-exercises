class MaxHeap {
    constructor(items = []) {
        this.heap = [];

        if (items.length > 0) {
            this.buildHeap(items);
        }
    }

    parent(index) {
        return Math.floor((index - 1) / 2);
    }

    left(index) {
        return 2 * index + 1;
    }

    right(index) {
        return 2 * index + 2;
    }

    swap(i, j) {
        [this.heap[i], this.heap[j]] = [this.heap[j], this.heap[i]];
    }

    heapify(index) {
        let largest = index;

        const left = this.left(index);
        const right = this.right(index);

        if (
            left < this.heap.length &&
            this.heap[left] > this.heap[largest]
        ) {
            largest = left;
        }

        if (
            right < this.heap.length &&
            this.heap[right] > this.heap[largest]
        ) {
            largest = right;
        }

        if (largest !== index) {
            this.swap(index, largest);
            this.heapify(largest);
        }
    }

    buildHeap(items) {
        this.heap = [...items];

        const start = Math.floor(this.heap.length / 2) - 1;

        for (let i = start; i >= 0; i--) {
            this.heapify(i);
        }
    }

    peek() {
        if (this.heap.length === 0) {
            return null;
        }

        return this.heap[0];
    }

    insert(value) {
        this.heap.push(value);

        let index = this.heap.length - 1;

        while (index > 0) {
            const parent = this.parent(index);

            if (this.heap[parent] < this.heap[index]) {
                this.swap(parent, index);
                index = parent;
            } else {
                break;
            }
        }
    }

    extractMax() {
        if (this.heap.length === 0) {
            return null;
        }

        if (this.heap.length === 1) {
            return this.heap.pop();
        }

        const maxValue = this.heap[0];

        this.heap[0] = this.heap.pop();

        this.heapify(0);

        return maxValue;
    }

    extractMaxN(n) {
        const result = [];

        const count = Math.min(n, this.heap.length);

        for (let i = 0; i < count; i++) {
            result.push(this.extractMax());
        }

        return result;
    }

    search(value) {
        for (let i = 0; i < this.heap.length; i++) {
            if (this.heap[i] === value) {
                return i;
            }
        }

        return -1;
    }

    delete(value) {
        const index = this.search(value);

        if (index === -1) {
            return false;
        }

        const lastIndex = this.heap.length - 1;

        if (index === lastIndex) {
            this.heap.pop();
            return true;
        }

        this.heap[index] = this.heap.pop();

        const parent = this.parent(index);

        if (
            index > 0 &&
            this.heap[index] > this.heap[parent]
        ) {
            let current = index;

            while (current > 0) {
                const parentIndex = this.parent(current);

                if (
                    this.heap[parentIndex] <
                    this.heap[current]
                ) {
                    this.swap(parentIndex, current);
                    current = parentIndex;
                } else {
                    break;
                }
            }
        } else {
            this.heapify(index);
        }

        return true;
    }

    size() {
        return this.heap.length;
    }

    isEmpty() {
        return this.heap.length === 0;
    }

    printHeap() {
        console.log(this.heap);
    }
}


const heap = new MaxHeap([3, 10, 5, 6, 2, 8, 1]);

console.log("Initial Heap:");
heap.printHeap();

console.log("\nPeek:");
console.log(heap.peek());

console.log("\nInsert 15:");
heap.insert(15);
heap.printHeap();

console.log("\nExtract Max:");
console.log(heap.extractMax());
heap.printHeap();

console.log("\nExtract Top 3:");
console.log(heap.extractMaxN(3));
heap.printHeap();

console.log("\nSearch 5:");
console.log(heap.search(5));

console.log("\nDelete 5:");
heap.delete(5);
heap.printHeap();
