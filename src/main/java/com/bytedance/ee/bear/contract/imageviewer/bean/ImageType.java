package com.bytedance.ee.bear.contract.imageviewer.bean;

import android.text.TextUtils;

public enum ImageType {
    IMAGE("image_"),
    DIAGRAM("diagram_");
    
    public String uuidPrefix;

    public static ImageType getType(String str) {
        if (!TextUtils.isEmpty(str)) {
            ImageType imageType = IMAGE;
            if (str.startsWith(imageType.uuidPrefix)) {
                return imageType;
            }
            ImageType imageType2 = DIAGRAM;
            if (str.startsWith(imageType2.uuidPrefix)) {
                return imageType2;
            }
        }
        return IMAGE;
    }

    private ImageType(String str) {
        this.uuidPrefix = str;
    }
}
