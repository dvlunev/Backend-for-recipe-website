package me.lunev.homework38.services;

import java.io.File;
import java.nio.file.Path;

public interface FilesService {

    boolean saveIngredientToFile(String json);

    boolean saveRecipeToFile(String json);

    String readFromIngredientsFile();

    String readFromRecipesFile();

    boolean cleanRecipesFile();

    boolean cleanIngredientsFile();

    File getIngredientsFile();

    File getRecipesFile();

    Path createTempFiles(String suffix);
}
