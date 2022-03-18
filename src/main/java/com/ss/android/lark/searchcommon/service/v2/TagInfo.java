package com.ss.android.lark.searchcommon.service.v2;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/TagInfo;", "", "contentWithoutTag", "", "tagContentList", "", "Lcom/ss/android/lark/searchcommon/service/v2/TagContent;", "(Ljava/lang/String;Ljava/util/List;)V", "getContentWithoutTag", "()Ljava/lang/String;", "getTagContentList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.f */
public final class TagInfo {

    /* renamed from: a */
    private final String f133246a;

    /* renamed from: b */
    private final List<TagContent> f133247b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagInfo)) {
            return false;
        }
        TagInfo fVar = (TagInfo) obj;
        return Intrinsics.areEqual(this.f133246a, fVar.f133246a) && Intrinsics.areEqual(this.f133247b, fVar.f133247b);
    }

    public int hashCode() {
        String str = this.f133246a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<TagContent> list = this.f133247b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "TagInfo(contentWithoutTag=" + this.f133246a + ", tagContentList=" + this.f133247b + ")";
    }

    /* renamed from: a */
    public final String mo184354a() {
        return this.f133246a;
    }

    /* renamed from: b */
    public final List<TagContent> mo184355b() {
        return this.f133247b;
    }

    public TagInfo(String str, List<TagContent> list) {
        Intrinsics.checkParameterIsNotNull(str, "contentWithoutTag");
        Intrinsics.checkParameterIsNotNull(list, "tagContentList");
        this.f133246a = str;
        this.f133247b = list;
    }
}
