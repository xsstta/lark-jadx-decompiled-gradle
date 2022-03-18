package com.bytedance.ee.bear.sheet.exportimage.alert;

import android.text.TextUtils;
import com.bytedance.ee.util.io.NonProguard;

public class ImageAlertModel implements NonProguard {
    private ImageInfo imageInfo;
    private String messages;
    private String source;
    private String title;

    public static class ImageInfo implements NonProguard {
        private int imageHeight;
        private int imageWidth;

        public int getImageHeight() {
            return this.imageHeight;
        }

        public int getImageWidth() {
            return this.imageWidth;
        }

        public String toString() {
            return "ImageInfo{imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + '}';
        }

        public void setImageHeight(int i) {
            this.imageHeight = i;
        }

        public void setImageWidth(int i) {
            this.imageWidth = i;
        }
    }

    public ImageInfo getImageInfo() {
        return this.imageInfo;
    }

    public String getMessages() {
        return this.messages;
    }

    public String getSource() {
        return this.source;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "ImageAlertModel{title='" + this.title + '\'' + ", messages='" + this.messages + '\'' + ", imageInfo=" + this.imageInfo + ", source='" + this.source + '\'' + '}';
    }

    public void setImageInfo(ImageInfo imageInfo2) {
        this.imageInfo = imageInfo2;
    }

    public void setMessages(String str) {
        this.messages = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public static Boolean isValid(ImageAlertModel imageAlertModel) {
        boolean z;
        if (imageAlertModel == null || imageAlertModel.imageInfo == null || TextUtils.isEmpty(imageAlertModel.title) || TextUtils.isEmpty(imageAlertModel.messages)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
