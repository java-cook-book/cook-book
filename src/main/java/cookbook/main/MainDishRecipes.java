package cookbook.main;

import cookbook.model.DishRecipes;

import java.util.ArrayList;
import java.util.List;

public class MainDishRecipes {
    public static void main(String[] args) {

        List<DishRecipes> dishRecipes = new ArrayList<>();
        dishRecipes.add(new DishRecipes("Sernik", "Pyszny sernik z jajek i śmietany",
                "Ser Jajka śmietana", "Wrzucić wszystko do miski i wymieszać"));
        dishRecipes.add(new DishRecipes("Pyry z gzikiem","Pyszne ziemniaki z serem twarogowym",
                "Ziemniaki, ser twarogowy, śmietana","ugotować pyty i zrobić z sera gdzik"));
        dishRecipes.add(new DishRecipes("rosół na kaca","Swojski rosół z kury i królika" ,"Kura królik warzywa",
                "zalać wodą garnek i gotować"));

    }
}
