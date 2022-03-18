package com.ss.android.lark.voip.service.impl.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.pb.videoconference.v1.PushE2EEVoiceCallResponse;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.impl.C58151d;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.voip.service.impl.service.f */
public class C58186f {

    /* renamed from: a */
    public List<AbstractC58190b> f143101a;

    /* renamed from: b */
    private AbstractC57987d f143102b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.voip.service.impl.service.f$a */
    public static class C58189a {

        /* renamed from: a */
        public static final C58186f f143106a = new C58186f();
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.service.f$b */
    public interface AbstractC58190b {
        void onPushE2EEVoiceCall(VoiceCall voiceCall);
    }

    /* renamed from: a */
    public static final C58186f m225741a() {
        return C58189a.f143106a;
    }

    private C58186f() {
        this.f143101a = new CopyOnWriteArrayList();
        this.f143102b = C57977a.m224905c();
    }

    /* renamed from: b */
    public void mo197151b() {
        C58151d.m225578a("ui", "rust", "register push", "[VoipCallPush] registerPush: ");
        C53248k.m205912a().mo181697a(Command.PUSH_E2EE_VOICE_CALL, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.voip.service.impl.service.C58186f.C581871 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C58186f.this.mo197150a(bArr, str, z, z2);
            }
        });
    }

    /* renamed from: a */
    public void mo197149a(AbstractC58190b bVar) {
        if (bVar != null) {
            this.f143101a.add(bVar);
        }
    }

    /* renamed from: b */
    public void mo197152b(AbstractC58190b bVar) {
        if (bVar != null) {
            this.f143101a.remove(bVar);
        }
    }

    /* renamed from: a */
    public void mo197150a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            final VoiceCall a = C58174d.m225717a(PushE2EEVoiceCallResponse.ADAPTER.decode(bArr).call);
            C58151d.m225578a("push", "ui", "receive push id = " + a.getId() + ", fromUserId = " + a.getFromUserId(), "[VoipCallPush] onPushE2EEVoiceCall: receive push voiceCall = " + a.toString());
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.voip.service.impl.service.C58186f.RunnableC581882 */

                public void run() {
                    for (AbstractC58190b bVar : C58186f.this.f143101a) {
                        bVar.onPushE2EEVoiceCall(a);
                    }
                }
            });
        } catch (IOException e) {
            C58151d.m225579b("push", "ui", "receive push occur io exception", "[VoipCallPush] onPushE2EEVoiceCall: exception = " + e.toString());
        }
    }
}
