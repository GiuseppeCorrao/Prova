package LessonDatajpa.lesson.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data //getter-setter + tostring
@AllArgsConstructor //constructor
@NoArgsConstructor //empty constructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private int age;
}
