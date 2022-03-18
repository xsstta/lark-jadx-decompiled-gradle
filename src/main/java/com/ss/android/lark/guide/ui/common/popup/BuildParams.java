package com.ss.android.lark.guide.ui.common.popup;

import android.app.Activity;
import android.view.View;
import android.widget.PopupWindow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00103\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00106\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010<\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ¶\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u00072\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\fHÖ\u0001J\t\u0010D\u001a\u00020EHÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b&\u0010\"R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b'\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b(\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b+\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b0\u0010\"¨\u0006F"}, d2 = {"Lcom/ss/android/lark/guide/ui/common/popup/BuildParams;", "", "component", "Lcom/ss/android/lark/guide/ui/common/popup/Component;", "anchorView", "Landroid/view/View;", "outsideDismiss", "", "bgEnable", "activity", "Landroid/app/Activity;", "bgAlpha", "", "bgColor", "highlightEnable", "highlightCorner", "highlightStyle", "highlightHandler", "Lcom/ss/android/lark/guide/ui/common/popup/HighlightHandler;", "onBackPressedListener", "Lcom/ss/android/lark/guide/ui/common/popup/OnBackPressedListener;", "focusable", "onDismissListener", "Landroid/widget/PopupWindow$OnDismissListener;", "(Lcom/ss/android/lark/guide/ui/common/popup/Component;Landroid/view/View;Ljava/lang/Boolean;Ljava/lang/Boolean;Landroid/app/Activity;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/ss/android/lark/guide/ui/common/popup/HighlightHandler;Lcom/ss/android/lark/guide/ui/common/popup/OnBackPressedListener;Ljava/lang/Boolean;Landroid/widget/PopupWindow$OnDismissListener;)V", "getActivity", "()Landroid/app/Activity;", "getAnchorView", "()Landroid/view/View;", "getBgAlpha", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBgColor", "getBgEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getComponent", "()Lcom/ss/android/lark/guide/ui/common/popup/Component;", "getFocusable", "getHighlightCorner", "getHighlightEnable", "getHighlightHandler", "()Lcom/ss/android/lark/guide/ui/common/popup/HighlightHandler;", "getHighlightStyle", "getOnBackPressedListener", "()Lcom/ss/android/lark/guide/ui/common/popup/OnBackPressedListener;", "getOnDismissListener", "()Landroid/widget/PopupWindow$OnDismissListener;", "getOutsideDismiss", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/ss/android/lark/guide/ui/common/popup/Component;Landroid/view/View;Ljava/lang/Boolean;Ljava/lang/Boolean;Landroid/app/Activity;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/ss/android/lark/guide/ui/common/popup/HighlightHandler;Lcom/ss/android/lark/guide/ui/common/popup/OnBackPressedListener;Ljava/lang/Boolean;Landroid/widget/PopupWindow$OnDismissListener;)Lcom/ss/android/lark/guide/ui/common/popup/BuildParams;", "equals", "other", "hashCode", "toString", "", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.common.popup.a */
public final class BuildParams {

    /* renamed from: a */
    private final Component f99440a;

    /* renamed from: b */
    private final View f99441b;

    /* renamed from: c */
    private final Boolean f99442c;

    /* renamed from: d */
    private final Boolean f99443d;

    /* renamed from: e */
    private final Activity f99444e;

    /* renamed from: f */
    private final Integer f99445f;

    /* renamed from: g */
    private final Integer f99446g;

    /* renamed from: h */
    private final Boolean f99447h;

    /* renamed from: i */
    private final Integer f99448i;

    /* renamed from: j */
    private final Integer f99449j;

    /* renamed from: k */
    private final HighlightHandler f99450k;

    /* renamed from: l */
    private final OnBackPressedListener f99451l;

    /* renamed from: m */
    private final Boolean f99452m;

    /* renamed from: n */
    private final PopupWindow.OnDismissListener f99453n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuildParams)) {
            return false;
        }
        BuildParams aVar = (BuildParams) obj;
        return Intrinsics.areEqual(this.f99440a, aVar.f99440a) && Intrinsics.areEqual(this.f99441b, aVar.f99441b) && Intrinsics.areEqual(this.f99442c, aVar.f99442c) && Intrinsics.areEqual(this.f99443d, aVar.f99443d) && Intrinsics.areEqual(this.f99444e, aVar.f99444e) && Intrinsics.areEqual(this.f99445f, aVar.f99445f) && Intrinsics.areEqual(this.f99446g, aVar.f99446g) && Intrinsics.areEqual(this.f99447h, aVar.f99447h) && Intrinsics.areEqual(this.f99448i, aVar.f99448i) && Intrinsics.areEqual(this.f99449j, aVar.f99449j) && Intrinsics.areEqual(this.f99450k, aVar.f99450k) && Intrinsics.areEqual(this.f99451l, aVar.f99451l) && Intrinsics.areEqual(this.f99452m, aVar.f99452m) && Intrinsics.areEqual(this.f99453n, aVar.f99453n);
    }

    public int hashCode() {
        Component bVar = this.f99440a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        View view = this.f99441b;
        int hashCode2 = (hashCode + (view != null ? view.hashCode() : 0)) * 31;
        Boolean bool = this.f99442c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f99443d;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Activity activity = this.f99444e;
        int hashCode5 = (hashCode4 + (activity != null ? activity.hashCode() : 0)) * 31;
        Integer num = this.f99445f;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f99446g;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f99447h;
        int hashCode8 = (hashCode7 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Integer num3 = this.f99448i;
        int hashCode9 = (hashCode8 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f99449j;
        int hashCode10 = (hashCode9 + (num4 != null ? num4.hashCode() : 0)) * 31;
        HighlightHandler eVar = this.f99450k;
        int hashCode11 = (hashCode10 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        OnBackPressedListener hVar = this.f99451l;
        int hashCode12 = (hashCode11 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Boolean bool4 = this.f99452m;
        int hashCode13 = (hashCode12 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        PopupWindow.OnDismissListener onDismissListener = this.f99453n;
        if (onDismissListener != null) {
            i = onDismissListener.hashCode();
        }
        return hashCode13 + i;
    }

    public String toString() {
        return "BuildParams(component=" + this.f99440a + ", anchorView=" + this.f99441b + ", outsideDismiss=" + this.f99442c + ", bgEnable=" + this.f99443d + ", activity=" + this.f99444e + ", bgAlpha=" + this.f99445f + ", bgColor=" + this.f99446g + ", highlightEnable=" + this.f99447h + ", highlightCorner=" + this.f99448i + ", highlightStyle=" + this.f99449j + ", highlightHandler=" + this.f99450k + ", onBackPressedListener=" + this.f99451l + ", focusable=" + this.f99452m + ", onDismissListener=" + this.f99453n + ")";
    }

    /* renamed from: a */
    public final Component mo141689a() {
        return this.f99440a;
    }

    /* renamed from: b */
    public final View mo141690b() {
        return this.f99441b;
    }

    /* renamed from: c */
    public final Boolean mo141691c() {
        return this.f99442c;
    }

    /* renamed from: d */
    public final Boolean mo141692d() {
        return this.f99443d;
    }

    /* renamed from: e */
    public final Activity mo141693e() {
        return this.f99444e;
    }

    /* renamed from: f */
    public final Integer mo141695f() {
        return this.f99445f;
    }

    /* renamed from: g */
    public final Integer mo141696g() {
        return this.f99446g;
    }

    /* renamed from: h */
    public final Boolean mo141697h() {
        return this.f99447h;
    }

    /* renamed from: i */
    public final Integer mo141699i() {
        return this.f99448i;
    }

    /* renamed from: j */
    public final Integer mo141700j() {
        return this.f99449j;
    }

    /* renamed from: k */
    public final HighlightHandler mo141701k() {
        return this.f99450k;
    }

    /* renamed from: l */
    public final OnBackPressedListener mo141702l() {
        return this.f99451l;
    }

    /* renamed from: m */
    public final Boolean mo141703m() {
        return this.f99452m;
    }

    /* renamed from: n */
    public final PopupWindow.OnDismissListener mo141704n() {
        return this.f99453n;
    }

    public BuildParams(Component bVar, View view, Boolean bool, Boolean bool2, Activity activity, Integer num, Integer num2, Boolean bool3, Integer num3, Integer num4, HighlightHandler eVar, OnBackPressedListener hVar, Boolean bool4, PopupWindow.OnDismissListener onDismissListener) {
        this.f99440a = bVar;
        this.f99441b = view;
        this.f99442c = bool;
        this.f99443d = bool2;
        this.f99444e = activity;
        this.f99445f = num;
        this.f99446g = num2;
        this.f99447h = bool3;
        this.f99448i = num3;
        this.f99449j = num4;
        this.f99450k = eVar;
        this.f99451l = hVar;
        this.f99452m = bool4;
        this.f99453n = onDismissListener;
    }
}
