package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

import java.io.Serializable;

public class AID implements Serializable, Comparable<AID> {
    private static final long serialVersionUID = 5603819450513225452L;
    private final int mId;
    private final String mName;

    public int getId() {
        return this.mId;
    }

    public String getName() {
        return this.mName;
    }

    public int hashCode() {
        int i;
        int i2 = (this.mId + 31) * 31;
        String str = this.mName;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "AID [id=" + this.mId + ", name=" + this.mName + "]";
    }

    public int compareTo(AID aid) {
        int i = this.mId;
        int i2 = aid.mId;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        if (i == -1) {
            return this.mName.compareTo(aid.mName);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AID aid = (AID) obj;
        if (this.mId != aid.mId) {
            return false;
        }
        String str = this.mName;
        if (str == null) {
            if (aid.mName != null) {
                return false;
            }
        } else if (!str.equals(aid.mName)) {
            return false;
        }
        return true;
    }

    public AID(int i, String str) {
        this.mId = i;
        this.mName = str;
    }
}
