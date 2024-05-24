package pattern.behavior.iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("迭代器模式");
        Integer[] array = {1, 2, 3, 4, 5};
        Iterator<Integer> iterator = new ArrayIterator<>(array);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
