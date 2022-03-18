package com.ss.android.lark.search.redesign.viewmodel;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.searchcommon.dto.Scene;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/search/redesign/viewmodel/TabType;", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "entrySource", "", "(Lcom/ss/android/lark/searchcommon/dto/Scene$Type;Ljava/lang/String;)V", "getEntrySource", "()Ljava/lang/String;", "getType", "()Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.b.c */
public final class TabType {

    /* renamed from: a */
    private final Scene.Type f132595a;

    /* renamed from: b */
    private final String f132596b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabType)) {
            return false;
        }
        TabType cVar = (TabType) obj;
        return Intrinsics.areEqual(this.f132595a, cVar.f132595a) && Intrinsics.areEqual(this.f132596b, cVar.f132596b);
    }

    public int hashCode() {
        Scene.Type type = this.f132595a;
        int i = 0;
        int hashCode = (type != null ? type.hashCode() : 0) * 31;
        String str = this.f132596b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "TabType(type=" + this.f132595a + ", entrySource=" + this.f132596b + ")";
    }

    /* renamed from: a */
    public final Scene.Type mo183215a() {
        return this.f132595a;
    }

    /* renamed from: b */
    public final String mo183216b() {
        return this.f132596b;
    }

    public TabType(Scene.Type type, String str) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str, "entrySource");
        this.f132595a = type;
        this.f132596b = str;
    }
}
