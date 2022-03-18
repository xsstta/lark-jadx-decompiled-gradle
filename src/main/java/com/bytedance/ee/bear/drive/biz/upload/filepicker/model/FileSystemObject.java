package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

import android.net.Uri;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.p335b.C6773b;
import java.io.File;
import java.io.Serializable;
import java.util.Date;

public abstract class FileSystemObject implements Serializable, Comparable<FileSystemObject> {
    private static final long serialVersionUID = -571144166609728391L;
    private Group mGroup;
    private boolean mIsRemote;
    private boolean mIsSecure;
    private Date mLastAccessedTime;
    private Date mLastChangedTime;
    private Date mLastModifiedTime;
    private String mName;
    private String mParent;
    private Permissions mPermissions;
    private long mSize;

    public abstract char getUnixIdentifier();

    public FileSystemObject() {
    }

    public Group getGroup() {
        return this.mGroup;
    }

    public Date getLastAccessedTime() {
        return this.mLastAccessedTime;
    }

    public Date getLastChangedTime() {
        return this.mLastChangedTime;
    }

    public Date getLastModifiedTime() {
        return this.mLastModifiedTime;
    }

    public String getName() {
        return this.mName;
    }

    public String getParent() {
        return this.mParent;
    }

    public Permissions getPermissions() {
        return this.mPermissions;
    }

    public long getSize() {
        return this.mSize;
    }

    public boolean isRemote() {
        return this.mIsRemote;
    }

    public boolean isSecure() {
        return this.mIsSecure;
    }

    public boolean isHidden() {
        return this.mName.startsWith(".");
    }

    public Uri getFileUri() {
        return new Uri.Builder().scheme("file").path(getFullPath()).build();
    }

    public int hashCode() {
        int i;
        String str = this.mName;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i + 31) * 31;
        String str2 = this.mParent;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toRawPermissionString() {
        return Character.toString(getUnixIdentifier()) + getPermissions().toRawString();
    }

    public String getFullPath() {
        if (C6773b.m26702b(this)) {
            return "/";
        }
        if (!C6773b.m26703c(this)) {
            return this.mParent + File.separator + this.mName;
        } else if (this.mParent == null) {
            return "/" + this.mName;
        } else {
            return this.mParent + this.mName;
        }
    }

    public String toString() {
        return "FileSystemObject [ mName=" + this.mName + ", mParent=" + this.mParent + ", mGroup=" + this.mGroup + ", mPermissions=" + this.mPermissions + ", mSize=" + this.mSize + ", mLastAccessedTime=" + this.mLastAccessedTime + ", mLastModifiedTime=" + this.mLastModifiedTime + ", mLastChangedTime=" + this.mLastChangedTime + ", mIsSecure=" + this.mIsSecure + ", mIsRemote=" + this.mIsRemote + "]";
    }

    public void setGroup(Group group) {
        this.mGroup = group;
    }

    public void setLastAccessedTime(Date date) {
        this.mLastAccessedTime = date;
    }

    public void setLastChangedTime(Date date) {
        this.mLastChangedTime = date;
    }

    public void setLastModifiedTime(Date date) {
        this.mLastModifiedTime = date;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setParent(String str) {
        this.mParent = str;
    }

    public void setPermissions(Permissions permissions) {
        this.mPermissions = permissions;
    }

    public void setRemote(boolean z) {
        this.mIsRemote = z;
    }

    public void setSecure(boolean z) {
        this.mIsSecure = z;
    }

    public void setSize(long j) {
        this.mSize = j;
    }

    public int compareTo(FileSystemObject fileSystemObject) {
        return getName().compareTo(fileSystemObject.getName());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        FileSystemObject fileSystemObject = (FileSystemObject) obj;
        String str = this.mName;
        if (str == null) {
            if (fileSystemObject.mName != null) {
                return false;
            }
        } else if (!str.equals(fileSystemObject.mName)) {
            return false;
        }
        String str2 = this.mParent;
        if (str2 == null) {
            if (fileSystemObject.mParent != null) {
                return false;
            }
        } else if (!str2.equals(fileSystemObject.mParent)) {
            return false;
        }
        return true;
    }

    public FileSystemObject(String str, String str2, Permissions permissions, long j, Date date, Date date2, Date date3) {
        this.mName = str;
        this.mParent = str2;
        this.mPermissions = permissions;
        this.mSize = j;
        this.mLastAccessedTime = date;
        this.mLastModifiedTime = date2;
        this.mLastChangedTime = date3;
    }
}
