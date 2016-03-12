package ua.com.goit.gojava7.kickstarter.dao.interfaces;

import ua.com.goit.gojava7.kickstarter.model.Quote;

public interface QuoteDao {

    Quote get(Long quoteId);
    Long size();

}
