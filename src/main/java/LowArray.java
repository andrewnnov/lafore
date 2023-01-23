public class LowArray {
    private long[] a; // ref to arr a

    public  LowArray(int size) { // constructor
        a = new long[size]; // create array
    }

    public void setElem(int index, long value) {
        a[index] = value;  //set value
    }

    public long getElem(int index) {
        return a[index];        //get value
    }




}
