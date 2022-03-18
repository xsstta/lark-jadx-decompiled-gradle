package com.ss.android.lark.integrator.calendar.dependency.http;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30044f;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30027e;
import com.ss.android.lark.http.model.ErrorResult;
import com.ss.android.lark.http.model.http.AbstractC38765a;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.model.http.HttpParams;
import com.ss.android.lark.http.model.http.HttpRequestBody;
import com.ss.android.lark.http.okhttp.AbstractC38775a;
import com.ss.android.lark.http.okhttp.BaseOkHttpRequest;
import com.ss.android.lark.http.p1952a.AbstractC38759a;
import com.ss.android.lark.log.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 )2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001)B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J<\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\"\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016JD\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\"\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u001e\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\b\u0010 \u001a\u00020\u000eH\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020%H\u0016J\n\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n`\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/http/CalendarHttpRequest;", "Lcom/ss/android/lark/calendar/dependency/idependency/ICalHttpRequestDependency;", "Lcom/ss/android/lark/http/okhttp/BaseOkHttpRequest;", "Lcom/ss/android/lark/integrator/calendar/dependency/http/CalendarHttpResponse;", "()V", "ASSERT_KEY", "", "MODULE_KEY_VAL", "mBodyParams", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "mBodyType", "mHttpMethod", "Lcom/ss/android/lark/http/model/http/HttpMethod;", "mUrl", "Ljava/net/URL;", "buildBody", "Lokhttp3/RequestBody;", "doGet", "", "urlStr", "headerParams", "callback", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IHttpResponseCallBack;", "doPost", "bodyType", "bodyParams", "getAssertMsg", "assertMsg", "getBaseUrl", "getHttpTag", "getMethod", "getObjectConverter", "Lcom/ss/android/lark/http/converter/ObjectConverter;", "getPath", "getRequestBody", "Lcom/ss/android/lark/http/model/http/HttpRequestBody;", "getResponseFilter", "Lcom/ss/android/lark/http/okhttp/IResponseFilter;", "request", "Companion", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarHttpRequest extends BaseOkHttpRequest<CalendarHttpResponse> implements AbstractC30044f {
    public static final Companion Companion = new Companion(null);
    private final String ASSERT_KEY = "\"assert\"";
    private final String MODULE_KEY_VAL = "\"module\":\"calendar\"";
    private HashMap<String, Object> mBodyParams = new HashMap<>();
    private String mBodyType = "application/json;charset=utf-8";
    private HttpMethod mHttpMethod = HttpMethod.GET;
    private URL mUrl;

    @Override // com.ss.android.lark.http.okhttp.BaseOkHttpRequest
    public String getHttpTag() {
        return "CalendarHttpRequest";
    }

    @Override // com.ss.android.lark.http.okhttp.BaseOkHttpRequest
    public AbstractC38775a getResponseFilter() {
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/http/CalendarHttpRequest$Companion;", "", "()V", "POST_TYPE_FORM_DATA", "", "POST_TYPE_JSON", "TAG", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.dependency.http.CalendarHttpRequest$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/integrator/calendar/dependency/http/CalendarHttpRequest$getObjectConverter$1", "Lcom/ss/android/lark/http/converter/ObjectConverter;", "Lcom/ss/android/lark/integrator/calendar/dependency/http/CalendarHttpResponse;", "convertResponse", "response", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.dependency.http.CalendarHttpRequest$b */
    public static final class C39213b extends AbstractC38759a<CalendarHttpResponse> {
        C39213b() {
        }

        /* renamed from: a */
        public CalendarHttpResponse mo107503b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "response");
            CalendarHttpResponse calendarHttpResponse = new CalendarHttpResponse();
            calendarHttpResponse.setResponseData(str);
            return calendarHttpResponse;
        }
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public HttpMethod getMethod() {
        return this.mHttpMethod;
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public AbstractC38759a<CalendarHttpResponse> getObjectConverter() {
        return new C39213b();
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public HttpRequestBody getRequestBody() {
        return new HttpRequestBody("", "");
    }

    @Override // com.ss.android.lark.http.base.BaseRequest
    public String getPath() {
        URL url = this.mUrl;
        if (url == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUrl");
        }
        String path = url.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "mUrl.path");
        return path;
    }

    @Override // com.ss.android.lark.http.okhttp.BaseOkHttpRequest
    public String getBaseUrl() {
        StringBuilder sb = new StringBuilder();
        URL url = this.mUrl;
        if (url == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUrl");
        }
        sb.append(url.getProtocol());
        sb.append("://");
        URL url2 = this.mUrl;
        if (url2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mUrl");
        }
        sb.append(url2.getHost());
        return sb.toString();
    }

    @Override // com.ss.android.lark.http.okhttp.BaseOkHttpRequest
    public RequestBody buildBody() {
        String str = this.mBodyType;
        if (str.hashCode() == -655019664 && str.equals("multipart/form-data")) {
            MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
            for (Map.Entry<String, Object> entry : this.mBodyParams.entrySet()) {
                type.addFormDataPart(entry.getKey(), entry.getValue().toString());
            }
            MultipartBody build = type.build();
            Intrinsics.checkExpressionValueIsNotNull(build, "postBodyBuilder.build()");
            return build;
        }
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<String, Object> entry2 : this.mBodyParams.entrySet()) {
            if (sb.length() > 1) {
                sb.append(", ");
            }
            sb.append("\"");
            sb.append(entry2.getKey());
            sb.append("\": ");
            sb.append("\"");
            sb.append(entry2.getValue());
            sb.append("\"");
        }
        sb.append("}");
        RequestBody create = RequestBody.create(MediaType.parse(this.mBodyType), sb.toString());
        Intrinsics.checkExpressionValueIsNotNull(create, "okhttp3.RequestBody.crea… sbBodyParams.toString())");
        return create;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/integrator/calendar/dependency/http/CalendarHttpRequest$request$requestCallback$1", "Lcom/ss/android/lark/http/model/http/BaseRequestCallback;", "Lcom/ss/android/lark/integrator/calendar/dependency/http/CalendarHttpResponse;", "onError", "", "error", "Lcom/ss/android/lark/http/model/ErrorResult;", "onSuccess", "reponseModel", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.dependency.http.CalendarHttpRequest$c */
    public static final class C39214c extends AbstractC38765a<CalendarHttpResponse> {

        /* renamed from: a */
        final /* synthetic */ AbstractC30027e f100512a;

        C39214c(AbstractC30027e eVar) {
            this.f100512a = eVar;
        }

        @Override // com.ss.android.lark.http.model.http.AbstractC38765a
        /* renamed from: a */
        public void mo50780a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "error");
            this.f100512a.mo108166b(errorResult.toString());
        }

        /* renamed from: a */
        public void mo50782a(CalendarHttpResponse calendarHttpResponse) {
            Intrinsics.checkParameterIsNotNull(calendarHttpResponse, "reponseModel");
            this.f100512a.mo108165a(calendarHttpResponse.getResponseData());
        }
    }

    private final void request(AbstractC30027e eVar) {
        super.request(new C39214c(eVar));
    }

    private final String getAssertMsg(String str) {
        String str2 = "{" + this.MODULE_KEY_VAL + ", " + this.ASSERT_KEY + ":\"" + str + "\"" + "}";
        Intrinsics.checkExpressionValueIsNotNull(str2, "messageJson.append(\"}\").toString()");
        return str2;
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30044f
    public void doGet(String str, HashMap<String, String> hashMap, AbstractC30027e eVar) {
        Intrinsics.checkParameterIsNotNull(str, "urlStr");
        Intrinsics.checkParameterIsNotNull(hashMap, "headerParams");
        Intrinsics.checkParameterIsNotNull(eVar, "callback");
        try {
            this.mUrl = new URL(str);
            this.mHttpMethod = HttpMethod.GET;
            HttpParams httpParams = super.getHttpParams();
            if (CollectionUtils.isNotEmpty(hashMap)) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    httpParams.put(entry.getKey(), entry.getValue(), new boolean[0]);
                }
            }
            request(eVar);
        } catch (MalformedURLException e) {
            Log.m165383e("CalendarHttpRequest", getAssertMsg(e.getMessage()));
        }
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30044f
    public void doPost(String str, String str2, HashMap<String, Object> hashMap, AbstractC30027e eVar) {
        Intrinsics.checkParameterIsNotNull(str, "urlStr");
        Intrinsics.checkParameterIsNotNull(str2, "bodyType");
        Intrinsics.checkParameterIsNotNull(hashMap, "bodyParams");
        Intrinsics.checkParameterIsNotNull(eVar, "callback");
        try {
            this.mUrl = new URL(str);
            this.mBodyType = str2;
            this.mBodyParams = hashMap;
            this.mHttpMethod = HttpMethod.POST;
            request(eVar);
        } catch (MalformedURLException e) {
            Log.m165383e("CalendarHttpRequest", getAssertMsg(e.getMessage()));
        }
    }
}
