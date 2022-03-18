package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

import java.util.Date;

public class NamedPipe extends SystemFile {
    private static final long serialVersionUID = -5199356055601688190L;

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public char getUnixIdentifier() {
        return 'p';
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public String toString() {
        return "NamedPipe [type=" + super.toString() + "]";
    }

    public NamedPipe(String str, String str2, Permissions permissions, Date date, Date date2, Date date3) {
        super(str, str2, permissions, 0, date, date2, date3);
    }
}
