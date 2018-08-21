package com.suraj.creational.pattern.builder;

import java.util.Date;

class Data{
	private final long id;
	private String summary = "";
    private String description = "";
    private boolean done = false;
    private Date dueDate;
    
    public Data(long id){
    	this.id=id;
    }
    public Data(long id, String summary, String description, boolean done,
            Date dueDate) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;

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
	public long getId() {
		return id;
	}
	public String toString(){
		return this.getId()+" "+this.getDescription()+" "+this.getSummary()+" "+this.getDueDate();
	}
}
class DataBuilder{
	private final long id;
	private String summary = "";
    private String description = "";
    private boolean done = false;
    private Date dueDate;
    public DataBuilder(long id) {
        this.id = id;
       
    }
    public DataBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public DataBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public DataBuilder setDone(boolean done) {
        this.done = done;
        return this;
    }

    public DataBuilder setDueDate(Date dueDate) {
        this.dueDate = new Date(dueDate.getTime());
        return this;
    }
    public Data build() {
        return new Data(id,summary, description,done, dueDate);
    }
}
public class BuilderDemo {
	public static void main(String[] args) {
		Data data = new DataBuilder(5).setDescription("Hello").setSummary("Test").build();
        System.out.println(data);
	}
}
