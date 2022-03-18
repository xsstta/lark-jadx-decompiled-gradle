package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push;

import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.rn.RnPushProtocol;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.CoreThreadPool;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.b */
public class C12509b {

    /* renamed from: a */
    private String f33531a = "Wiki_WikiPush@";

    /* renamed from: b */
    private RnPushProtocol f33532b;

    /* renamed from: c */
    private Handler f33533c;

    /* renamed from: d */
    private final String f33534d;

    /* renamed from: e */
    private final String f33535e;

    /* renamed from: f */
    private volatile AbstractC12510a f33536f;

    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.b$a */
    public interface AbstractC12510a {
        void onAddV3(AddV3 addV3);

        void onDelV3(DelV3 delV3);

        void onDesV3(DesV3 desV3);

        void onMovV3(MovV3 movV3);

        void onReaV3(ReaV3 reaV3);

        void onUdeNodePermV3(UdeNodePermV3 udeNodePermV3);

        void onUdeV3(UdeV3 udeV3);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ DefinitionParameters m52029c() {
        return C70039b.m268661a("WIKI_TREE_", this.f33534d);
    }

    /* renamed from: b */
    public void mo47652b() {
        C13479a.m54764b(this.f33531a, "WikiPush detach. ");
        RnPushProtocol rnPushProtocol = this.f33532b;
        if (rnPushProtocol != null) {
            rnPushProtocol.mo40241a();
            this.f33536f = null;
        }
    }

    /* renamed from: a */
    public void mo47651a() {
        C13479a.m54764b(this.f33531a, "WikiPush attach. ");
        this.f33533c = CoreThreadPool.getSerialTaskHandler();
        RnPushProtocol rnPushProtocol = (RnPushProtocol) KoinJavaComponent.m268612a(RnPushProtocol.class, RnPushProtocol.VersionQualifier.Default, new Function0() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.$$Lambda$b$1ISbIOn5Da9rd_MfaviZslQgyoA */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12509b.lambda$1ISbIOn5Da9rd_MfaviZslQgyoA(C12509b.this);
            }
        });
        this.f33532b = rnPushProtocol;
        rnPushProtocol.mo40242a(new RnPushProtocol.AbstractC10622a() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.$$Lambda$b$_LSChwn3sLmALBqFpP0gbsyl0J8 */

            @Override // com.bytedance.ee.bear.rn.RnPushProtocol.AbstractC10622a
            public final void didReceivePush(String str) {
                C12509b.lambda$_LSChwn3sLmALBqFpP0gbsyl0J8(C12509b.this, str);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m52028b(String str) {
        this.f33533c.post(new Runnable(str) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.push.$$Lambda$b$8e1rm5k9n4ALNHUj6o18PuObdWE */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C12509b.lambda$8e1rm5k9n4ALNHUj6o18PuObdWE(C12509b.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m52030c(String str) {
        try {
            if (this.f33536f != null) {
                m52027a(str);
            }
        } catch (Exception e) {
            C13479a.m54759a(this.f33531a, "parse push json err. ", e);
        }
    }

    /* renamed from: a */
    private void m52027a(String str) throws Exception {
        String string = new JSONObject(str).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("body").getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        JSONObject jSONObject = new JSONObject(string);
        String string2 = jSONObject.getString("op");
        boolean optBoolean = jSONObject.optBoolean("too_many_coordinator");
        String optString = jSONObject.optString("synergy_uuid");
        if (optBoolean) {
            C13479a.m54775e(this.f33531a, "PushWrapper.parsePushJson, too many coordinator, ignore this push com.bytedance.ee.bear.lark.message. ");
        } else if (TextUtils.equals(this.f33535e, optString)) {
            C13479a.m54775e(this.f33531a, "PushWrapper.parsePushJson, receive op by yourself, ignore this push. ");
        } else {
            string2.hashCode();
            char c = 65535;
            switch (string2.hashCode()) {
                case -1422513445:
                    if (string2.equals("add_v3")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1335464143:
                    if (string2.equals("del_v3")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1335255606:
                    if (string2.equals("des_v3")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1068268664:
                    if (string2.equals("mov_v3")) {
                        c = 3;
                        break;
                    }
                    break;
                case -934983730:
                    if (string2.equals("rea_v3")) {
                        c = 4;
                        break;
                    }
                    break;
                case -849900634:
                    if (string2.equals("ude_v3")) {
                        c = 5;
                        break;
                    }
                    break;
                case -37033256:
                    if (string2.equals("ude_node_perm_v3")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f33536f.onAddV3((AddV3) JSON.parseObject(string, AddV3.class));
                    return;
                case 1:
                    this.f33536f.onDelV3((DelV3) JSON.parseObject(string, DelV3.class));
                    return;
                case 2:
                    this.f33536f.onDesV3((DesV3) JSON.parseObject(string, DesV3.class));
                    return;
                case 3:
                    this.f33536f.onMovV3((MovV3) JSON.parseObject(string, MovV3.class));
                    return;
                case 4:
                    this.f33536f.onReaV3((ReaV3) JSON.parseObject(string, ReaV3.class));
                    return;
                case 5:
                    this.f33536f.onUdeV3((UdeV3) JSON.parseObject(string, UdeV3.class));
                    return;
                case 6:
                    this.f33536f.onUdeNodePermV3((UdeNodePermV3) JSON.parseObject(string, UdeNodePermV3.class));
                    return;
                default:
                    C13479a.m54775e(this.f33531a, "PushWrapper.parsePushJson, op not match any exist field. ");
                    return;
            }
        }
    }

    public C12509b(String str, AbstractC12510a aVar, String str2, String str3) {
        this.f33534d = str;
        this.f33536f = aVar;
        this.f33535e = str2;
        this.f33531a += str3;
    }
}
