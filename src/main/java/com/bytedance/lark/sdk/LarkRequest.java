package com.bytedance.lark.sdk;

import com.bytedance.lark.sdk.util.GenerateID;
import com.google.android.gms.stats.CodePackage;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 12\u00020\u0001:\u0005/0123B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010.\u001a\u00020 H\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0018@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001c@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020 @BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001e\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u001e\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020*@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u00064"}, d2 = {"Lcom/bytedance/lark/sdk/LarkRequest;", "", "builder", "Lcom/bytedance/lark/sdk/LarkRequest$Builder;", "(Lcom/bytedance/lark/sdk/LarkRequest$Builder;)V", "<set-?>", "Lcom/bytedance/lark/sdk/LarkRequest$Alias;", "alias", "getAlias", "()Lcom/bytedance/lark/sdk/LarkRequest$Alias;", "", "enableComplexConnect", "getEnableComplexConnect", "()Z", "", "Lcom/bytedance/lark/sdk/HttpHeader;", "headers", "getHeaders", "()Ljava/util/List;", "isFollowRedirect", "Lcom/bytedance/lark/sdk/LarkRequestBody;", "larkRequestBody", "getLarkRequestBody", "()Lcom/bytedance/lark/sdk/LarkRequestBody;", "Lcom/bytedance/lark/sdk/LarkRequest$Method;", "method", "getMethod", "()Lcom/bytedance/lark/sdk/LarkRequest$Method;", "Lcom/bytedance/lark/sdk/LarkRequest$Priority;", "priority", "getPriority", "()Lcom/bytedance/lark/sdk/LarkRequest$Priority;", "", "requestId", "getRequestId", "()J", "", "retryNum", "getRetryNum", "()I", "timeout", "getTimeout", "", "url", "getUrl", "()Ljava/lang/String;", "genenrateRequestID", "Alias", "Builder", "Companion", "Method", "Priority", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LarkRequest {

    /* renamed from: a */
    public static final Companion f48316a = new Companion(null);

    /* renamed from: b */
    private String f48317b = "";

    /* renamed from: c */
    private Method f48318c = Method.GET;

    /* renamed from: d */
    private int f48319d;

    /* renamed from: e */
    private boolean f48320e;

    /* renamed from: f */
    private Priority f48321f = Priority.MEDIUM;

    /* renamed from: g */
    private Alias f48322g = Alias.UNKNOWN;

    /* renamed from: h */
    private List<HttpHeader> f48323h = new ArrayList();

    /* renamed from: i */
    private long f48324i = m72242l();

    /* renamed from: j */
    private LarkRequestBody f48325j;

    /* renamed from: k */
    private boolean f48326k;

    /* renamed from: l */
    private int f48327l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/bytedance/lark/sdk/LarkRequest$Alias;", "", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "API", "FILE", "OAPI", CodePackage.DRIVE, "DOCS", "MINA", "OPEN", "DOCS_API", "PASSPORT", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Alias {
        UNKNOWN,
        API,
        FILE,
        OAPI,
        DRIVE,
        DOCS,
        MINA,
        OPEN,
        DOCS_API,
        PASSPORT
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bytedance/lark/sdk/LarkRequest$Method;", "", "(Ljava/lang/String;I)V", "GET", "POST", "PUT", "DELETE", "PATCH", "HEAD", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Method {
        GET,
        POST,
        PUT,
        DELETE,
        PATCH,
        HEAD
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bytedance/lark/sdk/LarkRequest$Priority;", "", "(Ljava/lang/String;I)V", "HIGH", "MEDIUM", "LOW", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Priority {
        HIGH,
        MEDIUM,
        LOW
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020/2\u0006\u00106\u001a\u00020/J\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u00020\u0000J\u000e\u00109\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010:\u001a\u00020\u0000J\u0006\u0010;\u001a\u00020\u0000J\u001a\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u0017@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u001a\u0010.\u001a\u00020/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006?"}, d2 = {"Lcom/bytedance/lark/sdk/LarkRequest$Builder;", "", "()V", "alias", "Lcom/bytedance/lark/sdk/LarkRequest$Alias;", "getAlias", "()Lcom/bytedance/lark/sdk/LarkRequest$Alias;", "setAlias", "(Lcom/bytedance/lark/sdk/LarkRequest$Alias;)V", "enableComplexConnect", "", "getEnableComplexConnect", "()Z", "setEnableComplexConnect", "(Z)V", "<set-?>", "", "Lcom/bytedance/lark/sdk/HttpHeader;", "headers", "getHeaders", "()Ljava/util/List;", "isFollowRedirect", "setFollowRedirect", "Lcom/bytedance/lark/sdk/LarkRequestBody;", "larkRequestBody", "getLarkRequestBody", "()Lcom/bytedance/lark/sdk/LarkRequestBody;", "Lcom/bytedance/lark/sdk/LarkRequest$Method;", "method", "getMethod", "()Lcom/bytedance/lark/sdk/LarkRequest$Method;", "priority", "Lcom/bytedance/lark/sdk/LarkRequest$Priority;", "getPriority", "()Lcom/bytedance/lark/sdk/LarkRequest$Priority;", "setPriority", "(Lcom/bytedance/lark/sdk/LarkRequest$Priority;)V", "retryNum", "", "getRetryNum", "()I", "setRetryNum", "(I)V", "timeout", "getTimeout", "setTimeout", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "addHeader", "name", "value", "build", "Lcom/bytedance/lark/sdk/LarkRequest;", "delete", "get", "head", "patch", "post", "put", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.LarkRequest$a */
    public static final class Builder {

        /* renamed from: a */
        private String f48328a = "";

        /* renamed from: b */
        private Method f48329b = Method.GET;

        /* renamed from: c */
        private int f48330c;

        /* renamed from: d */
        private boolean f48331d;

        /* renamed from: e */
        private Priority f48332e = Priority.MEDIUM;

        /* renamed from: f */
        private Alias f48333f = Alias.UNKNOWN;

        /* renamed from: g */
        private List<HttpHeader> f48334g = new ArrayList();

        /* renamed from: h */
        private LarkRequestBody f48335h;

        /* renamed from: i */
        private boolean f48336i;

        /* renamed from: j */
        private int f48337j;

        /* renamed from: a */
        public final String mo67094a() {
            return this.f48328a;
        }

        /* renamed from: b */
        public final Method mo67100b() {
            return this.f48329b;
        }

        /* renamed from: c */
        public final int mo67104c() {
            return this.f48330c;
        }

        /* renamed from: d */
        public final boolean mo67107d() {
            return this.f48331d;
        }

        /* renamed from: e */
        public final Priority mo67108e() {
            return this.f48332e;
        }

        /* renamed from: f */
        public final Alias mo67109f() {
            return this.f48333f;
        }

        /* renamed from: g */
        public final List<HttpHeader> mo67110g() {
            return this.f48334g;
        }

        /* renamed from: h */
        public final LarkRequestBody mo67111h() {
            return this.f48335h;
        }

        /* renamed from: i */
        public final boolean mo67112i() {
            return this.f48336i;
        }

        /* renamed from: j */
        public final int mo67113j() {
            return this.f48337j;
        }

        /* renamed from: k */
        public final Builder mo67114k() {
            return m72254a(Method.GET, (LarkRequestBody) null);
        }

        /* renamed from: l */
        public final Builder mo67115l() {
            return m72254a(Method.HEAD, (LarkRequestBody) null);
        }

        /* renamed from: m */
        public final LarkRequest mo67116m() {
            return new LarkRequest(this);
        }

        /* renamed from: b */
        public final void mo67102b(int i) {
            this.f48337j = i;
        }

        /* renamed from: a */
        public final Builder mo67092a(LarkRequestBody jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "larkRequestBody");
            return m72254a(Method.POST, jVar);
        }

        /* renamed from: b */
        public final Builder mo67101b(LarkRequestBody jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "larkRequestBody");
            return m72254a(Method.DELETE, jVar);
        }

        /* renamed from: c */
        public final Builder mo67105c(LarkRequestBody jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "larkRequestBody");
            return m72254a(Method.PUT, jVar);
        }

        /* renamed from: d */
        public final Builder mo67106d(LarkRequestBody jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "larkRequestBody");
            return m72254a(Method.PATCH, jVar);
        }

        /* renamed from: b */
        public final void mo67103b(boolean z) {
            this.f48336i = z;
        }

        /* renamed from: a */
        public final void mo67095a(int i) {
            this.f48330c = i;
        }

        /* renamed from: a */
        public final void mo67096a(Alias alias) {
            Intrinsics.checkParameterIsNotNull(alias, "<set-?>");
            this.f48333f = alias;
        }

        /* renamed from: a */
        public final void mo67097a(Priority priority) {
            Intrinsics.checkParameterIsNotNull(priority, "<set-?>");
            this.f48332e = priority;
        }

        /* renamed from: a */
        public final void mo67098a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f48328a = str;
        }

        /* renamed from: a */
        public final void mo67099a(boolean z) {
            this.f48331d = z;
        }

        /* renamed from: a */
        private final Builder m72254a(Method method, LarkRequestBody jVar) {
            this.f48329b = method;
            this.f48335h = jVar;
            return this;
        }

        /* renamed from: a */
        public final Builder mo67093a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "name");
            Intrinsics.checkParameterIsNotNull(str2, "value");
            this.f48334g.add(new HttpHeader(str, str2));
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/lark/sdk/LarkRequest$Companion;", "", "()V", "INVALID_TIMEOUT", "", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.LarkRequest$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo67081a() {
        return this.f48317b;
    }

    /* renamed from: b */
    public final Method mo67082b() {
        return this.f48318c;
    }

    /* renamed from: c */
    public final int mo67083c() {
        return this.f48319d;
    }

    /* renamed from: d */
    public final boolean mo67084d() {
        return this.f48320e;
    }

    /* renamed from: e */
    public final Priority mo67085e() {
        return this.f48321f;
    }

    /* renamed from: f */
    public final Alias mo67086f() {
        return this.f48322g;
    }

    /* renamed from: g */
    public final List<HttpHeader> mo67087g() {
        return this.f48323h;
    }

    /* renamed from: h */
    public final long mo67088h() {
        return this.f48324i;
    }

    /* renamed from: i */
    public final LarkRequestBody mo67089i() {
        return this.f48325j;
    }

    /* renamed from: j */
    public final boolean mo67090j() {
        return this.f48326k;
    }

    /* renamed from: k */
    public final int mo67091k() {
        return this.f48327l;
    }

    /* renamed from: l */
    private final long m72242l() {
        return GenerateID.f48386b.mo67172a();
    }

    public LarkRequest(Builder aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        this.f48317b = aVar.mo67094a();
        this.f48318c = aVar.mo67100b();
        this.f48319d = aVar.mo67104c();
        this.f48320e = aVar.mo67107d();
        this.f48321f = aVar.mo67108e();
        this.f48322g = aVar.mo67109f();
        this.f48323h = aVar.mo67110g();
        this.f48325j = aVar.mo67111h();
        this.f48326k = aVar.mo67112i();
        this.f48327l = aVar.mo67113j();
    }
}
