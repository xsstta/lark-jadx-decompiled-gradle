package com.ss.android.medialib.camera;

import android.content.Context;
import android.view.WindowManager;
import com.ss.android.medialib.camera.p3001a.AbstractC59388a;
import com.ss.android.medialib.p2999b.C59376a;
import com.ss.android.medialib.presenter.AbstractC59418c;
import com.ss.android.medialib.presenter.AbstractC59419d;
import com.ss.android.vesdk.C63929ab;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.medialib.camera.b */
public final class C59390b {

    /* renamed from: d */
    public static boolean f147437d = true;

    /* renamed from: m */
    private static C59390b f147438m;

    /* renamed from: a */
    public IESCameraInterface f147439a;

    /* renamed from: b */
    public AbstractC59419d f147440b;

    /* renamed from: c */
    public C59387a f147441c;

    /* renamed from: e */
    public int f147442e;

    /* renamed from: f */
    public long f147443f;

    /* renamed from: g */
    public long f147444g;

    /* renamed from: h */
    public final Object f147445h = new Object();

    /* renamed from: i */
    public long f147446i = 0;

    /* renamed from: j */
    public boolean f147447j = false;

    /* renamed from: k */
    public AbstractC59388a f147448k;

    /* renamed from: l */
    public AtomicBoolean f147449l = new AtomicBoolean(false);

    /* renamed from: n */
    private AbstractC59418c f147450n;

    /* renamed from: o */
    private int f147451o = -1;

    /* renamed from: p */
    private int f147452p;

    /* renamed from: q */
    private C59376a.AbstractC59378b f147453q = new C59376a.AbstractC59378b() {
        /* class com.ss.android.medialib.camera.C59390b.C593911 */

        @Override // com.ss.android.medialib.p2999b.C59376a.AbstractC59378b
        /* renamed from: b */
        public void mo202212b() {
            C63929ab.m250976b("IESCameraManager", "onOpenGLDestroy...");
            if (C59390b.this.f147448k != null) {
                C59390b.this.f147448k.mo202212b();
            }
        }

        @Override // com.ss.android.medialib.p2999b.C59376a.AbstractC59378b
        /* renamed from: a */
        public void mo202211a() {
            C63929ab.m250976b("IESCameraManager", "onOpenGLCreate...");
            if (C59390b.this.f147440b == null || C59390b.this.f147448k == null) {
                C63929ab.m250980d("IESCameraManager", "presenter or camera provider is null!");
                return;
            }
            C59390b.this.f147448k.mo202211a();
            C59390b.this.f147448k.mo202242a(new AbstractC59388a.AbstractC59389a() {
                /* class com.ss.android.medialib.camera.C59390b.C593911.C593921 */
            });
            C59390b.this.f147448k.mo202243d();
            C59390b.this.f147442e = 0;
            C59390b bVar = C59390b.this;
            long currentTimeMillis = System.currentTimeMillis();
            bVar.f147444g = currentTimeMillis;
            bVar.f147443f = currentTimeMillis;
        }

        @Override // com.ss.android.medialib.p2999b.C59376a.AbstractC59378b
        /* renamed from: c */
        public int mo202213c() {
            int i;
            if (C59390b.this.f147449l.getAndSet(false) && C59390b.this.f147441c.f147436b != null) {
                C59390b bVar = C59390b.this;
                bVar.mo202244a(bVar.f147441c.f147436b);
            }
            if (C59390b.this.f147448k != null) {
                i = C59390b.this.f147448k.mo202213c();
            } else {
                i = 0;
            }
            if (i < 0) {
                return i;
            }
            if (C59390b.this.f147439a != null && C59390b.this.f147439a.mo202232b()) {
                return -3;
            }
            if (C59390b.this.f147447j) {
                return -4;
            }
            return 0;
        }
    };

    /* renamed from: r */
    private int[] f147454r = new int[2];

    /* renamed from: b */
    public int mo202245b() {
        return this.f147452p;
    }

    /* renamed from: c */
    public int mo202246c() {
        IESCameraInterface iESCameraInterface = this.f147439a;
        if (iESCameraInterface == null) {
            return -1;
        }
        return iESCameraInterface.mo202230a();
    }

    /* renamed from: a */
    public static C59390b m230546a() {
        if (f147438m == null) {
            synchronized (C59390b.class) {
                if (f147438m == null) {
                    f147438m = new C59390b();
                }
            }
        }
        return f147438m;
    }

    private C59390b() {
    }

    /* renamed from: a */
    public synchronized void mo202244a(Context context) {
        int a;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        synchronized (this.f147445h) {
            a = this.f147439a.mo202231a(i);
        }
        this.f147452p = a;
        if (this.f147450n != null) {
            C63929ab.m250974a("IESCameraManager", "Camera deflection angle: " + a);
            this.f147450n.mo202660a(a);
        }
    }
}
