package com.bytedance.ee.bear.wiki.wikitree.push;

import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.rn.RnPushProtocol;
import com.bytedance.ee.bear.wiki.common.p579a.C11931b;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.CoreThreadPool;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.push.a */
public class C12129a {

    /* renamed from: a */
    private String f32673a = "Wiki_PushWrapper";

    /* renamed from: b */
    private RnPushProtocol f32674b;

    /* renamed from: c */
    private Handler f32675c;

    /* renamed from: d */
    private String f32676d;

    /* renamed from: e */
    private String f32677e;

    /* renamed from: f */
    private volatile AbstractC12130a f32678f;

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.push.a$a */
    public interface AbstractC12130a {
        /* renamed from: a */
        void mo46318a(AddV2 addV2);

        /* renamed from: a */
        void mo46319a(DelV2 delV2);

        /* renamed from: a */
        void mo46320a(MovV2 movV2);

        /* renamed from: a */
        void mo46321a(UdeArea udeArea);

        /* renamed from: a */
        void mo46322a(UdeAreaPerm udeAreaPerm);

        /* renamed from: a */
        void mo46323a(UdeV2 udeV2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ DefinitionParameters m50130c() {
        return C70039b.m268661a("WIKI_TREE_", this.f32676d);
    }

    /* renamed from: a */
    public void mo46316a() {
        this.f32675c = CoreThreadPool.getSerialTaskHandler();
        RnPushProtocol rnPushProtocol = (RnPushProtocol) KoinJavaComponent.m268612a(RnPushProtocol.class, RnPushProtocol.VersionQualifier.Default, new Function0() {
            /* class com.bytedance.ee.bear.wiki.wikitree.push.$$Lambda$a$FOYp4v90MXvqzQqbdfDnuoz7OZg */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12129a.lambda$FOYp4v90MXvqzQqbdfDnuoz7OZg(C12129a.this);
            }
        });
        this.f32674b = rnPushProtocol;
        rnPushProtocol.mo40242a(new RnPushProtocol.AbstractC10622a() {
            /* class com.bytedance.ee.bear.wiki.wikitree.push.$$Lambda$a$wjXkYlaxG55cyFih_buYakn7nk */

            @Override // com.bytedance.ee.bear.rn.RnPushProtocol.AbstractC10622a
            public final void didReceivePush(String str) {
                C12129a.m270057lambda$wjXkYlaxG55cyFih_buYakn7nk(C12129a.this, str);
            }
        });
    }

    /* renamed from: b */
    public void mo46317b() {
        RnPushProtocol rnPushProtocol = this.f32674b;
        if (rnPushProtocol != null) {
            rnPushProtocol.mo40241a();
            this.f32678f = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m50129b(String str) {
        this.f32675c.post(new Runnable(str) {
            /* class com.bytedance.ee.bear.wiki.wikitree.push.$$Lambda$a$pACov8RTL_IlLM5G_m5nSnkENH0 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C12129a.lambda$pACov8RTL_IlLM5G_m5nSnkENH0(C12129a.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m50131c(String str) {
        try {
            if (this.f32678f != null) {
                m50128a(str);
            }
        } catch (Exception e) {
            C13479a.m54759a(this.f32673a, "parse push json err. ", e);
        }
    }

    /* renamed from: a */
    private void m50128a(String str) throws Exception {
        String string = new JSONObject(str).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONObject("body").getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        JSONObject jSONObject = new JSONObject(string);
        String string2 = jSONObject.getString("op");
        boolean z = jSONObject.getBoolean("too_many_coordinator");
        String string3 = jSONObject.getString("member_id");
        if (z) {
            C13479a.m54775e(this.f32673a, "PushWrapper.parsePushJson, too many coordinator, ignore this push com.bytedance.ee.bear.lark.message. ");
        } else if (TextUtils.equals(this.f32677e, string3)) {
            C13479a.m54775e(this.f32673a, "PushWrapper.parsePushJson, receive op by yourself, ignore this push com.bytedance.ee.bear.lark.message. ");
        } else {
            string2.hashCode();
            char c = 65535;
            switch (string2.hashCode()) {
                case -1422513446:
                    if (string2.equals("add_v2")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1335464144:
                    if (string2.equals("del_v2")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1068268665:
                    if (string2.equals("mov_v2")) {
                        c = 2;
                        break;
                    }
                    break;
                case -849900635:
                    if (string2.equals("ude_v2")) {
                        c = 3;
                        break;
                    }
                    break;
                case -711284874:
                    if (string2.equals("ude_area")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1656798745:
                    if (string2.equals("ude_area_perm")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    AddV2 addV2 = (AddV2) JSON.parseObject(string, AddV2.class);
                    addV2.parent = C11931b.m49468a(addV2.parent, this.f32676d);
                    this.f32678f.mo46318a(addV2);
                    return;
                case 1:
                    DelV2 delV2 = (DelV2) JSON.parseObject(string, DelV2.class);
                    delV2.parent = C11931b.m49468a(delV2.parent, this.f32676d);
                    this.f32678f.mo46319a(delV2);
                    return;
                case 2:
                    MovV2 movV2 = (MovV2) JSON.parseObject(string, MovV2.class);
                    movV2.to = C11931b.m49468a(movV2.to, this.f32676d);
                    movV2.from = C11931b.m49468a(movV2.from, this.f32676d);
                    this.f32678f.mo46320a(movV2);
                    return;
                case 3:
                    this.f32678f.mo46323a((UdeV2) JSON.parseObject(string, UdeV2.class));
                    return;
                case 4:
                    this.f32678f.mo46321a((UdeArea) JSON.parseObject(string, UdeArea.class));
                    return;
                case 5:
                    UdeAreaPerm udeAreaPerm = (UdeAreaPerm) JSON.parseObject(string, UdeAreaPerm.class);
                    udeAreaPerm.parent = C11931b.m49468a(udeAreaPerm.parent, this.f32676d);
                    this.f32678f.mo46322a(udeAreaPerm);
                    return;
                default:
                    C13479a.m54775e(this.f32673a, "PushWrapper.parsePushJson, op not match any exist field. ");
                    return;
            }
        }
    }

    public C12129a(String str, AbstractC12130a aVar, String str2, String str3) {
        this.f32676d = str;
        this.f32678f = aVar;
        this.f32677e = str2;
        this.f32673a = String.format("%s_%s", this.f32673a, str3);
    }
}
