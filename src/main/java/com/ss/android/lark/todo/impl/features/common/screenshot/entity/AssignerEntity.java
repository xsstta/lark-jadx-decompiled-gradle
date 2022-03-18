package com.ss.android.lark.todo.impl.features.common.screenshot.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/screenshot/entity/AssignerEntity;", "", "user_id", "", "(Ljava/lang/String;)V", "getUser_id", "()Ljava/lang/String;", "setUser_id", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.c.a.a */
public final class AssignerEntity {

    /* renamed from: a */
    private String f139374a;

    public AssignerEntity() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AssignerEntity) && Intrinsics.areEqual(this.f139374a, ((AssignerEntity) obj).f139374a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f139374a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AssignerEntity(user_id=" + this.f139374a + ")";
    }

    public AssignerEntity(String str) {
        this.f139374a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AssignerEntity(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
