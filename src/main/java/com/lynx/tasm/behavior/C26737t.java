package com.lynx.tasm.behavior;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p1221a.AbstractC26623a;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.p1216a.C26553i;
import java.util.HashSet;
import java.util.LinkedList;

/* renamed from: com.lynx.tasm.behavior.t */
public class C26737t {

    /* renamed from: a */
    public AbstractC26623a f66178a;

    /* renamed from: b */
    public boolean f66179b;

    /* renamed from: c */
    public boolean f66180c;

    /* renamed from: d */
    private C26690o f66181d;

    /* renamed from: e */
    private GestureDetector f66182e;

    /* renamed from: f */
    private AbstractC26623a f66183f;

    /* renamed from: g */
    private LinkedList<AbstractC26623a> f66184g;

    /* renamed from: h */
    private PointF f66185h;

    /* renamed from: i */
    private float f66186i = 150.0f;

    /* renamed from: j */
    private boolean f66187j;

    /* renamed from: k */
    private boolean f66188k;

    /* renamed from: l */
    private boolean f66189l;

    /* renamed from: m */
    private PointF f66190m;

    /* renamed from: n */
    private final HashSet<Integer> f66191n;

    /* renamed from: o */
    private boolean f66192o;

    /* renamed from: a */
    public void mo94912a() {
        this.f66188k = true;
    }

    /* renamed from: c */
    private void m96886c() {
        this.f66184g.clear();
        this.f66191n.clear();
    }

    /* renamed from: d */
    private EventEmitter m96888d() {
        return this.f66181d.mo94761j().mo94687i();
    }

    /* renamed from: b */
    private void m96883b() {
        this.f66184g.clear();
        AbstractC26623a aVar = this.f66178a;
        if (aVar != null) {
            while (aVar != null) {
                this.f66184g.push(aVar);
                aVar = aVar.mo94577r();
            }
            while (!this.f66184g.isEmpty() && (this.f66184g.getLast().mo94578s() == null || !this.f66184g.getLast().mo94578s().containsKey("click"))) {
                this.f66184g.removeLast();
            }
            if (this.f66184g.isEmpty()) {
                this.f66189l = true;
            } else {
                this.f66189l = false;
            }
        }
    }

    /* renamed from: b */
    public void mo94916b(LynxBaseUI lynxBaseUI) {
        this.f66183f = lynxBaseUI;
    }

    /* renamed from: com.lynx.tasm.behavior.t$a */
    private class C26739a extends GestureDetector.SimpleOnGestureListener {
        private C26739a() {
        }

        public void onLongPress(MotionEvent motionEvent) {
            C26737t.this.f66179b = true;
            if (C26737t.this.f66178a != null) {
                C26737t tVar = C26737t.this;
                tVar.f66180c = tVar.mo94915a(tVar.f66178a, "longpress", motionEvent.getX(), motionEvent.getY());
            }
            super.onLongPress(motionEvent);
        }
    }

    /* renamed from: a */
    public void mo94913a(LynxBaseUI lynxBaseUI) {
        HashSet<Integer> hashSet = this.f66191n;
        if (hashSet != null) {
            hashSet.add(Integer.valueOf(lynxBaseUI.mo94576q()));
        }
    }

    public C26737t(C26690o oVar) {
        this.f66181d = oVar;
        this.f66182e = new GestureDetector(this.f66181d.mo94761j(), new C26739a(), new Handler(Looper.getMainLooper()));
        this.f66184g = new LinkedList<>();
        this.f66185h = new PointF(Float.MIN_VALUE, Float.MIN_VALUE);
        this.f66191n = new HashSet<>();
        this.f66192o = false;
    }

    /* renamed from: a */
    private void m96880a(MotionEvent motionEvent) {
        this.f66179b = false;
        this.f66180c = false;
        this.f66187j = false;
        this.f66185h = new PointF(motionEvent.getX(), motionEvent.getY());
        this.f66188k = false;
        this.f66190m = new PointF(motionEvent.getX(), motionEvent.getY());
        this.f66191n.clear();
    }

    /* renamed from: a */
    private boolean m96881a(AbstractC26623a aVar) {
        if (aVar == null) {
            return false;
        }
        HashSet<Integer> hashSet = this.f66191n;
        if (hashSet == null || hashSet.isEmpty()) {
            return true;
        }
        Boolean bool = true;
        while (true) {
            if (aVar == null || aVar.mo94577r() == aVar) {
                break;
            } else if (this.f66191n.contains(Integer.valueOf(aVar.mo94576q()))) {
                bool = false;
                break;
            } else {
                aVar = aVar.mo94577r();
            }
        }
        return bool.booleanValue();
    }

    /* renamed from: c */
    private void m96887c(MotionEvent motionEvent) {
        Object obj;
        if (this.f66189l || this.f66188k || this.f66184g.isEmpty() || this.f66184g.getLast() == null || !m96881a(this.f66184g.getLast())) {
            StringBuilder sb = new StringBuilder();
            sb.append("not click:");
            sb.append(this.f66189l);
            sb.append(this.f66188k);
            LinkedList<AbstractC26623a> linkedList = this.f66184g;
            if (linkedList != null) {
                obj = Boolean.valueOf(linkedList.isEmpty());
            } else {
                obj = "";
            }
            sb.append(obj);
            LLog.m96425c(LynxKitALogDelegate.f38587a, sb.toString());
            return;
        }
        m96884b(this.f66184g.getLast(), "click", motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: d */
    private void m96889d(MotionEvent motionEvent) {
        if ((!this.f66179b || !this.f66180c) && !this.f66188k && !this.f66187j && m96881a(this.f66178a)) {
            m96884b(this.f66178a, "tap", motionEvent.getX(), motionEvent.getY());
            return;
        }
        LLog.m96425c(LynxKitALogDelegate.f38587a, "not tap:" + this.f66179b + this.f66180c + this.f66188k + this.f66187j);
    }

    /* renamed from: e */
    private boolean m96890e(MotionEvent motionEvent) {
        C26690o oVar = this.f66181d;
        if (oVar == null || oVar.mo94760i() == null) {
            return true;
        }
        LinkedList linkedList = new LinkedList();
        for (AbstractC26623a b = m96882b(motionEvent, this.f66181d.mo94760i()); b != null; b = b.mo94577r()) {
            linkedList.push(b);
        }
        if (linkedList.size() < this.f66184g.size()) {
            return true;
        }
        for (int i = 0; i < this.f66184g.size(); i++) {
            AbstractC26623a aVar = this.f66184g.get(i);
            if (aVar == null || aVar != linkedList.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m96885b(MotionEvent motionEvent) {
        PointF pointF = this.f66190m;
        if (pointF == null) {
            this.f66190m = new PointF(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        boolean z = false;
        if (pointF.x == motionEvent.getX() && this.f66190m.y == motionEvent.getY()) {
            return false;
        }
        PointF pointF2 = this.f66185h;
        if (pointF2 == null || Math.abs(pointF2.x - motionEvent.getX()) > this.f66186i || Math.abs(this.f66185h.y - motionEvent.getY()) > this.f66186i) {
            this.f66187j = true;
        }
        if (this.f66188k || ((!this.f66184g.isEmpty() && !m96881a(this.f66184g.getLast())) || this.f66189l || m96890e(motionEvent))) {
            z = true;
        }
        this.f66189l = z;
        this.f66190m.x = motionEvent.getX();
        this.f66190m.y = motionEvent.getY();
        return true;
    }

    /* renamed from: a */
    private C26553i.C26554a m96879a(AbstractC26623a aVar, C26553i.C26554a aVar2) {
        if (aVar instanceof LynxBaseUI) {
            return aVar2.mo94361a(this.f66181d.mo94760i().mo94929L(), ((LynxBaseUI) aVar).mo94929L());
        }
        return aVar2;
    }

    /* renamed from: b */
    private AbstractC26623a m96882b(MotionEvent motionEvent, UIGroup uIGroup) {
        if (uIGroup == null) {
            uIGroup = this.f66181d.mo94760i();
        }
        return uIGroup.mo94945a(motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: a */
    public boolean mo94914a(MotionEvent motionEvent, UIGroup uIGroup) {
        C26690o oVar;
        boolean z;
        boolean z2;
        if (motionEvent.getActionMasked() == 0) {
            this.f66178a = m96882b(motionEvent, uIGroup);
            m96880a(motionEvent);
            m96883b();
            m96884b(this.f66178a, "touchstart", motionEvent.getX(), motionEvent.getY());
        } else if (this.f66178a != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1) {
                if (!this.f66178a.mo94579t() && !this.f66188k && m96881a(this.f66178a)) {
                    AbstractC26623a aVar = this.f66183f;
                    AbstractC26623a aVar2 = this.f66178a;
                    this.f66183f = aVar2;
                    if (aVar2 != aVar) {
                        if (aVar2 != null && aVar2.mo53309m()) {
                            AbstractC26623a aVar3 = this.f66178a;
                            if (aVar == null || !aVar.mo53309m()) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            aVar3.mo53295a(true, z2);
                        }
                        if (aVar != null && aVar.mo53309m()) {
                            AbstractC26623a aVar4 = this.f66178a;
                            if (aVar4 == null || !aVar4.mo53309m()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            aVar.mo53295a(false, z);
                        }
                    }
                }
                m96884b(this.f66178a, "touchend", motionEvent.getX(), motionEvent.getY());
                m96887c(motionEvent);
                m96889d(motionEvent);
                m96886c();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m96884b(this.f66178a, "touchcancel", motionEvent.getX(), motionEvent.getY());
                    m96886c();
                }
            } else if (m96885b(motionEvent)) {
                m96884b(this.f66178a, "touchmove", motionEvent.getX(), motionEvent.getY());
            }
        }
        this.f66182e.onTouchEvent(motionEvent);
        AbstractC26623a aVar5 = this.f66178a;
        if (aVar5 == null || (oVar = this.f66181d) == null || aVar5 == oVar.mo94760i()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m96884b(AbstractC26623a aVar, String str, float f, float f2) {
        if (m96888d() != null) {
            C26553i.C26554a aVar2 = new C26553i.C26554a(f, f2);
            m96888d().mo94077a(new C26553i(aVar.mo94576q(), str, aVar2, aVar2, m96879a(aVar, aVar2)));
            return;
        }
        LLog.m96425c(LynxKitALogDelegate.f38587a, "sendTouchEvent: eventEmitter null");
    }

    /* renamed from: a */
    public boolean mo94915a(AbstractC26623a aVar, String str, float f, float f2) {
        if (m96888d() == null) {
            return false;
        }
        C26553i.C26554a aVar2 = new C26553i.C26554a(f, f2);
        return m96888d().mo94078b(new C26553i(aVar.mo94576q(), str, aVar2, aVar2, m96879a(aVar, aVar2)));
    }
}
