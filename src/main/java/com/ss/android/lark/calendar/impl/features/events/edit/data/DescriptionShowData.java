package com.ss.android.lark.calendar.impl.features.events.edit.data;

import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/data/DescriptionShowData;", "", "showType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$DescriptionShowType;", "showStr", "", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$DescriptionShowType;Ljava/lang/String;)V", "getShowStr", "()Ljava/lang/String;", "setShowStr", "(Ljava/lang/String;)V", "getShowType", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$DescriptionShowType;", "setShowType", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$DescriptionShowType;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.data.b */
public final class DescriptionShowData {

    /* renamed from: a */
    private IEditContract.DescriptionShowType f80194a;

    /* renamed from: b */
    private String f80195b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescriptionShowData)) {
            return false;
        }
        DescriptionShowData bVar = (DescriptionShowData) obj;
        return Intrinsics.areEqual(this.f80194a, bVar.f80194a) && Intrinsics.areEqual(this.f80195b, bVar.f80195b);
    }

    public int hashCode() {
        IEditContract.DescriptionShowType descriptionShowType = this.f80194a;
        int i = 0;
        int hashCode = (descriptionShowType != null ? descriptionShowType.hashCode() : 0) * 31;
        String str = this.f80195b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "DescriptionShowData(showType=" + this.f80194a + ", showStr=" + this.f80195b + ")";
    }

    /* renamed from: a */
    public final IEditContract.DescriptionShowType mo115073a() {
        return this.f80194a;
    }

    /* renamed from: b */
    public final String mo115074b() {
        return this.f80195b;
    }

    public DescriptionShowData(IEditContract.DescriptionShowType descriptionShowType, String str) {
        Intrinsics.checkParameterIsNotNull(descriptionShowType, "showType");
        Intrinsics.checkParameterIsNotNull(str, "showStr");
        this.f80194a = descriptionShowType;
        this.f80195b = str;
    }
}
