package com.ss.android.vc.dto;

import java.io.Serializable;
import java.util.List;

public class BaseSearchInfo implements Serializable {
    private String avatarKey;
    private String id;
    private String subTitle;
    private List<String> subTitleHitTerms;
    private String title;
    private List<String> titleHitTerms;

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getId() {
        return this.id;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public List<String> getSubTitleHitTerms() {
        return this.subTitleHitTerms;
    }

    public String getTitle() {
        return this.title;
    }

    public List<String> getTitleHitTerms() {
        return this.titleHitTerms;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setSubTitleHitTerms(List<String> list) {
        this.subTitleHitTerms = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTitleHitTerms(List<String> list) {
        this.titleHitTerms = list;
    }
}
