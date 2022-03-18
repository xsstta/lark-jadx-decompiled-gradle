package com.ss.android.vc.meeting.basedialog;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH&J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH&J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001aH&R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/ss/android/vc/meeting/basedialog/DesktopBaseUpPopopWindow;", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "activity", "Landroid/app/Activity;", "anchor", "Landroid/view/View;", "(Landroid/app/Activity;Landroid/view/View;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "getAnchor", "()Landroid/view/View;", "mOnDismissListener", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "getMOnDismissListener", "()Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;", "setMOnDismissListener", "(Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface$OnDismissListener;)V", "popopWindow", "Lcom/larksuite/framework/ui/BasePopupWindow;", "getPopopWindow", "()Lcom/larksuite/framework/ui/BasePopupWindow;", "setPopopWindow", "(Lcom/larksuite/framework/ui/BasePopupWindow;)V", "anchorViewWidth", "", "createContentView", "dismiss", "", "initPopWindow", "onPopupWindowDismiss", "setOnDismissListener", "onDismissListener", "show", "showAsHalfModel", "windowWidth", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.basedialog.b */
public abstract class DesktopBaseUpPopopWindow implements AbstractC61222a {

    /* renamed from: a */
    private BasePopupWindow f153342a;

    /* renamed from: b */
    private AbstractC61222a.AbstractC61223a f153343b;

    /* renamed from: c */
    private Activity f153344c;

    /* renamed from: d */
    private final View f153345d;

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public /* synthetic */ void mo211610a(String str) {
        AbstractC61222a.CC.$default$a(this, str);
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: b */
    public /* synthetic */ boolean mo211613b() {
        return AbstractC61222a.CC.$default$b(this);
    }

    /* renamed from: d */
    public abstract View mo211705d();

    /* renamed from: e */
    public abstract int mo211706e();

    /* renamed from: f */
    public abstract int mo211707f();

    /* renamed from: g */
    public abstract void mo211708g();

    /* renamed from: c */
    public final AbstractC61222a.AbstractC61223a mo211704c() {
        return this.f153343b;
    }

    /* renamed from: h */
    public final Activity mo211709h() {
        return this.f153344c;
    }

    /* renamed from: i */
    public final View mo211710i() {
        return this.f153345d;
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        BasePopupWindow basePopupWindow = this.f153342a;
        if (basePopupWindow != null) {
            basePopupWindow.dismiss();
        }
        this.f153344c = null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDismiss"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.basedialog.b$a */
    public static final class C61224a implements PopupWindow.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ DesktopBaseUpPopopWindow f153346a;

        C61224a(DesktopBaseUpPopopWindow bVar) {
            this.f153346a = bVar;
        }

        public final void onDismiss() {
            this.f153346a.mo211710i().setSelected(false);
            this.f153346a.mo211708g();
            AbstractC61222a.AbstractC61223a c = this.f153346a.mo211704c();
            if (c != null) {
                c.bY_();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        Activity activity = this.f153344c;
        if (activity != null) {
            int[] iArr = new int[2];
            this.f153345d.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            BasePopupWindow basePopupWindow = this.f153342a;
            if (basePopupWindow != null) {
                basePopupWindow.showAtLocation(this.f153345d, 83, (i - (mo211706e() / 2)) + (mo211707f() / 2), (DeviceUtils.getScreenHeight(activity) - i2) + UIHelper.dp2px(5.0f));
            }
            this.f153345d.setSelected(true);
        }
    }

    /* renamed from: m */
    private final void m238119m() {
        View contentView;
        View contentView2;
        BasePopupWindow basePopupWindow = new BasePopupWindow(-2, -2);
        this.f153342a = basePopupWindow;
        if (basePopupWindow != null) {
            basePopupWindow.setContentView(mo211705d());
        }
        BasePopupWindow basePopupWindow2 = this.f153342a;
        if (!(basePopupWindow2 == null || (contentView2 = basePopupWindow2.getContentView()) == null)) {
            contentView2.setFocusable(true);
        }
        BasePopupWindow basePopupWindow3 = this.f153342a;
        if (!(basePopupWindow3 == null || (contentView = basePopupWindow3.getContentView()) == null)) {
            contentView.setFocusableInTouchMode(true);
        }
        BasePopupWindow basePopupWindow4 = this.f153342a;
        if (basePopupWindow4 != null) {
            basePopupWindow4.setOutsideTouchable(true);
        }
        BasePopupWindow basePopupWindow5 = this.f153342a;
        if (basePopupWindow5 != null) {
            basePopupWindow5.setBackgroundDrawable(new ColorDrawable(0));
        }
        BasePopupWindow basePopupWindow6 = this.f153342a;
        if (basePopupWindow6 != null) {
            basePopupWindow6.setFocusable(true);
        }
        BasePopupWindow basePopupWindow7 = this.f153342a;
        if (basePopupWindow7 != null) {
            basePopupWindow7.setOnDismissListener(new C61224a(this));
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211609a(AbstractC61222a.AbstractC61223a aVar) {
        this.f153343b = aVar;
    }

    public DesktopBaseUpPopopWindow(Activity activity, View view) {
        Intrinsics.checkParameterIsNotNull(view, "anchor");
        this.f153344c = activity;
        this.f153345d = view;
        m238119m();
    }
}
