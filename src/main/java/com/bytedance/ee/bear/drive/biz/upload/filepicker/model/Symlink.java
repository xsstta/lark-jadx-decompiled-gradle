package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

import java.util.Date;

public class Symlink extends FileSystemObject {
    private static final long serialVersionUID = -6411787401264288389L;
    private String mLink;
    private FileSystemObject mLinkRef;

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public char getUnixIdentifier() {
        return 'l';
    }

    public String getLink() {
        return this.mLink;
    }

    public FileSystemObject getLinkRef() {
        return this.mLinkRef;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject
    public String toString() {
        return "Symlink [type=" + super.toString() + ", link=" + this.mLink + "]";
    }

    public void setLink(String str) {
        this.mLink = str;
    }

    public void setLinkRef(FileSystemObject fileSystemObject) {
        this.mLinkRef = fileSystemObject;
    }

    public Symlink(String str, String str2, String str3, Permissions permissions, Date date, Date date2, Date date3) {
        super(str, str3, permissions, 0, date, date2, date3);
        this.mLink = str2;
    }
}
