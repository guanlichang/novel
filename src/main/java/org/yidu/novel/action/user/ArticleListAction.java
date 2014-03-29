package org.yidu.novel.action.user;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.yidu.novel.action.base.AbstractUserListBaseAction;
import org.yidu.novel.bean.ArticleSearchBean;
import org.yidu.novel.constant.YiDuConstants;
import org.yidu.novel.entity.TArticle;
import org.yidu.novel.utils.LoginManager;
import org.yidu.novel.utils.Utils;

/**
 * <p>
 * 小说列表Action
 * </p>
 * Copyright(c) 2013 YiDu-Novel. All rights reserved.
 * 
 * @version 1.0.0
 * @author shinpa.you
 */
@Action(value = "articleList")
public class ArticleListAction extends AbstractUserListBaseAction {

    private static final long serialVersionUID = 6039988916270544079L;

    /**
     * 功能名称。
     */
    public static final String NAME = "articleList";

    /**
     * URL。
     */
    public static final String URL = NAMESPACE + "/" + NAME;

    /**
     * 小说号
     */
    private int articleno;

    /**
     * 小说列表
     */
    private List<TArticle> articleList = new ArrayList<TArticle>();

    public int getArticleno() {
        return articleno;
    }

    public void setArticleno(int articleno) {
        this.articleno = articleno;
    }

    public List<TArticle> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<TArticle> articleList) {
        this.articleList = articleList;
    }

    @Override
    protected void loadData() {
        ArticleSearchBean searchBean = new ArticleSearchBean();
        searchBean.setAuthorid(LoginManager.getLoginUser().getUserno());
        searchBean.setPageType(ArticleSearchBean.PageType.authorPage);

        if (StringUtils.isEmpty(pagination.getSortColumn())) {
            pagination.setSortColumn("articleno");
            pagination.setSortOrder("DESC");
        }

        // 总件数设置
        articleList = articleService.find(searchBean);
    }

    public String delete() throws Exception {

        articleService.delteByNo(articleno);
        // 删除章节文件
        Utils.deleteDirectory(Utils.getTextDirectoryPathByArticleno(articleno));
        // 删除封面文件
        Utils.deleteDirectory(Utils.getImgDirectoryPathByArticleno(articleno));

        loadData();
        return INPUT;
    }

    @Override
    public int getPageType() {
        return YiDuConstants.Pagetype.PAGE_AUTHER_ARTICLE_LIST;
    }

    @Override
    public String getTempName() {
        return "user/articleList";
    }
}
