package ua.com.goit.gojava7.kickstarter.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ProjectTest extends Assert {

	private final Project project = new Project();
	private final Category category = new Category();

	private final Question question = new Question();
	private final List<Question> questions = new ArrayList<>();

	private final Reward reward = new Reward();
	private final List<Reward> rewards = new ArrayList<>();

	private final Payment payment = new Payment();
	private final List<Payment> payments = new ArrayList<>();

	@Mock
	private PrintStream printSteam;

	@Before
	public void testSetUp() {
		category.setCategoryId(22L);

		project.setProjectId(11L);
		project.setName("TestName");
		project.setDescription("TestDescription");
		project.setGoal(100L);
		project.setDaysToGo(3L);
		project.setHistory("TestHistory");
		project.setLink("TestLink");
		project.setCategory(category);

		questions.add(question);
		project.setQuestions(questions);

		rewards.add(reward);
		project.setRewards(rewards);

		payments.add(payment);
		project.setPayments(payments);

		System.setOut(printSteam);
	}

	@After
	public void tearDown() {
		verifyNoMoreInteractions(printSteam);
	}

	@Test
	public void testGet() {
		assertThat(project.getProjectId(), is(11L));
		assertThat(project.getName(), is("TestName"));
		assertThat(project.getDescription(), is("TestDescription"));
		assertThat(project.getGoal(), is(100L));
		assertThat(project.getDaysToGo(), is(3L));
		assertThat(project.getHistory(), is("TestHistory"));
		assertThat(project.getLink(), is("TestLink"));
		assertThat(project.getCategory(), is(category));
		assertThat(project.getQuestions(), is(questions));
		assertThat(project.getRewards(), is(rewards));
		assertThat(project.getPayments(), is(payments));
		assertThat(project.getCategoryId(), is(22L));
	}

	@Test
	public void testToString() {
		assertThat(project.toString(), containsString("TestHistory"));
	}
}
