package com.ss.android.lark.voip.service.impl.app;

import android.os.Message;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.p2916d.C58152e;
import com.ss.android.lark.voip.service.impl.service.C58176e;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.statistics.OnCallToStreamEvent;
import com.ss.android.lark.voip.service.impl.statistics.VoipFinishType;
import com.ss.android.lark.voip.service.impl.statistics.VoipHitPoint;
import com.ss.android.lark.voip.service.impl.util.VoipUtil;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.voip.service.impl.app.j */
public class C58076j extends C58067h {

    /* renamed from: c */
    public final C58078b f142863c;

    /* renamed from: d */
    public final C58078b f142864d;

    /* renamed from: e */
    public final C58078b f142865e;

    /* renamed from: f */
    public final C58078b f142866f;

    /* renamed from: g */
    public final C58078b f142867g;

    /* renamed from: h */
    public final C58078b f142868h;

    /* renamed from: i */
    public final C58078b f142869i;

    /* renamed from: j */
    public final C58078b f142870j;

    /* renamed from: k */
    public C58090k f142871k;

    /* renamed from: l */
    public AbstractC58085i f142872l;

    /* renamed from: m */
    public boolean f142873m;

    /* renamed from: n */
    private final C58078b f142874n;

    /* renamed from: com.ss.android.lark.voip.service.impl.app.j$i */
    public interface AbstractC58085i {
        /* renamed from: a */
        void mo196892a();

        /* renamed from: a */
        void mo196893a(long j);

        /* renamed from: a */
        void mo196894a(VoiceCall voiceCall);

        /* renamed from: b */
        void mo196895b();

        /* renamed from: b */
        void mo196896b(VoiceCall voiceCall);

        /* renamed from: c */
        void mo196897c();

        /* renamed from: d */
        void mo196898d();

        /* renamed from: e */
        void mo196899e();
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.j$a */
    public class C58077a extends C58078b {
        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: b */
        public void mo196843b() {
            C58176e.m225720a();
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: c */
        public void mo196844c() {
            C58176e.m225721b();
        }

        public C58077a() {
            super();
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58076j.C58078b, com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: a */
        public boolean mo196842a(Message message) {
            C58081e eVar = (C58081e) message.obj;
            int i = message.what;
            if (i == 1 || i == 2) {
                C58152e.m225594a(this, message.what, eVar.f142879a);
                return true;
            }
            if (i != 4) {
                if (i == 8) {
                    C58076j jVar = C58076j.this;
                    jVar.mo196851a((AbstractC58040c) jVar.f142867g);
                    C58076j.this.mo196891a(eVar.f142879a);
                } else if (i != 9) {
                    return super.mo196842a(message);
                } else {
                    C58076j.this.mo196891a(eVar.f142879a);
                    C58076j jVar2 = C58076j.this;
                    jVar2.mo196851a((AbstractC58040c) jVar2.f142868h);
                    return true;
                }
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.j$e */
    public static class C58081e {

        /* renamed from: a */
        VoiceCall f142879a;

        public C58081e() {
        }

        public C58081e(VoiceCall voiceCall) {
            this.f142879a = voiceCall;
        }
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.j$f */
    public class C58082f extends C58078b {
        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: c */
        public void mo196844c() {
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: b */
        public void mo196843b() {
            C58076j.this.f142871k.mo196903c();
            C58076j.this.mo196865d(11);
        }

        public C58082f() {
            super();
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58076j.C58078b, com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: a */
        public boolean mo196842a(Message message) {
            int i = message.what;
            return super.mo196842a(message);
        }
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.j$g */
    public class C58083g extends C58078b {

        /* renamed from: c */
        private volatile long f142882c;

        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: c */
        public void mo196844c() {
            super.mo196844c();
            C58076j.this.mo196868e(13);
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: b */
        public void mo196843b() {
            super.mo196843b();
            this.f142882c = System.currentTimeMillis();
            if (C57977a.m224905c().getVideoChatDependency().mo145480d()) {
                C58151d.m225577a("ui", "voip accept, interruptFloatLive");
                C57977a.m224905c().getVideoChatDependency().mo145481e();
            }
            C58076j.this.mo196848a(13, 12000);
            C58076j.this.f142873m = true;
        }

        public C58083g() {
            super();
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58076j.C58078b, com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: a */
        public boolean mo196842a(Message message) {
            C58081e eVar = (C58081e) message.obj;
            int i = message.what;
            if (i == 1 || i == 2 || i == 4) {
                C58152e.m225594a(this, message.what, eVar.f142879a);
                return true;
            } else if (i == 9) {
                C58076j.this.mo196891a(eVar.f142879a);
                if ((System.currentTimeMillis() - this.f142882c) / 1000 > 5) {
                    boolean a = C58133t.m225480a(eVar.f142879a);
                    if (eVar.f142879a.isUseByteDanceChannel()) {
                        OnCallToStreamEvent.m225591b(eVar.f142879a.getId(), a);
                    }
                }
                VoipFinishType.m225599a(eVar.f142879a.getId(), C58133t.m225480a(eVar.f142879a), 2);
                OnCallToStreamEvent.m225590b();
                C58076j jVar = C58076j.this;
                jVar.mo196851a((AbstractC58040c) jVar.f142868h);
                return true;
            } else if (i == 12) {
                C58076j jVar2 = C58076j.this;
                jVar2.mo196851a((AbstractC58040c) jVar2.f142870j);
                return true;
            } else if (i != 13) {
                return super.mo196842a(message);
            } else {
                C58076j.this.f142872l.mo196899e();
                C58076j jVar3 = C58076j.this;
                jVar3.mo196851a((AbstractC58040c) jVar3.f142869i);
                return true;
            }
        }
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.j$j */
    public class C58086j extends C58078b {
        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: c */
        public void mo196844c() {
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: b */
        public void mo196843b() {
            C58076j.this.f142871k.mo196903c();
            C58076j.this.mo196865d(11);
        }

        public C58086j() {
            super();
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58076j.C58078b, com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: a */
        public boolean mo196842a(Message message) {
            C58081e eVar = (C58081e) message.obj;
            int i = message.what;
            return super.mo196842a(message);
        }
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.j$c */
    public class C58079c extends C58078b {
        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: b */
        public void mo196843b() {
            C58076j.this.f142872l.mo196895b();
            C58076j.this.f142871k.mo196909i();
            C58076j.this.f142873m = false;
        }

        public C58079c() {
            super();
        }
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.j$h */
    public class C58084h extends C58078b {
        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: c */
        public void mo196844c() {
            C58076j.this.f142871k.mo196905e();
            C58076j.this.f142871k.mo196907g();
            C58176e.m225721b();
            C58076j.this.mo196868e(7);
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: b */
        public void mo196843b() {
            VoipUtil.m225808c();
            C58076j.this.f142872l.mo196892a();
            C58076j.this.f142871k.mo196904d();
            C58076j.this.f142871k.mo196906f();
            C58176e.m225720a();
            C58076j.this.mo196849a(7, new C58081e(), 50000);
        }

        public C58084h() {
            super();
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58076j.C58078b, com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: a */
        public boolean mo196842a(Message message) {
            C58081e eVar = (C58081e) message.obj;
            int i = message.what;
            if (i == 1) {
                C58152e.m225594a(this, message.what, eVar.f142879a);
                return true;
            } else if (i == 2) {
                C58076j.this.mo196891a(eVar.f142879a);
                return true;
            } else if (i == 4) {
                C58076j.this.f142872l.mo196898d();
                C58076j jVar = C58076j.this;
                jVar.mo196851a((AbstractC58040c) jVar.f142866f);
                return true;
            } else if (i == 5) {
                C58076j.this.mo196891a(eVar.f142879a);
                C58076j jVar2 = C58076j.this;
                jVar2.mo196851a((AbstractC58040c) jVar2.f142869i);
                return true;
            } else if (i == 7) {
                C58076j.this.f142872l.mo196897c();
                C58076j jVar3 = C58076j.this;
                jVar3.mo196851a((AbstractC58040c) jVar3.f142869i);
                return true;
            } else if (i == 8) {
                C58076j.this.f142872l.mo196898d();
                C58076j jVar4 = C58076j.this;
                jVar4.mo196851a((AbstractC58040c) jVar4.f142867g);
                C58076j.this.mo196891a(eVar.f142879a);
                return true;
            } else if (i == 9) {
                C58076j.this.mo196891a(eVar.f142879a);
                C58076j jVar5 = C58076j.this;
                jVar5.mo196851a((AbstractC58040c) jVar5.f142868h);
                return true;
            } else if (i == 14) {
                C58076j.this.f142871k.mo196905e();
                C58076j.this.f142871k.mo196907g();
                return true;
            } else if (i != 15) {
                return super.mo196842a(message);
            } else {
                C58076j.this.f142871k.mo196904d();
                C58076j.this.f142871k.mo196906f();
                return true;
            }
        }
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.j$k */
    public class C58087k extends C58078b {

        /* renamed from: a */
        public volatile int f142885a;

        /* renamed from: d */
        private ScheduledFuture f142887d;

        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: c */
        public void mo196844c() {
            ScheduledFuture scheduledFuture = this.f142887d;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                try {
                    this.f142887d.cancel(true);
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: b */
        public void mo196843b() {
            C58076j.this.f142871k.mo196908h();
            this.f142885a = 0;
            this.f142887d = CoreThreadPool.getDefault().getScheduleThreadPool().scheduleAtFixedRate(new Runnable() {
                /* class com.ss.android.lark.voip.service.impl.app.C58076j.C58087k.RunnableC580881 */

                public void run() {
                    C58087k.this.f142885a++;
                    C58076j.this.f142872l.mo196893a((long) C58087k.this.f142885a);
                }
            }, 0, 1, TimeUnit.SECONDS);
        }

        public C58087k() {
            super();
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58076j.C58078b, com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: a */
        public boolean mo196842a(Message message) {
            C58081e eVar = (C58081e) message.obj;
            int i = message.what;
            if (i == 1 || i == 2) {
                C58152e.m225594a(this, message.what, eVar.f142879a);
                return true;
            } else if (i != 9) {
                return super.mo196842a(message);
            } else {
                C58076j.this.f142872l.mo196896b(eVar.f142879a);
                C58076j.this.mo196891a(eVar.f142879a);
                if (this.f142885a < 15) {
                    VoipHitPoint.m225627c(eVar.f142879a.getId(), C58133t.m225480a(eVar.f142879a));
                }
                OnCallToStreamEvent.m225590b();
                C58076j jVar = C58076j.this;
                jVar.mo196851a((AbstractC58040c) jVar.f142868h);
                return true;
            }
        }
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.j$l */
    public class C58089l extends C58078b {
        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: b */
        public void mo196843b() {
            C58076j.this.f142872l.mo196892a();
            C58076j.this.f142871k.mo196901a();
            C58176e.m225720a();
            C58076j.this.mo196849a(7, new C58081e(), 50000);
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: c */
        public void mo196844c() {
            C58076j.this.f142871k.mo196902b();
            C58176e.m225721b();
            C58076j.this.mo196868e(7);
        }

        public C58089l() {
            super();
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58076j.C58078b, com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: a */
        public boolean mo196842a(Message message) {
            C58081e eVar = (C58081e) message.obj;
            int i = message.what;
            if (i == 1) {
                C58152e.m225594a(this, message.what, eVar.f142879a);
                return true;
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C58076j.this.f142872l.mo196898d();
                        C58076j jVar = C58076j.this;
                        jVar.mo196851a((AbstractC58040c) jVar.f142866f);
                        return true;
                    } else if (i != 5) {
                        if (i == 7) {
                            C58076j.this.f142872l.mo196897c();
                            C58076j jVar2 = C58076j.this;
                            jVar2.mo196851a((AbstractC58040c) jVar2.f142869i);
                            return true;
                        } else if (i == 8) {
                            C58076j.this.f142872l.mo196898d();
                            C58076j jVar3 = C58076j.this;
                            jVar3.mo196851a((AbstractC58040c) jVar3.f142867g);
                            C58076j.this.mo196891a(eVar.f142879a);
                            return true;
                        } else if (i == 9) {
                            C58076j.this.mo196891a(eVar.f142879a);
                            C58076j jVar4 = C58076j.this;
                            jVar4.mo196851a((AbstractC58040c) jVar4.f142868h);
                            return true;
                        } else if (i == 14 || i == 15) {
                            return true;
                        } else {
                            return super.mo196842a(message);
                        }
                    }
                }
                C58076j.this.mo196891a(eVar.f142879a);
                C58076j jVar5 = C58076j.this;
                jVar5.mo196851a((AbstractC58040c) jVar5.f142865e);
                return true;
            } else {
                C58076j.this.mo196891a(eVar.f142879a);
                return true;
            }
        }
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.j$b */
    public class C58078b extends C58066g {
        public C58078b() {
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: a */
        public boolean mo196842a(Message message) {
            C58081e eVar = (C58081e) message.obj;
            switch (message.what) {
                case 1:
                case 2:
                    if (eVar.f142879a == null || !C58133t.m225480a(eVar.f142879a)) {
                        C58076j jVar = C58076j.this;
                        jVar.mo196851a((AbstractC58040c) jVar.f142863c);
                    } else {
                        C58076j jVar2 = C58076j.this;
                        jVar2.mo196851a((AbstractC58040c) jVar2.f142864d);
                    }
                    return true;
                case 3:
                    C58076j.this.mo196891a(eVar.f142879a);
                    C58076j jVar3 = C58076j.this;
                    jVar3.mo196851a((AbstractC58040c) jVar3.f142865e);
                    return true;
                case 4:
                    C58076j.this.f142872l.mo196892a();
                    C58076j.this.f142872l.mo196898d();
                    C58076j jVar4 = C58076j.this;
                    jVar4.mo196851a((AbstractC58040c) jVar4.f142866f);
                    return true;
                case 6:
                    VoipUtil.m225812g();
                    C58076j.this.mo196891a(eVar.f142879a);
                    C58076j jVar5 = C58076j.this;
                    jVar5.mo196851a((AbstractC58040c) jVar5.f142869i);
                    return true;
                case 9:
                    if (!(eVar == null || eVar.f142879a == null)) {
                        C58076j.this.mo196891a(eVar.f142879a);
                        C58076j jVar6 = C58076j.this;
                        jVar6.mo196851a((AbstractC58040c) jVar6.f142869i);
                        C58151d.m225578a("state_machine", "state_machine", "process msg VoIPConstants.TERMINATED " + C58076j.this.mo196871f(message.what), "[VoIPStateMachine] BaseState: processMessage VoIPConstants.TERMINATED " + C58076j.this.mo196871f(message.what));
                        return true;
                    }
                case 10:
                    C58076j.this.mo196891a(eVar.f142879a);
                    C58076j jVar7 = C58076j.this;
                    jVar7.mo196851a((AbstractC58040c) jVar7.f142869i);
                    return true;
                case 11:
                    C58076j jVar8 = C58076j.this;
                    jVar8.mo196851a((AbstractC58040c) jVar8.f142869i);
                    return true;
            }
            if (eVar != null) {
                C58152e.m225594a(this, message.what, eVar.f142879a);
                return false;
            }
            C58151d.m225578a("state_machine", "state_machine", "process unexpected msg " + C58076j.this.mo196871f(message.what), "[VoIPStateMachine] BaseState: processMessage unexpected " + C58076j.this.mo196871f(message.what));
            return false;
        }
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.j$d */
    public class C58080d extends C58078b {
        public C58080d() {
            super();
        }

        @Override // com.ss.android.lark.voip.service.impl.app.C58076j.C58078b, com.ss.android.lark.voip.service.impl.app.C58066g
        /* renamed from: a */
        public boolean mo196842a(Message message) {
            return super.mo196842a(message);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.voip.service.impl.app.C58067h
    /* renamed from: f */
    public String mo196871f(int i) {
        return C58152e.m225592a(i);
    }

    /* renamed from: a */
    public void mo196891a(VoiceCall voiceCall) {
        if (this.f142872l != null && voiceCall != null) {
            if (voiceCall.getStatus() == VoiceCall.Status.TERMINATED) {
                voiceCall.setIsNeedFeedback(this.f142873m);
            }
            this.f142872l.mo196894a(voiceCall);
        }
    }

    public C58076j(C58090k kVar, AbstractC58085i iVar) {
        super("VoIPStateMachine");
        C58080d dVar = new C58080d();
        this.f142874n = dVar;
        C58084h hVar = new C58084h();
        this.f142863c = hVar;
        C58089l lVar = new C58089l();
        this.f142864d = lVar;
        C58082f fVar = new C58082f();
        this.f142865e = fVar;
        C58077a aVar = new C58077a();
        this.f142866f = aVar;
        C58083g gVar = new C58083g();
        this.f142867g = gVar;
        C58086j jVar = new C58086j();
        this.f142868h = jVar;
        C58079c cVar = new C58079c();
        this.f142869i = cVar;
        C58087k kVar2 = new C58087k();
        this.f142870j = kVar2;
        this.f142871k = kVar;
        this.f142872l = iVar;
        mo196852a((C58066g) dVar);
        mo196852a((C58066g) lVar);
        mo196852a((C58066g) hVar);
        mo196852a((C58066g) fVar);
        mo196852a((C58066g) aVar);
        mo196852a((C58066g) gVar);
        mo196852a((C58066g) jVar);
        mo196852a((C58066g) cVar);
        mo196852a((C58066g) kVar2);
        mo196859b(dVar);
        mo196873g();
        mo196857b(VoiceCall.Status.NONE.getNumber(), new C58081e(null));
    }
}
