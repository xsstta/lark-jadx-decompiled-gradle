package com.bytedance.ee.bear.document.feed;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;

public class ShowFeedModel implements BaseJSModel {
    private boolean canComment = true;
    private boolean canReaction;
    private boolean canReopen;
    private boolean canResolve;
    private boolean canShowMore;
    private boolean canShowVoice;
    private boolean isUserAction;
    private boolean loadingSuccess = true;

    public boolean isCanComment() {
        return this.canComment;
    }

    public boolean isCanReaction() {
        return this.canReaction;
    }

    public boolean isCanReopen() {
        return this.canReopen;
    }

    public boolean isCanResolve() {
        return this.canResolve;
    }

    public boolean isCanShowMore() {
        return this.canShowMore;
    }

    public boolean isCanShowVoice() {
        return this.canShowVoice;
    }

    public boolean isIsUserAction() {
        return this.isUserAction;
    }

    public boolean isLoadingSuccess() {
        return this.loadingSuccess;
    }

    public boolean isUserAction() {
        return this.isUserAction;
    }

    public String toString() {
        return "ShowFeedModel{isUserAction=" + this.isUserAction + ", canComment=" + this.canComment + ", canReaction=" + this.canReaction + ", canResolve=" + this.canResolve + ", canShowMore=" + this.canShowMore + ", canShowVoice=" + this.canShowVoice + ", canReopen=" + this.canReopen + ", loadingSuccess=" + this.loadingSuccess + '}';
    }

    public void setCanComment(boolean z) {
        this.canComment = z;
    }

    public void setCanReaction(boolean z) {
        this.canReaction = z;
    }

    public void setCanReopen(boolean z) {
        this.canReopen = z;
    }

    public void setCanResolve(boolean z) {
        this.canResolve = z;
    }

    public void setCanShowMore(boolean z) {
        this.canShowMore = z;
    }

    public void setCanShowVoice(boolean z) {
        this.canShowVoice = z;
    }

    public void setIsUserAction(boolean z) {
        this.isUserAction = z;
    }

    public void setLoadingSuccess(boolean z) {
        this.loadingSuccess = z;
    }

    public void setUserAction(boolean z) {
        this.isUserAction = z;
    }
}
