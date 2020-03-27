/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

import java.util.Scanner;

// to store student information and properties
public class Student {
    private String name;
    private int rollno, backlog, apperingcount;
    private Scanner sc;

    public Student() {
        sc = new Scanner(System.in);
        System.out.println("Name :");
        this.name = sc.next();
        System.out.println("Rollno : ");
        this.rollno = sc.nextInt();
        System.out.println("Backlog_count : ");
        this.backlog = sc.nextInt();
        System.out.println("appering_count");
        this.apperingcount = sc.nextInt();
    }
}
