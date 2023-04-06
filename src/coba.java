import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class coba {
    public void que(){
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("Dotnet");
        queue.add("PHP");
        queue.add("HTML");
        System.out.println("Remove : " +queue.remove());
        System.out.println("element : " +queue.element());
        System.out.println("poll : " +queue.poll());
        System.out.println("peek : " +queue.peek());

    }
    public static void main(String[] args) {
      new coba().que();
    }
}
