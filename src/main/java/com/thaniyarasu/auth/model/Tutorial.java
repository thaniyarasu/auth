package com.thaniyarasu.auth.model;

import  jakarta.persistence.*;

//https://spring.io/guides/tutorials/rest/
@Entity
@Table(name = "tutorials")
public class Tutorial {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
    //@SequenceGenerator(name = "tutorials_id_seq", sequenceName = "tutorials_id_seq", schema = "public")
    @SequenceGenerator(name="tutorials_id_seq", sequenceName="tutorials_id_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorials_id_seq")
	private long id;


	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "published")
	private boolean published;
	public Tutorial() {
	}
	public Tutorial(String title, String description, boolean published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isPublished() {
		return published;
	}
	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
	}
}

//https://stackoverflow.com/questions/72475572/why-is-dependency-to-javax-persistence-api-removed-in-hibernate-core-6-0-2
