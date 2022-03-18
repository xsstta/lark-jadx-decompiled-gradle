package com.ss.android.lark.todo.impl.features.detail.comment;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CreatorInfo;", "", "name", "", "createTime", "", "(Ljava/lang/String;J)V", "getCreateTime", "()J", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.y */
public final class CreatorInfo {

    /* renamed from: a */
    private final String f139905a;

    /* renamed from: b */
    private final long f139906b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatorInfo)) {
            return false;
        }
        CreatorInfo yVar = (CreatorInfo) obj;
        return Intrinsics.areEqual(this.f139905a, yVar.f139905a) && this.f139906b == yVar.f139906b;
    }

    public int hashCode() {
        String str = this.f139905a;
        return ((str != null ? str.hashCode() : 0) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f139906b);
    }

    public String toString() {
        return "CreatorInfo(name=" + this.f139905a + ", createTime=" + this.f139906b + ")";
    }

    /* renamed from: a */
    public final String mo192498a() {
        return this.f139905a;
    }

    /* renamed from: b */
    public final long mo192499b() {
        return this.f139906b;
    }

    public CreatorInfo(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.f139905a = str;
        this.f139906b = j;
    }
}
