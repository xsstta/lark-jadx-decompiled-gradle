package com.ss.android.vc.meeting.framework.meeting;

import android.os.SystemClock;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ActiveUserConfig;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.RTCProxy;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.impl.AbstractC61013b;
import com.ss.android.vc.irtc.AbstractC61025d;
import com.ss.android.vc.irtc.AbstractC61030i;
import com.ss.android.vc.irtc.C61071u;
import com.ss.android.vc.irtc.RtcConstants;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.module.busyring.C61543c;
import com.ss.android.vc.meeting.module.p3130k.p3131a.C62003a;
import com.ss.android.vc.meeting.module.volumeIndicator.AudioVolumeBean;
import com.ss.android.vc.meeting.p3104c.C61246b;
import com.ss.android.vc.meeting.utils.ActiveSpeakerCalculator;
import com.ss.android.vc.meeting.utils.C63492g;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.p3091e.C60917a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicReference;

public class ByteRtc {

    /* renamed from: b */
    private static long f153525b;

    /* renamed from: h */
    private static volatile int f153526h;

    /* renamed from: a */
    public boolean f153527a = false;

    /* renamed from: c */
    private final String f153528c;

    /* renamed from: d */
    private final C61322t f153529d;

    /* renamed from: e */
    private final AtomicReference<C61322t> f153530e = new AtomicReference<>(null);

    /* renamed from: f */
    private final C61290a f153531f = new C61290a();

    /* renamed from: g */
    private volatile int f153532g = 0;

    /* renamed from: i */
    private volatile int f153533i = 0;

    /* renamed from: j */
    private final C61303k f153534j;

    /* renamed from: k */
    private long f153535k;

    /* renamed from: l */
    private long f153536l;

    /* renamed from: m */
    private boolean f153537m = true;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BytRtcStatus {
    }

    /* renamed from: b */
    public void mo212012b(boolean z) {
    }

    /* renamed from: l */
    public boolean mo212029l() {
        return this.f153537m;
    }

    /* renamed from: a */
    public void mo212002a(String str, String str2, String str3, String str4) {
        String str5;
        boolean z;
        String str6;
        AudioVolumeBean b;
        String str7 = this.f153528c;
        m238474a(str7, "joinChannel " + str3);
        if (m238475m()) {
            ActiveUserConfig a = ActiveSpeakerCalculator.f160350d.mo219614a();
            C61237h.m238223a().mo210489a(a.getTickTime() * 1000, a.getSampleInterval());
            if (this.f153534j.ap().mo219554a() && (b = this.f153534j.ap().mo219555b()) != null) {
                C61237h.m238223a().mo210522b(b.getInterval(), b.getLevel());
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tenant_id", (Object) VideoChatModuleDependency.m236631d());
                VideoChat e = this.f153534j.mo212056e();
                Participant c = ParticipantUtil.m248731c(e.getParticipants());
                boolean z2 = false;
                if (c != null) {
                    z2 = c.is_host();
                    z = c.isCoHost();
                } else {
                    z = false;
                }
                if (e.getType() == VideoChat.Type.MEET) {
                    jSONObject.put("call_type", (Object) "meeting");
                    str6 = z2 ? "host" : z ? "cohost" : "attendee";
                } else {
                    jSONObject.put("call_type", (Object) "call");
                    str6 = z2 ? "caller" : "callee";
                }
                jSONObject.put("user_type", (Object) str6);
                str5 = jSONObject.toJSONString();
            } catch (Exception e2) {
                String str8 = this.f153528c;
                C60700b.m235864f(str8, "[joinChannel]", "Info json parse error: " + e2.toString());
                str5 = "";
            }
            C61237h.m238223a().mo210515a(str, str2, str3, str5, str4);
            C63492g.m248819a();
        }
    }

    /* renamed from: a */
    public void mo211999a(String str, int i, boolean z, boolean z2) {
        if (m238475m()) {
            C61237h.m238223a().mo210512a(str, i, z, z2);
        }
    }

    /* renamed from: a */
    public void mo212004a(boolean z, boolean z2) {
        if (m238475m()) {
            C61237h.m238223a().mo210530b(z, z2);
        }
    }

    /* renamed from: a */
    public void mo212000a(String str, RtcConstants.RemoteUserPriority remoteUserPriority) {
        if (m238475m()) {
            C61237h.m238223a().mo210513a(str, remoteUserPriority);
        }
    }

    /* renamed from: a */
    public void mo212003a(String str, boolean z) {
        if (m238475m()) {
            String str2 = this.f153528c;
            C60700b.m235851b(str2, "[joinBreakDownRoom]", "channelId=" + str + " subMain=" + z);
            C61237h.m238223a().mo210516a(str, z);
        }
    }

    /* renamed from: a */
    public void mo211998a(String str) {
        if (m238475m()) {
            C61237h.m238223a().mo210542f(str);
        }
    }

    /* renamed from: a */
    public void mo212001a(String str, String str2, String str3, int i, int[] iArr, String[] strArr, int i2, String str4) {
        if (m238475m()) {
            C61237h.m238223a().mo210514a(str, str2, str3, i, iArr, strArr, i2, str4);
        }
    }

    /* renamed from: com.ss.android.vc.meeting.framework.meeting.ByteRtc$a */
    public static class C61290a {

        /* renamed from: a */
        long f153539a;

        /* renamed from: b */
        long f153540b;

        /* renamed from: b */
        public long mo212033b() {
            mo212031a();
            long j = this.f153540b - this.f153539a;
            this.f153539a = 0;
            this.f153540b = 0;
            return j;
        }

        /* renamed from: a */
        public void mo212031a() {
            long j = this.f153540b;
            if (j == 0) {
                j = SystemClock.elapsedRealtime();
            }
            this.f153539a = j;
            this.f153540b = SystemClock.elapsedRealtime();
        }

        /* renamed from: a */
        public void mo212032a(String str, String str2) {
            long b = mo212033b();
            C60700b.m235851b(str, "[elasedLog]", str2 + " elapsed " + b);
        }
    }

    /* renamed from: i */
    public String mo212026i() {
        return C61237h.m238223a().mo210561s();
    }

    /* renamed from: j */
    public int mo212027j() {
        if (m238475m()) {
            return this.f153533i;
        }
        return 0;
    }

    /* renamed from: m */
    private boolean m238475m() {
        boolean z;
        synchronized (ByteRtc.class) {
            if (f153526h == this.f153532g) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: e */
    public void mo212019e() {
        if (m238475m()) {
            C61237h.m238223a().mo210554l();
        }
        this.f153537m = !this.f153537m;
        C62003a.m242249a();
    }

    /* renamed from: f */
    public void mo212021f() {
        if (m238475m()) {
            C63492g.m248823b();
            C61237h.m238223a().mo210555m();
            VideoChatModuleDependency.onRtcStats(this.f153535k, this.f153536l);
        }
    }

    /* renamed from: k */
    public void mo212028k() {
        if (m238475m()) {
            C60700b.m235851b(this.f153528c, "[leaveBreakDownRoom]", "eaveBreakDownRoo");
            C61237h.m238223a().mo210482B();
        }
    }

    public String toString() {
        return f153525b + "@" + hashCode();
    }

    /* renamed from: n */
    private RTCProxy m238476n() {
        if (this.f153534j.mo212056e() == null || this.f153534j.mo212056e().getVideoChatSettings() == null) {
            return null;
        }
        return this.f153534j.mo212056e().getVideoChatSettings().getRTCProxy();
    }

    /* renamed from: d */
    public void mo212017d() {
        this.f153531f.mo212031a();
        if (m238475m()) {
            C61237h.m238223a().mo210517a(false);
            if (this.f153527a) {
                this.f153527a = false;
                C61237h.m238223a().mo210553k();
            }
        }
        this.f153531f.mo212032a(this.f153528c, "stopPreview");
    }

    /* renamed from: g */
    public boolean mo212024g() {
        boolean z;
        if (m238475m()) {
            z = C61237h.m238223a().mo210559q();
        } else {
            z = false;
        }
        String str = this.f153528c;
        m238474a(str, "isMuteLocalAudio " + z + ", isInited " + z);
        return z;
    }

    /* renamed from: h */
    public boolean mo212025h() {
        boolean z;
        if (m238475m()) {
            z = C61237h.m238223a().mo210560r();
        } else {
            z = false;
        }
        String str = this.f153528c;
        m238474a(str, "isMuteLocalVideo " + z + ", isInited " + z);
        return z;
    }

    /* renamed from: b */
    public void mo212007b() {
        boolean z;
        m238474a(this.f153528c, "reset");
        this.f153531f.mo212031a();
        if (!C61543c.m240213a(this.f153534j)) {
            synchronized (ByteRtc.class) {
                z = false;
                if (this.f153532g == f153526h) {
                    this.f153532g = 0;
                    this.f153527a = false;
                    this.f153533i = 0;
                    z = true;
                }
            }
            if (z) {
                mo212017d();
                C61237h.m238223a().mo211781F();
            }
        }
        if (this.f153530e.compareAndSet(this.f153529d, null)) {
            C61237h.m238223a().mo210527b(this.f153529d);
        }
        this.f153529d.mo212253d();
        this.f153531f.mo212032a(this.f153528c, "reset");
    }

    /* renamed from: c */
    public void mo212014c() {
        this.f153531f.mo212031a();
        if (m238475m()) {
            C61237h.m238223a().mo210517a(true);
            if (!this.f153527a) {
                this.f153527a = true;
                if (C60917a.m236770b()) {
                    C60917a.m236771c();
                }
                C61237h.m238223a().mo210506a(new AbstractC61013b() {
                    /* class com.ss.android.vc.meeting.framework.meeting.ByteRtc.C612891 */
                });
            }
        }
        this.f153531f.mo212032a(this.f153528c, "startPreview");
    }

    /* renamed from: a */
    public void mo211989a() {
        boolean z;
        boolean z2;
        String str = this.f153528c;
        m238474a(str, "init " + mo212026i());
        this.f153531f.mo212031a();
        synchronized (ByteRtc.class) {
            z = true;
            if (this.f153532g == 0) {
                int i = f153526h + 1;
                f153526h = i;
                this.f153532g = i;
                this.f153533i = 0;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            if (this.f153534j.mo212056e() == null || this.f153534j.mo212056e().getVideoChatSettings() == null || this.f153534j.mo212056e().getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE || !this.f153534j.mo212056e().getVideoChatSettings().isBoxSharing()) {
                z = false;
            }
            String str2 = this.f153528c;
            C60700b.m235851b(str2, "[init]", "start, meeting = " + this.f153534j.mo212055d() + ", vendorType = " + this.f153534j.mo212056e().getVendorType() + ", isShareBox = " + z);
            C61237h.m238223a().mo211789a(this.f153534j.mo212056e().getVendorType(), z, m238476n());
            String str3 = this.f153528c;
            StringBuilder sb = new StringBuilder();
            sb.append("success, meeting = ");
            sb.append(this.f153534j.mo212055d());
            C60700b.m235851b(str3, "[init2]", sb.toString());
        }
        if (this.f153530e.compareAndSet(null, this.f153529d)) {
            C61237h.m238223a().mo210510a(this.f153529d);
        }
        this.f153531f.mo212032a(this.f153528c, "init");
    }

    /* renamed from: a */
    public void mo211990a(int i) {
        this.f153533i = i;
    }

    /* renamed from: a */
    public View mo211988a(boolean z) {
        return C61237h.m238223a().mo210531c(z);
    }

    /* renamed from: e */
    public void mo212020e(boolean z) {
        if (m238475m()) {
            C61237h.m238223a().mo210517a(z);
        }
    }

    /* renamed from: g */
    public void mo212023g(boolean z) {
        if (m238475m()) {
            C61237h.m238223a().mo210549h(z);
        }
    }

    /* renamed from: b */
    public int mo212005b(int i) {
        if (m238475m()) {
            return C61237h.m238223a().mo210541f(i);
        }
        return 0;
    }

    public ByteRtc(C61303k kVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("ByteRtc@");
        long j = f153525b + 1;
        f153525b = j;
        sb.append(j);
        this.f153528c = sb.toString();
        this.f153534j = kVar;
        this.f153529d = new C61322t(this, kVar);
    }

    /* renamed from: a */
    public void mo211992a(View view) {
        C61237h.m238223a().mo210499a(view);
    }

    /* renamed from: b */
    public C61246b mo212006b(View view) {
        if (m238475m()) {
            return C61237h.m238223a().mo211787a(view, this.f153534j);
        }
        return null;
    }

    /* renamed from: c */
    public int mo212013c(int i) {
        String str = this.f153528c;
        m238474a(str, "setClientRole " + i);
        if (m238475m()) {
            return C61237h.m238223a().mo210538e(i);
        }
        return -1;
    }

    /* renamed from: f */
    public void mo212022f(boolean z) {
        if (m238475m()) {
            String str = this.f153528c;
            C60700b.m235851b(str, "[setPlaybackDigitalMute]", "mute = " + z);
            C61237h.m238223a().mo210546g(z);
        }
    }

    /* renamed from: d */
    public void mo212018d(boolean z) {
        String str = this.f153528c;
        m238474a(str, "muteLocalVideoStream mute " + z);
        if (m238475m()) {
            C61237h.m238223a().mo210540e(z);
        }
    }

    /* renamed from: c */
    public void mo212016c(boolean z) {
        String str = this.f153528c;
        m238474a(str, "muteLocalAudioStream " + z);
        if (m238475m()) {
            C61237h.m238223a().mo210537d(z);
        }
    }

    /* renamed from: b */
    public synchronized void mo212010b(AbstractC61296d dVar) {
        C61322t tVar = this.f153529d;
        if (tVar != null) {
            tVar.mo212252b(dVar);
        }
    }

    /* renamed from: b */
    public void mo212011b(String str) {
        if (m238475m()) {
            C61237h.m238223a().mo210528b(str);
        }
    }

    /* renamed from: a */
    public synchronized void mo211997a(AbstractC61296d dVar) {
        C61322t tVar = this.f153529d;
        if (tVar != null) {
            tVar.mo212251a(dVar);
        }
    }

    /* renamed from: a */
    private void m238474a(String str, String str2) {
        C60700b.m235851b(str, "[byteLog]", str2);
    }

    /* renamed from: b */
    public void mo212009b(AbstractC61025d dVar, String str) {
        if (m238475m()) {
            C61237h.m238223a().mo210526b(dVar, str);
        }
    }

    /* renamed from: c */
    public void mo212015c(View view, String str) {
        if (m238475m()) {
            C61237h.m238223a().mo210533c(view, str);
        }
    }

    /* renamed from: a */
    public void mo211991a(long j, long j2) {
        this.f153535k = j;
        this.f153536l = j2;
    }

    /* renamed from: a */
    public void mo211993a(View view, AbstractC61030i iVar) {
        if (m238475m()) {
            C61237h.m238223a().mo210501a(view, iVar);
        }
    }

    /* renamed from: b */
    public void mo212008b(View view, String str) {
        boolean z;
        String str2 = this.f153528c;
        StringBuilder sb = new StringBuilder();
        sb.append("setupRemoteVideo uid: ");
        sb.append(str);
        sb.append(",  view is null: ");
        if (view == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        m238474a(str2, sb.toString());
        if (m238475m()) {
            C61237h.m238223a().mo210525b(view, str);
        }
    }

    /* renamed from: a */
    public void mo211994a(View view, C61071u uVar) {
        if (m238475m()) {
            C61237h.m238223a().mo210503a(view, uVar);
        }
    }

    /* renamed from: a */
    public void mo211995a(View view, String str) {
        String str2 = this.f153528c;
        m238474a(str2, "setupLocalVideo uid " + str);
        if (m238475m()) {
            C61237h.m238223a().mo210504a(view, str);
            C62003a.m242249a();
        }
    }

    /* renamed from: a */
    public void mo211996a(AbstractC61025d dVar, String str) {
        if (m238475m()) {
            C61237h.m238223a().mo210508a(dVar, str);
        }
    }
}
