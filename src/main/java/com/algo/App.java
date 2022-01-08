package com.algo;



import com.algo.QueueExample.ArrayQueue;

/**
 * Hello world!
 */
public class App {
        public static void main(String[] args) {

            ArrayQueue arrayQueue=new ArrayQueue(8);

            arrayQueue.enqueue(100);
            arrayQueue.enqueue(200);
            arrayQueue.enqueue(300);
            arrayQueue.enqueue(400);
            System.out.println(arrayQueue.dequeue());
            System.out.println(arrayQueue.dequeue());
            System.out.println(arrayQueue.dequeue());
            System.out.println(arrayQueue.dequeue());
            System.out.println(arrayQueue.dequeue());
            System.out.println(arrayQueue.dequeue());
            System.out.println(arrayQueue);
            arrayQueue.enqueue(101);
            arrayQueue.enqueue(201);
            arrayQueue.enqueue(301);
            arrayQueue.enqueue(401);
            arrayQueue.enqueue(501);
            arrayQueue.enqueue(601);
            System.out.println(arrayQueue);
            System.out.println(arrayQueue.dequeue());
            System.out.println(arrayQueue.dequeue());
            System.out.println(arrayQueue.dequeue());
            System.out.println(arrayQueue.dequeue());
            System.out.println(arrayQueue.dequeue());
            System.out.println(arrayQueue);
            System.out.println(arrayQueue.dequeue());
            System.out.println(arrayQueue.dequeue());
            System.out.println(arrayQueue);

        }



}
