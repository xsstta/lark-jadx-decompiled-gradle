package com.ss.ttvideoengine.model;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import org.json.JSONArray;
import org.json.JSONObject;

public class MediaBitrateFitterInfo {
    private int mDuration;
    private float[] mFunctionParams;
    private int mFunctionType;
    private int mHeaderSize;

    public int getDuration() {
        return this.mDuration;
    }

    public float[] getFunctionParams() {
        return this.mFunctionParams;
    }

    public int getFunctionType() {
        return this.mFunctionType;
    }

    public int getHeaderSize() {
        return this.mHeaderSize;
    }

    private int calculateSizeByFun2(float f) {
        float[] functionParams = getFunctionParams();
        if (functionParams.length != 3) {
            return 0;
        }
        double d = (double) f;
        return (int) (((((((double) functionParams[0]) / Math.pow(d, (double) functionParams[2])) + ((double) functionParams[1])) * d) * 1024.0d) / 8.0d);
    }

    private int calculateSize(float f) {
        float[] functionParams = getFunctionParams();
        getHeaderSize();
        if (functionParams.length > 50) {
            TTVideoEngineLog.m256503e("FitterInfo", "bitrateFitterParams num: " + functionParams.length);
            return 0;
        }
        double d = 0.0d;
        for (int i = 0; i < functionParams.length; i++) {
            double d2 = 1.0d;
            for (int i2 = 0; i2 < (functionParams.length - i) - 1; i2++) {
                d2 *= (double) f;
            }
            d += d2 * ((double) functionParams[i]);
        }
        return (int) (((d * ((double) f)) * 1024.0d) / 8.0d);
    }

    public int calculateSizeBySecond(float f) {
        if (this.mFunctionParams == null) {
            TTVideoEngineLog.m256503e("FitterInfo", "fitter params empty");
            return 0;
        } else if (f > ((float) getDuration()) || f <= BitmapDescriptorFactory.HUE_RED) {
            TTVideoEngineLog.m256503e("FitterInfo", String.format("preload second:%f, fitter duration:%d", Float.valueOf(f), Integer.valueOf(getDuration())));
            return 0;
        } else {
            int i = this.mFunctionType;
            if (i == 0) {
                return calculateSize(f);
            }
            if (i == 1) {
                return calculateSizeByFun2(f);
            }
            return calculateSize(f);
        }
    }

    public void extractFields(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("func_params")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("func_params");
                    if (jSONArray.length() > 0) {
                        this.mFunctionParams = new float[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            this.mFunctionParams[i] = (float) jSONArray.optDouble(i);
                        }
                    } else {
                        return;
                    }
                }
                this.mHeaderSize = jSONObject.optInt("header_size");
                this.mDuration = jSONObject.optInt("duration");
                this.mFunctionType = jSONObject.optInt("func_method");
            } catch (Exception e) {
                TTVideoEngineLog.m256501d(e);
            }
        }
    }
}
