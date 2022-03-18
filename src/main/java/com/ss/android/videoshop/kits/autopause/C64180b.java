package com.ss.android.videoshop.kits.autopause;

import com.ss.android.videoshop.context.VideoContext;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3199e.C64159a;

/* renamed from: com.ss.android.videoshop.kits.autopause.b */
public class C64180b {

    /* renamed from: a */
    private long f162151a = 600000;

    /* renamed from: b */
    private long f162152b;

    /* renamed from: c */
    private boolean f162153c;

    /* renamed from: d */
    private int f162154d = 1;

    /* renamed from: e */
    private boolean f162155e;

    /* renamed from: f */
    private AbstractC64181a f162156f;

    /* renamed from: g */
    private VideoContext f162157g;

    /* renamed from: h */
    private boolean f162158h = true;

    /* renamed from: i */
    private boolean f162159i = true;

    /* renamed from: com.ss.android.videoshop.kits.autopause.b$a */
    public interface AbstractC64181a {
        /* renamed from: a */
        boolean mo163674a(boolean z);

        /* renamed from: c */
        boolean mo163681c();
    }

    /* renamed from: i */
    private boolean m252240i() {
        if ((this.f162154d & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo222334a() {
        if ((this.f162154d & 4 & -1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private boolean m252239h() {
        if (this.f162152b <= 0 || System.currentTimeMillis() - this.f162152b <= this.f162151a) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo222337c() {
        C64159a.m252080a("AutoPauseResumeCoordinator", "onScreenOn " + Integer.toHexString(hashCode()));
        m252238b(4);
    }

    /* renamed from: f */
    public void mo222340f() {
        if (!this.f162155e) {
            C64159a.m252083b("AutoPauseResumeCoordinator", "start " + Integer.toHexString(hashCode()));
            this.f162153c = false;
            if (this.f162159i) {
                this.f162154d = 1;
            } else {
                this.f162154d = 0;
            }
            this.f162155e = true;
        }
    }

    /* renamed from: g */
    public void mo222341g() {
        if (this.f162155e) {
            C64159a.m252083b("AutoPauseResumeCoordinator", "stop " + Integer.toHexString(hashCode()));
            this.f162155e = false;
            this.f162153c = false;
        }
    }

    /* renamed from: b */
    public void mo222335b() {
        C64159a.m252079a("onScreenOff " + Integer.toHexString(hashCode()));
        C64116b m = this.f162157g.mo222060m();
        C64159a.m252077a(m, "onScreenOff " + Integer.toHexString(hashCode()));
        C64159a.m252080a("AutoPauseResumeCoordinator", "onScreenOff " + Integer.toHexString(hashCode()));
        m252237a(4);
    }

    /* renamed from: d */
    public void mo222338d() {
        C64159a.m252079a("onViewPaused " + Integer.toHexString(hashCode()));
        C64159a.m252083b("AutoPauseResumeCoordinator", "onViewPaused " + Integer.toHexString(hashCode()));
        VideoContext videoContext = this.f162157g;
        if (videoContext != null) {
            C64116b m = videoContext.mo222060m();
            C64159a.m252077a(m, "onViewPaused " + Integer.toHexString(hashCode()));
        }
        m252237a(2);
    }

    /* renamed from: e */
    public void mo222339e() {
        C64159a.m252083b("AutoPauseResumeCoordinator", "onViewResumed " + Integer.toHexString(hashCode()));
        m252238b(2);
        if (this.f162159i && this.f162153c && m252240i() && !mo222334a() && this.f162157g.mo222002O() != null) {
            this.f162157g.mo222002O().mo222342a();
        }
    }

    /* renamed from: a */
    public void mo222332a(AbstractC64181a aVar) {
        this.f162156f = aVar;
    }

    public C64180b(VideoContext videoContext) {
        this.f162157g = videoContext;
    }

    /* renamed from: b */
    public void mo222336b(boolean z) {
        if (this.f162159i) {
            C64159a.m252080a("AutoPauseResumeCoordinator", "onAudioFocusGain " + z + " " + Integer.toHexString(hashCode()));
            m252238b(1);
        }
    }

    /* renamed from: a */
    private void m252237a(int i) {
        AbstractC64181a aVar;
        int i2 = this.f162154d;
        if ((i2 & i) != 0) {
            C64159a.m252083b("AutoPauseResumeCoordinator", "setStateBitFlag return. mStateBitFlags:" + this.f162154d + ", stateFlag:" + i);
            return;
        }
        this.f162154d = i2 | i;
        C64159a.m252083b("AutoPauseResumeCoordinator", "setStateBitFlag mStateBitFlags " + this.f162154d + " mIsWorking:" + this.f162155e + " mIsAutoPaused:" + this.f162153c + " " + Integer.toHexString(hashCode()));
        if (this.f162155e && !this.f162153c && (i & -1) != 0 && (aVar = this.f162156f) != null && aVar.mo163681c()) {
            this.f162153c = true;
            this.f162152b = System.currentTimeMillis();
            C64159a.m252079a("autoPaused " + Integer.toHexString(hashCode()));
            C64159a.m252083b("AutoPauseResumeCoordinator", "autoPaused " + Integer.toHexString(hashCode()));
            C64116b m = this.f162157g.mo222060m();
            C64159a.m252077a(m, "autoPaused " + Integer.toHexString(hashCode()));
        }
    }

    /* renamed from: b */
    private void m252238b(int i) {
        int i2 = this.f162154d;
        if ((i2 & i) == 0) {
            C64159a.m252083b("AutoPauseResumeCoordinator", "clearStateBitFlag return. mStateBitFlags:" + this.f162154d + ", stateFlag:" + i);
            return;
        }
        this.f162154d = i2 & (~i);
        C64159a.m252083b("AutoPauseResumeCoordinator", "clearStateBitFlag mStateBitFlags " + this.f162154d + " mIsWorking:" + this.f162155e + " mIsAutoPaused:" + this.f162153c + " " + Integer.toHexString(hashCode()));
        if (this.f162155e && this.f162153c && (this.f162154d & -1) == 0 && (i & -1) != 0) {
            boolean h = m252239h();
            AbstractC64181a aVar = this.f162156f;
            if (aVar != null && aVar.mo163674a(h)) {
                this.f162153c = false;
                C64159a.m252079a("autoResumed " + Integer.toHexString(hashCode()) + ", isAutoResumeTimeout:" + h);
                C64159a.m252083b("AutoPauseResumeCoordinator", "autoResumed " + Integer.toHexString(hashCode()) + ", isAutoResumeTimeout:" + h);
                C64116b m = this.f162157g.mo222060m();
                C64159a.m252077a(m, "autoResumed " + Integer.toHexString(hashCode()) + ", isAutoResumeTimeout:" + h);
            }
            this.f162153c = false;
        }
    }

    /* renamed from: a */
    public void mo222333a(boolean z) {
        if (this.f162159i) {
            C64159a.m252079a("onAudioFocusLoss " + z + " " + Integer.toHexString(hashCode()) + " enableAutoAudioFocusLoss:" + this.f162158h);
            C64116b m = this.f162157g.mo222060m();
            C64159a.m252077a(m, "onAudioFocusLoss " + z + " " + Integer.toHexString(hashCode()) + " enableAutoAudioFocusLoss:" + this.f162158h);
            C64159a.m252080a("AutoPauseResumeCoordinator", "onAudioFocusLoss " + z + " " + Integer.toHexString(hashCode()) + " enableAutoAudioFocusLoss:" + this.f162158h);
            if (this.f162158h) {
                m252237a(1);
            } else if (!z) {
                m252237a(1);
            }
        }
    }
}
