package com.ss.android.lark.todo.dependency.entity;

import com.ss.android.lark.notification.export.entity.Notice;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006!"}, d2 = {"Lcom/ss/android/lark/todo/dependency/entity/TodoNotice;", "Lcom/ss/android/lark/notification/export/entity/Notice;", "guid", "", "summary", "dueTime", "", "dueTimezone", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getDueTime", "()J", "setDueTime", "(J)V", "getDueTimezone", "()Ljava/lang/String;", "setDueTimezone", "(Ljava/lang/String;)V", "getGuid", "setGuid", "getSummary", "setSummary", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoNotice extends Notice {
    private long dueTime;
    private String dueTimezone;
    private String guid;
    private String summary;

    public static /* synthetic */ TodoNotice copy$default(TodoNotice todoNotice, String str, String str2, long j, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = todoNotice.guid;
        }
        if ((i & 2) != 0) {
            str2 = todoNotice.summary;
        }
        if ((i & 4) != 0) {
            j = todoNotice.dueTime;
        }
        if ((i & 8) != 0) {
            str3 = todoNotice.dueTimezone;
        }
        return todoNotice.copy(str, str2, j, str3);
    }

    public final String component1() {
        return this.guid;
    }

    public final String component2() {
        return this.summary;
    }

    public final long component3() {
        return this.dueTime;
    }

    public final String component4() {
        return this.dueTimezone;
    }

    public final TodoNotice copy(String str, String str2, long j, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        Intrinsics.checkParameterIsNotNull(str2, "summary");
        Intrinsics.checkParameterIsNotNull(str3, "dueTimezone");
        return new TodoNotice(str, str2, j, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodoNotice)) {
            return false;
        }
        TodoNotice todoNotice = (TodoNotice) obj;
        return Intrinsics.areEqual(this.guid, todoNotice.guid) && Intrinsics.areEqual(this.summary, todoNotice.summary) && this.dueTime == todoNotice.dueTime && Intrinsics.areEqual(this.dueTimezone, todoNotice.dueTimezone);
    }

    public int hashCode() {
        String str = this.guid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.summary;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.dueTime)) * 31;
        String str3 = this.dueTimezone;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TodoNotice(guid=" + this.guid + ", summary=" + this.summary + ", dueTime=" + this.dueTime + ", dueTimezone=" + this.dueTimezone + ")";
    }

    public final long getDueTime() {
        return this.dueTime;
    }

    public final String getDueTimezone() {
        return this.dueTimezone;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final void setDueTime(long j) {
        this.dueTime = j;
    }

    public final void setDueTimezone(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.dueTimezone = str;
    }

    public final void setGuid(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.guid = str;
    }

    public final void setSummary(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.summary = str;
    }

    public TodoNotice(String str, String str2, long j, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "guid");
        Intrinsics.checkParameterIsNotNull(str2, "summary");
        Intrinsics.checkParameterIsNotNull(str3, "dueTimezone");
        this.guid = str;
        this.summary = str2;
        this.dueTime = j;
        this.dueTimezone = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TodoNotice(java.lang.String r8, java.lang.String r9, long r10, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r14 = r13 & 1
            java.lang.String r0 = ""
            if (r14 == 0) goto L_0x0008
            r2 = r0
            goto L_0x0009
        L_0x0008:
            r2 = r8
        L_0x0009:
            r8 = r13 & 2
            if (r8 == 0) goto L_0x000f
            r3 = r0
            goto L_0x0010
        L_0x000f:
            r3 = r9
        L_0x0010:
            r8 = r13 & 8
            if (r8 == 0) goto L_0x0016
            r6 = r0
            goto L_0x0017
        L_0x0016:
            r6 = r12
        L_0x0017:
            r1 = r7
            r4 = r10
            r1.<init>(r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.dependency.entity.TodoNotice.<init>(java.lang.String, java.lang.String, long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
