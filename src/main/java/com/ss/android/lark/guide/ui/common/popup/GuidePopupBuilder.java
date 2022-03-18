package com.ss.android.lark.guide.ui.common.popup;

import android.app.Activity;
import android.view.View;
import android.widget.PopupWindow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\bJ\u0010\u0010 \u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\bJ\u0016\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010&\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\fJ\u000e\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\bJ\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0016J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\bJ\u000e\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0019J\u0010\u0010/\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\u0011J\u0010\u00101\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\u0014\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u00062"}, d2 = {"Lcom/ss/android/lark/guide/ui/common/popup/GuidePopupBuilder;", "", "()V", "activity", "Landroid/app/Activity;", "anchorView", "Landroid/view/View;", "bgAlpha", "", "Ljava/lang/Integer;", "bgColor", "bgEnable", "", "Ljava/lang/Boolean;", "component", "Lcom/ss/android/lark/guide/ui/common/popup/Component;", "dismissListener", "Landroid/widget/PopupWindow$OnDismissListener;", "focusable", "highlightCorner", "highlightEnable", "highlightHandler", "Lcom/ss/android/lark/guide/ui/common/popup/HighlightHandler;", "highlightStyle", "onBackPressedListener", "Lcom/ss/android/lark/guide/ui/common/popup/OnBackPressedListener;", "outsideDismiss", "build", "Lcom/ss/android/lark/guide/ui/common/popup/IGuide;", "setAnchorView", "setBgAlpha", "alpha", "setBgColor", "color", "setBgEnable", "enable", "setComponent", "setFocusable", "setHighlight", "setHighlightCorner", "corner", "setHighlightHandler", "handler", "setHighlightStyle", "style", "setOnBackPressedListener", "listener", "setOnDismissListener", "onDismissListener", "setOutsideDismiss", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.common.popup.d */
public final class GuidePopupBuilder {

    /* renamed from: a */
    private Component f99473a;

    /* renamed from: b */
    private View f99474b;

    /* renamed from: c */
    private Boolean f99475c;

    /* renamed from: d */
    private Activity f99476d;

    /* renamed from: e */
    private Boolean f99477e;

    /* renamed from: f */
    private Integer f99478f;

    /* renamed from: g */
    private Integer f99479g;

    /* renamed from: h */
    private Boolean f99480h;

    /* renamed from: i */
    private Integer f99481i;

    /* renamed from: j */
    private Integer f99482j;

    /* renamed from: k */
    private HighlightHandler f99483k;

    /* renamed from: l */
    private OnBackPressedListener f99484l;

    /* renamed from: m */
    private Boolean f99485m;

    /* renamed from: n */
    private PopupWindow.OnDismissListener f99486n;

    /* renamed from: a */
    public final IGuide mo141723a() {
        View view;
        Component bVar = this.f99473a;
        if (bVar == null || (view = this.f99474b) == null) {
            return null;
        }
        Boolean bool = this.f99475c;
        Boolean bool2 = this.f99477e;
        Activity activity = this.f99476d;
        Integer num = this.f99478f;
        Integer num2 = this.f99479g;
        boolean z = this.f99480h;
        if (z == null) {
            z = false;
        }
        return new GuidePopup(new BuildParams(bVar, view, bool, bool2, activity, num, num2, z, this.f99481i, this.f99482j, this.f99483k, this.f99484l, this.f99485m, this.f99486n));
    }

    /* renamed from: a */
    public final GuidePopupBuilder mo141717a(PopupWindow.OnDismissListener onDismissListener) {
        this.f99486n = onDismissListener;
        return this;
    }

    /* renamed from: a */
    public final GuidePopupBuilder mo141715a(int i) {
        this.f99478f = Integer.valueOf(i);
        return this;
    }

    /* renamed from: b */
    public final GuidePopupBuilder mo141724b(int i) {
        this.f99479g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final GuidePopupBuilder mo141726c(int i) {
        this.f99481i = Integer.valueOf(i);
        return this;
    }

    /* renamed from: d */
    public final GuidePopupBuilder mo141728d(int i) {
        this.f99482j = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final GuidePopupBuilder mo141716a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        this.f99474b = view;
        return this;
    }

    /* renamed from: b */
    public final GuidePopupBuilder mo141725b(boolean z) {
        this.f99480h = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: c */
    public final GuidePopupBuilder mo141727c(boolean z) {
        this.f99485m = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: a */
    public final GuidePopupBuilder mo141718a(Component bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "component");
        this.f99473a = bVar;
        return this;
    }

    /* renamed from: a */
    public final GuidePopupBuilder mo141719a(HighlightHandler eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "handler");
        this.f99483k = eVar;
        return this;
    }

    /* renamed from: a */
    public final GuidePopupBuilder mo141720a(OnBackPressedListener hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "listener");
        this.f99484l = hVar;
        return this;
    }

    /* renamed from: a */
    public final GuidePopupBuilder mo141721a(boolean z) {
        this.f99475c = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: a */
    public final GuidePopupBuilder mo141722a(boolean z, Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f99477e = Boolean.valueOf(z);
        this.f99476d = activity;
        return this;
    }
}
