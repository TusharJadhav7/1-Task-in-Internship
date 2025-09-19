package college.overview.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Student InFormation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Integer studetId;

    private String name;

    private String email;

    private Integer age;

    private String gender;

    private String stream;





}
