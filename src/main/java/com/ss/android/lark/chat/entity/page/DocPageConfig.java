package com.ss.android.lark.chat.entity.page;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chat/entity/page/DocPageConfig;", "", "disableLandSpace", "", "hideBackIcon", "hideMessageIcon", "hideMoreIcon", "hideShareIcon", "hideTitle", "hideTitleBar", "(ZZZZZZZ)V", "getDisableLandSpace", "()Z", "getHideBackIcon", "getHideMessageIcon", "getHideMoreIcon", "getHideShareIcon", "getHideTitle", "getHideTitleBar", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.entity.d.a */
public final class DocPageConfig {

    /* renamed from: a */
    private final boolean f87780a;

    /* renamed from: b */
    private final boolean f87781b;

    /* renamed from: c */
    private final boolean f87782c;

    /* renamed from: d */
    private final boolean f87783d;

    /* renamed from: e */
    private final boolean f87784e;

    /* renamed from: f */
    private final boolean f87785f;

    /* renamed from: g */
    private final boolean f87786g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocPageConfig)) {
            return false;
        }
        DocPageConfig aVar = (DocPageConfig) obj;
        return this.f87780a == aVar.f87780a && this.f87781b == aVar.f87781b && this.f87782c == aVar.f87782c && this.f87783d == aVar.f87783d && this.f87784e == aVar.f87784e && this.f87785f == aVar.f87785f && this.f87786g == aVar.f87786g;
    }

    public int hashCode() {
        boolean z = this.f87780a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f87781b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.f87782c;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        boolean z4 = this.f87783d;
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (i13 + i14) * 31;
        boolean z5 = this.f87784e;
        if (z5) {
            z5 = true;
        }
        int i18 = z5 ? 1 : 0;
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = (i17 + i18) * 31;
        boolean z6 = this.f87785f;
        if (z6) {
            z6 = true;
        }
        int i22 = z6 ? 1 : 0;
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = (i21 + i22) * 31;
        boolean z7 = this.f87786g;
        if (!z7) {
            i = z7 ? 1 : 0;
        }
        return i25 + i;
    }

    public String toString() {
        return "DocPageConfig(disableLandSpace=" + this.f87780a + ", hideBackIcon=" + this.f87781b + ", hideMessageIcon=" + this.f87782c + ", hideMoreIcon=" + this.f87783d + ", hideShareIcon=" + this.f87784e + ", hideTitle=" + this.f87785f + ", hideTitleBar=" + this.f87786g + ")";
    }

    /* renamed from: a */
    public final boolean mo124900a() {
        return this.f87780a;
    }

    /* renamed from: b */
    public final boolean mo124901b() {
        return this.f87781b;
    }

    /* renamed from: c */
    public final boolean mo124902c() {
        return this.f87782c;
    }

    /* renamed from: d */
    public final boolean mo124903d() {
        return this.f87783d;
    }

    /* renamed from: e */
    public final boolean mo124904e() {
        return this.f87784e;
    }

    /* renamed from: f */
    public final boolean mo124906f() {
        return this.f87785f;
    }

    /* renamed from: g */
    public final boolean mo124907g() {
        return this.f87786g;
    }

    public DocPageConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f87780a = z;
        this.f87781b = z2;
        this.f87782c = z3;
        this.f87783d = z4;
        this.f87784e = z5;
        this.f87785f = z6;
        this.f87786g = z7;
    }
}
