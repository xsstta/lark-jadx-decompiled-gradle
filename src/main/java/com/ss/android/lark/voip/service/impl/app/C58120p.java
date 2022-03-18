package com.ss.android.lark.voip.service.impl.app;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.IVoIpNetLevelListener;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.p2915c.C58149g;
import com.ss.android.lark.voip.service.impl.service.AbstractC58173c;
import com.ss.android.lark.voip.service.impl.service.C58176e;
import com.ss.android.lark.voip.service.impl.service.C58186f;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.sodium.crypto.CryptoUtil;
import com.ss.android.lark.voip.service.impl.statistics.VoipFinishType;
import com.ss.android.lark.voip.service.impl.statistics.VoipHitPoint;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.irtc.utils.C61073a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.voip.service.impl.app.p */
public class C58120p implements AbstractC58046e {

    /* renamed from: d */
    public static Map<String, Boolean> f142966d = new ConcurrentHashMap();

    /* renamed from: a */
    public VoiceCall f142967a;

    /* renamed from: b */
    public AbstractC58126a f142968b;

    /* renamed from: c */
    public ConcurrentHashMap<String, byte[]> f142969c;

    /* renamed from: e */
    public AbstractC58173c f142970e = new C58176e();

    /* renamed from: f */
    private volatile boolean f142971f;

    /* renamed from: g */
    private volatile boolean f142972g;

    /* renamed from: h */
    private volatile boolean f142973h;

    /* renamed from: i */
    private Object f142974i;

    /* renamed from: j */
    private AbstractC57987d.AbstractC57988a f142975j = C57977a.m224905c().getChatDependency();

    /* renamed from: k */
    private AbstractC57987d.AbstractC57998i f142976k = C57977a.m224905c().getWsChannelDependency();

    /* renamed from: l */
    private C58186f.AbstractC58190b f142977l = new C58186f.AbstractC58190b() {
        /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$p$UbbDl92_0JG26xpxnnh8sXmJc8 */

        @Override // com.ss.android.lark.voip.service.impl.service.C58186f.AbstractC58190b
        public final void onPushE2EEVoiceCall(VoiceCall voiceCall) {
            C58120p.m271074lambda$UbbDl92_0JG26xpxnnh8sXmJc8(C58120p.this, voiceCall);
        }
    };

    /* renamed from: m */
    private IVoIpNetLevelListener f142978m = new IVoIpNetLevelListener() {
        /* class com.ss.android.lark.voip.service.impl.app.C58120p.C581211 */

        /* renamed from: a */
        int f142979a;

        /* renamed from: b */
        long f142980b;

        @Override // com.ss.android.lark.voip.service.IVoIpNetLevelListener
        /* renamed from: a */
        public void mo196635a() {
            Object obj;
            boolean z;
            StringBuilder sb = new StringBuilder();
            sb.append("[VoIpCallModel] push good net quality callStatus = ");
            if (C58120p.this.f142967a != null) {
                obj = C58120p.this.f142967a.getStatus();
            } else {
                obj = "";
            }
            sb.append(obj);
            C58151d.m225578a("rust", "ui", "push good net quality", sb.toString());
            if (C58120p.this.f142968b != null && C58120p.this.f142967a != null) {
                if (C58120p.this.f142967a.getStatus() == VoiceCall.Status.CALLING || C58120p.this.f142967a.getStatus() == VoiceCall.Status.RINGING || C58120p.this.f142967a.getStatus() == VoiceCall.Status.ACCEPTED) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.f142980b < 1000 || C58075i.m225283a(2) == C58075i.m225283a(this.f142979a)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("[VoIpCallModel] push good net quality fail timeCompare = ");
                        boolean z2 = true;
                        if (currentTimeMillis - this.f142980b < 1000) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sb2.append(z);
                        sb2.append(", qualityCompare = ");
                        if (2 != this.f142979a) {
                            z2 = false;
                        }
                        sb2.append(z2);
                        C58151d.m225579b("rust", "ui", "push good net quality fail", sb2.toString());
                        return;
                    }
                    this.f142979a = 2;
                    this.f142980b = currentTimeMillis;
                    C58120p.this.f142968b.mo196969a(C58120p.this.f142967a, 2);
                }
            }
        }

        @Override // com.ss.android.lark.voip.service.IVoIpNetLevelListener
        /* renamed from: b */
        public void mo196636b() {
            Object obj;
            boolean z;
            StringBuilder sb = new StringBuilder();
            sb.append("[VoIpCallModel] push poor net quality callStatus = ");
            if (C58120p.this.f142967a != null) {
                obj = C58120p.this.f142967a.getStatus();
            } else {
                obj = "";
            }
            sb.append(obj);
            C58151d.m225578a("rust", "ui", "push poor net quality", sb.toString());
            if (C58120p.this.f142968b != null && C58120p.this.f142967a != null) {
                if (C58120p.this.f142967a.getStatus() == VoiceCall.Status.CALLING || C58120p.this.f142967a.getStatus() == VoiceCall.Status.RINGING || C58120p.this.f142967a.getStatus() == VoiceCall.Status.ACCEPTED) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.f142980b < 1000 || C58075i.m225283a(3) == C58075i.m225283a(this.f142979a)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("[VoIpCallModel] push good net quality fail timeCompare = ");
                        boolean z2 = true;
                        if (currentTimeMillis - this.f142980b < 1000) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sb2.append(z);
                        sb2.append(", qualityCompare = ");
                        if (3 != this.f142979a) {
                            z2 = false;
                        }
                        sb2.append(z2);
                        C58151d.m225579b("rust", "ui", "push poor net quality fail", sb2.toString());
                        return;
                    }
                    this.f142979a = 3;
                    this.f142980b = currentTimeMillis;
                    C58120p.this.f142968b.mo196969a(C58120p.this.f142967a, 3);
                }
            }
        }
    };

    /* renamed from: com.ss.android.lark.voip.service.impl.app.p$a */
    public interface AbstractC58126a {
        /* renamed from: a */
        void mo196966a();

        /* renamed from: a */
        void mo196967a(ErrorResult errorResult, VoiceCall voiceCall);

        /* renamed from: a */
        void mo196968a(VoiceCall voiceCall);

        /* renamed from: a */
        void mo196969a(VoiceCall voiceCall, int i);

        /* renamed from: a */
        void mo196970a(boolean z);

        /* renamed from: b */
        void mo196971b(boolean z);

        /* renamed from: c */
        void mo196972c(boolean z);
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58046e
    /* renamed from: b */
    public boolean mo196810b() {
        return this.f142971f;
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58046e
    /* renamed from: a */
    public void mo196807a(boolean z) {
        String str = z ? "enable mute" : "disable mute";
        C58151d.m225578a("ui", "ui", str, "[VoIpEngineModel] setMute: isMute = " + z);
        this.f142971f = z;
        AbstractC58126a aVar = this.f142968b;
        if (aVar != null) {
            aVar.mo196970a(z);
        }
    }

    /* renamed from: a */
    public boolean mo196992a(VoiceCall voiceCall, byte[] bArr, byte[] bArr2) {
        if (this.f142974i == null) {
            return false;
        }
        try {
            boolean a = C58133t.m225480a(voiceCall);
            byte[] a2 = C61073a.m237504a(this.f142974i);
            byte[] b = C61073a.m237505b(this.f142974i);
            byte[] bArr3 = this.f142969c.get(voiceCall.getId());
            C58151d.m225578a("ui", "ui", "get encrypt key isCallFromMe = " + a, "[VoIpEngineModel] getEncryptKey: isCallFromMe = " + a + " client_pk = " + a2.toString() + " client_sk = " + b.toString() + " server_pk = " + CryptoUtil.hexEncode(voiceCall.getPublicKey()));
            if (bArr3 == null) {
                C58151d.m225579b("ui", "ui", "get encrypt key exception, serverPk is null", "[VoIpEngineModel] getEncryptKey: serverPk is null");
                return false;
            }
            if (a) {
                C58149g.m225570a().mo210488a(bArr, bArr2, a2, b, bArr3);
            } else {
                C58149g.m225570a().mo210523b(bArr, bArr2, a2, b, bArr3);
            }
            this.f142969c.clear();
            return true;
        } catch (Throwable th) {
            C58151d.m225579b("ui", "ui", "get encrypt key exception", "[VoIpEngineModel] getEncryptKey: exception=" + th.toString());
            VoipHitPoint.m225616a(voiceCall.getId(), C58133t.m225480a(voiceCall), "failKeypair", false, voiceCall.isUseByteDanceChannel(), null);
            return false;
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58046e
    /* renamed from: a */
    public synchronized VoiceCall mo196802a() {
        return this.f142967a;
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58046e
    /* renamed from: c */
    public void mo196811c() {
        AbstractC58126a aVar = this.f142968b;
        if (aVar != null) {
            aVar.mo196966a();
        }
    }

    /* renamed from: d */
    public void mo196996d() {
        C58151d.m225578a("ui", "ui", "un init VoIpEngineModel", "[VoIpEngineModel] unInit: mPushE2EEVoiceCallListener = " + this.f142977l);
        C58186f.m225741a().mo197152b(this.f142977l);
        this.f142976k.mo145497b(this.f142978m);
    }

    /* renamed from: c */
    public void mo196994c(VoiceCall voiceCall) {
        AbstractC58126a aVar = this.f142968b;
        if (aVar != null) {
            aVar.mo196968a(voiceCall);
        }
    }

    /* renamed from: d */
    public void mo196997d(boolean z) {
        boolean z2;
        this.f142973h = z;
        if (z || !this.f142972g) {
            z2 = false;
        } else {
            z2 = true;
        }
        mo196995c(z2);
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58046e
    /* renamed from: a */
    public void mo196804a(String str) {
        C58151d.m225577a("VoIpEngineModel", "[VoIpEngineModel] cancelVoiceCallWithCreateId: createId = " + str);
        f142966d.remove(str);
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58046e
    /* renamed from: b */
    public void mo196809b(boolean z) {
        C58151d.m225578a("ui", "ui", "mute all remote ", "[VoIpEngineModel] muteAll: isMute = " + z);
        AbstractC58126a aVar = this.f142968b;
        if (aVar != null) {
            aVar.mo196971b(z);
        }
    }

    /* renamed from: e */
    public void mo196998e(final boolean z) {
        C58151d.m225578a("ui", "rust", "check phone call has come in", "[VoIpEngineModel] checkHasPhoneCallComeIn");
        this.f142970e.mo197130a(new IGetDataCallback<List<VoiceCall>>() {
            /* class com.ss.android.lark.voip.service.impl.app.C58120p.C581222 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Object obj;
                StringBuilder sb = new StringBuilder();
                sb.append("[VoIpEngineModel] checkHasPhoneCallComeIn: pullE2EEVoiceCalls onError errCode = ");
                if (errorResult == null) {
                    obj = "null";
                } else {
                    obj = Integer.valueOf(errorResult.getErrorCode());
                }
                sb.append(obj);
                C58151d.m225578a("rust", "ui", "check phone call has come in fail", sb.toString());
            }

            /* renamed from: a */
            public void onSuccess(List<VoiceCall> list) {
                C58151d.m225578a("rust", "ui", "check phone call has come in success", "[VoIpEngineModel] checkHasPhoneCallComeIn: pullE2EEVoiceCalls onSuccess");
                if (CollectionUtils.isEmpty(list)) {
                    C58151d.m225579b("rust", "ui", "check phone call has come in success with empty list", "[VoIpEngineModel] checkHasPhoneCallComeIn: pullE2EEVoiceCalls onSuccess with empty list");
                    return;
                }
                VoiceCall voiceCall = list.get(0);
                voiceCall.setOffline(true);
                C58120p.this.f142969c.put(voiceCall.getId(), voiceCall.getPublicKey());
                C58151d.m225578a("", "", "", "[VoIpEngineModel] checkHasPhoneCallComeIn: voiceId = " + voiceCall.getId() + " ServerPk = " + CryptoUtil.hexEncode(voiceCall.getPublicKey()));
                if ((voiceCall.getStatus() == VoiceCall.Status.CALLING || voiceCall.getStatus() == VoiceCall.Status.RINGING) && !C58133t.m225480a(voiceCall)) {
                    VoipHitPoint.m225637h(voiceCall.getId(), C58133t.m225480a(voiceCall));
                }
                C58120p.this.mo196991a(voiceCall, z);
                C58120p.this.mo196994c(voiceCall);
            }
        });
    }

    /* renamed from: a */
    public synchronized void mo196990a(VoiceCall voiceCall) {
        C58151d.m225578a("ui", "ui", "setCurrentVoiceCall", "[VoIpEngineModel] setCurrentVoiceCall: target voiceCall = " + voiceCall);
        this.f142967a = voiceCall;
    }

    /* renamed from: c */
    public void mo196995c(boolean z) {
        String str;
        if (z) {
            str = "enable speaker";
        } else {
            str = "disable speaker";
        }
        C58151d.m225578a("ui", "ui", str, "[VoIpEngineModel] setSpeaker: isSpeaker = " + z);
        this.f142972g = z;
        AbstractC58126a aVar = this.f142968b;
        if (aVar != null) {
            aVar.mo196972c(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m225437d(VoiceCall voiceCall) {
        this.f142969c.put(voiceCall.getId(), voiceCall.getPublicKey());
        C58151d.m225578a("", "", "", "[VoIpEngineModel] onPushE2EEVoiceCall: voiceId = " + voiceCall.getId() + " ServerPk = " + CryptoUtil.hexEncode(voiceCall.getPublicKey()));
        voiceCall.setSelfClientValid(false);
        mo196994c(voiceCall);
        if (voiceCall.getStatus() == VoiceCall.Status.TERMINATED) {
            VoipFinishType.m225597a(voiceCall.getId(), 1);
            C58095m.m225340a(voiceCall.getId(), voiceCall.getStatus());
        }
        if ((voiceCall.getStatus() == VoiceCall.Status.CALLING || voiceCall.getStatus() == VoiceCall.Status.RINGING) && !C58133t.m225480a(voiceCall)) {
            VoipHitPoint.m225635g(voiceCall.getId(), C58133t.m225480a(voiceCall));
        }
    }

    /* renamed from: a */
    public void mo196989a(AbstractC58126a aVar) {
        C58186f.m225741a().mo197149a(this.f142977l);
        this.f142976k.mo145496a(this.f142978m);
        this.f142969c = new ConcurrentHashMap<>();
        this.f142968b = aVar;
        if (this.f142974i == null) {
            try {
                this.f142974i = C58149g.m225570a().mo210568z();
            } catch (Throwable th) {
                th.printStackTrace();
                C58151d.m225578a("ui", "ui", "init VoIpEngineModel", "[VoIpEngineModel] init: exception = " + th);
            }
        }
    }

    /* renamed from: b */
    public void m225438e(VoiceCall voiceCall) {
        boolean z;
        if (voiceCall == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[VoIpEngineModel] onPushE2EEVoiceCall: data or call entity is null voiceCall = ");
            if (voiceCall != null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C58151d.m225579b("push", "ui", "receive voice call push fail", sb.toString());
        } else if (this.f142975j.mo145502a() == null) {
            C58151d.m225579b("push", "ui", "receive voice call push fail for null chatter", "[VoIpEngineModel] onPushE2EEVoiceCall: chatter is null");
        } else {
            Log.m165389i("VoIpEngineModel", "VoIpEngineModel receive push command = PUSH_E2EE_VOICE_CALL");
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(voiceCall) {
                /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$p$EQPUuEHbusEYLp0RczItzCCdX1s */
                public final /* synthetic */ VoiceCall f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C58120p.lambda$EQPUuEHbusEYLp0RczItzCCdX1s(C58120p.this, this.f$1);
                }
            });
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58046e
    /* renamed from: b */
    public void mo196808b(String str, IGetDataCallback iGetDataCallback) {
        this.f142970e.mo197135b(str, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo196988a(ErrorResult errorResult, VoiceCall voiceCall) {
        AbstractC58126a aVar = this.f142968b;
        if (aVar != null) {
            aVar.mo196967a(errorResult, voiceCall);
        }
    }

    /* renamed from: a */
    public void mo196991a(VoiceCall voiceCall, boolean z) {
        int i;
        if (voiceCall != null && z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resp_status", voiceCall.getStatus().toString());
                int i2 = 1;
                if (VCAppLifeCycle.m236255b()) {
                    i = 1;
                } else {
                    i = 2;
                }
                jSONObject.put("app_foreground", i);
                if (!C58133t.m225481b(mo196802a())) {
                    i2 = 2;
                }
                jSONObject.put("voip_is_ongoing", i2);
                Statistics.sendEvent("voip_ws_reconnected", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58046e
    /* renamed from: a */
    public void mo196805a(String str, IGetDataCallback iGetDataCallback) {
        this.f142970e.mo197131a(str, iGetDataCallback);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m225436b(String str, String str2, final String str3, final IGetDataCallback iGetDataCallback) {
        Object obj = this.f142974i;
        if (obj == null) {
            C58151d.m225579b("ui", "rust", "invite call fail", "[VoIpEngineModel] putE2EEVoiceCall: callImpl currentKeyPair is null");
            return;
        }
        final byte[] a = C61073a.m237504a(obj);
        C58151d.m225578a("", "", "", "[VoIpCallModel] putE2EEVoiceCall: clientPk = " + C61073a.m237504a(this.f142974i).toString());
        this.f142970e.mo197133a(str, str2, a, new IGetDataCallback<VoiceCall>() {
            /* class com.ss.android.lark.voip.service.impl.app.C58120p.C581233 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C58151d.m225579b("rust", "ui", "invite call fail errMsg = " + errorResult.getDebugMsg(), "[VoIpEngineModel] putE2EEVoiceCall: onError errCode = " + errorResult.getErrorCode());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(VoiceCall voiceCall) {
                C58151d.m225577a("VoIpEngineModel", "[VoIpEngineModel] putE2EEVoiceCall: createId2 = " + str3);
                Boolean bool = C58120p.f142966d.get(str3);
                Object obj = "null";
                if (bool == null || !bool.booleanValue()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[VoIpEngineModel] putE2EEVoiceCall: onSuccess, already cancel, status = ");
                    if (voiceCall != null) {
                        obj = voiceCall.getStatus();
                    }
                    sb.append(obj);
                    C58151d.m225577a("VoIpEngineModel", sb.toString());
                    C58120p.this.f142970e.mo197134a(voiceCall.getId(), a, VoiceCall.Status.CANCELLED, new IGetDataCallback<String>() {
                        /* class com.ss.android.lark.voip.service.impl.app.C58120p.C581233.C581241 */

                        /* renamed from: a */
                        public void onSuccess(String str) {
                            C58151d.m225577a("VoIpEngineModel", "[VoIpEngineModel] putE2EEVoiceCall: cancel call success");
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            C58151d.m225577a("VoIpEngineModel", "[VoIpEngineModel] putE2EEVoiceCall: cancel call fail " + errorResult.toString());
                        }
                    });
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[VoIpEngineModel] putE2EEVoiceCall: onSuccess status=");
                if (voiceCall != null) {
                    obj = voiceCall.getStatus();
                }
                sb2.append(obj);
                C58151d.m225578a("rust", "ui", "invite call success", sb2.toString());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(voiceCall);
                }
                C58120p.this.mo196994c(voiceCall);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m225435b(final VoiceCall voiceCall, final VoiceCall.Status status, final IGetDataCallback iGetDataCallback, final boolean z) {
        Object obj = this.f142974i;
        if (obj == null) {
            C58151d.m225579b("ui", "rust", "patch status fail", "[VoIpEngineModel] patchE2EEVoiceCall: currentKeyPair is null");
            return;
        }
        byte[] a = C61073a.m237504a(obj);
        C58151d.m225578a("", "", "", "[VoIpEngineModel] patchE2EEVoiceCall: clientPk = " + C61073a.m237504a(this.f142974i).toString());
        this.f142970e.mo197134a(voiceCall.getId(), a, status, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.voip.service.impl.app.C58120p.C581254 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C58151d.m225578a("rust", "ui", "update voice call success newStatus = " + status, "[VoIpEngineModel] patchE2EEVoiceCall: onSuccess newStatus=" + status);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(str);
                }
                if (!z) {
                    VoiceCall voiceCall = new VoiceCall(voiceCall);
                    voiceCall.setStatus(status);
                    C58120p.this.mo196994c(voiceCall);
                    C58095m.m225340a(voiceCall.getId(), status);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Object obj;
                StringBuilder sb = new StringBuilder();
                sb.append("[VoIpEngineModel] patchE2EEVoiceCall: onError errCode = ");
                if (errorResult == null) {
                    obj = "null";
                } else {
                    obj = errorResult;
                }
                sb.append(obj);
                C58151d.m225579b("rust", "ui", "update voice call fail", sb.toString());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
                if (!z && status == VoiceCall.Status.ACCEPTED) {
                    VoiceCall voiceCall = new VoiceCall(voiceCall);
                    voiceCall.setStatus(status);
                    C58120p.this.mo196988a(errorResult, voiceCall);
                }
            }
        });
        if (z) {
            VoiceCall voiceCall2 = new VoiceCall(voiceCall);
            voiceCall2.setStatus(status);
            mo196994c(voiceCall2);
            C58095m.m225340a(voiceCall2.getId(), status);
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58046e
    /* renamed from: a */
    public void mo196803a(VoiceCall voiceCall, VoiceCall.Status status, IGetDataCallback<String> iGetDataCallback, boolean z) {
        if (this.f142967a == null) {
            C58151d.m225579b("ui", "rust", "update voice call fail", "[VoIpEngineModel] patchE2EEVoiceCall: currentVoiceCall is null");
        } else {
            CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable(voiceCall, status, iGetDataCallback, z) {
                /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$p$XozgJUyNa5u1LbRZKF5op4kK8I */
                public final /* synthetic */ VoiceCall f$1;
                public final /* synthetic */ VoiceCall.Status f$2;
                public final /* synthetic */ IGetDataCallback f$3;
                public final /* synthetic */ boolean f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void run() {
                    C58120p.m271075lambda$XozgJUyNa5u1LbRZKF5op4kK8I(C58120p.this, this.f$1, this.f$2, this.f$3, this.f$4);
                }
            });
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58046e
    /* renamed from: a */
    public void mo196806a(String str, String str2, String str3, IGetDataCallback<VoiceCall> iGetDataCallback) {
        C58151d.m225577a("VoIpEngineModel", "[VoIpEngineModel] putE2EEVoiceCall: createId1 = " + str3);
        f142966d.put(str3, true);
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(str, str2, str3, iGetDataCallback) {
            /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$p$_KFJhLUZ4EQQnmvNochpV5uS1aI */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ IGetDataCallback f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                C58120p.lambda$_KFJhLUZ4EQQnmvNochpV5uS1aI(C58120p.this, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }
}
