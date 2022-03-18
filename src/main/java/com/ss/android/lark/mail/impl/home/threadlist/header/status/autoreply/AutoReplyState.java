package com.ss.android.lark.mail.impl.home.threadlist.header.status.autoreply;

import com.larksuite.arch.jack.State;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyState;", "Lcom/larksuite/arch/jack/State;", "enable", "", "startTimeStamp", "", "endTimeStamp", "isMultiSelect", "(ZJJZ)V", "getEnable", "()Z", "getEndTimeStamp", "()J", "getStartTimeStamp", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.a.a */
public final class AutoReplyState implements State {

    /* renamed from: a */
    private final boolean f108538a;

    /* renamed from: b */
    private final long f108539b;

    /* renamed from: c */
    private final long f108540c;

    /* renamed from: d */
    private final boolean f108541d;

    /* renamed from: a */
    public static /* synthetic */ AutoReplyState m170077a(AutoReplyState aVar, boolean z, long j, long j2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f108538a;
        }
        if ((i & 2) != 0) {
            j = aVar.f108539b;
        }
        if ((i & 4) != 0) {
            j2 = aVar.f108540c;
        }
        if ((i & 8) != 0) {
            z2 = aVar.f108541d;
        }
        return aVar.mo153244a(z, j, j2, z2);
    }

    /* renamed from: a */
    public final AutoReplyState mo153244a(boolean z, long j, long j2, boolean z2) {
        return new AutoReplyState(z, j, j2, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoReplyState)) {
            return false;
        }
        AutoReplyState aVar = (AutoReplyState) obj;
        return this.f108538a == aVar.f108538a && this.f108539b == aVar.f108539b && this.f108540c == aVar.f108540c && this.f108541d == aVar.f108541d;
    }

    public int hashCode() {
        boolean z = this.f108538a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        long j = this.f108539b;
        long j2 = this.f108540c;
        int i5 = ((((i2 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z2 = this.f108541d;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i5 + i;
    }

    public String toString() {
        return "AutoReplyState(enable=" + this.f108538a + ", startTimeStamp=" + this.f108539b + ", endTimeStamp=" + this.f108540c + ", isMultiSelect=" + this.f108541d + ")";
    }

    /* renamed from: a */
    public final boolean mo153245a() {
        return this.f108538a;
    }

    /* renamed from: b */
    public final long mo153246b() {
        return this.f108539b;
    }

    /* renamed from: c */
    public final long mo153247c() {
        return this.f108540c;
    }

    /* renamed from: d */
    public final boolean mo153248d() {
        return this.f108541d;
    }

    public AutoReplyState(boolean z, long j, long j2, boolean z2) {
        this.f108538a = z;
        this.f108539b = j;
        this.f108540c = j2;
        this.f108541d = z2;
    }
}
