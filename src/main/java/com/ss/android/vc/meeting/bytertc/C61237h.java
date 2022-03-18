package com.ss.android.vc.meeting.bytertc;

import android.content.Context;
import android.text.TextUtils;
import android.view.OrientationEventListener;
import android.view.View;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60741ae;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.RTCProxy;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.impl.AbstractC61012a;
import com.ss.android.vc.impl.AbstractC61013b;
import com.ss.android.vc.impl.AbstractC61014c;
import com.ss.android.vc.irtc.AbstractC61024c;
import com.ss.android.vc.irtc.AbstractC61026e;
import com.ss.android.vc.irtc.C61065q;
import com.ss.android.vc.irtc.C61066r;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.admin.VideoChatAdminSettings;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c;
import com.ss.android.vc.meeting.p3104c.C61246b;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.RtcRenderOptimizeService;
import com.ss.android.vc.net.service.VCSettingsService;
import com.ss.android.vc.p3091e.C60917a;
import com.ss.android.vc.p3091e.C60920b;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.p3180a.C63694f;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.meeting.bytertc.h */
public class C61237h extends AbstractC61012a {

    /* renamed from: a */
    public static volatile int f153400a;

    /* renamed from: c */
    public static volatile int f153401c;

    /* renamed from: b */
    public Runnable f153402b = new Runnable() {
        /* class com.ss.android.vc.meeting.bytertc.C61237h.RunnableC612381 */

        public void run() {
            if (C60917a.m236769a()) {
                C61237h.f153400a = 0;
                C60920b.m236773b("VcRtcService", "[stopPreviewRunnable]");
                C61237h.this.mo210553k();
            } else if (C61237h.f153400a < 3) {
                C61237h.f153400a++;
                C60920b.m236773b("VcRtcService", "[stopPreviewRunnable] delayed 100ms");
                C60741ae.m236054a(C61237h.this.f153402b, 100);
            }
        }
    };

    /* renamed from: d */
    public Runnable f153403d = new Runnable() {
        /* class com.ss.android.vc.meeting.bytertc.C61237h.RunnableC612392 */

        public void run() {
            if (!C60917a.m236769a()) {
                C61237h.f153401c = 0;
                C60920b.m236773b("VcRtcService", "[startPreviewRunnable]");
                C61237h.this.mo210506a((AbstractC61013b) null);
            } else if (C61237h.f153401c < 3) {
                C61237h.f153401c++;
                C60920b.m236773b("VcRtcService", "[startPreviewRunnable] delayed 100ms");
                C60741ae.m236054a(C61237h.this.f153403d, 100);
            }
        }
    };

    /* renamed from: e */
    private boolean f153404e;

    /* renamed from: f */
    private final CheckRtcEngineConfig f153405f = new CheckRtcEngineConfig();

    /* renamed from: g */
    private AtomicBoolean f153406g = new AtomicBoolean(false);

    /* renamed from: h */
    private C60917a.AbstractC60919a f153407h = new C60917a.AbstractC60919a() {
        /* class com.ss.android.vc.meeting.bytertc.C61237h.C612403 */
    };

    /* renamed from: i */
    private OrientationEventListener f153408i;

    /* renamed from: j */
    private int f153409j = -1;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.bytertc.h$a */
    public static class C61244a {

        /* renamed from: a */
        public static final C61237h f153417a = new C61237h();
    }

    /* renamed from: K */
    public void mo211786K() {
        this.f153404e = true;
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: b */
    public String mo197061b() {
        return "5b978bab09b27c0034d252c0";
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: e */
    public boolean mo197064e() {
        return true;
    }

    /* renamed from: a */
    public static C61237h m238223a() {
        return C61244a.f153417a;
    }

    /* renamed from: J */
    public boolean mo211785J() {
        return this.f153404e;
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: f */
    public AbstractC61026e mo197065f() {
        return VcLogListener.f153391a;
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: g */
    public AbstractC61014c mo197066g() {
        return VcRtcLogMessageListener.f153396a;
    }

    /* renamed from: L */
    private String m238220L() {
        return VcBizSender.m249300l();
    }

    /* renamed from: G */
    public void mo211782G() {
        mo210496a(ar.m236694a());
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: c */
    public String mo197062c() {
        return VideoChatModuleDependency.m236629b();
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: h */
    public AbstractC61024c mo210547h() {
        return C62228c.m243015b();
    }

    /* renamed from: H */
    public String mo211783H() {
        String settings = VCSettingsService.getSettings("rtc_config_android");
        if (TextUtils.isEmpty(settings)) {
            return "{\"useArrayPool\":true}";
        }
        return settings;
    }

    /* renamed from: I */
    public void mo211784I() {
        C60735ab.m236018e(new Runnable() {
            /* class com.ss.android.vc.meeting.bytertc.C61237h.RunnableC612436 */

            public void run() {
                if (!MeetingAudioManager.m239471k().mo212721z()) {
                    MeetingAudioManager.AudioType y = MeetingAudioManager.m239471k().mo212720y();
                    C60700b.m235851b("VcRtcService", "[reportMicrophoneName]", "type = " + y);
                    if (y == MeetingAudioManager.AudioType.Default) {
                        C61237h.m238223a().mo210534c("MicrophoneBuiltIn");
                        C61237h.m238223a().mo210536d("SpeakerBuiltIn");
                    } else if (y == MeetingAudioManager.AudioType.Bluetooth) {
                        String x = MeetingAudioManager.m239471k().mo212719x();
                        if (!TextUtils.isEmpty(x)) {
                            C61237h.m238223a().mo210534c(x);
                            C61237h.m238223a().mo210536d(x);
                            return;
                        }
                        C61237h.m238223a().mo210534c("MicrophoneBuiltIn");
                        C61237h.m238223a().mo210536d("SpeakerBuiltIn");
                    } else if (y == MeetingAudioManager.AudioType.HeadPhone) {
                        C61237h.m238223a().mo210534c("MicrophoneWired");
                        C61237h.m238223a().mo210536d("MicrophoneWired");
                    }
                } else {
                    C60700b.m235851b("VcRtcService", "[reportMicrophoneName2]", "OutSpeaker");
                    C61237h.m238223a().mo210536d("SpeakerBuiltIn");
                }
            }
        });
    }

    /* renamed from: E */
    public void mo211780E() {
        String L = m238220L();
        if (L != null) {
            C60700b.m235851b("VcRtcService", "[setRtcFGConfig]", L);
            mo210548h(L);
        }
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: d */
    public C61065q mo197063d() {
        C61065q qVar = new C61065q();
        qVar.f152923a = RtcRenderOptimizeService.getInstance().isRenderOptimizeDevice();
        qVar.f152924b = false;
        qVar.f152925c = 10;
        return qVar;
    }

    /* renamed from: F */
    public void mo211781F() {
        OrientationEventListener orientationEventListener;
        super.mo210558p();
        this.f153404e = false;
        if (this.f153406g.compareAndSet(true, false)) {
            VideoChatService.m249602d().mo220187i();
        }
        if (!C60917a.m236770b() && DesktopUtil.m144307b() && (orientationEventListener = this.f153408i) != null) {
            orientationEventListener.disable();
            this.f153408i = null;
        }
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: k */
    public void mo210553k() {
        if (!C60917a.m236770b() || C60917a.m236769a()) {
            super.mo210553k();
            return;
        }
        C60920b.m236773b("VcRtcService", "[stopPreview] delayed 100ms");
        C60741ae.m236055b(this.f153402b);
        C60741ae.m236055b(this.f153403d);
        C60741ae.m236054a(this.f153402b, 100);
    }

    /* renamed from: d */
    private String m238225d(Context context) {
        if (PackageChannelManager.isKABuildPackage(context)) {
            return PackageChannelManager.getBuildPackageChannel(context);
        }
        return "saas";
    }

    /* renamed from: c */
    private void m238224c(Context context) {
        if (!C60917a.m236770b() && DesktopUtil.m144307b()) {
            this.f153408i = new OrientationEventListener(context) {
                /* class com.ss.android.vc.meeting.bytertc.C61237h.C612425 */

                public void onOrientationChanged(int i) {
                    C61237h.this.mo211791h(i);
                }
            };
            try {
                OrientationEventListener.class.getMethod("enable", Integer.TYPE).invoke(this.f153408i, 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: a */
    public void mo210506a(AbstractC61013b bVar) {
        if (!C60917a.m236770b() || !C60917a.m236769a()) {
            super.mo210506a(bVar);
            return;
        }
        C60920b.m236773b("VcRtcService", "[startPreview] delayed 100ms");
        C60741ae.m236055b(this.f153402b);
        C60741ae.m236055b(this.f153403d);
        C60741ae.m236054a(this.f153403d, 100);
    }

    /* renamed from: h */
    public void mo211791h(int i) {
        int i2;
        if (i > 340 || i < 20) {
            i2 = 0;
        } else if (i > 250 && i < 290) {
            i2 = 270;
        } else if (i > 70 && i < 110) {
            i2 = 90;
        } else if (i <= 160 || i >= 200) {
            i2 = -1;
        } else {
            i2 = 180;
        }
        if (i2 != -1 && this.f153409j != i2) {
            this.f153409j = i2;
            m238223a().mo210535d(this.f153409j);
        }
    }

    /* renamed from: a */
    private C61066r m238222a(RTCProxy rTCProxy) {
        String str;
        if (rTCProxy == null || !rTCProxy.status || TextUtils.isEmpty(rTCProxy.proxy_ip)) {
            return null;
        }
        C60700b.m235851b("VcRtcService", "[transformRtcProxy]", "proxy_ip = " + rTCProxy.proxy_ip);
        String str2 = "";
        if (rTCProxy.user_name != null) {
            str = rTCProxy.user_name;
        } else {
            str = str2;
        }
        if (rTCProxy.passport != null) {
            str2 = rTCProxy.passport;
        }
        return new C61066r(rTCProxy.status, rTCProxy.proxy_type.getValue(), rTCProxy.proxy_ip, rTCProxy.proxy_port, str, str2);
    }

    /* renamed from: b */
    public void mo211790b(Context context) {
        try {
            List<String> b = VideoChatModuleDependency.getDynamicDomainDependency().mo196385b();
            List<String> c = VideoChatModuleDependency.getDynamicDomainDependency().mo196386c();
            List<String> d = VideoChatModuleDependency.getDynamicDomainDependency().mo196387d();
            if (b == null) {
                b = Collections.emptyList();
            }
            if (c == null) {
                c = Collections.emptyList();
            }
            if (d == null) {
                d = Collections.emptyList();
            }
            JSONObject jSONObject = new JSONObject();
            if (!b.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < b.size(); i++) {
                    jSONArray.put(i, b.get(i));
                }
                jSONObject.putOpt("rtc_frontier", jSONArray);
            }
            if (!c.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < c.size(); i2++) {
                    jSONArray2.put(i2, c.get(i2));
                }
                jSONObject.putOpt("rtc_decision", jSONArray2);
            }
            if (!d.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i3 = 0; i3 < d.size(); i3++) {
                    jSONArray3.put(i3, d.get(i3));
                }
                jSONObject.putOpt("rtc_defaultips", jSONArray3);
            }
            jSONObject.putOpt("kaChannel", m238225d(context));
            String jSONObject2 = jSONObject.toString();
            C60700b.m235851b("VcRtcService", "[setRtcHost]", "domain config json: " + jSONObject2);
            m238223a().mo210550i(jSONObject2);
        } catch (Exception e) {
            C60700b.m235864f("VcRtcService", "[setRtcHost2]", "rtcDomainConfig parse error " + e.getMessage());
        }
    }

    @Override // com.ss.android.vc.impl.AbstractC61012a
    /* renamed from: a */
    public boolean mo210521a(String str) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f153405f) {
                if (this.f153405f.getBlackList() == null) {
                    this.f153405f.updateConfig();
                }
                List<String> blackList = this.f153405f.getBlackList();
                if (blackList != null) {
                    z = !blackList.contains(str);
                } else {
                    z = true;
                }
            }
        } else {
            z = true;
        }
        C60700b.m235851b("VcRtcService", "checkRtcEngine", String.format("methodName = %s, result = %b", str, Boolean.valueOf(z)));
        return z;
    }

    /* renamed from: a */
    public void mo211788a(VideoChat.VendorType vendorType, boolean z) {
        mo211789a(vendorType, z, VideoChatAdminSettings.m239433l());
    }

    /* renamed from: a */
    public C61246b mo211787a(View view, C61303k kVar) {
        C61246b bVar = new C61246b(ar.m236694a(), kVar);
        bVar.mo211803a(view);
        return bVar;
    }

    /* renamed from: a */
    public void mo211789a(VideoChat.VendorType vendorType, boolean z, RTCProxy rTCProxy) {
        int i;
        if (vendorType == null || vendorType == VideoChat.VendorType.LARK_RTC) {
            i = 1;
        } else if (vendorType == VideoChat.VendorType.LARK_PRE_RTC) {
            i = 2;
        } else if (vendorType == VideoChat.VendorType.LARK_RTC_TEST_PRE) {
            i = 240;
        } else if (vendorType == VideoChat.VendorType.LARK_RTC_TEST_GAUSS) {
            i = 241;
        } else if (vendorType == VideoChat.VendorType.LARK_RTC_TEST) {
            i = 255;
        } else {
            i = 0;
        }
        if (this.f153406g.compareAndSet(false, true)) {
            VideoChatService.m249602d().mo220185h();
        }
        String d = LabsUtils.m242912d();
        mo210539e(d);
        C60700b.m235851b("VcRtcService", "[init]", "path = " + d);
        final C61066r a = m238222a(rTCProxy);
        long currentTimeMillis = System.currentTimeMillis();
        mo210493a(i, DesktopUtil.m144301a(ar.m236694a()), VideoChatModuleDependency.getAppEnvDependency().mo196333c(), mo211783H(), "vc", z, a, new Runnable() {
            /* class com.ss.android.vc.meeting.bytertc.C61237h.RunnableC612414 */

            public void run() {
                C60700b.m235851b("VcRtcService", "[init2]", "preset task run " + a);
                C61066r rVar = a;
                if (rVar != null) {
                    C61237h.this.mo210491a(rVar.f152929b, a.f152930c, (int) a.f152931d, a.f152932e, a.f152933f);
                }
                C61237h.this.mo211780E();
                C61237h.this.mo211790b(ar.m236694a());
            }
        });
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        m238223a().mo211784I();
        if (C60917a.m236770b()) {
            C60920b.m236772a("VcRtcService", "[init] initBoston");
            m238223a().mo210532c(1);
            C60917a.m236768a(this.f153407h);
            m238223a().mo210535d(270);
        } else {
            C60920b.m236772a("VcRtcService", "[init] normal");
            m238223a().mo210532c(0);
        }
        m238224c(ar.m236694a());
        C60735ab.m236019f($$Lambda$h$TcBe6jP3bdfEx77eP3sBLB0zAw.INSTANCE);
        LabsUtils.m242900a(false);
        mo210518a(true, true);
        C63694f.m249697a(currentTimeMillis2, mo210561s());
    }
}
