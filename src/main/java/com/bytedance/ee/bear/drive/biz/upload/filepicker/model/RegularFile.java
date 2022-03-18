package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

import java.util.Date;

public class RegularFile extends FileSystemObject {
    private static final long serialVersionUID = 7113562456595400525L;

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public char getUnixIdentifier() {
        return '-';
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public String toString() {
        return "RegularFile [type=" + super.toString() + "]";
    }

    public RegularFile(String str, String str2, Permissions permissions, long j, Date date, Date date2, Date date3) {
        super(str, str2, permissions, j, date, date2, date3);
    }
}
