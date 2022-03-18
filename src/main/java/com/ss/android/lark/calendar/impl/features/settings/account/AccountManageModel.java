package com.ss.android.lark.calendar.impl.features.settings.account;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.calendar.impl.features.local.C31934h;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountManageContract;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0010H\u0016JH\u0010\u0011\u001a\u00020\b2>\u0010\n\u001a:\u00126\u00124\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012j\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0016`\u00150\u000bH\u0016R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageModel;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "cancelGoogleCalendar", "", "account", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "create", "destroy", "loadLocalCalendarAccount", "", "loadThirdPartCalendarAccount", "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/LinkedHashMap;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.e */
public final class AccountManageModel extends BaseModel implements AccountManageContract.IAccountManageModel {

    /* renamed from: a */
    public final String f83052a = AccountManageModel.class.getSimpleName();

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    public AccountManageModel() {
        super.create();
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageContract.IAccountManageModel
    /* renamed from: a */
    public Map<String, Boolean> mo118425a() {
        C31934h.m121506a().mo116561b();
        C31934h a = C31934h.m121506a();
        Intrinsics.checkExpressionValueIsNotNull(a, "LocalSettingManager.getInstance()");
        Map<String, Boolean> c = a.mo116563c();
        Intrinsics.checkExpressionValueIsNotNull(c, "LocalSettingManager.getInstance().calAccSettingMap");
        return c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/account/AccountManageModel$cancelGoogleCalendar$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.e$a */
    public static final class C32409a implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AccountManageModel f83053a;

        /* renamed from: b */
        final /* synthetic */ String f83054b;

        /* renamed from: c */
        final /* synthetic */ String f83055c;

        /* renamed from: d */
        final /* synthetic */ IGetDataCallback f83056d;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo118448a(bool.booleanValue());
        }

        /* renamed from: a */
        public void mo118448a(boolean z) {
            Log.m165389i(this.f83053a.f83052a, C32673y.m125373a(this.f83054b, this.f83055c, new String[0]));
            this.f83056d.onSuccess(Boolean.valueOf(z));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(this.f83053a.f83052a, C32673y.m125370a(this.f83054b, this.f83055c, errorResult));
            this.f83056d.onError(errorResult);
        }

        C32409a(AccountManageModel eVar, String str, String str2, IGetDataCallback iGetDataCallback) {
            this.f83053a = eVar;
            this.f83054b = str;
            this.f83055c = str2;
            this.f83056d = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/settings/account/AccountManageModel$loadThirdPartCalendarAccount$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.e$b */
    public static final class C32410b implements IGetDataCallback<List<? extends Calendar>> {

        /* renamed from: a */
        final /* synthetic */ AccountManageModel f83057a;

        /* renamed from: b */
        final /* synthetic */ String f83058b;

        /* renamed from: c */
        final /* synthetic */ String f83059c;

        /* renamed from: d */
        final /* synthetic */ IGetDataCallback f83060d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(this.f83057a.f83052a, C32673y.m125370a(this.f83058b, this.f83059c, errorResult));
            this.f83060d.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            Log.m165389i(this.f83057a.f83052a, C32673y.m125373a(this.f83058b, this.f83059c, "calendars_size", list == null ? "null" : String.valueOf(list.size()) + ""));
            if (list == null) {
                this.f83060d.onError(new ErrorResult("calendars is null"));
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Calendar calendar : list) {
                if ((calendar.getType() == Calendar.Type.GOOGLE || calendar.getType() == Calendar.Type.EXCHANGE) && !TextUtils.isEmpty(calendar.getExternalAccount())) {
                    if (linkedHashMap.containsKey(calendar.getExternalAccount())) {
                        ArrayList arrayList = (ArrayList) linkedHashMap.get(calendar.getExternalAccount());
                        if (arrayList != null) {
                            arrayList.add(calendar);
                        }
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(calendar);
                        String externalAccount = calendar.getExternalAccount();
                        Intrinsics.checkExpressionValueIsNotNull(externalAccount, "cal.externalAccount");
                        linkedHashMap.put(externalAccount, arrayList2);
                    }
                }
            }
            this.f83060d.onSuccess(linkedHashMap);
        }

        C32410b(AccountManageModel eVar, String str, String str2, IGetDataCallback iGetDataCallback) {
            this.f83057a = eVar;
            this.f83058b = str;
            this.f83059c = str2;
            this.f83060d = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageContract.IAccountManageModel
    /* renamed from: a */
    public void mo118426a(IGetDataCallback<LinkedHashMap<String, ArrayList<Calendar>>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(this.f83052a, C32673y.m125376b(valueOf, "loadCalendars", new String[0]));
        C30076a.m111290a().mo108430b(new C32410b(this, valueOf, "loadCalendars", iGetDataCallback));
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.account.AccountManageContract.IAccountManageModel
    /* renamed from: a */
    public void mo118427a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "account");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(this.f83052a, C32673y.m125376b(valueOf, "recallGoogleTokenRequest", new String[0]));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C32409a(this, valueOf, "recallGoogleTokenRequest", iGetDataCallback));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…\n            }\n        })");
        aVar.mo118959c(str, wrapAndAddGetDataCallback);
    }
}
