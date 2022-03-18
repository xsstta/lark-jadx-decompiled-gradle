package com.ss.android.ad.splash.core.video;

import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.SurfaceHolder;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b;
import com.ss.android.ad.splash.core.video.p1253a.C27387d;
import com.ss.android.ad.splash.utils.C27477g;
import com.ss.android.ad.splash.utils.HandlerC27486n;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ad.splash.core.video.c */
public class C27390c implements AbstractC27378b.AbstractC27379a, AbstractC27378b.AbstractC27380b, AbstractC27378b.AbstractC27381c, AbstractC27378b.AbstractC27382d, AbstractC27378b.AbstractC27383e, AbstractC27378b.AbstractC27384f, HandlerC27486n.AbstractC27487a {

    /* renamed from: m */
    private static boolean f68401m;

    /* renamed from: n */
    private static Map<Integer, Integer> f68402n = new HashMap();

    /* renamed from: a */
    public AbstractC27378b f68403a;

    /* renamed from: b */
    public int f68404b;

    /* renamed from: c */
    public Handler f68405c;

    /* renamed from: d */
    public boolean f68406d;

    /* renamed from: e */
    private boolean f68407e;

    /* renamed from: f */
    private boolean f68408f;

    /* renamed from: g */
    private boolean f68409g;

    /* renamed from: h */
    private long f68410h;

    /* renamed from: i */
    private Handler f68411i;

    /* renamed from: j */
    private ArrayList<Runnable> f68412j;

    /* renamed from: k */
    private int f68413k;

    /* renamed from: l */
    private int f68414l;

    /* renamed from: o */
    private final Set<SurfaceTexture> f68415o;

    /* renamed from: p */
    private final Object f68416p;

    /* renamed from: q */
    private StringBuilder f68417q;

    /* renamed from: b */
    public static HandlerThread m99929b(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    public void mo97810a(boolean z, long j, boolean z2) {
        this.f68406d = false;
        if (!z2) {
            if (this.f68403a != null) {
                m99927a(true);
            }
        } else if (this.f68403a != null) {
            m99927a(false);
        }
        if (z) {
            mo97813d();
            this.f68410h = j;
            return;
        }
        m99930b(new Runnable() {
            /* class com.ss.android.ad.splash.core.video.C27390c.RunnableC273911 */

            public void run() {
                C27390c.this.f68405c.sendEmptyMessageDelayed(100, 50);
            }
        });
    }

    /* renamed from: a */
    public void mo97809a(final String str) {
        m99930b(new Runnable() {
            /* class com.ss.android.ad.splash.core.video.C27390c.RunnableC273944 */

            public void run() {
                C27390c.this.mo97807a();
                if (C27390c.this.f68405c != null) {
                    C27390c.this.f68405c.obtainMessage(ActivityIdentificationData.WALKING, str).sendToTarget();
                }
            }
        });
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b.AbstractC27380b
    /* renamed from: a */
    public void mo97793a(AbstractC27378b bVar, int i) {
        Handler handler;
        if (this.f68403a == bVar && (handler = this.f68411i) != null) {
            handler.obtainMessage(301, Integer.valueOf(i)).sendToTarget();
        }
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b.AbstractC27381c
    /* renamed from: a */
    public void mo97794a(AbstractC27378b bVar) {
        this.f68404b = !this.f68407e ? 209 : SmEvents.EVENT_NONET;
        f68402n.remove(Integer.valueOf(this.f68413k));
        Handler handler = this.f68411i;
        if (handler != null) {
            handler.obtainMessage(302).sendToTarget();
        }
        m99931c("completion");
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b.AbstractC27382d
    /* renamed from: a */
    public boolean mo97795a(AbstractC27378b bVar, int i, int i2) {
        this.f68404b = LocationRequest.PRIORITY_HD_ACCURACY;
        m99932f();
        Handler handler = this.f68411i;
        if (handler == null) {
            return false;
        }
        handler.obtainMessage(303, i, i2).sendToTarget();
        return false;
    }

    /* renamed from: i */
    private void m99935i() {
        if (f68401m) {
            m99925a(this.f68414l, false);
            f68401m = false;
        }
    }

    /* renamed from: d */
    public void mo97813d() {
        m99930b(new Runnable() {
            /* class com.ss.android.ad.splash.core.video.C27390c.RunnableC273922 */

            public void run() {
                if (C27390c.this.f68405c != null) {
                    C27390c.this.f68405c.sendEmptyMessage(104);
                }
            }
        });
    }

    /* renamed from: e */
    public void mo97814e() {
        Handler handler = this.f68405c;
        if (handler != null) {
            handler.obtainMessage(108).sendToTarget();
        }
    }

    /* renamed from: g */
    private void m99933g() {
        ArrayList<Runnable> arrayList = this.f68412j;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f68412j.clear();
        }
    }

    /* renamed from: h */
    private int m99934h() {
        AudioManager audioManager = (AudioManager) C27287e.m99221T().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 0;
    }

    /* renamed from: f */
    private void m99932f() {
        Integer num = f68402n.get(Integer.valueOf(this.f68413k));
        if (num == null) {
            f68402n.put(Integer.valueOf(this.f68413k), 1);
        } else {
            f68402n.put(Integer.valueOf(this.f68413k), Integer.valueOf(num.intValue() + 1));
        }
    }

    /* renamed from: b */
    public void mo97811b() {
        this.f68405c.removeMessages(100);
        this.f68406d = true;
        this.f68405c.sendEmptyMessage(101);
    }

    /* renamed from: c */
    public void mo97812c() {
        this.f68404b = SmEvents.EVENT_HBRESET;
        if (this.f68403a != null) {
            m99933g();
            if (this.f68405c != null) {
                try {
                    m99931c("release");
                    this.f68405c.removeCallbacksAndMessages(null);
                    this.f68409g = true;
                    this.f68405c.sendEmptyMessage(103);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo97807a() {
        if (this.f68403a == null) {
            C27477g.m100326a("SplashAdSdk", "SSMediaPlayerWrapper use System Mediaplayer");
            C27387d dVar = new C27387d();
            this.f68403a = dVar;
            dVar.mo97771a((AbstractC27378b.AbstractC27384f) this);
            this.f68403a.mo97768a((AbstractC27378b.AbstractC27381c) this);
            this.f68403a.mo97769a((AbstractC27378b.AbstractC27382d) this);
            this.f68403a.mo97767a((AbstractC27378b.AbstractC27380b) this);
            this.f68403a.mo97766a((AbstractC27378b.AbstractC27379a) this);
            this.f68403a.mo97770a((AbstractC27378b.AbstractC27383e) this);
            this.f68403a.mo97784b(this.f68407e);
            this.f68408f = false;
        }
    }

    public C27390c(Handler handler) {
        this(handler, -1);
    }

    /* renamed from: a */
    private boolean m99928a(SurfaceTexture surfaceTexture) {
        boolean contains;
        synchronized (this.f68415o) {
            contains = this.f68415o.contains(surfaceTexture);
        }
        return contains;
    }

    /* renamed from: b */
    private void m99930b(Runnable runnable) {
        if (runnable != null) {
            if (!this.f68409g) {
                runnable.run();
            } else {
                m99926a(runnable);
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b.AbstractC27379a
    /* renamed from: c */
    public void mo97792c(AbstractC27378b bVar) {
        Handler handler = this.f68411i;
        if (handler != null) {
            handler.sendEmptyMessage(306);
        }
    }

    /* renamed from: c */
    private void m99931c(String str) {
        Handler handler = this.f68405c;
        if (handler != null) {
            handler.removeMessages(201);
        }
        synchronized (this.f68416p) {
            if (this.f68417q != null) {
                this.f68417q = null;
            }
        }
    }

    /* renamed from: a */
    private void m99926a(Runnable runnable) {
        if (this.f68412j == null) {
            this.f68412j = new ArrayList<>();
        }
        this.f68412j.add(runnable);
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b.AbstractC27384f
    /* renamed from: b */
    public void mo97797b(AbstractC27378b bVar) {
        this.f68404b = SmEvents.EVENT_HB_NOTICE_DISCONNECT;
        if (this.f68406d) {
            this.f68405c.post(new Runnable() {
                /* class com.ss.android.ad.splash.core.video.C27390c.RunnableC273955 */

                public void run() {
                    try {
                        C27390c.this.f68403a.mo97785e();
                        C27390c.this.f68404b = 207;
                        C27390c.this.f68406d = false;
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            Handler handler = this.f68405c;
            handler.sendMessage(handler.obtainMessage(100, -1, -1));
        }
        f68402n.remove(Integer.valueOf(this.f68413k));
        Handler handler2 = this.f68411i;
        if (handler2 != null) {
            handler2.sendEmptyMessage(305);
        }
    }

    /* renamed from: a */
    private void m99927a(boolean z) {
        if (z) {
            try {
                this.f68403a.mo97777a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            } catch (Throwable unused) {
            }
        } else {
            this.f68403a.mo97777a(1.0f, 1.0f);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ad.splash.utils.HandlerC27486n.AbstractC27487a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo97152a(android.os.Message r17) {
        /*
        // Method dump skipped, instructions count: 620
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.video.C27390c.mo97152a(android.os.Message):void");
    }

    /* renamed from: a */
    public void mo97808a(final SurfaceHolder surfaceHolder) {
        m99930b(new Runnable() {
            /* class com.ss.android.ad.splash.core.video.C27390c.RunnableC273933 */

            public void run() {
                C27390c.this.mo97807a();
                if (C27390c.this.f68405c != null) {
                    C27390c.this.f68405c.obtainMessage(SmEvents.EVENT_NO, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    /* renamed from: a */
    private void m99924a(int i, Object obj) {
        if (i == 309) {
            m99935i();
        }
        Handler handler = this.f68411i;
        if (handler != null) {
            handler.obtainMessage(i, obj).sendToTarget();
        }
    }

    public C27390c(Handler handler, int i) {
        this.f68404b = 201;
        this.f68410h = -1;
        this.f68415o = new HashSet();
        this.f68416p = new Object();
        this.f68417q = null;
        this.f68413k = 0;
        this.f68411i = handler;
        HandlerThread b = m99929b("VideoManager");
        b.start();
        this.f68405c = new HandlerC27486n(b.getLooper(), this);
        mo97807a();
    }

    /* renamed from: a */
    private void m99925a(int i, boolean z) {
        int h;
        if (z && (h = m99934h()) != i) {
            f68401m = true;
            this.f68414l = h;
        }
        AudioManager audioManager = (AudioManager) C27287e.m99221T().getSystemService("audio");
        if (audioManager != null) {
            audioManager.setStreamVolume(3, i, 0);
        }
    }

    @Override // com.ss.android.ad.splash.core.video.p1253a.AbstractC27378b.AbstractC27383e
    /* renamed from: b */
    public boolean mo97796b(AbstractC27378b bVar, int i, int i2) {
        Handler handler;
        if (this.f68403a == bVar && (handler = this.f68411i) != null) {
            handler.obtainMessage(304, i, i2).sendToTarget();
        }
        return false;
    }
}
