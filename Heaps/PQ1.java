import java.util.PriorityQueue;

public class PQ1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(4);
        pq.add(6);
        pq.add(9);

        while (!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
