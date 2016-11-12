package com.pantrychef.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "recipes")
public class RecipeTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7741409539824250727L;
	
	private String name;
	private String description;
	private String about;
	private String yeld;
	private String difficulty;
	@Column(name="preparation_time_in_minutes")
	private String preparationTimeInMinutes;
	private String author;
	private UUID provider;
	
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
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getYeld() {
		return yeld;
	}
	public void setYeld(String yeld) {
		this.yeld = yeld;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public UUID getProvider() {
		return provider;
	}
	public void setProvider(UUID provider) {
		this.provider = provider;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getPreparationTimeInMinutes() {
		return preparationTimeInMinutes;
	}
	public void setPreparationTimeInMinutes(String preparationTimeInMinutes) {
		this.preparationTimeInMinutes = preparationTimeInMinutes;
	}
}
