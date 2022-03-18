package com.ss.android.lark.pin.impl.entity;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;

public class Pin implements AbstractC26248b<Pin>, Serializable {
    private transient boolean hasRead;
    private String id;
    private volatile String operatorDisplayName;
    private String operatorId;
    private long timeStamp;

    public String getId() {
        return this.id;
    }

    public String getOperatorDisplayName() {
        return this.operatorDisplayName;
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public boolean isHasRead() {
        return this.hasRead;
    }

    public String toString() {
        return "[timestamp = " + this.timeStamp + " , id = " + this.id + " ]";
    }

    public void setHasRead(boolean z) {
        this.hasRead = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setOperatorDisplayName(String str) {
        this.operatorDisplayName = str;
    }

    public void setTimeStamp(int i) {
        this.timeStamp = (long) i;
    }

    public boolean isItemSame(Pin pin) {
        if (pin == null) {
            return false;
        }
        return this.id.equals(pin.getId());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pin)) {
            return false;
        }
        return this.id.equals(((Pin) obj).id);
    }

    public boolean isContentSame(Pin pin) {
        if (pin != null && this.timeStamp == pin.getTimeStamp() && this.operatorId.equals(pin.getOperatorId())) {
            return true;
        }
        return false;
    }

    public Pin(String str, String str2, String str3, long j) {
        this.id = str;
        this.operatorId = str2;
        this.operatorDisplayName = str3;
        this.timeStamp = j;
    }
}
