/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem4.myqueue.Node;

//to implement circular queue
public class MyCircularQueue {
    private Node front, end, tmp;

    public MyCircularQueue() {
        front = null;
        end = null;
        tmp = null;
    }
}
