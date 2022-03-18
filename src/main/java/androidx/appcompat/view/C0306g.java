package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC0928y;
import androidx.core.view.C0924x;
import androidx.core.view.C0929z;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.appcompat.view.g */
public class C0306g {

    /* renamed from: a */
    final ArrayList<C0924x> f928a = new ArrayList<>();

    /* renamed from: b */
    AbstractC0928y f929b;

    /* renamed from: c */
    private long f930c = -1;

    /* renamed from: d */
    private Interpolator f931d;

    /* renamed from: e */
    private boolean f932e;

    /* renamed from: f */
    private final C0929z f933f = new C0929z() {
        /* class androidx.appcompat.view.C0306g.C03071 */

        /* renamed from: b */
        private boolean f935b;

        /* renamed from: c */
        private int f936c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1198a() {
            this.f936c = 0;
            this.f935b = false;
            C0306g.this.mo1196b();
        }

        @Override // androidx.core.view.C0929z, androidx.core.view.AbstractC0928y
        /* renamed from: a */
        public void mo868a(View view) {
            if (!this.f935b) {
                this.f935b = true;
                if (C0306g.this.f929b != null) {
                    C0306g.this.f929b.mo868a(null);
                }
            }
        }

        @Override // androidx.core.view.C0929z, androidx.core.view.AbstractC0928y
        /* renamed from: b */
        public void mo869b(View view) {
            int i = this.f936c + 1;
            this.f936c = i;
            if (i == C0306g.this.f928a.size()) {
                if (C0306g.this.f929b != null) {
                    C0306g.this.f929b.mo869b(null);
                }
                mo1198a();
            }
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1196b() {
        this.f932e = false;
    }

    /* renamed from: c */
    public void mo1197c() {
        if (this.f932e) {
            Iterator<C0924x> it = this.f928a.iterator();
            while (it.hasNext()) {
                it.next().mo4730b();
            }
            this.f932e = false;
        }
    }

    /* renamed from: a */
    public void mo1195a() {
        if (!this.f932e) {
            Iterator<C0924x> it = this.f928a.iterator();
            while (it.hasNext()) {
                C0924x next = it.next();
                long j = this.f930c;
                if (j >= 0) {
                    next.mo4724a(j);
                }
                Interpolator interpolator = this.f931d;
                if (interpolator != null) {
                    next.mo4725a(interpolator);
                }
                if (this.f929b != null) {
                    next.mo4727a(this.f933f);
                }
                next.mo4732c();
            }
            this.f932e = true;
        }
    }

    /* renamed from: a */
    public C0306g mo1190a(long j) {
        if (!this.f932e) {
            this.f930c = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0306g mo1191a(Interpolator interpolator) {
        if (!this.f932e) {
            this.f931d = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public C0306g mo1192a(C0924x xVar) {
        if (!this.f932e) {
            this.f928a.add(xVar);
        }
        return this;
    }

    /* renamed from: a */
    public C0306g mo1194a(AbstractC0928y yVar) {
        if (!this.f932e) {
            this.f929b = yVar;
        }
        return this;
    }

    /* renamed from: a */
    public C0306g mo1193a(C0924x xVar, C0924x xVar2) {
        this.f928a.add(xVar);
        xVar2.mo4729b(xVar.mo4722a());
        this.f928a.add(xVar2);
        return this;
    }
}
