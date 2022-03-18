package com.bytedance.ee.util.p698a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;

/* renamed from: com.bytedance.ee.util.a.c */
public class C13585c {

    /* renamed from: a */
    private String f35712a;

    /* renamed from: j */
    public HandlerC13589c f35713j;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo50502d(int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo50503d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo50504d(Message message) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo50506e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo50507e(Message message) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo50509f(Message message) {
        return "";
    }

    /* renamed from: f */
    public final String mo50508f() {
        return this.f35712a;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.util.a.c$c */
    public static class HandlerC13589c extends Handler {

        /* renamed from: h */
        private static final Object f35726h = new Object();

        /* renamed from: a */
        public boolean f35727a;

        /* renamed from: b */
        public C13588b f35728b;

        /* renamed from: c */
        public C13592c[] f35729c;

        /* renamed from: d */
        public int f35730d;

        /* renamed from: e */
        public C13590a f35731e;

        /* renamed from: f */
        public C13585c f35732f;

        /* renamed from: g */
        public C13584b f35733g;

        /* renamed from: i */
        private boolean f35734i;

        /* renamed from: j */
        private Message f35735j;

        /* renamed from: k */
        private boolean f35736k;

        /* renamed from: l */
        private C13592c[] f35737l;

        /* renamed from: m */
        private int f35738m;

        /* renamed from: n */
        private C13591b f35739n;

        /* renamed from: o */
        private HashMap<C13584b, C13592c> f35740o;

        /* renamed from: p */
        private C13584b f35741p;

        /* renamed from: q */
        private ArrayList<Message> f35742q;

        /* renamed from: a */
        public final void mo50528a(C13584b bVar) {
            if (this.f35727a) {
                C13585c cVar = this.f35732f;
                cVar.mo50493a("setInitialState: initialState=" + bVar.mo50486c());
            }
            this.f35741p = bVar;
        }

        /* renamed from: a */
        public final void mo50527a(AbstractC13583a aVar) {
            this.f35733g = (C13584b) aVar;
            if (this.f35727a) {
                C13585c cVar = this.f35732f;
                cVar.mo50493a("transitionTo: destState=" + this.f35733g.mo50486c());
            }
        }

        /* renamed from: b */
        public final AbstractC13583a mo50529b() {
            return this.f35729c[this.f35730d].f35745a;
        }

        /* access modifiers changed from: private */
        /* renamed from: com.bytedance.ee.util.a.c$c$c */
        public class C13592c {

            /* renamed from: a */
            C13584b f35745a;

            /* renamed from: b */
            C13592c f35746b;

            /* renamed from: c */
            boolean f35747c;

            public String toString() {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append("state=");
                sb.append(this.f35745a.mo50486c());
                sb.append(",active=");
                sb.append(this.f35747c);
                sb.append(",parent=");
                C13592c cVar = this.f35746b;
                if (cVar == null) {
                    str = "null";
                } else {
                    str = cVar.f35745a.mo50486c();
                }
                sb.append(str);
                return sb.toString();
            }

            private C13592c() {
            }
        }

        /* renamed from: c */
        private final void m55159c() {
            this.f35732f.f35713j = null;
            this.f35732f = null;
            this.f35735j = null;
            this.f35728b.mo50523d();
            this.f35729c = null;
            this.f35737l = null;
            this.f35740o.clear();
            this.f35741p = null;
            this.f35733g = null;
            this.f35742q.clear();
            this.f35734i = true;
        }

        /* renamed from: d */
        private final void m55160d() {
            for (int size = this.f35742q.size() - 1; size >= 0; size--) {
                Message message = this.f35742q.get(size);
                if (this.f35727a) {
                    this.f35732f.mo50493a("moveDeferredMessageAtFrontOfQueue; what=" + message.what);
                }
                sendMessageAtFrontOfQueue(message);
            }
            this.f35742q.clear();
        }

        /* renamed from: e */
        private final int m55161e() {
            int i = this.f35730d + 1;
            int i2 = i;
            for (int i3 = this.f35738m - 1; i3 >= 0; i3--) {
                if (this.f35727a) {
                    this.f35732f.mo50493a("moveTempStackToStateStack: i=" + i3 + ",j=" + i2);
                }
                this.f35729c[i2] = this.f35737l[i3];
                i2++;
            }
            this.f35730d = i2 - 1;
            if (this.f35727a) {
                this.f35732f.mo50493a("moveTempStackToStateStack: X mStateStackTop=" + this.f35730d + ",startingIndex=" + i + ",Top=" + this.f35729c[this.f35730d].f35745a.mo50486c());
            }
            return i;
        }

        /* renamed from: f */
        private final void m55162f() {
            if (this.f35727a) {
                C13585c cVar = this.f35732f;
                cVar.mo50493a("setupInitialStateStack: E mInitialState=" + this.f35741p.mo50486c());
            }
            C13592c cVar2 = this.f35740o.get(this.f35741p);
            int i = 0;
            while (true) {
                this.f35738m = i;
                if (cVar2 != null) {
                    this.f35737l[this.f35738m] = cVar2;
                    cVar2 = cVar2.f35746b;
                    i = this.f35738m + 1;
                } else {
                    this.f35730d = -1;
                    m55161e();
                    return;
                }
            }
        }

        /* renamed from: a */
        public final void mo50525a() {
            if (this.f35727a) {
                this.f35732f.mo50493a("completeConstruction: E");
            }
            int i = 0;
            for (C13592c cVar : this.f35740o.values()) {
                int i2 = 0;
                while (cVar != null) {
                    cVar = cVar.f35746b;
                    i2++;
                }
                if (i < i2) {
                    i = i2;
                }
            }
            if (this.f35727a) {
                C13585c cVar2 = this.f35732f;
                cVar2.mo50493a("completeConstruction: maxDepth=" + i);
            }
            this.f35729c = new C13592c[i];
            this.f35737l = new C13592c[i];
            m55162f();
            sendMessageAtFrontOfQueue(obtainMessage(-2, f35726h));
            if (this.f35727a) {
                this.f35732f.mo50493a("completeConstruction: X");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: com.bytedance.ee.util.a.c$c$a */
        public class C13590a extends C13584b {
            private C13590a() {
            }

            @Override // com.bytedance.ee.util.p698a.C13584b
            /* renamed from: a */
            public boolean mo33498a(Message message) {
                HandlerC13589c.this.f35732f.mo50504d(message);
                return true;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: com.bytedance.ee.util.a.c$c$b */
        public class C13591b extends C13584b {
            @Override // com.bytedance.ee.util.p698a.C13584b
            /* renamed from: a */
            public boolean mo33498a(Message message) {
                return false;
            }

            private C13591b() {
            }
        }

        /* renamed from: b */
        public final boolean mo50530b(Message message) {
            if (message.what == -1 && message.obj == f35726h) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private final void m55154a(int i) {
            while (i <= this.f35730d) {
                if (this.f35727a) {
                    C13585c cVar = this.f35732f;
                    cVar.mo50493a("invokeEnterMethods: " + this.f35729c[i].f35745a.mo50486c());
                }
                this.f35729c[i].f35745a.mo33497a();
                this.f35729c[i].f35747c = true;
                i++;
            }
        }

        /* renamed from: a */
        private final void m55156a(C13592c cVar) {
            while (true) {
                int i = this.f35730d;
                if (i >= 0) {
                    C13592c[] cVarArr = this.f35729c;
                    if (cVarArr[i] != cVar) {
                        C13584b bVar = cVarArr[i].f35745a;
                        if (this.f35727a) {
                            this.f35732f.mo50493a("invokeExitMethods: " + bVar.mo50486c());
                        }
                        bVar.mo33499b();
                        this.f35729c[this.f35730d].f35747c = false;
                        this.f35730d--;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        private final C13592c m55157b(C13584b bVar) {
            this.f35738m = 0;
            C13592c cVar = this.f35740o.get(bVar);
            do {
                C13592c[] cVarArr = this.f35737l;
                int i = this.f35738m;
                this.f35738m = i + 1;
                cVarArr[i] = cVar;
                cVar = cVar.f35746b;
                if (cVar == null) {
                    break;
                }
            } while (!cVar.f35747c);
            if (this.f35727a) {
                C13585c cVar2 = this.f35732f;
                cVar2.mo50493a("setupTempStateStackWithStatesToEnter: X mTempStateStackCount=" + this.f35738m + ",curStateInfo: " + cVar);
            }
            return cVar;
        }

        /* renamed from: c */
        private final C13584b m55158c(Message message) {
            C13592c cVar = this.f35729c[this.f35730d];
            if (this.f35727a) {
                C13585c cVar2 = this.f35732f;
                cVar2.mo50493a("processMsg: " + cVar.f35745a.mo50486c());
            }
            if (mo50530b(message)) {
                mo50527a((AbstractC13583a) this.f35739n);
            } else {
                while (true) {
                    if (cVar.f35745a.mo33498a(message)) {
                        break;
                    }
                    cVar = cVar.f35746b;
                    if (cVar == null) {
                        this.f35732f.mo50501c(message);
                        break;
                    } else if (this.f35727a) {
                        C13585c cVar3 = this.f35732f;
                        cVar3.mo50493a("processMsg: " + cVar.f35745a.mo50486c());
                    }
                }
            }
            if (cVar != null) {
                return cVar.f35745a;
            }
            return null;
        }

        public final void handleMessage(Message message) {
            C13585c cVar;
            if (!this.f35734i) {
                if (this.f35727a) {
                    C13585c cVar2 = this.f35732f;
                    cVar2.mo50493a("handleMessage: E msg.what=" + message.what);
                }
                this.f35735j = message;
                C13584b bVar = null;
                boolean z = this.f35736k;
                if (z) {
                    bVar = m55158c(message);
                } else if (!z && message.what == -2 && this.f35735j.obj == f35726h) {
                    this.f35736k = true;
                    m55154a(0);
                } else {
                    throw new RuntimeException("StateMachine.handleMessage: The start method not called, received msg: " + message);
                }
                m55155a(bVar, message);
                if (this.f35727a && (cVar = this.f35732f) != null) {
                    cVar.mo50493a("handleMessage: X");
                }
            }
        }

        /* renamed from: a */
        public final void mo50526a(Message message) {
            if (this.f35727a) {
                C13585c cVar = this.f35732f;
                cVar.mo50493a("deferMessage: msg=" + message.what);
            }
            Message obtainMessage = obtainMessage();
            obtainMessage.copyFrom(message);
            this.f35742q.add(obtainMessage);
        }

        private HandlerC13589c(Looper looper, C13585c cVar) {
            super(looper);
            this.f35728b = new C13588b();
            this.f35730d = -1;
            this.f35731e = new C13590a();
            this.f35739n = new C13591b();
            this.f35740o = new HashMap<>();
            this.f35742q = new ArrayList<>();
            this.f35732f = cVar;
            mo50524a(this.f35731e, (C13584b) null);
            mo50524a(this.f35739n, (C13584b) null);
        }

        /* renamed from: a */
        private void m55155a(C13584b bVar, Message message) {
            boolean z;
            C13584b bVar2 = this.f35729c[this.f35730d].f35745a;
            if (!this.f35732f.mo50507e(this.f35735j) || message.obj == f35726h) {
                z = false;
            } else {
                z = true;
            }
            if (this.f35728b.mo50520a()) {
                if (this.f35733g != null) {
                    C13588b bVar3 = this.f35728b;
                    C13585c cVar = this.f35732f;
                    Message message2 = this.f35735j;
                    bVar3.mo50519a(cVar, message2, cVar.mo50509f(message2), bVar, bVar2, this.f35733g);
                }
            } else if (z) {
                C13588b bVar4 = this.f35728b;
                C13585c cVar2 = this.f35732f;
                Message message3 = this.f35735j;
                bVar4.mo50519a(cVar2, message3, cVar2.mo50509f(message3), bVar, bVar2, this.f35733g);
            }
            C13584b bVar5 = this.f35733g;
            if (bVar5 != null) {
                while (true) {
                    if (this.f35727a) {
                        this.f35732f.mo50493a("handleMessage: new destination call exit/enter");
                    }
                    m55156a(m55157b(bVar5));
                    m55154a(m55161e());
                    m55160d();
                    C13584b bVar6 = this.f35733g;
                    if (bVar5 == bVar6) {
                        break;
                    }
                    bVar5 = bVar6;
                }
                this.f35733g = null;
            }
            if (bVar5 == null) {
                return;
            }
            if (bVar5 == this.f35739n) {
                this.f35732f.mo50506e();
                m55159c();
            } else if (bVar5 == this.f35731e) {
                this.f35732f.mo50503d();
            }
        }

        /* renamed from: a */
        public final C13592c mo50524a(C13584b bVar, C13584b bVar2) {
            C13592c cVar;
            String str;
            if (this.f35727a) {
                C13585c cVar2 = this.f35732f;
                StringBuilder sb = new StringBuilder();
                sb.append("addStateInternal: E state=");
                sb.append(bVar.mo50486c());
                sb.append(",parent=");
                if (bVar2 == null) {
                    str = "";
                } else {
                    str = bVar2.mo50486c();
                }
                sb.append(str);
                cVar2.mo50493a(sb.toString());
            }
            if (bVar2 != null) {
                cVar = this.f35740o.get(bVar2);
                if (cVar == null) {
                    cVar = mo50524a(bVar2, (C13584b) null);
                }
            } else {
                cVar = null;
            }
            C13592c cVar3 = this.f35740o.get(bVar);
            if (cVar3 == null) {
                cVar3 = new C13592c();
                this.f35740o.put(bVar, cVar3);
            }
            if (cVar3.f35746b == null || cVar3.f35746b == cVar) {
                cVar3.f35745a = bVar;
                cVar3.f35746b = cVar;
                cVar3.f35747c = false;
                if (this.f35727a) {
                    this.f35732f.mo50493a("addStateInternal: X stateInfo: " + cVar3);
                }
                return cVar3;
            }
            throw new RuntimeException("state already added");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.util.a.c$b */
    public static class C13588b {

        /* renamed from: a */
        public Vector<C13587a> f35721a;

        /* renamed from: b */
        private int f35722b;

        /* renamed from: c */
        private int f35723c;

        /* renamed from: d */
        private int f35724d;

        /* renamed from: e */
        private boolean f35725e;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized boolean mo50520a() {
            return this.f35725e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized int mo50522c() {
            return this.f35724d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized int mo50521b() {
            return this.f35721a.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public synchronized void mo50523d() {
            this.f35721a.clear();
        }

        private C13588b() {
            this.f35721a = new Vector<>();
            this.f35722b = 20;
            this.f35723c = 0;
            this.f35724d = 0;
            this.f35725e = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C13587a mo50518a(int i) {
            int i2 = this.f35723c + i;
            int i3 = this.f35722b;
            if (i2 >= i3) {
                i2 -= i3;
            }
            if (i2 >= mo50521b()) {
                return null;
            }
            return this.f35721a.get(i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo50519a(C13585c cVar, Message message, String str, AbstractC13583a aVar, AbstractC13583a aVar2, AbstractC13583a aVar3) {
            this.f35724d++;
            if (this.f35721a.size() < this.f35722b) {
                this.f35721a.add(new C13587a(cVar, message, str, aVar, aVar2, aVar3));
            } else {
                C13587a aVar4 = this.f35721a.get(this.f35723c);
                int i = this.f35723c + 1;
                this.f35723c = i;
                if (i >= this.f35722b) {
                    this.f35723c = 0;
                }
                aVar4.mo50516a(cVar, message, str, aVar, aVar2, aVar3);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final AbstractC13583a mo50499c() {
        HandlerC13589c cVar = this.f35713j;
        if (cVar == null) {
            return null;
        }
        return cVar.mo50529b();
    }

    /* renamed from: g */
    public final int mo50511g() {
        HandlerC13589c cVar = this.f35713j;
        if (cVar == null) {
            return 0;
        }
        return cVar.f35728b.mo50521b();
    }

    /* renamed from: h */
    public final int mo50513h() {
        HandlerC13589c cVar = this.f35713j;
        if (cVar == null) {
            return 0;
        }
        return cVar.f35728b.mo50522c();
    }

    /* renamed from: i */
    public void mo50514i() {
        HandlerC13589c cVar = this.f35713j;
        if (cVar != null) {
            cVar.mo50525a();
        }
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        mo50492a(null, printWriter, null);
        printWriter.flush();
        printWriter.close();
        return stringWriter.toString();
    }

    /* renamed from: com.bytedance.ee.util.a.c$a */
    public static class C13587a {

        /* renamed from: a */
        private C13585c f35714a;

        /* renamed from: b */
        private long f35715b;

        /* renamed from: c */
        private int f35716c;

        /* renamed from: d */
        private String f35717d;

        /* renamed from: e */
        private AbstractC13583a f35718e;

        /* renamed from: f */
        private AbstractC13583a f35719f;

        /* renamed from: g */
        private AbstractC13583a f35720g;

        public String toString() {
            String str;
            String str2;
            String str3;
            StringBuilder sb = new StringBuilder();
            sb.append("time=");
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(this.f35715b);
            sb.append(String.format("%tm-%td %tH:%tM:%tS.%tL", instance, instance, instance, instance, instance, instance));
            sb.append(" processed=");
            AbstractC13583a aVar = this.f35718e;
            String str4 = "<null>";
            if (aVar == null) {
                str = str4;
            } else {
                str = aVar.mo50486c();
            }
            sb.append(str);
            sb.append(" org=");
            AbstractC13583a aVar2 = this.f35719f;
            if (aVar2 == null) {
                str2 = str4;
            } else {
                str2 = aVar2.mo50486c();
            }
            sb.append(str2);
            sb.append(" dest=");
            AbstractC13583a aVar3 = this.f35720g;
            if (aVar3 != null) {
                str4 = aVar3.mo50486c();
            }
            sb.append(str4);
            sb.append(" what=");
            C13585c cVar = this.f35714a;
            if (cVar != null) {
                str3 = cVar.mo50502d(this.f35716c);
            } else {
                str3 = "";
            }
            if (TextUtils.isEmpty(str3)) {
                sb.append(this.f35716c);
                sb.append("(0x");
                sb.append(Integer.toHexString(this.f35716c));
                sb.append(")");
            } else {
                sb.append(str3);
            }
            if (!TextUtils.isEmpty(this.f35717d)) {
                sb.append(" ");
                sb.append(this.f35717d);
            }
            return sb.toString();
        }

        C13587a(C13585c cVar, Message message, String str, AbstractC13583a aVar, AbstractC13583a aVar2, AbstractC13583a aVar3) {
            mo50516a(cVar, message, str, aVar, aVar2, aVar3);
        }

        /* renamed from: a */
        public void mo50516a(C13585c cVar, Message message, String str, AbstractC13583a aVar, AbstractC13583a aVar2, AbstractC13583a aVar3) {
            int i;
            this.f35714a = cVar;
            this.f35715b = System.currentTimeMillis();
            if (message != null) {
                i = message.what;
            } else {
                i = 0;
            }
            this.f35716c = i;
            this.f35717d = str;
            this.f35718e = aVar;
            this.f35719f = aVar2;
            this.f35720g = aVar3;
        }
    }

    /* renamed from: b */
    public final void mo50496b(Message message) {
        this.f35713j.mo50526a(message);
    }

    /* renamed from: e */
    public final Message mo50505e(int i) {
        return Message.obtain(this.f35713j, i);
    }

    /* renamed from: f */
    public final void mo50510f(int i) {
        HandlerC13589c cVar = this.f35713j;
        if (cVar != null) {
            cVar.sendMessage(mo50505e(i));
        }
    }

    /* renamed from: c */
    public final C13587a mo50500c(int i) {
        HandlerC13589c cVar = this.f35713j;
        if (cVar == null) {
            return null;
        }
        return cVar.f35728b.mo50518a(i);
    }

    /* renamed from: g */
    public final void mo50512g(Message message) {
        HandlerC13589c cVar = this.f35713j;
        if (cVar != null) {
            cVar.sendMessage(message);
        }
    }

    /* renamed from: a */
    public final void mo50489a(AbstractC13583a aVar) {
        this.f35713j.mo50527a(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50497b(C13584b bVar) {
        this.f35713j.mo50528a(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo50501c(Message message) {
        if (this.f35713j.f35727a) {
            mo50498b(" - unhandledMessage: msg.what=" + message.what);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50490a(C13584b bVar) {
        this.f35713j.mo50524a(bVar, (C13584b) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo50498b(String str) {
        C13479a.m54758a(this.f35712a, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo50493a(String str) {
        C13479a.m54772d(this.f35712a, str);
    }

    protected C13585c(String str, Looper looper) {
        m55118a(str, looper);
    }

    /* renamed from: a */
    public final Message mo50487a(int i, int i2) {
        return Message.obtain(this.f35713j, i, i2, 0);
    }

    /* renamed from: a */
    private void m55118a(String str, Looper looper) {
        this.f35712a = str;
        this.f35713j = new HandlerC13589c(looper, this);
    }

    /* renamed from: b */
    public final void mo50494b(int i, int i2) {
        HandlerC13589c cVar = this.f35713j;
        if (cVar != null) {
            cVar.sendMessage(mo50487a(i, i2));
        }
    }

    /* renamed from: a */
    public final Message mo50488a(int i, Object obj) {
        return Message.obtain(this.f35713j, i, obj);
    }

    /* renamed from: b */
    public final void mo50495b(int i, Object obj) {
        HandlerC13589c cVar = this.f35713j;
        if (cVar != null) {
            cVar.sendMessage(mo50488a(i, obj));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50491a(C13584b bVar, C13584b bVar2) {
        this.f35713j.mo50524a(bVar, bVar2);
    }

    /* renamed from: a */
    public void mo50492a(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println(mo50508f() + ":");
        printWriter.println(" total records=" + mo50513h());
        for (int i = 0; i < mo50511g(); i++) {
            printWriter.println(" rec[" + i + "]: " + mo50500c(i).toString());
            printWriter.flush();
        }
        printWriter.println("curState=" + mo50499c().mo50486c());
    }
}
