package hibernate_wcd.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
@Getter
@Setter
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(unique = true)
    private String code;
    private int hour;
}
