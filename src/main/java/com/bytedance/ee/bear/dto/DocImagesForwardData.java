package com.bytedance.ee.bear.dto;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import java.io.Serializable;
import java.util.List;

public class DocImagesForwardData implements Serializable {
    private boolean mCanAddExtraInfo;
    private String mContent;
    private List<String> mFiles;
    private List<String> mImages;
    private boolean mLocalShare;
    private String mSource;
    private String mTitle;

    public String getContent() {
        return this.mContent;
    }

    public List<String> getFiles() {
        return this.mFiles;
    }

    public List<String> getImages() {
        return this.mImages;
    }

    public String getSource() {
        return this.mSource;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public boolean isCanAddExtraInfo() {
        return this.mCanAddExtraInfo;
    }

    public boolean isLocalShare() {
        return this.mLocalShare;
    }

    public boolean isEmpty() {
        if (!TextUtils.isEmpty(this.mContent) || !CollectionUtils.isEmpty(this.mImages) || !CollectionUtils.isEmpty(this.mFiles)) {
            return false;
        }
        return true;
    }

    public void setCanAddExtraInfo(boolean z) {
        this.mCanAddExtraInfo = z;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public void setFiles(List<String> list) {
        this.mFiles = list;
    }

    public void setImages(List<String> list) {
        this.mImages = list;
    }

    public void setLocalShare(boolean z) {
        this.mLocalShare = z;
    }

    public void setSource(String str) {
        this.mSource = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }
}
