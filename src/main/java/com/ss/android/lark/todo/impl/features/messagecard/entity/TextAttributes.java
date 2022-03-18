package com.ss.android.lark.todo.impl.features.messagecard.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/entity/TextAttributes;", "", "textStr", "", "textColor", "", "isEnable", "", "isGray", "(Ljava/lang/String;IZZ)V", "()Z", "getTextColor", "()I", "getTextStr", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.c.a */
public final class TextAttributes {

    /* renamed from: a */
    private final String f140900a;

    /* renamed from: b */
    private final int f140901b;

    /* renamed from: c */
    private final boolean f140902c;

    /* renamed from: d */
    private final boolean f140903d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAttributes)) {
            return false;
        }
        TextAttributes aVar = (TextAttributes) obj;
        return Intrinsics.areEqual(this.f140900a, aVar.f140900a) && this.f140901b == aVar.f140901b && this.f140902c == aVar.f140902c && this.f140903d == aVar.f140903d;
    }

    public int hashCode() {
        String str = this.f140900a;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f140901b) * 31;
        boolean z = this.f140902c;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.f140903d;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i5 + i;
    }

    public String toString() {
        return "TextAttributes(textStr=" + this.f140900a + ", textColor=" + this.f140901b + ", isEnable=" + this.f140902c + ", isGray=" + this.f140903d + ")";
    }

    /* renamed from: a */
    public final String mo193938a() {
        return this.f140900a;
    }

    /* renamed from: b */
    public final int mo193939b() {
        return this.f140901b;
    }

    /* renamed from: c */
    public final boolean mo193940c() {
        return this.f140902c;
    }

    /* renamed from: d */
    public final boolean mo193941d() {
        return this.f140903d;
    }

    public TextAttributes(String str, int i, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "textStr");
        this.f140900a = str;
        this.f140901b = i;
        this.f140902c = z;
        this.f140903d = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextAttributes(String str, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, z, (i2 & 8) != 0 ? false : z2);
    }
}
