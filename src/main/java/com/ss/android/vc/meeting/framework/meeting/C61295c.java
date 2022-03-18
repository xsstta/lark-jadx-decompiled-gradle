package com.ss.android.vc.meeting.framework.meeting;

import com.ss.android.vc.irtc.RtcAudioVolumeInfo;
import com.ss.android.vc.irtc.RtcNetworkQualityInfo;
import com.ss.android.vc.irtc.RtcSystemUsageInfo;
import com.ss.android.vc.irtc.VcByteStream;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.c */
public class C61295c implements AbstractC61296d {

    /* renamed from: a */
    protected List<AbstractC61296d> f153561a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private String f153562b = "ByteRtcListenerWrap@";

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: a */
    public void mo211754a(String str, String str2) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211754a(str, str2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: a */
    public void mo211752a(String str, int i, int i2) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211752a(str, i, i2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: a */
    public void mo211753a(String str, RtcNetworkQualityInfo rtcNetworkQualityInfo) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211753a(str, rtcNetworkQualityInfo);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: a */
    public void mo211756a(RtcAudioVolumeInfo[] rtcAudioVolumeInfoArr, int i) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211756a(rtcAudioVolumeInfoArr, i);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: a */
    public void mo211755a(String str, boolean z) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211755a(str, z);
        }
    }

    /* renamed from: d */
    public void mo212074d() {
        this.f153561a.clear();
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: a */
    public void mo211743a() {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211743a();
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: b */
    public void mo211757b() {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211757b();
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: c */
    public void mo211767c() {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211767c();
        }
    }

    /* renamed from: b */
    public void mo212073b(AbstractC61296d dVar) {
        this.f153561a.remove(dVar);
    }

    /* renamed from: a */
    public void mo212072a(AbstractC61296d dVar) {
        if (!this.f153561a.contains(dVar)) {
            this.f153561a.add(dVar);
        }
    }

    public C61295c(String str) {
        this.f153562b = str;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    public void i_(String str) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.i_(str);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: b */
    public void mo211758b(int i) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211758b(i);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: a */
    public void mo211745a(int i) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211745a(i);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: c */
    public void mo211769c(String str) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211769c(str);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: b */
    public void mo211762b(String str) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211762b(str);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: a */
    public void mo211748a(RtcAudioVolumeInfo rtcAudioVolumeInfo) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211748a(rtcAudioVolumeInfo);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    public void b_(String str, String str2) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.b_(str, str2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: e */
    public void mo211771e(String str, String str2) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211771e(str, str2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: a */
    public void mo211744a(double d, double d2) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211744a(d, d2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: c */
    public void mo211768c(int i, int i2) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211768c(i, i2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: b */
    public void mo211759b(int i, int i2) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211759b(i, i2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: a */
    public void mo211746a(int i, int i2) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211746a(i, i2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: c */
    public void mo211770c(String str, String str2) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211770c(str, str2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: a */
    public void mo211749a(RtcSystemUsageInfo rtcSystemUsageInfo, String str) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211749a(rtcSystemUsageInfo, str);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: b */
    public void mo211764b(String str, String str2) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211764b(str, str2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: a */
    public void mo211750a(VcByteStream vcByteStream, String str) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211750a(vcByteStream, str);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: b */
    public void mo211765b(String str, boolean z) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211765b(str, z);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: b */
    public void mo211760b(int i, String str, int i2) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211760b(i, str, i2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: a */
    public void mo211747a(int i, String str, int i2) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211747a(i, str, i2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61296d
    /* renamed from: b */
    public void mo211763b(String str, int i, int i2) {
        for (AbstractC61296d dVar : this.f153561a) {
            dVar.mo211763b(str, i, i2);
        }
    }
}
