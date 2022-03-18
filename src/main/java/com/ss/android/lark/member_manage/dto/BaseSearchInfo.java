package com.ss.android.lark.member_manage.dto;

import java.io.Serializable;
import java.util.List;

public class BaseSearchInfo implements Serializable {
    private String avatarKey;
    private String id;
    private String imageUrl;
    private String subTitle;
    private List<String> subTitleHitTerms;
    private String title;
    private List<String> titleHitTerms;
    private int type;

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getId() {
        return this.id;
    }

    public String getImageUrl() {
        return this.imageUrl;
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

    public int getType() {
        return this.type;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
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

    public void setType(int i) {
        this.type = i;
    }

    public BaseSearchInfo(String str, int i, String str2, String str3, String str4, String str5, List<String> list, List<String> list2) {
        this.id = str;
        this.type = i;
        this.imageUrl = str2;
        this.avatarKey = str3;
        this.title = str4;
        this.subTitle = str5;
        this.titleHitTerms = list;
        this.subTitleHitTerms = list2;
    }
}
