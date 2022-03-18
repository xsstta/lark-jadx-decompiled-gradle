package com.ss.android.lark.voip.service.impl.app;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.voip.service.impl.C58151d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;

/* renamed from: com.ss.android.lark.voip.service.impl.app.h */
public class C58067h {

    /* renamed from: a */
    public HandlerC58071c f142825a;

    /* renamed from: b */
    public HandlerThread f142826b;

    /* renamed from: c */
    private String f142827c;

    /* renamed from: a */
    public static HandlerThread m225228a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo196850a(Message message) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo196855b(int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo196856b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo196858b(Message message) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo196862c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo196866d(Message message) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo196869e(Message message) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo196872f(Message message) {
        return "";
    }

    /* renamed from: d */
    public final String mo196864d() {
        return this.f142827c;
    }

    /* renamed from: a */
    public void mo196853a(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println(mo196864d() + ":");
        printWriter.println(" total records=" + mo196870f());
        for (int i = 0; i < mo196867e(); i++) {
            printWriter.println(" rec[" + i + "]: " + mo196847a(i).toString());
            printWriter.flush();
        }
        printWriter.println("curState=" + mo196846a().mo196785a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo196854a(String str, String str2) {
        C58151d.m225578a("state_machine", "state_machine", str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.voip.service.impl.app.h$c */
    public static class HandlerC58071c extends Handler {

        /* renamed from: i */
        private static final Object f142840i = new Object();

        /* renamed from: a */
        public boolean f142841a;

        /* renamed from: b */
        public C58070b f142842b;

        /* renamed from: c */
        public C58074c[] f142843c;

        /* renamed from: d */
        public int f142844d;

        /* renamed from: e */
        public C58072a f142845e;

        /* renamed from: f */
        public C58067h f142846f;

        /* renamed from: g */
        public C58066g f142847g;

        /* renamed from: h */
        public ArrayList<Message> f142848h;

        /* renamed from: j */
        private boolean f142849j;

        /* renamed from: k */
        private Message f142850k;

        /* renamed from: l */
        private boolean f142851l;

        /* renamed from: m */
        private C58074c[] f142852m;

        /* renamed from: n */
        private int f142853n;

        /* renamed from: o */
        private C58073b f142854o;

        /* renamed from: p */
        private HashMap<C58066g, C58074c> f142855p;

        /* renamed from: q */
        private C58066g f142856q;

        /* renamed from: a */
        public final void mo196886a(C58066g gVar) {
            if (this.f142841a) {
                this.f142846f.mo196854a("initial state " + gVar.mo196785a(), "[StateMachine] setInitialState: initialState=" + gVar.mo196785a());
            }
            this.f142856q = gVar;
        }

        /* renamed from: b */
        public final AbstractC58040c mo196888b() {
            return this.f142843c[this.f142844d].f142859a;
        }

        /* renamed from: e */
        private final int m225273e() {
            int i = this.f142844d + 1;
            int i2 = i;
            for (int i3 = this.f142853n - 1; i3 >= 0; i3--) {
                this.f142843c[i2] = this.f142852m[i3];
                i2++;
            }
            this.f142844d = i2 - 1;
            return i;
        }

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.lark.voip.service.impl.app.h$c$c */
        public class C58074c {

            /* renamed from: a */
            C58066g f142859a;

            /* renamed from: b */
            C58074c f142860b;

            /* renamed from: c */
            boolean f142861c;

            public String toString() {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append("state=");
                sb.append(this.f142859a.mo196785a());
                sb.append(",active=");
                sb.append(this.f142861c);
                sb.append(",parent=");
                C58074c cVar = this.f142860b;
                if (cVar == null) {
                    str = "null";
                } else {
                    str = cVar.f142859a.mo196785a();
                }
                sb.append(str);
                return sb.toString();
            }

            private C58074c() {
            }
        }

        /* renamed from: c */
        private final void m225271c() {
            if (this.f142846f.f142826b != null) {
                getLooper().quit();
                this.f142846f.f142826b = null;
            }
            this.f142846f.f142825a = null;
            this.f142846f = null;
            this.f142850k = null;
            this.f142842b.mo196882d();
            this.f142843c = null;
            this.f142852m = null;
            this.f142855p.clear();
            this.f142856q = null;
            this.f142847g = null;
            this.f142848h.clear();
            this.f142849j = true;
        }

        /* renamed from: d */
        private final void m225272d() {
            for (int size = this.f142848h.size() - 1; size >= 0; size--) {
                Message message = this.f142848h.get(size);
                if (this.f142841a) {
                    this.f142846f.mo196854a("move deferred msg " + message.what, "[StateMachine] moveDeferredMessageAtFrontOfQueue; what=" + message.what);
                }
                sendMessageAtFrontOfQueue(message);
            }
            this.f142848h.clear();
        }

        /* renamed from: f */
        private final void m225274f() {
            if (this.f142841a) {
                C58067h hVar = this.f142846f;
                hVar.mo196854a("setup initial state stack", "[StateMachine] setupInitialStateStack: E mInitialState=" + this.f142856q.mo196785a());
            }
            C58074c cVar = this.f142855p.get(this.f142856q);
            int i = 0;
            while (true) {
                this.f142853n = i;
                if (cVar != null) {
                    this.f142852m[this.f142853n] = cVar;
                    cVar = cVar.f142860b;
                    i = this.f142853n + 1;
                } else {
                    this.f142844d = -1;
                    m225273e();
                    return;
                }
            }
        }

        /* renamed from: a */
        public final void mo196884a() {
            if (this.f142841a) {
                this.f142846f.mo196854a("construction complete", "[StateMachine] completeConstruction: E");
            }
            int i = 0;
            for (C58074c cVar : this.f142855p.values()) {
                int i2 = 0;
                while (cVar != null) {
                    cVar = cVar.f142860b;
                    i2++;
                }
                if (i < i2) {
                    i = i2;
                }
            }
            if (this.f142841a) {
                this.f142846f.mo196854a("max depth = " + i, "[StateMachine] completeConstruction: maxDepth=" + i);
            }
            this.f142843c = new C58074c[i];
            this.f142852m = new C58074c[i];
            m225274f();
            sendMessageAtFrontOfQueue(obtainMessage(-2, f142840i));
        }

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.lark.voip.service.impl.app.h$c$a */
        public class C58072a extends C58066g {
            private C58072a() {
            }

            @Override // com.ss.android.lark.voip.service.impl.app.C58066g
            /* renamed from: a */
            public boolean mo196842a(Message message) {
                HandlerC58071c.this.f142846f.mo196866d(message);
                return true;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.lark.voip.service.impl.app.h$c$b */
        public class C58073b extends C58066g {
            @Override // com.ss.android.lark.voip.service.impl.app.C58066g
            /* renamed from: a */
            public boolean mo196842a(Message message) {
                return false;
            }

            private C58073b() {
            }
        }

        /* renamed from: a */
        public final boolean mo196887a(Message message) {
            if (message.what == -1 && message.obj == f142840i) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private final C58074c m225270b(C58066g gVar) {
            this.f142853n = 0;
            C58074c cVar = this.f142855p.get(gVar);
            do {
                C58074c[] cVarArr = this.f142852m;
                int i = this.f142853n;
                this.f142853n = i + 1;
                cVarArr[i] = cVar;
                cVar = cVar.f142860b;
                if (cVar == null) {
                    break;
                }
            } while (!cVar.f142861c);
            return cVar;
        }

        /* renamed from: a */
        public final void mo196885a(AbstractC58040c cVar) {
            this.f142847g = (C58066g) cVar;
            if (this.f142841a) {
                this.f142846f.mo196854a("transition to " + this.f142847g.mo196785a(), "[StateMachine] transitionTo: destState=" + this.f142847g.mo196785a());
            }
        }

        /* renamed from: a */
        private final void m225266a(int i) {
            while (i <= this.f142844d) {
                if (this.f142841a) {
                    this.f142846f.mo196854a("enter " + this.f142843c[i].f142859a.mo196785a(), "[StateMachine] invokeEnterMethods: " + this.f142843c[i].f142859a.mo196785a());
                }
                this.f142843c[i].f142859a.mo196843b();
                this.f142843c[i].f142861c = true;
                i++;
            }
        }

        /* renamed from: b */
        private final C58066g m225269b(Message message) {
            C58074c cVar = this.f142843c[this.f142844d];
            if (this.f142841a) {
                this.f142846f.mo196854a("process msg: " + cVar.f142859a.mo196785a(), "[StateMachine] processMsg: " + cVar.f142859a.mo196785a());
            }
            if (mo196887a(message)) {
                mo196885a((AbstractC58040c) this.f142854o);
            } else {
                while (true) {
                    if (cVar.f142859a.mo196842a(message)) {
                        break;
                    }
                    cVar = cVar.f142860b;
                    if (cVar == null) {
                        this.f142846f.mo196863c(message);
                        break;
                    } else if (this.f142841a) {
                        this.f142846f.mo196854a("process msg: " + cVar.f142859a.mo196785a(), "[StateMachine] processMsg: " + cVar.f142859a.mo196785a());
                    }
                }
            }
            if (cVar != null) {
                return cVar.f142859a;
            }
            return null;
        }

        public final void handleMessage(Message message) {
            String str;
            if (!this.f142849j) {
                if (!(this.f142846f == null || message.what == -2 || message.what == -1)) {
                    this.f142846f.mo196850a(message);
                }
                if (this.f142841a) {
                    this.f142846f.mo196854a("handle message " + this.f142846f.mo196871f(message.what), "handleMessage: msg = " + message.what + ", desc = " + this.f142846f.mo196871f(message.what));
                }
                this.f142850k = message;
                C58066g gVar = null;
                boolean z = this.f142851l;
                if (z) {
                    gVar = m225269b(message);
                } else if (!z && message.what == -2 && this.f142850k.obj == f142840i) {
                    this.f142851l = true;
                    m225266a(0);
                } else {
                    this.f142846f.mo196860b("start method is not called", "handleMessage: The start method not called, received msg " + message + " and throw RuntimeException");
                    throw new RuntimeException("StateMachine.handleMessage: The start method not called, received msg: " + message);
                }
                m225267a(gVar, message);
                if (!this.f142841a || this.f142846f == null) {
                    C58067h hVar = this.f142846f;
                    StringBuilder sb = new StringBuilder();
                    sb.append("handleMessage: ");
                    String str2 = "";
                    if (!this.f142841a) {
                        str = "mDbg is false";
                    } else {
                        str = str2;
                    }
                    sb.append(str);
                    sb.append(" ");
                    if (this.f142846f == null) {
                        str2 = "mSm is null";
                    }
                    sb.append(str2);
                    hVar.mo196860b("params error", sb.toString());
                }
                if (this.f142846f != null && message.what != -2 && message.what != -1) {
                    this.f142846f.mo196858b(message);
                }
            }
        }

        /* renamed from: a */
        private final void m225268a(C58074c cVar) {
            while (true) {
                int i = this.f142844d;
                if (i >= 0) {
                    C58074c[] cVarArr = this.f142843c;
                    if (cVarArr[i] != cVar) {
                        C58066g gVar = cVarArr[i].f142859a;
                        if (this.f142841a) {
                            this.f142846f.mo196854a("exit " + gVar.mo196785a(), "[StateMachine] invokeExitMethods: " + gVar.mo196785a());
                        }
                        gVar.mo196844c();
                        this.f142843c[this.f142844d].f142861c = false;
                        this.f142844d--;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        private HandlerC58071c(Looper looper, C58067h hVar) {
            super(looper);
            this.f142841a = true;
            this.f142842b = new C58070b();
            this.f142844d = -1;
            this.f142845e = new C58072a();
            this.f142854o = new C58073b();
            this.f142855p = new HashMap<>();
            this.f142848h = new ArrayList<>();
            this.f142846f = hVar;
            mo196883a(this.f142845e, (C58066g) null);
            mo196883a(this.f142854o, (C58066g) null);
        }

        /* renamed from: a */
        private void m225267a(C58066g gVar, Message message) {
            boolean z;
            C58066g gVar2 = this.f142843c[this.f142844d].f142859a;
            if (!this.f142846f.mo196869e(this.f142850k) || message.obj == f142840i) {
                z = false;
            } else {
                z = true;
            }
            if (this.f142842b.mo196879a()) {
                if (this.f142847g != null) {
                    C58070b bVar = this.f142842b;
                    C58067h hVar = this.f142846f;
                    Message message2 = this.f142850k;
                    bVar.mo196878a(hVar, message2, hVar.mo196872f(message2), gVar, gVar2, this.f142847g);
                }
            } else if (z) {
                C58070b bVar2 = this.f142842b;
                C58067h hVar2 = this.f142846f;
                Message message3 = this.f142850k;
                bVar2.mo196878a(hVar2, message3, hVar2.mo196872f(message3), gVar, gVar2, this.f142847g);
            }
            C58066g gVar3 = this.f142847g;
            if (gVar3 != null) {
                while (true) {
                    m225268a(m225270b(gVar3));
                    m225266a(m225273e());
                    m225272d();
                    C58066g gVar4 = this.f142847g;
                    if (gVar3 == gVar4) {
                        break;
                    }
                    gVar3 = gVar4;
                }
                this.f142847g = null;
            }
            if (gVar3 == null) {
                return;
            }
            if (gVar3 == this.f142854o) {
                this.f142846f.mo196862c();
                m225271c();
            } else if (gVar3 == this.f142845e) {
                this.f142846f.mo196856b();
            }
        }

        /* renamed from: a */
        public final C58074c mo196883a(C58066g gVar, C58066g gVar2) {
            C58074c cVar;
            String str;
            if (this.f142841a) {
                C58067h hVar = this.f142846f;
                String str2 = "add state " + gVar.mo196785a();
                StringBuilder sb = new StringBuilder();
                sb.append("[StateMachine] addStateInternal: E state = ");
                sb.append(gVar.mo196785a());
                sb.append(", parent = ");
                if (gVar2 == null) {
                    str = "";
                } else {
                    str = gVar2.mo196785a();
                }
                sb.append(str);
                hVar.mo196854a(str2, sb.toString());
            }
            if (gVar2 != null) {
                cVar = this.f142855p.get(gVar2);
                if (cVar == null) {
                    cVar = mo196883a(gVar2, (C58066g) null);
                }
            } else {
                cVar = null;
            }
            C58074c cVar2 = this.f142855p.get(gVar);
            if (cVar2 == null) {
                cVar2 = new C58074c();
                this.f142855p.put(gVar, cVar2);
            }
            if (cVar2.f142860b == null || cVar2.f142860b == cVar) {
                cVar2.f142859a = gVar;
                cVar2.f142860b = cVar;
                cVar2.f142861c = false;
                if (this.f142841a) {
                    this.f142846f.mo196854a("add internal state", "[StateMachine] addStateInternal: X stateInfo: " + cVar2);
                }
                return cVar2;
            }
            throw new RuntimeException("state already added");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.voip.service.impl.app.h$b */
    public static class C58070b {

        /* renamed from: a */
        public Vector<C58069a> f142835a;

        /* renamed from: b */
        private int f142836b;

        /* renamed from: c */
        private int f142837c;

        /* renamed from: d */
        private int f142838d;

        /* renamed from: e */
        private boolean f142839e;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized boolean mo196879a() {
            return this.f142839e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized int mo196881c() {
            return this.f142838d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized int mo196880b() {
            return this.f142835a.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public synchronized void mo196882d() {
            this.f142835a.clear();
        }

        private C58070b() {
            this.f142835a = new Vector<>();
            this.f142836b = 20;
            this.f142837c = 0;
            this.f142838d = 0;
            this.f142839e = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C58069a mo196877a(int i) {
            int i2 = this.f142837c + i;
            int i3 = this.f142836b;
            if (i2 >= i3) {
                i2 -= i3;
            }
            if (i2 >= mo196880b()) {
                return null;
            }
            return this.f142835a.get(i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo196878a(C58067h hVar, Message message, String str, AbstractC58040c cVar, AbstractC58040c cVar2, AbstractC58040c cVar3) {
            this.f142838d++;
            if (this.f142835a.size() < this.f142836b) {
                this.f142835a.add(new C58069a(hVar, message, str, cVar, cVar2, cVar3));
            } else {
                C58069a aVar = this.f142835a.get(this.f142837c);
                int i = this.f142837c + 1;
                this.f142837c = i;
                if (i >= this.f142836b) {
                    this.f142837c = 0;
                }
                aVar.mo196875a(hVar, message, str, cVar, cVar2, cVar3);
            }
        }
    }

    /* renamed from: e */
    public final int mo196867e() {
        HandlerC58071c cVar = this.f142825a;
        if (cVar == null) {
            return 0;
        }
        return cVar.f142842b.mo196880b();
    }

    /* renamed from: f */
    public final int mo196870f() {
        HandlerC58071c cVar = this.f142825a;
        if (cVar == null) {
            return 0;
        }
        return cVar.f142842b.mo196881c();
    }

    /* renamed from: g */
    public void mo196873g() {
        HandlerC58071c cVar = this.f142825a;
        if (cVar != null) {
            cVar.mo196884a();
        }
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        mo196853a((FileDescriptor) null, printWriter, (String[]) null);
        printWriter.flush();
        printWriter.close();
        return stringWriter.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AbstractC58040c mo196846a() {
        HandlerC58071c cVar = this.f142825a;
        if (cVar == null) {
            return null;
        }
        return cVar.mo196888b();
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.app.h$a */
    public static class C58069a {

        /* renamed from: a */
        private C58067h f142828a;

        /* renamed from: b */
        private long f142829b;

        /* renamed from: c */
        private int f142830c;

        /* renamed from: d */
        private String f142831d;

        /* renamed from: e */
        private AbstractC58040c f142832e;

        /* renamed from: f */
        private AbstractC58040c f142833f;

        /* renamed from: g */
        private AbstractC58040c f142834g;

        public String toString() {
            String str;
            String str2;
            String str3;
            StringBuilder sb = new StringBuilder();
            sb.append("time=");
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(this.f142829b);
            sb.append(String.format("%tm-%td %tH:%tM:%tS.%tL", instance, instance, instance, instance, instance, instance));
            sb.append(" processed=");
            AbstractC58040c cVar = this.f142832e;
            String str4 = "<null>";
            if (cVar == null) {
                str = str4;
            } else {
                str = cVar.mo196785a();
            }
            sb.append(str);
            sb.append(" org=");
            AbstractC58040c cVar2 = this.f142833f;
            if (cVar2 == null) {
                str2 = str4;
            } else {
                str2 = cVar2.mo196785a();
            }
            sb.append(str2);
            sb.append(" dest=");
            AbstractC58040c cVar3 = this.f142834g;
            if (cVar3 != null) {
                str4 = cVar3.mo196785a();
            }
            sb.append(str4);
            sb.append(" what=");
            C58067h hVar = this.f142828a;
            if (hVar != null) {
                str3 = hVar.mo196855b(this.f142830c);
            } else {
                str3 = "";
            }
            if (TextUtils.isEmpty(str3)) {
                sb.append(this.f142830c);
                sb.append("(0x");
                sb.append(Integer.toHexString(this.f142830c));
                sb.append(")");
            } else {
                sb.append(str3);
            }
            if (!TextUtils.isEmpty(this.f142831d)) {
                sb.append(" ");
                sb.append(this.f142831d);
            }
            return sb.toString();
        }

        C58069a(C58067h hVar, Message message, String str, AbstractC58040c cVar, AbstractC58040c cVar2, AbstractC58040c cVar3) {
            mo196875a(hVar, message, str, cVar, cVar2, cVar3);
        }

        /* renamed from: a */
        public void mo196875a(C58067h hVar, Message message, String str, AbstractC58040c cVar, AbstractC58040c cVar2, AbstractC58040c cVar3) {
            int i;
            this.f142828a = hVar;
            this.f142829b = System.currentTimeMillis();
            if (message != null) {
                i = message.what;
            } else {
                i = 0;
            }
            this.f142830c = i;
            this.f142831d = str;
            this.f142832e = cVar;
            this.f142833f = cVar2;
            this.f142834g = cVar3;
        }
    }

    /* renamed from: c */
    public final Message mo196861c(int i) {
        return Message.obtain(this.f142825a, i);
    }

    /* renamed from: d */
    public final void mo196865d(int i) {
        HandlerC58071c cVar = this.f142825a;
        if (cVar != null) {
            cVar.sendMessage(mo196861c(i));
        }
    }

    protected C58067h(String str) {
        HandlerThread a = m225228a(str);
        this.f142826b = a;
        a.start();
        m225229a(str, this.f142826b.getLooper());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo196868e(int i) {
        HandlerC58071c cVar = this.f142825a;
        if (cVar != null) {
            cVar.removeMessages(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo196871f(int i) {
        return "" + i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo196859b(C58066g gVar) {
        this.f142825a.mo196886a(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo196863c(Message message) {
        if (this.f142825a.f142841a) {
            mo196860b("unhandle msg: " + message.what, "[StateMachine] - unhandledMessage: msg.what=" + message.what);
        }
    }

    /* renamed from: a */
    public final C58069a mo196847a(int i) {
        HandlerC58071c cVar = this.f142825a;
        if (cVar == null) {
            return null;
        }
        return cVar.f142842b.mo196877a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo196851a(AbstractC58040c cVar) {
        this.f142825a.mo196885a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo196852a(C58066g gVar) {
        this.f142825a.mo196883a(gVar, (C58066g) null);
    }

    /* renamed from: a */
    public final Message mo196845a(int i, Object obj) {
        return Message.obtain(this.f142825a, i, obj);
    }

    /* renamed from: a */
    private void m225229a(String str, Looper looper) {
        this.f142827c = str;
        this.f142825a = new HandlerC58071c(looper, this);
    }

    /* renamed from: b */
    public final void mo196857b(int i, Object obj) {
        HandlerC58071c cVar = this.f142825a;
        if (cVar != null) {
            cVar.sendMessage(mo196845a(i, obj));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo196860b(String str, String str2) {
        C58151d.m225578a("state_machine", "state_machine", str, str2);
    }

    /* renamed from: a */
    public final void mo196848a(int i, long j) {
        HandlerC58071c cVar = this.f142825a;
        if (cVar != null) {
            cVar.sendMessageDelayed(mo196861c(i), j);
        }
    }

    /* renamed from: a */
    public final void mo196849a(int i, Object obj, long j) {
        HandlerC58071c cVar = this.f142825a;
        if (cVar != null) {
            cVar.sendMessageDelayed(mo196845a(i, obj), j);
        }
    }
}
