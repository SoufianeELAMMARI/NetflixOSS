package com.test.entities;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TEST")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="URL")
    private String url;

    @Column(name ="TITLE")
    private String title;

    @Column(name ="DESCRIPTION")
    private String description;

    public Test() {
    }

    public Test(String url, String title, String description) {
        this.url = url;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test)) return false;
        Test test = (Test) o;
        return Objects.equals(getId(), test.getId()) &&
                Objects.equals(getUrl(), test.getUrl()) &&
                Objects.equals(getTitle(), test.getTitle()) &&
                Objects.equals(getDescription(), test.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUrl(), getTitle(), getDescription());
    }
}
