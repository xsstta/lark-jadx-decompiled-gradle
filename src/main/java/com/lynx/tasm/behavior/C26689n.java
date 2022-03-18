package com.lynx.tasm.behavior;

import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.core.JSProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.lynx.tasm.behavior.n */
public class C26689n implements EventEmitter.AbstractC26525b {

    /* renamed from: a */
    private final ArrayList<C26685m> f66052a = new ArrayList<>();

    /* renamed from: b */
    private final WeakReference<AbstractC26684l> f66053b;

    /* renamed from: c */
    private final WeakReference<JSProxy> f66054c;

    /* renamed from: a */
    public AbstractC26684l mo94701a() {
        return this.f66053b.get();
    }

    /* renamed from: b */
    public void mo94706b() {
        Iterator<C26685m> it = this.f66052a.iterator();
        while (it.hasNext()) {
            it.next().mo94698c();
        }
    }

    /* renamed from: a */
    public void mo94702a(int i) {
        Iterator<C26685m> it = this.f66052a.iterator();
        while (it.hasNext()) {
            C26685m next = it.next();
            if (next.mo94693a() == i) {
                this.f66052a.remove(next);
                return;
            }
        }
    }

    /* renamed from: b */
    public C26685m mo94705b(int i) {
        Iterator<C26685m> it = this.f66052a.iterator();
        while (it.hasNext()) {
            C26685m next = it.next();
            if (next.mo94693a() == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo94704a(C26685m mVar) {
        if (!this.f66052a.contains(mVar)) {
            this.f66052a.add(mVar);
        }
    }

    public C26689n(AbstractC26684l lVar, JSProxy jSProxy) {
        this.f66053b = new WeakReference<>(lVar);
        this.f66054c = new WeakReference<>(jSProxy);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r4.equals("scrolltolower") == false) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    @Override // com.lynx.tasm.EventEmitter.AbstractC26525b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94080a(com.lynx.tasm.EventEmitter.LynxEventType r4, com.lynx.tasm.p1216a.C26548d r5) {
        /*
            r3 = this;
            java.util.ArrayList<com.lynx.tasm.behavior.m> r0 = r3.f66052a
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            r0 = 0
            com.lynx.tasm.EventEmitter$LynxEventType r1 = com.lynx.tasm.EventEmitter.LynxEventType.kLynxEventTypeLayoutEvent
            r2 = 1
            if (r4 != r1) goto L_0x0011
        L_0x000f:
            r0 = 1
            goto L_0x0032
        L_0x0011:
            com.lynx.tasm.EventEmitter$LynxEventType r1 = com.lynx.tasm.EventEmitter.LynxEventType.kLynxEventTypeCustomEvent
            if (r4 != r1) goto L_0x0032
            java.lang.String r4 = r5.mo94349d()
            java.lang.String r5 = "scroll"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x000f
            java.lang.String r5 = "scrolltoupper"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x000f
            java.lang.String r5 = "scrolltolower"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0032
            goto L_0x000f
        L_0x0032:
            if (r0 != 0) goto L_0x0035
            return
        L_0x0035:
            r3.mo94706b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.C26689n.mo94080a(com.lynx.tasm.EventEmitter$LynxEventType, com.lynx.tasm.a.d):void");
    }

    /* renamed from: a */
    public void mo94703a(int i, int i2, JavaOnlyMap javaOnlyMap) {
        JSProxy jSProxy = this.f66054c.get();
        if (jSProxy != null) {
            jSProxy.mo95662a(i, i2, javaOnlyMap);
        }
    }
}
