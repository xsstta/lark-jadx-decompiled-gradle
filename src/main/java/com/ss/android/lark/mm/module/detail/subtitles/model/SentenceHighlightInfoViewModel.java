package com.ss.android.lark.mm.module.detail.subtitles.model;

import com.ss.android.lark.mm.widget.texthighlightbg.HighlightStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/model/SentenceHighlightInfoViewModel;", "", "sid", "", "offsetInSentence", "", "size", "style", "Lcom/ss/android/lark/mm/widget/texthighlightbg/HighlightStyle;", "findIndex", "offsetInParagraph", "(Ljava/lang/String;IILcom/ss/android/lark/mm/widget/texthighlightbg/HighlightStyle;II)V", "getFindIndex", "()I", "getOffsetInParagraph", "getOffsetInSentence", "getSid", "()Ljava/lang/String;", "getSize", "getStyle", "()Lcom/ss/android/lark/mm/widget/texthighlightbg/HighlightStyle;", "setStyle", "(Lcom/ss/android/lark/mm/widget/texthighlightbg/HighlightStyle;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.model.c */
public final class SentenceHighlightInfoViewModel {

    /* renamed from: a */
    private final String f116554a;

    /* renamed from: b */
    private final int f116555b;

    /* renamed from: c */
    private final int f116556c;

    /* renamed from: d */
    private HighlightStyle f116557d;

    /* renamed from: e */
    private final int f116558e;

    /* renamed from: f */
    private final int f116559f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SentenceHighlightInfoViewModel)) {
            return false;
        }
        SentenceHighlightInfoViewModel cVar = (SentenceHighlightInfoViewModel) obj;
        return Intrinsics.areEqual(this.f116554a, cVar.f116554a) && this.f116555b == cVar.f116555b && this.f116556c == cVar.f116556c && Intrinsics.areEqual(this.f116557d, cVar.f116557d) && this.f116558e == cVar.f116558e && this.f116559f == cVar.f116559f;
    }

    public int hashCode() {
        String str = this.f116554a;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f116555b) * 31) + this.f116556c) * 31;
        HighlightStyle highlightStyle = this.f116557d;
        if (highlightStyle != null) {
            i = highlightStyle.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f116558e) * 31) + this.f116559f;
    }

    public String toString() {
        return "SentenceHighlightInfoViewModel(sid=" + this.f116554a + ", offsetInSentence=" + this.f116555b + ", size=" + this.f116556c + ", style=" + this.f116557d + ", findIndex=" + this.f116558e + ", offsetInParagraph=" + this.f116559f + ")";
    }

    /* renamed from: a */
    public final String mo162573a() {
        return this.f116554a;
    }

    /* renamed from: b */
    public final int mo162575b() {
        return this.f116555b;
    }

    /* renamed from: c */
    public final int mo162576c() {
        return this.f116556c;
    }

    /* renamed from: d */
    public final HighlightStyle mo162577d() {
        return this.f116557d;
    }

    /* renamed from: e */
    public final int mo162578e() {
        return this.f116558e;
    }

    /* renamed from: f */
    public final int mo162580f() {
        return this.f116559f;
    }

    /* renamed from: a */
    public final void mo162574a(HighlightStyle highlightStyle) {
        Intrinsics.checkParameterIsNotNull(highlightStyle, "<set-?>");
        this.f116557d = highlightStyle;
    }

    public SentenceHighlightInfoViewModel(String str, int i, int i2, HighlightStyle highlightStyle, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(str, "sid");
        Intrinsics.checkParameterIsNotNull(highlightStyle, "style");
        this.f116554a = str;
        this.f116555b = i;
        this.f116556c = i2;
        this.f116557d = highlightStyle;
        this.f116558e = i3;
        this.f116559f = i4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SentenceHighlightInfoViewModel(java.lang.String r8, int r9, int r10, com.ss.android.lark.mm.widget.texthighlightbg.HighlightStyle r11, int r12, int r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto L_0x0006
            com.ss.android.lark.mm.widget.texthighlightbg.HighlightStyle r11 = com.ss.android.lark.mm.widget.texthighlightbg.HighlightStyle.SYNC
        L_0x0006:
            r4 = r11
            r11 = r14 & 16
            if (r11 == 0) goto L_0x000e
            r12 = 0
            r5 = 0
            goto L_0x000f
        L_0x000e:
            r5 = r12
        L_0x000f:
            r11 = r14 & 32
            if (r11 == 0) goto L_0x0016
            r13 = -1
            r6 = -1
            goto L_0x0017
        L_0x0016:
            r6 = r13
        L_0x0017:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.detail.subtitles.model.SentenceHighlightInfoViewModel.<init>(java.lang.String, int, int, com.ss.android.lark.mm.widget.texthighlightbg.HighlightStyle, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
