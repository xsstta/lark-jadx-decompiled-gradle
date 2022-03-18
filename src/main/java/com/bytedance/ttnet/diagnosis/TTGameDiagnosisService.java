package com.bytedance.ttnet.diagnosis;

import com.bytedance.common.utility.Logger;

public class TTGameDiagnosisService {
    public static final String TAG = "TTGameDiagnosisService";
    private static volatile TTGameDiagnosisService sInstance;
    private volatile boolean mIsMonitoring;
    private IDiagnosisRequest mRequest;

    private TTGameDiagnosisService() {
    }

    public boolean isMonitoring() {
        return this.mIsMonitoring;
    }

    public static TTGameDiagnosisService inst() {
        if (sInstance == null) {
            synchronized (TTGameDiagnosisService.class) {
                if (sInstance == null) {
                    sInstance = new TTGameDiagnosisService();
                }
            }
        }
        return sInstance;
    }

    public void monitorEnd() {
        synchronized (this) {
            if (this.mIsMonitoring) {
                this.mRequest.doExtraCommand("finish", "");
                this.mIsMonitoring = false;
            }
        }
    }

    public void doDiagnosisDuringGaming(String str) {
        synchronized (this) {
            if (this.mIsMonitoring) {
                this.mRequest.doExtraCommand("diagnosis", str);
            }
        }
    }

    public void monitorBegin(String str, String str2) throws Exception {
        synchronized (this) {
            if (!this.mIsMonitoring) {
                IDiagnosisRequest createRequest = TTNetDiagnosisService.createRequest(4, str, 0, Integer.MAX_VALUE);
                this.mRequest = createRequest;
                createRequest.start(new IDiagnosisCallback() {
                    /* class com.bytedance.ttnet.diagnosis.TTGameDiagnosisService.C207681 */

                    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisCallback
                    public void onDiagnosisComplete(String str) {
                        if (Logger.debug()) {
                            String str2 = TTGameDiagnosisService.TAG;
                            Logger.m15167d(str2, "onDiagnosisComplete: " + str);
                        }
                    }
                });
                this.mRequest.doExtraCommand("extra_info", str2);
                this.mIsMonitoring = true;
            }
        }
    }
}
