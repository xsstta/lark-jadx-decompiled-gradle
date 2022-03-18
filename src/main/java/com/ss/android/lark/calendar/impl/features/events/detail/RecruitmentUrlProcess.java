package com.ss.android.lark.calendar.impl.features.events.detail;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.AbstractC30060b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30027e;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0005H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\"\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J \u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002J\u0006\u0010\u001b\u001a\u00020\nJ\u0006\u0010\u001c\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/RecruitmentUrlProcess;", "", "mContext", "Landroid/content/Context;", "urlStr", "", "(Landroid/content/Context;Ljava/lang/String;)V", "mDialog", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "mIsMatchQuery", "", "mIsMatchUrl", "mUrl", "Ljava/net/URL;", "mUrlStrInQuery", "getPkId", "getVersion", "", "handleError", "", ApiHandler.API_CALLBACK_ERRMSG, "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "handleSuccess", "jsonData", "isMatchQuery", "isMatchUrl", "isRecruitmentUrl", "processRecruitmentUrl", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e */
public final class RecruitmentUrlProcess {

    /* renamed from: c */
    public static final String f79165c;

    /* renamed from: d */
    public static final String f79166d;

    /* renamed from: e */
    public static final Companion f79167e = new Companion(null);

    /* renamed from: a */
    public final RequestLoadingDialog f79168a;

    /* renamed from: b */
    public final Context f79169b;

    /* renamed from: f */
    private String f79170f = "";

    /* renamed from: g */
    private final boolean f79171g;

    /* renamed from: h */
    private final boolean f79172h;

    /* renamed from: i */
    private URL f79173i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/RecruitmentUrlProcess$Companion;", "", "()V", "ERR_VERSION", "", "PEOPLE_URL", "", "getPEOPLE_URL", "()Ljava/lang/String;", "QUERY_VERSION", "TAG", "URL_HOST", "getURL_HOST", "URL_PATH_PREX", "URL_PROTOCAL", "URL_QUERY_INTERCEPTION", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e$b */
    public static final class RunnableC31259b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecruitmentUrlProcess f79174a;

        RunnableC31259b(RecruitmentUrlProcess eVar) {
            this.f79174a = eVar;
        }

        public final void run() {
            this.f79174a.f79168a.mo112592c(R.string.Calendar_Toast_Retry);
        }
    }

    /* renamed from: b */
    public final boolean mo113586b() {
        if (this.f79171g || this.f79172h) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e$c */
    public static final class RunnableC31260c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecruitmentUrlProcess f79175a;

        /* renamed from: b */
        final /* synthetic */ String f79176b;

        RunnableC31260c(RecruitmentUrlProcess eVar, String str) {
            this.f79175a = eVar;
            this.f79176b = str;
        }

        public final void run() {
            if ((this.f79175a.f79169b instanceof Activity) && UIUtils.isActivityRunning((Activity) this.f79175a.f79169b)) {
                this.f79175a.f79168a.dismiss();
                C30022a.f74882a.chatModuleDependency().mo108222a(this.f79175a.f79169b, this.f79176b);
            }
        }
    }

    static {
        String b = C30022a.f74882a.dynamicConfigModuleDependency().mo108235b();
        f79165c = b;
        f79166d = "https://" + b + "/api/recruitment/interview/chat/hr/";
    }

    /* renamed from: c */
    private final boolean m117144c() {
        String str;
        boolean z;
        String path;
        URL url = this.f79173i;
        String str2 = null;
        if (url != null) {
            str = url.getProtocol();
        } else {
            str = null;
        }
        boolean areEqual = Intrinsics.areEqual(str, "https");
        URL url2 = this.f79173i;
        if (url2 != null) {
            str2 = url2.getHost();
        }
        boolean areEqual2 = Intrinsics.areEqual(str2, f79165c);
        URL url3 = this.f79173i;
        if (url3 == null || (path = url3.getPath()) == null || StringsKt.indexOf$default((CharSequence) path, "/recruitment/chat/", 0, false, 6, (Object) null) != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!areEqual || !areEqual2 || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final boolean m117145d() {
        String str;
        URL url = this.f79173i;
        if (url == null || (str = url.getQuery()) == null) {
            str = "";
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : StringsKt.split$default((CharSequence) str2, new String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (Object) null)) {
            List split$default = StringsKt.split$default((CharSequence) str3, new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 0, 6, (Object) null);
            if (split$default.size() >= 2 && Intrinsics.areEqual((String) split$default.get(0), "need_lark_interception_jump_to_chat")) {
                try {
                    String decode = URLDecoder.decode((String) split$default.get(1), "UTF-8");
                    new URL(decode);
                    Intrinsics.checkExpressionValueIsNotNull(decode, "decodeURL");
                    this.f79170f = decode;
                    return true;
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private final String m117146e() {
        String str;
        URL url = this.f79173i;
        String str2 = "";
        if (url == null || (str = url.getPath()) == null) {
            str = str2;
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, "/recruitment/chat/", 0, false, 6, (Object) null);
        if (indexOf$default < 0) {
            return str2;
        }
        int i = indexOf$default + 18;
        int length = str.length();
        while (i < length && str.charAt(i) != '/' && str.charAt(i) != '?') {
            str2 = str2 + str.charAt(i);
            i++;
        }
        return str2;
    }

    /* renamed from: f */
    private final int m117147f() {
        String str;
        URL url = this.f79173i;
        if (url == null || (str = url.getQuery()) == null) {
            str = "";
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return -1;
        }
        for (String str3 : StringsKt.split$default((CharSequence) str2, new String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (Object) null)) {
            List split$default = StringsKt.split$default((CharSequence) str3, new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 0, 6, (Object) null);
            if (split$default.size() >= 2 && Intrinsics.areEqual((String) split$default.get(0), HiAnalyticsConstant.HaKey.BI_KEY_VERSION)) {
                try {
                    return Integer.parseInt((String) split$default.get(1));
                } catch (Exception e) {
                    C3474b.m14692a(e);
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo113583a() {
        if (this.f79171g) {
            this.f79168a.mo112585a(R.string.Calendar_Toast_Entering);
            String e = m117146e();
            HashMap<String, Object> hashMap = new HashMap<>();
            HashMap<String, Object> hashMap2 = hashMap;
            hashMap2.put("interviewer_pk", e);
            int f = m117147f();
            if (f != -1) {
                hashMap2.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, Integer.valueOf(f));
            }
            String l = Long.toString(new Date().getTime());
            Log.m165389i("RecruitmentUrlProcess", C32673y.m125376b(l, "recruitmentUrlRequestPost", new String[0]));
            AbstractC30060b bVar = C30022a.f74882a;
            Intrinsics.checkExpressionValueIsNotNull(bVar, "CalendarDependencyHolder.dependency");
            bVar.getHttpRequestDependency().doPost(f79166d, "multipart/form-data", hashMap, new C31261d(this, l, "recruitmentUrlRequestPost"));
        } else if (this.f79172h) {
            this.f79168a.mo112585a(R.string.Calendar_Toast_Entering);
            String l2 = Long.toString(new Date().getTime());
            AbstractC30060b bVar2 = C30022a.f74882a;
            Intrinsics.checkExpressionValueIsNotNull(bVar2, "CalendarDependencyHolder.dependency");
            bVar2.getHttpRequestDependency().doGet(this.f79170f, new HashMap<>(), new C31262e(this, l2, "recruitmentUrlRequestGet"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/RecruitmentUrlProcess$processRecruitmentUrl$1", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IHttpResponseCallBack;", "onError", "", "errorMsg", "", "onSuccess", "jsonData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e$d */
    public static final class C31261d implements AbstractC30027e {

        /* renamed from: a */
        final /* synthetic */ RecruitmentUrlProcess f79177a;

        /* renamed from: b */
        final /* synthetic */ String f79178b;

        /* renamed from: c */
        final /* synthetic */ String f79179c;

        @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30027e
        /* renamed from: a */
        public void mo108165a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "jsonData");
            RecruitmentUrlProcess eVar = this.f79177a;
            String str2 = this.f79178b;
            Intrinsics.checkExpressionValueIsNotNull(str2, "contextId");
            eVar.mo113584a(str, str2, this.f79179c);
        }

        @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30027e
        /* renamed from: b */
        public void mo108166b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "errorMsg");
            RecruitmentUrlProcess eVar = this.f79177a;
            String str2 = this.f79178b;
            Intrinsics.checkExpressionValueIsNotNull(str2, "contextId");
            eVar.mo113585b(str, str2, this.f79179c);
        }

        C31261d(RecruitmentUrlProcess eVar, String str, String str2) {
            this.f79177a = eVar;
            this.f79178b = str;
            this.f79179c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/RecruitmentUrlProcess$processRecruitmentUrl$2", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IHttpResponseCallBack;", "onError", "", "errorMsg", "", "onSuccess", "jsonData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e$e */
    public static final class C31262e implements AbstractC30027e {

        /* renamed from: a */
        final /* synthetic */ RecruitmentUrlProcess f79180a;

        /* renamed from: b */
        final /* synthetic */ String f79181b;

        /* renamed from: c */
        final /* synthetic */ String f79182c;

        @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30027e
        /* renamed from: a */
        public void mo108165a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "jsonData");
            RecruitmentUrlProcess eVar = this.f79180a;
            String str2 = this.f79181b;
            Intrinsics.checkExpressionValueIsNotNull(str2, "contextId");
            eVar.mo113584a(str, str2, this.f79182c);
        }

        @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30027e
        /* renamed from: b */
        public void mo108166b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "errorMsg");
            RecruitmentUrlProcess eVar = this.f79180a;
            String str2 = this.f79181b;
            Intrinsics.checkExpressionValueIsNotNull(str2, "contextId");
            eVar.mo113585b(str, str2, this.f79182c);
        }

        C31262e(RecruitmentUrlProcess eVar, String str, String str2) {
            this.f79180a = eVar;
            this.f79181b = str;
            this.f79182c = str2;
        }
    }

    public RecruitmentUrlProcess(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(str, "urlStr");
        this.f79169b = context;
        try {
            this.f79173i = new URL(str);
        } catch (Exception e) {
            C3474b.m14692a(e);
        }
        this.f79171g = m117144c();
        this.f79172h = m117145d();
        Context context2 = this.f79169b;
        if (context2 != null) {
            RequestLoadingDialog requestLoadingDialog = new RequestLoadingDialog((Activity) context2);
            this.f79168a = requestLoadingDialog;
            requestLoadingDialog.mo112594e(100);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: b */
    public final void mo113585b(String str, String str2, String str3) {
        UICallbackExecutor.post(new RunnableC31259b(this));
        Log.m165383e("RecruitmentUrlProcess", C32673y.m125371a(str2, str3, str));
    }

    /* renamed from: a */
    public final void mo113584a(String str, String str2, String str3) {
        try {
            String string = new JSONObject(str).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString("chat_id");
            Log.m165389i("RecruitmentUrlProcess", C32673y.m125373a(str2, str3, "chatId", string));
            UICallbackExecutor.post(new RunnableC31260c(this, string));
        } catch (Exception e) {
            C3474b.m14692a(e);
            mo113585b(e.getMessage(), str2, str3);
        }
    }
}
