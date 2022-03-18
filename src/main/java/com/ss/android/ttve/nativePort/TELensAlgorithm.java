package com.ss.android.ttve.nativePort;

import com.ss.android.medialib.p2999b.C59381c;
import com.ss.android.ttve.lensAlgorithm.VEBaseLensAlgorithmConfig;
import com.ss.android.ttve.lensAlgorithm.VEBaseLensResults;
import com.ss.android.ttve.lensAlgorithm.videoStable.VELensVideoStabResults;
import com.ss.android.ttve.lensAlgorithm.videoStable.VEVideoStabConfig;

public class TELensAlgorithm {

    /* renamed from: a */
    private long f150366a;

    private native long nativeCreateLensEngine();

    private native int nativeDestroyLensEngine(long j);

    private native VELensVideoStabResults nativeGetVideoStabResult(long j, Object obj, VEVideoStabConfig vEVideoStabConfig);

    static {
        TENativeLibsLoader.m234143a();
    }

    /* renamed from: b */
    public synchronized int mo206227b() {
        long j = this.f150366a;
        if (j <= 0) {
            return -112;
        }
        int nativeDestroyLensEngine = nativeDestroyLensEngine(j);
        this.f150366a = 0;
        return nativeDestroyLensEngine;
    }

    /* renamed from: a */
    public synchronized int mo206225a() {
        if (this.f150366a > 0) {
            C59381c.m230520b("TELensAlgorithm", "Native Lens has already init");
        }
        long nativeCreateLensEngine = nativeCreateLensEngine();
        this.f150366a = nativeCreateLensEngine;
        if (nativeCreateLensEngine <= 0) {
            return -112;
        }
        return 0;
    }

    /* renamed from: a */
    public VEBaseLensResults mo206226a(VEBaseLensAlgorithmConfig vEBaseLensAlgorithmConfig, Object obj) {
        if (this.f150366a > 0 && vEBaseLensAlgorithmConfig.algorithmFlag == 16) {
            return nativeGetVideoStabResult(this.f150366a, obj, (VEVideoStabConfig) vEBaseLensAlgorithmConfig);
        }
        return null;
    }
}
