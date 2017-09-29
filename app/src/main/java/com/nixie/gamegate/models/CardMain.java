package com.nixie.gamegate.models;

/**
 * Created by Phase1 on 9/29/2017.
 */

public class CardMain {

    private String title;
    private String content;
    private int urlImg;
    private String urlShare;
    private String urlLink;

    public CardMain(){}

    public CardMain(String title, String content, int urlImg, String urlShare, String urlLink) {
        this.title = title;
        this.content = content;
        this.urlImg = urlImg;
        this.urlShare = urlShare;
        this.urlLink = urlLink;
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

    public int getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(Integer urlImg) {
        this.urlImg = urlImg;
    }

    public String getUrlShare() {
        return urlShare;
    }

    public void setUrlShare(String urlShare) {
        this.urlShare = urlShare;
    }

    public String getUrlLink() {
        return urlLink;
    }

    public void setUrlLink(String urlLink) {
        this.urlLink = urlLink;
    }
}
