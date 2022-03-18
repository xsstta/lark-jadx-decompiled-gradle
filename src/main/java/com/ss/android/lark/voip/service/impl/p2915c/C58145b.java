package com.ss.android.lark.voip.service.impl.p2915c;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.sodium.crypto.CryptoUtil;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.irtc.AbstractC61058j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.voip.service.impl.c.b */
public class C58145b extends AbstractC58144a {

    /* renamed from: b */
    private final Object f143032b = new Object();

    /* renamed from: c */
    private final List<Runnable> f143033c = new ArrayList();

    /* renamed from: d */
    private volatile boolean f143034d;

    /* renamed from: e */
    private Context f143035e;

    /* renamed from: f */
    private AbstractC57987d.AbstractC57997h f143036f = C57977a.m224905c().getVideoChatDependency();

    /* renamed from: g */
    private volatile boolean f143037g = true;

    @Override // com.ss.android.lark.voip.service.impl.p2915c.AbstractC58146c
    /* renamed from: c */
    public String mo197044c() {
        return "bytertc";
    }

    @Override // com.ss.android.lark.voip.service.impl.p2915c.AbstractC58144a
    /* renamed from: a */
    public void mo197038a(byte[] bArr, byte[] bArr2) {
        C58151d.m225579b("ui", "rtc_engine", "setEncryptKey enable = " + this.f143034d, "[ByteRtcEngine] setEncryptKey enable = " + this.f143034d + " rxPassword = " + CryptoUtil.hexEncode(bArr) + " txPassword = " + CryptoUtil.hexEncode(bArr2));
        if (!this.f143037g) {
            return;
        }
        if (this.f143034d) {
            C58149g.m225570a().mo210566x();
            C58149g.m225570a().mo210519a(bArr, bArr2);
            return;
        }
        C58149g.m225570a().mo210565w();
    }

    @Override // com.ss.android.lark.voip.service.impl.p2915c.AbstractC58146c
    /* renamed from: d */
    public void mo197046d() {
        C58149g.m225570a().mo210556n();
    }

    @Override // com.ss.android.lark.voip.service.impl.p2915c.AbstractC58146c
    /* renamed from: e */
    public void mo197047e() {
        C58149g.m225570a().mo210557o();
    }

    /* renamed from: b */
    public String mo197042b() {
        return C58149g.m225570a().mo210561s();
    }

    @Override // com.ss.android.lark.voip.service.impl.p2915c.AbstractC58144a, com.ss.android.lark.voip.service.impl.p2915c.AbstractC58146c
    /* renamed from: a */
    public void mo197035a() {
        C58151d.m225578a("ui", "rtc_engine", "leaveChannel", "[ByteRtcEngine] leaveChannel isRtcEnable = " + this.f143037g);
        synchronized (this.f143032b) {
            if (this.f143037g) {
                C58149g.m225570a().mo210555m();
                C58149g.m225570a().mo210558p();
            }
            this.f143033c.clear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m225536c(AbstractC61058j jVar) {
        synchronized (this.f143032b) {
            if (this.f143037g) {
                C58149g.m225570a().mo210527b(jVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m225537d(AbstractC61058j jVar) {
        synchronized (this.f143032b) {
            if (this.f143037g) {
                C58149g.m225570a().mo210510a(jVar);
            }
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.p2915c.AbstractC58146c
    /* renamed from: b */
    public void mo197043b(AbstractC61058j jVar) {
        $$Lambda$b$A8tuy0r6GXWKiXGOxmwGSAOe_k r0 = new Runnable(jVar) {
            /* class com.ss.android.lark.voip.service.impl.p2915c.$$Lambda$b$A8tuy0r6GXWKiXGOxmwGSAOe_k */
            public final /* synthetic */ AbstractC61058j f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C58145b.this.m225536c((C58145b) this.f$1);
            }
        };
        if (this.f143037g) {
            r0.run();
        } else {
            this.f143033c.add(r0);
        }
    }

    C58145b(Context context) {
        this.f143035e = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m225538d(boolean z) {
        synchronized (this.f143032b) {
            if (this.f143037g) {
                C58149g.m225570a().mo210537d(z);
            }
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.p2915c.AbstractC58144a, com.ss.android.lark.voip.service.impl.p2915c.AbstractC58146c
    /* renamed from: b */
    public void mo197039b(boolean z) {
        C58151d.m225578a("ui", "rtc_engine", "setEnableSpeakerphone", "[ByteRtcEngine] setEnableSpeakerphone isSpeaker = " + z + ", isRtcEnable = " + this.f143037g);
        C58149g.m225570a().mo210543f(z);
    }

    @Override // com.ss.android.lark.voip.service.impl.p2915c.AbstractC58146c
    /* renamed from: c */
    public void mo197045c(boolean z) {
        C58151d.m225578a("ui", "rtc_engine", "setPlaybackDigitalMute", "[ByteRtcEngine] setPlaybackDigitalMute mute = " + z + ", isRtcEnable = " + this.f143037g);
        C58149g.m225570a().mo210546g(z);
    }

    @Override // com.ss.android.lark.voip.service.impl.p2915c.AbstractC58146c
    /* renamed from: a */
    public void mo197041a(AbstractC61058j jVar) {
        $$Lambda$b$3s7x1PkQU47WD22D9b7lMmrSr8 r0 = new Runnable(jVar) {
            /* class com.ss.android.lark.voip.service.impl.p2915c.$$Lambda$b$3s7x1PkQU47WD22D9b7lMmrSr8 */
            public final /* synthetic */ AbstractC61058j f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C58145b.this.m225537d((C58145b) this.f$1);
            }
        };
        if (this.f143037g) {
            r0.run();
        } else {
            this.f143033c.add(r0);
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.p2915c.AbstractC58144a, com.ss.android.lark.voip.service.impl.p2915c.AbstractC58146c
    /* renamed from: a */
    public void mo197037a(boolean z) {
        C58151d.m225578a("ui", "rtc_engine", "muteLocalAudioStream", "[ByteRtcEngine] muteLocalAudioStream isMute = " + z + ", isRtcEnable = " + this.f143037g);
        $$Lambda$b$SZurk61E2_m8gioeJX_ASYT5ER0 r0 = new Runnable(z) {
            /* class com.ss.android.lark.voip.service.impl.p2915c.$$Lambda$b$SZurk61E2_m8gioeJX_ASYT5ER0 */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C58145b.this.m225538d((C58145b) this.f$1);
            }
        };
        if (this.f143037g) {
            r0.run();
        } else {
            this.f143033c.add(r0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m225534a(VoiceCall voiceCall, String str) {
        synchronized (this.f143032b) {
            if (this.f143037g) {
                String str2 = "";
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("tenant_id", (Object) VideoChatModuleDependency.m236631d());
                    jSONObject.put("call_type", (Object) "voip");
                    if (TextUtils.equals(VideoChatModuleDependency.m236630c(), voiceCall.getFromUserId())) {
                        jSONObject.put("user_type", (Object) "caller");
                    } else {
                        jSONObject.put("user_type", (Object) "callee");
                    }
                    str2 = jSONObject.toJSONString();
                } catch (Exception e) {
                    C60700b.m235864f("VoIp", "[joinChannel]", "Info json parse error: " + e.toString());
                }
                C58149g.m225570a().mo210515a(voiceCall.getByteDanceChannelKey(), voiceCall.getId(), str, str2, "");
            }
        }
    }

    /* renamed from: a */
    public void mo197040a(Context context, boolean z) {
        if (this.f143036f.mo145477a()) {
            C58151d.m225579b("ui", "rtc_engine", "recreateRtcEngine fail", "[VoIpCallActivity] recreateRtcEngine: video chat is ongoing");
            return;
        }
        C58151d.m225578a("ui", "rtc_engine", "recreateRtcEngine", "[ByteRtcEngine] recreateRtcEngine isEncrypted = " + z + ", isRtcEnable = " + this.f143037g);
        this.f143034d = z;
        synchronized (this.f143032b) {
            C58149g.m225570a().mo210492a(1, false, C57977a.m224905c().isOverseaTenantBrand(), "", "vc");
            for (Runnable runnable : this.f143033c) {
                runnable.run();
            }
            this.f143033c.clear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m225535a(byte[] bArr, byte[] bArr2, VoiceCall voiceCall) {
        synchronized (this.f143032b) {
            if (this.f143037g) {
                mo197038a(bArr, bArr2);
                UICallbackExecutor.post(new Runnable(voiceCall, C57977a.m224905c().getDeviceId()) {
                    /* class com.ss.android.lark.voip.service.impl.p2915c.$$Lambda$b$Lar0GibKQ1cWfIAQ6R4R5WheveQ */
                    public final /* synthetic */ VoiceCall f$1;
                    public final /* synthetic */ String f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C58145b.this.m225534a((C58145b) this.f$1, (VoiceCall) this.f$2);
                    }
                });
            }
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.p2915c.AbstractC58144a, com.ss.android.lark.voip.service.impl.p2915c.AbstractC58146c
    /* renamed from: a */
    public void mo197036a(VoiceCall voiceCall, byte[] bArr, byte[] bArr2) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[ByteRtcEngine] joinChannel callId = ");
        if (voiceCall != null) {
            str = voiceCall.getId();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", isRtcEnable = ");
        sb.append(this.f143037g);
        C58151d.m225578a("ui", "rtc_engine", "joinChannel", sb.toString());
        $$Lambda$b$5Cqkz1diERHHkvToKP0IcUsJYHs r0 = new Runnable(bArr, bArr2, voiceCall) {
            /* class com.ss.android.lark.voip.service.impl.p2915c.$$Lambda$b$5Cqkz1diERHHkvToKP0IcUsJYHs */
            public final /* synthetic */ byte[] f$1;
            public final /* synthetic */ byte[] f$2;
            public final /* synthetic */ VoiceCall f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C58145b.this.m225535a((C58145b) this.f$1, this.f$2, (byte[]) this.f$3);
            }
        };
        if (this.f143037g) {
            r0.run();
        } else {
            this.f143033c.add(r0);
        }
    }
}
