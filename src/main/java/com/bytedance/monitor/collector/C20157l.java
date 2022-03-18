package com.bytedance.monitor.collector;

import android.util.Pair;
import com.bytedance.monitor.util.thread.AbstractRunnableC20192d;
import com.bytedance.monitor.util.thread.C20188b;
import com.huawei.hms.location.LocationRequest;
import com.ss.ttm.player.MediaPlayer;

/* renamed from: com.bytedance.monitor.collector.l */
public class C20157l extends AbsMonitor {

    /* renamed from: f */
    AbstractRunnableC20192d f49256f = C20188b.m73690a("collect-proc", new Runnable() {
        /* class com.bytedance.monitor.collector.C20157l.RunnableC201581 */

        public void run() {
            C20157l.this.mo68308e();
        }
    });

    /* renamed from: g */
    private int f49257g = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: h */
    private int f49258h = 1000;

    /* renamed from: i */
    private boolean f49259i = true;

    /* renamed from: d */
    public static void m73564d() {
        try {
            if (C20152k.f49237a) {
                MonitorJni.doInit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public synchronized void mo68308e() {
        try {
            if (C20152k.f49237a) {
                MonitorJni.doCollect();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: b */
    public void mo68213b() {
        super.mo68213b();
        try {
            if (C20152k.f49237a) {
                if (this.f49092e != null) {
                    this.f49092e.mo68328b(this.f49256f);
                }
                MonitorJni.doStop();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: a */
    public void mo68211a() {
        super.mo68211a();
        try {
            if (C20152k.f49237a) {
                boolean z = this.f49259i;
                if (z) {
                    this.f49258h = 5000;
                } else {
                    this.f49258h = 1000;
                }
                MonitorJni.keepProcHyperOpen(z);
                MonitorJni.doStart();
                if (this.f49092e != null) {
                    this.f49092e.mo68324a(this.f49256f, 0, (long) this.f49258h);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: c */
    public synchronized Pair<String, String> mo68215c() {
        try {
            if (!C20152k.f49237a) {
                return null;
            }
            return new Pair<>(this.f49088a, MonitorJni.getProcInfos());
        } catch (Throwable unused) {
            return null;
        }
    }

    C20157l(int i) {
        super(i, "proc_monitor");
    }

    /* renamed from: c */
    public static long m73563c(int i) {
        try {
            if (!C20152k.f49237a) {
                return -1;
            }
            return MonitorJni.doGetCpuTime(i) * C20162n.m73577a();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: b */
    public void mo68214b(int i) {
        try {
            if (C20152k.f49237a) {
                mo68213b();
                if (i != 0) {
                    if (i == 1) {
                        this.f49257g = LocationRequest.PRIORITY_HD_ACCURACY;
                        this.f49258h = 1000;
                        MonitorJni.setBufferSize(LocationRequest.PRIORITY_HD_ACCURACY);
                    } else if (i == 2 || i == 3) {
                        this.f49257g = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
                        this.f49258h = 1000;
                        MonitorJni.setBufferSize(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
                    }
                    mo68211a();
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: a */
    public synchronized Pair<String, String> mo68210a(long j, long j2) {
        try {
            if (!C20152k.f49237a) {
                return null;
            }
            return new Pair<>(this.f49088a, MonitorJni.getProcInfoTimeRange(j, j2));
        } catch (Throwable unused) {
            return null;
        }
    }
}
