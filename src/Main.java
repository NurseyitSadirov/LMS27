import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(4);
        arrayList.add(14);
        arrayList.add(54);
        method(arrayList);

    }
    public static <T> void method(ArrayList<T> t){
       if (t == null || t.isEmpty()){
           return;
       }
        System.out.println("First element to the left: "+ t.get(0));
        System.out.println("Last element to the left: "+t.get(t.size()-1));
        for (T t1 : t) {
            System.out.println("Element to the left: "+t1);
        }
    }
}