package cookbook.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DishRecipes {

    private String name;
    private String description;
    private String component;
    private String preparation;


    public DishRecipes(String name, String recipes, String component, String preparation) {
        this.name = name;
        this.description = recipes;
        this.component = component;
        this.preparation = preparation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipes() {
        return description;
    }

    public void setRecipes(String recipes) {
        this.description = recipes;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }
}