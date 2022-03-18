package com.bytedance.ee.bear.middleground.comment.export.bean;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import java.util.List;

public class ReactionDetail implements BaseJSModel {
    private List<Reaction> data;
    private String reactionKey;
    private String referKey;
    private String referType;

    public ReactionDetail() {
    }

    public List<Reaction> getData() {
        return this.data;
    }

    public String getReactionKey() {
        return this.reactionKey;
    }

    public String getReferKey() {
        return this.referKey;
    }

    public String getReferType() {
        return this.referType;
    }

    public String toString() {
        return "ReactionShowDetail{referType='" + this.referType + '\'' + ", referKey='" + this.referKey + '\'' + ", reactionKey='" + this.reactionKey + '\'' + ", data=" + this.data + '}';
    }

    public void setData(List<Reaction> list) {
        this.data = list;
    }

    public void setReactionKey(String str) {
        this.reactionKey = str;
    }

    public void setReferKey(String str) {
        this.referKey = str;
    }

    public void setReferType(String str) {
        this.referType = str;
    }

    public ReactionDetail(String str, String str2, List<Reaction> list) {
        this.referType = str;
        this.referKey = str2;
        this.data = list;
    }
}
