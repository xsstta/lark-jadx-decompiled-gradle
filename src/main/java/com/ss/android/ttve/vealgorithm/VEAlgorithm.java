package com.ss.android.ttve.vealgorithm;

import com.ss.android.ttve.vealgorithm.params.VEAlgorithmParam;
import com.ss.android.ttve.vealgorithm.params.VEAlgorithmResult;
import com.ss.android.ttve.vealgorithm.params.VEAlgorithmType;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.VEListener;

public class VEAlgorithm {
    private VEListener.AbstractC63853a mErrorListener;
    private long mHandle;
    private VEListener.AbstractC63859b mListener;

    public native int nativeAlgorithmCancel(long j);

    public native long nativeAlgorithmCreate(Object obj);

    public native int nativeAlgorithmDestroy(long j);

    public native Object nativeAlgorithmGetResult(long j);

    public native int nativeAlgorithmStart(long j);

    public int cancel() {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        return nativeAlgorithmCancel(j);
    }

    public int start() {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        return nativeAlgorithmStart(j);
    }

    public int destroy() {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        int nativeAlgorithmDestroy = nativeAlgorithmDestroy(j);
        this.mHandle = 0;
        return nativeAlgorithmDestroy;
    }

    public VEAlgorithmResult getResult() {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        return (VEAlgorithmResult) nativeAlgorithmGetResult(j);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (this.mHandle != -1) {
            C63929ab.m250980d("VEAlgorithm", "not destroy algorithm object:" + this.mHandle);
        }
    }

    public void setErrorListener(VEListener.AbstractC63853a aVar) {
        this.mErrorListener = aVar;
    }

    public void setProcessListener(VEListener.AbstractC63859b bVar) {
        this.mListener = bVar;
    }

    public int init(VEAlgorithmParam vEAlgorithmParam) {
        int i = vEAlgorithmParam.type;
        if (i == VEAlgorithmType.VE_ALGORITHM_TYPE_INVALID) {
            C63929ab.m250980d("VEAlgorithm", "invalid algorithm type:" + i);
            return -100;
        }
        this.mHandle = nativeAlgorithmCreate(vEAlgorithmParam);
        return 0;
    }

    public void nativeCallback_onError(int i, String str) {
        VEListener.AbstractC63853a aVar = this.mErrorListener;
        if (aVar != null) {
            aVar.mo220830a(i, str);
        }
    }

    public void nativeCallback_onProcess(float f, boolean z) {
        VEListener.AbstractC63859b bVar = this.mListener;
        if (bVar != null) {
            bVar.mo220835a(f, z);
        }
    }
}
