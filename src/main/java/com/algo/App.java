package com.algo;



import com.algo.QueueExample.ArrayQueue;
import com.algo.QueueExample.QueueByStack;
import com.algo.QueueExample.QueueByTwoStacks;

/**
 * Hello world!
 */
public class App {
        public static void main(String[] args) {

            QueueByTwoStacks queue=new QueueByTwoStacks();
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);
            System.out.println(queue);
            System.out.println(queue.dequeue());//10
            System.out.println(queue.dequeue());//20
            System.out.println(queue);
            queue.enqueue(60);
            System.out.println(queue.dequeue());//30
            System.out.println(queue.dequeue());//40
            System.out.println(queue.dequeue());//50
            System.out.println(queue);
            queue.enqueue(70);
            queue.enqueue(80);
            queue.enqueue(90);
            System.out.println(queue);
            System.out.println(queue.dequeue());//60
            System.out.println(queue.dequeue());//70

            System.out.println(queue.dequeue());//80

            System.out.println(queue.dequeue());//90
            System.out.println(queue);
            System.out.println(queue.dequeue());//60
            System.out.println(queue.dequeue());//60





        }



}
