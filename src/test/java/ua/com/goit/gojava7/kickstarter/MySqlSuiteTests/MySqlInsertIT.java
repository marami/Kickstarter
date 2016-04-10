package ua.com.goit.gojava7.kickstarter.MySqlSuiteTests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ua.com.goit.gojava7.kickstarter.dao.interfaces.CategoryDao;
import ua.com.goit.gojava7.kickstarter.dao.interfaces.PaymentDao;
import ua.com.goit.gojava7.kickstarter.dao.interfaces.ProjectDao;
import ua.com.goit.gojava7.kickstarter.dao.interfaces.QuestionDao;
import ua.com.goit.gojava7.kickstarter.model.Category;
import ua.com.goit.gojava7.kickstarter.model.Payment;
import ua.com.goit.gojava7.kickstarter.model.Project;
import ua.com.goit.gojava7.kickstarter.model.Question;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/MySql/applicationContext.xml")
@Transactional
public class MySqlInsertIT {

    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private ProjectDao projectDao;
    @Autowired
    private QuestionDao questionDao;
    @Autowired
    private PaymentDao paymentDao;

    private Category category;
    private Project project;

    @Before
    public void testSetUp() {
        category = new Category();
        category.setName("New category for test");

        project = new Project();
        project.setName("New project for test");
        project.setDescription("About project");
        project.setGoal(1000L);
        project.setDaysToGo(11L);
        project.setCategory(category);
    }

    @Test
    public void testAddQuestion() {

        Question question = new Question();
        question.setQuestion("New Question for test");
        question.setProject(project);

        questionDao.add(question);
        Long categoryId = category.getCategoryId();
        Long projectId = project.getProjectId();

        assertThat(categoryDao.get(categoryId).getName(), is("New category for test"));
        assertThat(projectDao.get(projectId).getName(), is("New project for test"));

    }

    @Test
    public void testAddPayment() {

        Payment payment = new Payment();
        payment.setAmount(100L);
        payment.setCard("1234123412341234");
        payment.setUser("Vasya");
        payment.setProject(project);

        paymentDao.add(payment);
        Long categoryId = category.getCategoryId();
        Long projectId = project.getProjectId();

        assertThat(categoryDao.get(categoryId).getName(), is("New category for test"));
        assertThat(projectDao.get(projectId).getName(), is("New project for test"));
        assertThat(paymentDao.getPledged(projectId), is(100L));
        
    }

}
