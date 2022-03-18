package com.ss.android.vesdk;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ttve.nativePort.TEVideoUtils;

public class VECurveSpeedUtils {
    private double mAveSpeed;
    private float[] mCurveSpeedPointX;
    private float[] mCurveSpeedPointY;
    private volatile long mNative;

    public double getAveCurveSpeed() {
        if (this.mNative == 0) {
            C63929ab.m250980d("VECurveSpeedUtils", "getAveCurveSpeed, mNative == 0");
            return -112.0d;
        }
        double nativeGetAveCurveSpeed = TEVideoUtils.nativeGetAveCurveSpeed(this.mNative);
        this.mAveSpeed = nativeGetAveCurveSpeed;
        return nativeGetAveCurveSpeed;
    }

    public synchronized void destroy() {
        C63929ab.m250974a("VECurveSpeedUtils", "destroy...");
        if (this.mNative == 0) {
            C63929ab.m250980d("VECurveSpeedUtils", "destroy, mNative == 0");
            return;
        }
        TEVideoUtils.nativeCurveSpeedDestroy(this.mNative);
        this.mNative = 0;
    }

    public double getCurveSpeedWithSeqDelta(long j) {
        if (this.mNative != 0) {
            return TEVideoUtils.nativeGetCurveSpeedWithSeqDelta(this.mNative, j * 1000);
        }
        C63929ab.m250980d("VECurveSpeedUtils", "getCurveSpeedWithSeqDelta, mNative == 0");
        return -112.0d;
    }

    public long mapSeqDeltaToTrimDelta(long j) {
        if (this.mNative != 0) {
            return TEVideoUtils.nativeMapSeqDeltaToTrimDelta(this.mNative, j * 1000) / 1000;
        }
        C63929ab.m250980d("VECurveSpeedUtils", "mapSeqDeltaToTrimDelta, mNative == 0");
        return -112;
    }

    public long mapTrimDeltaToSeqDelta(long j) {
        if (this.mNative != 0) {
            return TEVideoUtils.nativeMapTrimDeltaToSeqDelta(this.mNative, j * 1000) / 1000;
        }
        C63929ab.m250980d("VECurveSpeedUtils", "mapTrimDeltaToSeqDelta, mNative == 0");
        return -112;
    }

    public void setSeqDuration(long j) {
        if (this.mNative == 0) {
            C63929ab.m250980d("VECurveSpeedUtils", "setSeqDuration, mNative == 0");
        } else {
            TEVideoUtils.nativeSetSeqDuration(this.mNative, j * 1000);
        }
    }

    public int setCurveSpeed(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length || fArr.length < 2) {
            C63929ab.m250980d("VECurveSpeedUtils", "setCurveSpeed,incorrect curve anchors, mNative == 0");
            return -100;
        } else if (this.mNative != 0) {
            return TEVideoUtils.nativeSetCurveSpeedData(this.mNative, fArr, fArr2);
        } else {
            C63929ab.m250980d("VECurveSpeedUtils", "setCurveSpeed, mNative == 0");
            return -112;
        }
    }

    public VECurveSpeedUtils(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length || fArr.length < 2) {
            this.mNative = 0;
            C63929ab.m250980d("VECurveSpeedUtils", "incorrect curve anchors, mNative == 0");
            return;
        }
        this.mNative = TEVideoUtils.nativeCreateCurveSpeedUtils(fArr, fArr2);
        this.mCurveSpeedPointX = fArr;
        this.mCurveSpeedPointY = fArr2;
        int curveSpeed = setCurveSpeed(fArr, fArr2);
        double aveCurveSpeed = getAveCurveSpeed();
        C63929ab.m250976b("VECurveSpeedUtils", "VECurveSpeedUtils ret1 " + curveSpeed + " ret2 " + aveCurveSpeed);
    }

    public static float[] transferTrimPointXtoSeqPointX(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float[] fArr3 = new float[length];
        int i = 0;
        float f = BitmapDescriptorFactory.HUE_RED;
        fArr3[0] = 0.0f;
        while (i < length - 1) {
            int i2 = i + 1;
            f += (fArr[i2] - fArr[i]) / ((fArr2[i2] + fArr2[i]) * 0.5f);
            fArr3[i2] = f;
            i = i2;
        }
        for (int i3 = 1; i3 < length; i3++) {
            fArr3[i3] = fArr3[i3] / f;
            C63929ab.m250976b("TAG", "transferTrimPointXtoSeqPointX SeqPointX[" + i3 + "]= " + fArr3[i3]);
        }
        return fArr3;
    }
}
