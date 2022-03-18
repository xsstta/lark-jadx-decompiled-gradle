package com.ss.android.lark.diskmanage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/diskmanage/DefaultAutoCleanItem;", "", "path", "", "agoDays", "", "(Ljava/lang/String;I)V", "getAgoDays", "()I", "setAgoDays", "(I)V", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.diskmanage.b */
public final class DefaultAutoCleanItem {

    /* renamed from: a */
    private String f94576a;

    /* renamed from: b */
    private int f94577b;

    public DefaultAutoCleanItem() {
        this(null, 0, 3, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DefaultAutoCleanItem) {
                DefaultAutoCleanItem bVar = (DefaultAutoCleanItem) obj;
                if (Intrinsics.areEqual(this.f94576a, bVar.f94576a)) {
                    if (this.f94577b == bVar.f94577b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f94576a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f94577b;
    }

    public String toString() {
        return "DefaultAutoCleanItem(path=" + this.f94576a + ", agoDays=" + this.f94577b + ")";
    }

    /* renamed from: a */
    public final String mo135559a() {
        return this.f94576a;
    }

    /* renamed from: b */
    public final int mo135560b() {
        return this.f94577b;
    }

    public DefaultAutoCleanItem(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        this.f94576a = str;
        this.f94577b = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultAutoCleanItem(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
