package com.ss.android.vc.meeting.framework.statemachine;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.larksuite.framework.thread.HandlerC26164r;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ss.android.vc.meeting.framework.statemachine.n */
public class C61348n {

    /* renamed from: b */
    public static HandlerThread f153713b;

    /* renamed from: a */
    public HandlerC61350a f153714a;

    /* renamed from: c */
    private String f153715c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.n$a */
    public static final class HandlerC61350a extends HandlerC26164r {

        /* renamed from: f */
        private static final Object f153716f = new Object();

        /* renamed from: a */
        public boolean f153717a;

        /* renamed from: b */
        public C61351a f153718b;

        /* renamed from: c */
        public C61348n f153719c;

        /* renamed from: d */
        public ArrayList<Message> f153720d;

        /* renamed from: e */
        private boolean f153721e;

        /* renamed from: g */
        private boolean f153722g;

        /* renamed from: h */
        private C61353c[] f153723h;

        /* renamed from: i */
        private volatile int f153724i;

        /* renamed from: j */
        private C61353c[] f153725j;

        /* renamed from: k */
        private int f153726k;

        /* renamed from: l */
        private C61352b f153727l;

        /* renamed from: m */
        private HashMap<State, C61353c> f153728m;

        /* renamed from: n */
        private State f153729n;

        /* renamed from: o */
        private State f153730o;

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.meeting.framework.statemachine.n$a$b */
        public static class C61352b extends State {
            @Override // com.ss.android.vc.meeting.framework.statemachine.State
            /* renamed from: a */
            public boolean mo212286a(Message message) {
                return false;
            }

            private C61352b() {
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.meeting.framework.statemachine.n$a$c */
        public static class C61353c {

            /* renamed from: a */
            State f153732a;

            /* renamed from: b */
            C61353c f153733b;

            /* renamed from: c */
            boolean f153734c;

            private C61353c() {
            }

            public String toString() {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append("state=");
                sb.append(this.f153732a.mo212285a());
                sb.append(",active=");
                sb.append(this.f153734c);
                sb.append(",parent=");
                C61353c cVar = this.f153733b;
                if (cVar == null) {
                    str = "null";
                } else {
                    str = cVar.f153732a.mo212285a();
                }
                sb.append(str);
                return sb.toString();
            }
        }

        /* renamed from: b */
        public final synchronized AbstractC61338d mo212365b() {
            if (this.f153724i < 0) {
                return null;
            }
            return this.f153723h[this.f153724i].f153732a;
        }

        /* renamed from: c */
        private final void m239049c() {
            if (C61348n.f153713b != null) {
                getLooper().quit();
                C61348n.f153713b = null;
            }
            this.f153719c.f153714a = null;
            this.f153719c = null;
            this.f153723h = null;
            this.f153725j = null;
            this.f153728m.clear();
            this.f153729n = null;
            this.f153730o = null;
            this.f153720d.clear();
            this.f153721e = true;
        }

        /* renamed from: d */
        private final void m239050d() {
            for (int size = this.f153720d.size() - 1; size >= 0; size--) {
                Message message = this.f153720d.get(size);
                if (this.f153717a) {
                    this.f153719c.mo212349a("moveDeferredMessageAtFrontOfQueue; what=" + message.what);
                }
                sendMessageAtFrontOfQueue(message);
            }
            this.f153720d.clear();
        }

        /* renamed from: e */
        private final synchronized int m239051e() {
            int i;
            i = this.f153724i + 1;
            int i2 = i;
            for (int i3 = this.f153726k - 1; i3 >= 0; i3--) {
                if (this.f153717a) {
                    this.f153719c.mo212349a("moveTempStackToStateStack: i=" + i3 + ",j=" + i2);
                }
                this.f153723h[i2] = this.f153725j[i3];
                i2++;
            }
            this.f153724i = i2 - 1;
            if (this.f153717a) {
                this.f153719c.mo212349a("moveTempStackToStateStack: X mStateStackTop=" + this.f153724i + ",startingIndex=" + i + ",Top=" + this.f153723h[this.f153724i].f153732a.mo212285a());
            }
            return i;
        }

        /* renamed from: f */
        private final synchronized void m239052f() {
            if (this.f153717a) {
                this.f153719c.mo212349a("setupInitialStateStack: E mInitialState=" + this.f153729n.mo212285a());
            }
            C61353c cVar = this.f153728m.get(this.f153729n);
            this.f153726k = 0;
            while (cVar != null) {
                this.f153725j[this.f153726k] = cVar;
                cVar = cVar.f153733b;
                this.f153726k++;
            }
            this.f153724i = -1;
            m239051e();
        }

        /* renamed from: a */
        public final void mo212361a() {
            if (this.f153717a) {
                this.f153719c.mo212349a("completeConstruction: E");
            }
            int i = 0;
            for (C61353c cVar : this.f153728m.values()) {
                int i2 = 0;
                while (cVar != null) {
                    cVar = cVar.f153733b;
                    i2++;
                }
                if (i < i2) {
                    i = i2;
                }
            }
            if (this.f153717a) {
                C61348n nVar = this.f153719c;
                nVar.mo212349a("completeConstruction: maxDepth=" + i);
            }
            this.f153723h = new C61353c[i];
            this.f153725j = new C61353c[i];
            m239052f();
            sendMessageAtFrontOfQueue(obtainMessage(-2, f153716f));
            if (this.f153717a) {
                this.f153719c.mo212349a("completeConstruction: X");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.meeting.framework.statemachine.n$a$a */
        public class C61351a extends State {
            private C61351a() {
            }

            @Override // com.ss.android.vc.meeting.framework.statemachine.State
            /* renamed from: a */
            public boolean mo212286a(Message message) {
                HandlerC61350a.this.f153719c.mo212358d(message);
                return true;
            }
        }

        /* renamed from: a */
        public final boolean mo212364a(Message message) {
            if (message.what == -1 && message.obj == f153716f) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private final void m239044a(int i) {
            while (i <= this.f153724i) {
                if (this.f153717a) {
                    C61348n nVar = this.f153719c;
                    nVar.mo212349a("invokeEnterMethods: " + this.f153723h[i].f153732a.mo212285a());
                }
                this.f153723h[i].f153732a.mo212288c();
                this.f153723h[i].f153734c = true;
                i++;
            }
        }

        /* renamed from: b */
        private final State m239047b(Message message) {
            C61353c cVar = this.f153723h[this.f153724i];
            if (this.f153717a) {
                C61348n nVar = this.f153719c;
                nVar.mo212349a("processMsg: " + cVar.f153732a.mo212285a());
            }
            if (mo212364a(message)) {
                mo212363a((AbstractC61338d) this.f153727l);
            } else {
                while (true) {
                    if (cVar.f153732a.mo212286a(message)) {
                        break;
                    }
                    cVar = cVar.f153733b;
                    if (cVar == null) {
                        this.f153719c.mo212356c(message);
                        break;
                    } else if (this.f153717a) {
                        C61348n nVar2 = this.f153719c;
                        nVar2.mo212349a("processMsg: " + cVar.f153732a.mo212285a());
                    }
                }
            }
            if (cVar != null) {
                return cVar.f153732a;
            }
            return null;
        }

        /* renamed from: a */
        private final void m239046a(C61353c cVar) {
            while (this.f153724i >= 0 && this.f153723h[this.f153724i] != cVar) {
                State state = this.f153723h[this.f153724i].f153732a;
                if (this.f153717a) {
                    this.f153719c.mo212349a("invokeExitMethods: " + state.mo212285a());
                }
                state.mo212289d();
                synchronized (this) {
                    this.f153723h[this.f153724i].f153734c = false;
                    this.f153724i--;
                }
            }
        }

        /* renamed from: b */
        private final C61353c m239048b(State state) {
            this.f153726k = 0;
            C61353c cVar = this.f153728m.get(state);
            do {
                C61353c[] cVarArr = this.f153725j;
                int i = this.f153726k;
                this.f153726k = i + 1;
                cVarArr[i] = cVar;
                cVar = cVar.f153733b;
                if (cVar == null) {
                    break;
                }
            } while (!cVar.f153734c);
            if (this.f153717a) {
                C61348n nVar = this.f153719c;
                nVar.mo212349a("setupTempStateStackWithStatesToEnter: X mTempStateStackCount=" + this.f153726k + ",curStateInfo: " + cVar);
            }
            return cVar;
        }

        public final void handleMessage(Message message) {
            C61348n nVar;
            C61348n nVar2;
            if (!this.f153721e) {
                if (!(this.f153719c == null || message.what == -2 || message.what == -1)) {
                    this.f153719c.mo212346a(message);
                }
                if (this.f153717a && (nVar2 = this.f153719c) != null) {
                    nVar2.mo212349a("handleMessage: E msg.what=" + message.what);
                }
                State state = null;
                boolean z = this.f153722g;
                if (z) {
                    state = m239047b(message);
                } else if (!z && message.what == -2 && message.obj == f153716f) {
                    this.f153722g = true;
                    m239044a(0);
                } else {
                    throw new RuntimeException("StateMachine.handleMessage: The start method not called, received msg: " + message);
                }
                m239045a(state, message);
                if (this.f153717a && (nVar = this.f153719c) != null) {
                    nVar.mo212349a("handleMessage: X");
                }
                if (this.f153719c != null && message.what != -2 && message.what != -1) {
                    this.f153719c.mo212352b(message);
                }
            }
        }

        /* renamed from: a */
        public final void mo212362a(State state) {
            if (this.f153717a) {
                C61348n nVar = this.f153719c;
                nVar.mo212349a("setInitialState: initialState=" + state.mo212285a());
            }
            this.f153729n = state;
        }

        /* renamed from: a */
        public final void mo212363a(AbstractC61338d dVar) {
            this.f153730o = (State) dVar;
            if (this.f153717a) {
                C61348n nVar = this.f153719c;
                nVar.mo212349a("transitionTo: destState=" + this.f153730o.mo212285a());
            }
        }

        private HandlerC61350a(Looper looper, C61348n nVar) {
            super(looper);
            this.f153724i = -1;
            this.f153718b = new C61351a();
            this.f153727l = new C61352b();
            this.f153728m = new HashMap<>();
            this.f153720d = new ArrayList<>();
            this.f153719c = nVar;
            mo212360a(this.f153718b, (State) null);
            mo212360a(this.f153727l, (State) null);
        }

        /* renamed from: a */
        private void m239045a(State state, Message message) {
            State state2 = this.f153730o;
            if (state2 != null) {
                while (true) {
                    if (this.f153717a) {
                        this.f153719c.mo212349a("handleMessage: new destination call exit/enter");
                    }
                    m239046a(m239048b(state2));
                    m239044a(m239051e());
                    m239050d();
                    State state3 = this.f153730o;
                    if (state2 == state3) {
                        break;
                    }
                    state2 = state3;
                }
                this.f153730o = null;
            }
            if (state2 == null) {
                return;
            }
            if (state2 == this.f153727l) {
                this.f153719c.mo212355c();
                m239049c();
            } else if (state2 == this.f153718b) {
                this.f153719c.mo212350b();
            }
        }

        /* renamed from: a */
        public final C61353c mo212360a(State state, State state2) {
            C61353c cVar;
            String str;
            if (this.f153717a) {
                C61348n nVar = this.f153719c;
                StringBuilder sb = new StringBuilder();
                sb.append("addStateInternal: E state=");
                sb.append(state.mo212285a());
                sb.append(",parent=");
                if (state2 == null) {
                    str = "";
                } else {
                    str = state2.mo212285a();
                }
                sb.append(str);
                nVar.mo212349a(sb.toString());
            }
            if (state2 != null) {
                cVar = this.f153728m.get(state2);
                if (cVar == null) {
                    cVar = mo212360a(state2, (State) null);
                }
            } else {
                cVar = null;
            }
            C61353c cVar2 = this.f153728m.get(state);
            if (cVar2 == null) {
                cVar2 = new C61353c();
                this.f153728m.put(state, cVar2);
            }
            if (cVar2.f153733b == null || cVar2.f153733b == cVar) {
                cVar2.f153732a = state;
                cVar2.f153733b = cVar;
                cVar2.f153734c = false;
                if (this.f153717a) {
                    this.f153719c.mo212349a("addStateInternal: X stateInfo: " + cVar2);
                }
                return cVar2;
            }
            throw new RuntimeException("state already added");
        }
    }

    /* renamed from: c */
    public static HandlerThread m239027c(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo212346a(Message message) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo212350b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo212352b(Message message) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo212355c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo212358d(Message message) {
    }

    /* renamed from: d */
    public final Handler mo212357d() {
        return this.f153714a;
    }

    static {
        HandlerThread c = m239027c("vc-sm-thread");
        f153713b = c;
        c.start();
    }

    /* renamed from: e */
    public void mo212359e() {
        HandlerC61350a aVar = this.f153714a;
        if (aVar != null) {
            aVar.mo212361a();
        }
    }

    /* renamed from: a */
    public final AbstractC61338d mo212345a() {
        HandlerC61350a aVar = this.f153714a;
        if (aVar == null) {
            return null;
        }
        return aVar.mo212365b();
    }

    protected C61348n(String str) {
        m239026a(str, f153713b.getLooper());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo212353b(State state) {
        this.f153714a.mo212362a(state);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo212347a(State state) {
        this.f153714a.mo212360a(state, (State) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo212354b(String str) {
        C60871a.m236612c(this.f153715c, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo212356c(Message message) {
        if (this.f153714a.f153717a) {
            mo212354b(" - unhandledMessage: msg.what=" + message.what);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo212348a(AbstractC61338d dVar) {
        this.f153714a.mo212363a(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo212349a(String str) {
        C60871a.m236611b(this.f153715c, str);
    }

    /* renamed from: a */
    public final Message mo212344a(int i, Object obj) {
        return Message.obtain(this.f153714a, i, obj);
    }

    /* renamed from: a */
    private void m239026a(String str, Looper looper) {
        this.f153715c = str;
        this.f153714a = new HandlerC61350a(looper, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo212351b(int i, Object obj) {
        HandlerC61350a aVar = this.f153714a;
        if (aVar != null) {
            aVar.sendMessage(mo212344a(i, obj));
        }
    }
}
