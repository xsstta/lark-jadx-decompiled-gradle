package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\""}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "", "id", "", "name", "avatarKey", "deleteState", "", "deleteQuitWarning", "", "showExternal", "isComplete", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZ)V", "getAvatarKey", "()Ljava/lang/String;", "getDeleteQuitWarning", "()Z", "getDeleteState", "()I", "getId", "getName", "getShowExternal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.a */
public final class AssigneeBean {

    /* renamed from: a */
    private final String f140128a;

    /* renamed from: b */
    private final String f140129b;

    /* renamed from: c */
    private final String f140130c;

    /* renamed from: d */
    private final int f140131d;

    /* renamed from: e */
    private final boolean f140132e;

    /* renamed from: f */
    private final boolean f140133f;

    /* renamed from: g */
    private final boolean f140134g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssigneeBean)) {
            return false;
        }
        AssigneeBean aVar = (AssigneeBean) obj;
        return Intrinsics.areEqual(this.f140128a, aVar.f140128a) && Intrinsics.areEqual(this.f140129b, aVar.f140129b) && Intrinsics.areEqual(this.f140130c, aVar.f140130c) && this.f140131d == aVar.f140131d && this.f140132e == aVar.f140132e && this.f140133f == aVar.f140133f && this.f140134g == aVar.f140134g;
    }

    public int hashCode() {
        String str = this.f140128a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f140129b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f140130c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (((hashCode2 + i) * 31) + this.f140131d) * 31;
        boolean z = this.f140132e;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.f140133f;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f140134g;
        if (!z3) {
            i3 = z3 ? 1 : 0;
        }
        return i11 + i3;
    }

    public String toString() {
        return "AssigneeBean(id=" + this.f140128a + ", name=" + this.f140129b + ", avatarKey=" + this.f140130c + ", deleteState=" + this.f140131d + ", deleteQuitWarning=" + this.f140132e + ", showExternal=" + this.f140133f + ", isComplete=" + this.f140134g + ")";
    }

    /* renamed from: a */
    public final String mo192757a() {
        return this.f140128a;
    }

    /* renamed from: b */
    public final String mo192758b() {
        return this.f140129b;
    }

    /* renamed from: c */
    public final String mo192759c() {
        return this.f140130c;
    }

    /* renamed from: d */
    public final int mo192760d() {
        return this.f140131d;
    }

    /* renamed from: e */
    public final boolean mo192761e() {
        return this.f140132e;
    }

    /* renamed from: f */
    public final boolean mo192763f() {
        return this.f140133f;
    }

    /* renamed from: g */
    public final boolean mo192764g() {
        return this.f140134g;
    }

    public AssigneeBean(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "avatarKey");
        this.f140128a = str;
        this.f140129b = str2;
        this.f140130c = str3;
        this.f140131d = i;
        this.f140132e = z;
        this.f140133f = z2;
        this.f140134g = z3;
    }
}
