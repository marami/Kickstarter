package ua.com.goit.gojava7.kickstarter.dao.implementations;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.goit.gojava7.kickstarter.dao.interfaces.QuoteDao;
import ua.com.goit.gojava7.kickstarter.model.Quote;

@Repository
@Transactional
public class QuoteDaoDb implements QuoteDao {

	private static final Logger log = LoggerFactory.getLogger(QuoteDaoDb.class);

	@PersistenceContext
	private EntityManager em;

	public Quote get(Long quoteId) {
		log.info("<Quote> get(quoteId = {})...", quoteId);
		return em.find(Quote.class, quoteId);
	}

	public Long size() {
		log.info("<Long> size(quoteId = {})...");
		Long size = em.createNamedQuery("Quote.count", Long.class).getSingleResult();

		log.info("<Long> size(quoteId = {}) returned {}", size);
		return size;
	}
}
