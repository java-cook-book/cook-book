package cookbook.model;


import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Recipes {

    private Integer id;

    private String author;

    private String nameRecipes;

    private String description;
}
