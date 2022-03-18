package com.ss.android.vc.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.ss.android.vc.irtc.AbstractC61023b;
import com.ss.android.vc.irtc.AbstractC61024c;
import com.ss.android.vc.irtc.AbstractC61025d;
import com.ss.android.vc.irtc.AbstractC61026e;
import com.ss.android.vc.irtc.AbstractC61027f;
import com.ss.android.vc.irtc.AbstractC61030i;
import com.ss.android.vc.irtc.AbstractC61058j;
import com.ss.android.vc.irtc.AbstractC61060l;
import com.ss.android.vc.irtc.AbstractC61061m;
import com.ss.android.vc.irtc.AbstractC61063o;
import com.ss.android.vc.irtc.C61064p;
import com.ss.android.vc.irtc.C61065q;
import com.ss.android.vc.irtc.C61066r;
import com.ss.android.vc.irtc.C61067s;
import com.ss.android.vc.irtc.C61071u;
import com.ss.android.vc.irtc.RtcConstants;
import com.ss.android.vc.irtc.RtcDevicePerfInfo;
import com.ss.android.vc.irtc.SubChannelInfo;

/* renamed from: com.ss.android.vc.impl.a */
public abstract class AbstractC61012a {

    /* renamed from: a */
    private static Context f152871a;

    /* renamed from: b */
    private final AbstractC61061m f152872b = C61067s.m237490a().mo211282b();

    /* renamed from: c */
    private AbstractC61026e f152873c;

    /* renamed from: d */
    private AbstractC61014c f152874d;

    /* renamed from: e */
    private boolean f152875e = true;

    /* renamed from: f */
    private final boolean f152876f = false;

    /* renamed from: g */
    private int f152877g;

    /* renamed from: h */
    private volatile boolean f152878h;

    /* renamed from: i */
    private int f152879i = 1;

    /* renamed from: j */
    private boolean f152880j;

    /* renamed from: k */
    private boolean f152881k;

    /* renamed from: l */
    private boolean f152882l;

    /* renamed from: m */
    private String f152883m;

    /* renamed from: n */
    private C61066r f152884n;

    /* renamed from: o */
    private String f152885o;

    /* renamed from: p */
    private final Handler f152886p = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public boolean mo210521a(String str) {
        return true;
    }

    /* renamed from: b */
    public abstract String mo197061b();

    /* renamed from: c */
    public abstract String mo197062c();

    /* renamed from: d */
    public C61065q mo197063d() {
        return null;
    }

    /* renamed from: e */
    public abstract boolean mo197064e();

    /* renamed from: f */
    public abstract AbstractC61026e mo197065f();

    /* renamed from: g */
    public abstract AbstractC61014c mo197066g();

    /* renamed from: h */
    public AbstractC61024c mo210547h() {
        return null;
    }

    /* renamed from: j */
    public final boolean mo210552j() {
        return this.f152878h;
    }

    /* renamed from: a */
    public final void mo210496a(Context context) {
        if (f152871a == null) {
            m237273a("ByteRtcService", "[initInMainProcess]");
            f152871a = context;
            this.f152872b.initInMainProcess(context);
        }
    }

    /* renamed from: a */
    public final void mo210495a(int i, boolean z, boolean z2, String str, String str2, boolean z3, String str3) {
        mo210494a(i, z, z2, str, str2, z3, null, null, str3);
    }

    /* renamed from: a */
    public final void mo210493a(int i, boolean z, boolean z2, String str, String str2, boolean z3, C61066r rVar, Runnable runnable) {
        mo210494a(i, z, z2, str, str2, z3, rVar, runnable, "{}");
    }

    /* renamed from: a */
    public final void mo210494a(int i, boolean z, boolean z2, String str, String str2, boolean z3, C61066r rVar, Runnable runnable, String str3) {
        if (!this.f152872b.isByteRtcSdkInited(mo197061b(), i) || !C61066r.m237489a(this.f152884n, rVar)) {
            if ("sharebox".equals(str2)) {
                C61064p.m237485a("ByteRtcService", "sharebox skip reset()");
            } else {
                mo210558p();
            }
            this.f152879i = i;
            this.f152882l = z;
            this.f152883m = str2;
            this.f152881k = z2;
            this.f152880j = z3;
            this.f152884n = rVar;
            this.f152885o = str3;
            this.f152872b.setLogCallback(mo197065f());
            AbstractC61026e f = mo197065f();
            this.f152873c = f;
            C61064p.m237484a(f);
            AbstractC61014c g = mo197066g();
            this.f152874d = g;
            if (g != null) {
                this.f152872b.registerListener(g);
            }
            this.f152872b.disableEncryption();
            if (runnable != null) {
                runnable.run();
            }
            if (i == 0) {
                m237273a("ByteRtcService", "[initByteRtcSdk] venderType = RTC, isOversea = " + z2);
            } else if (i == 1) {
                m237273a("ByteRtcService", "[initByteRtcSdk] venderType = LARKRTC, isOversea = " + z2);
            } else if (i == 2) {
                m237273a("ByteRtcService", "[initByteRtcSdk] venderType = LARKPRERTC, isOversea = " + z2);
            } else if (i == 240) {
                m237273a("ByteRtcService", "[initByteRtcSdk] venderType = TEST_PRE, isOversea = " + z2);
            } else if (i == 241) {
                m237273a("ByteRtcService", "[initByteRtcSdk] venderType = TEST_GAUSS, isOversea = " + z2);
            } else if (i == 255) {
                m237273a("ByteRtcService", "[initByteRtcSdk] venderType = TEST, isOversea = " + z2);
            }
            this.f152872b.initByteRtcSdk(mo197061b(), mo197062c(), this.f152879i, z, z2, mo197064e(), false, str, mo197063d(), str2, z3, str3);
            this.f152872b.setResourceFinder(mo210547h());
        }
    }

    /* renamed from: a */
    public void mo210517a(boolean z) {
        if (this.f152872b != null) {
            m237273a("ByteRtcService", "[enableLocalVideo] " + z);
            this.f152872b.enableLocalVideo(z);
        }
    }

    /* renamed from: a */
    public void mo210506a(AbstractC61013b bVar) {
        mo210517a(true);
        if (!this.f152878h) {
            m237273a("ByteRtcService", "[startPreview]");
            this.f152878h = true;
            m237272a().startPreview();
        }
    }

    /* renamed from: a */
    public final void mo210510a(AbstractC61058j jVar) {
        m237273a("ByteRtcService", "[addRtcListener] listener = " + jVar.hashCode());
        this.f152872b.registerListener(jVar);
    }

    /* renamed from: a */
    public final void mo210515a(String str, String str2, String str3, String str4, String str5) {
        m237273a("ByteRtcService", "[joinChannel] channel = " + str2 + ", uid = " + str3 + ", interactive_id = " + str5 + ", token = " + str);
        m237272a().joinChannel(str2, str3, str, str4, str5);
    }

    /* renamed from: a */
    public final void mo210512a(String str, int i, boolean z, boolean z2) {
        m237273a("ByteRtcService", "[subscribeStream] streamId = " + str + ", resolutionIndex = " + i + ", isMicrophoneMute = " + z + ", isCameraMute = " + z2);
        if (mo210551i()) {
            this.f152872b.subscribeStream(str, i, z, z2);
        }
    }

    /* renamed from: a */
    public final void mo210504a(View view, String str) {
        if (view == null) {
            C61064p.m237487c("ByteRtcService", "[setupLocalVideo]View is null");
        } else {
            m237272a().setupLocalView(view, str);
        }
    }

    /* renamed from: a */
    public void mo210499a(View view) {
        AbstractC61061m mVar;
        m237273a("ByteRtcService", String.format("unbindRenderView, mRtcSdk = %s, view = %s", this.f152872b, view));
        if ((!mo210521a("unbindRenderView") || mo210551i()) && (mVar = this.f152872b) != null) {
            mVar.unbindRenderView(view);
        }
    }

    /* renamed from: a */
    public final void mo210508a(AbstractC61025d dVar, String str) {
        if (mo210551i()) {
            this.f152872b.setupRemoteFrameCapturer(dVar, str);
        }
    }

    /* renamed from: a */
    public final void mo210501a(View view, AbstractC61030i iVar) {
        AbstractC61061m mVar;
        if ((!mo210521a("setRenderListener") || mo210551i()) && (mVar = this.f152872b) != null) {
            mVar.setRenderListener(view, iVar);
        }
    }

    /* renamed from: a */
    public final void mo210502a(View view, AbstractC61060l lVar) {
        if (mo210551i()) {
            this.f152872b.setBaseFrameListener(view, lVar);
        }
    }

    /* renamed from: a */
    public final void mo210503a(View view, C61071u uVar) {
        if (mo210551i()) {
            m237272a().renderFrame(view, uVar);
        }
    }

    /* renamed from: a */
    public final void mo210514a(String str, String str2, String str3, int i, int[] iArr, String[] strArr, int i2, String str4) {
        this.f152872b.applyEffect(str, str2, str3, i, iArr, strArr, i2, str4);
    }

    /* renamed from: a */
    public final void mo210498a(Intent intent, int i, int i2, int i3, int i4) {
        this.f152872b.startScreenCapturer(intent, i, i2, i3, i4);
    }

    /* renamed from: a */
    public final void mo210507a(AbstractC61023b bVar) {
        this.f152872b.setCaptureStatusCallback(bVar);
    }

    /* renamed from: a */
    public final void mo210519a(byte[] bArr, byte[] bArr2) {
        m237273a("ByteRtcService", "[setEncryptKey]");
        this.f152872b.setEncryptKey(bArr, bArr2);
    }

    /* renamed from: a */
    public final void mo210511a(AbstractC61063o oVar) {
        this.f152872b.setVoipCallback(oVar);
    }

    /* renamed from: a */
    public void mo210500a(View view, int i) {
        this.f152872b.setRenderMode(view, i);
    }

    /* renamed from: a */
    public void mo210505a(View view, boolean z) {
        this.f152872b.setAutoRenderMode(view, z);
    }

    /* renamed from: a */
    public void mo210516a(String str, boolean z) {
        this.f152872b.joinBreakDownRoom(str, z);
    }

    /* renamed from: a */
    public void mo210520a(SubChannelInfo[] subChannelInfoArr) {
        this.f152872b.setSubChannels(subChannelInfoArr);
    }

    /* renamed from: a */
    public void mo210518a(boolean z, boolean z2) {
        this.f152872b.forceSetCameraRotation(z, z2);
    }

    /* renamed from: a */
    public void mo210497a(Intent intent) {
        this.f152872b.startAudioCapture(intent);
    }

    /* renamed from: a */
    public void mo210513a(String str, RtcConstants.RemoteUserPriority remoteUserPriority) {
        m237273a("ByteRtcService", "[setRemoteUserPriority] " + str + " " + remoteUserPriority);
        this.f152872b.setRemoteUserPriority(str, remoteUserPriority);
    }

    /* renamed from: a */
    public void mo210509a(AbstractC61027f fVar) {
        m237273a("ByteRtcService", "[registerMetadataObserverEx]");
        this.f152872b.registerMetadataObserverEx(fVar);
    }

    /* renamed from: B */
    public void mo210482B() {
        this.f152872b.leaveBreakDownRoom();
    }

    /* renamed from: C */
    public void mo210483C() {
        this.f152872b.stopAudioCapture();
    }

    /* renamed from: D */
    public RtcDevicePerfInfo mo210484D() {
        return this.f152872b.getDevicePerformanceInfo();
    }

    /* renamed from: l */
    public final void mo210554l() {
        m237272a().switchCamera();
    }

    /* renamed from: s */
    public final String mo210561s() {
        return this.f152872b.getSdkVersion();
    }

    /* renamed from: t */
    public final String mo210562t() {
        return this.f152872b.getEffectSDKVersion();
    }

    /* renamed from: u */
    public final void mo210563u() {
        this.f152872b.setExternalVideoSource(false, true, true, true);
    }

    /* renamed from: v */
    public final void mo210564v() {
        this.f152872b.stopScreenCapturer();
    }

    /* renamed from: A */
    public final int mo210481A() {
        m237273a("ByteRtcService", "[crypto_kx_sessionkeybytes]");
        return this.f152872b.crypto_kx_sessionkeybytes();
    }

    /* renamed from: i */
    public final boolean mo210551i() {
        return this.f152872b.isByteRtcSdkInited(mo197061b(), this.f152879i);
    }

    /* renamed from: m */
    public final void mo210555m() {
        m237273a("ByteRtcService", "[leaveChannel]");
        this.f152872b.leaveChannel();
    }

    /* renamed from: n */
    public final void mo210556n() {
        m237273a("ByteRtcService", "[openAudioRoute]");
        this.f152872b.openAudioRoute();
    }

    /* renamed from: o */
    public final void mo210557o() {
        m237273a("ByteRtcService", "[closeAudioRoute]");
        this.f152872b.closeAudioRoute();
    }

    /* renamed from: q */
    public final boolean mo210559q() {
        return m237272a().isMuteLocalAudio();
    }

    /* renamed from: r */
    public final boolean mo210560r() {
        return m237272a().isMuteLocalVideo();
    }

    /* renamed from: w */
    public final void mo210565w() {
        m237273a("ByteRtcService", "[disableEncryption]");
        this.f152872b.disableEncryption();
    }

    /* renamed from: x */
    public final void mo210566x() {
        m237273a("ByteRtcService", "[enableEncryption]");
        this.f152872b.enableEncryption();
    }

    /* renamed from: y */
    public final void mo210567y() {
        m237273a("ByteRtcService", "[sodium]");
        this.f152872b.sodium();
    }

    /* renamed from: z */
    public final Object mo210568z() {
        m237273a("ByteRtcService", "[newKeyPair]");
        return this.f152872b.newKeyPair();
    }

    /* renamed from: a */
    private AbstractC61061m m237272a() {
        mo210494a(this.f152879i, this.f152882l, this.f152881k, "", this.f152883m, this.f152880j, this.f152884n, null, this.f152885o);
        return this.f152872b;
    }

    /* renamed from: k */
    public void mo210553k() {
        mo210517a(false);
        if (this.f152878h) {
            m237273a("ByteRtcService", "[stopPreview]");
            this.f152872b.stopPreview();
            this.f152878h = false;
        }
    }

    protected AbstractC61012a() {
    }

    /* renamed from: p */
    public final void mo210558p() {
        m237273a("ByteRtcService", "[reset]");
        mo210564v();
        m237273a("ByteRtcService", "[reset] stopCapturer");
        this.f152872b.reset();
        m237273a("ByteRtcService", "[reset] done");
        this.f152875e = false;
        this.f152882l = false;
        this.f152878h = false;
        this.f152879i = 1;
        AbstractC61014c cVar = this.f152874d;
        if (cVar != null) {
            this.f152872b.unregisterListener(cVar);
        }
        this.f152873c = null;
        this.f152884n = null;
    }

    /* renamed from: c */
    public final View mo210531c(boolean z) {
        return this.f152872b.createRenderView(z);
    }

    /* renamed from: d */
    public void mo210535d(int i) {
        this.f152872b.setDeviceOrientation(i);
    }

    /* renamed from: e */
    public int mo210538e(int i) {
        return this.f152872b.setClientRole(i);
    }

    /* renamed from: f */
    public int mo210541f(int i) {
        return this.f152872b.setLocalVideoMirrorMode(i);
    }

    /* renamed from: g */
    public void mo210544g(int i) {
        this.f152872b.setLocalRotation(i);
    }

    /* renamed from: h */
    public void mo210548h(String str) {
        this.f152872b.setRtcFGConfig(str);
    }

    /* renamed from: i */
    public void mo210550i(String str) {
        this.f152872b.setRtcDomainConfig(str);
    }

    /* renamed from: a */
    public final int mo210485a(int i) {
        return m237272a().unloadEffect(i);
    }

    /* renamed from: c */
    public void mo210532c(int i) {
        this.f152872b.setCaptureDevice(i);
    }

    /* renamed from: d */
    public void mo210536d(String str) {
        this.f152872b.setSpeakerName(str);
    }

    /* renamed from: e */
    public void mo210539e(String str) {
        this.f152872b.setRtcDirPath(str);
    }

    /* renamed from: f */
    public void mo210542f(String str) {
        this.f152872b.setBackgroundImage(str);
    }

    /* renamed from: g */
    public void mo210545g(String str) {
        this.f152872b.setPublishChannel(str);
    }

    /* renamed from: h */
    public void mo210549h(boolean z) {
        this.f152872b.enableBackgroundBlur(z);
    }

    /* renamed from: b */
    public final void mo210524b(int i) {
        this.f152877g = i;
    }

    /* renamed from: d */
    public final void mo210537d(boolean z) {
        m237272a().muteAudio(z);
    }

    /* renamed from: e */
    public final void mo210540e(boolean z) {
        m237272a().muteCamera(z);
    }

    /* renamed from: f */
    public final void mo210543f(boolean z) {
        this.f152872b.enableSpeaker(z);
    }

    /* renamed from: g */
    public void mo210546g(boolean z) {
        this.f152872b.setPlaybackDigitalMute(z);
    }

    /* renamed from: c */
    public void mo210534c(String str) {
        this.f152872b.setMicrophoneName(str);
    }

    /* renamed from: b */
    public final void mo210527b(AbstractC61058j jVar) {
        m237273a("ByteRtcService", "[removeRtcListener] listener = " + jVar.hashCode());
        this.f152872b.unregisterListener(jVar);
    }

    /* renamed from: b */
    public final void mo210528b(String str) {
        this.f152872b.cancelEffect(str);
    }

    /* renamed from: b */
    public void mo210529b(boolean z) {
        if (this.f152872b != null) {
            m237273a("ByteRtcService", "[enableLocalAudio] " + z);
            this.f152872b.enableLocalAudio(z);
        }
    }

    /* renamed from: a */
    public final void mo210489a(int i, int i2) {
        m237272a().enableAudioVolumeIndication(i, i2);
    }

    /* renamed from: b */
    public int mo210522b(int i, int i2) {
        return this.f152872b.enableLocalAudioVolumeIndication(i, i2);
    }

    /* renamed from: c */
    public final void mo210533c(View view, String str) {
        if (view == null) {
            C61064p.m237487c("ByteRtcService", "[setupRemoteScreen]View is null");
        } else if (mo210551i()) {
            this.f152872b.setupRemoteScreen(view, str);
        }
    }

    /* renamed from: a */
    private void m237273a(String str, String str2) {
        if (this.f152873c == null) {
            this.f152873c = mo197065f();
        }
        AbstractC61026e eVar = this.f152873c;
        if (eVar != null) {
            eVar.logI(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo210525b(View view, String str) {
        if (view == null) {
            C61064p.m237487c("ByteRtcService", "[setupRemoteVideo]View is null");
        } else if (mo210551i()) {
            m237272a().setupRemoteView(view, str);
        }
    }

    /* renamed from: a */
    public final int mo210486a(int i, String str) {
        int preloadEffect = m237272a().preloadEffect(i, str);
        m237273a("ByteRtcService", "[preloadEffect] result = " + preloadEffect);
        return preloadEffect;
    }

    /* renamed from: b */
    public final void mo210526b(AbstractC61025d dVar, String str) {
        if (mo210551i()) {
            this.f152872b.setupLocalFrameCapturer(dVar, str);
        }
    }

    /* renamed from: b */
    public void mo210530b(boolean z, boolean z2) {
        this.f152872b.forceFlipVideo(z, z2);
    }

    /* renamed from: a */
    public final void mo210490a(int i, int i2, int i3) {
        this.f152872b.changeCapturerFormat(i, i2, i3);
    }

    /* renamed from: b */
    public final int mo210523b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return this.f152872b.crypto_kx_server_session_keys(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    /* renamed from: a */
    public final int mo210487a(int i, String str, boolean z, int i2, int i3) {
        return m237272a().playEffect(i, str, z, i2, i3);
    }

    /* renamed from: a */
    public final int mo210488a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return this.f152872b.crypto_kx_client_session_keys(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    /* renamed from: a */
    public void mo210491a(int i, String str, int i2, String str2, String str3) {
        this.f152872b.setProxyInfo(i, str, i2, str2, str3);
    }

    /* renamed from: a */
    public final void mo210492a(int i, boolean z, boolean z2, String str, String str2) {
        mo210495a(i, z, z2, str, str2, false, "{}");
    }
}
