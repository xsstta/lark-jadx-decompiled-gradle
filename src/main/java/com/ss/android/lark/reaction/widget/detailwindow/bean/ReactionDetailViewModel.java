package com.ss.android.lark.reaction.widget.detailwindow.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class ReactionDetailViewModel implements Serializable {
    private String reactionKey;
    private boolean selfInvoke;
    private int totalCount;
    private List<DetailUserInfo> userInfoList;

    public String getReactionKey() {
        return this.reactionKey;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public List<DetailUserInfo> getUserInfoList() {
        return this.userInfoList;
    }

    public boolean isSelfInvoke() {
        return this.selfInvoke;
    }

    public int hashCode() {
        return Objects.hash(this.reactionKey, Integer.valueOf(this.totalCount), this.userInfoList, Boolean.valueOf(this.selfInvoke));
    }

    public void setReactionKey(String str) {
        this.reactionKey = str;
    }

    public void setSelfInvoke(boolean z) {
        this.selfInvoke = z;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }

    public void setUserInfoList(List<DetailUserInfo> list) {
        this.userInfoList = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionDetailViewModel)) {
            return false;
        }
        ReactionDetailViewModel reactionDetailViewModel = (ReactionDetailViewModel) obj;
        if (this.totalCount != reactionDetailViewModel.totalCount || this.selfInvoke != reactionDetailViewModel.selfInvoke || !Objects.equals(this.reactionKey, reactionDetailViewModel.reactionKey) || !Objects.equals(this.userInfoList, reactionDetailViewModel.userInfoList)) {
            return false;
        }
        return true;
    }
}
