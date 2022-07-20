package cookbook.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
//klasa POJO - plain old java object - reprezentuje obiekt rzeczywisty
public class Recipe {

    private Integer id;

    private String recipeName;

    private String description;

    private String ingredients;

    private String directions;
}
