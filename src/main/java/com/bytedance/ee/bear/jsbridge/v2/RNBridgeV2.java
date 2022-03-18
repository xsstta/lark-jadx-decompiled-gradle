package com.bytedance.ee.bear.jsbridge.v2;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.C7939a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.common.ReflectUtils;
import com.bytedance.ee.util.io.NonProguard;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0002J\u001c\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J&\u0010\u0017\u001a\u00020\r\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0014\u001a\u00020\u00062\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0018\u0018\u00010\u000bJ\u001c\u0010\u001a\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0002J&\u0010\u001b\u001a\u00020\r\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0016\u001a\u00020\u000f2\u0010\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0018\u0018\u00010\tJ\u0010\u0010\u001d\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t0\bX\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b0\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/jsbridge/v2/RNBridgeV2;", "", "sendToJs", "Lcom/bytedance/ee/bear/jsbridge/Bridge$SendtoJs;", "(Lcom/bytedance/ee/bear/jsbridge/Bridge$SendtoJs;)V", "TAG", "", "callbacks", "", "Lcom/bytedance/ee/bear/jsbridge/v2/RNCallback;", "handlers", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "dispatchRequest", "", "message", "Lcom/bytedance/ee/bear/jsbridge/v2/RNMessage;", "getCallback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "callbackId", "getHandler", "handlerName", "prompt", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "registerHandler", "T", "handler", "responseCallbackData", "sendRequest", "callback", "unregisterHandler", "Companion", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.jsbridge.v2.a */
public final class RNBridgeV2 {

    /* renamed from: a */
    public static final Companion f21378a = new Companion(null);

    /* renamed from: b */
    private final String f21379b = ("RNBridge#" + Integer.toHexString(hashCode()));

    /* renamed from: c */
    private final Map<String, AbstractC7945d<Object>> f21380c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Map<String, RNCallback<String>> f21381d = new ConcurrentHashMap();

    /* renamed from: e */
    private final C7939a.AbstractC7942a f21382e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/jsbridge/v2/RNBridgeV2$Companion;", "", "()V", "MAX_SIZE", "", "generateCallbackId", "", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.jsbridge.v2.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo30858a() {
            return "CB_" + UUID.randomUUID().toString();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/jsbridge/v2/RNBridgeV2$getCallback$2", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "onCallBack", "", "param", "Lcom/alibaba/fastjson/JSONObject;", "Lcom/bytedance/ee/util/io/NonProguard;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.jsbridge.v2.a$c */
    public static final class C7954c implements AbstractC7947h {
        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
        /* renamed from: a */
        public void mo17188a(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "param");
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
        /* renamed from: a */
        public void mo17189a(NonProguard nonProguard) {
            Intrinsics.checkParameterIsNotNull(nonProguard, "param");
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
        /* renamed from: a */
        public void mo17190a(String str) {
            Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }

        C7954c() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/jsbridge/v2/RNBridgeV2$sendRequest$callbackRef$1", "Lcom/bytedance/ee/bear/jsbridge/v2/RNCallback;", "", "onCallback", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.jsbridge.v2.a$d */
    public static final class C7955d implements RNCallback<String> {

        /* renamed from: a */
        final /* synthetic */ RNCallback f21385a;

        C7955d(RNCallback bVar) {
            this.f21385a = bVar;
        }

        /* renamed from: a */
        public void mo30859a(String str) {
            Class a = ReflectUtils.m55227a(this.f21385a);
            if (a == null) {
                a = ReflectUtils.m55228b(this.f21385a);
            }
            if (a == null) {
                this.f21385a.mo30859a(null);
                return;
            }
            try {
                this.f21385a.mo30859a(JSON.parseObject(str, a));
            } catch (Throwable th) {
                C13479a.m54759a("callback", "", th);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/jsbridge/v2/RNBridgeV2$getCallback$1", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "onCallBack", "", "param", "Lcom/alibaba/fastjson/JSONObject;", "Lcom/bytedance/ee/util/io/NonProguard;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.jsbridge.v2.a$b */
    public static final class C7953b implements AbstractC7947h {

        /* renamed from: a */
        final /* synthetic */ RNBridgeV2 f21383a;

        /* renamed from: b */
        final /* synthetic */ String f21384b;

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
        /* renamed from: a */
        public void mo17188a(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "param");
            this.f21383a.mo30857a(this.f21384b, Boolean.valueOf(Intrinsics.areEqual(jSONObject, new JSONObject())));
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
        /* renamed from: a */
        public void mo17189a(NonProguard nonProguard) {
            Intrinsics.checkParameterIsNotNull(nonProguard, "param");
            this.f21383a.mo30857a(this.f21384b, Boolean.valueOf(Intrinsics.areEqual(nonProguard, new RNBridgeV2$getCallback$1$onCallBack$1())));
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
        /* renamed from: a */
        public void mo17190a(String str) {
            Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f21383a.mo30857a(this.f21384b, Boolean.valueOf(Intrinsics.areEqual(str, "")));
        }

        C7953b(RNBridgeV2 aVar, String str) {
            this.f21383a = aVar;
            this.f21384b = str;
        }
    }

    /* renamed from: b */
    private final AbstractC7947h m31788b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new C7953b(this, str);
        }
        return new C7954c();
    }

    /* renamed from: c */
    private final AbstractC7945d<Object> m31789c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f21380c.get(str);
        }
        C13479a.m54758a(this.f21379b, "handlerName is empty");
        return null;
    }

    public RNBridgeV2(C7939a.AbstractC7942a aVar) {
        this.f21382e = aVar;
    }

    /* renamed from: a */
    private final void m31787a(RNMessage rNMessage) {
        String str;
        try {
            AbstractC7947h b = m31788b(rNMessage.getCallbackID());
            AbstractC7945d<Object> c = m31789c(rNMessage.getApiName());
            if (c != null) {
                if (rNMessage.getData() == null) {
                    str = "";
                } else {
                    str = String.valueOf(rNMessage.getData());
                }
                c.handle(str, b);
            }
        } catch (Throwable th) {
            C13479a.m54759a(this.f21379b, "", th);
            C13606d.m55245a(this.f21379b, th);
        }
    }

    /* renamed from: a */
    public final void mo30856a(String str) {
        String str2;
        if (str == null) {
            try {
                C13479a.m54772d(this.f21379b, "prompt data is null");
            } catch (Throwable th) {
                C13479a.m54759a(this.f21379b, "error", th);
                C13606d.m55245a(this.f21379b, th);
            }
        } else {
            RNMessage rNMessage = (RNMessage) JSON.parseObject(str, RNMessage.class);
            if (((long) str.length()) <= 2097152 || !(!Intrinsics.areEqual(rNMessage.getApiName(), "openDoc"))) {
                String callbackID = rNMessage.getCallbackID();
                if (callbackID == null) {
                    Intrinsics.checkExpressionValueIsNotNull(rNMessage, "message");
                    m31787a(rNMessage);
                    return;
                }
                RNCallback<String> bVar = this.f21381d.get(callbackID);
                if (bVar != null) {
                    if (rNMessage.getData() == null) {
                        str2 = "";
                    } else {
                        str2 = String.valueOf(rNMessage.getData());
                    }
                    bVar.mo30859a(str2);
                    return;
                }
                Intrinsics.checkExpressionValueIsNotNull(rNMessage, "message");
                m31787a(rNMessage);
                return;
            }
            String str3 = this.f21379b;
            C13606d.m55245a(str3, new Throwable(String.valueOf(str.length()) + "  " + rNMessage.getApiName()));
        }
    }

    /* renamed from: a */
    public final void mo30857a(String str, Object obj) {
        if (this.f21382e != null) {
            RNMessage rNMessage = new RNMessage();
            rNMessage.setCallbackID(str);
            rNMessage.setData(obj);
            this.f21382e.mo30839a(JSON.toJSONString(rNMessage));
        }
    }

    /* renamed from: a */
    public final <T> void mo30855a(RNMessage rNMessage, RNCallback<T> bVar) {
        Intrinsics.checkParameterIsNotNull(rNMessage, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            String callbackID = rNMessage.getCallbackID();
            if (bVar != null) {
                if (callbackID == null) {
                    callbackID = f21378a.mo30858a();
                    rNMessage.setCallbackID(callbackID);
                }
                this.f21381d.put(callbackID, new C7955d(bVar));
            }
            String jSONString = JSON.toJSONString(rNMessage, SerializerFeature.DisableCircularReferenceDetect);
            C7939a.AbstractC7942a aVar = this.f21382e;
            if (aVar != null) {
                aVar.mo30839a(jSONString);
            }
            String str = this.f21379b;
            C13479a.m54772d(str, "sendRequest: success: " + jSONString);
        } catch (Throwable th) {
            C13479a.m54759a(this.f21379b, "", th);
        }
    }
}
