package org.yidu.novel.entity;

// Generated 2013/12/26 20:57:47 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.yidu.novel.constant.YiDuConfig;
import org.yidu.novel.constant.YiDuConstants;

/**
 * TArticle generated by hbm2java
 */
public class TArticle implements java.io.Serializable {

    private static final long serialVersionUID = -4668183129971625875L;
    private int articleno;
    private String articlename;
    private String initial;
    private String keywords;
    private Integer authorid;
    private String author;
    private Integer category;
    private Integer subcategory;
    private String intro;
    private Integer lastchapterno;
    private String lastchapter;
    private Integer chapters;
    private Integer size;
    private Boolean fullflag;
    private Integer imgflag;
    private Date postdate;
    private Date lastupdate;
    private Boolean firstflag;
    private Integer permission;
    private Boolean authorflag;
    private String agent;

    private Integer dayvisit;
    private Integer weekvisit;
    private Integer monthvisit;
    private Integer allvisit;
    private Integer dayvote;
    private Integer weekvote;
    private Integer monthvote;
    private Integer allvote;

    private Boolean deleteflag;

    public TArticle() {
    }

    public TArticle(int articleno) {
        this.articleno = articleno;
    }

    public TArticle(int articleno, String articlename, String initial, String keywords, Integer authorid,
            String author, Integer category, Integer subcategory, String intro, Integer lastchapterno,
            String lastchapter, Integer chapters, Integer size, Boolean fullflag, Integer imgflag, Date postdate,
            Date lastupdate, Boolean firstflag, Integer permission, Boolean authorflag, String agent, Integer dayvisit,
            Integer weekvisit, Integer monthvisit, Integer allvisit, Integer dayvote, Integer weekvote,
            Integer monthvote, Integer allvote, Boolean deleteflag) {
        this.articleno = articleno;
        this.articlename = articlename;
        this.initial = initial;
        this.keywords = keywords;
        this.authorid = authorid;
        this.author = author;
        this.category = category;
        this.subcategory = subcategory;
        this.intro = intro;
        this.lastchapterno = lastchapterno;
        this.lastchapter = lastchapter;
        this.chapters = chapters;
        this.size = size;
        this.fullflag = fullflag;
        this.imgflag = imgflag;
        this.postdate = postdate;
        this.lastupdate = lastupdate;
        this.firstflag = firstflag;
        this.permission = permission;
        this.authorflag = authorflag;
        this.agent = agent;

        this.dayvisit = dayvisit;
        this.weekvisit = weekvisit;
        this.monthvisit = monthvisit;
        this.allvisit = allvisit;
        this.dayvote = dayvote;
        this.weekvote = weekvote;
        this.monthvote = monthvote;
        this.allvote = allvote;
        this.deleteflag = deleteflag;
    }

    public int getArticleno() {
        return this.articleno;
    }

    public void setArticleno(int articleno) {
        this.articleno = articleno;
    }

    public String getArticlename() {
        return this.articlename;
    }

    public void setArticlename(String articlename) {
        this.articlename = articlename;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getAuthorid() {
        return this.authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getCategory() {
        return this.category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Integer subcategory) {
        this.subcategory = subcategory;
    }

    public String getIntro() {
        return this.intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getLastchapterno() {
        return this.lastchapterno;
    }

    public void setLastchapterno(Integer lastchapterno) {
        this.lastchapterno = lastchapterno;
    }

    public String getLastchapter() {
        return this.lastchapter;
    }

    public void setLastchapter(String lastchapter) {
        this.lastchapter = lastchapter;
    }

    public Boolean getFirstflag() {
        return firstflag;
    }

    public void setFirstflag(Boolean firstflag) {
        this.firstflag = firstflag;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public Integer getPermission() {
        return permission;
    }

    public Boolean getAuthorflag() {
        return authorflag;
    }

    public void setAuthorflag(Boolean authorflag) {
        this.authorflag = authorflag;
    }

    public Integer getChapters() {
        return this.chapters;
    }

    public void setChapters(Integer chapters) {
        this.chapters = chapters;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Boolean getFullflag() {
        return this.fullflag;
    }

    public void setFullflag(Boolean fullflag) {
        this.fullflag = fullflag;
    }

    public Integer getImgflag() {
        return this.imgflag;
    }

    public void setImgflag(Integer imgflag) {
        this.imgflag = imgflag;
    }

    public Date getPostdate() {
        return this.postdate;
    }

    public void setPostdate(Date postdate) {
        this.postdate = postdate;
    }

    public Date getLastupdate() {
        return this.lastupdate;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Integer getDayvisit() {
        return this.dayvisit;
    }

    public void setDayvisit(Integer dayvisit) {
        this.dayvisit = dayvisit;
    }

    public Integer getWeekvisit() {
        return this.weekvisit;
    }

    public void setWeekvisit(Integer weekvisit) {
        this.weekvisit = weekvisit;
    }

    public Integer getMonthvisit() {
        return this.monthvisit;
    }

    public void setMonthvisit(Integer monthvisit) {
        this.monthvisit = monthvisit;
    }

    public Integer getAllvisit() {
        return this.allvisit;
    }

    public void setAllvisit(Integer allvisit) {
        this.allvisit = allvisit;
    }

    public Integer getDayvote() {
        return this.dayvote;
    }

    public void setDayvote(Integer dayvote) {
        this.dayvote = dayvote;
    }

    public Integer getWeekvote() {
        return this.weekvote;
    }

    public void setWeekvote(Integer weekvote) {
        this.weekvote = weekvote;
    }

    public Integer getMonthvote() {
        return this.monthvote;
    }

    public void setMonthvote(Integer monthvote) {
        this.monthvote = monthvote;
    }

    public Integer getAllvote() {
        return this.allvote;
    }

    public void setAllvote(Integer allvote) {
        this.allvote = allvote;
    }

    public Boolean getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Boolean deleteflag) {
        this.deleteflag = deleteflag;
    }

    public String getIntroOmit() {
        if (getIntro() != null && getIntro().length() > 60) {
            return getIntro().substring(0, 60) + "...";
        }
        return getIntro();
    }

    public Integer getSubdir() {
        return this.articleno / YiDuConstants.SUB_DIR_ARTICLES;
    }

    public String getLastchapterOmit() {
        if (getLastchapter() != null && getLastchapter().length() > 10) {
            return getLastchapter().substring(0, 10);
        }
        return getLastchapter();
    }

    public String getImgUrl() {
        String fileName = "";
        if (imgflag == null) {
            fileName = "nocover.jpg";
        } else {
            switch (imgflag) {
            case 1:
                fileName = articleno + "s.jpg";
                break;
            case 2:
                fileName = articleno + "s.gif";
                break;
            case 3:
                fileName = articleno + "s.png";
                break;
            case 10:
                fileName = articleno + "l.jpg";
                break;
            default:
                fileName = "nocover.jpg";
                break;
            }
        }
        String imgUrl = YiDuConstants.yiduConf.getString(YiDuConfig.RELATIVE_IAMGE_PATH) + "/";
        if (StringUtils.equals("nocover.jpg", fileName)) {
            imgUrl = imgUrl + fileName;
        } else {
            imgUrl = imgUrl + articleno / YiDuConstants.SUB_DIR_ARTICLES + "/" + articleno + "/" + fileName;
        }
        return imgUrl;
    }
}
