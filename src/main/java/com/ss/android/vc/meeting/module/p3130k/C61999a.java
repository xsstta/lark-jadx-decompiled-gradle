package com.ss.android.vc.meeting.module.p3130k;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.OrientationListener;
import android.view.WindowManager;
import androidx.p034e.p035a.C0978a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.p3130k.p3131a.C62003a;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.vc.meeting.module.k.a */
public class C61999a extends OrientationListener {

    /* renamed from: a */
    public AbstractC62001a f155776a;

    /* renamed from: b */
    public WeakReference<Activity> f155777b;

    /* renamed from: c */
    private int f155778c;

    /* renamed from: d */
    private int f155779d;

    /* renamed from: e */
    private int f155780e;

    /* renamed from: f */
    private AbstractC62002b f155781f;

    /* renamed from: g */
    private volatile float f155782g;

    /* renamed from: h */
    private boolean f155783h;

    /* renamed from: i */
    private boolean f155784i;

    /* renamed from: j */
    private boolean f155785j;

    /* renamed from: k */
    private long f155786k;

    /* renamed from: l */
    private long f155787l;

    /* renamed from: m */
    private int f155788m;

    /* renamed from: n */
    private int f155789n;

    /* renamed from: o */
    private final Handler f155790o;

    /* renamed from: com.ss.android.vc.meeting.module.k.a$a */
    public interface AbstractC62001a {
        /* renamed from: a */
        void mo214630a(int i);

        /* renamed from: b */
        void mo214631b(int i);
    }

    /* renamed from: com.ss.android.vc.meeting.module.k.a$b */
    public interface AbstractC62002b {
        /* renamed from: a */
        void mo214632a(boolean z);
    }

    /* renamed from: c */
    public static int m242218c(int i) {
        if (i > 340 || i < 20) {
            return 0;
        }
        if (i > 250 && i < 290) {
            return 270;
        }
        if (i <= 70 || i >= 110) {
            return (i <= 160 || i >= 200) ? -1 : 180;
        }
        return 90;
    }

    /* renamed from: g */
    private int m242222g(int i) {
        return 360 - i;
    }

    /* renamed from: i */
    private static boolean m242226i(int i) {
        return i == 270 || i == 90;
    }

    /* renamed from: a */
    public int mo214610a(int i) {
        if (i == -1) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        if (i > 360) {
            i = 360;
        }
        if (i > 340 || i < 20) {
            return 0;
        }
        if (i <= 250 || i >= 290) {
            return (i <= 70 || i >= 110) ? -1 : 1;
        }
        return 3;
    }

    /* renamed from: b */
    public int mo214616b(int i) {
        if (i > 340 || i < 20) {
            return 1;
        }
        if (i <= 70 || i >= 110) {
            return (i <= 250 || i >= 290) ? -1 : 0;
        }
        return 8;
    }

    /* renamed from: e */
    public String mo214624e(int i) {
        return i == 0 ? "ROTATION_0" : i == 1 ? "ROTATION_90" : i == 2 ? "ROTATION_180" : i == 3 ? "ROTATION_270" : "ROTATION_UNKNOWN";
    }

    /* renamed from: f */
    public String mo214626f(int i) {
        return i == 1 ? "SCREEN_ORIENTATION_PORTRAIT" : i == 0 ? "SCREEN_ORIENTATION_LANDSCAPE" : i == 8 ? "SCREEN_ORIENTATION_REVERSE_LANDSCAPE" : "SCREEN_ORIENTATION_UNKONWN";
    }

    /* renamed from: b */
    public void mo214617b() {
        m242219c(true);
    }

    /* renamed from: i */
    private boolean m242225i() {
        if (this.f155783h || !C60776r.m236150h()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private void m242227j() {
        this.f155778c = -1;
        this.f155779d = -1;
        this.f155780e = -1;
        this.f155788m = -1;
        this.f155789n = -1;
    }

    /* renamed from: f */
    public static boolean m242220f() {
        if (C60776r.m236157o()) {
            return false;
        }
        int g = m242221g();
        if (g == 270 || g == 90) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo214611a() {
        this.f155790o.obtainMessage(3).sendToTarget();
        this.f155790o.removeMessages(1);
        this.f155777b = null;
        C62003a.m242256c();
    }

    /* renamed from: c */
    public void mo214621c() {
        C60700b.m235851b("ScreenOrientationHelper@", "[unlock]", "unlock");
        this.f155783h = false;
        m242227j();
        onOrientationChanged(this.f155778c);
    }

    /* renamed from: g */
    public static int m242221g() {
        int rotation = ((WindowManager) ar.m236694a().getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return 180;
        }
        if (rotation != 3) {
            return 0;
        }
        return 270;
    }

    /* renamed from: d */
    public void mo214622d() {
        Activity activity;
        C60700b.m235851b("ScreenOrientationHelper@", "[lockPortraitInFollow]", "lockPortraitInFollow");
        WeakReference<Activity> weakReference = this.f155777b;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (C60773o.m236120a(activity)) {
            activity.setRequestedOrientation(mo214616b(0));
            mo214615a(false);
        }
    }

    /* renamed from: e */
    public void mo214625e() {
        Activity activity;
        C60700b.m235851b("ScreenOrientationHelper@", "[recoveryLandscapeInFollow]", "recoveryLandscapeInFollow");
        WeakReference<Activity> weakReference = this.f155777b;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (C60773o.m236120a(activity)) {
            activity.setRequestedOrientation(mo214616b(270));
            mo214615a(true);
        }
    }

    /* renamed from: h */
    private void m242223h() {
        C62003a.m242251a(this);
        int g = m242221g();
        this.f155780e = g;
        this.f155779d = mo214616b(g);
        C60700b.m235851b("ScreenOrientationHelper@", "[init]", "rotation " + mo214624e(this.f155780e) + " orientation " + mo214626f(this.f155779d));
        this.f155790o.obtainMessage(2).sendToTarget();
    }

    /* renamed from: a */
    public void mo214613a(AbstractC62001a aVar) {
        this.f155776a = aVar;
    }

    /* renamed from: a */
    public void mo214614a(AbstractC62002b bVar) {
        this.f155781f = bVar;
    }

    /* renamed from: b */
    public void mo214618b(AbstractC62001a aVar) {
        if (aVar != null && aVar == this.f155776a) {
            this.f155776a = null;
        }
    }

    /* renamed from: b */
    public void mo214619b(AbstractC62002b bVar) {
        if (bVar != null && bVar == this.f155781f) {
            this.f155781f = null;
        }
    }

    public C61999a(Activity activity) {
        super(activity.getApplicationContext(), 2);
        this.f155778c = -1;
        this.f155779d = -1;
        this.f155780e = -1;
        this.f155782g = BitmapDescriptorFactory.HUE_RED;
        this.f155783h = false;
        this.f155784i = false;
        this.f155785j = false;
        this.f155786k = SystemClock.elapsedRealtime();
        this.f155788m = -1;
        this.f155789n = -1;
        this.f155790o = new Handler(C60735ab.m236017e().getLooper()) {
            /* class com.ss.android.vc.meeting.module.p3130k.C61999a.HandlerC620001 */

            public void handleMessage(Message message) {
                Activity activity;
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        C60700b.m235851b("ScreenOrientationHelper@", "handleMessage", "MSG_ENABLE");
                        C61999a.this.enable();
                    } else if (i == 3) {
                        C60700b.m235851b("ScreenOrientationHelper@", "handleMessage", "MSG_DISABLE");
                        C61999a.this.disable();
                    }
                } else if (!C60776r.m236157o()) {
                    int i2 = message.arg1;
                    int i3 = message.arg2;
                    if (C61999a.this.f155777b != null) {
                        activity = C61999a.this.f155777b.get();
                    } else {
                        activity = null;
                    }
                    if (C60773o.m236120a(activity)) {
                        C60700b.m235851b("ScreenOrientationHelper@", "[onOrientation]", "activity rotation " + i2);
                        activity.setRequestedOrientation(i2);
                        if (i3 == 1 || i3 == 3) {
                            C61999a.this.mo214615a(true);
                        } else {
                            C61999a.this.mo214615a(false);
                        }
                    }
                    C60735ab.m236001a(new Runnable(i2, i3) {
                        /* class com.ss.android.vc.meeting.module.p3130k.$$Lambda$a$1$GjRt_tTiqPIUM_Opc89G4p1RE */
                        public final /* synthetic */ int f$1;
                        public final /* synthetic */ int f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            C61999a.HandlerC620001.this.m242245a(this.f$1, this.f$2);
                        }
                    });
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m242245a(int i, int i2) {
                if (C61999a.this.f155776a != null) {
                    C60700b.m235851b("ScreenOrientationHelper@", "[onOrientation2]", "screen rotation " + C61999a.this.mo214626f(i) + " " + C61999a.this.mo214624e(i2));
                    C61999a.this.f155776a.mo214631b(i);
                    C61999a.this.f155776a.mo214630a(i2);
                }
            }
        };
        this.f155777b = new WeakReference<>(activity);
        m242223h();
    }

    /* renamed from: h */
    private void m242224h(int i) {
        int c;
        if (this.f155781f != null && (c = m242218c(i)) != -1 && this.f155789n != c) {
            C60700b.m235851b("ScreenOrientationHelper@", "[observeOrientation]", "orientation = " + c);
            this.f155789n = c;
            this.f155781f.mo214632a(m242226i(c));
        }
    }

    public C61999a(Context context) {
        super(context, 2);
        this.f155778c = -1;
        this.f155779d = -1;
        this.f155780e = -1;
        this.f155786k = SystemClock.elapsedRealtime();
        this.f155788m = -1;
        this.f155789n = -1;
        this.f155790o = new Handler(C60735ab.m236017e().getLooper()) {
            /* class com.ss.android.vc.meeting.module.p3130k.C61999a.HandlerC620001 */

            public void handleMessage(Message message) {
                Activity activity;
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        C60700b.m235851b("ScreenOrientationHelper@", "handleMessage", "MSG_ENABLE");
                        C61999a.this.enable();
                    } else if (i == 3) {
                        C60700b.m235851b("ScreenOrientationHelper@", "handleMessage", "MSG_DISABLE");
                        C61999a.this.disable();
                    }
                } else if (!C60776r.m236157o()) {
                    int i2 = message.arg1;
                    int i3 = message.arg2;
                    if (C61999a.this.f155777b != null) {
                        activity = C61999a.this.f155777b.get();
                    } else {
                        activity = null;
                    }
                    if (C60773o.m236120a(activity)) {
                        C60700b.m235851b("ScreenOrientationHelper@", "[onOrientation]", "activity rotation " + i2);
                        activity.setRequestedOrientation(i2);
                        if (i3 == 1 || i3 == 3) {
                            C61999a.this.mo214615a(true);
                        } else {
                            C61999a.this.mo214615a(false);
                        }
                    }
                    C60735ab.m236001a(new Runnable(i2, i3) {
                        /* class com.ss.android.vc.meeting.module.p3130k.$$Lambda$a$1$GjRt_tTiqPIUM_Opc89G4p1RE */
                        public final /* synthetic */ int f$1;
                        public final /* synthetic */ int f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            C61999a.HandlerC620001.this.m242245a(this.f$1, this.f$2);
                        }
                    });
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m242245a(int i, int i2) {
                if (C61999a.this.f155776a != null) {
                    C60700b.m235851b("ScreenOrientationHelper@", "[onOrientation2]", "screen rotation " + C61999a.this.mo214626f(i) + " " + C61999a.this.mo214624e(i2));
                    C61999a.this.f155776a.mo214631b(i);
                    C61999a.this.f155776a.mo214630a(i2);
                }
            }
        };
        m242223h();
    }

    /* renamed from: c */
    private void m242219c(boolean z) {
        C60700b.m235851b("ScreenOrientationHelper@", "[lock]", "lockPortrait");
        this.f155785j = true;
        this.f155783h = true;
        if (z) {
            mo214612a(0, true, C60776r.m236157o());
        } else {
            mo214612a(270, true, C60776r.m236157o());
        }
    }

    /* renamed from: a */
    public void mo214615a(boolean z) {
        Intent intent = new Intent("action.broadcast.orientation");
        intent.putExtra("orientation_landscape", z);
        C0978a.m4782a(ar.m236694a()).mo4992a(intent);
    }

    /* renamed from: b */
    public void mo214620b(boolean z) {
        C60700b.m235851b("ScreenOrientationHelper@", "[enableMonitor]", "enable=" + z);
        this.f155784i = z;
        if (z) {
            this.f155785j = true;
        } else {
            m242227j();
        }
    }

    /* renamed from: d */
    public void mo214623d(int i) {
        int c = m242218c(i);
        if (c != -1 && this.f155788m != c) {
            this.f155788m = c;
            C60700b.m235851b("ScreenOrientationHelper@", "[setRtcOrientation]", "orientation = " + this.f155788m);
            C61237h.m238223a().mo210535d(this.f155788m);
        }
    }

    public void onOrientationChanged(int i) {
        if (!this.f155784i) {
            return;
        }
        if (!C60776r.m236157o()) {
            C62003a.f155792a = -1;
            C61237h.m238223a().mo210544g(-1);
            mo214612a(i, false, false);
        } else if (C60776r.m236152j()) {
            if (VCAppLifeCycle.m236255b()) {
                i = 0;
            }
            mo214612a(i, false, true);
            C62003a.m242250a(i);
        } else if (C60776r.m236158p() && C62003a.m242255b()) {
            int g = m242221g();
            if (g == 270) {
                i = 90;
            } else if (g == 90) {
                i = 270;
            }
            mo214612a(i, false, true);
        }
    }

    public void onSensorChanged(int i, float[] fArr) {
        this.f155782g = -fArr[2];
    }

    /* renamed from: a */
    public void mo214612a(int i, boolean z, boolean z2) {
        int b;
        if ((z || (this.f155782g <= 9.0f && this.f155782g >= -9.0f)) && !DesktopUtil.m144307b()) {
            this.f155778c = i;
            if (i == -1) {
                this.f155786k = SystemClock.elapsedRealtime();
            } else if (!z2 && SystemClock.elapsedRealtime() - this.f155786k < 50) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f155787l >= 10) {
                    this.f155787l = currentTimeMillis;
                    C60700b.m235851b("ScreenOrientationHelper@", "[onOrientationChanged]", "filter: " + i);
                }
            } else if (i != -1 && i >= 0 && i <= 360) {
                if (!z) {
                    mo214623d(i);
                }
                m242224h(i);
                if ((z || m242225i()) && (b = mo214616b(i)) != -1 && b != this.f155779d) {
                    this.f155779d = b;
                    this.f155790o.removeMessages(1);
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.arg1 = b;
                    obtain.arg2 = mo214610a(m242222g(i));
                    if (this.f155785j) {
                        this.f155790o.sendMessage(obtain);
                    } else {
                        this.f155790o.sendMessageDelayed(obtain, 400);
                    }
                    this.f155785j = false;
                }
            }
        }
    }
}
