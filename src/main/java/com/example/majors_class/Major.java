package com.example.majors_class;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String MajorName;
    @OneToMany(mappedBy = "major", cascade = CascadeType.ALL )
    private Set<Class> classes;
}
