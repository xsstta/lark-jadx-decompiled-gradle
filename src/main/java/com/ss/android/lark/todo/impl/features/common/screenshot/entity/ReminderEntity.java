package com.ss.android.lark.todo.impl.features.common.screenshot.entity;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/screenshot/entity/ReminderEntity;", "", ShareHitPoint.f121869d, "", "time", "", "(Ljava/lang/String;J)V", "getTime", "()J", "setTime", "(J)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.c.a.d */
public final class ReminderEntity {

    /* renamed from: a */
    private String f139378a;

    /* renamed from: b */
    private long f139379b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReminderEntity)) {
            return false;
        }
        ReminderEntity dVar = (ReminderEntity) obj;
        return Intrinsics.areEqual(this.f139378a, dVar.f139378a) && this.f139379b == dVar.f139379b;
    }

    public int hashCode() {
        String str = this.f139378a;
        return ((str != null ? str.hashCode() : 0) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f139379b);
    }

    public String toString() {
        return "ReminderEntity(type=" + this.f139378a + ", time=" + this.f139379b + ")";
    }

    public ReminderEntity(String str, long j) {
        this.f139378a = str;
        this.f139379b = j;
    }
}
