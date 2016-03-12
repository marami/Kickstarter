package ua.com.goit.gojava7.kickstarter.dao.interfaces;

import java.util.List;

import ua.com.goit.gojava7.kickstarter.model.Category;

public interface CategoryDao {

    Category get(Long categoryId);
    List<Category> getAll();

}
