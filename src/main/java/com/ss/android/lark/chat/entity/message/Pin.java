package com.ss.android.lark.chat.entity.message;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;

public class Pin implements AbstractC26248b<Pin>, Serializable {
    private transient boolean hasRead;
    private String id;
    private String operatorDefaultName;
    private volatile String operatorDisplayName;
    private String operatorId;
    private long timeStamp;

    public String getId() {
        return this.id;
    }

    public String getOperatorDefaultName() {
        return this.operatorDefaultName;
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

    public void setOperatorDefaultName(String str) {
        this.operatorDefaultName = str;
    }

    public void setOperatorDisplayName(String str) {
        this.operatorDisplayName = str;
    }

    public void setTimeStamp(int i) {
        this.timeStamp = (long) i;
    }

    public boolean isItemSame(Pin pin) {
        return this.id.equals(pin.getId());
    }

    public boolean isContentSame(Pin pin) {
        if (this.timeStamp == pin.getTimeStamp() && this.operatorId.equals(pin.getOperatorId())) {
            return true;
        }
        return false;
    }

    public Pin(String str, String str2, String str3, String str4, long j) {
        this.id = str;
        this.operatorId = str2;
        this.operatorDisplayName = str3;
        this.operatorDefaultName = str4;
        this.timeStamp = j;
    }
}
