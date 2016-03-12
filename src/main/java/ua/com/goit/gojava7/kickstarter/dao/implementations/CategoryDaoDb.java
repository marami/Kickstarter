package ua.com.goit.gojava7.kickstarter.dao.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.goit.gojava7.kickstarter.dao.interfaces.CategoryDao;
import ua.com.goit.gojava7.kickstarter.model.Category;

@Repository
@Transactional
public class CategoryDaoDb implements CategoryDao {

	private static final Logger log = LoggerFactory.getLogger(CategoryDaoDb.class);

	@PersistenceContext
	private EntityManager em;

	public Category get(Long categoryId) {
		log.info("<Category> get(categoryId = {})...", categoryId);
		return em.find(Category.class, categoryId);
	}

	public List<Category> getAll() {
		log.info("<categories> getAll()...");
		return em.createNamedQuery("Category.getAll", Category.class).getResultList();
	}
}
