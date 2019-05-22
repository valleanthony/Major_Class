package com.example.majors_class;



import javax.persistence.*;

@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String className;
    private String instructor;
    @ManyToOne
    private Major major;
}
