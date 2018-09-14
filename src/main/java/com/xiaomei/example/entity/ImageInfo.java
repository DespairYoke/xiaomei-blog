package com.xiaomei.example.entity;

import java.util.Date;

/**
 * @author zwd
 * @date 2018/9/14 15:55
 * @Email stephen.zwd@gmail.com
 */
public class ImageInfo {

    private Integer id;

    private String title;

    private String path;

    private Date createat;

    private Integer startRow;


    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Date getCreateat() {
        return createat;
    }

    public void setCreateat(Date createat) {
        this.createat = createat;
    }
}
