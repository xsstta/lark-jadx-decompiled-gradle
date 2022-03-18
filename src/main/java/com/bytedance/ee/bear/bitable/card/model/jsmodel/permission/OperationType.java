package com.bytedance.ee.bear.bitable.card.model.jsmodel.permission;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/permission/OperationType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "ADDABLE", "DELETABLE", "EDITABLE", "MOVABLE", "VISIBLE", "COPYABLE", "PASTABLE", "CUTTABLE", "LOCKABLE", "LOCAL_EDITABLE", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum OperationType {
    ADDABLE("addable"),
    DELETABLE("deletable"),
    EDITABLE("editable"),
    MOVABLE("movable"),
    VISIBLE("visible"),
    COPYABLE("copyable"),
    PASTABLE("pastable"),
    CUTTABLE("cuttable"),
    LOCKABLE("lockable"),
    LOCAL_EDITABLE("localEditable");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    public String toString() {
        return this.value;
    }

    private OperationType(String str) {
        this.value = str;
    }
}
