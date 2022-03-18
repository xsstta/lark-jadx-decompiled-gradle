package com.ss.android.bytedcert.net.fetch;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u001c\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\b\u0010(\u001a\u00020\u0003H\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010 \u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/ss/android/bytedcert/net/fetch/FetchJSBRequest;", "Lcom/ss/android/bytedcert/net/fetch/BaseRequest;", "url", "", "ignorePrefetch", "", "method", "requestType", "headerMap", "queryMapStr", "postData", "needCommonParams", "timeout", "", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "baseUrl", "getBaseUrl", "()Ljava/lang/String;", "getHeaderMap", "mKey", "getMKey", "mKey$delegate", "Lkotlin/Lazy;", "getMethod", "getNeedCommonParams", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "path", "getPath", "getPostData", "getQueryMapStr", "getRequestType", "requestUseUrl", "getRequestUseUrl", "()Z", "setRequestUseUrl", "(Z)V", "getTimeout", "()Ljava/lang/Long;", "Ljava/lang/Long;", "key", "byted_cert_core_release"}, mo238835k = 1, mv = {1, 1, 13})
/* renamed from: com.ss.android.bytedcert.net.a.d */
public final class FetchJSBRequest extends AbstractC28422a {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f71487c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FetchJSBRequest.class), "mKey", "getMKey()Ljava/lang/String;"))};

    /* renamed from: d */
    private final String f71488d;

    /* renamed from: e */
    private final String f71489e;

    /* renamed from: f */
    private boolean f71490f;

    /* renamed from: g */
    private final Lazy f71491g = LazyKt.lazy(new C28425a(this));

    /* renamed from: h */
    private final String f71492h;

    /* renamed from: i */
    private final String f71493i;

    /* renamed from: j */
    private final String f71494j;

    /* renamed from: k */
    private final String f71495k;

    /* renamed from: l */
    private final String f71496l;

    /* renamed from: m */
    private final Boolean f71497m;

    /* renamed from: n */
    private final Long f71498n;

    /* renamed from: b */
    public final String mo101207b() {
        return this.f71488d;
    }

    /* renamed from: c */
    public final String mo101208c() {
        return this.f71489e;
    }

    /* renamed from: d */
    public final boolean mo101209d() {
        return this.f71490f;
    }

    /* renamed from: e */
    public final String mo101210e() {
        return this.f71492h;
    }

    /* renamed from: f */
    public final String mo101211f() {
        return this.f71493i;
    }

    /* renamed from: g */
    public final String mo101212g() {
        return this.f71494j;
    }

    /* renamed from: h */
    public final String mo101213h() {
        return this.f71495k;
    }

    /* renamed from: i */
    public final String mo101214i() {
        return this.f71496l;
    }

    /* renamed from: j */
    public final Boolean mo101215j() {
        return this.f71497m;
    }

    /* renamed from: k */
    public final Long mo101216k() {
        return this.f71498n;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 13})
    /* renamed from: com.ss.android.bytedcert.net.a.d$a */
    static final class C28425a extends Lambda implements Function0<String> {
        final /* synthetic */ FetchJSBRequest this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28425a(FetchJSBRequest dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return FetchJSBRequestService.f71499a.mo101217a(this.this$0);
        }
    }

    /* renamed from: a */
    public final void mo101206a(boolean z) {
        this.f71490f = z;
    }

    public FetchJSBRequest(String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, Boolean bool2, Long l) {
        boolean z;
        this.f71492h = str2;
        this.f71493i = str3;
        this.f71494j = str4;
        this.f71495k = str5;
        this.f71496l = str6;
        this.f71497m = bool2;
        this.f71498n = l;
        this.f71482a = str;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f71483b = z;
        C28427g c = new C28427g(this.f71482a).mo101226c();
        Intrinsics.checkExpressionValueIsNotNull(c, "parserUrl");
        this.f71488d = c.mo101224a();
        this.f71489e = c.mo101225b();
    }
}
