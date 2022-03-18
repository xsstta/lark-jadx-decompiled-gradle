package com.bytedance.ee.bear.document.offline.file.upload;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AbstractC5238z;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e;
import com.bytedance.ee.bear.document.web.C6290a;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.p276c.C4969a;
import com.bytedance.ee.bear.thread.BearExecutors;
import com.bytedance.ee.eenet.httpclient.C12614a;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13669a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.utils.C57788ai;
import io.reactivex.AbstractC68307f;
import java.io.File;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Dispatcher;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 92\u00020\u0001:\u00019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\n\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J@\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0002J\"\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180&2\b\u0010'\u001a\u0004\u0018\u00010\u001a2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016Jn\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180&2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001a2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a012\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u0001032\u0014\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u0001032\u0006\u0010(\u001a\u00020)H\u0016J*\u0010*\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001a2\u0006\u00105\u001a\u0002062\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a03J4\u0010*\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001a2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a032\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/bytedance/ee/bear/document/offline/file/upload/DocFileUploadHelper;", "Lcom/bytedance/ee/bear/document/offline/file/upload/IFileUploadHelper;", "context", "Landroid/content/Context;", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/contract/AnalyticService;Lcom/bytedance/ee/bear/contract/NetService;)V", "getAnalyticService", "()Lcom/bytedance/ee/bear/contract/AnalyticService;", "getContext", "()Landroid/content/Context;", "mAppVisibleService", "Lcom/bytedance/ee/bear/contract/AppVisibleService;", "mConnectionService", "Lcom/bytedance/ee/bear/contract/ConnectionService;", "getNetService", "()Lcom/bytedance/ee/bear/contract/NetService;", "retryCount", "", "getAppVisibleService", "getConnectionService", "parseResponseData", "Lcom/bytedance/ee/bear/document/offline/file/upload/UploadResult;", "response", "", "reporImageUpload", "", "startTime", "", "code", "errorMessage", "url", "picSize", "request", "Lokhttp3/Request;", "resumeUpload", "Lio/reactivex/Flowable;", "key", "callback", "Lcom/bytedance/ee/bear/document/offline/file/upload/IFileUploadHelper$FileUploadCallback;", "uploadFile", "model", "Lcom/bytedance/ee/bear/document/offline/file/upload/FileUploadModel;", "isFileUseUri", "", "filePointer", "params", "", "extraParams", "", "extraRust", "file", "Ljava/io/File;", "progressListener", "Lcom/bytedance/ee/util/io/CountingFileRequestBody$ProgressListener;", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.offline.file.upload.b */
public final class DocFileUploadHelper implements AbstractC5948e {

    /* renamed from: a */
    public static final Companion f16661a = new Companion(null);

    /* renamed from: b */
    private int f16662b;

    /* renamed from: c */
    private AbstractC5238z f16663c;

    /* renamed from: d */
    private ConnectionService f16664d;

    /* renamed from: e */
    private final Context f16665e;

    /* renamed from: f */
    private final AbstractC5233x f16666f;

    /* renamed from: g */
    private final NetService f16667g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/document/offline/file/upload/DocFileUploadHelper$Companion;", "", "()V", "API_UPLOAD_FILE", "", "DEV_PERFORMANCE_NATIVE_PICTURE_UPLOAD", "HEADER_FILE", "MAX_RETRY_COUNT", "", "MEDIA_TYPE", "OBJ_TYPE", "SUCCESS_CODE", "TAG", "TOKEN", "USER_AGENT", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.offline.file.upload.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final AbstractC5238z m23974a() {
        if (this.f16663c == null) {
            this.f16663c = C5102ai.m20872j();
        }
        return this.f16663c;
    }

    /* renamed from: b */
    private final ConnectionService m23977b() {
        if (this.f16664d == null) {
            this.f16664d = C5084ad.m20847d();
        }
        return this.f16664d;
    }

    /* renamed from: a */
    private final UploadResult m23975a(String str) {
        boolean z;
        UploadResult uploadResult = new UploadResult();
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new UploadResult();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            uploadResult.setCode(jSONObject.optInt("code"));
            uploadResult.setMessage(jSONObject.optString("msg"));
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("url");
                uploadResult.setUrl(optString);
                uploadResult.setFileToken(optString);
                uploadResult.setFile_key(optJSONObject.optString("file_key"));
                uploadResult.setCdn_url(optJSONObject.optString("cdn_url"));
                uploadResult.setDecrypt_key(optJSONObject.optString("decrypt_key"));
                uploadResult.setThumbnail_url(optJSONObject.optString("webp_thumbnail_cdn_url"));
            }
        } catch (Exception e) {
            C13479a.m54761a("DocFileUploadHelper", e);
        }
        return uploadResult;
    }

    @Override // com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e
    /* renamed from: a */
    public AbstractC68307f<UploadResult> mo18067a(String str, AbstractC5948e.AbstractC5949a aVar) {
        AbstractC68307f<UploadResult> a = AbstractC68307f.m265083a(new UploadResult());
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.just(UploadResult())");
        return a;
    }

    public DocFileUploadHelper(Context context, AbstractC5233x xVar, NetService netService) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
        Intrinsics.checkParameterIsNotNull(netService, "netService");
        this.f16665e = context;
        this.f16666f = xVar;
        this.f16667g = netService;
    }

    /* renamed from: a */
    public final UploadResult mo24055a(String str, File file, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(file, "file");
        Intrinsics.checkParameterIsNotNull(map, "params");
        return mo24056a(str, map, file, null);
    }

    /* renamed from: a */
    public final UploadResult mo24056a(String str, Map<String, String> map, File file, C13669a.AbstractC13670a aVar) {
        ConnectionService.NetworkState b;
        Request request;
        Exception e;
        int i;
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(map, "params");
        Intrinsics.checkParameterIsNotNull(file, "file");
        ConnectionService b2 = m23977b();
        if (b2 == null || (b = b2.mo20038b()) == null || !b.mo20041b()) {
            C13479a.m54764b("DocFileUploadHelper", "uploadFile()...net not connected");
            return new UploadResult();
        } else if (StringsKt.isBlank(str)) {
            C13479a.m54764b("DocFileUploadHelper", "uploadFile()...url is null");
            return new UploadResult();
        } else if (!file.exists() || !file.isFile()) {
            C13479a.m54764b("DocFileUploadHelper", "uploadFile()...file illegal");
            return new UploadResult();
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            long length = file.length();
            MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                type.addFormDataPart(entry.getKey(), entry.getValue());
            }
            type.addFormDataPart("file", file.getName(), RequestBody.create(MediaType.parse("multipart/form-data"), file));
            Request.Builder builder = new Request.Builder();
            Request build = builder.url("https://" + C6313i.f17510b + C6313i.m25327a().mo25400h(str)).post(type.build()).addHeader("User-Agent", C6290a.m25233a(this.f16665e)).build();
            C12614a a = C12617b.m52365c().mo47928a().mo47922c(2, TimeUnit.MINUTES).mo47920b(2, TimeUnit.MINUTES).mo47917a(new Dispatcher(BearExecutors.m48467b())).mo47916a(C4969a.m20606a());
            Intrinsics.checkExpressionValueIsNotNull(a, "EEHttpClient.getHttpClie…rProvider.getCookieJar())");
            try {
                Response execute = a.mo47919a().newCall(build).execute();
                if (execute != null) {
                    ResponseBody body = execute.body();
                    if (body == null) {
                        Intrinsics.throwNpe();
                    }
                    String string = body.string();
                    C13479a.m54764b("DocFileUploadHelper", " response == " + execute.code() + "    responseStr: " + string);
                    if (execute.code() == 200 && execute.isSuccessful()) {
                        Intrinsics.checkExpressionValueIsNotNull(string, "responseStr");
                        UploadResult a2 = m23975a(string);
                        if (a2.getCode() == 0) {
                            int code = a2.getCode();
                            int i2 = this.f16662b;
                            String message = a2.getMessage();
                            Intrinsics.checkExpressionValueIsNotNull(message, "uploadResult.message");
                            Intrinsics.checkExpressionValueIsNotNull(build, "request");
                            request = build;
                            try {
                                m23976a(uptimeMillis, code, i2, message, str, length, build);
                                return a2;
                            } catch (Exception e2) {
                                e = e2;
                                C13479a.m54761a("DocFileUploadHelper", e);
                                String exc = e.toString();
                                if (!(e instanceof SocketTimeoutException)) {
                                }
                                i = -2;
                                int i3 = this.f16662b;
                                Intrinsics.checkExpressionValueIsNotNull(request, "request");
                                m23976a(uptimeMillis, i, i3, exc, str, length, request);
                                return new UploadResult();
                            }
                        } else {
                            C13479a.m54764b("DocFileUploadHelper", " uploadResult == " + a2 + ".code");
                        }
                    }
                } else {
                    C13479a.m54775e("DocFileUploadHelper", " response == null");
                }
            } catch (Exception e3) {
                e = e3;
                request = build;
                C13479a.m54761a("DocFileUploadHelper", e);
                String exc2 = e.toString();
                if (!(e instanceof SocketTimeoutException) || (e instanceof ConnectException)) {
                    i = -2;
                } else {
                    i = -3;
                }
                int i32 = this.f16662b;
                Intrinsics.checkExpressionValueIsNotNull(request, "request");
                m23976a(uptimeMillis, i, i32, exc2, str, length, request);
                return new UploadResult();
            }
            return new UploadResult();
        }
    }

    /* renamed from: a */
    private final void m23976a(long j, int i, int i2, String str, String str2, long j2, Request request) {
        Boolean bool;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(SystemClock.uptimeMillis() - j));
            hashMap.put("code", String.valueOf(i));
            HashMap hashMap2 = hashMap;
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            hashMap2.put("url", str2);
            HashMap hashMap3 = hashMap;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            hashMap3.put("errorMsg", str);
            hashMap.put("docs_body_length", String.valueOf(j2));
            hashMap.put("docs_net_retry_count", Integer.valueOf(i2));
            HashMap hashMap4 = hashMap;
            AbstractC5238z a = m23974a();
            if (a != null) {
                bool = Boolean.valueOf(a.mo20212d());
            } else {
                bool = null;
            }
            hashMap4.put("app_visible", String.valueOf(bool));
            this.f16666f.mo21079a("dev_performance_native_picture_upload", hashMap);
        } catch (Exception e) {
            C13479a.m54761a("DocFileUploadHelper", e);
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.file.upload.AbstractC5948e
    /* renamed from: a */
    public AbstractC68307f<UploadResult> mo18066a(FileUploadModel fileUploadModel, boolean z, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, AbstractC5948e.AbstractC5949a aVar) {
        File file;
        Intrinsics.checkParameterIsNotNull(fileUploadModel, "model");
        Intrinsics.checkParameterIsNotNull(str, "filePointer");
        Intrinsics.checkParameterIsNotNull(map, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        if (z) {
            file = new File(C57788ai.m224257a(this.f16665e, Uri.parse(str)));
        } else {
            file = new File(str);
        }
        String url = fileUploadModel.getUrl();
        Intrinsics.checkExpressionValueIsNotNull(url, "model.url");
        AbstractC68307f<UploadResult> a = AbstractC68307f.m265083a(mo24055a(url, file, map));
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.just(uploadFile(model.url, file, params))");
        return a;
    }
}
