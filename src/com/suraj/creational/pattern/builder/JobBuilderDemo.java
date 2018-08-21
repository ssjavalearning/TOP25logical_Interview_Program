package com.suraj.creational.pattern.builder;

import java.util.Date;

/**
 * The builder pattern provides a build object which is used to construct a complex object called the product. 
 * It encapsulates the logic of constructing the different pieces of the product.
 * 
 * @author suraj singh
 *
 */
class Job {
	
	private final long id;
	private String summary = "";
	private String description = "";
	private boolean done = false;
	private Date dueDate;
	
	public Job(long id) {
		this.id = id;
	}

	public Job(long id, String summary, String description, boolean done,
			Date dueDate) {
		super();
		this.id = id;
		this.summary = summary;
		this.description = description;
		this.done = done;
		this.dueDate = dueDate;
	}
	
	public long getId() {
		return id;
	}
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	public String toString() {
		return this.getId()+" "+this.getDescription()+" "+this.getSummary()+" "+this.getDueDate();
	}
}

class JobBuilder {
	
	private final long id;
	private String summary = "";
	private String description = "";
	private boolean done = false;
	private Date dueDate;
	
	public JobBuilder(long id, String summary, String description,
			boolean done, Date dueDate) {
		super();
		this.id = id;
		this.summary = summary;
		this.description = description;
		this.done = done;
		this.dueDate = dueDate;
	}

	public JobBuilder(long id) {
		this.id = id;
	}

	public JobBuilder setSummary(String summary) {
		this.summary = summary;
		return this;
	}

	public JobBuilder setDescription(String description) {
		this.description = description;
		return this;
	}

	public JobBuilder setDone(boolean done) {
		this.done = done;
		return this;
	}

	public JobBuilder setDueDate(Date dueDate) {
		this.dueDate = new Date(dueDate.getTime());
		return this;
	}
	
	public Job build() {
		return new Job(id, summary, description, done, dueDate);
	}
	
}
public class JobBuilderDemo {
	
	public static void main(String[] args) {
		
		Job job = new JobBuilder(5).setSummary("hello").setDescription("test").build();
		System.out.println(job);
	}
}
