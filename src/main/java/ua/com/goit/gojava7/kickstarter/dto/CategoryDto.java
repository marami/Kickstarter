package ua.com.goit.gojava7.kickstarter.dto;

import java.util.ArrayList;
import java.util.List;

public class CategoryDto {

    private Long categoryId;
    private String name;
    private List<ProjectDto> projects = new ArrayList<>();

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProjectDto> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectDto> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "CategoryDto [categoryId=" + categoryId + ", name=" + name + "]";
    }
}
