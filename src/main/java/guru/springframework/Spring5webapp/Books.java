package guru.springframework.spring5webapp;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;


import org.springframework.beans.factory.annotation.Autowired;
@Entity
public class Books {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;
    private String isbn;
    private String publisher;
    @Autowired
    @ManyToMany
    @JoinTable(name="author_book",joinColumns= @JoinColumn(name="bookID"),
            inverseJoinColumns= @JoinColumn(name="authorID"))
    private Set<Author> author=new HashSet<Author> ();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public Set<Author> getAuthor() {
        return author;
    }
    public void setAuthor(Set<Author> author) {
        this.author = author;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
