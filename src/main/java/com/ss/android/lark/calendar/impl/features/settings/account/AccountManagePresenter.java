package com.ss.android.lark.calendar.impl.features.settings.account;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget.ExchangeLoginFragment;
import com.ss.android.lark.calendar.impl.features.local.C31934h;
import com.ss.android.lark.calendar.impl.features.settings.CalendarSettingViewData;
import com.ss.android.lark.calendar.impl.features.settings.LocalCalAccountFragment;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountManageContract;
import com.ss.android.lark.calendar.impl.features.settings.oneaccount.OneAccountManageFragment;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32650g;
import com.ss.android.lark.calendar.impl.utils.ThirdPartAccountSPUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000©\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n*\u0003\u001d#,\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002WXB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJZ\u00106\u001a\u00020728\u00108\u001a4\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:09j\u001e\u0012\u0004\u0012\u000200\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020;0:j\b\u0012\u0004\u0012\u00020;`=`<2\u0016\u0010>\u001a\u0012\u0012\u0004\u0012\u00020?0:j\b\u0012\u0004\u0012\u00020?`=H\u0002JZ\u0010@\u001a\u00020728\u0010A\u001a4\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:09j\u001e\u0012\u0004\u0012\u000200\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020;0:j\b\u0012\u0004\u0012\u00020;`=`<2\u0016\u0010>\u001a\u0012\u0012\u0004\u0012\u00020?0:j\b\u0012\u0004\u0012\u00020?`=H\u0002J8\u0010B\u001a\u0002072\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u0002000:j\b\u0012\u0004\u0012\u000200`=2\u0016\u0010>\u001a\u0012\u0012\u0004\u0012\u00020?0:j\b\u0012\u0004\u0012\u00020?`=H\u0002J\b\u0010D\u001a\u000207H\u0016J\b\u0010E\u001a\u00020\u0004H\u0014J\b\u0010F\u001a\u000207H\u0016J\u0018\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020HH\u0002J \u0010K\u001a\u0002072\u0006\u0010L\u001a\u00020H2\u0006\u0010M\u001a\u00020H2\b\u0010N\u001a\u0004\u0018\u00010OJ\u0006\u0010P\u001a\u000207J¢\u0001\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020?0:j\b\u0012\u0004\u0012\u00020?`=28\u0010A\u001a4\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:09j\u001e\u0012\u0004\u0012\u000200\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020;0:j\b\u0012\u0004\u0012\u00020;`=`<28\u00108\u001a4\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:09j\u001e\u0012\u0004\u0012\u000200\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020;0:j\b\u0012\u0004\u0012\u00020;`=`<2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u0002000:j\b\u0012\u0004\u0012\u000200`=J\b\u0010R\u001a\u000207H\u0002J\b\u0010S\u001a\u000207H\u0002J\b\u0010T\u001a\u000207H\u0002J\b\u0010U\u001a\u000207H\u0002J\b\u0010V\u001a\u000207H\u0002R&\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u00020#X\u000e¢\u0006\u0004\n\u0002\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u00020,X\u0004¢\u0006\u0004\n\u0002\u0010-R6\u0010.\u001a\u001e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00170/j\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0017`1X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006Y"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageModel;", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageView;", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageView$ViewDelegate;", "model", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageModel;", "view", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageView;", "fragmentDependency", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$FragmentDependency;", "(Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageModel;Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageView;Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$FragmentDependency;)V", "fragment", "Lcom/ss/android/lark/calendar/impl/features/settings/account/GoogleAccountManageFragment;", "fragment$annotations", "()V", "getFragment", "()Lcom/ss/android/lark/calendar/impl/features/settings/account/GoogleAccountManageFragment;", "setFragment", "(Lcom/ss/android/lark/calendar/impl/features/settings/account/GoogleAccountManageFragment;)V", "getFragmentDependency", "()Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$FragmentDependency;", "fragmentIsShowing", "", "getFragmentIsShowing", "()Z", "setFragmentIsShowing", "(Z)V", "localCalDelegate", "com/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$localCalDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$localCalDelegate$1;", "mBindGoogleNotificationPushListener", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "mCalendarSyncNotificationPushListener", "mExchangeLoginDelegate", "com/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$mExchangeLoginDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$mExchangeLoginDelegate$1;", "mExchangeLoginFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment;", "mLocalCalAccountFragment", "Lcom/ss/android/lark/calendar/impl/features/settings/LocalCalAccountFragment;", "mOneAccountManageFragment", "Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageFragment;", "oneAccountManageDelegate", "com/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$oneAccountManageDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$oneAccountManageDelegate$1;", "thirdPartAccountSetting", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getThirdPartAccountSetting", "()Ljava/util/HashMap;", "setThirdPartAccountSetting", "(Ljava/util/HashMap;)V", "addExchangeAccount", "", "exchangeCalMap", "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/LinkedHashMap;", "Lkotlin/collections/ArrayList;", "dataList", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "addGoogleAccount", "googleCalMap", "addLocalAccount", "localCalAcc", "create", "createViewDelegate", "destroy", "getPosition", "", "index", "mapSize", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "parseData", "refreshAccountData", "registerBindGoogleNotificationPush", "registerCalendarSyncNotificationPush", "unRegisterBindGoogleNotificationPush", "unRegisterCalendarSyncNotificationPush", "FragmentDependency", "PresenterViewDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.f */
public final class AccountManagePresenter extends BasePresenter<AccountManageContract.IAccountManageModel, AccountManageContract.IAccountManageView, AccountManageContract.IAccountManageView.ViewDelegate> {

    /* renamed from: a */
    public OneAccountManageFragment f83061a;

    /* renamed from: b */
    public ExchangeLoginFragment f83062b;

    /* renamed from: c */
    public LocalCalAccountFragment f83063c;

    /* renamed from: d */
    public final C32414c f83064d = new C32414c(this);

    /* renamed from: e */
    public final C32416e f83065e = new C32416e(this);

    /* renamed from: f */
    public C32415d f83066f = new C32415d(this);

    /* renamed from: g */
    private AbstractC32524a f83067g;

    /* renamed from: h */
    private AbstractC32524a f83068h;

    /* renamed from: i */
    private GoogleAccountManageFragment f83069i;

    /* renamed from: j */
    private boolean f83070j;

    /* renamed from: k */
    private HashMap<String, Boolean> f83071k = new HashMap<>();

    /* renamed from: l */
    private final FragmentDependency f83072l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$FragmentDependency;", "", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "finishActivity", "getActivityContext", "Landroid/app/Activity;", "hideFragment", "showFragment", "showImportCalendar", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.f$a */
    public interface FragmentDependency {
        /* renamed from: a */
        Activity mo118442a();

        /* renamed from: a */
        void mo118443a(Fragment fragment);

        /* renamed from: a */
        void mo118444a(Fragment fragment, int i);

        /* renamed from: b */
        void mo118445b();

        /* renamed from: b */
        void mo118446b(Fragment fragment);

        /* renamed from: c */
        void mo118447c();
    }

    /* renamed from: a */
    private final int m123718a(int i, int i2) {
        if (i == 0 && i == i2 - 1) {
            return 3;
        }
        if (i == 0) {
            return 0;
        }
        return i == i2 - 1 ? 2 : 1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$PresenterViewDelegate;", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageView$ViewDelegate;", "model", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageModel;", "view", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageView;", "(Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter;Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageModel;Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageView;)V", "delegate", "Lcom/ss/android/lark/calendar/impl/features/settings/account/FragmentDelegate;", "getDelegate", "()Lcom/ss/android/lark/calendar/impl/features/settings/account/FragmentDelegate;", "setDelegate", "(Lcom/ss/android/lark/calendar/impl/features/settings/account/FragmentDelegate;)V", "getModel", "()Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageModel;", "getView", "()Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageView;", "cancelImport", "", "title", "", "hasLocalCalendar", "", "onBackPressed", "onClickFragmentBack", "onShowImportCalendar", "onShowImportExchangeCalendar", "onShowImportLocalCalendar", "openGoogleAccountManageFragment", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "openOneAccountManageFragment", "setFragmentDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.f$b */
    public final class PresenterViewDelegate implements AccountManageContract.IAccountManageView.ViewDelegate {

        /* renamed from: a */
        public FragmentDelegate f83074a;

        /* renamed from: b */
        final /* synthetic */ AccountManagePresenter f83075b;

        /* renamed from: c */
        private final AccountManageContract.IAccountManageModel f83076c;

        /* renamed from: d */
        private final AccountManageContract.IAccountManageView f83077d;

        /* renamed from: f */
        public final AccountManageContract.IAccountManageView mo118466f() {
            return this.f83077d;
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageContract.IAccountManageView.ViewDelegate
        /* renamed from: a */
        public void mo118431a() {
            this.f83075b.mo118459f().mo118447c();
        }

        /* renamed from: d */
        public final FragmentDelegate mo118464d() {
            FragmentDelegate hVar = this.f83074a;
            if (hVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
            }
            return hVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageContract.IAccountManageView.ViewDelegate
        /* renamed from: c */
        public void mo118434c() {
            Activity a = this.f83075b.mo118459f().mo118442a();
            if (a != null) {
                C32650g.m125313b(a);
                C32650g.m125310a(a, new C32413b(this));
            }
        }

        /* renamed from: e */
        public void mo118465e() {
            this.f83075b.mo118458e();
            this.f83075b.mo118459f().mo118446b(this.f83075b.mo118450a());
            this.f83075b.mo118454a(false);
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageContract.IAccountManageView.ViewDelegate
        /* renamed from: b */
        public void mo118433b() {
            ExchangeLoginFragment aVar = this.f83075b.f83062b;
            if (aVar != null) {
                this.f83075b.mo118459f().mo118443a(aVar);
                aVar.mo109628a("");
            } else {
                AccountManagePresenter fVar = this.f83075b;
                fVar.f83062b = new ExchangeLoginFragment("", fVar.f83066f);
                this.f83075b.mo118459f().mo118444a(this.f83075b.f83062b, this.f83077d.mo118430b().getId());
            }
            this.f83075b.mo118454a(true);
        }

        /* renamed from: a */
        public void mo118461a(FragmentDelegate hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "delegate");
            this.f83074a = hVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$PresenterViewDelegate$cancelImport$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "success", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.f$b$a */
        public static final class C32412a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ PresenterViewDelegate f83078a;

            /* renamed from: b */
            final /* synthetic */ String f83079b;

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public /* synthetic */ void onSuccess(Boolean bool) {
                mo118467a(bool.booleanValue());
            }

            /* renamed from: a */
            public void mo118467a(boolean z) {
                this.f83078a.mo118464d().mo118478a(z);
                C30076a.m111290a().mo108431c();
                ThirdPartAccountSPUtil.f83748a.mo120317a(this.f83079b);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                this.f83078a.mo118464d().mo118479b();
                C30076a.m111290a().mo108431c();
            }

            C32412a(PresenterViewDelegate bVar, String str) {
                this.f83078a = bVar;
                this.f83079b = str;
            }
        }

        /* renamed from: a */
        public void mo118462a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            this.f83076c.mo118427a(str, new C32412a(this, str));
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageContract.IAccountManageView.ViewDelegate
        /* renamed from: a */
        public void mo118432a(AccountDataListItem aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!C30022a.f74883b.mo112712t()) {
                mo118463b(aVar);
                return;
            }
            OneAccountManageFragment bVar = this.f83075b.f83061a;
            if (bVar != null) {
                bVar.mo118529a(aVar);
                this.f83075b.mo118459f().mo118443a(bVar);
            } else {
                AccountManagePresenter fVar = this.f83075b;
                fVar.f83061a = new OneAccountManageFragment(fVar.f83065e, aVar, this.f83075b.mo118455b(), false, 8, null);
                this.f83075b.mo118459f().mo118444a(this.f83075b.f83061a, this.f83077d.mo118430b().getId());
            }
            this.f83075b.mo118454a(true);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGranted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.f$b$b */
        static final class C32413b implements C32650g.AbstractC32653a {

            /* renamed from: a */
            final /* synthetic */ PresenterViewDelegate f83080a;

            C32413b(PresenterViewDelegate bVar) {
                this.f83080a = bVar;
            }

            @Override // com.ss.android.lark.calendar.impl.utils.C32650g.AbstractC32653a
            /* renamed from: a */
            public final void mo109663a(boolean z) {
                if (z) {
                    CalendarSettingViewData calendarSettingViewData = new CalendarSettingViewData();
                    C31934h.m121506a().mo116561b();
                    C31934h a = C31934h.m121506a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "LocalSettingManager.getInstance()");
                    calendarSettingViewData.setLocalCalAccSetting(a.mo116563c());
                    LocalCalAccountFragment localCalAccountFragment = this.f83080a.f83075b.f83063c;
                    if (localCalAccountFragment != null) {
                        localCalAccountFragment.mo118344a(calendarSettingViewData);
                        this.f83080a.f83075b.mo118459f().mo118443a(localCalAccountFragment);
                    } else {
                        this.f83080a.f83075b.f83063c = new LocalCalAccountFragment(this.f83080a.f83075b.f83064d, calendarSettingViewData);
                        this.f83080a.f83075b.mo118459f().mo118444a(this.f83080a.f83075b.f83063c, this.f83080a.mo118466f().mo118430b().getId());
                    }
                    this.f83080a.f83075b.mo118454a(true);
                    this.f83080a.f83075b.mo118458e();
                    GeneralHitPoint.f83331a.mo118715B("local");
                    EventBus.getDefault().trigger(new C32493l());
                }
            }
        }

        /* renamed from: b */
        public void mo118463b(AccountDataListItem aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            GoogleAccountManageFragment a = this.f83075b.mo118450a();
            if (a != null) {
                FragmentDelegate hVar = this.f83074a;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegate");
                }
                hVar.mo118477a(aVar);
                this.f83075b.mo118459f().mo118443a(a);
            } else {
                AccountManagePresenter fVar = this.f83075b;
                fVar.mo118453a(new GoogleAccountManageFragment(this, aVar, fVar.mo118455b()));
                this.f83075b.mo118459f().mo118444a(this.f83075b.mo118450a(), this.f83077d.mo118430b().getId());
            }
            this.f83075b.mo118454a(true);
        }

        public PresenterViewDelegate(AccountManagePresenter fVar, AccountManageContract.IAccountManageModel aVar, AccountManageContract.IAccountManageView bVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "model");
            Intrinsics.checkParameterIsNotNull(bVar, "view");
            this.f83075b = fVar;
            this.f83076c = aVar;
            this.f83077d = bVar;
        }
    }

    /* renamed from: a */
    public final GoogleAccountManageFragment mo118450a() {
        return this.f83069i;
    }

    /* renamed from: b */
    public final HashMap<String, Boolean> mo118455b() {
        return this.f83071k;
    }

    /* renamed from: f */
    public final FragmentDependency mo118459f() {
        return this.f83072l;
    }

    /* renamed from: h */
    private final void m123723h() {
        if (this.f83067g != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_BIND_GOOGLE_NOTIFICATION, this.f83067g);
        }
    }

    /* renamed from: j */
    private final void m123725j() {
        if (this.f83068h != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_SYNC_NOTIFICATION, this.f83068h);
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo118458e();
        m123722g();
        m123724i();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        m123723h();
        m123725j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$localCalDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/settings/LocalCalAccountFragment$Delegate;", "onBackPressed", "", "onSavePressed", "accountName", "", "isVisible", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.f$c */
    public static final class C32414c implements LocalCalAccountFragment.AbstractC32383a {

        /* renamed from: a */
        final /* synthetic */ AccountManagePresenter f83081a;

        @Override // com.ss.android.lark.calendar.impl.features.settings.LocalCalAccountFragment.AbstractC32383a
        /* renamed from: a */
        public void mo109659a() {
            this.f83081a.mo118459f().mo118446b(this.f83081a.f83063c);
            this.f83081a.mo118454a(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32414c(AccountManagePresenter fVar) {
            this.f83081a = fVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.LocalCalAccountFragment.AbstractC32383a
        /* renamed from: a */
        public void mo109660a(String str, boolean z) {
            C31934h.m121506a().mo116559a(str, z);
            EventBus.getDefault().trigger(new C32493l());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$oneAccountManageDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageFragment$Delegate;", "onClickFragmentBack", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.f$e */
    public static final class C32416e implements OneAccountManageFragment.Delegate {

        /* renamed from: a */
        final /* synthetic */ AccountManagePresenter f83083a;

        @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.OneAccountManageFragment.Delegate
        /* renamed from: a */
        public void mo109788a() {
            this.f83083a.mo118458e();
            this.f83083a.mo118459f().mo118446b(this.f83083a.f83061a);
            this.f83083a.mo118454a(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32416e(AccountManagePresenter fVar) {
            this.f83083a = fVar;
        }
    }

    /* renamed from: g */
    private final void m123722g() {
        this.f83067g = new C32418g(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_BIND_GOOGLE_NOTIFICATION, this.f83067g);
    }

    /* renamed from: i */
    private final void m123724i() {
        this.f83068h = new C32419h(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_SYNC_NOTIFICATION, this.f83068h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AccountManageContract.IAccountManageView.ViewDelegate createViewDelegate() {
        AccountManageContract.IAccountManageModel aVar = (AccountManageContract.IAccountManageModel) getModel();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "model");
        AccountManageContract.IAccountManageView bVar = (AccountManageContract.IAccountManageView) getView();
        Intrinsics.checkExpressionValueIsNotNull(bVar, "view");
        return new PresenterViewDelegate(this, aVar, bVar);
    }

    /* renamed from: e */
    public final void mo118458e() {
        ((AccountManageContract.IAccountManageModel) getModel()).mo118426a(new UIGetDataCallback(new C32417f(this)));
    }

    /* renamed from: c */
    public final void mo118456c() {
        OneAccountManageFragment bVar = this.f83061a;
        if (bVar != null && bVar.mo113714e()) {
            return;
        }
        if (this.f83070j) {
            this.f83072l.mo118446b(this.f83061a);
            this.f83072l.mo118446b(this.f83062b);
            this.f83072l.mo118446b(this.f83063c);
            this.f83072l.mo118446b(this.f83069i);
            this.f83070j = false;
            return;
        }
        this.f83072l.mo118445b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$mExchangeLoginDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment$Delegate;", "onClickFragmentBack", "", "isImportSuc", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.f$d */
    public static final class C32415d implements ExchangeLoginFragment.Delegate {

        /* renamed from: a */
        final /* synthetic */ AccountManagePresenter f83082a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32415d(AccountManagePresenter fVar) {
            this.f83082a = fVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget.ExchangeLoginFragment.Delegate
        /* renamed from: a */
        public void mo109631a(boolean z) {
            this.f83082a.mo118459f().mo118446b(this.f83082a.f83062b);
            this.f83082a.mo118454a(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002:\u00126\u00124\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002j\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0007`\u00060\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016JB\u0010\f\u001a\u00020\t28\u0010\r\u001a4\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002j\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0007`\u0006H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/account/AccountManagePresenter$refreshAccountData$externalMailCb$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/LinkedHashMap;", "", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/LinkedHashMap;", "Lkotlin/collections/ArrayList;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "thirdPartCal", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.f$f */
    public static final class C32417f implements IGetDataCallback<LinkedHashMap<String, ArrayList<Calendar>>> {

        /* renamed from: a */
        final /* synthetic */ AccountManagePresenter f83084a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32417f(AccountManagePresenter fVar) {
            this.f83084a = fVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((AccountManageContract.IAccountManageView) this.f83084a.getView()).mo118428a();
        }

        /* renamed from: a */
        public void onSuccess(LinkedHashMap<String, ArrayList<Calendar>> linkedHashMap) {
            Intrinsics.checkParameterIsNotNull(linkedHashMap, "thirdPartCal");
            Activity a = this.f83084a.mo118459f().mo118442a();
            if (a != null && !a.isDestroyed()) {
                ArrayList<String> arrayList = new ArrayList<>();
                if (C32650g.m125312a(this.f83084a.mo118459f().mo118442a())) {
                    Map<String, Boolean> a2 = ((AccountManageContract.IAccountManageModel) this.f83084a.getModel()).mo118425a();
                    if (a2 != null) {
                        for (String str : ((HashMap) a2).keySet()) {
                            arrayList.add(str);
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.Boolean> /* = java.util.HashMap<kotlin.String, kotlin.Boolean> */");
                    }
                }
                LinkedHashMap<String, ArrayList<Calendar>> linkedHashMap2 = new LinkedHashMap<>();
                LinkedHashMap<String, ArrayList<Calendar>> linkedHashMap3 = new LinkedHashMap<>();
                for (Map.Entry<String, ArrayList<Calendar>> entry : linkedHashMap.entrySet()) {
                    if (!entry.getValue().isEmpty()) {
                        Calendar calendar = entry.getValue().get(0);
                        Intrinsics.checkExpressionValueIsNotNull(calendar, "cal.value[0]");
                        if (calendar.getType() == Calendar.Type.EXCHANGE) {
                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                        }
                        Calendar calendar2 = entry.getValue().get(0);
                        Intrinsics.checkExpressionValueIsNotNull(calendar2, "cal.value[0]");
                        if (calendar2.getType() == Calendar.Type.GOOGLE) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                ArrayList<AccountDataListItem> a3 = this.f83084a.mo118451a(linkedHashMap2, linkedHashMap3, arrayList);
                if (a3.isEmpty()) {
                    ((AccountManageContract.IAccountManageView) this.f83084a.getView()).mo118428a();
                } else {
                    ((AccountManageContract.IAccountManageView) this.f83084a.getView()).mo118429a(a3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo118453a(GoogleAccountManageFragment iVar) {
        this.f83069i = iVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.f$h */
    public static final class C32419h implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ AccountManagePresenter f83086a;

        C32419h(AccountManagePresenter fVar) {
            this.f83086a = fVar;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "it");
            this.f83086a.mo118458e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.f$g */
    public static final class C32418g implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ AccountManagePresenter f83085a;

        C32418g(AccountManagePresenter fVar) {
            this.f83085a = fVar;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Object obj = jSONObject.get("bound");
            String str = null;
            if (!(obj instanceof Boolean)) {
                obj = null;
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                Object obj2 = jSONObject.get("account");
                if (obj2 instanceof String) {
                    str = obj2;
                }
                String str2 = str;
                if (str2 != null && booleanValue) {
                    Boolean bool2 = this.f83085a.mo118455b().get(str2);
                    if (bool2 != null && Intrinsics.areEqual((Object) bool2, (Object) false)) {
                        this.f83085a.mo118455b().put(str2, true);
                        ThirdPartAccountSPUtil.f83748a.mo120317a(str2);
                    }
                    this.f83085a.mo118458e();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo118454a(boolean z) {
        this.f83070j = z;
    }

    /* renamed from: a */
    private final void m123719a(ArrayList<String> arrayList, ArrayList<AccountDataListItem> arrayList2) {
        AccountDataListItem aVar = new AccountDataListItem();
        String b = C32634ae.m125182b(R.string.Calendar_Setting_LocalCalendars);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…r_Setting_LocalCalendars)");
        aVar.mo118400a(b);
        int i = 0;
        aVar.mo118399a(0);
        arrayList2.add(aVar);
        boolean a = C32650g.m125312a(this.f83072l.mo118442a());
        int i2 = !a ? 1 : 0;
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            AccountDataListItem aVar2 = new AccountDataListItem();
            aVar2.mo118399a(1);
            aVar2.mo118407c(true);
            aVar2.mo118400a((String) it.next());
            aVar2.mo118404b(m123718a(i, arrayList.size() + i2));
            arrayList2.add(aVar2);
            i++;
        }
        if (!a) {
            AccountDataListItem aVar3 = new AccountDataListItem();
            aVar3.mo118399a(4);
            aVar3.mo118404b(3);
            arrayList2.add(aVar3);
        }
    }

    /* renamed from: a */
    private final void m123720a(LinkedHashMap<String, ArrayList<Calendar>> linkedHashMap, ArrayList<AccountDataListItem> arrayList) {
        if (!C30022a.f74883b.mo112694b()) {
            AccountDataListItem aVar = new AccountDataListItem();
            String b = C32634ae.m125182b(R.string.Calendar_GoogleCal_Title);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…Calendar_GoogleCal_Title)");
            aVar.mo118400a(b);
            boolean z = false;
            aVar.mo118399a(0);
            arrayList.add(aVar);
            Set<String> keySet = linkedHashMap.keySet();
            Intrinsics.checkExpressionValueIsNotNull(keySet, "googleCalMap.keys");
            int i = 0;
            for (T t : keySet) {
                ArrayList<Calendar> arrayList2 = linkedHashMap.get(t);
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    AccountDataListItem aVar2 = new AccountDataListItem();
                    aVar2.mo118399a(1);
                    aVar2.mo118405b(true);
                    Intrinsics.checkExpressionValueIsNotNull(t, "acc");
                    aVar2.mo118400a((String) t);
                    Intrinsics.checkExpressionValueIsNotNull(arrayList2, "it");
                    aVar2.mo118401a(arrayList2);
                    aVar2.mo118404b(m123718a(i, keySet.size() + 1));
                    arrayList.add(aVar2);
                    z = true;
                }
                i++;
            }
            AccountDataListItem aVar3 = new AccountDataListItem();
            int i2 = 3;
            aVar3.mo118399a(3);
            if (z) {
                i2 = 2;
            }
            aVar3.mo118404b(i2);
            arrayList.add(aVar3);
        }
    }

    /* renamed from: b */
    private final void m123721b(LinkedHashMap<String, ArrayList<Calendar>> linkedHashMap, ArrayList<AccountDataListItem> arrayList) {
        boolean z;
        boolean t = C30022a.f74883b.mo112712t();
        boolean z2 = false;
        if (!t) {
            LinkedHashMap<String, ArrayList<Calendar>> linkedHashMap2 = linkedHashMap;
            if (linkedHashMap2 == null || linkedHashMap2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
        }
        AccountDataListItem aVar = new AccountDataListItem();
        String b = C32634ae.m125182b(R.string.Calendar_Sync_ExchangeCalendar);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…ar_Sync_ExchangeCalendar)");
        aVar.mo118400a(b);
        aVar.mo118399a(0);
        arrayList.add(aVar);
        Set<String> keySet = linkedHashMap.keySet();
        Intrinsics.checkExpressionValueIsNotNull(keySet, "exchangeCalMap.keys");
        int i = 0;
        for (T t2 : keySet) {
            ArrayList<Calendar> arrayList2 = linkedHashMap.get(t2);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                AccountDataListItem aVar2 = new AccountDataListItem();
                aVar2.mo118399a(1);
                aVar2.mo118402a(true);
                Intrinsics.checkExpressionValueIsNotNull(t2, "acc");
                aVar2.mo118400a((String) t2);
                Intrinsics.checkExpressionValueIsNotNull(arrayList2, "it");
                aVar2.mo118401a(arrayList2);
                aVar2.mo118404b(m123718a(i, keySet.size() + 1));
                arrayList.add(aVar2);
                z2 = true;
            }
            i++;
        }
        if (t) {
            AccountDataListItem aVar3 = new AccountDataListItem();
            int i2 = 2;
            aVar3.mo118399a(2);
            if (!z2) {
                i2 = 3;
            }
            aVar3.mo118404b(i2);
            arrayList.add(aVar3);
        }
    }

    /* renamed from: a */
    public final void mo118452a(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            mo118458e();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountManagePresenter(AccountManageModel eVar, AccountManageView gVar, FragmentDependency aVar) {
        super(eVar, gVar);
        Intrinsics.checkParameterIsNotNull(eVar, "model");
        Intrinsics.checkParameterIsNotNull(gVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "fragmentDependency");
        this.f83072l = aVar;
        ThirdPartAccountSPUtil.m125202a(new IGetDataCallback<HashMap<String, Boolean>>(this) {
            /* class com.ss.android.lark.calendar.impl.features.settings.account.AccountManagePresenter.C324111 */

            /* renamed from: a */
            final /* synthetic */ AccountManagePresenter f83073a;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f83073a = r1;
            }

            /* renamed from: a */
            public void onSuccess(HashMap<String, Boolean> hashMap) {
                if (hashMap != null) {
                    Set<Map.Entry<String, Boolean>> entrySet = hashMap.entrySet();
                    Intrinsics.checkExpressionValueIsNotNull(entrySet, "settings.entries");
                    for (T t : entrySet) {
                        Object key = t.getKey();
                        Intrinsics.checkExpressionValueIsNotNull(key, "it.key");
                        Object value = t.getValue();
                        Intrinsics.checkExpressionValueIsNotNull(value, "it.value");
                        this.f83073a.mo118455b().put(key, value);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final ArrayList<AccountDataListItem> mo118451a(LinkedHashMap<String, ArrayList<Calendar>> linkedHashMap, LinkedHashMap<String, ArrayList<Calendar>> linkedHashMap2, ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(linkedHashMap, "googleCalMap");
        Intrinsics.checkParameterIsNotNull(linkedHashMap2, "exchangeCalMap");
        Intrinsics.checkParameterIsNotNull(arrayList, "localCalAcc");
        ArrayList<AccountDataListItem> arrayList2 = new ArrayList<>();
        boolean t = C30022a.f74883b.mo112712t();
        if ((linkedHashMap2.isEmpty() || !t) && linkedHashMap.isEmpty() && arrayList.isEmpty()) {
            return arrayList2;
        }
        m123720a(linkedHashMap, arrayList2);
        if (t) {
            m123721b(linkedHashMap2, arrayList2);
        }
        m123719a(arrayList, arrayList2);
        return arrayList2;
    }
}
