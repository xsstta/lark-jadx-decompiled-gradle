package com.ss.ttvideoengine.superresolution;

import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

public class SRStrategy {
    private int mRand = 0;
    private Map<Integer, List<Integer>> mSRBenchmark = new HashMap();
    private SRStrategyConfig mSRConfig = new SRStrategyConfig();
    private int mSRNotUseReason = 0;
    private int mSROpenStatus = -1;
    private int mSRRealStatus = -1;
    private boolean mSRSatisfied = false;
    private ISRStrategyListener mSRStrategyListener = null;
    private int mSRStrategyMode = 1;
    private boolean mShouldUseSRTexture = false;
    private Resolution mStartupResolution = Resolution.Standard;
    private Resolution mStartupResolutionShiftFrom = Resolution.Standard;

    public Map<Integer, List<Integer>> getSRBenchmark() {
        return this.mSRBenchmark;
    }

    public int getSRNotUseReason() {
        return this.mSRNotUseReason;
    }

    public int getSROpenStatus() {
        return this.mSROpenStatus;
    }

    public int getSRRealStatus() {
        return this.mSRRealStatus;
    }

    public int getSRStrategyMode() {
        return this.mSRStrategyMode;
    }

    public Resolution getStartupResolution() {
        return this.mStartupResolution;
    }

    public Resolution getStartupResolutionShiftFrom() {
        return this.mStartupResolutionShiftFrom;
    }

    public boolean isSRSatisfied() {
        return this.mSRSatisfied;
    }

    public boolean shouldUseSRTexture() {
        return this.mShouldUseSRTexture;
    }

    public Integer getMaxHeight() {
        return this.mSRConfig.getMaxHeight();
    }

    public Integer getMaxWidth() {
        return this.mSRConfig.getMaxWidth();
    }

    public boolean isSREnabled() {
        Boolean enableSR = this.mSRConfig.getEnableSR();
        if (enableSR != null) {
            return enableSR.booleanValue();
        }
        return false;
    }

    public void resetAll() {
        this.mSRConfig.resetAll();
        this.mSRConfig.enableSR(false);
        this.mSRConfig.setEnableHdr(false);
        this.mSRConfig.setIsSpeed(false);
        this.mSRStrategyListener = null;
        this.mSRStrategyMode = 1;
        this.mSRSatisfied = false;
        this.mShouldUseSRTexture = false;
        this.mSRNotUseReason = 0;
        this.mSRRealStatus = -1;
        this.mSROpenStatus = -1;
        this.mRand = new Random().nextInt(100);
        this.mStartupResolution = Resolution.Standard;
        this.mStartupResolutionShiftFrom = Resolution.Standard;
    }

    public void resetStream() {
        this.mSRConfig.resetStream();
        this.mSRSatisfied = false;
        this.mShouldUseSRTexture = false;
        this.mSRNotUseReason = 0;
        this.mSRRealStatus = -1;
        this.mSROpenStatus = -1;
        this.mRand = new Random().nextInt(100);
        this.mStartupResolution = Resolution.Standard;
        this.mStartupResolutionShiftFrom = Resolution.Standard;
    }

    public SRStrategy() {
        resetAll();
        this.mSRBenchmark.put(Integer.valueOf(Resolution.Standard.getIndex()), new ArrayList(Arrays.asList(Integer.valueOf(Resolution.High.getIndex()))));
        this.mSRBenchmark.put(Integer.valueOf(Resolution.High.getIndex()), new ArrayList(Arrays.asList(Integer.valueOf(Resolution.H_High.getIndex()))));
        this.mSRBenchmark.put(Integer.valueOf(Resolution.H_High.getIndex()), new ArrayList(Arrays.asList(Integer.valueOf(Resolution.SuperHigh.getIndex()))));
        this.mSRBenchmark.put(Integer.valueOf(Resolution.SuperHigh.getIndex()), new ArrayList(Arrays.asList(Integer.valueOf(Resolution.ExtremelyHigh.getIndex()))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r1.compareTo(java.lang.Integer.valueOf(r0.intValue() & r1.intValue())) != 0) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00eb, code lost:
        if (r2.compareTo(java.lang.Integer.valueOf(r1.intValue() & r2.intValue())) != 0) goto L_0x00ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void checkSatisfied() {
        /*
        // Method dump skipped, instructions count: 389
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.superresolution.SRStrategy.checkSatisfied():void");
    }

    public void setSROpenStatus(int i) {
        this.mSROpenStatus = i;
    }

    public void setSRStrategyListener(ISRStrategyListener iSRStrategyListener) {
        this.mSRStrategyListener = iSRStrategyListener;
    }

    public void setSRStrategyMode(int i) {
        this.mSRStrategyMode = i;
    }

    public void setStartupResolution(Resolution resolution) {
        this.mStartupResolution = resolution;
    }

    public void setStartupResolutionShiftFrom(Resolution resolution) {
        this.mStartupResolutionShiftFrom = resolution;
    }

    public void updateConfig(SRStrategyConfig sRStrategyConfig) {
        TTVideoEngineLog.m256505i("TTVideoEngine.SRStrategy", "[SRLog]updateConfig cfg=" + sRStrategyConfig);
        if (sRStrategyConfig != null) {
            this.mSRConfig.updateFrom(sRStrategyConfig);
            String extraConfig = sRStrategyConfig.getExtraConfig();
            if (extraConfig != null && !extraConfig.isEmpty()) {
                String lowerCase = extraConfig.toLowerCase();
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(lowerCase).getJSONObject("sr").getJSONObject("benchmark");
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        int parseInt = Integer.parseInt(next);
                        JSONArray jSONArray = jSONObject.getJSONArray(next);
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
                        }
                        hashMap.put(Integer.valueOf(parseInt), arrayList);
                    }
                    this.mSRBenchmark = hashMap;
                    TTVideoEngineLog.m256505i("TTVideoEngine.SRStrategy", "[SRLog]updateConfig mSRBenchmark=" + this.mSRBenchmark);
                } catch (Exception e) {
                    TTVideoEngineLog.m256505i("TTVideoEngine.SRStrategy", "[SRLog]updateConfig exception=" + e);
                    e.printStackTrace();
                }
            }
            TTVideoEngineLog.m256505i("TTVideoEngine.SRStrategy", "[SRLog]updateConfig after mSRConfig=" + this.mSRConfig);
            checkSatisfied();
            ISRStrategyListener iSRStrategyListener = this.mSRStrategyListener;
            if (iSRStrategyListener != null) {
                iSRStrategyListener.onSRStrategy(this);
            }
        }
    }

    public void onSRStatus(int i, int i2) {
        int i3 = this.mSRRealStatus;
        if (i != i3) {
            if (i != 0 || 2 != i3) {
                TTVideoEngineLog.m256500d("TTVideoEngine.SRStrategy", "[SRLog]onSRStatus status=" + i + " reason=" + i2);
                this.mSRRealStatus = i;
                if (2 == i) {
                    this.mSRNotUseReason = i2;
                }
                ISRStatusListener listener = this.mSRConfig.getListener();
                if (listener != null) {
                    listener.onSRStatus(i);
                }
                ISRStrategyListener iSRStrategyListener = this.mSRStrategyListener;
                if (iSRStrategyListener != null) {
                    iSRStrategyListener.onSRStrategy(this);
                }
            }
        }
    }
}
