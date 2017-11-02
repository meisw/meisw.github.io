package com.meisw.po;

public class Lunbo {
    private Integer id;

    private String title;

    private String link;

    private String url;

    private String picName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

	@Override
    public String toString() {
	    return "Lunbo [id=" + id + ", title=" + title + ", link=" + link + ", url=" + url + ", picName=" + picName + "]";
    }
}