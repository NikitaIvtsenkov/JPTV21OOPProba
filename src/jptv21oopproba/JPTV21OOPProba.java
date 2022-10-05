/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21oopproba;

import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author pupil
 */
public class JPTV21OOPProba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setFirstname("Aleksandr");
        author1.setLastname("Pushkin");
        Book book = new Book();
        book.setCaption("Jevgeny Onegin");
        Author[] authors = new Author[1];
        authors[0] = author1;
        book.setAuthors(authors);
        System.out.println(book.toString());
        
        Book book2 = new Book();
        book2.setCaption("Zolotoy teljonok");
        Author author2 = new Author();
        author2.setFirstname("Ilja");
        author2.setLastname("Ilf");
        Author author3 = new Author();
        author3.setFirstname("Jevgeny");
        author3.setLastname("Petrov");
        Author[] authors2 = new Author[2];
        authors2[0] = author2;
        authors2[1] = author3;
        book2.setAuthors(authors2);
        System.out.println(book2.toString());
        
        Book book3 = new Book();
        book3.setCaption("Harry Potter");
        Author author4 = new Author();
        author4.setFirstname("Joannea");
        author4.setLastname("Rowling");
        Author[] authors4 = new Author[1];
        authors4[0] = author4;
        book3.setAuthors(authors4);
        System.out.println(book3.toString());
        
        Book book4 = new Book();
        book4.setCaption("The Witcher");
        Author author5 = new Author();
        author5.setFirstname("Andrzej");
        author5.setLastname("Sapkowski");
        Author[] authors5 = new Author[1];
        authors5[0] = author5;
        book4.setAuthors(authors5);
        System.out.println(book4.toString());
        
        Book book5 = new Book();
        book5.setCaption("The Adventures of Tom Sawyer");
        Author author6 = new Author();
        author6.setFirstname("Mark");
        author6.setLastname("Twain");
        Author[] authors6 = new Author[1];
        authors6[0] = author6;
        book5.setAuthors(authors6);
        System.out.println(book5.toString());
    }
    
}
