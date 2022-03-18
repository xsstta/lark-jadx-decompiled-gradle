package com.ss.android.lark.todo.impl.features.detail.comment;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentAtUserInfo;", "", "userId", "", "userName", "isOutChat", "", "position", "", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "()Z", "getPosition", "()I", "getUserId", "()Ljava/lang/String;", "getUserName", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.c */
public final class CommentAtUserInfo {

    /* renamed from: a */
    private final String f139796a;

    /* renamed from: b */
    private final String f139797b;

    /* renamed from: c */
    private final boolean f139798c;

    /* renamed from: d */
    private final int f139799d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentAtUserInfo)) {
            return false;
        }
        CommentAtUserInfo cVar = (CommentAtUserInfo) obj;
        return Intrinsics.areEqual(this.f139796a, cVar.f139796a) && Intrinsics.areEqual(this.f139797b, cVar.f139797b) && this.f139798c == cVar.f139798c && this.f139799d == cVar.f139799d;
    }

    public int hashCode() {
        String str = this.f139796a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f139797b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f139798c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return ((i2 + i3) * 31) + this.f139799d;
    }

    public String toString() {
        return "CommentAtUserInfo(userId=" + this.f139796a + ", userName=" + this.f139797b + ", isOutChat=" + this.f139798c + ", position=" + this.f139799d + ")";
    }

    /* renamed from: a */
    public final String mo192368a() {
        return this.f139796a;
    }

    /* renamed from: b */
    public final String mo192369b() {
        return this.f139797b;
    }

    /* renamed from: c */
    public final boolean mo192370c() {
        return this.f139798c;
    }

    /* renamed from: d */
    public final int mo192371d() {
        return this.f139799d;
    }

    public CommentAtUserInfo(String str, String str2, boolean z, int i) {
        this.f139796a = str;
        this.f139797b = str2;
        this.f139798c = z;
        this.f139799d = i;
    }
}
