package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

import java.util.Date;

public class Directory extends FileSystemObject {
    private static final long serialVersionUID = -3975569940766905884L;

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public char getUnixIdentifier() {
        return 'd';
    }

    public Directory() {
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public String toString() {
        return "Directory [type=" + super.toString() + "]";
    }

    public Directory(String str, String str2, Permissions permissions, Date date, Date date2, Date date3) {
        super(str, str2, permissions, 0, date, date2, date3);
    }
}
