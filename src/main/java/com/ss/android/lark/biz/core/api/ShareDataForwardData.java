package com.ss.android.lark.biz.core.api;

import com.larksuite.framework.utils.CollectionUtils;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ShareDataForwardData implements Serializable {
    private boolean canAddExtraInfo;
    private String content;
    private String extraInfo = "";
    private boolean forceStandAlone;
    private List<String> images;
    private boolean isSdkShare;
    private boolean isSystemShare;
    private boolean mIncludeExternal;
    private String source;
    private Object sourceData;
    private String title;
    private Map<String, Long> videos;

    public boolean canAddExtraInfo() {
        return this.canAddExtraInfo;
    }

    public String getContent() {
        return this.content;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public List<String> getImages() {
        return this.images;
    }

    public String getSource() {
        return this.source;
    }

    public Object getSourceData() {
        return this.sourceData;
    }

    public String getTitle() {
        return this.title;
    }

    public Map<String, Long> getVideos() {
        return this.videos;
    }

    public boolean isForceStandAlone() {
        return this.forceStandAlone;
    }

    public boolean isIncludeExternal() {
        return this.mIncludeExternal;
    }

    public boolean isSdkShare() {
        return this.isSdkShare;
    }

    public boolean isSystemShare() {
        return this.isSystemShare;
    }

    public boolean isEmpty() {
        if (this.sourceData != null || !CollectionUtils.isEmpty(this.images)) {
            return false;
        }
        return true;
    }

    public void setCanAddExtraInfo(boolean z) {
        this.canAddExtraInfo = z;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public void setForceStandAlone(boolean z) {
        this.forceStandAlone = z;
    }

    public void setImages(List<String> list) {
        this.images = list;
    }

    public void setIncludeExternal(boolean z) {
        this.mIncludeExternal = z;
    }

    public void setSdkShare(boolean z) {
        this.isSdkShare = z;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSourceData(Object obj) {
        this.sourceData = obj;
    }

    public void setSystemShare(boolean z) {
        this.isSystemShare = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVideos(Map<String, Long> map) {
        this.videos = map;
    }
}
