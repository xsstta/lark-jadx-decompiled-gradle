package com.ss.android.vc.meeting.framework.statemachine;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.vc.meeting.framework.C61266a;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.vc.meeting.framework.statemachine.q */
public class C61363q {

    /* renamed from: a */
    public volatile long f153763a;

    /* renamed from: b */
    public volatile long f153764b;

    /* renamed from: c */
    public volatile long f153765c;

    /* renamed from: d */
    private AbstractC61294b f153766d;

    /* renamed from: e */
    private ScheduledFuture f153767e;

    /* renamed from: f */
    private ScheduledFuture f153768f;

    /* renamed from: g */
    private ScheduledFuture f153769g;

    /* renamed from: e */
    public void mo212387e() {
        ScheduledFuture scheduledFuture = this.f153768f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f153768f = null;
        }
    }

    /* renamed from: f */
    public void mo212388f() {
        ScheduledFuture scheduledFuture = this.f153769g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f153769g = null;
        }
    }

    /* renamed from: g */
    public void mo212389g() {
        ScheduledFuture scheduledFuture = this.f153767e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f153767e = null;
        }
    }

    /* renamed from: b */
    public void mo212384b() {
        this.f153765c = 0;
        mo212389g();
        this.f153767e = CoreThreadPool.getDefault().getScheduleThreadPool().scheduleAtFixedRate(new Runnable() {
            /* class com.ss.android.vc.meeting.framework.statemachine.C61363q.RunnableC613641 */

            public void run() {
                C61363q.this.f153765c++;
                if (C61363q.this.f153765c >= 5) {
                    C61363q.this.f153765c = 0;
                    C61363q.this.mo212383a();
                    C61363q.this.mo212389g();
                }
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

    /* renamed from: c */
    public void mo212385c() {
        this.f153763a = 0;
        mo212387e();
        this.f153768f = CoreThreadPool.getDefault().getScheduleThreadPool().scheduleAtFixedRate(new Runnable() {
            /* class com.ss.android.vc.meeting.framework.statemachine.C61363q.RunnableC613652 */

            public void run() {
                C61363q.this.f153763a++;
                if (C61363q.this.f153763a >= 70) {
                    C61363q.this.f153763a = 0;
                    C61363q.this.mo212383a();
                    C61363q.this.mo212387e();
                }
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

    /* renamed from: d */
    public void mo212386d() {
        this.f153764b = 0;
        mo212388f();
        this.f153769g = CoreThreadPool.getDefault().getScheduleThreadPool().scheduleAtFixedRate(new Runnable() {
            /* class com.ss.android.vc.meeting.framework.statemachine.C61363q.RunnableC613663 */

            public void run() {
                C61363q.this.f153764b++;
                if (C61363q.this.f153764b >= 70) {
                    C61363q.this.f153764b = 0;
                    C61363q.this.mo212383a();
                    C61363q.this.mo212388f();
                }
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public void mo212383a() {
        if (this.f153766d.mo212064m()) {
            C60871a.m236611b("VideoChatTimeoutMechanism", "[onTimeout] Calling EVENT_TO");
            this.f153766d.mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_TO));
            C61266a.m238332a().mo210465a(true, this.f153766d.mo212056e());
        } else if (this.f153766d.mo212063l()) {
            C60871a.m236611b("VideoChatTimeoutMechanism", "[onTimeout] Ringing EVENT_TO");
            this.f153766d.mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_TO));
            C61266a.m238332a().mo210465a(false, this.f153766d.mo212056e());
        } else if (this.f153766d.mo212061j()) {
            C60871a.m236611b("VideoChatTimeoutMechanism", "[onTimeout] InitState timeout");
            this.f153766d.mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_TO));
        }
    }

    public C61363q(AbstractC61294b bVar) {
        this.f153766d = bVar;
    }
}
