package org.chromium;

import android.os.Process;
import com.bytedance.frameworks.baselib.network.http.cronet.TTNetInitMetrics;
import com.ttnet.org.chromium.net.TTEventListener;
import com.ttnet.org.chromium.net.impl.CronetLibraryLoader;
import java.util.List;
import java.util.Map;

/* renamed from: org.chromium.e */
public class C70013e extends TTEventListener {

    /* renamed from: a */
    private static volatile C70013e f174993a;

    /* renamed from: b */
    private boolean f174994b;

    private C70013e() {
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public void onColdStartFinish() {
        if (this.f174994b) {
            C70010c.m268520a().mo246401b();
        }
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public void onCronetBootSucceed() {
        if (this.f174994b) {
            C70010c.m268520a().mo246404c();
        }
    }

    /* renamed from: a */
    public static C70013e m268582a() {
        if (f174993a == null) {
            synchronized (C70013e.class) {
                if (f174993a == null) {
                    f174993a = new C70013e();
                }
            }
        }
        return f174993a;
    }

    /* renamed from: a */
    public void mo246430a(boolean z) {
        this.f174994b = z;
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public void onEffectiveConnectionTypeChanged(int i) {
        C70010c.m268520a().mo246389a(i);
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public void onClientIPChanged(String str) {
        if (this.f174994b) {
            C70010c.m268520a().mo246402b(str);
        }
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public void onTTNetDetectInfoChanged(String str) {
        if (this.f174994b) {
            C70010c.m268520a().mo246394a(str);
        }
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public void onMultiNetworkStateChanged(int i, int i2) {
        C70010c.m268520a().mo246391a(i, i2);
    }

    /* renamed from: a */
    public void mo246429a(String str, int i) {
        if (this.f174994b) {
            C70010c.m268520a().mo246395a(str, i);
        }
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        return C70010c.m268520a().mo246388a(str, map);
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public void onServerConfigUpdated(String str, String str2) {
        if (this.f174994b) {
            C70010c.m268520a().mo246403b(str, str2);
        }
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public void onTNCUpdateFailed(String[] strArr, String str) {
        if (this.f174994b) {
            C70010c.m268520a().mo246400a(strArr, str);
        }
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        C70010c.m268520a().mo246392a(i, i2, i3);
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public void onStoreIdcChanged(String str, String str2, String str3) {
        if (this.f174994b) {
            C70010c.m268520a().mo246398a(str, str2, str3);
        }
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public void onPacketLossComputed(int i, double d, double d2, double d3, double d4) {
        C70010c.m268520a().mo246390a(i, d, d2, d3, d4);
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public void onTTDnsResolveResult(String str, String str2, int i, int i2, int i3, List<String> list, String str3) {
        C70010c.m268520a().mo246397a(str, str2, i, i2, i3, list, str3);
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public void onContextInitCompleted(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        TTNetInitMetrics b = TTNetInitMetrics.m56573b();
        b.f36576d = Process.getThreadPriority(0);
        b.f36584l = CronetLibraryLoader.sInitThreadStartTime;
        b.f36585m = CronetLibraryLoader.sInitThreadEndTime;
        b.f36593u = CronetLibraryLoader.sLoadCronetSoDuration;
        b.f36586n = j;
        b.f36587o = j2;
        b.f36588p = j3;
        b.f36589q = j4;
        b.f36590r = j5;
        b.f36591s = j6;
        b.f36594v = j7;
        b.f36595w = j8;
        b.f36596x = j9;
        b.f36597y = j10;
        b.f36598z = j11;
        b.f36567A = j12;
        b.f36568B = j13;
        b.f36569C = j14;
        b.f36570D = j15;
        b.f36571E = j16;
        b.f36572F = j17;
        b.f36573G = j18;
        C70010c.m268520a().mo246396a(TTNetInitMetrics.m56573b().mo51512c().toString(), "ttnet_init");
    }

    @Override // com.ttnet.org.chromium.net.TTEventListener
    public void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, int i, int i2, String str7) {
        if (this.f174994b) {
            C70010c.m268520a().mo246399a(z, str, str2, str3, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, z2, j11, j12, str4, str5, str6, i, i2, str7);
        }
    }
}
