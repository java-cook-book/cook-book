package cookbook.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

    private Integer id ;

    private String recipeName;

    private String description;

    private String ingredients;

    private String directions;

    private String tag;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate releaseDate = LocalDate.now();
}
