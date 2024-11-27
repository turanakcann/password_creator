import java.util.Scanner;

class Password_Creator{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.err.println("Parolanızın uzunlugu kac karakterden olusmalı?(Onerilen 12-20)");
        int pass_length = input.nextInt();
        Creator create = new Creator(pass_length);
    }
}