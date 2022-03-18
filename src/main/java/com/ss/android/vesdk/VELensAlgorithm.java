package com.ss.android.vesdk;

import com.ss.android.ttve.lensAlgorithm.VEBaseLensAlgorithmConfig;
import com.ss.android.ttve.lensAlgorithm.VEBaseLensResults;
import com.ss.android.ttve.nativePort.TELensAlgorithm;
import com.ss.android.vesdk.VEListener;

public class VELensAlgorithm {
    private TELensAlgorithm mLensHandle = new TELensAlgorithm();

    public int destroy() {
        return this.mLensHandle.mo206227b();
    }

    public int init() {
        return this.mLensHandle.mo206225a();
    }

    public VEBaseLensResults getAlgorithmResults(VEBaseLensAlgorithmConfig vEBaseLensAlgorithmConfig, VEListener.AbstractC63878u uVar) {
        VELensCallBacks vELensCallBacks = new VELensCallBacks();
        vELensCallBacks.setmLensStateListener(uVar);
        return this.mLensHandle.mo206226a(vEBaseLensAlgorithmConfig, vELensCallBacks);
    }
}
