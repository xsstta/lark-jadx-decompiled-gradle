package com.bytedance.ee.bear.lynx.impl.xbridge.method.storage;

import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/storage/StorageValue;", "", ShareHitPoint.f121869d, "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class StorageValue {
    @SerializedName(ShareHitPoint.f121869d)
    private final String type;
    @SerializedName("value")
    private final String value;

    public static /* synthetic */ StorageValue copy$default(StorageValue storageValue, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storageValue.type;
        }
        if ((i & 2) != 0) {
            str2 = storageValue.value;
        }
        return storageValue.copy(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.value;
    }

    public final StorageValue copy(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str2, "value");
        return new StorageValue(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageValue)) {
            return false;
        }
        StorageValue storageValue = (StorageValue) obj;
        return Intrinsics.areEqual(this.type, storageValue.type) && Intrinsics.areEqual(this.value, storageValue.value);
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "StorageValue(type=" + this.type + ", value=" + this.value + ")";
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public StorageValue(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str2, "value");
        this.type = str;
        this.value = str2;
    }
}
