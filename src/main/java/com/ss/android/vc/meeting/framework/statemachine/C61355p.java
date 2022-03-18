package com.ss.android.vc.meeting.framework.statemachine;

import android.os.Message;
import android.text.TextUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.C61266a;
import com.ss.android.vc.meeting.framework.manager.C61281d;
import com.ss.android.vc.meeting.framework.manager.C61283f;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61285b;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61287d;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61302j;
import com.ss.android.vc.meeting.framework.statemachine.SyncQueuePolicy;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import com.ss.android.vc.trace.C63784a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.framework.statemachine.p */
public class C61355p extends C61348n {

    /* renamed from: c */
    public final C61356a f153736c;

    /* renamed from: d */
    public final C61356a f153737d;

    /* renamed from: e */
    public final C61356a f153738e;

    /* renamed from: f */
    public final C61356a f153739f;

    /* renamed from: g */
    public final C61356a f153740g;

    /* renamed from: h */
    public AbstractC61287d f153741h;

    /* renamed from: i */
    public AbstractC61339e f153742i;

    /* renamed from: j */
    private final C61356a f153743j;

    /* renamed from: k */
    private SyncQueuePolicy f153744k = new SyncQueuePolicy(this);

    /* renamed from: l */
    private C61336c f153745l = new C61336c(this);

    /* renamed from: m */
    private AbstractC61285b f153746m = MeetingManager.m238341a().mo211897d();

    /* renamed from: n */
    private C61281d f153747n = MeetingManager.m238341a().mo211896c();

    /* renamed from: o */
    private final List<StatusNode> f153748o = new ArrayList();

    /* renamed from: p */
    private final StatusNode[] f153749p = new StatusNode[2];

    /* renamed from: q */
    private AbstractC61294b f153750q;

    /* renamed from: r */
    private AbstractC61302j f153751r;

    /* renamed from: s */
    private List<AbstractC61288e> f153752s = new CopyOnWriteArrayList();

    /* renamed from: t */
    private AbstractC61288e f153753t = new AbstractC61288e() {
        /* class com.ss.android.vc.meeting.framework.statemachine.$$Lambda$p$g49D1CipCMLQk8YFpgosMrE64lc */

        @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e
        public final void meetingStateChanged(VideoChat videoChat, StatusNode statusNode) {
            C61355p.this.m239077b((C61355p) videoChat, (VideoChat) statusNode);
        }
    };

    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.p$a */
    public class C61356a extends State {

        /* renamed from: a */
        protected int f153754a;

        /* renamed from: b */
        protected StatusNode f153755b;

        @Override // com.ss.android.vc.meeting.framework.statemachine.State, com.ss.android.vc.meeting.framework.statemachine.AbstractC61338d
        /* renamed from: b */
        public int mo212287b() {
            return this.f153754a;
        }

        @Override // com.ss.android.vc.meeting.framework.statemachine.State, com.ss.android.vc.meeting.framework.statemachine.AbstractC61338d
        /* renamed from: a */
        public String mo212285a() {
            return getClass().getSimpleName();
        }

        @Override // com.ss.android.vc.meeting.framework.statemachine.State
        /* renamed from: d */
        public void mo212289d() {
            C60871a.m236611b("VideoChatStateMachine", C61355p.this.mo212382j() + "state change exit " + mo212285a());
            C61355p.this.f153741h.mo211956a(this.f153755b);
        }

        @Override // com.ss.android.vc.meeting.framework.statemachine.State
        /* renamed from: c */
        public void mo212288c() {
            C60871a.m236611b("VideoChatStateMachine", C61355p.this.mo212382j() + "state change enter " + mo212285a());
            C63784a.m250428a("[VideoChat_SM_enter_" + mo212285a() + "]");
            C63784a.m250428a("[VideoChat_SM_enter_" + mo212285a() + "_statusChange]");
            C61355p pVar = C61355p.this;
            pVar.mo212369a(pVar.mo212378f(), this.f153755b);
            C63784a.m250429b("[VideoChat_SM_enter_" + mo212285a() + "_statusChange]");
            C63784a.m250428a("[VideoChat_SM_enter_" + mo212285a() + "_enter]");
            C61355p.this.f153741h.mo211957b(this.f153755b);
            C63784a.m250429b("[VideoChat_SM_enter_" + mo212285a() + "_enter]");
            C63784a.m250429b("[VideoChat_SM_enter_" + mo212285a() + "]");
        }

        @Override // com.ss.android.vc.meeting.framework.statemachine.State
        /* renamed from: a */
        public boolean mo212286a(Message message) {
            C61344j jVar = (C61344j) message.obj;
            if (message.what == 211) {
                jVar.mo212335b(this.f153754a);
                C61355p pVar = C61355p.this;
                pVar.mo212374a(pVar.f153740g, message.what);
                return true;
            } else if (C61355p.this.mo212378f() == null) {
                C60871a.m236611b("VideoChatStateMachine", "[StateMachineExceptionMonitor] monitor: getVideoChat() is null");
                return false;
            } else {
                C61355p.this.f153742i.mo212275a(this, message.what, C61355p.this.mo212378f());
                return false;
            }
        }

        public C61356a(int i, StatusNode statusNode) {
            this.f153754a = i;
            this.f153755b = statusNode;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public VideoChat mo212378f() {
        return this.f153750q.mo212056e();
    }

    /* renamed from: g */
    public int mo212379g() {
        AbstractC61338d a = mo212345a();
        if (a != null) {
            return a.mo212287b();
        }
        return -1;
    }

    /* renamed from: h */
    public List<StatusNode> mo212380h() {
        List<StatusNode> list;
        synchronized (this.f153748o) {
            list = this.f153748o;
        }
        return list;
    }

    /* renamed from: i */
    public StatusNode[] mo212381i() {
        StatusNode[] statusNodeArr;
        synchronized (this.f153749p) {
            statusNodeArr = this.f153749p;
        }
        return statusNodeArr;
    }

    /* renamed from: j */
    public String mo212382j() {
        return "<" + this.f153750q.mo212054c() + "," + this.f153750q.mo212055d() + "," + this.f153750q.hashCode() + ">";
    }

    /* renamed from: a */
    public void mo212370a(AbstractC61287d dVar) {
        this.f153741h = dVar;
    }

    /* renamed from: a */
    public void mo212371a(AbstractC61288e eVar) {
        this.f153752s.add(eVar);
    }

    /* renamed from: b */
    public void mo212376b(SyncQueuePolicy.SyncAction syncAction) {
        this.f153744k.mo212295b(syncAction);
    }

    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.p$b */
    public class C61357b extends C61356a {
        @Override // com.ss.android.vc.meeting.framework.statemachine.State, com.ss.android.vc.meeting.framework.statemachine.C61355p.C61356a, com.ss.android.vc.meeting.framework.statemachine.AbstractC61338d
        /* renamed from: a */
        public String mo212285a() {
            return "CallingState";
        }

        public C61357b() {
            super(2, StatusNode.Calling);
        }

        @Override // com.ss.android.vc.meeting.framework.statemachine.State, com.ss.android.vc.meeting.framework.statemachine.C61355p.C61356a
        /* renamed from: a */
        public boolean mo212286a(Message message) {
            C61344j jVar = (C61344j) message.obj;
            int i = message.what;
            if (i != 104) {
                if (i == 116) {
                    jVar.mo212335b(this.f153754a);
                    C61355p pVar = C61355p.this;
                    pVar.mo212369a(pVar.mo212378f(), StatusNode.Calling);
                    return true;
                } else if (i == 120) {
                    jVar.mo212335b(this.f153754a);
                    C61355p pVar2 = C61355p.this;
                    pVar2.mo212374a(pVar2.f153739f, message.what);
                    return true;
                } else if (!(i == 206 || i == 214)) {
                    switch (i) {
                        case SmEvents.EVENT_NO:
                            jVar.mo212335b(this.f153754a);
                            C61355p pVar3 = C61355p.this;
                            pVar3.mo212374a(pVar3.f153738e, message.what);
                            return true;
                        case SmEvents.EVENT_NT:
                        case SmEvents.EVENT_RE:
                        case SmEvents.EVENT_TO:
                            break;
                        case SmEvents.EVENT_NE_RR:
                            jVar.mo212335b(this.f153754a);
                            return true;
                        default:
                            return super.mo212286a(message);
                    }
                }
            }
            jVar.mo212335b(this.f153754a);
            C61355p pVar4 = C61355p.this;
            pVar4.mo212374a(pVar4.f153740g, message.what);
            return true;
        }
    }

    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.p$c */
    public class C61358c extends C61356a {
        @Override // com.ss.android.vc.meeting.framework.statemachine.State, com.ss.android.vc.meeting.framework.statemachine.C61355p.C61356a, com.ss.android.vc.meeting.framework.statemachine.AbstractC61338d
        /* renamed from: a */
        public String mo212285a() {
            return "IdleState";
        }

        public C61358c() {
            super(5, StatusNode.Idle);
        }

        @Override // com.ss.android.vc.meeting.framework.statemachine.State, com.ss.android.vc.meeting.framework.statemachine.C61355p.C61356a
        /* renamed from: a */
        public boolean mo212286a(Message message) {
            C61344j jVar = (C61344j) message.obj;
            if (message.what != 116) {
                return super.mo212286a(message);
            }
            jVar.mo212335b(this.f153754a);
            return true;
        }
    }

    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.p$d */
    public class C61359d extends C61356a {
        @Override // com.ss.android.vc.meeting.framework.statemachine.State, com.ss.android.vc.meeting.framework.statemachine.C61355p.C61356a, com.ss.android.vc.meeting.framework.statemachine.AbstractC61338d
        /* renamed from: a */
        public String mo212285a() {
            return "InitState";
        }

        public C61359d() {
            super(1, StatusNode.Init);
        }

        @Override // com.ss.android.vc.meeting.framework.statemachine.State, com.ss.android.vc.meeting.framework.statemachine.C61355p.C61356a
        /* renamed from: a */
        public boolean mo212286a(Message message) {
            C61344j jVar = (C61344j) message.obj;
            int i = message.what;
            if (i != 100) {
                if (i != 114) {
                    if (i == 120) {
                        jVar.mo212335b(this.f153754a);
                        C61355p pVar = C61355p.this;
                        pVar.mo212374a(pVar.f153739f, message.what);
                        return true;
                    } else if (i != 214) {
                        switch (i) {
                            case 108:
                                break;
                            case SmEvents.EVENT_NR:
                                jVar.mo212335b(this.f153754a);
                                C61355p pVar2 = C61355p.this;
                                pVar2.mo212374a(pVar2.f153736c, message.what);
                                return true;
                            case SmEvents.EVENT_NO:
                                jVar.mo212335b(this.f153754a);
                                C61355p pVar3 = C61355p.this;
                                pVar3.mo212374a(pVar3.f153738e, message.what);
                                return true;
                            case SmEvents.EVENT_NT:
                                break;
                            default:
                                return super.mo212286a(message);
                        }
                    }
                }
                jVar.mo212335b(this.f153754a);
                C61355p pVar4 = C61355p.this;
                pVar4.mo212374a(pVar4.f153740g, message.what);
                return true;
            }
            jVar.mo212335b(this.f153754a);
            C61355p pVar5 = C61355p.this;
            pVar5.mo212374a(pVar5.f153737d, message.what);
            return true;
        }
    }

    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.p$e */
    public class C61360e extends C61356a {
        @Override // com.ss.android.vc.meeting.framework.statemachine.State, com.ss.android.vc.meeting.framework.statemachine.C61355p.C61356a, com.ss.android.vc.meeting.framework.statemachine.AbstractC61338d
        /* renamed from: a */
        public String mo212285a() {
            return "OnTheCallState";
        }

        public C61360e() {
            super(4, StatusNode.OnTheCall);
        }

        @Override // com.ss.android.vc.meeting.framework.statemachine.State, com.ss.android.vc.meeting.framework.statemachine.C61355p.C61356a
        /* renamed from: a */
        public boolean mo212286a(Message message) {
            C61344j jVar = (C61344j) message.obj;
            int i = message.what;
            if (!(i == 99 || i == 101 || i == 103 || i == 111 || i == 203 || i == 205 || i == 210)) {
                switch (i) {
                    case SmEvents.EVENT_FT:
                    case SmEvents.EVENT_HEARTBEAT_INVALID:
                    case SmEvents.EVENT_MEETING_LICENSE_TIME_OUT:
                    case SmEvents.EVENT_LOCAL_BUSY_FORCE_END_LAST:
                    case SmEvents.EVENT_AUTO_END:
                        break;
                    default:
                        return super.mo212286a(message);
                }
            }
            jVar.mo212335b(this.f153754a);
            C61355p pVar = C61355p.this;
            pVar.mo212374a(pVar.f153740g, message.what);
            return true;
        }
    }

    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.p$f */
    public class C61361f extends C61356a {
        @Override // com.ss.android.vc.meeting.framework.statemachine.State, com.ss.android.vc.meeting.framework.statemachine.C61355p.C61356a, com.ss.android.vc.meeting.framework.statemachine.AbstractC61338d
        /* renamed from: a */
        public String mo212285a() {
            return "RingingState";
        }

        public C61361f() {
            super(3, StatusNode.Ringing);
        }

        @Override // com.ss.android.vc.meeting.framework.statemachine.State, com.ss.android.vc.meeting.framework.statemachine.C61355p.C61356a
        /* renamed from: a */
        public boolean mo212286a(Message message) {
            C61344j jVar = (C61344j) message.obj;
            int i = message.what;
            if (!(i == 101 || i == 114)) {
                if (i == 120) {
                    jVar.mo212335b(this.f153754a);
                    C61355p pVar = C61355p.this;
                    pVar.mo212374a(pVar.f153739f, message.what);
                    return true;
                } else if (!(i == 206 || i == 214 || i == 217)) {
                    if (i != 110) {
                        if (i != 111) {
                            if (i != 144) {
                                if (i != 145) {
                                    return super.mo212286a(message);
                                }
                            }
                        }
                    }
                    jVar.mo212335b(this.f153754a);
                    C61355p pVar2 = C61355p.this;
                    pVar2.mo212374a(pVar2.f153738e, message.what);
                    return true;
                }
            }
            jVar.mo212335b(this.f153754a);
            C61355p pVar3 = C61355p.this;
            pVar3.mo212374a(pVar3.f153740g, message.what);
            return true;
        }
    }

    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.p$g */
    public class C61362g extends C61356a {
        @Override // com.ss.android.vc.meeting.framework.statemachine.State, com.ss.android.vc.meeting.framework.statemachine.C61355p.C61356a, com.ss.android.vc.meeting.framework.statemachine.AbstractC61338d
        /* renamed from: a */
        public String mo212285a() {
            return "WaitingState";
        }

        public C61362g() {
            super(6, StatusNode.Waiting);
        }

        @Override // com.ss.android.vc.meeting.framework.statemachine.State, com.ss.android.vc.meeting.framework.statemachine.C61355p.C61356a
        /* renamed from: a */
        public boolean mo212286a(Message message) {
            C61344j jVar = (C61344j) message.obj;
            int i = message.what;
            if (i == 110) {
                jVar.mo212335b(this.f153754a);
                C61355p pVar = C61355p.this;
                pVar.mo212374a(pVar.f153738e, message.what);
                return true;
            } else if (i != 111 && i != 203 && i != 205 && i != 217 && i != 214 && i != 215) {
                return super.mo212286a(message);
            } else {
                jVar.mo212335b(this.f153754a);
                C61355p pVar2 = C61355p.this;
                pVar2.mo212374a(pVar2.f153740g, message.what);
                return true;
            }
        }
    }

    /* renamed from: a */
    public void mo212372a(AbstractC61302j jVar) {
        this.f153751r = jVar;
    }

    /* renamed from: c */
    private void m239078c(C61344j jVar) {
        if (jVar != null && jVar.f153704b != null && TextUtils.isEmpty(jVar.f153704b.getCreatingId())) {
            jVar.f153704b.setCreatingId(this.f153750q.mo212054c());
        }
    }

    /* renamed from: a */
    public void mo212373a(SyncQueuePolicy.SyncAction syncAction) {
        this.f153744k.mo212293a(syncAction);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo212377b(C61344j jVar) {
        String str;
        if (!this.f153745l.mo212312a(jVar)) {
            AbstractC61338d a = mo212345a();
            StringBuilder sb = new StringBuilder();
            sb.append(mo212382j());
            sb.append("[sendMessageReally] event=");
            sb.append(C61340f.m238967a(jVar.f153703a));
            sb.append(",currentState=");
            if (a == null) {
                str = "null";
            } else {
                str = a.mo212285a();
            }
            sb.append(str);
            C60871a.m236611b("VideoChatStateMachine", sb.toString());
            super.mo212351b(jVar.f153703a, jVar);
        }
    }

    public C61355p(AbstractC61294b bVar) {
        super("VideoChatStateMachine");
        C61359d dVar = new C61359d();
        this.f153743j = dVar;
        C61361f fVar = new C61361f();
        this.f153736c = fVar;
        C61357b bVar2 = new C61357b();
        this.f153737d = bVar2;
        C61360e eVar = new C61360e();
        this.f153738e = eVar;
        C61362g gVar = new C61362g();
        this.f153739f = gVar;
        C61358c cVar = new C61358c();
        this.f153740g = cVar;
        this.f153750q = bVar;
        this.f153742i = C61266a.m238332a().mo210469c();
        mo212371a(this.f153753t);
        mo212347a((State) dVar);
        mo212347a((State) fVar);
        mo212347a((State) bVar2);
        mo212347a((State) eVar);
        mo212347a((State) gVar);
        mo212347a((State) cVar);
        mo212353b(dVar);
    }

    /* renamed from: a */
    public final void mo212375a(C61344j jVar) {
        m239078c(jVar);
        this.f153747n.mo211939b(jVar.f153704b);
        this.f153744k.mo212294a(jVar);
    }

    /* renamed from: a */
    private void m239076a(AbstractC61338d dVar, AbstractC61338d dVar2) {
        synchronized (this.f153749p) {
            this.f153749p[0] = C61283f.m238435a(dVar);
            this.f153749p[1] = C61283f.m238435a(dVar2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m239077b(VideoChat videoChat, StatusNode statusNode) {
        synchronized (this.f153748o) {
            if (this.f153748o.size() > 0) {
                List<StatusNode> list = this.f153748o;
                if (list.get(list.size() - 1) == statusNode) {
                    return;
                }
            }
            this.f153748o.add(statusNode);
            m239076a(mo212345a(), (AbstractC61338d) null);
        }
    }

    /* renamed from: a */
    public void mo212369a(VideoChat videoChat, StatusNode statusNode) {
        for (AbstractC61288e eVar : this.f153752s) {
            eVar.meetingStateChanged(videoChat, statusNode);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo212374a(AbstractC61338d dVar, int i) {
        super.mo212348a(dVar);
        this.f153746m.mo211948a(mo212378f(), mo212345a(), dVar);
        m239076a(mo212345a(), dVar);
        AbstractC61302j jVar = this.f153751r;
        if (jVar != null) {
            jVar.onTransform(mo212379g(), dVar.mo212287b(), i);
        }
    }
}
