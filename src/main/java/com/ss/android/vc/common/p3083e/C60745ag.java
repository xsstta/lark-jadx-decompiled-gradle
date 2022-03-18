package com.ss.android.vc.common.p3083e;

import com.ss.android.vc.service.C63634c;
import java.util.concurrent.ScheduledFuture;

/* renamed from: com.ss.android.vc.common.e.ag */
public class C60745ag {

    /* renamed from: com.ss.android.vc.common.e.ag$a */
    public static class C60746a {

        /* renamed from: a */
        private ScheduledFuture<?> f151937a;

        /* renamed from: b */
        private Runnable f151938b;

        /* renamed from: a */
        public void mo208366a(boolean z) {
            ScheduledFuture<?> scheduledFuture = this.f151937a;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(z);
            } else if (this.f151938b != null) {
                C60735ab.m236006b().removeCallbacks(this.f151938b);
            }
        }

        /* renamed from: a */
        public void mo208365a(final Runnable runnable, long j, final long j2, boolean z) {
            ScheduledFuture<?> scheduledFuture;
            if (runnable != null) {
                if (C63634c.m249496b("byteview.meeting.android.periodic_task_schedule_pool")) {
                    if (j2 <= 0) {
                        scheduledFuture = C60735ab.m236008b(runnable, j);
                    } else if (z) {
                        scheduledFuture = C60735ab.m236009b(runnable, j, j2);
                    } else {
                        scheduledFuture = C60735ab.m235997a(runnable, j, j2);
                    }
                    this.f151937a = scheduledFuture;
                    return;
                }
                this.f151938b = new Runnable() {
                    /* class com.ss.android.vc.common.p3083e.C60745ag.C60746a.RunnableC607471 */

                    public void run() {
                        runnable.run();
                        if (j2 > 0) {
                            C60735ab.m236006b().postDelayed(this, j2);
                        }
                    }
                };
                if (j2 <= 0) {
                    C60735ab.m236006b().postDelayed(runnable, j);
                } else {
                    C60735ab.m236006b().postDelayed(this.f151938b, j);
                }
            }
        }
    }

    /* renamed from: a */
    public static final C60746a m236063a(Runnable runnable, long j) {
        return m236064a(runnable, j, 0);
    }

    /* renamed from: a */
    public static final C60746a m236064a(Runnable runnable, long j, long j2) {
        C60746a aVar = new C60746a();
        aVar.mo208365a(runnable, j, j2, false);
        return aVar;
    }

    /* renamed from: b */
    public static final C60746a m236065b(Runnable runnable, long j, long j2) {
        C60746a aVar = new C60746a();
        aVar.mo208365a(runnable, j, j2, true);
        return aVar;
    }
}
