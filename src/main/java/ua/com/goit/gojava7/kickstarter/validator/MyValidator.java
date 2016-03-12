package ua.com.goit.gojava7.kickstarter.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MyValidator {

	private static final Logger log = LoggerFactory.getLogger(MyValidator.class);

	public boolean validateAmountOfPledge(String amount) {
		log.info("validateAmountOfPledge(amount = {})...", amount);
		Pattern p = Pattern.compile("^[1-9][0-9]{0,10}$");
		Matcher m = p.matcher(amount);
		Boolean result = m.matches();

		log.info("validateAmountOfPledge(amount = {}) returned {}", amount, result);
		return result;
	}
	
	public boolean validatePayer(String name, String card) {
		log.info("validatePayer({}, {})...", name, card);
		return validateName(name) && validateCard(card);
	}

	public boolean validateName(String name) {
		log.info("validateName(name = {})...", name);
		Pattern p = Pattern.compile("^[a-zA-Z][a-z]{2,20}$");
		Matcher m = p.matcher(name);
		Boolean result = m.matches();

		log.info("validateName(name = {}) returned {}", name, result);
		return result;
	}
	
	public boolean validateCard(String card) {
		log.info("validateCard(card = {})...", card);
		Pattern p = Pattern.compile("^[0-9]{16}$");
		Matcher m = p.matcher(card);
		Boolean result = m.matches();

		log.info("validateCard(card = {}) returned {}", card, result);
		return result;
	}

	public boolean validateQuestion(String question) {
		log.info("validateQuestion(question = {})...", question);
		Pattern p = Pattern.compile("^[a-zA-Z0-9 ]{2,500}$");
		Matcher m = p.matcher(question);
		Boolean result = m.matches();

		log.info("validateQuestion(question = {}) returned {}", question, result);
		return result;
	}
}
