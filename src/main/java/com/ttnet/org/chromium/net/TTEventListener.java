package com.ttnet.org.chromium.net;

import java.util.List;
import java.util.Map;

public abstract class TTEventListener {
    public abstract void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, int i, int i2, String str7);

    public abstract Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map);

    public abstract void onClientIPChanged(String str);

    public abstract void onColdStartFinish();

    public abstract void onContextInitCompleted(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18);

    public abstract void onCronetBootSucceed();

    public abstract void onEffectiveConnectionTypeChanged(int i);

    public abstract void onMultiNetworkStateChanged(int i, int i2);

    public abstract void onPacketLossComputed(int i, double d, double d2, double d3, double d4);

    public abstract void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3);

    public abstract void onServerConfigUpdated(String str, String str2);

    public abstract void onStoreIdcChanged(String str, String str2, String str3);

    public abstract void onTNCUpdateFailed(String[] strArr, String str);

    public abstract void onTTDnsResolveResult(String str, String str2, int i, int i2, int i3, List<String> list, String str3);

    public abstract void onTTNetDetectInfoChanged(String str);
}
