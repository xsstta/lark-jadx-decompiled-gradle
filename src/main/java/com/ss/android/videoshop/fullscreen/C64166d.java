package com.ss.android.videoshop.fullscreen;

import android.content.Context;
import android.provider.Settings;
import android.view.OrientationEventListener;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakContainer;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3199e.C64159a;
import com.ss.android.videoshop.p3203i.C64176e;
import java.util.Iterator;

/* renamed from: com.ss.android.videoshop.fullscreen.d */
public class C64166d {

    /* renamed from: a */
    public int f162099a = 9;

    /* renamed from: b */
    final WeakContainer<AbstractC64165c> f162100b = new WeakContainer<>();

    /* renamed from: c */
    private C64167a f162101c;

    /* renamed from: d */
    private final Context f162102d;

    /* renamed from: e */
    private boolean f162103e;

    /* renamed from: a */
    public int mo222294a() {
        C64167a aVar = this.f162101c;
        if (aVar == null) {
            return -1;
        }
        return aVar.f162104a;
    }

    /* renamed from: c */
    public void mo222298c() {
        C64167a aVar;
        if (this.f162103e && (aVar = this.f162101c) != null) {
            aVar.disable();
            this.f162103e = false;
        }
    }

    /* renamed from: b */
    public void mo222296b() {
        if (!this.f162103e) {
            try {
                C64167a aVar = this.f162101c;
                if (aVar != null) {
                    aVar.enable();
                    this.f162103e = true;
                }
            } catch (IllegalStateException e) {
                Logger.throwException(e);
            }
        }
    }

    /* renamed from: d */
    public boolean mo222299d() {
        try {
            if (Settings.System.getInt(this.f162102d.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo222295a(AbstractC64165c cVar) {
        if (cVar != null) {
            this.f162100b.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo222297b(AbstractC64165c cVar) {
        if (cVar != null) {
            this.f162100b.remove(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.videoshop.fullscreen.d$a */
    public class C64167a extends OrientationEventListener {

        /* renamed from: a */
        public int f162104a = -1;

        /* renamed from: a */
        private int m252172a(int i) {
            if (i <= C64166d.this.f162099a || 360 - i <= C64166d.this.f162099a) {
                return 1;
            }
            if (Math.abs(i - 90) <= C64166d.this.f162099a) {
                return 8;
            }
            if (Math.abs(i - 180) <= C64166d.this.f162099a) {
                return 9;
            }
            if (Math.abs(i - 270) <= C64166d.this.f162099a) {
                return 0;
            }
            return -1;
        }

        public void onOrientationChanged(int i) {
            int a;
            if (i >= 0 && i < 360 && this.f162104a != (a = m252172a(i)) && a != -1) {
                this.f162104a = a;
                C64159a.m252079a("onOrientationChanged:" + C64176e.m252215a(a));
                C64159a.m252077a((C64116b) null, getClass().getSimpleName() + " onOrientationChanged: " + C64176e.m252215a(a));
                StringBuilder sb = new StringBuilder();
                sb.append("onOrientationChanged:");
                sb.append(C64176e.m252215a(a));
                C64159a.m252083b("ScreenOrientationHelper", sb.toString());
                Iterator<AbstractC64165c> it = C64166d.this.f162100b.iterator();
                while (it.hasNext()) {
                    it.next().mo222279b(a);
                }
            }
        }

        C64167a(Context context) {
            super(context);
        }
    }

    public C64166d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f162102d = applicationContext;
        try {
            this.f162101c = new C64167a(applicationContext);
        } catch (Exception e) {
            Logger.throwException(e);
        }
    }
}
