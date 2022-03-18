package com.ss.android.lark.contact.impl.viewdata;

import java.io.Serializable;

public class ContactViewDataWrapper implements Serializable {
    private int type;
    private C36077a viewData;

    public int getType() {
        return this.type;
    }

    public C36077a getViewData() {
        return this.viewData;
    }

    public int hashCode() {
        int i;
        int i2 = this.type * 31;
        C36077a aVar = this.viewData;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setViewData(C36077a aVar) {
        this.viewData = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactViewDataWrapper)) {
            return false;
        }
        ContactViewDataWrapper contactViewDataWrapper = (ContactViewDataWrapper) obj;
        if (this.type != contactViewDataWrapper.type) {
            return false;
        }
        C36077a aVar = this.viewData;
        C36077a aVar2 = contactViewDataWrapper.viewData;
        if (aVar != null) {
            return aVar.equals(aVar2);
        }
        if (aVar2 == null) {
            return true;
        }
        return false;
    }

    public ContactViewDataWrapper(int i, C36077a aVar) {
        this.type = i;
        this.viewData = aVar;
    }
}
