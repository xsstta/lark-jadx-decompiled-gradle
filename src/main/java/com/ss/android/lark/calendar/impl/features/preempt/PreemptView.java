package com.ss.android.lark.calendar.impl.features.preempt;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.features.preempt.PreemptContract;
import com.ss.android.lark.calendar.impl.features.preempt.listener.OnConfirmDialogClickListener;
import com.ss.android.lark.calendar.impl.features.preempt.listener.OnSpareTimeFinishListener;
import com.ss.android.lark.calendar.impl.features.preempt.model.SheetItemData;
import com.ss.android.lark.calendar.impl.features.preempt.widget.DialogC32259a;
import com.ss.android.lark.calendar.impl.features.preempt.widget.SheetMenu;
import com.ss.android.lark.calendar.impl.features.preempt.widget.SpareTimeProgressBar;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.CalendarLoadAvatarUtil;
import com.ss.android.lark.calendar.impl.utils.IFakeAvatarCreator;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57860r;
import com.ss.android.lark.widget.p2932c.C58339d;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\b\u0010 \u001a\u00020\u0016H\u0002J\b\u0010!\u001a\u00020\u0016H\u0002J\b\u0010\"\u001a\u00020\u0016H\u0002J\b\u0010#\u001a\u00020\u0016H\u0002J\b\u0010$\u001a\u00020\u0016H\u0002J\b\u0010%\u001a\u00020\u0016H\u0002J\b\u0010&\u001a\u00020\u0016H\u0002J\b\u0010'\u001a\u00020\u0016H\u0016J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\u0016H\u0016J\b\u0010+\u001a\u00020\u0016H\u0016J\b\u0010,\u001a\u00020\u0016H\u0016J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0006H\u0002J\b\u0010/\u001a\u00020\u0016H\u0016J\b\u00100\u001a\u00020\u0016H\u0016J\b\u00101\u001a\u00020\u0016H\u0016J\b\u00102\u001a\u00020\u0016H\u0016J\b\u00103\u001a\u00020\u0016H\u0016J\b\u00104\u001a\u00020\u0016H\u0016J\b\u00105\u001a\u00020\u0016H\u0016J\u0018\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\fH\u0016J\u0010\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\u0016H\u0016J\b\u0010>\u001a\u00020\u0016H\u0016J\b\u0010?\u001a\u00020\u0016H\u0016J\u0018\u0010@\u001a\u00020\u00162\u0006\u0010A\u001a\u0002082\u0006\u0010\u0019\u001a\u000208H\u0016J \u0010B\u001a\u00020\u00162\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020E0Dj\b\u0012\u0004\u0012\u00020E`FH\u0016J \u0010G\u001a\u00020\u00162\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020E0Dj\b\u0012\u0004\u0012\u00020E`FH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptView;", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptView;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "mChatterId", "", "mContext", "Landroid/content/Context;", "mDialog", "Lcom/ss/android/lark/calendar/impl/features/preempt/widget/ConfirmDialog;", "mHasFinished", "", "mHigherLoadingToast", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "mLoadingToast", "mRootView", "mSheetMenu", "Lcom/ss/android/lark/calendar/impl/features/preempt/widget/SheetMenu;", "mViewDelegate", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptView$ViewDelegate;", "bindMeetingRoomInfo", "", "meetingRoomStr", "bindSpareTimeInfo", "spareTime", "isShowTimeIcon", "create", "destroy", "dismissDialog", "dismissSheet", "hideLoadingView", "initDialog", "initDivider", "initListener", "initSheet", "initTitleBar", "initToast", "initView", "revertSheetAction", "setViewDelegate", "viewDelegate", "showBusinessUnpaidErr", "showConfirmDialog", "showCrossTeneantErr", "showErrorWithImageStr", "errStr", "showHasPremmptToast", "showHasReservedError", "showLoadingView", "showNoDurationErr", "showOperationErrorToast", "showPreemptLoadErrorToast", "showPreemptSaveErrorToast", "showPreemptTimeChangeToast", "progressSpareTime", "", "isProgressStatusChanged", "showReservePerson", "eventCreator", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "showResourceDisabledErr", "showResourceSeizeClosedErr", "showScanQRCodeError", "showSpareTimeProgressBar", "seizeTime", "showTimeSheet", "itemList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/preempt/model/SheetItemData;", "Lkotlin/collections/ArrayList;", "updateTimeSheet", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.preempt.d */
public final class PreemptView implements PreemptContract.IPreemptView {

    /* renamed from: a */
    public final View f82476a;

    /* renamed from: b */
    public final Context f82477b;

    /* renamed from: c */
    public String f82478c;

    /* renamed from: d */
    public PreemptContract.IPreemptView.ViewDelegate f82479d;

    /* renamed from: e */
    public SheetMenu f82480e;

    /* renamed from: f */
    public DialogC32259a f82481f;

    /* renamed from: g */
    public boolean f82482g = true;

    /* renamed from: h */
    private RequestLoadingDialog f82483h;

    /* renamed from: i */
    private RequestLoadingDialog f82484i;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m122967r();
        m122972w();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/preempt/PreemptView$initSheet$1", "Lcom/ss/android/lark/calendar/impl/features/preempt/widget/SheetMenu$ActionListener;", "onActionCancel", "", "onActionPerform", "item", "Lcom/ss/android/lark/calendar/impl/features/preempt/model/SheetItemData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.d$d */
    public static final class C32248d implements SheetMenu.AbstractC32254a {

        /* renamed from: a */
        final /* synthetic */ PreemptView f82488a;

        @Override // com.ss.android.lark.calendar.impl.features.preempt.widget.SheetMenu.AbstractC32254a
        /* renamed from: a */
        public void mo117893a() {
            PreemptView.m122963b(this.f82488a).dismiss();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32248d(PreemptView dVar) {
            this.f82488a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.preempt.widget.SheetMenu.AbstractC32254a
        /* renamed from: a */
        public void mo117894a(SheetItemData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "item");
            GeneralHitPoint.m124249h();
            PreemptView.m122962a(this.f82488a).mo117841a(bVar.mo117870a());
        }
    }

    /* renamed from: r */
    private final void m122967r() {
        m122973x();
        m122971v();
        m122970u();
        m122969t();
        m122968s();
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: e */
    public void mo117827e() {
        String b = C32634ae.m125182b(R.string.Calendar_Takeover_Inactive);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…lendar_Takeover_Inactive)");
        m122964b(b);
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: f */
    public void mo117828f() {
        String b = C32634ae.m125182b(R.string.Calendar_Takeover_NeedPay);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…alendar_Takeover_NeedPay)");
        m122964b(b);
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: g */
    public void mo117829g() {
        String b = C32634ae.m125182b(R.string.Calendar_Takeover_NoExternal);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…ndar_Takeover_NoExternal)");
        m122964b(b);
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: i */
    public void mo117831i() {
        String b = C32634ae.m125182b(R.string.Calendar_Takeover_NoTakeover);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…ndar_Takeover_NoTakeover)");
        m122964b(b);
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: j */
    public void mo117832j() {
        DialogC32259a aVar = this.f82481f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialog");
        }
        aVar.show();
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: o */
    public void mo117837o() {
        SheetMenu sheetMenu = this.f82480e;
        if (sheetMenu == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSheetMenu");
        }
        sheetMenu.mo117896a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: p */
    public void mo117838p() {
        SheetMenu sheetMenu = this.f82480e;
        if (sheetMenu == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSheetMenu");
        }
        sheetMenu.dismiss();
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: q */
    public void mo117839q() {
        DialogC32259a aVar = this.f82481f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialog");
        }
        aVar.dismiss();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/preempt/PreemptView$showReservePerson$1", "Lcom/ss/android/lark/calendar/impl/utils/IFakeAvatarCreator;", "createFakeAvatar", "Landroid/graphics/Bitmap;", "getAvatarFileName", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.d$f */
    public static final class C32250f implements IFakeAvatarCreator {

        /* renamed from: a */
        final /* synthetic */ PreemptView f82490a;

        /* renamed from: b */
        final /* synthetic */ CalendarEventCreator f82491b;

        @Override // com.ss.android.lark.calendar.impl.utils.IFakeAvatarCreator
        /* renamed from: b */
        public String mo110401b() {
            return this.f82491b.getChatterId() + ".jpg";
        }

        @Override // com.ss.android.lark.calendar.impl.utils.IFakeAvatarCreator
        /* renamed from: a */
        public Bitmap mo110400a() {
            boolean z;
            int dp2px = UIUtils.dp2px(this.f82490a.f82477b, BitmapDescriptorFactory.HUE_RED);
            String name = this.f82491b.getName();
            if (name.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int length = name.length() - 1;
                if (name != null) {
                    name = name.substring(length);
                    Intrinsics.checkExpressionValueIsNotNull(name, "(this as java.lang.String).substring(startIndex)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return C57860r.m224569a(UIUtils.dp2px(this.f82490a.f82477b, 27.0f), dp2px, name);
        }

        C32250f(PreemptView dVar, CalendarEventCreator calendarEventCreator) {
            this.f82490a = dVar;
            this.f82491b = calendarEventCreator;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: b */
    public void mo117823b() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f82476a.findViewById(R.id.preemptLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mRootView.preemptLoadingView");
        calendarLoadingView.setVisibility(8);
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: c */
    public void mo117825c() {
        String b = C32634ae.m125182b(R.string.Calendar_Takeover_Failed);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…Calendar_Takeover_Failed)");
        m122964b(b);
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: d */
    public void mo117826d() {
        String b = C32634ae.m125182b(R.string.Calendar_Takeover_StopTakeover);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…ar_Takeover_StopTakeover)");
        m122964b(b);
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: l */
    public void mo117834l() {
        RequestLoadingDialog requestLoadingDialog = this.f82484i;
        if (requestLoadingDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHigherLoadingToast");
        }
        requestLoadingDialog.mo112592c(R.string.Calendar_Takeover_FailTakeover);
        RequestLoadingDialog requestLoadingDialog2 = this.f82484i;
        if (requestLoadingDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHigherLoadingToast");
        }
        requestLoadingDialog2.show();
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: m */
    public void mo117835m() {
        RequestLoadingDialog requestLoadingDialog = this.f82484i;
        if (requestLoadingDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHigherLoadingToast");
        }
        requestLoadingDialog.mo112592c(R.string.Calendar_SubscribeCalendar_OperationFailed);
        RequestLoadingDialog requestLoadingDialog2 = this.f82484i;
        if (requestLoadingDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHigherLoadingToast");
        }
        requestLoadingDialog2.show();
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: n */
    public void mo117836n() {
        RequestLoadingDialog requestLoadingDialog = this.f82484i;
        if (requestLoadingDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHigherLoadingToast");
        }
        requestLoadingDialog.mo112586a(R.string.Calendar_Takeover_TimeReserved, 2000);
        RequestLoadingDialog requestLoadingDialog2 = this.f82484i;
        if (requestLoadingDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHigherLoadingToast");
        }
        requestLoadingDialog2.show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/preempt/PreemptView$showSpareTimeProgressBar$1", "Lcom/ss/android/lark/calendar/impl/features/preempt/listener/OnSpareTimeFinishListener;", "onTimeFinish", "", "onTimeUnFinish", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.d$g */
    public static final class C32251g implements OnSpareTimeFinishListener {

        /* renamed from: a */
        final /* synthetic */ PreemptView f82492a;

        @Override // com.ss.android.lark.calendar.impl.features.preempt.listener.OnSpareTimeFinishListener
        /* renamed from: a */
        public void mo117853a() {
            TextView textView = (TextView) this.f82492a.f82476a.findViewById(R.id.preemptBtn);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.preemptBtn");
            textView.setEnabled(true);
            TextView textView2 = (TextView) this.f82492a.f82476a.findViewById(R.id.preemptBtn);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mRootView.preemptBtn");
            textView2.setClickable(true);
            PreemptView.m122962a(this.f82492a).mo117840a();
            this.f82492a.f82482g = true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.preempt.listener.OnSpareTimeFinishListener
        /* renamed from: b */
        public void mo117854b() {
            TextView textView = (TextView) this.f82492a.f82476a.findViewById(R.id.preemptBtn);
            Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.preemptBtn");
            textView.setEnabled(false);
            TextView textView2 = (TextView) this.f82492a.f82476a.findViewById(R.id.preemptBtn);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mRootView.preemptBtn");
            textView2.setClickable(false);
            PreemptView.m122962a(this.f82492a).mo117843b();
            if (this.f82492a.f82482g) {
                if (PreemptView.m122966d(this.f82492a).isShowing()) {
                    PreemptView.m122966d(this.f82492a).dismiss();
                }
                if (PreemptView.m122963b(this.f82492a).isShowing()) {
                    PreemptView.m122963b(this.f82492a).dismiss();
                }
            }
            this.f82492a.f82482g = false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32251g(PreemptView dVar) {
            this.f82492a = dVar;
        }
    }

    /* renamed from: s */
    private final void m122968s() {
        View findViewById = this.f82476a.findViewById(R.id.meetingRoomDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.meetingRoomDivider");
        findViewById.setAlpha(0.5f);
        View findViewById2 = this.f82476a.findViewById(R.id.timeDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.timeDivider");
        findViewById2.setAlpha(0.5f);
        View findViewById3 = this.f82476a.findViewById(R.id.bottomDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mRootView.bottomDivider");
        findViewById3.setAlpha(0.5f);
    }

    /* renamed from: u */
    private final void m122970u() {
        SheetMenu sheetMenu = new SheetMenu(this.f82477b, 2131886425);
        this.f82480e = sheetMenu;
        if (sheetMenu == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSheetMenu");
        }
        sheetMenu.mo117898a(new C32248d(this));
        SheetMenu sheetMenu2 = this.f82480e;
        if (sheetMenu2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSheetMenu");
        }
        sheetMenu2.setOnDismissListener(new DialogInterface$OnDismissListenerC32249e(this));
    }

    /* renamed from: w */
    private final void m122972w() {
        ((TextView) this.f82476a.findViewById(R.id.preemptBtn)).setOnClickListener(new View$OnClickListenerC32246b(this));
        ((RelativeLayout) this.f82476a.findViewById(R.id.reservePersonContainer)).setOnClickListener(new View$OnClickListenerC32247c(this));
    }

    /* renamed from: x */
    private final void m122973x() {
        ((CommonTitleBar) this.f82476a.findViewById(R.id.preemptTitleBar)).setLeftImageResource(R.drawable.ud_icon_left_outlined);
        ((CommonTitleBar) this.f82476a.findViewById(R.id.preemptTitleBar)).setTitle(C32634ae.m125182b(R.string.Calendar_Takeover_Takeover));
        ((CommonTitleBar) this.f82476a.findViewById(R.id.preemptTitleBar)).setMainTitleSize(17.0f);
        ((CommonTitleBar) this.f82476a.findViewById(R.id.preemptTitleBar)).setMainTitleTextStyle(1);
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: a */
    public void mo117816a() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f82476a.findViewById(R.id.preemptLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mRootView.preemptLoadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) this.f82476a.findViewById(R.id.preemptLoadingView)).setLoadingText(C32634ae.m125182b(R.string.Calendar_Takeover_Loading));
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: k */
    public void mo117833k() {
        DialogC32259a aVar = this.f82481f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialog");
        }
        if (!aVar.isShowing()) {
            SheetMenu sheetMenu = this.f82480e;
            if (sheetMenu == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSheetMenu");
            }
            if (!sheetMenu.isShowing()) {
                RequestLoadingDialog requestLoadingDialog = this.f82484i;
                if (requestLoadingDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHigherLoadingToast");
                }
                requestLoadingDialog.mo112592c(R.string.Calendar_Takeover_FailLoad);
                RequestLoadingDialog requestLoadingDialog2 = this.f82484i;
                if (requestLoadingDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHigherLoadingToast");
                }
                requestLoadingDialog2.show();
            }
        }
    }

    /* renamed from: t */
    private final void m122969t() {
        DialogC32259a aVar = new DialogC32259a(this.f82477b);
        this.f82481f = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialog");
        }
        aVar.mo117914a(new C32245a(this));
        DialogC32259a aVar2 = this.f82481f;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialog");
        }
        aVar2.setCanceledOnTouchOutside(false);
        DialogC32259a aVar3 = this.f82481f;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialog");
        }
        aVar3.setCancelable(false);
        DialogC32259a aVar4 = this.f82481f;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialog");
        }
        Window window = aVar4.getWindow();
        if (window != null) {
            window.setDimAmount(0.3f);
        }
    }

    /* renamed from: v */
    private final void m122971v() {
        Context context = this.f82477b;
        if (context != null) {
            RequestLoadingDialog requestLoadingDialog = new RequestLoadingDialog((Activity) context);
            this.f82483h = requestLoadingDialog;
            if (requestLoadingDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
            }
            requestLoadingDialog.mo112594e(SmActions.ACTION_ONTHECALL_EXIT);
            Context context2 = this.f82477b;
            if (context2 != null) {
                RequestLoadingDialog requestLoadingDialog2 = new RequestLoadingDialog((Activity) context2);
                this.f82484i = requestLoadingDialog2;
                if (requestLoadingDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHigherLoadingToast");
                }
                requestLoadingDialog2.mo112594e(SmEvents.EVENT_NONET);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: h */
    public void mo117830h() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f82476a.findViewById(R.id.preemptReservedErrorView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mRootView.preemptReservedErrorView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) this.f82476a.findViewById(R.id.preemptReservedErrorView)).setErrorTipPanel(C57582a.m223614c(this.f82477b, R.drawable.illustration_placeholder_common_no_meeting_room));
        ((CalendarLoadingView) this.f82476a.findViewById(R.id.preemptReservedErrorView)).setErrorText(C32634ae.m125182b(R.string.Calendar_Takeover_Allday));
        ((CalendarLoadingView) this.f82476a.findViewById(R.id.preemptReservedErrorView)).bringToFront();
        int a = C57582a.m223601a(this.f82477b, 16.0f);
        ((CalendarLoadingView) this.f82476a.findViewById(R.id.preemptReservedErrorView)).mo116403a(a, C57582a.m223601a(this.f82477b, 80.0f), a, 0);
        ((CalendarLoadingView) this.f82476a.findViewById(R.id.preemptReservedErrorView)).mo116405c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/preempt/PreemptView$initDialog$1", "Lcom/ss/android/lark/calendar/impl/features/preempt/listener/OnConfirmDialogClickListener;", "onConfirmButtonClick", "", "isChecked", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.d$a */
    public static final class C32245a implements OnConfirmDialogClickListener {

        /* renamed from: a */
        final /* synthetic */ PreemptView f82485a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32245a(PreemptView dVar) {
            this.f82485a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.preempt.listener.OnConfirmDialogClickListener
        /* renamed from: a */
        public void mo117846a(boolean z) {
            PreemptView.m122962a(this.f82485a).mo117842a(z);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(PreemptContract.IPreemptView.ViewDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f82479d = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.d$b */
    public static final class View$OnClickListenerC32246b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreemptView f82486a;

        View$OnClickListenerC32246b(PreemptView dVar) {
            this.f82486a = dVar;
        }

        public final void onClick(View view) {
            GeneralHitPoint.m124247g();
            PreemptView.m122962a(this.f82486a).mo117844c();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ PreemptContract.IPreemptView.ViewDelegate m122962a(PreemptView dVar) {
        PreemptContract.IPreemptView.ViewDelegate aVar = dVar.f82479d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ SheetMenu m122963b(PreemptView dVar) {
        SheetMenu sheetMenu = dVar.f82480e;
        if (sheetMenu == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSheetMenu");
        }
        return sheetMenu;
    }

    /* renamed from: c */
    public static final /* synthetic */ String m122965c(PreemptView dVar) {
        String str = dVar.f82478c;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatterId");
        }
        return str;
    }

    /* renamed from: d */
    public static final /* synthetic */ DialogC32259a m122966d(PreemptView dVar) {
        DialogC32259a aVar = dVar.f82481f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialog");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.d$c */
    public static final class View$OnClickListenerC32247c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreemptView f82487a;

        View$OnClickListenerC32247c(PreemptView dVar) {
            this.f82487a = dVar;
        }

        public final void onClick(View view) {
            C30022a.f74882a.oldModuleDependency().mo108285a(this.f82487a.f82477b, PreemptView.m122965c(this.f82487a), (String) null, (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.d$e */
    public static final class DialogInterface$OnDismissListenerC32249e implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ PreemptView f82489a;

        DialogInterface$OnDismissListenerC32249e(PreemptView dVar) {
            this.f82489a = dVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            PreemptView.m122963b(this.f82489a).mo117897a(0);
            PreemptView.m122963b(this.f82489a).mo117900b();
        }
    }

    public PreemptView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f82476a = view;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        this.f82477b = context;
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: a */
    public void mo117820a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "meetingRoomStr");
        TextView textView = (TextView) this.f82476a.findViewById(R.id.meetingRoomTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.meetingRoomTv");
        textView.setText(str);
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: b */
    public void mo117824b(ArrayList<SheetItemData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "itemList");
        SheetMenu sheetMenu = this.f82480e;
        if (sheetMenu == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSheetMenu");
        }
        if (sheetMenu.isShowing()) {
            SheetMenu sheetMenu2 = this.f82480e;
            if (sheetMenu2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSheetMenu");
            }
            sheetMenu2.mo117899a(arrayList);
        }
    }

    /* renamed from: b */
    private final void m122964b(String str) {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f82476a.findViewById(R.id.preemptLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mRootView.preemptLoadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) this.f82476a.findViewById(R.id.preemptLoadingView)).setErrorTipPanel(C57582a.m223614c(this.f82477b, R.drawable.illustration_empty_negative_load_failed));
        ((CalendarLoadingView) this.f82476a.findViewById(R.id.preemptLoadingView)).setErrorText(str);
        ((CalendarLoadingView) this.f82476a.findViewById(R.id.preemptLoadingView)).bringToFront();
        ((CalendarLoadingView) this.f82476a.findViewById(R.id.preemptLoadingView)).mo116405c();
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: a */
    public void mo117819a(CalendarEventCreator calendarEventCreator) {
        Intrinsics.checkParameterIsNotNull(calendarEventCreator, "eventCreator");
        CalendarLoadAvatarUtil.m125306a(this.f82477b, (SelectableRoundedImageView) this.f82476a.findViewById(R.id.ivPreemptAvatar), 27, 27, calendarEventCreator.getAvatarKey(), calendarEventCreator.getChatterId(), new C32250f(this, calendarEventCreator));
        this.f82478c = calendarEventCreator.getChatterId();
        TextView textView = (TextView) this.f82476a.findViewById(R.id.reservePersonTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.reservePersonTv");
        textView.setText(calendarEventCreator.getName());
        RelativeLayout relativeLayout = (RelativeLayout) this.f82476a.findViewById(R.id.reservePersonContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.reservePersonContainer");
        relativeLayout.setVisibility(0);
        View findViewById = this.f82476a.findViewById(R.id.timeDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.timeDivider");
        findViewById.setVisibility(0);
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: a */
    public void mo117822a(ArrayList<SheetItemData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "itemList");
        SheetMenu sheetMenu = this.f82480e;
        if (sheetMenu == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSheetMenu");
        }
        sheetMenu.mo117899a(arrayList);
        Context context = this.f82477b;
        SheetMenu sheetMenu2 = this.f82480e;
        if (sheetMenu2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSheetMenu");
        }
        C58339d.m226194a(context, sheetMenu2);
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: a */
    public void mo117817a(long j, long j2) {
        SpareTimeProgressBar spareTimeProgressBar = (SpareTimeProgressBar) this.f82476a.findViewById(R.id.spareTimeProgress);
        Intrinsics.checkExpressionValueIsNotNull(spareTimeProgressBar, "mRootView.spareTimeProgress");
        spareTimeProgressBar.setVisibility(0);
        TextView textView = (TextView) this.f82476a.findViewById(R.id.preemptBtn);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.preemptBtn");
        textView.setVisibility(0);
        ((SpareTimeProgressBar) this.f82476a.findViewById(R.id.spareTimeProgress)).mo117910a(j, j2, new C32251g(this));
        SheetMenu sheetMenu = this.f82480e;
        if (sheetMenu == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSheetMenu");
        }
        if (sheetMenu.isShowing()) {
            PreemptContract.IPreemptView.ViewDelegate aVar = this.f82479d;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            aVar.mo117845d();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: a */
    public void mo117818a(long j, boolean z) {
        SheetMenu sheetMenu = this.f82480e;
        if (sheetMenu == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSheetMenu");
        }
        if (sheetMenu.isShowing()) {
            LKUIToast.show(this.f82477b, C32634ae.m125182b(R.string.Calendar_Takeover_TimeChange));
        } else if (z) {
            RequestLoadingDialog requestLoadingDialog = this.f82484i;
            if (requestLoadingDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHigherLoadingToast");
            }
            requestLoadingDialog.mo112586a(R.string.Calendar_Takeover_TimeChange, 2000);
            RequestLoadingDialog requestLoadingDialog2 = this.f82484i;
            if (requestLoadingDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHigherLoadingToast");
            }
            requestLoadingDialog2.show();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView
    /* renamed from: a */
    public void mo117821a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "spareTime");
        TextView textView = (TextView) this.f82476a.findViewById(R.id.timeTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.timeTv");
        textView.setText(str);
        if (z) {
            TextView textView2 = (TextView) this.f82476a.findViewById(R.id.tvSpareTime);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "mRootView.tvSpareTime");
            textView2.setVisibility(0);
            return;
        }
        TextView textView3 = (TextView) this.f82476a.findViewById(R.id.tvSpareTime);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "mRootView.tvSpareTime");
        textView3.setVisibility(8);
    }
}
