package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

import java.util.Date;

public class CharacterDevice extends SystemFile {
    private static final long serialVersionUID = -3585051204874199619L;

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public char getUnixIdentifier() {
        return 'c';
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public String toString() {
        return "CharacterDevice [type=" + super.toString() + "]";
    }

    public CharacterDevice(String str, String str2, Permissions permissions, Date date, Date date2, Date date3) {
        super(str, str2, permissions, 0, date, date2, date3);
    }
}
