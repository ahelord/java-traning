package com.ahelord.examen;

public class Test13 {
        public Test13() {
            System.out.print("Message 1" +", ");
        }
        public Test13(String message) {
            System.out.print(message +", ");
            display();
        }
        public void display() {
            System.out.print("Message 2" +", ");
        }
        public void display(Object message) {
            System.out.print("Object" +", ");
        }
        public void display(String message) {
            System.out.print(message +", ");
        }

    public static void main(String[] args) {
        Test13 test = new Test13();
        test.display("Message X");
    }

}


