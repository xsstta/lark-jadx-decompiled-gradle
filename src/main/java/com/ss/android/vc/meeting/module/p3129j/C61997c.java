package com.ss.android.vc.meeting.module.p3129j;

import android.os.Looper;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.irtc.RtcNetworkQualityInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.p3129j.AbstractC61994a;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.statistics.event.C63742at;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vc.meeting.module.j.c */
public class C61997c extends AbstractC61994a {

    /* renamed from: a */
    private List<AbstractC61994a.AbstractC61995a> f155769a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private List<WeakReference<AbstractC61994a.AbstractC61995a>> f155770b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private String f155771c;

    /* renamed from: d */
    private String f155772d;

    /* renamed from: e */
    private AtomicBoolean f155773e = new AtomicBoolean(false);

    /* renamed from: f */
    private AtomicBoolean f155774f = new AtomicBoolean(false);

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a
    /* renamed from: a */
    public String mo214601a() {
        return this.f155771c;
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a
    /* renamed from: b */
    public boolean mo214607b() {
        return this.f155773e.get();
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a
    /* renamed from: a */
    public void mo214604a(boolean z) {
        this.f155773e.set(z);
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a
    /* renamed from: a */
    public void mo214602a(AbstractC61994a.AbstractC61995a aVar) {
        if (!this.f155769a.contains(aVar)) {
            this.f155769a.add(aVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a
    /* renamed from: b */
    public void mo214605b(AbstractC61994a.AbstractC61995a aVar) {
        if (this.f155769a.contains(aVar)) {
            this.f155769a.remove(aVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a
    /* renamed from: a */
    public void mo214603a(WeakReference<AbstractC61994a.AbstractC61995a> weakReference) {
        if (!this.f155770b.contains(weakReference) && weakReference != null) {
            this.f155770b.add(weakReference);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61994a
    /* renamed from: b */
    public void mo214606b(WeakReference<AbstractC61994a.AbstractC61995a> weakReference) {
        if (this.f155770b.contains(weakReference)) {
            this.f155770b.remove(weakReference);
        }
    }

    public C61997c(C61303k kVar) {
        super(kVar);
        this.f155772d = ParticipantUtil.m248728b(kVar);
    }

    @Override // com.ss.android.vc.meeting.module.p3129j.AbstractC61996b
    /* renamed from: a */
    public void mo214608a(String str, RtcNetworkQualityInfo rtcNetworkQualityInfo) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (Math.abs(rtcNetworkQualityInfo.f152893d) <= 1 && !this.f155774f.get()) {
                C60738ac.m236037c((int) R.string.View_G_InternetConnectionPoor);
                this.f155774f.set(true);
            }
            this.f155771c = str;
            m242205b(str, rtcNetworkQualityInfo.f152893d);
            m242204a(str, rtcNetworkQualityInfo.f152893d);
        }
    }

    /* renamed from: a */
    private void m242204a(String str, int i) {
        if (!this.f155770b.isEmpty() && this.f155772d.equals(str)) {
            if (Math.abs(i) <= 1) {
                this.f155773e.set(true);
                for (WeakReference<AbstractC61994a.AbstractC61995a> weakReference : this.f155770b) {
                    AbstractC61994a.AbstractC61995a aVar = weakReference.get();
                    if (aVar != null) {
                        aVar.mo213812c(i);
                    }
                }
                if (this.mMeeting != null) {
                    C63742at.m250089d(this.mMeeting.mo212056e());
                }
            } else if (i > 1) {
                this.f155773e.set(false);
                for (WeakReference<AbstractC61994a.AbstractC61995a> weakReference2 : this.f155770b) {
                    AbstractC61994a.AbstractC61995a aVar2 = weakReference2.get();
                    if (aVar2 != null) {
                        aVar2.mo213817k();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m242205b(String str, int i) {
        if (!this.f155769a.isEmpty() && this.f155772d.equals(str)) {
            if (Math.abs(i) <= 1) {
                this.f155773e.set(true);
                for (AbstractC61994a.AbstractC61995a aVar : this.f155769a) {
                    aVar.mo213812c(i);
                }
                if (this.mMeeting != null) {
                    C63742at.m250089d(this.mMeeting.mo212056e());
                }
            } else if (i > 1) {
                this.f155773e.set(false);
                for (AbstractC61994a.AbstractC61995a aVar2 : this.f155769a) {
                    aVar2.mo213817k();
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        if (i2 == 5) {
            mH().removeCallbacksAndMessages(null);
            this.f155774f.set(false);
            this.f155773e.set(false);
            this.f155769a.clear();
            this.f155770b.clear();
        }
    }
}
