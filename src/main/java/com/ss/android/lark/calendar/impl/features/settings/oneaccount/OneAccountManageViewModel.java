package com.ss.android.lark.calendar.impl.features.settings.oneaccount;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountDataListItem;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.ThirdPartAccountSPUtil;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\t¢\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/IOneAccountManageViewModel;", "accountData", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "thirdPartAccountSetting", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "(Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;Ljava/util/HashMap;)V", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "cancelExchangeLiveData", "Landroidx/lifecycle/MutableLiveData;", "getCancelExchangeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "cancelGoogleLiveData", "getCancelGoogleLiveData", "switchAccountLiveData", "getSwitchAccountLiveData", "destroy", "", "getAccountTitle", "isAccountSwitchOpen", "isExchangeAccount", "isExternalPasswordInvalid", "isGoogleAccount", "onAccountDataChange", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onCancelExchangeCalendar", "onCancelGoogleCalendar", "onToggleAccountSwitch", "isVisible", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.c */
public final class OneAccountManageViewModel extends AbstractC1142af implements IOneAccountManageViewModel {
    public static final Companion Companion = new Companion(null);
    public AccountDataListItem accountData;
    private CallbackManager callbackManager = new CallbackManager();
    private final C1177w<Boolean> cancelExchangeLiveData = new C1177w<>();
    private final C1177w<Boolean> cancelGoogleLiveData = new C1177w<>();
    private final C1177w<Boolean> switchAccountLiveData = new C1177w<>();
    public final HashMap<String, Boolean> thirdPartAccountSetting;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageViewModel$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.IOneAccountManageViewModel
    public C1177w<Boolean> getCancelExchangeLiveData() {
        return this.cancelExchangeLiveData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.IOneAccountManageViewModel
    public C1177w<Boolean> getCancelGoogleLiveData() {
        return this.cancelGoogleLiveData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.IOneAccountManageViewModel
    public C1177w<Boolean> getSwitchAccountLiveData() {
        return this.switchAccountLiveData;
    }

    public void destroy() {
        this.callbackManager.cancelCallbacks();
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.IOneAccountManageViewModel
    public String getAccountTitle() {
        return this.accountData.mo118403b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.IOneAccountManageViewModel
    public boolean isExchangeAccount() {
        return this.accountData.mo118408d();
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.IOneAccountManageViewModel
    public boolean isGoogleAccount() {
        return this.accountData.mo118409e();
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.IOneAccountManageViewModel
    public boolean isAccountSwitchOpen() {
        Boolean bool = this.thirdPartAccountSetting.get(this.accountData.mo118403b());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.IOneAccountManageViewModel
    public boolean isExternalPasswordInvalid() {
        ArrayList<Calendar> a = this.accountData.mo118398a();
        if ((a instanceof Collection) && a.isEmpty()) {
            return false;
        }
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            if (it.next().isExternalPasswordInvalid()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.IOneAccountManageViewModel
    public void onCancelExchangeCalendar() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("OneAccountManageViewModel", C32673y.m125376b(valueOf, "cancelExchangeCalendar", new String[0]));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        List<String> listOf = CollectionsKt.listOf(this.accountData.mo118403b());
        UIGetDataCallback wrapAndAddGetDataCallback = this.callbackManager.wrapAndAddGetDataCallback(new C32444b(this, valueOf, "cancelExchangeCalendar"));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…         }\n            })");
        aVar.mo118956b(listOf, wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.IOneAccountManageViewModel
    public void onCancelGoogleCalendar() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("OneAccountManageViewModel", C32673y.m125376b(valueOf, "recallGoogleTokenRequest", new String[0]));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        String b = this.accountData.mo118403b();
        UIGetDataCallback wrapAndAddGetDataCallback = this.callbackManager.wrapAndAddGetDataCallback(new C32445c(this, valueOf, "recallGoogleTokenRequest"));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…         }\n            })");
        aVar.mo118959c(b, wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.IOneAccountManageViewModel
    public void onAccountDataChange(AccountDataListItem aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.accountData = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageViewModel$onCancelExchangeCalendar$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "isSuc", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.c$b */
    public static final class C32444b implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ OneAccountManageViewModel f83182a;

        /* renamed from: b */
        final /* synthetic */ String f83183b;

        /* renamed from: c */
        final /* synthetic */ String f83184c;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo118542a(bool.booleanValue());
        }

        /* renamed from: a */
        public void mo118542a(boolean z) {
            Log.m165389i("OneAccountManageViewModel", C32673y.m125373a(this.f83183b, this.f83184c, new String[0]));
            if (z) {
                C30076a.m111290a().mo108431c();
                ThirdPartAccountSPUtil.f83748a.mo120317a(this.f83182a.accountData.mo118403b());
            }
            this.f83182a.getCancelExchangeLiveData().mo5929b(Boolean.valueOf(z));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("OneAccountManageViewModel", C32673y.m125370a(this.f83183b, this.f83184c, errorResult));
            C30076a.m111290a().mo108431c();
            this.f83182a.getCancelExchangeLiveData().mo5929b((Boolean) false);
        }

        C32444b(OneAccountManageViewModel cVar, String str, String str2) {
            this.f83182a = cVar;
            this.f83183b = str;
            this.f83184c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageViewModel$onCancelGoogleCalendar$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "isSuc", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.c$c */
    public static final class C32445c implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ OneAccountManageViewModel f83185a;

        /* renamed from: b */
        final /* synthetic */ String f83186b;

        /* renamed from: c */
        final /* synthetic */ String f83187c;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo118543a(bool.booleanValue());
        }

        /* renamed from: a */
        public void mo118543a(boolean z) {
            Log.m165389i("OneAccountManageViewModel", C32673y.m125373a(this.f83186b, this.f83187c, new String[0]));
            if (z) {
                C30076a.m111290a().mo108431c();
                ThirdPartAccountSPUtil.f83748a.mo120317a(this.f83185a.accountData.mo118403b());
            }
            this.f83185a.getCancelGoogleLiveData().mo5929b(Boolean.valueOf(z));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("OneAccountManageViewModel", C32673y.m125370a(this.f83186b, this.f83187c, errorResult));
            C30076a.m111290a().mo108431c();
            this.f83185a.getCancelGoogleLiveData().mo5929b((Boolean) false);
        }

        C32445c(OneAccountManageViewModel cVar, String str, String str2) {
            this.f83185a = cVar;
            this.f83186b = str;
            this.f83187c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageViewModel$onToggleAccountSwitch$updateCalendarCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.c$d */
    public static final class C32446d implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ OneAccountManageViewModel f83188a;

        /* renamed from: b */
        final /* synthetic */ String f83189b;

        /* renamed from: c */
        final /* synthetic */ String f83190c;

        /* renamed from: d */
        final /* synthetic */ boolean f83191d;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            Log.m165389i("OneAccountManageViewModel", C32673y.m125373a(this.f83189b, this.f83190c, new String[0]));
            ThirdPartAccountSPUtil.f83748a.mo120318a(this.f83188a.thirdPartAccountSetting);
            EventBus.getDefault().trigger(new C32493l());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("OneAccountManageViewModel", C32673y.m125370a(this.f83189b, this.f83190c, errorResult));
            this.f83188a.getSwitchAccountLiveData().mo5929b(Boolean.valueOf(!this.f83191d));
        }

        C32446d(OneAccountManageViewModel cVar, String str, String str2, boolean z) {
            this.f83188a = cVar;
            this.f83189b = str;
            this.f83190c = str2;
            this.f83191d = z;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.IOneAccountManageViewModel
    public void onToggleAccountSwitch(boolean z) {
        this.thirdPartAccountSetting.put(this.accountData.mo118403b(), Boolean.valueOf(z));
        if (!z) {
            UIGetDataCallback wrapAndAddGetDataCallback = new CallbackManager().wrapAndAddGetDataCallback(new C32446d(this, String.valueOf(new Date().getTime()), "updateCalendar", z));
            Iterator<Calendar> it = this.accountData.mo118398a().iterator();
            while (it.hasNext()) {
                Calendar next = it.next();
                C30076a a = C30076a.m111290a();
                Intrinsics.checkExpressionValueIsNotNull(next, "cal");
                a.mo108425a(next.getServerId(), false, (IGetDataCallback<Boolean>) wrapAndAddGetDataCallback);
            }
            EventBus.getDefault().trigger(new C32493l());
            return;
        }
        ThirdPartAccountSPUtil.f83748a.mo120318a(this.thirdPartAccountSetting);
        EventBus.getDefault().trigger(new C32493l());
    }

    public OneAccountManageViewModel(AccountDataListItem aVar, HashMap<String, Boolean> hashMap) {
        Intrinsics.checkParameterIsNotNull(aVar, "accountData");
        Intrinsics.checkParameterIsNotNull(hashMap, "thirdPartAccountSetting");
        this.accountData = aVar;
        this.thirdPartAccountSetting = hashMap;
    }
}
