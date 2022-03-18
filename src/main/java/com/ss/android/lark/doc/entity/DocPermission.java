package com.ss.android.lark.doc.entity;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.doc.entity.DocPermPair;
import java.io.Serializable;

public class DocPermission implements Serializable {
    @JSONField(name = "set")
    private boolean isSet;
    private int permCode;
    private String permName;

    public int getPermCode() {
        return this.permCode;
    }

    public boolean isSet() {
        return this.isSet;
    }

    public boolean canEdit() {
        if ((this.permCode & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean canRead() {
        if ((this.permCode & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean canShare() {
        if ((this.permCode & 8) != 0) {
            return true;
        }
        return false;
    }

    public int getPermTypeNum() {
        int i = this.permCode;
        if ((i & 4) != 0) {
            return DocPermPair.PermType.EDIT.getNumber();
        }
        if ((i & 1) != 0) {
            return DocPermPair.PermType.READ.getNumber();
        }
        return DocPermPair.PermType.UNKNOWN.getNumber();
    }

    public int hashCode() {
        int i;
        int i2 = this.permCode * 31;
        String str = this.permName;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((i2 + i) * 31) + (this.isSet ? 1 : 0);
    }

    public void setIsSet(boolean z) {
        this.isSet = z;
    }

    public void setPermCode(int i) {
        this.permCode = i;
    }

    public void setPermName(String str) {
        this.permName = str;
    }

    public void setEdit(boolean z) {
        int i;
        if (z) {
            i = this.permCode | 4;
        } else {
            i = this.permCode & -5;
        }
        this.permCode = i;
        this.permCode = i;
    }

    public void setRead(boolean z) {
        int i;
        if (z) {
            i = this.permCode | 1;
        } else {
            i = this.permCode & -2;
        }
        this.permCode = i;
        this.permCode = i;
    }

    public void setShare(boolean z) {
        int i;
        if (z) {
            i = this.permCode | 8;
        } else {
            i = this.permCode & -9;
        }
        this.permCode = i;
        this.permCode = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocPermission docPermission = (DocPermission) obj;
        if (this.permCode == docPermission.permCode && this.isSet == docPermission.isSet) {
            return TextUtils.equals(this.permName, docPermission.permName);
        }
        return false;
    }
}
