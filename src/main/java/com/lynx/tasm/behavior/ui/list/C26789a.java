package com.lynx.tasm.behavior.ui.list;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.p1216a.C26551g;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.lynx.tasm.behavior.ui.list.a */
public class C26789a {

    /* renamed from: a */
    private final EventEmitter f66438a;

    /* renamed from: b */
    private final Handler f66439b;

    /* renamed from: c */
    private RunnableC26791b f66440c;

    /* renamed from: d */
    private LinkedList<C26790a> f66441d = new LinkedList<>();

    /* renamed from: e */
    private LinkedList<C26790a> f66442e = new LinkedList<>();

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.a$b */
    public static class RunnableC26791b implements Runnable {

        /* renamed from: a */
        WeakReference<C26789a> f66447a;

        public void run() {
            C26789a aVar = this.f66447a.get();
            if (aVar != null) {
                aVar.mo95285a();
            }
        }

        public RunnableC26791b(C26789a aVar) {
            this.f66447a = new WeakReference<>(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.a$a */
    public static class C26790a {

        /* renamed from: a */
        C26799e f66443a;

        /* renamed from: b */
        String f66444b;

        /* renamed from: c */
        int f66445c;

        /* renamed from: d */
        String f66446d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo95289a() {
            if (this.f66443a.mo95320b() == null || this.f66444b == null || this.f66446d == null) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo95290b() {
            UIComponent b;
            if (!mo95289a() || (b = this.f66443a.mo95320b()) == null || b.mo94578s() == null) {
                return false;
            }
            return b.mo94578s().containsKey(this.f66444b);
        }

        public String toString() {
            return "{type='" + this.f66444b + "', position=" + this.f66445c + ", key='" + this.f66446d + "'}";
        }

        public C26790a(C26799e eVar, String str) {
            this.f66443a = eVar;
            this.f66444b = str;
            this.f66445c = eVar.getLayoutPosition();
            if (eVar.mo95320b() != null) {
                this.f66446d = eVar.mo95320b().mo53300d();
            }
        }
    }

    /* renamed from: b */
    private void m97247b() {
        if (this.f66440c == null) {
            RunnableC26791b bVar = new RunnableC26791b(this);
            this.f66440c = bVar;
            this.f66439b.postDelayed(bVar, (long) 50);
        }
    }

    /* renamed from: a */
    public void mo95285a() {
        boolean z;
        this.f66440c = null;
        if (UIList.f66420e) {
            LLog.m96425c("UIList2", "Courier flush pending " + this.f66442e.size() + " " + Arrays.toString(this.f66442e.toArray()) + " flushing " + this.f66441d.size() + " " + Arrays.toString(this.f66441d.toArray()));
        }
        while (this.f66441d.size() > 0) {
            C26790a removeFirst = this.f66441d.removeFirst();
            if (removeFirst.mo95289a()) {
                boolean z2 = false;
                Iterator<C26790a> it = this.f66441d.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    C26790a next = it.next();
                    if (m97246a(removeFirst, next)) {
                        this.f66441d.remove(next);
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                    Iterator<C26790a> it2 = this.f66442e.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = z2;
                            break;
                        }
                        C26790a next2 = it2.next();
                        if (m97246a(removeFirst, next2)) {
                            this.f66442e.remove(next2);
                            break;
                        }
                    }
                    if (!z && removeFirst.mo95290b()) {
                        m97245a(removeFirst);
                    }
                }
            }
        }
        this.f66441d = this.f66442e;
        this.f66442e = new LinkedList<>();
        if (this.f66441d.size() > 0) {
            m97247b();
        }
    }

    public C26789a(EventEmitter eventEmitter) {
        this.f66438a = eventEmitter;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f66439b = handler;
        RunnableC26791b bVar = new RunnableC26791b(this);
        this.f66440c = bVar;
        handler.postDelayed(bVar, (long) ParticipantRepo.f117150c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo95287b(C26799e eVar) {
        if (UIList.f66420e) {
            LLog.m96425c("UIList2", "onNodeAppear " + eVar.getLayoutPosition());
        }
        this.f66442e.push(new C26790a(eVar, "nodeappear"));
        m97247b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo95288c(C26799e eVar) {
        if (UIList.f66420e) {
            LLog.m96425c("UIList2", "onNodeDisappear " + eVar.getLayoutPosition());
        }
        this.f66442e.push(new C26790a(eVar, "nodedisappear"));
        m97247b();
    }

    /* renamed from: a */
    private void m97245a(C26790a aVar) {
        UIComponent b = aVar.f66443a.mo95320b();
        if (b != null) {
            if (UIList.f66420e) {
                LLog.m96425c("UIList2", "sendNodeEvent " + aVar.f66444b + "  " + aVar.f66445c + " " + aVar.f66446d);
            }
            C26551g a = C26551g.m96256a(b.mo94576q(), aVar.f66444b);
            a.mo94347a("position", Integer.valueOf(aVar.f66445c));
            a.mo94347a("key", aVar.f66446d);
            this.f66438a.mo94075a(a);
        }
    }

    /* renamed from: a */
    public void mo95286a(C26799e eVar) {
        Iterator<C26790a> it = this.f66441d.iterator();
        while (it.hasNext()) {
            C26790a next = it.next();
            if (next.f66443a == eVar) {
                next.f66446d = eVar.mo95320b().mo53300d();
            }
        }
        Iterator<C26790a> it2 = this.f66442e.iterator();
        while (it2.hasNext()) {
            C26790a next2 = it2.next();
            if (next2.f66443a == eVar) {
                next2.f66446d = eVar.mo95320b().mo53300d();
            }
        }
    }

    /* renamed from: a */
    private boolean m97246a(C26790a aVar, C26790a aVar2) {
        if (aVar.f66446d != null || aVar2.f66446d != null) {
            return TextUtils.equals(aVar.f66446d, aVar2.f66446d);
        }
        if (aVar.f66445c == aVar2.f66445c) {
            return true;
        }
        return false;
    }
}
