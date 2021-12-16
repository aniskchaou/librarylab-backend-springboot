package com.dev.delta.entitiesi18n;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MenuI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String dashboardI18n;
	String booksMenuI18n;
	String categoriesI18n;
	String booksI18n;
	String requesredBooksI18n;
	String ArchivesI18n;
	String membersI18n;
	String membersMenuI18n;
	String typeMembersI18n;
	String circulationsI18n;
	String circulationsMenuI18n;
	String circulationStatusI18n;
	String publishersI18n;
	String weitersI18n;
	String settingsI18n;
	String logOutI18n;
	String langI18n;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDashboardI18n() {
		return dashboardI18n;
	}

	public void setDashboardI18n(String dashboardI18n) {
		this.dashboardI18n = dashboardI18n;
	}

	public String getBooksMenuI18n() {
		return booksMenuI18n;
	}

	public void setBooksMenuI18n(String booksMenuI18n) {
		this.booksMenuI18n = booksMenuI18n;
	}

	public String getCategoriesI18n() {
		return categoriesI18n;
	}

	public void setCategoriesI18n(String categoriesI18n) {
		this.categoriesI18n = categoriesI18n;
	}

	public String getBooksI18n() {
		return booksI18n;
	}

	public void setBooksI18n(String booksI18n) {
		this.booksI18n = booksI18n;
	}

	public String getRequesredBooksI18n() {
		return requesredBooksI18n;
	}

	public void setRequesredBooksI18n(String requesredBooksI18n) {
		this.requesredBooksI18n = requesredBooksI18n;
	}

	public String getArchivesI18n() {
		return ArchivesI18n;
	}

	public void setArchivesI18n(String archivesI18n) {
		ArchivesI18n = archivesI18n;
	}

	public String getMembersI18n() {
		return membersI18n;
	}

	public void setMembersI18n(String membersI18n) {
		this.membersI18n = membersI18n;
	}

	public String getMembersMenuI18n() {
		return membersMenuI18n;
	}

	public void setMembersMenuI18n(String membersMenuI18n) {
		this.membersMenuI18n = membersMenuI18n;
	}

	public String getTypeMembersI18n() {
		return typeMembersI18n;
	}

	public void setTypeMembersI18n(String typeMembersI18n) {
		this.typeMembersI18n = typeMembersI18n;
	}

	public String getCirculationsI18n() {
		return circulationsI18n;
	}

	public void setCirculationsI18n(String circulationsI18n) {
		this.circulationsI18n = circulationsI18n;
	}

	public String getCirculationsMenuI18n() {
		return circulationsMenuI18n;
	}

	public void setCirculationsMenuI18n(String circulationsMenuI18n) {
		this.circulationsMenuI18n = circulationsMenuI18n;
	}

	public String getCirculationStatusI18n() {
		return circulationStatusI18n;
	}

	public void setCirculationStatusI18n(String circulationStatusI18n) {
		this.circulationStatusI18n = circulationStatusI18n;
	}

	public String getPublishersI18n() {
		return publishersI18n;
	}

	public void setPublishersI18n(String publishersI18n) {
		this.publishersI18n = publishersI18n;
	}

	public String getWeitersI18n() {
		return weitersI18n;
	}

	public void setWeitersI18n(String weitersI18n) {
		this.weitersI18n = weitersI18n;
	}

	public String getSettingsI18n() {
		return settingsI18n;
	}

	public void setSettingsI18n(String settingsI18n) {
		this.settingsI18n = settingsI18n;
	}

	public String getLogOutI18n() {
		return logOutI18n;
	}

	public void setLogOutI18n(String logOutI18n) {
		this.logOutI18n = logOutI18n;
	}

	public String getLangI18n() {
		return langI18n;
	}

	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}

}
