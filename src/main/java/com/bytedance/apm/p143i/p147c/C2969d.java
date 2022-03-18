package com.bytedance.apm.p143i.p147c;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.provider.Settings;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.p153n.C3047b;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.bytedance.apm.i.c.d */
public class C2969d implements AbstractC2966b {

    /* renamed from: a */
    public long f9534a;

    /* renamed from: b */
    public long f9535b;

    /* renamed from: c */
    public long f9536c = -1;

    /* renamed from: d */
    public long f9537d = -1;

    /* renamed from: e */
    private long f9538e;

    /* renamed from: f */
    private long f9539f;

    /* renamed from: g */
    private long f9540g;

    /* renamed from: h */
    private long f9541h;

    /* renamed from: i */
    private boolean f9542i = true;

    /* renamed from: j */
    private NetworkStatsManager f9543j;

    /* renamed from: k */
    private int f9544k = -1;

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: d */
    public long mo12693d() {
        mo12705k();
        return this.f9541h;
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: e */
    public long mo12694e() {
        mo12705k();
        return this.f9539f;
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: f */
    public long mo12695f() {
        mo12705k();
        return this.f9540g;
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: g */
    public long mo12696g() {
        mo12705k();
        return this.f9538e;
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: b */
    public long mo12691b() {
        mo12705k();
        return this.f9539f + this.f9538e;
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: c */
    public long mo12692c() {
        mo12705k();
        return this.f9541h + this.f9540g;
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: h */
    public long mo12697h() {
        return mo12703i() + mo12704j();
    }

    /* renamed from: i */
    public long mo12703i() {
        mo12705k();
        return this.f9539f + this.f9541h;
    }

    /* renamed from: j */
    public long mo12704j() {
        mo12705k();
        return this.f9538e + this.f9540g;
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: a */
    public void mo12689a() {
        Context a = C2785b.m11735a();
        if (a != null) {
            this.f9537d = Settings.Global.getLong(a.getContentResolver(), "netstats_uid_bucket_duration", 3600000);
        } else {
            this.f9537d = 3600000;
        }
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.p143i.p147c.C2969d.RunnableC29701 */

            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                C2969d.this.f9536c = currentTimeMillis;
                long j = currentTimeMillis - (currentTimeMillis % C2969d.this.f9537d);
                long j2 = C2969d.this.f9537d + j;
                C2969d dVar = C2969d.this;
                dVar.f9534a = dVar.mo12702a(j, j2, 1);
                C2969d dVar2 = C2969d.this;
                dVar2.f9535b = dVar2.mo12702a(j, j2, 0);
            }
        });
    }

    /* renamed from: k */
    public void mo12705k() {
        boolean z;
        long j;
        long j2;
        long j3;
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = this.f9536c;
        if (currentTimeMillis - j4 >= 1000) {
            long j5 = this.f9537d;
            long j6 = currentTimeMillis - (currentTimeMillis % j5);
            long j7 = j6 + j5;
            if (j4 < j6 || currentTimeMillis > j7) {
                z = false;
            } else {
                z = true;
            }
            long j8 = 0;
            if (z) {
                long a = mo12702a(j4, currentTimeMillis, 0);
                j8 = a - this.f9535b;
                this.f9535b = a;
                long a2 = mo12702a(this.f9536c, currentTimeMillis, 1);
                j = a2 - this.f9534a;
                this.f9534a = a2;
            } else if (j4 < j6) {
                long j9 = j6 - j5;
                long j10 = j6 - 1;
                long a3 = mo12702a(j9, j10, 0) - this.f9535b;
                long a4 = mo12702a(j6, currentTimeMillis, 0);
                if (a3 < 1024) {
                    j2 = a4;
                } else {
                    j2 = a3 + a4;
                }
                this.f9535b = a4;
                long a5 = mo12702a(j9, j10, 1) - this.f9534a;
                long a6 = mo12702a(j6, currentTimeMillis, 1);
                if (a5 < 1024) {
                    j3 = a6;
                } else {
                    j3 = a5 + a6;
                }
                this.f9534a = a6;
                j = j3;
                j8 = j2;
            } else {
                j = 0;
            }
            if (this.f9542i) {
                this.f9541h += j8;
                this.f9540g += j;
            } else {
                this.f9539f += j8;
                this.f9538e += j;
            }
            this.f9536c = currentTimeMillis;
        }
    }

    @Override // com.bytedance.apm.p143i.p147c.AbstractC2966b
    /* renamed from: a */
    public void mo12690a(boolean z) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.p143i.p147c.C2969d.RunnableC29712 */

            public void run() {
                C2969d.this.mo12705k();
            }
        });
        this.f9542i = !z;
    }

    /* renamed from: a */
    private int m12485a(Context context) {
        if (this.f9544k == -1) {
            try {
                PackageInfo packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), SmActions.ACTION_ONTHECALL_EXIT);
                if (packageInfo != null) {
                    this.f9544k = packageInfo.applicationInfo.uid;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return this.f9544k;
    }

    /* renamed from: a */
    public long mo12702a(long j, long j2, int i) {
        Context a = C2785b.m11735a();
        if (this.f9543j == null) {
            this.f9543j = (NetworkStatsManager) a.getApplicationContext().getSystemService("netstats");
        }
        if (this.f9543j == null) {
            return -1;
        }
        NetworkStats networkStats = null;
        NetworkStats.Bucket bucket = new NetworkStats.Bucket();
        long j3 = 0;
        try {
            networkStats = this.f9543j.querySummary(i, null, j, j2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long j4 = 0;
        while (networkStats != null && networkStats.hasNextBucket()) {
            networkStats.getNextBucket(bucket);
            if (m12485a(a) == bucket.getUid()) {
                j3 += bucket.getRxBytes();
                j4 += bucket.getTxBytes();
            }
        }
        if (networkStats != null) {
            networkStats.close();
        }
        return j3 + j4;
    }
}
