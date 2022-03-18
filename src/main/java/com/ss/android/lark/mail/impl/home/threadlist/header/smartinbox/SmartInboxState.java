package com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox;

import com.larksuite.arch.jack.State;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.b */
public final class SmartInboxState implements State {

    /* renamed from: a */
    private final boolean f108615a;

    /* renamed from: b */
    private final int f108616b;

    /* renamed from: c */
    private final String f108617c;

    /* renamed from: d */
    private final String f108618d;

    /* renamed from: a */
    public static /* synthetic */ SmartInboxState m170176a(SmartInboxState bVar, boolean z, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = bVar.f108615a;
        }
        if ((i2 & 2) != 0) {
            i = bVar.f108616b;
        }
        if ((i2 & 4) != 0) {
            str = bVar.f108617c;
        }
        if ((i2 & 8) != 0) {
            str2 = bVar.f108618d;
        }
        return bVar.mo153342a(z, i, str, str2);
    }

    /* renamed from: a */
    public final SmartInboxState mo153342a(boolean z, int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "fromText");
        Intrinsics.checkParameterIsNotNull(str2, "currentLabel");
        return new SmartInboxState(z, i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartInboxState)) {
            return false;
        }
        SmartInboxState bVar = (SmartInboxState) obj;
        return this.f108615a == bVar.f108615a && this.f108616b == bVar.f108616b && Intrinsics.areEqual(this.f108617c, bVar.f108617c) && Intrinsics.areEqual(this.f108618d, bVar.f108618d);
    }

    public int hashCode() {
        boolean z = this.f108615a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = ((i * 31) + this.f108616b) * 31;
        String str = this.f108617c;
        int i5 = 0;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f108618d;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return hashCode + i5;
    }

    public String toString() {
        return "SmartInboxState(show=" + this.f108615a + ", type=" + this.f108616b + ", fromText=" + this.f108617c + ", currentLabel=" + this.f108618d + ")";
    }

    /* renamed from: a */
    public final boolean mo153343a() {
        return this.f108615a;
    }

    /* renamed from: b */
    public final int mo153344b() {
        return this.f108616b;
    }

    /* renamed from: c */
    public final String mo153345c() {
        return this.f108617c;
    }

    /* renamed from: d */
    public final String mo153346d() {
        return this.f108618d;
    }

    public SmartInboxState(boolean z, int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "fromText");
        Intrinsics.checkParameterIsNotNull(str2, "currentLabel");
        this.f108615a = z;
        this.f108616b = i;
        this.f108617c = str;
        this.f108618d = str2;
    }
}
