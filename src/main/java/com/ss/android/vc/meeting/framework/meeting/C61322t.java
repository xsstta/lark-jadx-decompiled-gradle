package com.ss.android.vc.meeting.framework.meeting;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.irtc.C61022a;
import com.ss.android.vc.irtc.RtcAudioVolumeInfo;
import com.ss.android.vc.irtc.RtcNetworkQualityInfo;
import com.ss.android.vc.irtc.RtcSystemUsageInfo;
import com.ss.android.vc.irtc.VcByteStream;
import com.ss.android.vc.meeting.framework.meeting.utils.C61327a;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.t */
public class C61322t extends C61022a {

    /* renamed from: b */
    private static long f153642b;

    /* renamed from: a */
    public long f153643a;

    /* renamed from: c */
    private String f153644c = ("RtcListenerImpl@" + this.f153643a);

    /* renamed from: d */
    private Handler f153645d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private ByteRtc f153646e;

    /* renamed from: f */
    private C61303k f153647f;

    /* renamed from: g */
    private C61295c f153648g = new C61295c(this.f153644c);

    /* renamed from: h */
    private long f153649h = 0;

    /* renamed from: i */
    private int f153650i = Integer.MAX_VALUE;

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo197060a(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo210628a(boolean z) {
    }

    /* renamed from: a */
    public void mo212251a(AbstractC61296d dVar) {
        this.f153648g.mo212072a(dVar);
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo196963a(String str, String str2) {
        String str3 = this.f153644c;
        C60700b.m235851b(str3, "[onJoinChannelSuccess]", str + " " + str2);
        this.f153645d.post(new Runnable(str, str2) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$P96FXdH9xSoZvFYcR_hZr5KISk */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C61322t.this.m238852j(this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo210622a(String str, int i, int i2) {
        String str2 = this.f153644c;
        C60700b.m235851b(str2, "[onFirstRemoteVideoFrame]", str + " " + i + " " + i2);
        this.f153645d.post(new Runnable(str, i, i2) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$H23W_VKyuTenAplP7v7EzRX5BU */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C61322t.this.m238835d((C61322t) this.f$1, (String) this.f$2, this.f$3);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo196962a(String str, RtcNetworkQualityInfo rtcNetworkQualityInfo) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f153649h >= 300 && rtcNetworkQualityInfo.f152893d != this.f153650i) {
            this.f153645d.post(new Runnable(str, rtcNetworkQualityInfo) {
                /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$fbqySq74WWJd5qznIj8Fkc2KE4 */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ RtcNetworkQualityInfo f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C61322t.this.m238829b((C61322t) this.f$1, (String) this.f$2);
                }
            });
            this.f153649h = currentTimeMillis;
            this.f153650i = rtcNetworkQualityInfo.f152893d;
        }
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: b */
    public void mo210635b(String str, String str2) {
        String str3 = this.f153644c;
        C60700b.m235851b(str3, "[onStreamRemove]", str + " " + str2);
        this.f153645d.post(new Runnable(str, str2) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$cRPiCrZpmsipBN5D8OOQ3KxRjk */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C61322t.this.m238851i(this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo196961a(String str) {
        this.f153645d.post(new Runnable(str) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$1bnniYj2qx6yWqhED9b8YrWiz20 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C61322t.this.m238848g(this.f$1);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo210629a(RtcAudioVolumeInfo[] rtcAudioVolumeInfoArr, int i) {
        this.f153645d.post(new Runnable(rtcAudioVolumeInfoArr, i) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$hREl5LAglAvIZMMsilI8yExRQN0 */
            public final /* synthetic */ RtcAudioVolumeInfo[] f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C61322t.this.m238830b((C61322t) this.f$1, (RtcAudioVolumeInfo[]) this.f$2);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: b */
    public void mo210634b(String str, int i, int i2) {
        String str2 = this.f153644c;
        C60700b.m235851b(str2, "[onFirstRemoteScreenFrame]", str + " " + i + " " + i2);
        this.f153645d.post(new Runnable(str, i, i2) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$yfstInr_dnXn_HljCxf4OLnjMk */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C61322t.this.m238832c((C61322t) this.f$1, (String) this.f$2, this.f$3);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: b */
    public void mo210633b(String str) {
        this.f153645d.post(new Runnable(str) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$JMGJrBCTIxDTt58FzlEF_6uJYHU */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C61322t.this.m238845f((C61322t) this.f$1);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo210626a(String str, boolean z) {
        String str2 = this.f153644c;
        C60700b.m235851b(str2, "[onUserMuteVideo]", str + " " + z);
        this.f153645d.post(new Runnable(str, z) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$Dgci5TgqXQHcmFDwuH1W2kLnOXs */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C61322t.this.m238841e((C61322t) this.f$1, (String) this.f$2);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: b */
    public void mo210636b(String str, boolean z) {
        String str2 = this.f153644c;
        C60700b.m235851b(str2, "[onUserMuteAudio]", str + " " + z);
        this.f153645d.post(new Runnable(str, z) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$i4MmpUzNTix8BewGGYewXJ3VKw */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C61322t.this.m238836d((C61322t) this.f$1, (String) this.f$2);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo210624a(String str, int i, byte[] bArr) {
        C60700b.m235851b(this.f153644c, "[onStreamMessage]", "onStreamMessage");
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo210623a(String str, int i, int i2, int i3, int i4) {
        String str2 = this.f153644c;
        C60700b.m235851b(str2, "[onStreamMessageError]", str + " " + i + " " + i2 + " " + i3 + " " + i4);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m238837e() {
        this.f153648g.mo211743a();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m238842f() {
        this.f153648g.mo211757b();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m238847g() {
        this.f153646e.mo211990a(2);
        this.f153648g.mo211767c();
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo196959a() {
        C60700b.m235851b(this.f153644c, "[onConnectionLost]", "onConnectionLost");
        this.f153645d.post(new Runnable() {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$y33L1rg3GIUXZfuYN0AlxS5I1A */

            public final void run() {
                C61322t.this.m238837e();
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: c */
    public void mo196965c() {
        C60700b.m235851b(this.f153644c, "[onConnectionLostUser]", "onConnectionLostUser");
        this.f153645d.post(new Runnable() {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$otrh5EwtsLmzSz6jkRLCALwMLFc */

            public final void run() {
                C61322t.this.m238842f();
            }
        });
    }

    public String toString() {
        return this.f153643a + "@" + hashCode();
    }

    /* renamed from: d */
    public void mo212253d() {
        this.f153648g.mo212074d();
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: b */
    public void mo196964b() {
        C60700b.m235851b(this.f153644c, "[onConnectionInterrupted]", "onConnectionInterrupted");
        this.f153645d.post(new Runnable() {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$wgE0p2MNGbZBjC0vwm209X_QV0 */

            public final void run() {
                C61322t.this.m238847g();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m238826b(RtcAudioVolumeInfo rtcAudioVolumeInfo) {
        this.f153648g.mo211748a(rtcAudioVolumeInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m238848g(String str) {
        this.f153648g.mo211769c(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m238838e(int i) {
        this.f153648g.mo211758b(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m238843f(int i) {
        this.f153646e.mo211990a(4);
        this.f153648g.mo211745a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m238840e(String str) {
        this.f153648g.mo211762b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m238845f(String str) {
        this.f153648g.i_(str);
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo196738a(int i) {
        String str = this.f153644c;
        C60700b.m235851b(str, "[onError]", i + " " + C61327a.C61328a.m238901a(i) + " " + C61327a.C61328a.m238902b(i));
        this.f153645d.post(new Runnable(i) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$uAamHsLblu1v6p4TxdTJ6yII */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C61322t.this.m238843f((C61322t) this.f$1);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: c */
    public void mo210637c(int i) {
        String str = this.f153644c;
        C60700b.m235851b(str, "[onMaximumScreenShareFpsUpdated]", "fps: " + i);
        this.f153645d.post(new Runnable(i) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$HM8UNs4QEbGc3_6_YtuJlBrv0 */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C61322t.this.m238838e((C61322t) this.f$1);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: c */
    public void mo210639c(String str) {
        String str2 = this.f153644c;
        C60700b.m235851b(str2, "[onUserOffline]", "id " + str);
        this.f153645d.post(new Runnable(str) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$WINp5vdIDalMFvlY2YajAA0vtgs */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C61322t.this.m238840e((C61322t) this.f$1);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: b */
    public void mo210630b(int i) {
        String str = this.f153644c;
        C60700b.m235851b(str, "[onFirstLocalAudioFrame]", "elapsed = " + i);
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo210618a(RtcAudioVolumeInfo rtcAudioVolumeInfo) {
        C60700b.m235851b(this.f153644c, "[onLocalAudioVolumeIndication]", "onLocalAudioVolumeIndication");
        this.f153645d.post(new Runnable(rtcAudioVolumeInfo) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$ld03zqsTlGz4iLvJY1rlBKc6U8Y */
            public final /* synthetic */ RtcAudioVolumeInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C61322t.this.m238826b((C61322t) this.f$1);
            }
        });
    }

    /* renamed from: b */
    public void mo212252b(AbstractC61296d dVar) {
        this.f153648g.mo212073b(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m238833d(int i, int i2) {
        this.f153648g.mo211768c(i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m238851i(String str, String str2) {
        this.f153648g.mo211764b(str, str2);
    }

    @Override // com.ss.android.vc.irtc.C61022a
    /* renamed from: a */
    public void mo196960a(long j, long j2) {
        this.f153646e.mo211991a(j, j2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m238827b(RtcSystemUsageInfo rtcSystemUsageInfo, String str) {
        this.f153648g.mo211749a(rtcSystemUsageInfo, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m238850h(String str, String str2) {
        this.f153646e.mo211990a(1);
        this.f153648g.mo211771e(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m238852j(String str, String str2) {
        this.f153646e.mo211990a(1);
        this.f153648g.mo211754a(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m238828b(VcByteStream vcByteStream, String str) {
        this.f153648g.mo211750a(vcByteStream, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m238839e(int i, int i2) {
        this.f153648g.mo211759b(i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m238844f(int i, int i2) {
        this.f153648g.mo211746a(i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m238849g(String str, String str2) {
        this.f153648g.b_(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m238829b(String str, RtcNetworkQualityInfo rtcNetworkQualityInfo) {
        this.f153648g.mo211753a(str, rtcNetworkQualityInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m238836d(String str, boolean z) {
        this.f153648g.mo211765b(str, z);
    }

    public C61322t(ByteRtc byteRtc, C61303k kVar) {
        long j = f153642b + 1;
        f153642b = j;
        this.f153643a = j;
        this.f153646e = byteRtc;
        this.f153647f = kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m238830b(RtcAudioVolumeInfo[] rtcAudioVolumeInfoArr, int i) {
        Participant j;
        try {
            C61303k kVar = this.f153647f;
            if (kVar != null && (j = kVar.mo212091I().mo212494b().mo212605j()) != null && j.getParticipantSettings().isMicrophoneMuted()) {
                int length = rtcAudioVolumeInfoArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    RtcAudioVolumeInfo rtcAudioVolumeInfo = rtcAudioVolumeInfoArr[i2];
                    if (TextUtils.equals(rtcAudioVolumeInfo.f152887a, j.getRtcJoinId())) {
                        rtcAudioVolumeInfo.f152889c = -127;
                        break;
                    }
                    i2++;
                }
            }
        } catch (Exception e) {
            C60700b.m235864f(this.f153644c, "[onAudioVolumeIndication]", e.toString());
        }
        this.f153648g.mo211756a(rtcAudioVolumeInfoArr, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m238841e(String str, boolean z) {
        this.f153648g.mo211755a(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m238846f(String str, String str2) {
        this.f153648g.mo211770c(str, str2);
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo208480a(int i, int i2) {
        String str = this.f153644c;
        C60700b.m235851b(str, "[onFirstLocalVideoFrame]", i + " " + i2);
        this.f153645d.post(new Runnable(i, i2) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$SDD7R4JjUupkNQKO818LrsxxTCM */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C61322t.this.m238844f((C61322t) this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: c */
    public void mo210638c(int i, int i2) {
        String str = this.f153644c;
        C60700b.m235851b(str, "[onLocalVideoStateChanged]", i + " " + i2);
        this.f153645d.post(new Runnable(i, i2) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$iDNMGa3MHACzCwjsKVKvcMVfJA4 */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C61322t.this.m238833d((C61322t) this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: d */
    public void mo210644d(String str, String str2) {
        String str3 = this.f153644c;
        C60700b.m235851b(str3, "[onScreenStreamRemove]", str + " " + str2);
        this.f153645d.post(new Runnable(str, str2) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$322jEzH5BoTAhj7FpJmwexgu8 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C61322t.this.m238849g(this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: e */
    public void mo210645e(String str, String str2) {
        String str3 = this.f153644c;
        C60700b.m235851b(str3, "[onScreenStreamAdd]", str + " " + str2);
        this.f153645d.post(new Runnable(str, str2) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$6McbottehkC42buBLTfRKk8xAzY */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C61322t.this.m238846f((C61322t) this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: c */
    public void mo210640c(String str, String str2) {
        String str3 = this.f153644c;
        C60700b.m235851b(str3, "[onRejoinChannelSuccess]", str + " " + str2);
        this.f153645d.post(new Runnable(str, str2) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$H0QVBC1iD9HvvIkrZKldR8WTJEQ */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C61322t.this.m238850h(this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: b */
    public void mo210631b(int i, int i2) {
        String str = this.f153644c;
        C60700b.m235851b(str, "[onLocalAudioStateChanged]", i + " " + i2);
        this.f153645d.post(new Runnable(i, i2) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$2FlcBknRsYdNhh9rkIcXnl3tm0 */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C61322t.this.m238839e((C61322t) this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: c */
    public void mo210641c(String str, boolean z) {
        String str2 = this.f153644c;
        C60700b.m235851b(str2, "[onUserEnableLocalVideo]", "uid " + str + " " + z);
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo210619a(RtcSystemUsageInfo rtcSystemUsageInfo, String str) {
        String str2 = this.f153644c;
        C60700b.m235851b(str2, "[onSystemOverloaded]", rtcSystemUsageInfo + ", config: " + str);
        this.f153645d.post(new Runnable(rtcSystemUsageInfo, str) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$gtZQSVx9NjzvDdR7ML6VTnaWcP8 */
            public final /* synthetic */ RtcSystemUsageInfo f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C61322t.this.m238827b((C61322t) this.f$1, (RtcSystemUsageInfo) this.f$2);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo210621a(VcByteStream vcByteStream, String str) {
        this.f153645d.post(new Runnable(vcByteStream, str) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$EbNSwFe75EA1Lwrpkhksdxyq7w */
            public final /* synthetic */ VcByteStream f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C61322t.this.m238828b((C61322t) this.f$1, (VcByteStream) this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m238831c(int i, String str, int i2) {
        this.f153648g.mo211747a(i, str, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m238832c(String str, int i, int i2) {
        this.f153648g.mo211763b(str, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m238834d(int i, String str, int i2) {
        this.f153646e.mo211990a(4);
        this.f153648g.mo211760b(i, str, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m238835d(String str, int i, int i2) {
        this.f153648g.mo211752a(str, i, i2);
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo208481a(int i, String str, int i2) {
        String str2 = this.f153644c;
        C60700b.m235851b(str2, "[onMediaDeviceError]", i2 + ", " + i + ", " + str);
        this.f153645d.post(new Runnable(i, str, i2) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$ectUr4QQw51NbbCYxCWoc9eituI */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C61322t.this.m238834d((C61322t) this.f$1, (int) this.f$2, (String) this.f$3);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: b */
    public void mo210632b(int i, String str, int i2) {
        String str2 = this.f153644c;
        C60700b.m235851b(str2, "[onMediaDeviceWarning]", i2 + ", " + i + ", " + str);
        this.f153645d.post(new Runnable(i, str, i2) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$t$2PTuZC8YvmdSIqX7gX_lQDghNXU */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C61322t.this.m238831c((C61322t) this.f$1, (int) this.f$2, (String) this.f$3);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo210617a(long j, long j2, double d, double d2) {
        mo196960a(j, j2);
        this.f153648g.mo211744a(d, d2);
    }

    @Override // com.ss.android.vc.irtc.C61022a, com.ss.android.vc.irtc.AbstractC61058j
    /* renamed from: a */
    public void mo210616a(int i, String str, boolean z, boolean z2) {
        String str2 = this.f153644c;
        C60700b.m235851b(str2, "[onStreamSubscribed]", " status " + i + ", streamId = " + str + ", audioSubscribe " + z + " videoSubscribe " + z2);
    }
}
