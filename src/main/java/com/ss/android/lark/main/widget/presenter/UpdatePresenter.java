package com.ss.android.lark.main.widget.presenter;

import com.larksuite.framework.utils.an;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ai.GetSmartWidgetRequest;
import com.ss.android.lark.pb.ai.GetSmartWidgetResponse;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.pb.improto.Packet;
import com.ss.android.lark.pb.improto.PayloadType;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.util.share_preference.C57744a;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.AbstractC69698d;
import okio.ByteString;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001c\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0015J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0002R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;", "", "()V", "hostDomain", "", "getHostDomain", "()Ljava/lang/String;", "hostDomain$delegate", "Lkotlin/Lazy;", "httpClient", "Lokhttp3/OkHttpClient;", "getHttpClient", "()Lokhttp3/OkHttpClient;", "httpClient$delegate", "lastCid", "buildPacketLog", "packet", "Lcom/ss/android/lark/pb/improto/Packet;", "buildRequestBody", "", "logParams", "", "getCurrentLocale", "getRequestUrl", "isLogin", "", "loadData", "Lcom/ss/android/lark/pb/ai/GetSmartWidgetResponse;", "processResponse", "bytes", "Companion", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.widget.a.a */
public final class UpdatePresenter {

    /* renamed from: a */
    public static final Companion f112903a = new Companion(null);

    /* renamed from: b */
    private final Lazy f112904b = LazyKt.lazy(C44533b.INSTANCE);

    /* renamed from: c */
    private String f112905c = "";

    /* renamed from: d */
    private final Lazy f112906d = LazyKt.lazy(C44534c.INSTANCE);

    /* renamed from: b */
    private final OkHttpClient m176701b() {
        return (OkHttpClient) this.f112906d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter$Companion;", "", "()V", "CONNECT_TIMEOUT", "", "KEY_COMMAND", "", "KEY_CONTENT_TYPE", "KEY_COOKIE", "KEY_REQUEST_ID", "KEY_X_SOURCE", "LOG_KEY_APP_VERSION", "LOG_KEY_DEVICE_ID", "LOG_KEY_DEVICE_PLATFORM", "LOG_KEY_LOCALE", "LOG_VALUE_DEVICE_PLATFORM", "READ_TIMEOUT", "STATUS_OK", "", "V_CONTENT_PROTOBUF", "V_REQ_SOURCE", "V_WIDGET_COMMAND", "WRITE_TIMEOUT", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/main/widget/presenter/UpdatePresenter$loadData$1$body$1", "Lokhttp3/RequestBody;", "contentType", "Lokhttp3/MediaType;", "writeTo", "", "sink", "Lokio/BufferedSink;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.a.a$d */
    public static final class C44535d extends RequestBody {

        /* renamed from: a */
        final /* synthetic */ UpdatePresenter f112907a;

        /* renamed from: b */
        final /* synthetic */ Map f112908b;

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return MediaType.parse("application/x-protobuf");
        }

        @Override // okhttp3.RequestBody
        public void writeTo(AbstractC69698d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "sink");
            dVar.mo244533b(this.f112907a.mo158005b(this.f112908b));
        }

        C44535d(UpdatePresenter aVar, Map map) {
            this.f112907a = aVar;
            this.f112908b = map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.a.a$b */
    static final class C44533b extends Lambda implements Function0<String> {
        public static final C44533b INSTANCE = new C44533b();

        C44533b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return C57744a.m224104a().getString("widget_provider_domain");
        }
    }

    /* renamed from: a */
    public final boolean mo158004a() {
        String string = C57744a.m224104a().getString("widget_provider_user_session");
        if (string == null || !(!StringsKt.isBlank(string))) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.a.a$c */
    static final class C44534c extends Lambda implements Function0<OkHttpClient> {
        public static final C44534c INSTANCE = new C44534c();

        C44534c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OkHttpClient invoke() {
            return new OkHttpClient.Builder().connectTimeout(15000, TimeUnit.MILLISECONDS).readTimeout(10000, TimeUnit.MILLISECONDS).writeTimeout(30000, TimeUnit.MILLISECONDS).build();
        }
    }

    /* renamed from: c */
    private final String m176702c() {
        String string = C57744a.m224104a().getString("widget_provider_locale");
        if (string != null) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
        sb.append(locale.getLanguage());
        sb.append('_');
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.getDefault()");
        sb.append(locale2.getCountry());
        return sb.toString();
    }

    /* renamed from: d */
    private final String m176703d() {
        return "https://" + C57744a.m224104a().getString("widget_provider_domain") + "/im/gateway/";
    }

    /* renamed from: a */
    private final String m176700a(Packet packet) {
        return "status = " + packet.mstatus + ", command = " + packet.mcommand + " payload = " + packet.mpayload + ", cid = " + packet.mcid + ", sid = " + packet.msid;
    }

    /* renamed from: a */
    private final GetSmartWidgetResponse m176699a(byte[] bArr) {
        Packet packet = null;
        try {
            packet = Packet.ADAPTER.decode(bArr);
        } catch (IOException e) {
            Log.m165386e("WidgetProcess", e);
        }
        if (packet == null) {
            Log.m165383e("WidgetProcess", "processResponse: response is null, lastCid=" + this.f112905c);
            return null;
        }
        GetSmartWidgetResponse getSmartWidgetResponse = null;
        Integer num = packet.mstatus;
        if (num != null && num.intValue() == 200) {
            try {
                return GetSmartWidgetResponse.ADAPTER.decode(packet.mpayload);
            } catch (IOException e2) {
                Log.m165379d("WidgetProcess", m176700a(packet));
                Log.m165384e("WidgetProcess", e2.getMessage(), e2);
                return getSmartWidgetResponse;
            }
        } else {
            Log.m165383e("WidgetProcess", m176700a(packet));
            return getSmartWidgetResponse;
        }
    }

    /* renamed from: b */
    public final byte[] mo158005b(Map<String, String> map) {
        map.put("device_platform", "android");
        String string = C57744a.m224104a().getString("widget_provider_did");
        Intrinsics.checkExpressionValueIsNotNull(string, "GlobalSP.getInstance().g…ring(WIDGET_PROVIDER_DID)");
        map.put("device_id", string);
        String string2 = C57744a.m224104a().getString("widget_provider_version");
        Intrinsics.checkExpressionValueIsNotNull(string2, "GlobalSP.getInstance().g…(WIDGET_PROVIDER_VERSION)");
        map.put("app_version", string2);
        byte[] encode = new GetSmartWidgetRequest.C49479a().mo172623a(map).build().encode();
        String a = C53234a.m205877a();
        Intrinsics.checkExpressionValueIsNotNull(a, "DefaultContextIdCreator.getContextId()");
        this.f112905c = a;
        byte[] encode2 = new Packet.C49811a().mo173371a(this.f112905c).mo173370a(PayloadType.PB2).mo173369a(Command.GET_SMART_WIDGET).mo173372a(ByteString.of(encode, 0, encode.length)).build().encode();
        Intrinsics.checkExpressionValueIsNotNull(encode2, "packetBuilder.build().encode()");
        return encode2;
    }

    /* renamed from: a */
    public final GetSmartWidgetResponse mo158003a(Map<String, String> map) {
        byte[] bArr;
        ResponseBody body;
        Intrinsics.checkParameterIsNotNull(map, "logParams");
        OkHttpClient b = m176701b();
        Request.Builder addHeader = new Request.Builder().url(m176703d()).addHeader("X-Command", "1071014").addHeader("X-Request-Id", an.m95036a(8)).addHeader("X-Source", "web").addHeader("locale", m176702c());
        Response execute = b.newCall(addHeader.addHeader(ConvertOfficeToSpaceService.f88309g, "session=" + C57744a.m224104a().getString("widget_provider_user_session")).post(new C44535d(this, map)).build()).execute();
        if (execute == null || (body = execute.body()) == null) {
            bArr = null;
        } else {
            bArr = body.bytes();
        }
        return m176699a(bArr);
    }
}
