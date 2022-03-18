package com.ss.videoarch.liveplayer.p3254e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.videoarch.liveplayer.log.C65654a;
import com.ss.videoarch.liveplayer.log.C65658c;
import com.ss.videoarch.liveplayer.log.LiveError;
import com.ss.videoarch.liveplayer.p3252c.C65621b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.videoarch.liveplayer.e.a */
public final class C65634a {

    /* renamed from: e */
    private static final SparseIntArray f165203e;

    /* renamed from: f */
    private static final SparseArray<String> f165204f;

    /* renamed from: g */
    private static final SparseArray<String> f165205g;

    /* renamed from: h */
    private static final SparseArray<String> f165206h;

    /* renamed from: a */
    public final AbstractC65636a f165207a;

    /* renamed from: b */
    public final long f165208b;

    /* renamed from: c */
    public long f165209c;

    /* renamed from: d */
    public final Handler f165210d = new Handler(Looper.myLooper()) {
        /* class com.ss.videoarch.liveplayer.p3254e.C65634a.HandlerC656351 */

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 10001) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - C65634a.this.f165209c < C65634a.this.f165208b) {
                    C65634a.this.f165207a.mo229663a(false);
                    C65634a.this.f165210d.sendEmptyMessageDelayed(UpdateDialogStatusCode.DISMISS, 10000);
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("stallTime", Long.valueOf(currentTimeMillis - C65634a.this.f165209c));
                C65634a.this.mo229653a(-1, new LiveError(-100007, "Stall retry timeout", hashMap));
            } else if (i == 10002) {
                C65634a.this.mo229653a(2, (LiveError) null);
            }
        }
    };

    /* renamed from: i */
    private long f165211i = 10000;

    /* renamed from: j */
    private AtomicInteger f165212j = new AtomicInteger(0);

    /* renamed from: k */
    private int f165213k = 7;

    /* renamed from: l */
    private String f165214l = null;

    /* renamed from: m */
    private boolean f165215m = false;

    /* renamed from: n */
    private long f165216n = 0;

    /* renamed from: o */
    private boolean f165217o = false;

    /* renamed from: p */
    private boolean f165218p = false;

    /* renamed from: q */
    private C65654a f165219q;

    /* renamed from: com.ss.videoarch.liveplayer.e.a$a */
    public interface AbstractC65636a {
        /* renamed from: a */
        void mo229661a();

        /* renamed from: a */
        void mo229662a(LiveError liveError);

        /* renamed from: a */
        void mo229663a(boolean z);
    }

    /* renamed from: b */
    public void mo229657b() {
        this.f165218p = true;
    }

    /* renamed from: c */
    public void mo229658c() {
        this.f165218p = false;
    }

    /* renamed from: a */
    public int mo229652a() {
        return this.f165212j.get();
    }

    /* renamed from: d */
    public void mo229659d() {
        this.f165212j.set(0);
        this.f165209c = 0;
        this.f165213k = 7;
        this.f165215m = false;
        this.f165216n = 0;
        this.f165217o = false;
        this.f165210d.removeCallbacksAndMessages(null);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f165203e = sparseIntArray;
        SparseArray<String> sparseArray = new SparseArray<>();
        f165204f = sparseArray;
        SparseArray<String> sparseArray2 = new SparseArray<>();
        f165205g = sparseArray2;
        SparseArray<String> sparseArray3 = new SparseArray<>();
        f165206h = sparseArray3;
        sparseIntArray.put(-100002, 3);
        sparseIntArray.put(-100006, 3);
        sparseIntArray.put(-100007, 3);
        sparseIntArray.put(-100008, 3);
        sparseIntArray.put(-100009, 3);
        sparseIntArray.put(-100013, 3);
        sparseIntArray.put(-100014, 3);
        sparseArray.put(-499988, "media player: setting uri is null error");
        sparseArray.put(-499987, "media player: setting uri is error");
        sparseArray.put(-499986, "media player: url is not mp4 error");
        sparseArray.put(-499985, "media player: invalid data error");
        sparseArray.put(-499899, "media player: http bad request error");
        sparseArray.put(-499898, "media player: http unauthorized error");
        sparseArray.put(-499897, "media player: http forbidden error");
        sparseArray.put(-499896, "media player: http not found error");
        sparseArray.put(-499894, "media player: http other 4xx error");
        sparseArray.put(-499893, "media player: http server error");
        sparseArray.put(-499891, "media player: http content type invalid");
        sparseArray.put(251658241, "media info http redirect");
        sparseArray.put(-499799, "media player: tcp failed to resolve hostname");
        sparseArray.put(-499795, "media player: tcp send data failed");
        sparseArray.put(-499794, "media player: tcp receive data failed");
        sparseArray.put(-499793, "media player: tcp read network timeout");
        sparseArray.put(-499792, "media player: tcp write network timeout");
        sparseArray2.put(-499999, "media player setting is null");
        sparseArray2.put(-499997, "media player start decoder error");
        sparseArray2.put(-499996, "media player open decoder error");
        sparseArray2.put(-499992, "media player open outlet error");
        sparseArray2.put(-499991, "media player start outputer error");
        sparseArray2.put(-499990, "media player start outlet error");
        sparseArray2.put(-499989, "media player open device error");
        sparseArray2.put(1, "android media player unknown");
        sparseArray3.put(-1, "not retry, report to application");
        sparseArray3.put(1, "try next url from live info");
        sparseArray3.put(2, "reset player");
    }

    /* renamed from: a */
    public void mo229655a(String str) {
        this.f165214l = str;
    }

    /* renamed from: b */
    private void m257271b(LiveError liveError) {
        int i = this.f165213k - 1;
        this.f165213k = i;
        if (i >= 0) {
            this.f165219q.mo229706a(liveError.code, liveError.getInfoJSON());
        }
    }

    /* renamed from: a */
    private void m257270a(int i) {
        boolean z = this.f165215m;
        if (!z || (z && System.currentTimeMillis() - this.f165216n >= 1000)) {
            this.f165219q.mo229730c(i);
            this.f165219q.mo229721b(i);
            this.f165215m = true;
            this.f165216n = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public void mo229654a(LiveError liveError) {
        C65658c.m257426b("RetryProcessor", "onError error=" + liveError);
        if (this.f165218p) {
            if (!this.f165217o || liveError.code != -100016) {
                this.f165212j.incrementAndGet();
                int i = 1;
                if (liveError.code != -100016) {
                    this.f165217o = true;
                }
                Map map = liveError.info;
                if (this.f165212j.get() > 700) {
                    i = -1;
                } else {
                    if (liveError.code == -100003) {
                        int i2 = 0;
                        try {
                            i2 = ((Integer) map.get("internalCode")).intValue();
                            liveError.code = i2;
                        } catch (NumberFormatException unused) {
                            map.put("retryError", "error while get player internal error code");
                        }
                        SparseArray<String> sparseArray = f165204f;
                        if (sparseArray.indexOfKey(i2) >= 0) {
                            map.put("playErrorReason", sparseArray.get(i2));
                        }
                    }
                    i = 3;
                }
                if (this.f165212j.get() > 3 && this.f165214l != null) {
                    C65621b.m257243a().mo229637b(this.f165214l);
                }
                this.f165219q.mo229760n();
                mo229653a(i, liveError);
                m257271b(liveError);
                m257270a(liveError.code);
            }
        }
    }

    /* renamed from: a */
    public void mo229656a(boolean z, boolean z2) {
        C65658c.m257426b("RetryProcessor", "onStall " + z);
        if (z) {
            this.f165209c = System.currentTimeMillis();
            if (z2) {
                this.f165207a.mo229663a(true);
                m257270a(-100018);
            }
            if (!this.f165210d.hasMessages(UpdateDialogStatusCode.DISMISS)) {
                this.f165210d.sendEmptyMessageDelayed(UpdateDialogStatusCode.DISMISS, 10000);
            }
            if (!z2) {
                m257270a(-100015);
                return;
            }
            return;
        }
        mo229659d();
    }

    /* renamed from: a */
    public void mo229653a(int i, LiveError liveError) {
        long j;
        C65658c.m257426b("RetryProcessor", "handleRetryForError action=" + i);
        if (i == -1) {
            C65658c.m257425a("RetryProcessor", "ACTION_REPORT_OUTSIDE");
            this.f165207a.mo229662a(liveError);
        } else if (i == 1) {
            C65658c.m257425a("RetryProcessor", "ACTION_NEXT_URL");
            this.f165207a.mo229661a();
        } else if (i == 2) {
            C65658c.m257426b("RetryProcessor", "ACTION_RESET_PLAYER");
            this.f165207a.mo229663a(false);
        } else if (i == 3) {
            C65658c.m257425a("RetryProcessor", "ACTION_RESET_LATER");
            if (!this.f165210d.hasMessages(UpdateDialogStatusCode.SHOW)) {
                C65658c.m257426b("RETRY", "start " + this.f165212j);
                Handler handler = this.f165210d;
                if (this.f165212j.get() > 3) {
                    j = 10000;
                } else {
                    j = (long) (this.f165212j.get() * this.f165212j.get() * 1000);
                }
                handler.sendEmptyMessageDelayed(UpdateDialogStatusCode.SHOW, j);
            }
        }
    }

    public C65634a(AbstractC65636a aVar, int i, long j, C65654a aVar2) {
        this.f165207a = aVar;
        this.f165208b = (long) (i * 1000);
        this.f165211i = j;
        this.f165212j.set(0);
        this.f165219q = aVar2;
    }
}
