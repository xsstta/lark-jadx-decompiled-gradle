package com.bytedance.ee.bear.lynx.impl.xbridge.method.network;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5202c;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.contract.net.HttpErrorCode;
import com.bytedance.ee.bear.lynx.impl.utli.ServiceDependence;
import com.bytedance.ee.bear.lynx.impl.xbridge.method.network.ResponseJsonResult;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.network.base.AbsXRequestMethod;
import com.bytedance.ies.xbridge.network.model.XRequestMethodParamModel;
import com.bytedance.ies.xbridge.network.model.XRequestMethodResultModel;
import com.bytedance.ies.xbridge.utils.XReadableJSONUtils;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J.\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001e\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J \u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%H\u0016J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040'2\u0006\u0010(\u001a\u00020)H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/CCMNetRequestMethod;", "Lcom/bytedance/ies/xbridge/network/base/AbsXRequestMethod;", "()V", "name", "", "getName", "()Ljava/lang/String;", "buildRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "url", "method", "param", "Lcom/bytedance/ies/xbridge/XReadableMap;", "header", "body", "", "callbackRequestFailure", "", "code", "Lkotlin/Pair;", "", "msg", "callback", "Lcom/bytedance/ies/xbridge/network/base/AbsXRequestMethod$XRequestCallback;", "callbackRequestSuccess", "responseJsonResult", "Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/ResponseJsonResult;", "checkRequestParamWithResult", "", "getErrorCodePair", "throwable", "", "getErrorMsg", "handle", "params", "Lcom/bytedance/ies/xbridge/network/model/XRequestMethodParamModel;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "jsonObjectToMap", "", "json", "Lorg/json/JSONObject;", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.a */
public final class CCMNetRequestMethod extends AbsXRequestMethod {

    /* renamed from: a */
    public static final Companion f23831a = new Companion(null);

    /* renamed from: c */
    private final String f23832c = "ccm.request";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/CCMNetRequestMethod$Companion;", "", "()V", "TAG", "", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.network.base.AbsXRequestMethod, com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f23832c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/ResponseJsonResult;", "json", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.a$b */
    static final class C8851b<T extends NetService.Result<Serializable>> implements NetService.AbstractC5074c<ResponseJsonResult> {

        /* renamed from: a */
        public static final C8851b f23833a = new C8851b();

        C8851b() {
        }

        /* renamed from: a */
        public final ResponseJsonResult parse(String str) {
            ResponseJsonResult.Companion aVar = ResponseJsonResult.Companion;
            if (str == null) {
                str = "";
            }
            return aVar.mo33989a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/ResponseJsonResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.a$c */
    static final class C8852c<T> implements Consumer<ResponseJsonResult> {

        /* renamed from: a */
        final /* synthetic */ CCMNetRequestMethod f23834a;

        /* renamed from: b */
        final /* synthetic */ AbsXRequestMethod.XRequestCallback f23835b;

        C8852c(CCMNetRequestMethod aVar, AbsXRequestMethod.XRequestCallback aVar2) {
            this.f23834a = aVar;
            this.f23835b = aVar2;
        }

        /* renamed from: a */
        public final void accept(ResponseJsonResult responseJsonResult) {
            CCMNetRequestMethod aVar = this.f23834a;
            Intrinsics.checkExpressionValueIsNotNull(responseJsonResult, "it");
            aVar.mo33991a(responseJsonResult, this.f23835b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.a$d */
    static final class C8853d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ CCMNetRequestMethod f23836a;

        /* renamed from: b */
        final /* synthetic */ AbsXRequestMethod.XRequestCallback f23837b;

        C8853d(CCMNetRequestMethod aVar, AbsXRequestMethod.XRequestCallback aVar2) {
            this.f23836a = aVar;
            this.f23837b = aVar2;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            CCMNetRequestMethod aVar = this.f23836a;
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            aVar.mo33993a(aVar.mo33994b(th), this.f23836a.mo33990a(th), this.f23837b);
        }
    }

    /* renamed from: a */
    private final Map<String, String> m37127a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next, "");
            if (!TextUtils.isEmpty(optString)) {
                Intrinsics.checkExpressionValueIsNotNull(next, "key");
                Intrinsics.checkExpressionValueIsNotNull(optString, "value");
                linkedHashMap.put(next, optString);
            }
        }
        return MapsKt.toMap(linkedHashMap);
    }

    /* renamed from: a */
    public final String mo33990a(Throwable th) {
        if (HttpErrorCode.f14916a.mo20804a(th) != -1) {
            String b = HttpErrorCode.f14916a.mo20805b(th);
            if (b != null) {
                return b;
            }
            return "";
        } else if (C5203d.m21234a(th) != -1) {
            String b2 = C5203d.m21236b(th);
            if (b2 != null) {
                return b2;
            }
            return "";
        } else {
            String message = th.getMessage();
            if (message != null) {
                return message;
            }
            return "inner error";
        }
    }

    /* renamed from: b */
    public final Pair<Integer, Integer> mo33994b(Throwable th) {
        int i;
        Integer valueOf = Integer.valueOf(C5202c.m21233a(th));
        if (valueOf.intValue() != -3) {
            i = -114000;
        } else {
            i = -113000;
        }
        if (i == -113000) {
            valueOf = Integer.valueOf(HttpErrorCode.f14916a.mo20804a(th));
            if (valueOf.intValue() != -1) {
                i = -115000;
            }
        }
        if (i == -113000) {
            valueOf = Integer.valueOf(C5203d.m21234a(th));
            if (valueOf.intValue() != -1) {
                i = -116000;
            }
        }
        if (i == -113000) {
            valueOf = null;
        }
        return new Pair<>(Integer.valueOf(i), valueOf);
    }

    /* renamed from: a */
    public final void mo33991a(ResponseJsonResult responseJsonResult, AbsXRequestMethod.XRequestCallback aVar) {
        String str = responseJsonResult.msg;
        C13479a.m54764b("ccm-lynx: CCMNetRequestMethod", "callbackRequestSuccess msg: " + str);
        XRequestMethodResultModel bVar = new XRequestMethodResultModel();
        bVar.mo53136a(Integer.valueOf((int) LocationRequest.PRIORITY_HD_ACCURACY));
        bVar.mo53137a(XReadableJSONUtils.f38087a.mo53179a(responseJsonResult.getResponseJson()));
        Intrinsics.checkExpressionValueIsNotNull(str, "msg");
        aVar.mo53123a(bVar, str);
    }

    /* renamed from: a */
    private final boolean m37128a(String str, String str2, AbsXRequestMethod.XRequestCallback aVar) {
        if (TextUtils.isEmpty(str)) {
            mo33993a(new Pair<>(-112000, null), "request url is empty", aVar);
            C13479a.m54775e("ccm-lynx: CCMNetRequestMethod", "request url is empty");
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            mo33993a(new Pair<>(-112000, null), "request method is empty", aVar);
            C13479a.m54775e("ccm-lynx: CCMNetRequestMethod", "request method is empty");
            return false;
        } else if (str2 != null) {
            String upperCase = str2.toUpperCase();
            Intrinsics.checkExpressionValueIsNotNull(upperCase, "(this as java.lang.String).toUpperCase()");
            if (!(!Intrinsics.areEqual(upperCase, "GET")) || !(!Intrinsics.areEqual(upperCase, "POST"))) {
                return true;
            }
            Pair<Integer, Integer> pair = new Pair<>(-112000, null);
            mo33993a(pair, upperCase + " request method is not support", aVar);
            C13479a.m54775e("ccm-lynx: CCMNetRequestMethod", upperCase + " request method is not support");
            return false;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Override // com.bytedance.ies.xbridge.network.base.AbsXRequestMethod
    /* renamed from: a */
    public void mo33992a(XRequestMethodParamModel aVar, AbsXRequestMethod.XRequestCallback aVar2, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar2, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        Object c = aVar.mo53131c();
        String a = aVar.mo53124a();
        String b = aVar.mo53128b();
        XReadableMap d = aVar.mo53132d();
        XReadableMap e = aVar.mo53133e();
        NetService netService = (NetService) ServiceDependence.f23778b.mo33929a(NetService.class);
        if (m37128a(a, b, aVar2)) {
            netService.mo20117a(C8851b.f23833a).mo20141a(m37126a(a, b, d, e, c)).mo238001b(new C8852c(this, aVar2), new C8853d(this, aVar2));
        }
    }

    /* renamed from: a */
    public final void mo33993a(Pair<Integer, Integer> pair, String str, AbsXRequestMethod.XRequestCallback aVar) {
        int intValue = pair.getFirst().intValue();
        Integer second = pair.getSecond();
        C13479a.m54764b("ccm-lynx: CCMNetRequestMethod", "callbackRequestFailure mainCode: " + intValue + " subCode: " + second + ", msg: " + str);
        XRequestMethodResultModel bVar = new XRequestMethodResultModel();
        bVar.mo53136a(second);
        bVar.mo53137a(MapsKt.emptyMap());
        aVar.mo53122a(intValue, str, bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bytedance.ee.bear.contract.NetService.C5076e m37126a(java.lang.String r7, java.lang.String r8, com.bytedance.ies.xbridge.XReadableMap r9, com.bytedance.ies.xbridge.XReadableMap r10, java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.CCMNetRequestMethod.m37126a(java.lang.String, java.lang.String, com.bytedance.ies.xbridge.h, com.bytedance.ies.xbridge.h, java.lang.Object):com.bytedance.ee.bear.contract.NetService$e");
    }
}
