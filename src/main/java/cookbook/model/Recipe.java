package cookbook.model;


import cookbook.entity.RecipeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
//klasa POJO - plain old java object - reprezentuje obiekt rzeczywisty
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String recipeName;

    private String description;

    private String ingredients;

    private String directions;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate releaseDate;

    public static Recipe from(RecipeEntity entity) {
        return new Recipe(entity.getId(),
                entity.getRecipeName(),
                entity.getDescription(),
                entity.getIngredients(),
                entity.getDirections(),
                entity.getReleaseDate()

        );
    }

}
