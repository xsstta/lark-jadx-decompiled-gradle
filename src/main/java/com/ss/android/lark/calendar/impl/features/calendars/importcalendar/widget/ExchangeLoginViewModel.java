package com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget;

import android.util.Base64;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarServerService;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.calendars.BindingExchangeAccountResponse;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0017J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/IExchangeLoginViewModel;", "()V", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "loginResultLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/pb/calendars/BindingExchangeAccountResponse$State;", "getLoginResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "serverHelperLinkLiveData", "", "getServerHelperLinkLiveData", "destroy", "", "onExecuteLogin", "account", "password", "url", "onLoadServerHelperLink", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.c */
public final class ExchangeLoginViewModel extends AbstractC1142af implements IExchangeLoginViewModel {
    public static final Companion Companion = new Companion(null);
    private CallbackManager callbackManager = new CallbackManager();
    private final C1177w<BindingExchangeAccountResponse.State> loginResultLiveData = new C1177w<>();
    private final C1177w<String> serverHelperLinkLiveData = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginViewModel$Companion;", "", "()V", "LINK_KEY_EXCHANGE", "", "LINK_KEY_OUT_LOOK", "TAG", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget.IExchangeLoginViewModel
    public C1177w<BindingExchangeAccountResponse.State> getLoginResultLiveData() {
        return this.loginResultLiveData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget.IExchangeLoginViewModel
    public C1177w<String> getServerHelperLinkLiveData() {
        return this.serverHelperLinkLiveData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget.IExchangeLoginViewModel
    public void destroy() {
        this.callbackManager.cancelCallbacks();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget.IExchangeLoginViewModel
    public void onLoadServerHelperLink() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("ExchangeLoginViewModel", C32673y.m125376b(valueOf, "loadExchangeServerHelperUrl", new String[0]));
        String str = "exchange_helper";
        if (getLoginResultLiveData().mo5927b() == BindingExchangeAccountResponse.State.FORBIDDENT_ERROR) {
            str = "outlook_helper";
        } else if (BindingExchangeAccountResponse.State.NEED_SERVER_URL != BindingExchangeAccountResponse.State.NEED_SERVER_URL) {
            Log.m165383e("ExchangeLoginViewModel", C32673y.m125378d("loginResultLiveData.value = " + getLoginResultLiveData().mo5927b()));
        }
        CalendarSDKService.f83473a.mo118966f(this.callbackManager.wrapAndAddGetDataCallback(new C30362c(this, valueOf, "loadExchangeServerHelperUrl", str)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginViewModel$onExecuteLogin$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/calendars/BindingExchangeAccountResponse$State;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "state", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.c$b */
    public static final class C30361b implements IGetDataCallback<BindingExchangeAccountResponse.State> {

        /* renamed from: a */
        final /* synthetic */ ExchangeLoginViewModel f76015a;

        /* renamed from: b */
        final /* synthetic */ String f76016b;

        /* renamed from: c */
        final /* synthetic */ String f76017c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ExchangeLoginViewModel", C32673y.m125370a(this.f76016b, this.f76017c, errorResult));
            this.f76015a.getLoginResultLiveData().mo5929b(BindingExchangeAccountResponse.State.UNKNOWN_ERROR);
        }

        /* renamed from: a */
        public void onSuccess(BindingExchangeAccountResponse.State state) {
            Log.m165389i("ExchangeLoginViewModel", C32673y.m125376b(this.f76016b, this.f76017c, "state", String.valueOf(state)));
            if (state != null) {
                this.f76015a.getLoginResultLiveData().mo5929b(state);
            }
        }

        C30361b(ExchangeLoginViewModel cVar, String str, String str2) {
            this.f76015a = cVar;
            this.f76016b = str;
            this.f76017c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginViewModel$onLoadServerHelperLink$uiCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lorg/json/JSONObject;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "configJson", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.c$c */
    public static final class C30362c implements IGetDataCallback<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ ExchangeLoginViewModel f76018a;

        /* renamed from: b */
        final /* synthetic */ String f76019b;

        /* renamed from: c */
        final /* synthetic */ String f76020c;

        /* renamed from: d */
        final /* synthetic */ String f76021d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f76018a.getServerHelperLinkLiveData().mo5929b((String) null);
            Log.m165383e("ExchangeLoginViewModel", C32673y.m125370a(this.f76019b, this.f76020c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            String str;
            String str2 = this.f76019b;
            String str3 = this.f76020c;
            String[] strArr = new String[2];
            strArr[0] = "configJson";
            String str4 = null;
            if (jSONObject != null) {
                str = jSONObject.toString();
            } else {
                str = null;
            }
            strArr[1] = str;
            Log.m165389i("ExchangeLoginViewModel", C32673y.m125373a(str2, str3, strArr));
            if (jSONObject != null) {
                Object obj = jSONObject.get(this.f76021d);
                if (obj instanceof String) {
                    str4 = obj;
                }
                String str5 = str4;
                if (str5 != null) {
                    this.f76018a.getServerHelperLinkLiveData().mo5929b(str5);
                }
            }
        }

        C30362c(ExchangeLoginViewModel cVar, String str, String str2, String str3) {
            this.f76018a = cVar;
            this.f76019b = str;
            this.f76020c = str2;
            this.f76021d = str3;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget.IExchangeLoginViewModel
    public void onExecuteLogin(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "account");
        Intrinsics.checkParameterIsNotNull(str2, "password");
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("ExchangeLoginViewModel", C32673y.m125376b(valueOf, "executeLogin", new String[0]));
        byte[] bytes = str2.getBytes(Charsets.f173341a);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        UIGetDataCallback wrapAndAddGetDataCallback = this.callbackManager.wrapAndAddGetDataCallback(new C30361b(this, valueOf, "executeLogin"));
        if (wrapAndAddGetDataCallback != null) {
            CalendarServerService.m124813a(str, encodeToString, str3, wrapAndAddGetDataCallback);
        }
    }
}
