package com.bytedance.ee.bear.drive.biz.upload.filepicker.config;

public enum NavigationSortMode {
    NAME_ASC(0),
    NAME_DESC(1),
    DATE_ASC(2),
    DATE_DESC(3),
    SIZE_ASC(4),
    SIZE_DESC(5),
    TYPE_ASC(6),
    TYPE_DESC(7);
    
    private int mId;

    private NavigationSortMode(int i) {
        this.mId = i;
    }
}
