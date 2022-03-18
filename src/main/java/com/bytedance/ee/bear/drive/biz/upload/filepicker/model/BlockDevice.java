package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

import java.util.Date;

public class BlockDevice extends SystemFile {
    private static final long serialVersionUID = 5938248951823805680L;

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public char getUnixIdentifier() {
        return 'b';
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public String toString() {
        return "BlockDevice [type=" + super.toString() + "]";
    }

    public BlockDevice(String str, String str2, Permissions permissions, Date date, Date date2, Date date3) {
        super(str, str2, permissions, 0, date, date2, date3);
    }
}
