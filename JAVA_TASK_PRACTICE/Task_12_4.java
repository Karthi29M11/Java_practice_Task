package com.index;

class Schools {
    int id, age;
    String name, location, branch, firstdegree, seconddegree;

    Schools(int i, int a, String n, String l, String b, String fd, String sd) {
        this.id = i;
        this.age = a;
        this.name = n;
        this.location = l;
        this.branch = b;
        this.firstdegree = fd;
        this.seconddegree = sd;
    }

    void display() {
        System.out.println("ID: " + id +
                " Age: " + age +
                " Name: " + name +
                " Location: " + location +
                " Branch: " + branch +
                " FirstDegree: " + firstdegree +
                " SecondDegree: " + seconddegree);
    }
}

public class Task_12_4 {
    public static void main(String[] args) {
        Schools[] obj = new Schools[3];

        obj[0] = new Schools(11, 21, "Rossi", "Kanchipuram", "FullStack", "B.tech", "Developer");
        obj[1] = new Schools(12, 21, "Thiru", "Arakkonam", "FullStack", "B.com", "Developer");
        obj[2] = new Schools(13, 21, "Esakki", "Tenkasi", "FullStack", "B.Cs", " ");

        for (Schools stud : obj) {
            if (stud.seconddegree.equalsIgnoreCase("Developer")) {
                stud.display();
            }
        }
    }
}
