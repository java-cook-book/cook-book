package cookbook.entity;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "recipe")
public class RecipeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String recipeName;

    private String description;

    private String ingredients;

    private String directions;

    private String tag;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate releaseDate = LocalDate.now();


    public RecipeEntity(String recipeName, String description, String ingredients, String directions, String tag, LocalDate releaseDate) {
        this.recipeName = recipeName;
        this.description = description;
        this.ingredients = ingredients;
        this.directions = directions;
        this.tag = tag;
        this.releaseDate = releaseDate;
    }
}
