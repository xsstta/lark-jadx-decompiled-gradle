package com.ss.android.lark.searchcommon.service.v2;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/TagContent;", "", "tag", "", "content", "Lcom/ss/android/lark/searchcommon/service/v2/Content;", "attributeMap", "", "(Ljava/lang/String;Lcom/ss/android/lark/searchcommon/service/v2/Content;Ljava/util/Map;)V", "getAttributeMap", "()Ljava/util/Map;", "getContent", "()Lcom/ss/android/lark/searchcommon/service/v2/Content;", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.e */
public final class TagContent {

    /* renamed from: a */
    private final String f133243a;

    /* renamed from: b */
    private final Content f133244b;

    /* renamed from: c */
    private final Map<String, String> f133245c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagContent)) {
            return false;
        }
        TagContent eVar = (TagContent) obj;
        return Intrinsics.areEqual(this.f133243a, eVar.f133243a) && Intrinsics.areEqual(this.f133244b, eVar.f133244b) && Intrinsics.areEqual(this.f133245c, eVar.f133245c);
    }

    public int hashCode() {
        String str = this.f133243a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Content aVar = this.f133244b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Map<String, String> map = this.f133245c;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TagContent(tag=" + this.f133243a + ", content=" + this.f133244b + ", attributeMap=" + this.f133245c + ")";
    }

    /* renamed from: a */
    public final String mo184348a() {
        return this.f133243a;
    }

    /* renamed from: b */
    public final Content mo184349b() {
        return this.f133244b;
    }

    /* renamed from: c */
    public final Map<String, String> mo184350c() {
        return this.f133245c;
    }

    public TagContent(String str, Content aVar, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(aVar, "content");
        Intrinsics.checkParameterIsNotNull(map, "attributeMap");
        this.f133243a = str;
        this.f133244b = aVar;
        this.f133245c = map;
    }
}
