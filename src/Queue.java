public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.enqueueWithPriority(13,5);
        priorityQueue.enqueueWithPriority(7,2);
        priorityQueue.enqueueWithPriority(0,0);
        priorityQueue.enqueueWithPriority(35,3);
        priorityQueue.enqueueWithPriority(10,11);
        priorityQueue.enqueueWithPriority(8,24);

        //Array to string
        priorityQueue.a();

        System.out.println();
        System.out.println("Priority queue: " + priorityQueue);
        priorityQueue.dequeue();
        priorityQueue.dequeue();
        priorityQueue.dequeue();
        System.out.println();

        System.out.println("Priority queue: " + priorityQueue);
    }
}
