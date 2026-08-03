import java.util.Scanner;


abstract class Book {
    String title, author;
    
    Book(String t, String a) {
        title = t;
        author = a;
    }
    
    abstract void display();
}


class MyBook extends Book {
    int price;
    

    MyBook(String name, String writer, int cost) {
        super(name, writer);
        price = cost;
    }
    
    
    @Override
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}

public class Soluation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String bTitle = input.nextLine();
        String bAuthor = input.nextLine();
        int bPrice = input.nextInt();
        
        Book myNovel = new MyBook(bTitle, bAuthor, bPrice);
        myNovel.display();
        
        input.close();
    }
}