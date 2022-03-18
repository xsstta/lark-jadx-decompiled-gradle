package com.bytedance.ies.xbridge.network.model;

import com.bytedance.ies.xbridge.C14434d;
import com.bytedance.ies.xbridge.XDynamic;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.model.params.XBaseParamModel;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001cH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ies/xbridge/network/model/XRequestMethodParamModel;", "Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel;", "()V", "body", "", "getBody", "()Ljava/lang/Object;", "setBody", "(Ljava/lang/Object;)V", "header", "Lcom/bytedance/ies/xbridge/XReadableMap;", "getHeader", "()Lcom/bytedance/ies/xbridge/XReadableMap;", "setHeader", "(Lcom/bytedance/ies/xbridge/XReadableMap;)V", "method", "", "getMethod", "()Ljava/lang/String;", "setMethod", "(Ljava/lang/String;)V", "params", "getParams", "setParams", "url", "getUrl", "setUrl", "provideParamList", "", "Companion", "x-bridge-network_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.e.b.a */
public final class XRequestMethodParamModel extends XBaseParamModel {

    /* renamed from: c */
    public static final Companion f38037c = new Companion(null);

    /* renamed from: a */
    public String f38038a;

    /* renamed from: b */
    public String f38039b;

    /* renamed from: d */
    private Object f38040d;

    /* renamed from: f */
    private XReadableMap f38041f;

    /* renamed from: g */
    private XReadableMap f38042g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xbridge/network/model/XRequestMethodParamModel$Companion;", "", "()V", "convert", "Lcom/bytedance/ies/xbridge/network/model/XRequestMethodParamModel;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ies/xbridge/XReadableMap;", "x-bridge-network_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.e.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final XRequestMethodParamModel mo53134a(XReadableMap hVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(hVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            String a = C14434d.m58266a(hVar, "url", (String) null, 2, (Object) null);
            boolean z2 = true;
            if (a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            String a2 = C14434d.m58266a(hVar, "method", (String) null, 2, (Object) null);
            if (a2.length() != 0) {
                z2 = false;
            }
            if (z2) {
                return null;
            }
            XDynamic i = hVar.mo53110i("body");
            XReadableMap a3 = C14434d.m58264a(hVar, "params", (XReadableMap) null, 2, (Object) null);
            XReadableMap a4 = C14434d.m58264a(hVar, "header", (XReadableMap) null, 2, (Object) null);
            XRequestMethodParamModel aVar = new XRequestMethodParamModel();
            aVar.mo53127a(a);
            aVar.mo53130b(a2);
            aVar.mo53126a(i);
            aVar.mo53125a(a3);
            aVar.mo53129b(a4);
            return aVar;
        }
    }

    /* renamed from: c */
    public final Object mo53131c() {
        return this.f38040d;
    }

    /* renamed from: d */
    public final XReadableMap mo53132d() {
        return this.f38041f;
    }

    /* renamed from: e */
    public final XReadableMap mo53133e() {
        return this.f38042g;
    }

    /* renamed from: a */
    public final String mo53124a() {
        String str = this.f38038a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
        }
        return str;
    }

    /* renamed from: b */
    public final String mo53128b() {
        String str = this.f38039b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("method");
        }
        return str;
    }

    /* renamed from: a */
    public final void mo53125a(XReadableMap hVar) {
        this.f38041f = hVar;
    }

    /* renamed from: b */
    public final void mo53129b(XReadableMap hVar) {
        this.f38042g = hVar;
    }

    /* renamed from: a */
    public final void mo53126a(Object obj) {
        this.f38040d = obj;
    }

    /* renamed from: b */
    public final void mo53130b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f38039b = str;
    }

    /* renamed from: a */
    public final void mo53127a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f38038a = str;
    }
}
