public class Main {
    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        while (!stack.isEmpty()) {
            System.out.println("Peek: " + stack.peek()); 
            System.out.println("Pop: " + stack.pop());
        }
    }
}