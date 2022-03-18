package com.ss.android.lark.live;

import com.ss.android.lark.live.apm.LiveApmAgent;
import com.ss.android.lark.live.apm.LiveApmDataInfo;
import com.ss.android.lark.live.apm.monitor.LiveMonitorUtils;
import com.ss.android.lark.live.apm.power.LivePowerDataInfo;
import com.ss.android.lark.mm.p2288b.C45855f;

public class LiveStateHolder implements LiveApmAgent.ILiveApmDataListener {

    /* renamed from: a */
    private DisplayMode f105435a = DisplayMode.UNKNOWN;

    /* renamed from: b */
    private PlayerState f105436b = PlayerState.OTHER;

    /* renamed from: c */
    private LiveState f105437c = LiveState.UNKNOWN;

    /* renamed from: d */
    private String f105438d;

    public enum PlayerState {
        PLAY,
        OTHER
    }

    /* renamed from: a */
    public synchronized DisplayMode mo149253a() {
        return this.f105435a;
    }

    /* renamed from: b */
    public synchronized PlayerState mo149260b() {
        return this.f105436b;
    }

    /* renamed from: c */
    public synchronized String mo149261c() {
        return this.f105438d;
    }

    /* renamed from: d */
    private void m164558d() {
        C45855f.m181664c("LiveStateHolder", "[PerMonitor] startPerMonitor");
        LiveApmAgent.m164651d();
        LiveApmAgent.m164645a(this);
    }

    /* renamed from: e */
    private void m164559e() {
        C45855f.m181664c("LiveStateHolder", "[PerMonitor] stopPerMonitor");
        LiveApmAgent.m164648b(this);
        LiveApmAgent.m164652e();
    }

    public String toString() {
        return "LiveSession{mDisplayMode=" + this.f105435a.name() + ", mPlayerState=" + this.f105436b.name() + ", mLiveState=" + this.f105437c.name() + ", mLiveId='" + this.f105438d + '\'' + '}';
    }

    @Override // com.ss.android.lark.live.apm.LiveApmAgent.ILiveApmDataListener
    /* renamed from: a */
    public void mo149257a(LiveApmDataInfo bVar) {
        LiveMonitorUtils.m164688a(bVar);
    }

    /* renamed from: a */
    public synchronized void mo149254a(DisplayMode displayMode) {
        this.f105435a = displayMode;
        this.f105436b = PlayerState.OTHER;
    }

    /* renamed from: a */
    public synchronized void mo149256a(PlayerState playerState) {
        this.f105436b = playerState;
    }

    /* renamed from: a */
    public synchronized void mo149255a(LiveState liveState) {
        this.f105437c = liveState;
        if (liveState == LiveState.START) {
            this.f105435a = DisplayMode.UNKNOWN;
            this.f105436b = PlayerState.OTHER;
            this.f105438d = null;
            m164558d();
        } else if (this.f105437c == LiveState.END) {
            m164559e();
        }
    }

    @Override // com.ss.android.lark.live.apm.LiveApmAgent.ILiveApmDataListener
    /* renamed from: a */
    public void mo149258a(LivePowerDataInfo bVar) {
        LiveMonitorUtils.m164689a(bVar);
    }

    /* renamed from: a */
    public synchronized void mo149259a(String str) {
        this.f105438d = str;
    }

    public enum DisplayMode {
        UNKNOWN(0),
        ACTIVITY(1),
        FLOATVIEW(2);
        
        public final int value;

        private DisplayMode(int i) {
            this.value = i;
        }
    }

    public enum LiveState {
        UNKNOWN(0),
        START(1),
        END(2);
        
        public final int value;

        private LiveState(int i) {
            this.value = i;
        }
    }
}
