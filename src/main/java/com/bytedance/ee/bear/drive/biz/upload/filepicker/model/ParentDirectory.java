package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

public class ParentDirectory extends Directory {
    private static final long serialVersionUID = -3818276335217197479L;

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public boolean isHidden() {
        return false;
    }

    public ParentDirectory(String str) {
        super("..", str, null, null, null, null);
    }
}
