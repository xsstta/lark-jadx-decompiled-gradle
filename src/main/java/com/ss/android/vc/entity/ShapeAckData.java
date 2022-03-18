package com.ss.android.vc.entity;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/entity/ShapeAckData;", "Ljava/io/Serializable;", "shareId", "", "(Ljava/lang/String;)V", "getShareId", "()Ljava/lang/String;", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ShapeAckData implements Serializable {
    private final String shareId;

    public final String getShareId() {
        return this.shareId;
    }

    public String toString() {
        return "ShapeAckData{shareId=" + this.shareId;
    }

    public ShapeAckData(String str) {
        Intrinsics.checkParameterIsNotNull(str, "shareId");
        this.shareId = str;
    }
}
