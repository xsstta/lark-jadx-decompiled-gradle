package com.ss.android.lark.search.impl.entity.viewdata;

import android.text.TextUtils;
import com.ss.android.lark.searchcommon.dto.Scene;
import java.io.Serializable;
import java.util.List;

public class SearchBaseViewData implements Serializable {
    private static final long serialVersionUID = -2541238523544389550L;
    protected String avatarKey;
    protected String avatarUrl;
    protected String id;
    protected String imprId;
    private boolean isDelayed;
    private boolean isSelected;
    protected String requestId;
    protected Scene.Type scene;
    protected int sectionType = getSearchResultType();
    protected String session;
    protected String subTitle;
    protected List<String> subTitleHitTerms;
    protected String title;
    protected List<String> titleHitTerms;

    public boolean exactlyCompare(Object obj) {
        return true;
    }

    public int getSearchResultType() {
        return 0;
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getId() {
        return this.id;
    }

    public String getImprId() {
        return this.imprId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public Scene.Type getScene() {
        return this.scene;
    }

    public int getSectionType() {
        return this.sectionType;
    }

    public String getSession() {
        return this.session;
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

    public boolean isDelayed() {
        return this.isDelayed;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public String getDelayFeedId() {
        return getId();
    }

    public int hashCode() {
        String str = this.id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setDelayed(boolean z) {
        this.isDelayed = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setImprId(String str) {
        this.imprId = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setScene(Scene.Type type) {
        this.scene = type;
    }

    public void setSectionType(int i) {
        this.sectionType = i;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setSession(String str) {
        this.session = str;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBaseViewData)) {
            return false;
        }
        return TextUtils.equals(this.id, ((SearchBaseViewData) obj).id);
    }
}
