package com.ss.android.lark.calendar.impl.features.events.edit.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/data/DescriptionSaveData;", "", "textDescription", "", "docsDescription", "htmlDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDocsDescription", "()Ljava/lang/String;", "setDocsDescription", "(Ljava/lang/String;)V", "getHtmlDescription", "setHtmlDescription", "getTextDescription", "setTextDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.data.a */
public final class DescriptionSaveData {

    /* renamed from: a */
    private String f80191a;

    /* renamed from: b */
    private String f80192b;

    /* renamed from: c */
    private String f80193c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescriptionSaveData)) {
            return false;
        }
        DescriptionSaveData aVar = (DescriptionSaveData) obj;
        return Intrinsics.areEqual(this.f80191a, aVar.f80191a) && Intrinsics.areEqual(this.f80192b, aVar.f80192b) && Intrinsics.areEqual(this.f80193c, aVar.f80193c);
    }

    public int hashCode() {
        String str = this.f80191a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f80192b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f80193c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "DescriptionSaveData(textDescription=" + this.f80191a + ", docsDescription=" + this.f80192b + ", htmlDescription=" + this.f80193c + ")";
    }

    /* renamed from: a */
    public final String mo115067a() {
        return this.f80191a;
    }

    /* renamed from: b */
    public final String mo115068b() {
        return this.f80192b;
    }

    /* renamed from: c */
    public final String mo115069c() {
        return this.f80193c;
    }

    public DescriptionSaveData(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "textDescription");
        Intrinsics.checkParameterIsNotNull(str2, "docsDescription");
        Intrinsics.checkParameterIsNotNull(str3, "htmlDescription");
        this.f80191a = str;
        this.f80192b = str2;
        this.f80193c = str3;
    }
}
