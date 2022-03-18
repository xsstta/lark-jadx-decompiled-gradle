package com.ss.android.videoshop.fullscreen;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Message;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.common.utility.collection.WeakHandler;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.videoshop.api.AbstractC64096e;
import com.ss.android.videoshop.api.AbstractC64106m;
import com.ss.android.videoshop.api.stub.C64111c;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3199e.C64159a;
import com.ss.android.videoshop.p3202h.C64169a;
import com.ss.android.videoshop.p3203i.C64174c;
import com.ss.android.videoshop.p3203i.C64175d;
import com.ss.android.videoshop.p3203i.C64176e;
import com.ss.android.videoshop.p3203i.C64177f;

/* renamed from: com.ss.android.videoshop.fullscreen.a */
public class C64162a implements WeakHandler.IHandler, AbstractC64165c {

    /* renamed from: a */
    public boolean f162071a;

    /* renamed from: b */
    private final int f162072b = 1;

    /* renamed from: c */
    private final int f162073c = 2;

    /* renamed from: d */
    private final int f162074d = 3;

    /* renamed from: e */
    private C64166d f162075e;

    /* renamed from: f */
    private WeakHandler f162076f = new WeakHandler(this);

    /* renamed from: g */
    private C64169a f162077g;

    /* renamed from: h */
    private boolean f162078h;

    /* renamed from: i */
    private int f162079i = 0;

    /* renamed from: j */
    private boolean f162080j;

    /* renamed from: k */
    private AbstractC64096e f162081k;

    /* renamed from: l */
    private Context f162082l;

    /* renamed from: m */
    private int f162083m = -1;

    /* renamed from: n */
    private boolean f162084n;

    /* renamed from: o */
    private int f162085o = -1;

    /* renamed from: p */
    private boolean f162086p;

    /* renamed from: q */
    private boolean f162087q;

    /* renamed from: r */
    private int f162088r = -1;

    /* renamed from: s */
    private int f162089s;

    /* renamed from: t */
    private int f162090t = 0;

    /* renamed from: u */
    private boolean f162091u;

    /* renamed from: v */
    private int f162092v = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: w */
    private VideoContext f162093w;

    /* renamed from: x */
    private boolean f162094x;

    /* renamed from: y */
    private int f162095y = -1;

    /* renamed from: z */
    private AbstractC64106m f162096z = new C64111c();

    /* renamed from: h */
    public boolean mo222287h() {
        return this.f162078h;
    }

    /* renamed from: k */
    public boolean mo222290k() {
        return this.f162080j;
    }

    /* renamed from: a */
    public void mo222270a() {
        m252136e(false);
    }

    /* renamed from: b */
    public void mo222278b() {
        m252132a(false, false);
    }

    /* renamed from: j */
    public boolean mo222289j() {
        if (this.f162079i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo222288i() {
        if (this.f162079i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo222291l() {
        C64169a aVar = this.f162077g;
        if (aVar == null || !aVar.mo222310e()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private boolean m252140n() {
        if (Build.MODEL.equals("IN2010") || Build.MODEL.equals("IN2020")) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private int m252141o() {
        if (this.f162095y < 0 || this.f162083m == 2 || this.f162094x) {
            this.f162095y = C64177f.m252225d(this.f162082l);
        }
        return this.f162095y;
    }

    /* renamed from: c */
    public int mo222281c() {
        if (mo222288i()) {
            return m252138g(true);
        }
        if (mo222289j()) {
            return m252138g(false);
        }
        return -1;
    }

    /* renamed from: d */
    public void mo222283d() {
        C64164b bVar;
        C64169a aVar = this.f162077g;
        if (aVar != null) {
            bVar = aVar.mo222320o();
        } else {
            bVar = null;
        }
        C64175d.m252212a(C64174c.m252210a(this.f162082l), bVar);
    }

    /* renamed from: f */
    public void mo222285f() {
        if (this.f162078h && this.f162084n) {
            this.f162075e.mo222297b(this);
            this.f162075e.mo222295a(this);
            this.f162075e.mo222296b();
        }
    }

    /* renamed from: g */
    public void mo222286g() {
        this.f162075e.mo222298c();
        this.f162075e.mo222297b(this);
    }

    /* renamed from: m */
    private boolean m252139m() {
        Activity a = C64174c.m252210a(this.f162082l);
        if (a == null) {
            return true;
        }
        try {
            ActivityInfo activityInfo = a.getPackageManager().getActivityInfo(a.getComponentName(), 0);
            if (activityInfo == null) {
                return true;
            }
            this.f162085o = activityInfo.screenOrientation;
            return C64177f.m252224c(activityInfo.screenOrientation);
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: e */
    public void mo222284e() {
        Window window;
        Activity a = C64174c.m252210a(this.f162082l);
        if (a != null && (window = a.getWindow()) != null) {
            if (!this.f162091u && C64175d.m252214a(window)) {
                window.clearFlags(1024);
            }
            if (Build.VERSION.SDK_INT >= 16) {
                window.getDecorView().setSystemUiVisibility(this.f162089s);
            }
        }
    }

    /* renamed from: a */
    public void mo222271a(int i) {
        this.f162079i = i;
    }

    /* renamed from: c */
    public void mo222282c(boolean z) {
        this.f162080j = z;
    }

    /* renamed from: c */
    private boolean m252133c(int i) {
        int o = m252141o();
        if (i == -1 || i == o) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m252137f(boolean z) {
        mo222283d();
        AbstractC64096e eVar = this.f162081k;
        if (eVar != null) {
            eVar.mo221873b(true, this.f162088r, z, false);
        }
    }

    /* renamed from: g */
    private int m252138g(boolean z) {
        int d = m252134d(z);
        if (m252133c(d)) {
            m252135d(d);
        }
        return d;
    }

    /* renamed from: a */
    public void mo222274a(AbstractC64096e eVar) {
        this.f162081k = eVar;
    }

    /* renamed from: d */
    private void m252135d(int i) {
        this.f162071a = true;
        this.f162076f.postDelayed(new Runnable() {
            /* class com.ss.android.videoshop.fullscreen.C64162a.RunnableC641631 */

            public void run() {
                C64162a.this.f162071a = false;
            }
        }, 300);
        try {
            C64174c.m252210a(this.f162082l).setRequestedOrientation(i);
            C64159a.m252083b("FullScreenOperator", "requestOrientation orientation:" + C64176e.m252215a(i));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo222275a(VideoContext videoContext) {
        this.f162093w = videoContext;
    }

    /* renamed from: b */
    public void mo222280b(boolean z) {
        WeakHandler weakHandler;
        this.f162078h = z;
        C64159a.m252083b("FullScreenOperator", "setRotateEnabled enabled:" + z);
        if (!z && (weakHandler = this.f162076f) != null) {
            weakHandler.removeMessages(1);
        }
        if (!z) {
            mo222286g();
        } else {
            mo222285f();
        }
    }

    public C64162a(Context context) {
        if (C64174c.m252210a(context) != null) {
            this.f162082l = context;
            this.f162084n = m252139m();
            C64159a.m252083b("FullScreenOperator", "fixedOrientation:" + this.f162084n);
            this.f162075e = new C64166d(context);
            return;
        }
        throw new RuntimeException("FullScreenOperator context must be activity");
    }

    /* renamed from: d */
    private int m252134d(boolean z) {
        int i;
        boolean z2 = true;
        if (z) {
            if (!this.f162080j) {
                int a = this.f162075e.mo222294a();
                if (a == -1 && ((i = this.f162085o) == 8 || i == 0)) {
                    return i;
                }
                if (8 != a) {
                    z2 = false;
                }
                if (z2) {
                    return 8;
                }
                return 0;
            } else if (!C64177f.m252220b(this.f162085o) && C64177f.m252217a(this.f162085o)) {
                return this.f162085o;
            } else {
                return 1;
            }
        } else if (!C64177f.m252220b(this.f162085o) && C64177f.m252217a(this.f162085o)) {
            return this.f162085o;
        } else {
            return 1;
        }
    }

    /* renamed from: a */
    public void mo222276a(C64169a aVar) {
        this.f162077g = aVar;
    }

    @Override // com.ss.android.videoshop.fullscreen.AbstractC64165c
    /* renamed from: b */
    public void mo222279b(int i) {
        AbstractC64106m mVar;
        boolean z;
        C64159a.m252083b("FullScreenOperator", "onScreenOrientationChanged orientation:" + C64176e.m252215a(i));
        if (mo222287h() && !this.f162071a && (mVar = this.f162096z) != null) {
            VideoContext videoContext = this.f162093w;
            int o = m252141o();
            C64166d dVar = this.f162075e;
            if (dVar == null || dVar.mo222299d()) {
                z = true;
            } else {
                z = false;
            }
            mVar.mo221908a(videoContext, this, i, o, z);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        int i = message.what;
        if (i == 1) {
            int i2 = message.arg1;
            if (!mo222287h() || i2 == m252141o() || i2 == -1 || i2 == 9) {
                AbstractC64096e eVar = this.f162081k;
                if (eVar != null) {
                    eVar.mo221870a(this.f162078h, i2);
                }
            } else if (i2 == 1) {
                if (mo222288i()) {
                    AbstractC64096e eVar2 = this.f162081k;
                    if ((eVar2 == null || !eVar2.mo221872a(false, i2, true)) && !this.f162080j) {
                        m252132a(true, false);
                    }
                }
            } else if (mo222288i()) {
                if (m252133c(i2)) {
                    m252135d(i2);
                }
                mo222283d();
            } else {
                AbstractC64096e eVar3 = this.f162081k;
                if ((eVar3 == null || !eVar3.mo221872a(true, i2, true)) && !this.f162080j) {
                    m252136e(true);
                }
            }
        } else if (i == 2 && this.f162079i == 1) {
            C64159a.m252083b("FullScreenOperator", "MSG_VIDEO_ENTERING_FULLSCREEN");
            m252137f(((Boolean) message.obj).booleanValue());
            this.f162079i = 2;
            this.f162094x = true;
        }
    }

    /* renamed from: e */
    private void m252136e(boolean z) {
        C64116b bVar;
        C64159a.m252083b("FullScreenOperator", "enterfullscreen videoScreenState:" + this.f162079i);
        VideoContext videoContext = this.f162093w;
        C64116b bVar2 = null;
        if (videoContext != null) {
            bVar = videoContext.mo222060m();
        } else {
            bVar = null;
        }
        C64159a.m252077a(bVar, getClass().getSimpleName() + " enterfullscreen videoScreenState: " + this.f162079i);
        if (this.f162079i == 0) {
            this.f162079i = 1;
            Activity a = C64174c.m252210a(this.f162082l);
            if (a != null) {
                this.f162091u = C64175d.m252214a(a.getWindow());
                if (Build.VERSION.SDK_INT >= 28 && a.getWindow() != null && m252140n()) {
                    Window window = a.getWindow();
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    this.f162090t = attributes.layoutInDisplayCutoutMode;
                    attributes.layoutInDisplayCutoutMode = 1;
                    window.setAttributes(attributes);
                }
            } else {
                this.f162091u = false;
            }
            this.f162089s = C64177f.m252226e(this.f162082l);
            this.f162087q = z;
            this.f162086p = false;
            int d = m252134d(true);
            this.f162088r = d;
            AbstractC64096e eVar = this.f162081k;
            if (eVar != null) {
                eVar.mo221871a(true, d, z, false);
            }
            if (m252133c(this.f162088r)) {
                VideoContext videoContext2 = this.f162093w;
                if (videoContext2 != null) {
                    bVar2 = videoContext2.mo222060m();
                }
                C64159a.m252077a(bVar2, getClass().getSimpleName() + " enterfullscreen needRequestOrientation targetOrientation: " + C64176e.m252215a(this.f162088r) + " halfScreenUiFlags: " + this.f162089s);
                StringBuilder sb = new StringBuilder();
                sb.append("enterfullscreen needRequestOrientation targetOrientation:");
                sb.append(C64176e.m252215a(this.f162088r));
                sb.append(" halfScreenUiFlags:");
                sb.append(this.f162089s);
                C64159a.m252083b("FullScreenOperator", sb.toString());
                m252135d(this.f162088r);
                this.f162076f.sendMessageDelayed(Message.obtain(this.f162076f, 2, Boolean.valueOf(z)), (long) this.f162092v);
                this.f162094x = false;
                return;
            }
            VideoContext videoContext3 = this.f162093w;
            if (videoContext3 != null) {
                bVar2 = videoContext3.mo222060m();
            }
            C64159a.m252077a(bVar2, getClass().getSimpleName() + " enterfullscreen do not needRequestOrientation targetOrientation: " + C64176e.m252215a(this.f162088r) + " halfScreenUiFlags: " + this.f162089s);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("enterfullscreen do not needRequestOrientation targetOrientation:");
            sb2.append(C64176e.m252215a(this.f162088r));
            sb2.append(" halfScreenUiFlags:");
            sb2.append(this.f162089s);
            C64159a.m252083b("FullScreenOperator", sb2.toString());
            m252137f(z);
            if (!mo222291l()) {
                this.f162079i = 2;
            }
        }
    }

    /* renamed from: a */
    public void mo222273a(Configuration configuration) {
        boolean z;
        C64159a.m252083b("FullScreenOperator", "onConfigurationChanged newConfig.orientation:" + configuration.orientation);
        if (this.f162083m != configuration.orientation) {
            this.f162083m = configuration.orientation;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Activity a = C64174c.m252210a(this.f162082l);
            if (a != null) {
                int requestedOrientation = a.getRequestedOrientation();
                int i = this.f162083m;
                if (i == 1) {
                    if (requestedOrientation == 1) {
                        this.f162095y = requestedOrientation;
                    } else {
                        this.f162095y = -1;
                    }
                } else if (i != 2) {
                    this.f162095y = -1;
                } else if (requestedOrientation == 0 || requestedOrientation == 8) {
                    this.f162095y = requestedOrientation;
                } else {
                    this.f162095y = -1;
                }
            }
            if (this.f162084n && this.f162079i == 1) {
                this.f162076f.removeMessages(2);
                m252137f(this.f162087q);
                this.f162079i = 2;
            }
            this.f162094x = false;
            C64159a.m252083b("FullScreenOperator", "onConfigurationChanged currentOrientation:" + this.f162095y);
        }
    }

    /* renamed from: a */
    public void mo222277a(boolean z) {
        m252132a(false, z);
    }

    /* renamed from: a */
    public void mo222272a(int i, long j) {
        this.f162076f.removeMessages(1);
        WeakHandler weakHandler = this.f162076f;
        weakHandler.sendMessageDelayed(Message.obtain(weakHandler, 1, i, 0), j);
    }

    /* renamed from: a */
    private void m252132a(boolean z, boolean z2) {
        C64116b bVar;
        C64159a.m252083b("FullScreenOperator", "exitfullscreen videoScreenState:" + this.f162079i);
        VideoContext videoContext = this.f162093w;
        if (videoContext != null) {
            bVar = videoContext.mo222060m();
        } else {
            bVar = null;
        }
        C64159a.m252077a(bVar, getClass().getSimpleName() + " exitfullscreen videoScreenState: " + this.f162079i);
        if (this.f162079i == 2) {
            this.f162079i = 3;
            int d = m252134d(false);
            this.f162088r = d;
            this.f162087q = z;
            this.f162086p = z2;
            AbstractC64096e eVar = this.f162081k;
            if (eVar != null) {
                eVar.mo221871a(false, d, z, z2);
            }
            m252135d(this.f162088r);
            if (mo222290k()) {
                AbstractC64096e eVar2 = this.f162081k;
                if (eVar2 != null) {
                    eVar2.mo221873b(false, this.f162088r, z, z2);
                }
                if (!mo222291l()) {
                    mo222284e();
                    this.f162079i = 0;
                }
            } else {
                AbstractC64096e eVar3 = this.f162081k;
                if (eVar3 != null) {
                    eVar3.mo221873b(false, this.f162088r, z, z2);
                }
                mo222284e();
                this.f162079i = 0;
            }
            Activity a = C64174c.m252210a(this.f162082l);
            if (Build.VERSION.SDK_INT >= 28 && a != null && a.getWindow() != null && m252140n()) {
                Window window = a.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = this.f162090t;
                window.setAttributes(attributes);
            }
        }
    }
}
