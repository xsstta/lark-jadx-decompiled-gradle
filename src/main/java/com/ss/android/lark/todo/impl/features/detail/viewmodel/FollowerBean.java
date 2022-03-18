package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/FollowerBean;", "", "id", "", "name", "avatarKey", "deletable", "", "deleteQuitWarning", "showExternal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getAvatarKey", "()Ljava/lang/String;", "getDeletable", "()Z", "getDeleteQuitWarning", "getId", "getName", "getShowExternal", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.l */
public final class FollowerBean {

    /* renamed from: a */
    private final String f140180a;

    /* renamed from: b */
    private final String f140181b;

    /* renamed from: c */
    private final String f140182c;

    /* renamed from: d */
    private final boolean f140183d;

    /* renamed from: e */
    private final boolean f140184e;

    /* renamed from: f */
    private final boolean f140185f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowerBean)) {
            return false;
        }
        FollowerBean lVar = (FollowerBean) obj;
        return Intrinsics.areEqual(this.f140180a, lVar.f140180a) && Intrinsics.areEqual(this.f140181b, lVar.f140181b) && Intrinsics.areEqual(this.f140182c, lVar.f140182c) && this.f140183d == lVar.f140183d && this.f140184e == lVar.f140184e && this.f140185f == lVar.f140185f;
    }

    public int hashCode() {
        String str = this.f140180a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f140181b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f140182c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f140183d;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.f140184e;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f140185f;
        if (!z3) {
            i3 = z3 ? 1 : 0;
        }
        return i11 + i3;
    }

    public String toString() {
        return "FollowerBean(id=" + this.f140180a + ", name=" + this.f140181b + ", avatarKey=" + this.f140182c + ", deletable=" + this.f140183d + ", deleteQuitWarning=" + this.f140184e + ", showExternal=" + this.f140185f + ")";
    }

    /* renamed from: a */
    public final String mo193018a() {
        return this.f140180a;
    }

    /* renamed from: b */
    public final String mo193019b() {
        return this.f140181b;
    }

    /* renamed from: c */
    public final String mo193020c() {
        return this.f140182c;
    }

    /* renamed from: d */
    public final boolean mo193021d() {
        return this.f140183d;
    }

    /* renamed from: e */
    public final boolean mo193022e() {
        return this.f140184e;
    }

    /* renamed from: f */
    public final boolean mo193024f() {
        return this.f140185f;
    }

    public FollowerBean(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "avatarKey");
        this.f140180a = str;
        this.f140181b = str2;
        this.f140182c = str3;
        this.f140183d = z;
        this.f140184e = z2;
        this.f140185f = z3;
    }
}
