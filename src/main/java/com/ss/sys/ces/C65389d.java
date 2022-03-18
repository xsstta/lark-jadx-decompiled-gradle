package com.ss.sys.ces;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.sys.ces.p3234e.C65393a;
import com.ss.sys.ces.p3234e.C65396c;
import com.ss.sys.ces.p3236g.C65403b;
import com.ss.sys.ces.p3236g.C65404c;
import com.ss.sys.ces.p3236g.C65405d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import p001a.p002a.p003a.p004a.C0007b;
import p001a.p002a.p003a.p005b.C0030c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.sys.ces.d */
public class C65389d {

    /* renamed from: a */
    private String f164643a = "";

    /* renamed from: b */
    private String f164644b = "";

    /* renamed from: c */
    private Handler f164645c;

    /* renamed from: d */
    private Context f164646d;

    /* renamed from: e */
    private int f164647e;

    /* renamed from: f */
    private int f164648f = -1;

    /* renamed from: g */
    private int f164649g = -1;

    /* renamed from: h */
    private boolean f164650h = false;

    /* renamed from: com.ss.sys.ces.d$a */
    class RunnableC65390a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f164651a;

        RunnableC65390a(CountDownLatch countDownLatch) {
            this.f164651a = countDownLatch;
        }

        public void run() {
            Looper.prepare();
            C65389d.this.f164645c = new Handler(new C65391b());
            this.f164651a.countDown();
            Looper.loop();
        }
    }

    /* renamed from: com.ss.sys.ces.d$b */
    class C65391b implements Handler.Callback {
        C65391b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo225048a(int i) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo225049a(int i, long j) {
            if (C65389d.this.f164647e == -1 || C65389d.this.f164647e == -2) {
                C65389d.this.f164645c.getLooper().quit();
            }
        }

        public boolean handleMessage(Message message) {
            long a = mo225048a(message.what);
            try {
                switch (message.what) {
                    case 1:
                        C65389d.this.m256438h();
                        break;
                    case 2:
                        C65389d.this.m256436g();
                        break;
                    case 3:
                        C65389d.this.m256440i();
                        break;
                    case 4:
                        C65389d.this.m256428c();
                        break;
                    case 5:
                        C65389d.this.m256432e();
                        break;
                    case 6:
                        C65389d.this.m256430d();
                        break;
                    case 7:
                        C65389d.this.m256434f();
                        break;
                    case 8:
                        if (message.obj instanceof String) {
                            C65389d.this.m256427b((C65389d) ((String) message.obj));
                            break;
                        }
                        break;
                }
            } catch (Throwable unused) {
                C65389d.this.f164647e = -2;
            }
            mo225049a(message.what, a);
            return true;
        }
    }

    static {
        m256426b();
        m256423a();
    }

    private C65389d(Context context) {
        this.f164646d = context;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new_insert_after_java_lang_Thread_by_knot(new Thread(new RunnableC65390a(countDownLatch), "CZL-MRL")).start();
        try {
            countDownLatch.await();
        } catch (Exception unused) {
            C0030c.m48a("CesWorker create failed.");
        }
    }

    /* renamed from: a */
    static synchronized C65389d m256422a(Context context) {
        C65389d dVar;
        synchronized (C65389d.class) {
            dVar = new C65389d(context);
        }
        return dVar;
    }

    /* renamed from: a */
    private static Map<Integer, String> m256423a() {
        return new HashMap();
    }

    /* renamed from: b */
    private static Map<Integer, String> m256426b() {
        return new HashMap();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m256427b(String str) {
        C65403b.m256485a(this.f164646d, str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m256428c() {
        if (this.f164647e == 3) {
            mo225045a("SS-LaunchReport");
            this.f164647e = 4;
            m256443k();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private void m256430d() {
        if (this.f164647e == 4 && this.f164649g > 0) {
            C65386a.metas(139, this.f164646d, null);
            this.f164645c.sendEmptyMessageDelayed(6, (long) (this.f164649g * 1000));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private void m256432e() {
        if (this.f164647e == 4 && this.f164648f > 0) {
            mo225045a("CZL-MLP");
            this.f164645c.sendEmptyMessageDelayed(5, (long) (this.f164648f * 1000));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m256434f() {
        int i;
        if (this.f164647e == 4) {
            if (!C65404c.m256487a(this.f164646d) || !m256442j()) {
                i = -2;
            } else if (!this.f164650h) {
                i = -1;
            } else {
                m256443k();
                return;
            }
            this.f164647e = i;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private void m256436g() {
        if (this.f164647e == 1) {
            if (!C65404c.m256487a(this.f164646d) || !m256442j()) {
                this.f164647e = -2;
            } else if (!this.f164650h) {
                this.f164647e = -1;
            } else {
                this.f164647e = 2;
                this.f164645c.sendEmptyMessage(3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private void m256438h() {
        if (this.f164647e == 0) {
            if (this.f164646d != null) {
                try {
                    C65386a.metas(101, null, "0");
                    C65386a.metas(102, null, "" + C0007b.m13a());
                    C65386a.metas(1020, null, "");
                    C65386a.metas(LocationRequest.PRIORITY_NO_POWER, null, "" + C65393a.m256456d(this.f164646d));
                    C65386a.metas(106, null, "" + C65393a.m256455c(this.f164646d));
                    C65386a.metas(ActivityIdentificationData.WALKING, null, "" + C65393a.m256453b(this.f164646d));
                    C65386a.metas(108, null, "" + C65393a.m256451a(this.f164646d));
                    C65386a.metas(SmEvents.EVENT_NR, null, "" + C65393a.m256454c());
                    C65386a.metas(SmEvents.EVENT_NO, null, "" + C65393a.m256452b());
                    C65386a.metas(SmEvents.EVENT_NE_RR, null, C65393a.m256457e(this.f164646d));
                    C65386a.metas(SmEvents.EVENT_RE, null, C65396c.m256465b(this.f164646d));
                    C65386a.metas(SmEvents.EVENT_TO, null, "1.2.2-Lark");
                    String str = this.f164643a;
                    if (str != null && str.length() > 0) {
                        C65386a.metas(103, null, this.f164643a);
                    }
                    String str2 = this.f164644b;
                    if (str2 != null && str2.length() > 0) {
                        C65386a.metas(104, null, this.f164644b);
                    }
                    this.f164647e = 1;
                    this.f164645c.sendEmptyMessage(2);
                    return;
                } catch (Throwable unused) {
                }
            }
            this.f164647e = -2;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i */
    private void m256440i() {
        if (this.f164647e == 2) {
            if (!C65405d.m256489a(this.f164646d)) {
                this.f164647e = -2;
                return;
            }
            this.f164647e = 3;
            this.f164645c.sendEmptyMessage(4);
        }
    }

    /* renamed from: j */
    private boolean m256442j() {
        try {
            int[] iArr = (int[]) C65386a.metas(138, this.f164646d, null);
            if (iArr != null && iArr.length == 4) {
                boolean z = iArr[0] == 1;
                int i = iArr[1];
                boolean z2 = iArr[2] == 1;
                int i2 = iArr[3];
                this.f164650h = z2;
                if (!z) {
                    i = -1;
                }
                this.f164649g = i;
                if (!z2) {
                    i2 = -1;
                }
                this.f164648f = i2;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: k */
    private void m256443k() {
        int i;
        int i2;
        this.f164645c.sendEmptyMessageDelayed(7, 3600000);
        if (!this.f164645c.hasMessages(5) && (i2 = this.f164648f) > 0) {
            this.f164645c.sendEmptyMessageDelayed(5, (long) (i2 * 1000));
        }
        if (!this.f164645c.hasMessages(6) && (i = this.f164649g) > 0) {
            this.f164645c.sendEmptyMessageDelayed(6, (long) (i * 1000));
        }
        if (this.f164645c.hasMessages(5) && this.f164648f <= 0) {
            this.f164645c.removeMessages(5);
        }
        if (this.f164645c.hasMessages(6) && this.f164649g <= 0) {
            this.f164645c.removeMessages(6);
        }
    }

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: a */
    public void mo225045a(String str) {
        this.f164645c.sendMessage(this.f164645c.obtainMessage(8, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo225046a(String str, String str2, boolean z) {
        this.f164643a = str;
        this.f164644b = str2;
        this.f164645c.sendEmptyMessage(1);
    }
}
