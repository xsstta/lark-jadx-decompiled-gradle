package com.ss.android.vesdk.runtime;

import android.content.Context;
import android.util.Log;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.EffectApplicationInfo;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.ttve.editorInfo.C60192a;
import com.ss.android.ttve.monitor.C60217b;
import com.ss.android.ttve.monitor.C60223e;
import com.ss.android.ttve.monitor.C60225f;
import com.ss.android.ttve.monitor.C60227g;
import com.ss.android.ttve.monitor.C60229h;
import com.ss.android.ttve.monitor.IMonitor;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.C63959c;
import com.ss.android.vesdk.C64024i;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.keyvaluepair.C64030a;
import com.ss.android.vesdk.runtime.p3193a.C64057a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class VERuntime {

    /* renamed from: a */
    Context f161723a;

    /* renamed from: b */
    public WeakReference<VEListener.AbstractC63881x> f161724b;

    /* renamed from: c */
    public WeakReference<VEListener.AbstractC63860c> f161725c;

    /* renamed from: d */
    public VEListener.AbstractC63874q f161726d;

    /* renamed from: e */
    private boolean f161727e;

    /* renamed from: f */
    private boolean f161728f;

    /* renamed from: g */
    private C64064f f161729g;

    /* renamed from: h */
    private C64062d f161730h;

    /* renamed from: i */
    private boolean f161731i;

    /* renamed from: j */
    private boolean f161732j;

    /* renamed from: k */
    private VESize f161733k;

    /* renamed from: l */
    private C64024i f161734l;

    /* renamed from: m */
    private boolean f161735m;

    /* renamed from: n */
    private IMonitor f161736n;

    /* renamed from: o */
    private C60217b.AbstractC60218a f161737o;

    /* renamed from: p */
    private C60227g.AbstractC60228a f161738p;

    /* renamed from: q */
    private C64057a f161739q;

    /* renamed from: a */
    public static Thread m251383a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: a */
    public static void m251385a(boolean z) {
    }

    private static native void nativeEnableAudioSDKApiV2(boolean z);

    private static native void nativeEnableCrossPlatGLBaseFBO(boolean z);

    private native void nativeEnableHDByteVC1HWDecoder(boolean z, int i);

    private native void nativeEnableHDH264HWDecoder(boolean z, int i);

    private native void nativeEnableHDMpeg24VP89HWDecoder(boolean z);

    private native void nativeEnableHighFpsByteVC1HWDecoder(boolean z, int i, int i2);

    private native void nativeEnableHighFpsH264HWDecoder(boolean z, int i, int i2);

    private static native void nativeEnableImport10BitByteVC1Video(boolean z);

    private static native void nativeEnableRenderLib(boolean z);

    private native void nativeEnableTTByteVC1Decoder(boolean z);

    private static native void nativeEnableTransitionKeyFrame(boolean z);

    private native long nativeGetNativeContext();

    private static native double nativeGetVirtualMemInfo();

    private static native boolean nativeIsArm64();

    private static native void nativeSetNativeLibraryDir(String str);

    /* renamed from: e */
    public void mo221785e(boolean z) {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vesdk.runtime.VERuntime$a */
    public enum EnumC64055a {
        INSTANCE;
        
        private VERuntime veRuntime = new VERuntime();

        public VERuntime getInstance() {
            return this.veRuntime;
        }

        private EnumC64055a() {
        }
    }

    /* renamed from: d */
    public C64062d mo221782d() {
        return this.f161730h;
    }

    /* renamed from: e */
    public Context mo221784e() {
        return this.f161723a;
    }

    /* renamed from: f */
    public boolean mo221786f() {
        return this.f161732j;
    }

    /* renamed from: a */
    public static VERuntime m251382a() {
        return EnumC64055a.INSTANCE.getInstance();
    }

    /* renamed from: b */
    public boolean mo221780b() {
        return this.f161731i;
    }

    /* renamed from: c */
    public VESize mo221781c() {
        return this.f161733k;
    }

    /* renamed from: g */
    public long mo221789g() {
        return nativeGetNativeContext();
    }

    /* renamed from: h */
    private void m251388h() {
        Context context = this.f161723a;
        if (context != null) {
            nativeSetNativeLibraryDir(context.getApplicationInfo().nativeLibraryDir);
        }
        m251383a(new Thread() {
            /* class com.ss.android.vesdk.runtime.VERuntime.C640544 */

            public void run() {
                try {
                    C60225f.m234081a(VERuntime.this.f161723a);
                    if (!((Boolean) C64057a.m251415a().mo221798b("sensor_reported", false)).booleanValue()) {
                        C60223e.m234071a(VERuntime.this.f161723a);
                        C64057a.m251415a().mo221796a("sensor_reported", true);
                    }
                } catch (Exception e) {
                    Log.e("VERuntime", "DeviceInfoDetector init failed", e);
                }
                C64030a aVar = new C64030a();
                aVar.mo221705a("iesve_vesdk_init_finish_result", "success");
                aVar.mo221705a("iesve_vesdk_init_finish_reason", "null");
                C60223e.m234073a("iesve_vesdk_init_finish", 1, aVar);
            }
        }).start();
    }

    private VERuntime() {
        this.f161733k = new VESize(0, 0);
        this.f161735m = false;
        this.f161736n = new IMonitor() {
            /* class com.ss.android.vesdk.runtime.VERuntime.C640511 */

            @Override // com.ss.android.ttve.monitor.IMonitor
            public void monitorLog(String str, JSONObject jSONObject) {
                if (VERuntime.this.f161724b != null && VERuntime.this.f161724b.get() != null) {
                    VERuntime.this.f161724b.get().mo196109a(str, jSONObject);
                }
            }
        };
        this.f161737o = new C60217b.AbstractC60218a() {
            /* class com.ss.android.vesdk.runtime.VERuntime.C640522 */

            @Override // com.ss.android.ttve.monitor.C60217b.AbstractC60218a
            /* renamed from: a */
            public void mo205706a(String str, JSONObject jSONObject, String str2, String str3, String str4) {
                if (VERuntime.this.f161725c != null && VERuntime.this.f161725c.get() != null) {
                    VERuntime.this.f161725c.get().mo196108a(str, jSONObject, str2, str3, str4);
                }
            }
        };
        this.f161738p = new C60227g.AbstractC60228a() {
            /* class com.ss.android.vesdk.runtime.VERuntime.C640533 */

            @Override // com.ss.android.ttve.monitor.C60227g.AbstractC60228a
            /* renamed from: a */
            public void mo205709a(Throwable th) {
                if (VERuntime.this.f161726d != null) {
                    VERuntime.this.f161726d.mo220853a(th);
                }
            }
        };
    }

    /* renamed from: a */
    private void m251384a(Context context) {
        EffectApplicationInfo.m8985a(context);
    }

    /* renamed from: b */
    public static void m251386b(boolean z) {
        nativeEnableCrossPlatGLBaseFBO(z);
    }

    /* renamed from: c */
    public static void m251387c(boolean z) {
        nativeEnableRenderLib(z);
    }

    /* renamed from: d */
    public void mo221783d(boolean z) {
        this.f161731i = z;
    }

    /* renamed from: g */
    public int mo221788g(boolean z) {
        if (this.f161730h == null) {
            return -108;
        }
        VEEffectConfig.setEnableStickerAmazing(z);
        return 0;
    }

    /* renamed from: i */
    public int mo221791i(boolean z) {
        if (!this.f161735m) {
            C63929ab.m250980d("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableTransitionKeyFrame(z);
        this.f161732j = z;
        return 0;
    }

    /* renamed from: f */
    public boolean mo221787f(boolean z) {
        this.f161727e = z;
        C63959c.m251063a(z);
        if (!this.f161727e) {
            return true;
        }
        Context context = this.f161723a;
        if (context != null) {
            mo221777a(new AssetResourceFinder(context.getAssets(), ""));
            return true;
        }
        C63929ab.m250976b("VERuntime", "mContext is null!!! need init");
        return false;
    }

    /* renamed from: h */
    public int mo221790h(boolean z) {
        if (!this.f161735m) {
            C63929ab.m250980d("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableHDMpeg24VP89HWDecoder(z);
        return 0;
    }

    /* renamed from: a */
    public void mo221775a(VEListener.AbstractC63860c cVar) {
        this.f161725c = new WeakReference<>(cVar);
        C60217b.m234041a(this.f161737o);
    }

    /* renamed from: a */
    public void mo221776a(VEListener.AbstractC63881x xVar) {
        this.f161724b = new WeakReference<>(xVar);
        C60229h.m234093a(this.f161736n);
    }

    /* renamed from: a */
    public boolean mo221777a(ResourceFinder resourceFinder) {
        C63959c.m251062a(resourceFinder);
        VEEffectConfig.setResourceFinder(resourceFinder);
        this.f161727e = false;
        this.f161728f = true;
        VEEffectConfig.configEffect("", "nexus");
        return true;
    }

    /* renamed from: b */
    public int mo221778b(boolean z, int i) {
        if (!this.f161735m) {
            C63929ab.m250980d("VERuntime", "runtime not init");
            return -108;
        }
        if (i <= 720) {
            i = 730;
        }
        nativeEnableHDByteVC1HWDecoder(z, i);
        return 0;
    }

    /* renamed from: a */
    public int mo221772a(boolean z, int i) {
        if (!this.f161735m) {
            C63929ab.m250980d("VERuntime", "runtime not init");
            return -108;
        }
        if (i <= 320) {
            i = 330;
        }
        nativeEnableHDH264HWDecoder(z, i);
        return 0;
    }

    /* renamed from: a */
    public void mo221774a(Context context, String str) {
        if (!this.f161735m) {
            this.f161735m = true;
            this.f161723a = context;
            VEEffectConfig.setCacheDir(context.getCacheDir().getAbsolutePath());
            TENativeLibsLoader.m234144a(context);
            C64062d dVar = new C64062d();
            this.f161730h = dVar;
            dVar.mo221803a(str);
            this.f161734l = new C64024i();
            this.f161729g = new C64064f(m251382a().mo221782d().mo221802a());
            C64057a a = C64057a.m251415a();
            this.f161739q = a;
            a.mo221795a(context);
            C60229h.m234092a(this.f161723a, (String) this.f161739q.mo221798b("KEY_DEVICEID", ""));
            C60217b.m234040a();
            C60192a.m233967a();
            C63959c.m251061a(context);
            m251388h();
            m251384a(context);
        }
    }

    /* renamed from: b */
    public int mo221779b(boolean z, int i, int i2) {
        if (!this.f161735m) {
            C63929ab.m250980d("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableHighFpsByteVC1HWDecoder(z, i, i2);
        return 0;
    }

    /* renamed from: a */
    public int mo221773a(boolean z, int i, int i2) {
        if (!this.f161735m) {
            C63929ab.m250980d("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableHighFpsH264HWDecoder(z, i, i2);
        return 0;
    }
}
