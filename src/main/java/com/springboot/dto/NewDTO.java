package com.springboot.dto;

public class NewDTO {
	private String title;
	private String content;

	public NewDTO() {
		// TODO Auto-generated constructor stub
	}

	public NewDTO(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "NewDTO [title=" + title + ", content=" + content + "]";
	}

}
