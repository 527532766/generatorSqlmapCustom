package cn.f8888138.view;

import java.util.Date;

public class TbBlog {
    private Integer id;

    private String title;

    private String sunmmary;

    private String content;

    private Date creationtime;

    private Integer clickhits;

    private Integer replyhits;

    private Integer typeid;

    private String keyword;

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
        this.title = title == null ? null : title.trim();
    }

    public String getSunmmary() {
        return sunmmary;
    }

    public void setSunmmary(String sunmmary) {
        this.sunmmary = sunmmary == null ? null : sunmmary.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Integer getClickhits() {
        return clickhits;
    }

    public void setClickhits(Integer clickhits) {
        this.clickhits = clickhits;
    }

    public Integer getReplyhits() {
        return replyhits;
    }

    public void setReplyhits(Integer replyhits) {
        this.replyhits = replyhits;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }
}