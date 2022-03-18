package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "forceUpdate", "", "selectionEnd", "(Lcom/ss/android/lark/widget/richtext/RichText;ZZ)V", "getForceUpdate", "()Z", "getRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "getSelectionEnd", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.t */
public final class RichTextShowBean {

    /* renamed from: a */
    private final RichText f140191a;

    /* renamed from: b */
    private final boolean f140192b;

    /* renamed from: c */
    private final boolean f140193c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTextShowBean)) {
            return false;
        }
        RichTextShowBean tVar = (RichTextShowBean) obj;
        return Intrinsics.areEqual(this.f140191a, tVar.f140191a) && this.f140192b == tVar.f140192b && this.f140193c == tVar.f140193c;
    }

    public int hashCode() {
        RichText richText = this.f140191a;
        int hashCode = (richText != null ? richText.hashCode() : 0) * 31;
        boolean z = this.f140192b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.f140193c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i5 + i;
    }

    public String toString() {
        return "RichTextShowBean(richText=" + this.f140191a + ", forceUpdate=" + this.f140192b + ", selectionEnd=" + this.f140193c + ")";
    }

    /* renamed from: a */
    public final RichText mo193042a() {
        return this.f140191a;
    }

    /* renamed from: b */
    public final boolean mo193043b() {
        return this.f140192b;
    }

    /* renamed from: c */
    public final boolean mo193044c() {
        return this.f140193c;
    }

    public RichTextShowBean(RichText richText, boolean z, boolean z2) {
        this.f140191a = richText;
        this.f140192b = z;
        this.f140193c = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RichTextShowBean(RichText richText, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(richText, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
