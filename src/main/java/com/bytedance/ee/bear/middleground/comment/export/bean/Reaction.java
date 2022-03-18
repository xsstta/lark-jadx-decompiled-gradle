package com.bytedance.ee.bear.middleground.comment.export.bean;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import java.util.List;
import java.util.Objects;

public class Reaction implements BaseJSModel {
    private String reactionKey;
    private String referKey;
    private String referType;
    private int totalCount;
    private List<ReactionDetailUserInfo> userList;

    public String getReactionKey() {
        return this.reactionKey;
    }

    public String getReferKey() {
        return this.referKey;
    }

    public String getReferType() {
        return this.referType;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public List<ReactionDetailUserInfo> getUserList() {
        return this.userList;
    }

    public int hashCode() {
        return Objects.hash(this.reactionKey, Integer.valueOf(this.totalCount));
    }

    public String toString() {
        return "Reaction{referType='" + this.referType + '\'' + ", referKey='" + this.referKey + '\'' + ", reactionKey='" + this.reactionKey + '\'' + ", totalCount=" + this.totalCount + ", userList=" + this.userList + '}';
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

    public void setTotalCount(int i) {
        this.totalCount = i;
    }

    public void setUserList(List<ReactionDetailUserInfo> list) {
        this.userList = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Reaction reaction = (Reaction) obj;
        if (this.totalCount != reaction.totalCount || !Objects.equals(this.reactionKey, reaction.reactionKey)) {
            return false;
        }
        return true;
    }
}
