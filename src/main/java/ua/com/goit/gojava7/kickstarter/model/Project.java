package ua.com.goit.gojava7.kickstarter.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "project")
@NamedQueries({ @NamedQuery(name = "Project.count", query = "select count(p) as cnt from Project p"),
		@NamedQuery(name = "Project.findAll", query = "select p from Project p") })
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long projectId;

	@Column
	private String name;

	@Column
	private String description;

	@Column
	private Long goal;

	@Column
	private Long daysToGo;

	@Column
	private String history;

	@Column
	private String link;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id")
	private Category category = new Category();	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	@Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	private List<Question> questions = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	@Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	private List<Reward> rewards = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	@Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	private List<Payment> payments = new ArrayList<>();

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getGoal() {
		return goal;
	}

	public void setGoal(Long goal) {
		this.goal = goal;
	}

	public Long getDaysToGo() {
		return daysToGo;
	}

	public void setDaysToGo(Long daysToGo) {
		this.daysToGo = daysToGo;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<Reward> getRewards() {
		return rewards;
	}

	public void setRewards(List<Reward> rewards) {
		this.rewards = rewards;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public Long getCategoryId() {
		return category.getCategoryId();
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", name=" + name
				+ ", description=" + description + ", goal=" + goal +
				", daysToGo=" + daysToGo
				+ ", history=" + history + ", link=" + link + ", categoryId=" + category.getCategoryId() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (projectId ^ (projectId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		Project other = (Project) obj;
		if (this.projectId != null & other.projectId != null) {
			if (this.projectId != other.projectId) {
				return false;
			}
		}
		if (this.name != null & other.name != null) {
			if (this.name != other.name) {
				return false;
			}
		}
		return true;
	}
}