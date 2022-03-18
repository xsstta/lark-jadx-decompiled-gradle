package com.ss.android.lark.searchcommon.reporter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/searchcommon/reporter/NewOnScreenItem;", "", "entityId", "", "resultType", "tag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEntityId", "()Ljava/lang/String;", "getResultType", "getTag", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.d.c */
public final class NewOnScreenItem {

    /* renamed from: a */
    private final String f133148a;

    /* renamed from: b */
    private final String f133149b;

    /* renamed from: c */
    private final String f133150c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewOnScreenItem)) {
            return false;
        }
        NewOnScreenItem cVar = (NewOnScreenItem) obj;
        return Intrinsics.areEqual(this.f133148a, cVar.f133148a) && Intrinsics.areEqual(this.f133149b, cVar.f133149b) && Intrinsics.areEqual(this.f133150c, cVar.f133150c);
    }

    public int hashCode() {
        String str = this.f133148a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f133149b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f133150c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "NewOnScreenItem(entityId=" + this.f133148a + ", resultType=" + this.f133149b + ", tag=" + this.f133150c + ")";
    }

    /* renamed from: a */
    public final String mo183807a() {
        return this.f133148a;
    }

    /* renamed from: b */
    public final String mo183808b() {
        return this.f133149b;
    }

    /* renamed from: c */
    public final String mo183809c() {
        return this.f133150c;
    }

    public NewOnScreenItem(String str, String str2, String str3) {
        this.f133148a = str;
        this.f133149b = str2;
        this.f133150c = str3;
    }
}
