package com.ss.android.lark.mm.widget.moreDetails.repo;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class MmMoreDetails implements Serializable {
    @JSONField(name = "comment_num")
    private int commentNum;
    @JSONField(name = "page_view")
    private int pageView;
    @JSONField(name = "reaction_user_num")
    private int reactionUserNum;
    @JSONField(name = "user_view")
    private int userView;

    public int getCommentNum() {
        return this.commentNum;
    }

    public int getPageView() {
        return this.pageView;
    }

    public int getReactionUserNum() {
        return this.reactionUserNum;
    }

    public int getUserView() {
        return this.userView;
    }

    public void setCommentNum(int i) {
        this.commentNum = i;
    }

    public void setPageView(int i) {
        this.pageView = i;
    }

    public void setReactionUserNum(int i) {
        this.reactionUserNum = i;
    }

    public void setUserView(int i) {
        this.userView = i;
    }
}
