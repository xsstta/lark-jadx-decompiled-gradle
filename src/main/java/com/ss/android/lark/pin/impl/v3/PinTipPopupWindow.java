package com.ss.android.lark.pin.impl.v3;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/PinTipPopupWindow;", "Lcom/larksuite/framework/ui/BasePopupWindow;", "mActivity", "Landroid/app/Activity;", "isTab", "", "(Landroid/app/Activity;Z)V", "mOnDismissListener", "Landroid/widget/PopupWindow$OnDismissListener;", "mRootView", "Landroid/view/View;", "getMRootView", "()Landroid/view/View;", "mRootView$delegate", "Lkotlin/Lazy;", "mTipBody", "Landroid/widget/LinearLayout;", "getMTipBody", "()Landroid/widget/LinearLayout;", "mTipBody$delegate", "dismiss", "", "setUpListeners", "show", "anchorView", "onDismissListener", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.v3.h */
public final class PinTipPopupWindow extends BasePopupWindow {

    /* renamed from: a */
    public final Activity f128482a;

    /* renamed from: b */
    public final boolean f128483b;

    /* renamed from: c */
    private final Lazy f128484c = LazyKt.lazy(new C51637a(this));

    /* renamed from: d */
    private final Lazy f128485d = LazyKt.lazy(new C51638b(this));

    /* renamed from: e */
    private PopupWindow.OnDismissListener f128486e;

    /* renamed from: b */
    private final LinearLayout m200341b() {
        return (LinearLayout) this.f128485d.getValue();
    }

    /* renamed from: a */
    public final View mo99354a() {
        return (View) this.f128484c.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.h$b */
    static final class C51638b extends Lambda implements Function0<LinearLayout> {
        final /* synthetic */ PinTipPopupWindow this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51638b(PinTipPopupWindow hVar) {
            super(0);
            this.this$0 = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return (LinearLayout) this.this$0.mo99354a().findViewById(R.id.tip_body);
        }
    }

    @Override // com.larksuite.framework.ui.BasePopupWindow
    public void dismiss() {
        super.dismiss();
        PopupWindow.OnDismissListener onDismissListener = this.f128486e;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: c */
    private final void m200342c() {
        mo99354a().setOnClickListener(new View$OnClickListenerC51639c(this));
        mo99354a().setOnKeyListener(new View$OnKeyListenerC51640d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.h$a */
    static final class C51637a extends Lambda implements Function0<View> {
        final /* synthetic */ PinTipPopupWindow this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51637a(PinTipPopupWindow hVar) {
            super(0);
            this.this$0 = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            if (this.this$0.f128483b) {
                return LayoutInflater.from(this.this$0.f128482a).inflate(R.layout.pin_tab_tip_popup_layout, (ViewGroup) null);
            }
            return LayoutInflater.from(this.this$0.f128482a).inflate(R.layout.pin_tip_popup_layout, (ViewGroup) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.h$c */
    public static final class View$OnClickListenerC51639c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PinTipPopupWindow f128487a;

        View$OnClickListenerC51639c(PinTipPopupWindow hVar) {
            this.f128487a = hVar;
        }

        public final void onClick(View view) {
            this.f128487a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PinTipPopupWindow(Activity activity, boolean z) {
        super(-2, -2);
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        this.f128482a = activity;
        this.f128483b = z;
        setContentView(mo99354a());
        mo99354a().setFocusable(true);
        mo99354a().setFocusableInTouchMode(true);
        setOutsideTouchable(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setFocusable(true);
        m200342c();
    }

    /* renamed from: a */
    public final void mo177658a(View view, PopupWindow.OnDismissListener onDismissListener) {
        boolean z;
        int i;
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        Intrinsics.checkParameterIsNotNull(onDismissListener, "onDismissListener");
        this.f128486e = onDismissListener;
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int i2 = rect.top;
        int i3 = rect.left;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (!this.f128483b || !DesktopUtil.m144307b()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = i2 + measuredHeight + UIHelper.dp2px(8.0f);
        } else if (this.f128483b) {
            i3 = (i3 - (UIUtils.getWidth(m200341b()) / 2)) + (measuredWidth / 2);
            i = (i2 + measuredHeight) - UIHelper.dp2px(16.0f);
        } else {
            i3 = (i3 - (UIUtils.getWidth(m200341b()) / 2)) + (measuredWidth / 2);
            i = i2 + measuredHeight;
        }
        mo93124a(true);
        showAtLocation(view, 8388659, i3, i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "keyCode", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onKey"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.h$d */
    public static final class View$OnKeyListenerC51640d implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ PinTipPopupWindow f128488a;

        View$OnKeyListenerC51640d(PinTipPopupWindow hVar) {
            this.f128488a = hVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f128488a.dismiss();
            return true;
        }
    }
}
