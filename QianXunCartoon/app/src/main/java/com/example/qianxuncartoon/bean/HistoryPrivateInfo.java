package com.example.qianxuncartoon.bean;

/**
 * Created by Alex on 2017/2/25.
 */

public class HistoryPrivateInfo {
    private Integer comicid;
    private String comicname;
    private String comicdptn;
    private String comicauth;
    private Integer classid;
    private String comiccover;

    public Integer getComicid() {
        return comicid;
    }

    public void setComicid(Integer comicid) {
        this.comicid = comicid;
    }

    public String getComicname() {
        return comicname;
    }

    public void setComicname(String comicname) {
        this.comicname = comicname == null ? null : comicname.trim();
    }

    public String getComicdptn() {
        return comicdptn;
    }

    public void setComicdptn(String comicdptn) {
        this.comicdptn = comicdptn == null ? null : comicdptn.trim();
    }

    public String getComicauth() {
        return comicauth;
    }

    public void setComicauth(String comicauth) {
        this.comicauth = comicauth == null ? null : comicauth.trim();
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getComiccover() {
        return comiccover;
    }

    public void setComiccover(String comiccover) {
        this.comiccover = comiccover == null ? null : comiccover.trim();
    }

}
