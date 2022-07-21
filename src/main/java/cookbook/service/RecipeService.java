package cookbook.service;

import cookbook.model.Recipe;

import java.util.List;

public interface RecipeService {

    void save(Recipe recipe);

    List<Recipe> getAll();

    void deleteById(Integer id); //Zrobiłem usówanie z ID ale zastanawiam się czy nie lepiej będzie z recipeName bo z kąd User będzie znał ID??

    Recipe getById(Integer id);



}
