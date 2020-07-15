package io.damonP.springstarter.dao;

import java.io.Serializable;

public class Image  implements Serializable{
	
	private static final long serialVersionUID = 8156526077883281623L;
	
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
