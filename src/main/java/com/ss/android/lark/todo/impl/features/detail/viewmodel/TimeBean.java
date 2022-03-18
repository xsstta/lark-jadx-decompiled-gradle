package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import com.larksuite.framework.section.IActionData;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeBean;", "Lcom/larksuite/framework/section/IActionData;", "dueTimeMillis", "", "isAllDay", "", "reminderRelativeTime", "", "(JZI)V", "getDueTimeMillis", "()J", "()Z", "getReminderRelativeTime", "()I", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.z */
public final class TimeBean implements IActionData {

    /* renamed from: a */
    private final long f140205a;

    /* renamed from: b */
    private final boolean f140206b;

    /* renamed from: c */
    private final int f140207c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeBean)) {
            return false;
        }
        TimeBean zVar = (TimeBean) obj;
        return this.f140205a == zVar.f140205a && this.f140206b == zVar.f140206b && this.f140207c == zVar.f140207c;
    }

    public int hashCode() {
        int hashCode = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f140205a) * 31;
        boolean z = this.f140206b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return ((hashCode + i) * 31) + this.f140207c;
    }

    public String toString() {
        return "TimeBean(dueTimeMillis=" + this.f140205a + ", isAllDay=" + this.f140206b + ", reminderRelativeTime=" + this.f140207c + ")";
    }

    /* renamed from: a */
    public final long mo193075a() {
        return this.f140205a;
    }

    /* renamed from: b */
    public final boolean mo193076b() {
        return this.f140206b;
    }

    /* renamed from: c */
    public final int mo193077c() {
        return this.f140207c;
    }

    public TimeBean(long j, boolean z, int i) {
        this.f140205a = j;
        this.f140206b = z;
        this.f140207c = i;
    }
}
