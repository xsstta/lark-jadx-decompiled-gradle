package com.bytedance.ee.bear.document.imageviewer.bean;

import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;

public class ImageDataModel extends ImageData {
    private String source;

    public String getSource() {
        return this.source;
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.bean.ImageData
    public String toString() {
        return "ImageDataModel{toolStatus=" + this.toolStatus + ", image=" + this.image + ", imageList=" + this.imageList + ", source=" + this.source + '}';
    }

    public void setSource(String str) {
        this.source = str;
    }
}
