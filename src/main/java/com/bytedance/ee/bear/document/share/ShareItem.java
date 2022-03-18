package com.bytedance.ee.bear.document.share;

import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShareItem implements BaseJSModel {
    private String[] badges;
    private String content;
    private String[] disables;
    private boolean enable = true;
    private String id;
    private String title;
    private String topic;
    private String url;

    public String[] getBadges() {
        return this.badges;
    }

    public String getContent() {
        return this.content;
    }

    public String[] getDisables() {
        return this.disables;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTopic() {
        return this.topic;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public List<Integer> getBadgeShareTypes() {
        ArrayList arrayList = new ArrayList();
        if (isShareImageNew()) {
            arrayList.add(Integer.valueOf(ShareType.ExportImage.ordinal()));
        }
        return arrayList;
    }

    public List<Integer> getDisabledShareTypes() {
        ArrayList arrayList = new ArrayList();
        if (isShareImageDisabled()) {
            arrayList.add(Integer.valueOf(ShareType.ExportImage.ordinal()));
        }
        return arrayList;
    }

    public boolean isShareImageDisabled() {
        String[] strArr = this.disables;
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                if ("shareImage".equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isShareImageNew() {
        String[] strArr = this.badges;
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                if ("shareImage".equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return "ShareItem{id='" + this.id + '\'' + ", title='" + this.title + '\'' + ", url='" + this.url + '\'' + ", content='" + this.content + '\'' + ", topic='" + this.topic + '\'' + ", enable=" + this.enable + ", disables=" + Arrays.deepToString(this.disables) + ", badges=" + Arrays.deepToString(this.badges) + '}';
    }

    public void setBadges(String[] strArr) {
        this.badges = strArr;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDisables(String[] strArr) {
        this.disables = strArr;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTopic(String str) {
        this.topic = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
