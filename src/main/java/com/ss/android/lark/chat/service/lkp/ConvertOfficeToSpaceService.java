package com.ss.android.lark.chat.service.lkp;

import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.http.p1186a.AbstractC25988d;
import com.larksuite.framework.http.p1187b.AbstractC25990b;
import com.larksuite.framework.http.request.C26010a;
import com.larksuite.framework.http.request.HttpHeaders;
import com.larksuite.framework.http.request.HttpMethod;
import com.larksuite.framework.http.request.HttpParams;
import com.larksuite.framework.http.request.RequestBody;
import com.larksuite.framework.http.response.BaseResponse;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36498n;
import com.ss.android.lark.dto.p1814c.C36867a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/service/lkp/ConvertOfficeToSpaceService;", "Lcom/ss/android/lark/chat/service/lkp/IConvertOfficeToSpaceService;", "()V", "UrlPattern", "", "mAppConfigDependency", "Lcom/ss/android/lark/dependency/IChatModuleDependency$IAppConfigDependency;", "mDocDependency", "Lcom/ss/android/lark/dependency/IDocDependency;", "buildConvertUrl", "messageId", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/dependency/IDocDependency$DocConvertToken;", "convertFileMessageToSpaceUrl", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getAppId", "", "config", "Lcom/ss/android/lark/dto/lkp/DocAppUserConfig;", "baseUrl", "getDocDomains", "getPasswordFreeSession", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.service.b.a */
public final class ConvertOfficeToSpaceService implements IConvertOfficeToSpaceService {

    /* renamed from: b */
    public static final Lazy f88304b = LazyKt.lazy(C34120b.INSTANCE);

    /* renamed from: c */
    public static final String f88305c = f88305c;

    /* renamed from: d */
    public static final String f88306d = f88306d;

    /* renamed from: e */
    public static final String f88307e = "app_id";

    /* renamed from: f */
    public static final String f88308f = f88308f;

    /* renamed from: g */
    public static final String f88309g = f88309g;

    /* renamed from: h */
    public static final Companion f88310h = new Companion(null);

    /* renamed from: a */
    public final String f88311a = "{{docUrl}}{{messageId}}?key={{token}}&chatToken={{chatToken}}";

    /* renamed from: i */
    private final AbstractC36498n f88312i;

    /* renamed from: j */
    private final AbstractC36474h.AbstractC36475a f88313j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u00108FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/service/lkp/ConvertOfficeToSpaceService$Companion;", "", "()V", "KEY_APP_ID", "", "getKEY_APP_ID", "()Ljava/lang/String;", "KEY_RESPONSE_PARAMETERS", "getKEY_RESPONSE_PARAMETERS", "KEY_SESSION", "getKEY_SESSION", "REMOTE_PATH", "getREMOTE_PATH", "TAG", "getTAG", "instance", "Lcom/ss/android/lark/chat/service/lkp/ConvertOfficeToSpaceService;", "getInstance", "()Lcom/ss/android/lark/chat/service/lkp/ConvertOfficeToSpaceService;", "instance$delegate", "Lkotlin/Lazy;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.b.a$a */
    public static final class Companion {
        /* renamed from: a */
        public final ConvertOfficeToSpaceService mo126548a() {
            Lazy lazy = ConvertOfficeToSpaceService.f88304b;
            Companion aVar = ConvertOfficeToSpaceService.f88310h;
            return (ConvertOfficeToSpaceService) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/service/lkp/ConvertOfficeToSpaceService;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.b.a$b */
    static final class C34120b extends Lambda implements Function0<ConvertOfficeToSpaceService> {
        public static final C34120b INSTANCE = new C34120b();

        C34120b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ConvertOfficeToSpaceService invoke() {
            return new ConvertOfficeToSpaceService();
        }
    }

    public ConvertOfficeToSpaceService() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36498n L = b.mo134513L();
        Intrinsics.checkExpressionValueIsNotNull(L, "ChatModuleInstanceHolder…ependency().docDependency");
        this.f88312i = L;
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36474h.AbstractC36475a ab = b2.ab();
        Intrinsics.checkExpressionValueIsNotNull(ab, "ChatModuleInstanceHolder…     .appConfigDependency");
        this.f88313j = ab;
    }

    /* renamed from: a */
    private final String m132510a(C36867a aVar) {
        return aVar.mo136026a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/service/lkp/ConvertOfficeToSpaceService$convertFileMessageToSpaceUrl$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/dependency/IDocDependency$DocConvertToken;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.service.b.a$c */
    public static final class C34121c implements IGetDataCallback<AbstractC36498n.C36499a> {

        /* renamed from: a */
        final /* synthetic */ ConvertOfficeToSpaceService f88314a;

        /* renamed from: b */
        final /* synthetic */ String f88315b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f88316c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f88316c;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        /* renamed from: a */
        public void onSuccess(AbstractC36498n.C36499a aVar) {
            String a = this.f88314a.mo126546a(this.f88315b, aVar);
            if (a == null) {
                IGetDataCallback iGetDataCallback = this.f88316c;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new ErrorResult("convert url fail"));
                    return;
                }
                return;
            }
            IGetDataCallback iGetDataCallback2 = this.f88316c;
            if (iGetDataCallback2 != null) {
                iGetDataCallback2.onSuccess(a);
            }
        }

        C34121c(ConvertOfficeToSpaceService aVar, String str, IGetDataCallback iGetDataCallback) {
            this.f88314a = aVar;
            this.f88315b = str;
            this.f88316c = iGetDataCallback;
        }
    }

    /* renamed from: a */
    private final String m132511a(String str) {
        C36867a b = this.f88313j.mo134601b();
        Intrinsics.checkExpressionValueIsNotNull(b, "mAppConfigDependency.docAppUserConfig");
        String a = m132510a(b);
        int a2 = m132509a(b, str);
        if (a2 == -1) {
            Log.m165389i(f88305c, "appId extract fail for free password");
            return "";
        }
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        AbstractC25990b j = b2.mo134582j();
        Intrinsics.checkExpressionValueIsNotNull(j, "ChatModuleInstanceHolder…etDependency().httpClient");
        C26010a aVar = new C26010a(HttpMethod.POST, "https://" + a + f88306d);
        aVar.mo92476b(new RequestBody("application/json", ""));
        aVar.mo92470a(new HttpParams(f88307e, String.valueOf(a2)));
        String str2 = f88309g;
        StringBuilder sb = new StringBuilder();
        sb.append("session=");
        AbstractC36474h b3 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36450aa N = b3.mo134515N();
        Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
        sb.append(N.mo134400c());
        aVar.mo92468a(new HttpHeaders(str2, sb.toString()));
        AbstractC25988d a3 = j.mo92412a(aVar);
        Intrinsics.checkExpressionValueIsNotNull(a3, "client.newCall(req)");
        BaseResponse baseResponse = (BaseResponse) a3.mo92407a(BaseResponse.class);
        if (baseResponse != null && baseResponse.isSuccessful()) {
            return (String) new JSONObject(baseResponse.body().mo92409a()).get(f88308f);
        }
        if (baseResponse == null) {
            Log.m165389i(f88305c, "get PasswordFreeSession response error: response is null");
        }
        Log.m165389i(f88305c, "get PasswordFreeSession response error code:" + baseResponse.code());
        return "";
    }

    @Override // com.ss.android.lark.chat.service.lkp.IConvertOfficeToSpaceService
    /* renamed from: a */
    public void mo126547a(String str, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        this.f88312i.mo134673a(str, new C34121c(this, str, iGetDataCallback));
    }

    /* renamed from: a */
    private final int m132509a(C36867a aVar, String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return -1;
        }
        Map<Integer, String> b = aVar.mo136029b();
        Intrinsics.checkExpressionValueIsNotNull(b, "config.urlRegex");
        for (Map.Entry<Integer, String> entry : b.entrySet()) {
            if (Pattern.compile(entry.getValue()).matcher(str2).find()) {
                Integer key = entry.getKey();
                Intrinsics.checkExpressionValueIsNotNull(key, "it.key");
                return key.intValue();
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final String mo126546a(String str, AbstractC36498n.C36499a aVar) {
        String str2;
        String str3;
        Charset charset = Charsets.f173341a;
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 0);
            if (aVar != null) {
                str2 = aVar.f94029a;
            } else {
                str2 = null;
            }
            if (aVar != null) {
                str3 = aVar.f94030b;
            } else {
                str3 = null;
            }
            String a = this.f88313j.mo134599a();
            if (TextUtils.isEmpty(a)) {
                Log.m165383e(f88305c, "docUrl is empty");
                return null;
            }
            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("docUrl", a), TuplesKt.to("chatToken", str3), TuplesKt.to("token", str2), TuplesKt.to("messageId", encodeToString));
            Log.m165389i(f88305c, "docUrl: " + a + "messageId: " + encodeToString);
            String mustacheFormat = UIHelper.mustacheFormat(this.f88311a, mutableMapOf);
            StringBuilder sb = new StringBuilder();
            sb.append(mustacheFormat);
            sb.append(ContainerUtils.FIELD_DELIMITER);
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "baseUrl");
            sb.append(m132511a(mustacheFormat));
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
