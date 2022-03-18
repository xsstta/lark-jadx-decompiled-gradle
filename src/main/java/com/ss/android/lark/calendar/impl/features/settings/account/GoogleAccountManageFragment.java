package com.ss.android.lark.calendar.impl.features.settings.account;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountManagePresenter;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.ThirdPartAccountSPUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "use OneAccountManageFragment")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\n\u0010\u0003\u001a\u00060\u0004R\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\u0002\u0010\rJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010*\u001a\u00020\u0015H\u0002J\b\u0010+\u001a\u00020\u0015H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u00060\u0004R\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/GoogleAccountManageFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "Lcom/ss/android/lark/calendar/impl/features/settings/account/FragmentDelegate;", "presenter", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$PresenterViewDelegate;", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "googleCalAccSetting", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "(Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$PresenterViewDelegate;Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;Ljava/util/HashMap;)V", "getData", "()Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "setData", "(Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;)V", "mLoadingToast", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "cancelImportFail", "", "cancelImportSuccess", "success", "initAccount", "initCancelBtn", "initLoading", "initMailButton", "initTitleBar", "initView", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshData", "removeAccount", "saveAndReload", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.i */
public final class GoogleAccountManageFragment extends View$OnClickListenerC31538b implements FragmentDelegate {

    /* renamed from: a */
    public HashMap<String, Boolean> f83108a;

    /* renamed from: b */
    private RequestLoadingDialog f83109b;

    /* renamed from: e */
    private final AccountManagePresenter.PresenterViewDelegate f83110e;

    /* renamed from: f */
    private AccountDataListItem f83111f;

    /* renamed from: g */
    private HashMap f83112g;

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f83112g == null) {
            this.f83112g = new HashMap();
        }
        View view = (View) this.f83112g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f83112g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f83112g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    /* renamed from: f */
    public final AccountDataListItem mo118482f() {
        return this.f83111f;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        this.f83110e.mo118465e();
        return true;
    }

    /* renamed from: g */
    private final void m123774g() {
        m123775h();
        m123776i();
        m123777j();
        m123778k();
        m123779l();
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.account.FragmentDelegate
    /* renamed from: b */
    public void mo118479b() {
        RequestLoadingDialog requestLoadingDialog = this.f83109b;
        if (requestLoadingDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
        }
        requestLoadingDialog.mo112592c(R.string.Calendar_GoogleCal_TryLater);
        RequestLoadingDialog requestLoadingDialog2 = this.f83109b;
        if (requestLoadingDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
        }
        requestLoadingDialog2.show();
    }

    /* renamed from: c */
    public final void mo118480c() {
        RequestLoadingDialog requestLoadingDialog = this.f83109b;
        if (requestLoadingDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
        }
        requestLoadingDialog.mo112585a(R.string.Calendar_GoogleCal_Canceling);
        this.f83110e.mo118462a(this.f83111f.mo118403b());
    }

    /* renamed from: d */
    public final void mo118481d() {
        ThirdPartAccountSPUtil.f83748a.mo120318a(this.f83108a);
        EventBus.getDefault().trigger(new C32493l());
    }

    /* renamed from: h */
    private final void m123775h() {
        Context context = getContext();
        if (context != null) {
            RequestLoadingDialog requestLoadingDialog = new RequestLoadingDialog((Activity) context);
            this.f83109b = requestLoadingDialog;
            if (requestLoadingDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
            }
            requestLoadingDialog.mo112594e(SmActions.ACTION_ONTHECALL_EXIT);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: i */
    private final void m123776i() {
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setTitle(C32634ae.m125182b(R.string.Calendar_GoogleCal_CalendarAccountsManagement));
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setLeftClickListener(new View$OnClickListenerC32429c(this));
    }

    /* renamed from: j */
    private final void m123777j() {
        LinearLayout linearLayout = (LinearLayout) mo109250a(R.id.container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "container");
        linearLayout.setVisibility(0);
        TextView textView = (TextView) mo109250a(R.id.tvAccount);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvAccount");
        textView.setText(this.f83111f.mo118403b());
    }

    /* renamed from: k */
    private final void m123778k() {
        TextView textView = (TextView) mo109250a(R.id.cancelBt);
        Intrinsics.checkExpressionValueIsNotNull(textView, "cancelBt");
        textView.setText(C32634ae.m125182b(R.string.Calendar_GoogleCal_CancelImport));
        ((TextView) mo109250a(R.id.cancelBt)).setOnClickListener(new View$OnClickListenerC32426a(this));
    }

    /* renamed from: l */
    private final void m123779l() {
        Boolean bool = this.f83108a.get(this.f83111f.mo118403b());
        if (bool == null) {
            bool = true;
        }
        UDSwitch uDSwitch = (UDSwitch) mo109250a(R.id.switchBtn);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "switchBtn");
        uDSwitch.setChecked(bool.booleanValue());
        ((UDSwitch) mo109250a(R.id.switchBtn)).setOnCheckedChangeListener(new C32427b(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.i$a */
    public static final class View$OnClickListenerC32426a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GoogleAccountManageFragment f83113a;

        View$OnClickListenerC32426a(GoogleAccountManageFragment iVar) {
            this.f83113a = iVar;
        }

        public final void onClick(View view) {
            this.f83113a.mo118480c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.i$c */
    public static final class View$OnClickListenerC32429c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GoogleAccountManageFragment f83120a;

        View$OnClickListenerC32429c(GoogleAccountManageFragment iVar) {
            this.f83120a = iVar;
        }

        public final void onClick(View view) {
            this.f83120a.mo113714e();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.account.FragmentDelegate
    /* renamed from: a */
    public void mo118477a(AccountDataListItem aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f83111f = aVar;
        m123774g();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "compoundButton", "Landroid/widget/CompoundButton;", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.i$b */
    public static final class C32427b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ GoogleAccountManageFragment f83114a;

        C32427b(GoogleAccountManageFragment iVar) {
            this.f83114a = iVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/account/GoogleAccountManageFragment$initMailButton$1$updateCalendarCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.i$b$a */
        public static final class C32428a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C32427b f83115a;

            /* renamed from: b */
            final /* synthetic */ String f83116b;

            /* renamed from: c */
            final /* synthetic */ String f83117c;

            /* renamed from: d */
            final /* synthetic */ CompoundButton f83118d;

            /* renamed from: e */
            final /* synthetic */ boolean f83119e;

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i(this.f83115a.f83114a.TAG, C32673y.m125373a(this.f83116b, this.f83117c, new String[0]));
                this.f83115a.f83114a.mo118481d();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e(this.f83115a.f83114a.TAG, C32673y.m125370a(this.f83116b, this.f83117c, errorResult));
                this.f83118d.setChecked(!this.f83119e);
            }

            C32428a(C32427b bVar, String str, String str2, CompoundButton compoundButton, boolean z) {
                this.f83115a = bVar;
                this.f83116b = str;
                this.f83117c = str2;
                this.f83118d = compoundButton;
                this.f83119e = z;
            }
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            Intrinsics.checkParameterIsNotNull(compoundButton, "compoundButton");
            String b = this.f83114a.mo118482f().mo118403b();
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
            this.f83114a.f83108a.put(b, Boolean.valueOf(z));
            if (!z) {
                UIGetDataCallback wrapAndAddGetDataCallback = new CallbackManager().wrapAndAddGetDataCallback(new C32428a(this, String.valueOf(new Date().getTime()), "updateCalendar", compoundButton, z));
                Iterator<Calendar> it = this.f83114a.mo118482f().mo118398a().iterator();
                while (it.hasNext()) {
                    Calendar next = it.next();
                    C30076a a = C30076a.m111290a();
                    Intrinsics.checkExpressionValueIsNotNull(next, "cal");
                    a.mo108425a(next.getServerId(), false, (IGetDataCallback<Boolean>) wrapAndAddGetDataCallback);
                }
                EventBus.getDefault().trigger(new C32493l());
                return;
            }
            this.f83114a.mo118481d();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.account.FragmentDelegate
    /* renamed from: a */
    public void mo118478a(boolean z) {
        RequestLoadingDialog requestLoadingDialog = this.f83109b;
        if (requestLoadingDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingToast");
        }
        requestLoadingDialog.dismiss();
        this.f83110e.mo118465e();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m123774g();
    }

    public GoogleAccountManageFragment(AccountManagePresenter.PresenterViewDelegate bVar, AccountDataListItem aVar, HashMap<String, Boolean> hashMap) {
        Intrinsics.checkParameterIsNotNull(bVar, "presenter");
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(hashMap, "googleCalAccSetting");
        this.f83110e = bVar;
        this.f83111f = aVar;
        this.f83108a = hashMap;
        bVar.mo118461a(this);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.fragment_google_account_manage, (ViewGroup) null);
    }
}
