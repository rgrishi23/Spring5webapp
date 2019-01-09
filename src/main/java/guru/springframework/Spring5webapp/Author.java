package guru.springframework.spring5webapp;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Firstname;
    private String Lastname;
    @ManyToMany(mappedBy= "author")
    private Set<Books> book= new HashSet<Books>();
    public Author()
    {

    }
    public Author(String fname,String lname,Set<Books> book) {
        this.Firstname=fname;
        this.Lastname=lname;
        this.book=book;
    }
    public Set<Books> getBook() {
        return book;
    }
    public void setBook(Set<Books> book) {
        this.book = book;
    }
    public String getFirstname() {
        return Firstname;
    }
    public void setFirstname(String firstname) {
        Firstname = firstname;
    }
    public String getLastname() {
        return Lastname;
    }
    public void setLastname(String lastname) {
        Lastname = lastname;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
