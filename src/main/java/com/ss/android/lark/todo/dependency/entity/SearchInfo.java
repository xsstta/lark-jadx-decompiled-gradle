package com.ss.android.lark.todo.dependency.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/todo/dependency/entity/SearchInfo;", "", "title", "", "desc", "id", "avatarKey", "isCrossTenant", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAvatarKey", "()Ljava/lang/String;", "getDesc", "getId", "()Z", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.dependency.entity.b */
public final class SearchInfo {

    /* renamed from: a */
    private final String f139249a;

    /* renamed from: b */
    private final String f139250b;

    /* renamed from: c */
    private final String f139251c;

    /* renamed from: d */
    private final String f139252d;

    /* renamed from: e */
    private final boolean f139253e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchInfo)) {
            return false;
        }
        SearchInfo bVar = (SearchInfo) obj;
        return Intrinsics.areEqual(this.f139249a, bVar.f139249a) && Intrinsics.areEqual(this.f139250b, bVar.f139250b) && Intrinsics.areEqual(this.f139251c, bVar.f139251c) && Intrinsics.areEqual(this.f139252d, bVar.f139252d) && this.f139253e == bVar.f139253e;
    }

    public int hashCode() {
        String str = this.f139249a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f139250b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f139251c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f139252d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f139253e;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "SearchInfo(title=" + this.f139249a + ", desc=" + this.f139250b + ", id=" + this.f139251c + ", avatarKey=" + this.f139252d + ", isCrossTenant=" + this.f139253e + ")";
    }

    /* renamed from: a */
    public final String mo191752a() {
        return this.f139249a;
    }

    /* renamed from: b */
    public final String mo191753b() {
        return this.f139250b;
    }

    /* renamed from: c */
    public final String mo191754c() {
        return this.f139251c;
    }

    /* renamed from: d */
    public final String mo191755d() {
        return this.f139252d;
    }

    /* renamed from: e */
    public final boolean mo191756e() {
        return this.f139253e;
    }

    public SearchInfo(String str, String str2, String str3, String str4, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "desc");
        Intrinsics.checkParameterIsNotNull(str3, "id");
        Intrinsics.checkParameterIsNotNull(str4, "avatarKey");
        this.f139249a = str;
        this.f139250b = str2;
        this.f139251c = str3;
        this.f139252d = str4;
        this.f139253e = z;
    }
}
