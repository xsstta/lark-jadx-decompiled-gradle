package com.ss.android.lark.chatsetting.impl.group.info.time;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeBean;", "", "text", "", ShareHitPoint.f121869d, "", "isSelected", "", "(Ljava/lang/String;IZ)V", "()Z", "setSelected", "(Z)V", "getText", "()Ljava/lang/String;", "getType", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.b */
public final class GroupShareTimeBean {

    /* renamed from: a */
    private final String f89508a;

    /* renamed from: b */
    private final int f89509b;

    /* renamed from: c */
    private boolean f89510c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupShareTimeBean)) {
            return false;
        }
        GroupShareTimeBean bVar = (GroupShareTimeBean) obj;
        return Intrinsics.areEqual(this.f89508a, bVar.f89508a) && this.f89509b == bVar.f89509b && this.f89510c == bVar.f89510c;
    }

    public int hashCode() {
        String str = this.f89508a;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f89509b) * 31;
        boolean z = this.f89510c;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "GroupShareTimeBean(text=" + this.f89508a + ", type=" + this.f89509b + ", isSelected=" + this.f89510c + ")";
    }

    /* renamed from: a */
    public final String mo128047a() {
        return this.f89508a;
    }

    /* renamed from: b */
    public final int mo128049b() {
        return this.f89509b;
    }

    /* renamed from: c */
    public final boolean mo128050c() {
        return this.f89510c;
    }

    /* renamed from: a */
    public final void mo128048a(boolean z) {
        this.f89510c = z;
    }

    public GroupShareTimeBean(String str, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.f89508a = str;
        this.f89509b = i;
        this.f89510c = z;
    }
}
