package com.ss.android.lark.widget.select;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/widget/select/SelectedTextInfo;", "", "copyText", "", "top", "", "bottom", "start", "isPartial", "", "(Ljava/lang/CharSequence;IIIZ)V", "getBottom", "()I", "getCopyText", "()Ljava/lang/CharSequence;", "()Z", "getStart", "getTop", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.select.a */
public final class SelectedTextInfo {

    /* renamed from: a */
    private final CharSequence f146628a;

    /* renamed from: b */
    private final int f146629b;

    /* renamed from: c */
    private final int f146630c;

    /* renamed from: d */
    private final int f146631d;

    /* renamed from: e */
    private final boolean f146632e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedTextInfo)) {
            return false;
        }
        SelectedTextInfo aVar = (SelectedTextInfo) obj;
        return Intrinsics.areEqual(this.f146628a, aVar.f146628a) && this.f146629b == aVar.f146629b && this.f146630c == aVar.f146630c && this.f146631d == aVar.f146631d && this.f146632e == aVar.f146632e;
    }

    public int hashCode() {
        CharSequence charSequence = this.f146628a;
        int hashCode = (((((((charSequence != null ? charSequence.hashCode() : 0) * 31) + this.f146629b) * 31) + this.f146630c) * 31) + this.f146631d) * 31;
        boolean z = this.f146632e;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "SelectedTextInfo(copyText=" + this.f146628a + ", top=" + this.f146629b + ", bottom=" + this.f146630c + ", start=" + this.f146631d + ", isPartial=" + this.f146632e + ")";
    }

    /* renamed from: a */
    public final CharSequence mo200855a() {
        return this.f146628a;
    }

    /* renamed from: b */
    public final int mo200856b() {
        return this.f146629b;
    }

    /* renamed from: c */
    public final int mo200857c() {
        return this.f146630c;
    }

    /* renamed from: d */
    public final int mo200858d() {
        return this.f146631d;
    }

    /* renamed from: e */
    public final boolean mo200859e() {
        return this.f146632e;
    }

    public SelectedTextInfo(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "copyText");
        this.f146628a = charSequence;
        this.f146629b = i;
        this.f146630c = i2;
        this.f146631d = i3;
        this.f146632e = z;
    }
}
