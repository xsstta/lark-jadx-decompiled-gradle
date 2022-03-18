package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

import java.io.Serializable;

public abstract class Permission implements Serializable {
    private static final long serialVersionUID = 5775987092282897912L;
    private boolean mExecute;
    private String mRawString;
    private boolean mRead;
    private boolean mWrite;

    /* access modifiers changed from: protected */
    public abstract String getRawString();

    /* access modifiers changed from: protected */
    public void invalidateRawString() {
        this.mRawString = null;
    }

    public boolean isExecute() {
        return this.mExecute;
    }

    public boolean isRead() {
        return this.mRead;
    }

    public boolean isWrite() {
        return this.mWrite;
    }

    public String toRawString() {
        if (this.mRawString == null) {
            this.mRawString = getRawString();
        }
        return this.mRawString;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 1231;
        if (this.mExecute) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i4 = (i + 31) * 31;
        if (this.mRead) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i5 = (i4 + i2) * 31;
        if (!this.mWrite) {
            i3 = 1237;
        }
        return i5 + i3;
    }

    public String toString() {
        return "Permission [read=" + this.mRead + ", write=" + this.mWrite + ", execute=" + this.mExecute + "]";
    }

    public void setExecute(boolean z) {
        this.mExecute = z;
        invalidateRawString();
    }

    public void setRead(boolean z) {
        this.mRead = z;
        invalidateRawString();
    }

    public void setWrite(boolean z) {
        this.mWrite = z;
        invalidateRawString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Permission permission = (Permission) obj;
        if (this.mExecute == permission.mExecute && this.mRead == permission.mRead && this.mWrite == permission.mWrite) {
            return true;
        }
        return false;
    }

    public Permission(boolean z, boolean z2, boolean z3) {
        this.mRead = z;
        this.mWrite = z2;
        this.mExecute = z3;
    }
}
