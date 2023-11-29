public class Main {
    public static void main(String[] args) {
        CustomQueue<Integer> queue = new CustomQueue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}