package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.export.bean.TranslateConfig;
import com.bytedance.ee.util.io.NonProguard;

public class MessageConfig implements NonProguard {
    private boolean auto;
    private boolean canComment;
    private boolean canCopy;
    private boolean canEdit;
    private boolean canReaction;
    private boolean canReopen;
    private boolean canResolve;
    private boolean canShowMore;
    private boolean canShowVoice;
    private C8275a documentType = C8275a.f22371d;
    private boolean isUserAction;
    private boolean loadingSuccess = true;
    private boolean owner;
    private String token;
    private TranslateConfig translateConfig = new TranslateConfig();

    public C8275a getDocumentType() {
        return this.documentType;
    }

    public String getToken() {
        return this.token;
    }

    public TranslateConfig getTranslateConfig() {
        return this.translateConfig;
    }

    public boolean isAuto() {
        return this.auto;
    }

    public boolean isCanComment() {
        return this.canComment;
    }

    public boolean isCanCopy() {
        return this.canCopy;
    }

    public boolean isCanEdit() {
        return this.canEdit;
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

    public boolean isLoadingSuccess() {
        return this.loadingSuccess;
    }

    public boolean isOwner() {
        return this.owner;
    }

    public boolean isUserAction() {
        return this.isUserAction;
    }

    public void setAuto(boolean z) {
        this.auto = z;
    }

    public void setCanComment(boolean z) {
        this.canComment = z;
    }

    public void setCanCopy(boolean z) {
        this.canCopy = z;
    }

    public void setCanEdit(boolean z) {
        this.canEdit = z;
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

    public void setDocumentType(C8275a aVar) {
        this.documentType = aVar;
    }

    public void setLoadingSuccess(boolean z) {
        this.loadingSuccess = z;
    }

    public void setOwner(boolean z) {
        this.owner = z;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTranslateConfig(TranslateConfig translateConfig2) {
        this.translateConfig = translateConfig2;
    }

    public void setUserAction(boolean z) {
        this.isUserAction = z;
    }
}
