package cookbook.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


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

//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)  //można dodać date kiedy User wstawia nowy przepis
//    private LocalDate releaseDate;

}
