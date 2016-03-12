package ua.com.goit.gojava7.kickstarter.dao.interfaces;

import ua.com.goit.gojava7.kickstarter.model.Project;

public interface ProjectDao {

    Project get(Long projectId);

}
