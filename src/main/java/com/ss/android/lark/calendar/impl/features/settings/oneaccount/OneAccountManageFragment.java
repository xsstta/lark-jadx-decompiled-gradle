package com.ss.android.lark.calendar.impl.features.settings.oneaccount;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.component.CompImportGoogle;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget.ExchangeLoginFragment;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountDataListItem;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001>BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\b\u0010%\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010'\u001a\u00020\u001eH\u0002J\b\u0010(\u001a\u00020\u001eH\u0002J\b\u0010)\u001a\u00020\u001eH\u0002J\b\u0010*\u001a\u00020\u001eH\u0002J\b\u0010+\u001a\u00020\u001eH\u0002J\b\u0010,\u001a\u00020\u001eH\u0002J\b\u0010-\u001a\u00020\tH\u0016J&\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020\u001eH\u0016J\u001a\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u000e\u00109\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010:\u001a\u00020\u001eJ\u0012\u0010;\u001a\u00020\u001e2\b\b\u0002\u0010<\u001a\u00020\bH\u0002J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006?"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "delegate", "Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageFragment$Delegate;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "thirdPartAccountSetting", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "isVerticalOpen", "(Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageFragment$Delegate;Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;Ljava/util/HashMap;Z)V", "compImportGoogle", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/component/CompImportGoogle;", "mChildFragmentShowing", "mExchangeLoginDelegate", "com/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageFragment$mExchangeLoginDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageFragment$mExchangeLoginDelegate$1;", "mExchangeLoginFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment;", "mLoadingToast", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "viewModel", "Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/IOneAccountManageViewModel;", "getViewModel", "()Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/IOneAccountManageViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "hideFragment", "initAccount", "initCancelBtn", "initInvalidationZone", "initLiveData", "initLoading", "initMailButton", "initRootView", "initTitleBar", "initView", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "refreshData", "refreshStatus", "showExchangeLoginFragment", "account", "showFragment", "Delegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.b */
public final class OneAccountManageFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public final CompImportGoogle f83163a;

    /* renamed from: b */
    public RequestLoadingDialog f83164b;

    /* renamed from: e */
    public ExchangeLoginFragment f83165e;

    /* renamed from: f */
    public final Delegate f83166f;

    /* renamed from: g */
    private final Lazy f83167g;

    /* renamed from: h */
    private boolean f83168h;

    /* renamed from: i */
    private C32441j f83169i;

    /* renamed from: j */
    private final boolean f83170j;

    /* renamed from: k */
    private HashMap f83171k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageFragment$Delegate;", "", "onClickFragmentBack", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.b$a */
    public interface Delegate {
        /* renamed from: a */
        void mo109788a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.b$h */
    public static final class View$OnTouchListenerC32439h implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC32439h f83178a = new View$OnTouchListenerC32439h();

        View$OnTouchListenerC32439h() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f83171k == null) {
            this.f83171k = new HashMap();
        }
        View view = (View) this.f83171k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f83171k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f83171k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    public final IOneAccountManageViewModel mo118531b() {
        return (IOneAccountManageViewModel) this.f83167g.getValue();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        if (!this.f83168h) {
            return false;
        }
        mo118528a(this.f83165e);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f83163a.mo109610d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.b$k */
    static final class C32442k extends Lambda implements Function0<OneAccountManageViewModel> {
        final /* synthetic */ AccountDataListItem $data;
        final /* synthetic */ HashMap $thirdPartAccountSetting;
        final /* synthetic */ OneAccountManageFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32442k(OneAccountManageFragment bVar, AccountDataListItem aVar, HashMap hashMap) {
            super(0);
            this.this$0 = bVar;
            this.$data = aVar;
            this.$thirdPartAccountSetting = hashMap;
        }

        @Override // kotlin.jvm.functions.Function0
        public final OneAccountManageViewModel invoke() {
            return (OneAccountManageViewModel) new C1144ai(this.this$0, new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.calendar.impl.features.settings.oneaccount.OneAccountManageFragment.C32442k.C324431 */

                /* renamed from: a */
                final /* synthetic */ C32442k f83181a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f83181a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    return new OneAccountManageViewModel(this.f83181a.$data, this.f83181a.$thirdPartAccountSetting);
                }
            }).mo6005a(OneAccountManageViewModel.class);
        }
    }

    /* renamed from: d */
    private final void m123823d() {
        m123824f();
        m123825g();
        m123826h();
        m123827i();
        m123828j();
        m123829k();
        m123830l();
        m123831m();
    }

    /* renamed from: l */
    private final void m123830l() {
        ((FrameLayout) mo109250a(R.id.oneAccountRootView)).setOnTouchListener(View$OnTouchListenerC32439h.f83178a);
    }

    /* renamed from: f */
    private final void m123824f() {
        Context context = getContext();
        if (context != null) {
            RequestLoadingDialog requestLoadingDialog = new RequestLoadingDialog((Activity) context);
            this.f83164b = requestLoadingDialog;
            if (requestLoadingDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
            }
            requestLoadingDialog.mo112594e(SmActions.ACTION_ONTHECALL_EXIT);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: i */
    private final void m123827i() {
        TextView textView = (TextView) mo109250a(R.id.cancelBt);
        Intrinsics.checkExpressionValueIsNotNull(textView, "cancelBt");
        textView.setText(C32634ae.m125182b(R.string.Calendar_GoogleCal_CancelImport));
        ((TextView) mo109250a(R.id.cancelBt)).setOnClickListener(new View$OnClickListenerC32433b(this));
    }

    /* renamed from: j */
    private final void m123828j() {
        boolean isAccountSwitchOpen = mo118531b().isAccountSwitchOpen();
        UDSwitch uDSwitch = (UDSwitch) mo109250a(R.id.switchBtn);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "switchBtn");
        uDSwitch.setChecked(isAccountSwitchOpen);
        ((UDSwitch) mo109250a(R.id.switchBtn)).setOnCheckedChangeListener(new C32438g(this));
    }

    /* renamed from: k */
    private final void m123829k() {
        int i;
        boolean isExternalPasswordInvalid = mo118531b().isExternalPasswordInvalid();
        LinearLayout linearLayout = (LinearLayout) mo109250a(R.id.invalidationZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "invalidationZone");
        if (isExternalPasswordInvalid) {
            ((TextView) mo109250a(R.id.invalidationRetry)).setOnClickListener(new View$OnClickListenerC32434c(this));
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    /* renamed from: m */
    private final void m123831m() {
        OneAccountManageFragment bVar = this;
        mo118531b().getCancelGoogleLiveData().mo5923a(bVar, new C32435d(this));
        mo118531b().getCancelExchangeLiveData().mo5923a(bVar, new C32436e(this));
        mo118531b().getSwitchAccountLiveData().mo5923a(bVar, new C32437f(this));
    }

    /* renamed from: c */
    public final void mo118532c() {
        int statusBarHeight = StatusBarUtil.getStatusBarHeight(getContext());
        View a = mo109250a(R.id.fake_status);
        Intrinsics.checkExpressionValueIsNotNull(a, "fake_status");
        a.getLayoutParams().height = statusBarHeight;
        mo109250a(R.id.fake_status).setBackgroundColor(C32634ae.m125178a(R.color.bg_base));
        View a2 = mo109250a(R.id.fake_status);
        Intrinsics.checkExpressionValueIsNotNull(a2, "fake_status");
        a2.setVisibility(0);
    }

    /* renamed from: g */
    private final void m123825g() {
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setTitle(C32634ae.m125182b(R.string.Calendar_GoogleCal_CalendarAccountsManagement));
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setMainTitleTextStyle(1);
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setLeftClickListener(new View$OnClickListenerC32440i(this));
        if (this.f83170j) {
            ((CommonTitleBar) mo109250a(R.id.titleBar)).setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        }
    }

    /* renamed from: h */
    private final void m123826h() {
        String str;
        TextView textView = (TextView) mo109250a(R.id.accountTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "accountTitle");
        if (mo118531b().isGoogleAccount()) {
            ((ImageView) mo109250a(R.id.calendarIcon)).setImageDrawable(C32634ae.m125184d(R.drawable.ud_icon_google_colorful));
            str = C32634ae.m125182b(R.string.Calendar_GoogleCal_Title);
        } else {
            ((ImageView) mo109250a(R.id.calendarIcon)).setImageDrawable(C32634ae.m125184d(R.drawable.ud_icon_exchange_colorful));
            str = C32634ae.m125182b(R.string.Calendar_Sync_ExchangeCalendar);
        }
        textView.setText(str);
        LinearLayout linearLayout = (LinearLayout) mo109250a(R.id.container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "container");
        linearLayout.setVisibility(0);
        TextView textView2 = (TextView) mo109250a(R.id.tvAccount);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvAccount");
        textView2.setText(mo118531b().getAccountTitle());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.b$i */
    public static final class View$OnClickListenerC32440i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OneAccountManageFragment f83179a;

        View$OnClickListenerC32440i(OneAccountManageFragment bVar) {
            this.f83179a = bVar;
        }

        public final void onClick(View view) {
            this.f83179a.f83166f.mo109788a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageFragment$mExchangeLoginDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment$Delegate;", "onClickFragmentBack", "", "isImportSuc", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.b$j */
    public static final class C32441j implements ExchangeLoginFragment.Delegate {

        /* renamed from: a */
        final /* synthetic */ OneAccountManageFragment f83180a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32441j(OneAccountManageFragment bVar) {
            this.f83180a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget.ExchangeLoginFragment.Delegate
        /* renamed from: a */
        public void mo109631a(boolean z) {
            OneAccountManageFragment bVar = this.f83180a;
            bVar.mo118528a(bVar.f83165e);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RequestLoadingDialog m123820a(OneAccountManageFragment bVar) {
        RequestLoadingDialog requestLoadingDialog = bVar.f83164b;
        if (requestLoadingDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
        }
        return requestLoadingDialog;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.b$f */
    public static final class C32437f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ OneAccountManageFragment f83176a;

        C32437f(OneAccountManageFragment bVar) {
            this.f83176a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            UDSwitch uDSwitch = (UDSwitch) this.f83176a.mo109250a(R.id.switchBtn);
            Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "switchBtn");
            uDSwitch.setChecked(Intrinsics.areEqual((Object) bool, (Object) true));
        }
    }

    /* renamed from: a */
    public final void mo118529a(AccountDataListItem aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        mo118531b().onAccountDataChange(aVar);
        m123823d();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.b$b */
    public static final class View$OnClickListenerC32433b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OneAccountManageFragment f83172a;

        View$OnClickListenerC32433b(OneAccountManageFragment bVar) {
            this.f83172a = bVar;
        }

        public final void onClick(View view) {
            OneAccountManageFragment.m123820a(this.f83172a).mo112585a(R.string.Calendar_GoogleCal_Canceling);
            GeneralHitPoint.f83331a.mo118715B("remove");
            if (this.f83172a.mo118531b().isExchangeAccount()) {
                this.f83172a.mo118531b().onCancelExchangeCalendar();
            } else if (this.f83172a.mo118531b().isGoogleAccount()) {
                this.f83172a.mo118531b().onCancelGoogleCalendar();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.b$c */
    public static final class View$OnClickListenerC32434c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OneAccountManageFragment f83173a;

        View$OnClickListenerC32434c(OneAccountManageFragment bVar) {
            this.f83173a = bVar;
        }

        public final void onClick(View view) {
            if (this.f83173a.mo118531b().isExchangeAccount()) {
                OneAccountManageFragment bVar = this.f83173a;
                bVar.mo118530a(bVar.mo118531b().getAccountTitle());
            } else if (this.f83173a.mo118531b().isGoogleAccount()) {
                CompImportGoogle aVar = this.f83173a.f83163a;
                TextView textView = (TextView) this.f83173a.mo109250a(R.id.invalidationRetry);
                Intrinsics.checkExpressionValueIsNotNull(textView, "invalidationRetry");
                aVar.mo109605a(textView);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isSuc", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.b$d */
    public static final class C32435d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ OneAccountManageFragment f83174a;

        C32435d(OneAccountManageFragment bVar) {
            this.f83174a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "isSuc");
            if (bool.booleanValue()) {
                OneAccountManageFragment.m123820a(this.f83174a).dismiss();
                this.f83174a.f83166f.mo109788a();
                return;
            }
            OneAccountManageFragment.m123820a(this.f83174a).mo112592c(R.string.Calendar_GoogleCal_TryLater);
            OneAccountManageFragment.m123820a(this.f83174a).show();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isSuc", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.b$e */
    public static final class C32436e<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ OneAccountManageFragment f83175a;

        C32436e(OneAccountManageFragment bVar) {
            this.f83175a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "isSuc");
            if (bool.booleanValue()) {
                OneAccountManageFragment.m123820a(this.f83175a).dismiss();
                this.f83175a.f83166f.mo109788a();
                return;
            }
            OneAccountManageFragment.m123820a(this.f83175a).mo112592c(R.string.Calendar_GoogleCal_TryLater);
            OneAccountManageFragment.m123820a(this.f83175a).show();
        }
    }

    /* renamed from: b */
    private final void m123822b(Fragment fragment) {
        this.f83168h = true;
        getParentFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
        getParentFragmentManager().executePendingTransactions();
    }

    /* renamed from: a */
    public final void mo118528a(Fragment fragment) {
        this.f83168h = false;
        if (fragment != null) {
            getParentFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
            getParentFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: a */
    public final void mo118530a(String str) {
        ExchangeLoginFragment aVar = this.f83165e;
        if (aVar != null) {
            m123822b(aVar);
            aVar.mo109628a(str);
            return;
        }
        ExchangeLoginFragment aVar2 = new ExchangeLoginFragment(str, this.f83169i);
        this.f83165e = aVar2;
        FrameLayout frameLayout = (FrameLayout) mo109250a(R.id.exchangeLoginZone);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "exchangeLoginZone");
        m123821a(aVar2, frameLayout.getId());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "compoundButton", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.b$g */
    public static final class C32438g implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ OneAccountManageFragment f83177a;

        C32438g(OneAccountManageFragment bVar) {
            this.f83177a = bVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            String str2 = "on";
            if (z) {
                str = str2;
            } else {
                str = "off";
            }
            CalendarHitPoint.m124151n(str);
            if (!z) {
                str2 = "off";
            }
            GeneralHitPoint.m124248g(str2);
            this.f83177a.mo118531b().onToggleAccountSwitch(z);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m123823d();
        this.f83163a.mo109609c();
    }

    /* renamed from: a */
    private final void m123821a(Fragment fragment, int i) {
        this.f83168h = true;
        if (fragment != null) {
            getParentFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(i, fragment, (String) null).commitAllowingStateLoss();
            getParentFragmentManager().executePendingTransactions();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.fragment_third_part_one_account_manage, (ViewGroup) null);
    }

    public OneAccountManageFragment(Delegate aVar, AccountDataListItem aVar2, HashMap<String, Boolean> hashMap, boolean z) {
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        Intrinsics.checkParameterIsNotNull(aVar2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(hashMap, "thirdPartAccountSetting");
        this.f83166f = aVar;
        this.f83170j = z;
        this.f83167g = LazyKt.lazy(new C32442k(this, aVar2, hashMap));
        this.f83163a = new CompImportGoogle();
        this.f83169i = new C32441j(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OneAccountManageFragment(Delegate aVar, AccountDataListItem aVar2, HashMap hashMap, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, hashMap, (i & 8) != 0 ? false : z);
    }
}
