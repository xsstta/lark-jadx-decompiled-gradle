package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

import java.util.Date;

public class DomainSocket extends SystemFile {
    private static final long serialVersionUID = 7821422013567568593L;

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public char getUnixIdentifier() {
        return 's';
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public String toString() {
        return "DomainSocket [type=" + super.toString() + "]";
    }

    public DomainSocket(String str, String str2, Permissions permissions, Date date, Date date2, Date date3) {
        super(str, str2, permissions, 0, date, date2, date3);
    }
}
