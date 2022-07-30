package cookbook.entity;

import cookbook.model.Recipe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "recipe")
@NoArgsConstructor
@AllArgsConstructor
public class RecipeEntity extends Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String recipeName;

    private String description;

    private String ingredients;

    private String directions;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate releaseDate;

}
