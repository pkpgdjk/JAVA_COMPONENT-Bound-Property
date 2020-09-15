package BoundProperty;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        BoundProperty source = new BoundProperty();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();

        source.addListenner(listener1);
        source.addListenner(listener2);

        Scanner sc = new Scanner(System.in);

        String score = "...";
        while(!score.equals("")){
            System.out.print("Enter Score ");
            score = sc.nextLine();

            source.setResult(score);
        }
    }
}