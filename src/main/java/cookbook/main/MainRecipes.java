package cookbook.main;

import cookbook.model.Recipe;

import java.util.ArrayList;
import java.util.List;

public class MainRecipes {
    public static void main(String[] args) {

        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe(1, "Sernik", "puszysty sernik z malinami", "jaja, ser, cukier, śmietana", "wszystkie składniki wymieszać i piec w 180 stopniach"));
        recipes.add(new Recipe(2, "Pyry z gzikiem","Pyszne ziemniaki z serem twarogowym",
                "ziemniaki, ser twarogowy, śmietana","ugotować pyty i zrobić z sera gdzik"));
        recipes.add(new Recipe(2, "rosół na kaca","Swojski rosół z kury i królika" ,"kura królik warzywa",
                "zalać wodą garnek i gotować"));

    }
}
