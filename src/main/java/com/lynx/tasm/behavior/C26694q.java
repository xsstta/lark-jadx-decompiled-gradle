package com.lynx.tasm.behavior;

import android.util.DisplayMetrics;
import android.util.SparseArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.AbstractC26617e;
import com.lynx.tasm.behavior.shadow.AbstractC26702c;
import com.lynx.tasm.behavior.shadow.ShadowNode;

/* renamed from: com.lynx.tasm.behavior.q */
public class C26694q extends LayoutContext {

    /* renamed from: a */
    private AbstractC26684l f66072a;

    /* renamed from: b */
    private final AbstractC26702c f66073b;

    /* renamed from: c */
    private final C26636c f66074c;

    /* renamed from: d */
    private final PaintingContext f66075d;

    /* renamed from: e */
    private final C26696r f66076e = new C26696r();

    /* renamed from: f */
    private final AbstractC26617e f66077f;

    /* renamed from: g */
    private boolean f66078g;

    /* renamed from: h */
    private boolean f66079h;

    @Override // com.lynx.tasm.behavior.LayoutContext
    /* renamed from: a */
    public DisplayMetrics mo94507a() {
        return this.f66072a.mo94672b();
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.LayoutContext
    public void updateDataWithoutChange() {
        if (!this.f66079h) {
            this.f66079h = true;
            return;
        }
        AbstractC26617e eVar = this.f66077f;
        if (eVar != null) {
            eVar.mo94216c();
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void dispatchOnLayoutFinish() {
        if (this.f66078g) {
            this.f66078g = false;
            AbstractC26617e eVar = this.f66077f;
            if (eVar != null) {
                eVar.mo94214a();
                return;
            }
            return;
        }
        AbstractC26617e eVar2 = this.f66077f;
        if (eVar2 != null) {
            eVar2.mo94215b();
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void detachNativePtr() {
        SparseArray<ShadowNode> a;
        super.detachNativePtr();
        C26696r rVar = this.f66076e;
        if (!(rVar == null || (a = rVar.mo94768a()) == null || a.size() <= 0)) {
            for (int i = 0; i < a.size(); i++) {
                a.valueAt(i).mo94812o();
            }
        }
    }

    /* renamed from: b */
    private void m96742b(final long j) {
        this.f66073b.mo94816a(new Runnable() {
            /* class com.lynx.tasm.behavior.C26694q.RunnableC266951 */

            public void run() {
                C26694q.this.mo94508a(j);
            }
        });
    }

    /* renamed from: a */
    public ShadowNode mo94766a(int i) {
        return this.f66076e.mo94771b(i);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void dispatchOnLayoutBefore(int i) {
        this.f66076e.mo94771b(i).mo94786c();
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void scheduleLayout(long j) {
        if (!mo94511c()) {
            m96742b(j);
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void destroyNodes(int[] iArr) {
        for (int i : iArr) {
            this.f66076e.mo94769a(i).mo94812o();
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void updateProps(int i, ReadableMap readableMap) {
        ShadowNode b = this.f66076e.mo94771b(i);
        if (b == null) {
            throw new RuntimeException("Trying to update non-existent view with tag " + i);
        } else if (readableMap != null) {
            b.mo94799a(new C26697s(readableMap));
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void insertNode(int i, int i2, int i3) {
        this.f66076e.mo94771b(i).mo94800a(this.f66076e.mo94771b(i2), i3);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void removeNode(int i, int i2, int i3) {
        this.f66076e.mo94771b(i).mo94796a(i3);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void moveNode(int i, int i2, int i3, int i4) {
        ShadowNode b = this.f66076e.mo94771b(i);
        ShadowNode b2 = this.f66076e.mo94771b(i2);
        b.mo94796a(i3);
        b.mo94800a(b2, i4);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public int createNode(int i, String str, ReadableMap readableMap, long j) {
        int i2;
        C26622a a = this.f66074c.mo94605a(str);
        ShadowNode a2 = a.mo67433a();
        if (a.mo94570c()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        if (a2 == null) {
            return i2 | 1;
        }
        int i3 = i2 | 4;
        a2.mo94803c(i);
        a2.mo94801a(str);
        a2.mo94798a(this.f66072a);
        this.f66076e.mo94770a(a2);
        if (!mo94511c()) {
            a2.mo94784a(j);
        }
        if (readableMap != null) {
            a2.mo94799a(new C26697s(readableMap));
        }
        if (a2.mo94804g()) {
            return i3 | 2;
        }
        return i3;
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public void dispatchOnLayout(int i, int i2, int i3, int i4, int i5) {
        ShadowNode b = this.f66076e.mo94771b(i);
        b.mo94783a(i2, i3, i4, i5);
        b.mo94797a(this.f66075d);
    }

    public C26694q(AbstractC26684l lVar, C26636c cVar, PaintingContext paintingContext, AbstractC26702c cVar2, AbstractC26617e eVar) {
        this.f66072a = lVar;
        this.f66074c = cVar;
        this.f66075d = paintingContext;
        this.f66073b = cVar2;
        this.f66077f = eVar;
        this.f66078g = true;
    }
}
