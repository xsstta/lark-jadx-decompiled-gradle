package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.TTNetDiagnosisRequest;
import java.util.List;
import java.util.concurrent.Executor;

public class TTNetDiagnosisRequestBuilderImpl extends TTNetDiagnosisRequest.Builder {
    private static final String TAG = "TTNetDiagnosisRequestBuilderImpl";
    private final TTNetDiagnosisRequest.Callback mCallback;
    private final CronetEngineBase mCronetEngine;
    private final Executor mExecutor;
    private int mNetDetectType;
    private int mReqType;
    private List<String> mTargets;
    private int mTimeoutMs;

    @Override // com.ttnet.org.chromium.net.TTNetDiagnosisRequest.Builder
    public TTNetDiagnosisRequest build() {
        return this.mCronetEngine.createNetDiagnosisRequest(this.mCallback, this.mExecutor, this.mReqType, this.mTargets, this.mNetDetectType, this.mTimeoutMs);
    }

    @Override // com.ttnet.org.chromium.net.TTNetDiagnosisRequest.Builder
    public TTNetDiagnosisRequest.Builder setNetDetectType(int i) {
        this.mNetDetectType = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.TTNetDiagnosisRequest.Builder
    public TTNetDiagnosisRequest.Builder setRequestType(int i) {
        this.mReqType = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.TTNetDiagnosisRequest.Builder
    public TTNetDiagnosisRequest.Builder setTargets(List<String> list) {
        this.mTargets = list;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.TTNetDiagnosisRequest.Builder
    public TTNetDiagnosisRequest.Builder setTimeout(int i) {
        this.mTimeoutMs = i;
        return this;
    }

    TTNetDiagnosisRequestBuilderImpl(TTNetDiagnosisRequest.Callback callback, Executor executor, CronetEngineBase cronetEngineBase) {
        this.mCronetEngine = cronetEngineBase;
        this.mCallback = callback;
        this.mExecutor = executor;
    }
}
