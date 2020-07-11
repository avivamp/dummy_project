package io.damonP.springstarter.dao;

public class Image {
	
	private String url;
	private String tag;
	private String description;
	
	public Image() {
	}
	
	public Image(String url, String tag, String description) {
		super();
		this.url = url;
		this.tag = tag;
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
