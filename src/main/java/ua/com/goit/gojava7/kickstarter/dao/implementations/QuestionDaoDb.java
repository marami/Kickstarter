package ua.com.goit.gojava7.kickstarter.dao.implementations;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.goit.gojava7.kickstarter.dao.interfaces.QuestionDao;
import ua.com.goit.gojava7.kickstarter.model.Question;

@Repository
@Transactional
public class QuestionDaoDb implements QuestionDao {

	private static final Logger log = LoggerFactory.getLogger(QuestionDaoDb.class);

	@PersistenceContext
	private EntityManager em;

	public void add(Question question) {
		log.info("<void> add({})...", question);
		em.persist(question);
	}
}
