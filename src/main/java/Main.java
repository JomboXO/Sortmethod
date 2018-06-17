public class Main {
    public static void main(String[] var0) {
        byte var1 = 100;
        Array var2 = new Array(var1);
        var2.insert(77L);
        var2.insert(99L);
        var2.insert(44L);
        var2.insert(55L);
        var2.insert(22L);
        var2.insert(88L);
        var2.insert(11L);
        var2.insert(0L);
        var2.insert(66L);
        var2.insert(33L);
        var2.display();
        //var2.bubbleSort();
        var2.selectionSort();
        var2.display();
    }
}
