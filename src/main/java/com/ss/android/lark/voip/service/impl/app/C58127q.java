package com.ss.android.lark.voip.service.impl.app;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;

/* renamed from: com.ss.android.lark.voip.service.impl.app.q */
public class C58127q {

    /* renamed from: a */
    public volatile boolean f142994a;

    /* renamed from: b */
    private AbstractC58046e f142995b;

    public C58127q(AbstractC58046e eVar) {
        this.f142995b = eVar;
    }

    /* renamed from: a */
    public void mo197003a(VoiceCall voiceCall) {
        if (voiceCall == null || voiceCall.getStatus() == null) {
            C58151d.m225579b("ui", "rust", "update heart beat fail", "[VoIpHeartBeatPulser] updateVoIpHeartBeat: voice call status is invalid");
            return;
        }
        VoiceCall.Status status = voiceCall.getStatus();
        if (status != VoiceCall.Status.CALLING && status != VoiceCall.Status.RINGING && status != VoiceCall.Status.ON_THE_CALL && status != VoiceCall.Status.ACCEPTED) {
            C58151d.m225578a("ui", "rust", "stop heart beat", "[VoIpHeartBeatPulser] updateVoIpHeartBeat: stopHeartBeat");
            m225473a(voiceCall.getId(), new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.voip.service.impl.app.C58127q.C581281 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    C58151d.m225578a("rust", "ui", "stop heart beat success", "[VoIpHeartBeatPulser] updateVoIpHeartBeat: stopHeartBeat onSuccess");
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[VoIpHeartBeatPulser] updateVoIpHeartBeat: stopHeartBeat onError errCode = ");
                    Object obj = errorResult;
                    if (errorResult == null) {
                        obj = "null";
                    }
                    sb.append(obj);
                    C58151d.m225579b("rust", "ui", "stop heart beat fail", sb.toString());
                }
            });
        } else if (!this.f142994a && voiceCall.getStatus() == VoiceCall.Status.ON_THE_CALL) {
            C58151d.m225578a("ui", "rust", "start heart beat userId = " + voiceCall.getId(), "[VoIpHeartBeatPulser] updateVoIpHeartBeat: startHeartBeat");
            this.f142995b.mo196805a(voiceCall.getId(), new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.voip.service.impl.app.C58127q.C581292 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    C58151d.m225578a("rust", "ui", "start heart beat success", "[VoIpHeartBeatPulser] updateVoIpHeartBeat: startHeartBeat onSuccess");
                    C58127q.this.f142994a = true;
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[VoIpHeartBeatPulser] updateVoIpHeartBeat: startHeartBeat onError errCode = ");
                    Object obj = errorResult;
                    if (errorResult == null) {
                        obj = "null";
                    }
                    sb.append(obj);
                    C58151d.m225579b("rust", "ui", "start heart beat fail", sb.toString());
                }
            });
        }
    }

    /* renamed from: a */
    private void m225473a(String str, IGetDataCallback iGetDataCallback) {
        this.f142994a = false;
        this.f142995b.mo196808b(str, iGetDataCallback);
    }
}
