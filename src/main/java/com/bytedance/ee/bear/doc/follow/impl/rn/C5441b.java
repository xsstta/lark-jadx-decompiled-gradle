package com.bytedance.ee.bear.doc.follow.impl.rn;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.BinderISendDataCallback;
import com.bytedance.ee.bear.doc.follow.AbstractC5426c;
import com.bytedance.ee.bear.doc.follow.FollowInvokeResult;
import com.bytedance.ee.bear.doc.follow.FollowModuleState;
import com.bytedance.ee.bear.doc.follow.FollowModuleStateAdapter;
import com.bytedance.ee.bear.doc.follow.impl.FollowCallbackMapUtil;
import com.bytedance.ee.bear.doc.follow.impl.IFollowBridge;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p718t.C13742g;
import com.google.firebase.messaging.Constants;
import io.reactivex.AbstractC68307f;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.doc.follow.impl.rn.b */
public class C5441b implements IFollowBridge {

    /* renamed from: a */
    private static boolean f15499a;

    /* renamed from: b */
    private static FollowCallbackMapUtil f15500b = new FollowCallbackMapUtil();

    /* renamed from: c */
    private static final BinderISendDataCallback.Stub f15501c = new RNFollowAdapter$1();

    @Override // com.bytedance.ee.bear.doc.follow.impl.IFollowBridge
    /* renamed from: a */
    public FollowCallbackMapUtil mo21765a() {
        return f15500b;
    }

    @Override // com.bytedance.ee.bear.doc.follow.impl.IFollowBridge
    /* renamed from: a */
    public void mo21771a(String str, String str2, String str3, AbstractC5440a aVar, boolean z) {
        m22077b(str, str2, str3, aVar, z);
    }

    @Override // com.bytedance.ee.bear.doc.follow.impl.IFollowBridge
    /* renamed from: a */
    public void mo21770a(String str, String str2, String str3) {
        m22076b(str, str2, str3);
    }

    /* renamed from: b */
    private static void m22072b() {
        if (!f15499a) {
            ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40248a(f15501c);
            f15499a = true;
        }
    }

    /* renamed from: b */
    private static void m22073b(FollowInvokeResult followInvokeResult) {
        if (TextUtils.isEmpty(followInvokeResult.callbackId)) {
            C13479a.m54775e("CCMFollow_RNAdapter", "onInvokeResult no callbackId");
            return;
        }
        AbstractC5426c a = f15500b.mo21758a(followInvokeResult.callbackId);
        if (a != null) {
            a.onInvokeResult(followInvokeResult);
        }
    }

    /* renamed from: b */
    private static void m22074b(RNFollowEvent rNFollowEvent) {
        AbstractC5440a b;
        if (rNFollowEvent != null && (b = f15500b.mo21762b(FollowCallbackMapUtil.m22033a(rNFollowEvent.token, rNFollowEvent.module, rNFollowEvent.eventType))) != null) {
            b.onEvent(rNFollowEvent);
        }
    }

    /* renamed from: b */
    public static void m22075b(String str) {
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("action");
            if ("vcfollow.onInvokeResult".equals(string)) {
                m22073b((FollowInvokeResult) parseObject.getObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, FollowInvokeResult.class));
            } else if ("vcfollow.onEvent".equals(string)) {
                m22074b((RNFollowEvent) parseObject.getObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, RNFollowEvent.class));
            }
        } catch (Exception e) {
            C13479a.m54759a("CCMFollow_RNAdapter", "dispatchRNData", e);
        }
    }

    @Override // com.bytedance.ee.bear.doc.follow.impl.IFollowBridge
    /* renamed from: a */
    public void mo21767a(FollowInvokeResult followInvokeResult) {
        m22073b(followInvokeResult);
    }

    @Override // com.bytedance.ee.bear.doc.follow.impl.IFollowBridge
    /* renamed from: a */
    public void mo21768a(RNFollowEvent rNFollowEvent) {
        m22074b(rNFollowEvent);
    }

    @Override // com.bytedance.ee.bear.doc.follow.impl.IFollowBridge
    /* renamed from: a */
    public void mo21769a(String str) {
        m22067a("vcfollow.destroy", new RNDestroyData(str));
        f15500b.mo21760a();
    }

    /* renamed from: a */
    public static void m22066a(String str, FollowModuleState followModuleState) {
        m22069a(str, followModuleState.module, RNFollowEventTypes.FOLLOW_ACTION.name(), FollowModuleStateAdapter.jsonString(followModuleState));
    }

    /* renamed from: a */
    private static void m22067a(String str, NonProguard nonProguard) {
        AbstractC68307f<String> a = ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40246a(new Function0(str, nonProguard) {
            /* class com.bytedance.ee.bear.doc.follow.impl.rn.$$Lambda$b$gkViYIPrEendYV1KjNbWXLbXgU */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ NonProguard f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5441b.m22071b(this.f$0, this.f$1);
            }
        });
        if (a != null) {
            a.mo238036k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ AbstractC68307f m22071b(String str, NonProguard nonProguard) {
        ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40261c(CallRNData.buildJson(str, nonProguard));
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m22078c(String str, String str2, String str3) {
        if (f15500b.mo21758a(str) != null) {
            C13479a.m54775e("CCMFollow_RNAdapter", "invoke timeout :" + str2 + "," + C13598b.m55197d(str3));
        }
    }

    /* renamed from: b */
    public static void m22076b(String str, String str2, String str3) {
        m22072b();
        C13479a.m54764b("CCMFollow_RNAdapter", "unregisterRNEventHandler:" + C13598b.m55197d(str) + "," + str2 + "," + str3);
        f15500b.mo21763c(FollowCallbackMapUtil.m22033a(str, str2, str3));
        m22067a("vcfollow.unRegisterEventHandler", new RNParamRegisterEventHandler(str, str2, str3));
    }

    /* renamed from: a */
    public static void m22068a(String str, String str2, String str3, AbstractC5440a aVar) {
        m22077b(str, str2, str3, aVar, false);
    }

    /* renamed from: a */
    public static void m22069a(String str, String str2, String str3, String str4) {
        m22072b();
        m22067a("vcfollow.sendEvent", new RNParamSendEvent(str, str2, str3, str4));
    }

    /* renamed from: a */
    private static void m22070a(String str, String str2, String str3, String str4, String str5) {
        m22072b();
        if (!"replayActions".equals(str2) && !"getCurrentStatus".equals(str2)) {
            C13479a.m54764b("CCMFollow_RNAdapter", "invoke:" + str2);
        }
        C13742g.m55706a(new Runnable(str5, str2, str) {
            /* class com.bytedance.ee.bear.doc.follow.impl.rn.$$Lambda$b$hSHj46q5L54AcdO9BnlLVVaQBw */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C5441b.m22078c(this.f$0, this.f$1, this.f$2);
            }
        }, 5000);
        m22067a("vcfollow.invoke", new RNParamInvoke(str, str2, str3, str4, str5));
    }

    @Override // com.bytedance.ee.bear.doc.follow.impl.IFollowBridge
    /* renamed from: a */
    public String mo21766a(String str, String str2, String str3, String str4, AbstractC5426c cVar) {
        String str5;
        if (cVar != null) {
            str5 = f15500b.mo21759a(cVar);
        } else {
            str5 = "Empty";
        }
        m22070a(str, str2, str3, str4, str5);
        return str5;
    }

    /* renamed from: b */
    public static void m22077b(String str, String str2, String str3, AbstractC5440a aVar, boolean z) {
        m22072b();
        C13479a.m54764b("CCMFollow_RNAdapter", "registerRNEventHandler:" + C13598b.m55197d(str) + "," + str2 + "," + str3);
        String a = FollowCallbackMapUtil.m22033a(str, str2, str3);
        if (aVar != null) {
            f15500b.mo21761a(a, aVar);
        }
        m22067a("vcfollow.registerEventHandler", new RNParamRegisterEventHandler(str, str2, str3, z));
    }
}
