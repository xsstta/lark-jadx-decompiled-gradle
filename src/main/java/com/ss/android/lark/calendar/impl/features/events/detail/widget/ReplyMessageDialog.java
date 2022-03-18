package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.p1153e.C25655d;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.DragShrinkLayout;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.FooterRSVPView;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 :2\u00020\u0001:\u0003:;<B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0006\u0010\u001f\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020\u0019J\b\u0010!\u001a\u00020\u0019H\u0002J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0006\u0010#\u001a\u00020\bJ\u0012\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u000e\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0013J\b\u0010)\u001a\u00020\u0019H\u0016J\u0006\u0010*\u001a\u00020\u0019J\u000e\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u000bJ\u0006\u0010-\u001a\u00020\u0019J\b\u0010.\u001a\u00020\u0019H\u0002J\b\u0010/\u001a\u00020\u0019H\u0002J\u0006\u00100\u001a\u00020\u0019J\u000e\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u000eJ\u0010\u00103\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u00010\u000bJ\u000e\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u000bJ\u0006\u00107\u001a\u00020\u0019J\u0010\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020\bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "isKeyBoardShow", "", "isNavigationBarShow", "mComment", "", "mContext", "mCurAttendeeStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "mInviterOperatorId", "mOnGlobalChangeListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "mReplyMessageListener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog$ReplyMessageListener;", "mSendReplyCommentDialog", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "preHeight", "screenHeight", "clearReplyMessage", "", "dismiss", "getResourceEntryName", "id", "activity", "Landroid/app/Activity;", "hideKeyBord", "initListener", "initView", "isNavBarVisible", "isSendDialogShowing", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setReplyMessageListener", "listener", "show", "showSendCommentDialog", "showSendErrResult", ApiHandler.API_CALLBACK_ERRMSG, "showSendSucResult", "startHideAnim", "startShowAnim", "trueDismiss", "updateAttendeeStatus", UpdateKey.STATUS, "updateInviterUserId", "inviterId", "updateInviterUserName", "invitorName", "updateIsNavigationBarShow", "updateSendBt", "isSendEnable", "Companion", "KeyBoardOnGlobalChangeListener", "ReplyMessageListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f */
public final class ReplyMessageDialog extends BaseDialog {

    /* renamed from: j */
    public static final Companion f79794j = new Companion(null);

    /* renamed from: a */
    public Context f79795a;

    /* renamed from: b */
    public String f79796b = "";

    /* renamed from: c */
    public String f79797c = "";

    /* renamed from: d */
    public ReplyMessageListener f79798d;

    /* renamed from: e */
    public RSVPStatus f79799e = RSVPStatus.NEEDS_ACTION;

    /* renamed from: f */
    public final int f79800f = UIUtils.getScreenHeight(this.f79795a);

    /* renamed from: g */
    public boolean f79801g;

    /* renamed from: h */
    public boolean f79802h;

    /* renamed from: i */
    public int f79803i = -1;

    /* renamed from: k */
    private RequestLoadingDialog f79804k;

    /* renamed from: l */
    private ViewTreeObserver.OnGlobalLayoutListener f79805l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog$ReplyMessageListener;", "", "onClickEnableSendBt", "", Comment.f24093e, "", "mInviterCalendarId", "statue", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$c */
    public interface ReplyMessageListener {
        /* renamed from: a */
        void mo114119a(String str, String str2, RSVPStatus rSVPStatus);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$p */
    public static final class View$OnClickListenerC31499p implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC31499p f79822a = new View$OnClickListenerC31499p();

        View$OnClickListenerC31499p() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void dismiss() {
        mo114236h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog$initListener$3", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/DragShrinkLayout$ShrinkLayoutChangeListener;", "dragOffset", "", "totalOffset", "", "currentOffset", "onLayoutHideAnimEnd", "onLayoutHideAnimStart", "onLayoutShowAnimEnd", "onLayoutShowAnimStart", "startDrag", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$f */
    public static final class C31487f implements DragShrinkLayout.ShrinkLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageDialog f79809a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.DragShrinkLayout.ShrinkLayoutChangeListener
        /* renamed from: b */
        public void mo114138b() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.DragShrinkLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo114136a() {
            this.f79809a.mo114237i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.DragShrinkLayout.ShrinkLayoutChangeListener
        /* renamed from: d */
        public void mo114140d() {
            this.f79809a.mo114237i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.DragShrinkLayout.ShrinkLayoutChangeListener
        /* renamed from: e */
        public void mo114141e() {
            this.f79809a.mo114230c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.DragShrinkLayout.ShrinkLayoutChangeListener
        /* renamed from: c */
        public void mo114139c() {
            View findViewById = this.f79809a.findViewById(R.id.keyBoardBottomBg);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "keyBoardBottomBg");
            findViewById.setVisibility(0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31487f(ReplyMessageDialog fVar) {
            this.f79809a = fVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.DragShrinkLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo114137a(float f, float f2) {
            if (f == BitmapDescriptorFactory.HUE_RED) {
                View findViewById = this.f79809a.findViewById(R.id.shadowView);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
                findViewById.setAlpha(0.6f);
            } else {
                View findViewById2 = this.f79809a.findViewById(R.id.shadowView);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "shadowView");
                findViewById2.setAlpha(((f - f2) / f) * 0.6f);
            }
            if (f - f2 > f / ((float) 3)) {
                View findViewById3 = this.f79809a.findViewById(R.id.keyBoardBottomBg);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "keyBoardBottomBg");
                findViewById3.setVisibility(8);
                this.f79809a.f79803i = 0;
                ((RelativeLayout) this.f79809a.findViewById(R.id.viewContainer)).setPadding(0, 0, 0, 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$h */
    public static final class RunnableC31489h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageDialog f79811a;

        RunnableC31489h(ReplyMessageDialog fVar) {
            this.f79811a = fVar;
        }

        public final void run() {
            this.f79811a.mo114236h();
        }
    }

    /* renamed from: b */
    public final void mo114228b() {
        Context context = this.f79795a;
        if (context != null) {
            this.f79802h = m118444a((Activity) context);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: e */
    public final boolean mo114233e() {
        RequestLoadingDialog requestLoadingDialog = this.f79804k;
        if (requestLoadingDialog != null) {
            if (requestLoadingDialog == null) {
                Intrinsics.throwNpe();
            }
            if (requestLoadingDialog.isShowing()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo114234f() {
        ((EditText) findViewById(R.id.messageEditText)).setText("");
    }

    /* renamed from: i */
    public final void mo114237i() {
        if (getCurrentFocus() != null) {
            KeyboardUtils.hideKeyboard(this.f79795a, getCurrentFocus());
        } else {
            KeyboardUtils.hideKeyboard(this.f79795a);
        }
    }

    /* renamed from: a */
    public final void mo114223a() {
        ((FooterRSVPView) findViewById(R.id.rsvpContainer)).setActionListener(new C31485d(this));
        ((FooterRSVPView) findViewById(R.id.rsvpContainer)).setEndIconClickListener(new View$OnClickListenerC31486e(this));
        ((DragShrinkLayout) findViewById(R.id.dragLayout)).setListener(new C31487f(this));
        this.f79805l = new KeyBoardOnGlobalChangeListener();
    }

    /* renamed from: d */
    public final void mo114232d() {
        if (this.f79804k == null) {
            Context context = this.f79795a;
            if (context != null) {
                RequestLoadingDialog requestLoadingDialog = new RequestLoadingDialog((Activity) context);
                this.f79804k = requestLoadingDialog;
                if (requestLoadingDialog == null) {
                    Intrinsics.throwNpe();
                }
                Window window = requestLoadingDialog.getWindow();
                if (window == null) {
                    Intrinsics.throwNpe();
                }
                window.setFlags(131072, 131072);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }
        RequestLoadingDialog requestLoadingDialog2 = this.f79804k;
        if (requestLoadingDialog2 == null) {
            Intrinsics.throwNpe();
        }
        requestLoadingDialog2.mo112584a();
    }

    /* renamed from: g */
    public final void mo114235g() {
        RequestLoadingDialog requestLoadingDialog = this.f79804k;
        if (requestLoadingDialog != null) {
            if (requestLoadingDialog == null) {
                Intrinsics.throwNpe();
            }
            requestLoadingDialog.mo112593d(R.string.Calendar_Detail_ResponseSuccessed);
        }
        mo114234f();
        ((RelativeLayout) findViewById(R.id.viewContainer)).postDelayed(new RunnableC31489h(this), 500);
    }

    /* renamed from: k */
    private final void m118446k() {
        int screenHeight = DeviceUtils.getScreenHeight(this.f79795a);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 0.6f);
        ofFloat.addUpdateListener(new C31493l(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(screenHeight, 0);
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "anim");
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new C31494m(this));
        ofInt.addListener(new C31495n(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.start();
    }

    /* renamed from: c */
    public final void mo114230c() {
        try {
            this.f79803i = 0;
            ((RelativeLayout) findViewById(R.id.viewContainer)).setPadding(0, 0, 0, 0);
            Context context = this.f79795a;
            if (context != null) {
                Window window = ((Activity) context).getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window, "(mContext as Activity).window");
                View decorView = window.getDecorView();
                Intrinsics.checkExpressionValueIsNotNull(decorView, "(mContext as Activity).window.decorView");
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f79805l;
                if (onGlobalLayoutListener == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mOnGlobalChangeListener");
                }
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                Context context2 = this.f79795a;
                if (context2 instanceof Activity) {
                    if (context2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    } else if (!UIUtils.isActivityRunning((Activity) context2)) {
                        return;
                    }
                }
                super.dismiss();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public final void mo114236h() {
        DragShrinkLayout dragShrinkLayout = (DragShrinkLayout) findViewById(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(dragShrinkLayout, "dragLayout");
        int height = dragShrinkLayout.getHeight();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, height);
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "anim");
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.addUpdateListener(new C31490i(this, height));
        ofInt.addListener(new C31491j(this));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.6f, BitmapDescriptorFactory.HUE_RED);
        ofFloat.addUpdateListener(new C31492k(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.start();
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void show() {
        Context context = this.f79795a;
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        } else if (UIUtils.isActivityRunning((Activity) context)) {
            View findViewById = findViewById(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
            findViewById.setBackground(new ColorDrawable(C32634ae.m125178a(R.color.lkui_N900)));
            this.f79803i = 0;
            ((RelativeLayout) findViewById(R.id.viewContainer)).setPadding(0, 0, 0, 0);
            Context context2 = this.f79795a;
            if (context2 != null) {
                Window window = ((Activity) context2).getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window, "(mContext as Activity).window");
                View decorView = window.getDecorView();
                Intrinsics.checkExpressionValueIsNotNull(decorView, "(mContext as Activity).window.decorView");
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f79805l;
                if (onGlobalLayoutListener == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mOnGlobalChangeListener");
                }
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                super.show();
                m118446k();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog$KeyBoardOnGlobalChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog;)V", "onGlobalLayout", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$b */
    public final class KeyBoardOnGlobalChangeListener implements ViewTreeObserver.OnGlobalLayoutListener {
        public void onGlobalLayout() {
            int i;
            int i2;
            boolean z;
            Rect rect = new Rect();
            Context context = ReplyMessageDialog.this.f79795a;
            if (context != null) {
                Window window = ((Activity) context).getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window, "(mContext as Activity).window");
                window.getDecorView().getWindowVisibleDisplayFrame(rect);
                if (ReplyMessageDialog.this.f79802h) {
                    i = ReplyMessageDialog.this.f79800f - rect.bottom;
                    i2 = C25655d.m91903b(ReplyMessageDialog.this.f79795a);
                } else {
                    i = ReplyMessageDialog.this.f79800f;
                    i2 = rect.bottom;
                }
                int i3 = i - i2;
                ReplyMessageDialog fVar = ReplyMessageDialog.this;
                if (((float) i3) > ((float) fVar.f79800f) / 5.0f) {
                    z = true;
                } else {
                    z = false;
                }
                fVar.f79801g = z;
                if (ReplyMessageDialog.this.f79801g) {
                    if (ReplyMessageDialog.this.f79803i != i3) {
                        ReplyMessageDialog.this.f79803i = i3;
                        ((RelativeLayout) ReplyMessageDialog.this.findViewById(R.id.viewContainer)).setPadding(0, 0, 0, i3);
                    }
                } else if (ReplyMessageDialog.this.f79803i != 0) {
                    ReplyMessageDialog.this.f79803i = 0;
                    ((RelativeLayout) ReplyMessageDialog.this.findViewById(R.id.viewContainer)).setPadding(0, 0, 0, 0);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public KeyBoardOnGlobalChangeListener() {
        }
    }

    /* renamed from: j */
    private final void m118445j() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.viewContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "viewContainer");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = UIUtils.dp2px(getContext(), 44.0f);
            RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.viewContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "viewContainer");
            relativeLayout2.setLayoutParams(layoutParams2);
            RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(R.id.viewContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "viewContainer");
            relativeLayout3.setVisibility(8);
            View findViewById = findViewById(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
            findViewById.setBackground(new ColorDrawable(0));
            ((FooterRSVPView) findViewById(R.id.rsvpContainer)).setEndIconDrawable(R.drawable.ud_icon_pull_down_outlined);
            ((EditText) findViewById(R.id.messageEditText)).addTextChangedListener(new C31488g(this));
            if (!TextUtils.isEmpty(this.f79796b)) {
                ((EditText) findViewById(R.id.messageEditText)).setText(this.f79796b);
            }
            ((FooterRSVPView) findViewById(R.id.rsvpContainer)).setBackGround(null);
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            ((ImageView) findViewById(R.id.sendBt)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_send_filled, UDColorUtils.getColor(context2, R.color.icon_disable)));
            View findViewById2 = findViewById(R.id.keyBoardBottomBg);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "keyBoardBottomBg");
            findViewById2.getLayoutParams().height = this.f79800f / 2;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog$startShowAnim$3", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$n */
    public static final class C31495n implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageDialog f79818a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$n$b */
        static final class View$OnClickListenerC31497b implements View.OnClickListener {

            /* renamed from: a */
            public static final View$OnClickListenerC31497b f79820a = new View$OnClickListenerC31497b();

            View$OnClickListenerC31497b() {
            }

            public final void onClick(View view) {
            }
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$n$a */
        static final class View$OnClickListenerC31496a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C31495n f79819a;

            View$OnClickListenerC31496a(C31495n nVar) {
                this.f79819a = nVar;
            }

            public final void onClick(View view) {
                this.f79819a.f79818a.dismiss();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31495n(ReplyMessageDialog fVar) {
            this.f79818a = fVar;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ((EditText) this.f79818a.findViewById(R.id.messageEditText)).requestFocus();
            View findViewById = this.f79818a.findViewById(R.id.keyBoardBottomBg);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "keyBoardBottomBg");
            findViewById.setVisibility(0);
            KeyboardUtils.showKeyboard(this.f79818a.f79795a);
            this.f79818a.findViewById(R.id.shadowView).setOnClickListener(new View$OnClickListenerC31496a(this));
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            RelativeLayout relativeLayout = (RelativeLayout) this.f79818a.findViewById(R.id.viewContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "viewContainer");
            relativeLayout.setVisibility(0);
            DragShrinkLayout dragShrinkLayout = (DragShrinkLayout) this.f79818a.findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(dragShrinkLayout, "dragLayout");
            dragShrinkLayout.setVisibility(0);
            View findViewById = this.f79818a.findViewById(R.id.keyBoardBottomBg);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "keyBoardBottomBg");
            findViewById.setVisibility(8);
            this.f79818a.findViewById(R.id.shadowView).setOnClickListener(View$OnClickListenerC31497b.f79820a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog$initListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/FooterRSVPView$OnActionClickListener;", "onActionClick", "", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$d */
    public static final class C31485d implements FooterRSVPView.OnActionClickListener {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageDialog f79807a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31485d(ReplyMessageDialog fVar) {
            this.f79807a = fVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.widget.FooterRSVPView.OnActionClickListener
        /* renamed from: a */
        public void mo114074a(RSVPStatus rSVPStatus) {
            Intrinsics.checkParameterIsNotNull(rSVPStatus, UpdateKey.STATUS);
            this.f79807a.mo114224a(rSVPStatus);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog$initListener$2", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$e */
    public static final class View$OnClickListenerC31486e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageDialog f79808a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC31486e(ReplyMessageDialog fVar) {
            this.f79808a = fVar;
        }

        public void onClick(View view) {
            this.f79808a.mo114236h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog$initView$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$g */
    public static final class C31488g implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageDialog f79810a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31488g(ReplyMessageDialog fVar) {
            this.f79810a = fVar;
        }

        public void afterTextChanged(Editable editable) {
            Intrinsics.checkParameterIsNotNull(editable, "s");
            ReplyMessageDialog fVar = this.f79810a;
            String obj = editable.toString();
            if (obj != null) {
                fVar.f79796b = StringsKt.trim((CharSequence) obj).toString();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2;
            ReplyMessageDialog fVar = this.f79810a;
            if (charSequence != null) {
                charSequence2 = StringsKt.trim(charSequence);
            } else {
                charSequence2 = null;
            }
            fVar.mo114226a(!TextUtils.isEmpty(charSequence2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog$startHideAnim$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$j */
    public static final class C31491j implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageDialog f79814a;

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31491j(ReplyMessageDialog fVar) {
            this.f79814a = fVar;
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f79814a.mo114230c();
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f79814a.mo114230c();
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.f79814a.mo114237i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/widget/ReplyMessageDialog$updateSendBt$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$o */
    public static final class C31498o extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageDialog f79821a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31498o(ReplyMessageDialog fVar) {
            this.f79821a = fVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            this.f79821a.mo114232d();
            ReplyMessageListener cVar = this.f79821a.f79798d;
            if (cVar != null) {
                EditText editText = (EditText) this.f79821a.findViewById(R.id.messageEditText);
                Intrinsics.checkExpressionValueIsNotNull(editText, "messageEditText");
                String obj = editText.getText().toString();
                if (obj != null) {
                    cVar.mo114119a(StringsKt.trim((CharSequence) obj).toString(), this.f79821a.f79797c, this.f79821a.f79799e);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    /* renamed from: a */
    public final void mo114225a(ReplyMessageListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f79798d = cVar;
    }

    /* renamed from: a */
    public final void mo114224a(RSVPStatus rSVPStatus) {
        Intrinsics.checkParameterIsNotNull(rSVPStatus, UpdateKey.STATUS);
        this.f79799e = rSVPStatus;
        ((FooterRSVPView) findViewById(R.id.rsvpContainer)).mo114161a(this.f79799e);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(50);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$k */
    public static final class C31492k implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageDialog f79815a;

        C31492k(ReplyMessageDialog fVar) {
            this.f79815a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View findViewById = this.f79815a.findViewById(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                findViewById.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$l */
    public static final class C31493l implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageDialog f79816a;

        C31493l(ReplyMessageDialog fVar) {
            this.f79816a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View findViewById = this.f79816a.findViewById(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                findViewById.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$m */
    public static final class C31494m implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageDialog f79817a;

        C31494m(ReplyMessageDialog fVar) {
            this.f79817a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DragShrinkLayout dragShrinkLayout = (DragShrinkLayout) this.f79817a.findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(dragShrinkLayout, "dragLayout");
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                dragShrinkLayout.setTranslationY((float) ((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: b */
    public final void mo114229b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "invitorName");
        if (!TextUtils.isEmpty(str)) {
            EditText editText = (EditText) findViewById(R.id.messageEditText);
            Intrinsics.checkExpressionValueIsNotNull(editText, "messageEditText");
            editText.setHint(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Detail_ReplyRSVPSendto, "value", str));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.f$i */
    public static final class C31490i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ReplyMessageDialog f79812a;

        /* renamed from: b */
        final /* synthetic */ int f79813b;

        C31490i(ReplyMessageDialog fVar, int i) {
            this.f79812a = fVar;
            this.f79813b = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DragShrinkLayout dragShrinkLayout = (DragShrinkLayout) this.f79812a.findViewById(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(dragShrinkLayout, "dragLayout");
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                dragShrinkLayout.setTranslationY((float) ((Integer) animatedValue).intValue());
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                } else if (((float) ((Integer) animatedValue2).intValue()) > ((float) this.f79813b) / 3.0f) {
                    View findViewById = this.f79812a.findViewById(R.id.keyBoardBottomBg);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById, "keyBoardBottomBg");
                    findViewById.setVisibility(8);
                    this.f79812a.f79803i = 0;
                    ((RelativeLayout) this.f79812a.findViewById(R.id.viewContainer)).setPadding(0, 0, 0, 0);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        }
    }

    /* renamed from: a */
    private final boolean m118444a(Activity activity) {
        boolean z;
        Window window = activity.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            int childCount = viewGroup.getChildCount();
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    z = false;
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
                if (childAt.getId() != -1 && Intrinsics.areEqual("navigationBarBackground", m118443a(childAt.getId(), activity)) && childAt.getVisibility() == 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                return z;
            }
            if ((viewGroup.getSystemUiVisibility() & 2) == 0) {
                z2 = true;
            }
            return z2;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final void mo114226a(boolean z) {
        if (z) {
            ((ImageView) findViewById(R.id.sendBt)).setImageDrawable(C32634ae.m125184d(R.drawable.ud_icon_send_colorful));
            ((ImageView) findViewById(R.id.sendBt)).setOnClickListener(new C31498o(this));
            return;
        }
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        ((ImageView) findViewById(R.id.sendBt)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_send_filled, UDColorUtils.getColor(context2, R.color.icon_disable)));
        ((ImageView) findViewById(R.id.sendBt)).setOnClickListener(View$OnClickListenerC31499p.f79822a);
    }

    /* renamed from: c */
    public final void mo114231c(String str) {
        Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
        if (Intrinsics.areEqual(str, C32634ae.m125182b(R.string.Calendar_Share_RestrictionTitle))) {
            RequestLoadingDialog requestLoadingDialog = this.f79804k;
            if (requestLoadingDialog != null) {
                if (requestLoadingDialog == null) {
                    Intrinsics.throwNpe();
                }
                requestLoadingDialog.mo112592c(R.string.Calendar_Share_RestrictionTitle);
                return;
            }
            return;
        }
        RequestLoadingDialog requestLoadingDialog2 = this.f79804k;
        if (requestLoadingDialog2 != null) {
            if (requestLoadingDialog2 == null) {
                Intrinsics.throwNpe();
            }
            requestLoadingDialog2.dismiss();
        }
        ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f79795a).message(str)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_GotIt, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: a */
    public final boolean mo114227a(String str) {
        boolean z = !Intrinsics.areEqual(this.f79797c, str);
        if (str == null) {
            str = "";
        }
        this.f79797c = str;
        return z;
    }

    /* renamed from: a */
    private final String m118443a(int i, Activity activity) {
        try {
            return activity.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReplyMessageDialog(Context context, int i) {
        super(context, i);
        WindowManager.LayoutParams layoutParams;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f79795a = context;
        setContentView(R.layout.dialog_detail_reply_message_new);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
        m118445j();
        mo114223a();
    }
}
