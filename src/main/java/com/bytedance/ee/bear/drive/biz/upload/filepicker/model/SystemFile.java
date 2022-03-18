package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

import java.util.Date;

public abstract class SystemFile extends FileSystemObject {
    private static final long serialVersionUID = -1396396017050697459L;

    public SystemFile(String str, String str2, Permissions permissions, long j, Date date, Date date2, Date date3) {
        super(str, str2, permissions, j, date, date2, date3);
    }
}
