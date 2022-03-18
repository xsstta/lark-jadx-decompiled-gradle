package com.ss.android.vesdk.audio;

import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.ttve.model.VEAudioDeviceType;
import com.ss.android.ttve.monitor.C60229h;
import com.ss.android.ttve.nativePort.TESystemUtils;
import com.ss.android.ttve.p3031b.AbstractC60181a;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.C64027k;
import com.ss.android.vesdk.C64083x;
import com.ss.android.vesdk.VEConfigCenter;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vesdk.audio.d */
public class C63943d implements AbstractC63940a {

    /* renamed from: a */
    AbstractC63942c f161466a;

    /* renamed from: b */
    public int f161467b = 3;

    /* renamed from: c */
    public int f161468c = 3;

    /* renamed from: d */
    private int f161469d;

    /* renamed from: e */
    private boolean f161470e;

    /* renamed from: f */
    private boolean f161471f = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_background_strategy", (Object) false)).booleanValue();

    /* renamed from: g */
    private AbstractC63941b f161472g;

    /* renamed from: h */
    private Handler f161473h;

    /* renamed from: i */
    private HandlerThread f161474i;

    /* renamed from: j */
    private ConditionVariable f161475j = new ConditionVariable();

    /* renamed from: k */
    private AtomicBoolean f161476k = new AtomicBoolean(false);

    /* renamed from: l */
    private AbstractC60181a f161477l;

    /* renamed from: m */
    private PrivacyCert f161478m = null;

    /* renamed from: n */
    private ConcurrentHashMap f161479n = new ConcurrentHashMap();

    /* renamed from: o */
    private Object f161480o = new Object();

    /* renamed from: p */
    private C63947f f161481p;

    /* renamed from: a */
    public static HandlerThread m251034a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: b */
    private synchronized void m251038b() {
        if (this.f161474i != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                this.f161474i.quitSafely();
            } else {
                this.f161474i.quit();
            }
            this.f161474i = null;
            this.f161473h = null;
        }
    }

    public C63943d() {
        C63929ab.m250976b("TEAudioCaptureProxy", "KEY_ENABLE_BACKGROUND_STRATEGY : " + this.f161471f);
    }

    /* renamed from: a */
    private synchronized Handler m251033a() {
        Looper looper;
        try {
            HandlerThread handlerThread = this.f161474i;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            HandlerThread a = m251034a("TEAudioCaptureProxy");
            this.f161474i = a;
            a.start();
        } catch (Exception e) {
            C63929ab.m250980d("TEAudioCaptureProxy", "CreateHandler failed!: " + e.toString());
            if (Looper.myLooper() != null) {
                looper = Looper.myLooper();
            } else {
                looper = Looper.getMainLooper();
            }
            return new Handler(looper, new C63945a(this));
        }
        return new Handler(this.f161474i.getLooper(), new C63945a(this));
    }

    /* renamed from: a */
    public void mo221297a(AbstractC63942c cVar) {
        this.f161466a = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vesdk.audio.d$a */
    public static class C63945a implements Handler.Callback {

        /* renamed from: a */
        private WeakReference<C63943d> f161483a;

        public C63945a(C63943d dVar) {
            this.f161483a = new WeakReference<>(dVar);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            C63943d dVar = this.f161483a.get();
            if (dVar == null) {
                C63929ab.m250980d("TEAudioCaptureProxy", "audio capture is null");
                return false;
            }
            if (i == 0) {
                int a = dVar.mo221295a((C64027k) obj);
                C63929ab.m250974a("TEAudioCaptureProxy", "init mic:" + a);
            } else if (i == 1) {
                int b = dVar.mo221298b((PrivacyCert) obj);
                C63929ab.m250974a("TEAudioCaptureProxy", "start mic:" + b);
            } else if (i == 2) {
                int c = dVar.mo221299c((PrivacyCert) obj);
                C63929ab.m250974a("TEAudioCaptureProxy", "stop mic:" + c);
            } else if (i != 3) {
                C63929ab.m250980d("TEAudioCaptureProxy", "mic msg error");
            } else {
                dVar.f161467b = 0;
                dVar.f161468c = 0;
                dVar.mo221296a((PrivacyCert) obj);
                C63929ab.m250974a("TEAudioCaptureProxy", "release mic");
            }
            return false;
        }
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public synchronized int init(C64027k kVar) {
        if (this.f161473h != null) {
            return 0;
        }
        this.f161473h = m251033a();
        this.f161467b = 3;
        this.f161468c = 3;
        m251036a(0, kVar);
        return 0;
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public int start(PrivacyCert privacyCert) {
        if (this.f161473h == null) {
            C63929ab.m250980d("TEAudioCaptureProxy", "mHandler is null!");
            return -108;
        }
        this.f161478m = privacyCert;
        m251036a(1, privacyCert);
        return 0;
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public int stop(PrivacyCert privacyCert) {
        if (this.f161473h == null) {
            C63929ab.m250980d("TEAudioCaptureProxy", "mHandler is null!");
            return -108;
        }
        C60229h.m234091a(0, "te_record_audio_mic_start_info", this.f161479n.toString());
        m251036a(2, privacyCert);
        return 0;
    }

    /* renamed from: c */
    public int mo221299c(PrivacyCert privacyCert) {
        synchronized (this.f161480o) {
            if (this.f161469d != 2) {
                C63929ab.m250980d("TEAudioCaptureProxy", "mic stop in error state: " + this.f161469d);
                return 0;
            }
            AbstractC60181a aVar = this.f161477l;
            if (aVar != null) {
                aVar.mo205508a();
            }
            int stop = this.f161472g.stop(privacyCert);
            this.f161466a.mo221292a(C64083x.f161814I, stop, 0.0d, null);
            this.f161469d = 1;
            return stop;
        }
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public synchronized void release(PrivacyCert privacyCert) {
        if (this.f161473h == null) {
            C63929ab.m250980d("TEAudioCaptureProxy", "mHandler is null!");
            return;
        }
        this.f161476k.set(true);
        long currentTimeMillis = System.currentTimeMillis();
        this.f161475j.close();
        this.f161473h.removeCallbacksAndMessages(null);
        m251036a(3, privacyCert);
        this.f161475j.block(2000);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C63929ab.m250974a("TEAudioCaptureProxy", "mic release cost: " + currentTimeMillis2 + "ms");
        if (currentTimeMillis2 >= 2000) {
            C63929ab.m250980d("TEAudioCaptureProxy", "mic release timeout");
        }
        if (this.f161476k.get() && this.f161472g != null) {
            mo221296a(privacyCert);
        }
        m251038b();
    }

    /* renamed from: b */
    public int mo221298b(PrivacyCert privacyCert) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f161469d != 1) {
            C63929ab.m250976b("TEAudioCaptureProxy", "start in a error state: " + this.f161469d);
            return -105;
        } else if (!this.f161471f || !this.f161470e) {
            AbstractC60181a aVar = this.f161477l;
            if (aVar != null) {
                aVar.mo205509a(this.f161473h);
            }
            int start = this.f161472g.start(privacyCert);
            this.f161469d = 2;
            if (start == -2 || start == 0) {
                this.f161466a.mo221292a(C64083x.f161813H, start, 0.0d, null);
                C60229h.m234090a(0, "te_record_audio_mic_start_ret", 0L);
            } else {
                mo221299c(this.f161478m);
                if (this.f161476k.get() || this.f161468c <= 0) {
                    C60229h.m234090a(0, "te_record_audio_mic_start_ret", (long) start);
                } else {
                    C63929ab.m250980d("TEAudioCaptureProxy", "retry start mic times : " + this.f161468c + " ret: " + start);
                    this.f161468c = this.f161468c - 1;
                    m251037a(1, this.f161478m, 30);
                }
            }
            m251035a(this.f161468c, start, System.currentTimeMillis() - currentTimeMillis);
            return start;
        } else {
            C63929ab.m250980d("TEAudioCaptureProxy", "in background block start");
            this.f161466a.mo221292a(C64083x.f161813H, -1, 0.0d, null);
            return -1;
        }
    }

    /* renamed from: a */
    public int mo221295a(C64027k kVar) {
        int i;
        if (this.f161469d != 0) {
            C63929ab.m250976b("TEAudioCaptureProxy", "init in a error state: " + this.f161469d);
            return -105;
        }
        if (this.f161472g == null) {
            if (TESystemUtils.getOutputAudioDeviceType() == VEAudioDeviceType.BLUETOOTH.ordinal()) {
                C60229h.m234090a(0, "te_record_audio_earback_type", 4L);
            }
            kVar.mo221697g();
            TEAudioRecord tEAudioRecord = new TEAudioRecord();
            this.f161472g = tEAudioRecord;
            tEAudioRecord.setAudioCallback(new AbstractC63942c() {
                /* class com.ss.android.vesdk.audio.C63943d.C639441 */

                @Override // com.ss.android.vesdk.audio.AbstractC63942c
                /* renamed from: a */
                public void mo221294a(C63948g gVar) {
                    if (C63943d.this.f161466a != null) {
                        C63943d.this.f161466a.mo221294a(gVar);
                    }
                }

                @Override // com.ss.android.vesdk.audio.AbstractC63942c
                /* renamed from: a */
                public void mo221293a(int i, int i2, String str) {
                    if (C63943d.this.f161466a != null) {
                        C63943d.this.f161466a.mo221293a(i, i2, str);
                    }
                }

                @Override // com.ss.android.vesdk.audio.AbstractC63942c
                /* renamed from: a */
                public void mo221292a(int i, int i2, double d, Object obj) {
                    if (i != C64083x.f161812G || i2 == 0 || C63943d.this.f161467b <= 0) {
                        if (C63943d.this.f161466a != null) {
                            C63943d.this.f161466a.mo221292a(i, i2, d, obj);
                        }
                        if (i == C64083x.f161818M) {
                            C60229h.m234090a(0, "te_record_audio_mic_running_err", (long) i2);
                        }
                    }
                }
            });
            this.f161472g.setHandler(this.f161473h);
        }
        int init = this.f161472g.init(kVar);
        this.f161469d = 1;
        if (init != 0) {
            mo221296a(this.f161478m);
            if (!this.f161476k.get() && (i = this.f161467b) > 0) {
                this.f161467b = i - 1;
                m251037a(0, kVar, 30);
            }
        }
        if (init == 0 || this.f161467b == 0) {
            C60229h.m234090a(0, "te_record_audio_mic_init_ret", (long) init);
        }
        C63929ab.m250974a("TEAudioCaptureProxy", "retry int mic times : " + this.f161467b + " ret: " + init);
        return init;
    }

    /* renamed from: a */
    public void mo221296a(PrivacyCert privacyCert) {
        synchronized (this.f161480o) {
            if (this.f161469d == 2) {
                mo221299c(privacyCert);
            }
            AbstractC60181a aVar = this.f161477l;
            if (aVar != null) {
                aVar.mo205510b();
                this.f161477l = null;
            }
            AbstractC63941b bVar = this.f161472g;
            if (bVar != null) {
                bVar.release(privacyCert);
                this.f161472g = null;
            }
            this.f161476k.set(false);
            this.f161475j.open();
            this.f161469d = 0;
        }
    }

    /* renamed from: a */
    private void m251036a(int i, Object obj) {
        m251037a(i, obj, 0);
    }

    /* renamed from: a */
    private void m251035a(int i, int i2, long j) {
        ConcurrentHashMap concurrentHashMap = this.f161479n;
        concurrentHashMap.put("micStartRet" + i, Integer.valueOf(i2));
        ConcurrentHashMap concurrentHashMap2 = this.f161479n;
        concurrentHashMap2.put("micStartCost" + i, Long.valueOf(j));
    }

    /* renamed from: a */
    private void m251037a(int i, Object obj, long j) {
        Handler handler = this.f161473h;
        if (handler == null) {
            C63929ab.m250974a("TEAudioCaptureProxy", "send MSG error mHandler is null");
            return;
        }
        if (handler.hasMessages(i)) {
            this.f161473h.removeMessages(i);
        }
        Message obtain = Message.obtain();
        obtain.obj = obj;
        obtain.what = i;
        if (j <= 0) {
            this.f161473h.sendMessage(obtain);
        } else {
            this.f161473h.sendMessageDelayed(obtain, j);
        }
    }
}
