public class Array {
    private long[] a;
    private int nElems;

    public Array(int var1) {
        this.a = new long[var1];
        this.nElems = 0;
    }

    public void insert(long var1) {
        this.a[this.nElems] = var1;
        ++this.nElems;
    }

    public void display() {
        for(int var1 = 0; var1 < this.nElems; ++var1) {
            System.out.print(this.a[var1] + " ");
        }

        System.out.println("");
    }

    public void bubbleSort() {
        for(int out = this.nElems - 1; out > 1; --out) {
            for(int in = 0; in < out; ++in) {
                if (this.a[in] > this.a[in + 1]) {
                    this.swap(in, in + 1);
                }
            }
        }

    }

    public void selectionSort() {
        for(int out = 0; out < this.nElems - 1; ++out) {
            int min = out;

            for(int var2 = out + 1; var2 < this.nElems; ++var2) {
                if (this.a[var2] < this.a[min]) {
                    min = var2;
                }
            }

            this.swap(out, min);
        }

    }

    public void insertionSort() {
        for(int out = 1; out < this.nElems; ++out) {
            long temp = this.a[out];

            int in;
            for(in = out; in > 0 && this.a[in - 1] >= temp; --in) {
                this.a[in] = this.a[in - 1];
            }

            this.a[in] = temp;
        }

    }
    private void swap(int var1, int var2) {
        long var3 = this.a[var1];
        this.a[var1] = this.a[var2];
        this.a[var2] = var3;
    }
}
