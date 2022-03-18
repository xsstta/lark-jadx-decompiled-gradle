package com.ss.ttvideoengine.selector.gracie;

import android.text.TextUtils;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.model.IVideoModel;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.selector.Selector;
import com.ss.ttvideoengine.superresolution.SRStrategyConfig;
import java.util.HashMap;
import java.util.Map;

public class GracieSelector implements Selector {
    private static int sSpeedType = 4;
    private final int mOnceT;
    private final int mScene;

    private enum ParamsKey {
        SCREEN_WIDTH,
        SCREEN_HEIGHT,
        DISPLAY_WIDTH,
        DISPLAY_HEIGHT,
        WIFI_DEFAULT_RESOLUTION_INDEX,
        WIFI_DEFAULT_RESOLUTION_QUALITY,
        CELLULAR_MAX_RESOLUTION_INDEX,
        CELLULAR_MAX_RESOLUTION_QUALITY,
        USER_EXPECTED_RESOLUTION_INDEX,
        USER_EXPECTED_RESOLUTION_QUALITY,
        GRACIE_MAX_RESOLUTION_INDEX,
        GRACIE_MAX_RESOLUTION_QUALITY,
        DOWNGRADE_RESOLUTION_INDEX,
        DOWNGRADE_RESOLUTION_QUALITY,
        SR_STRATEGY_CONFIG
    }

    public static class Params {
        Map<Integer, Object> mMaps = new HashMap();

        public Map<Integer, Object> build() {
            return this.mMaps;
        }

        public Params srStrategyConfig(SRStrategyConfig sRStrategyConfig) {
            if (sRStrategyConfig == null) {
                return this;
            }
            this.mMaps.put(Integer.valueOf(ParamsKey.SR_STRATEGY_CONFIG.ordinal()), sRStrategyConfig);
            return this;
        }

        public Params abrMax(int i, String str) {
            if (!TextUtils.isEmpty(str)) {
                this.mMaps.put(Integer.valueOf(ParamsKey.GRACIE_MAX_RESOLUTION_QUALITY.ordinal()), str);
            }
            if (i >= 0) {
                this.mMaps.put(Integer.valueOf(ParamsKey.GRACIE_MAX_RESOLUTION_INDEX.ordinal()), Integer.valueOf(i));
            }
            return this;
        }

        public Params cellularMax(int i, String str) {
            if (!TextUtils.isEmpty(str)) {
                this.mMaps.put(Integer.valueOf(ParamsKey.CELLULAR_MAX_RESOLUTION_QUALITY.ordinal()), str);
            }
            if (i >= 0) {
                this.mMaps.put(Integer.valueOf(ParamsKey.CELLULAR_MAX_RESOLUTION_INDEX.ordinal()), Integer.valueOf(i));
            }
            return this;
        }

        public Params displaySize(int i, int i2) {
            this.mMaps.put(Integer.valueOf(ParamsKey.DISPLAY_WIDTH.ordinal()), Integer.valueOf(i));
            this.mMaps.put(Integer.valueOf(ParamsKey.DISPLAY_HEIGHT.ordinal()), Integer.valueOf(i2));
            return this;
        }

        public Params downgrade(int i, String str) {
            if (!TextUtils.isEmpty(str)) {
                this.mMaps.put(Integer.valueOf(ParamsKey.DOWNGRADE_RESOLUTION_QUALITY.ordinal()), str);
            }
            if (i >= 0) {
                this.mMaps.put(Integer.valueOf(ParamsKey.DOWNGRADE_RESOLUTION_INDEX.ordinal()), Integer.valueOf(i));
            }
            return this;
        }

        public Params screenSize(int i, int i2) {
            this.mMaps.put(Integer.valueOf(ParamsKey.SCREEN_WIDTH.ordinal()), Integer.valueOf(i));
            this.mMaps.put(Integer.valueOf(ParamsKey.SCREEN_HEIGHT.ordinal()), Integer.valueOf(i2));
            return this;
        }

        public Params userExpected(int i, String str) {
            if (!TextUtils.isEmpty(str)) {
                this.mMaps.put(Integer.valueOf(ParamsKey.USER_EXPECTED_RESOLUTION_QUALITY.ordinal()), str);
            }
            if (i >= 0) {
                this.mMaps.put(Integer.valueOf(ParamsKey.USER_EXPECTED_RESOLUTION_INDEX.ordinal()), Integer.valueOf(i));
            }
            return this;
        }

        public Params wifiDefault(int i, String str) {
            if (!TextUtils.isEmpty(str)) {
                this.mMaps.put(Integer.valueOf(ParamsKey.WIFI_DEFAULT_RESOLUTION_QUALITY.ordinal()), str);
            }
            if (i >= 0) {
                this.mMaps.put(Integer.valueOf(ParamsKey.WIFI_DEFAULT_RESOLUTION_INDEX.ordinal()), Integer.valueOf(i));
            }
            return this;
        }
    }

    public static void setSpeedType(int i) {
        sSpeedType = i;
    }

    public GracieSelector(int i) {
        this(i, 8);
    }

    public GracieSelector(int i, int i2) {
        this.mScene = i;
        this.mOnceT = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x024d A[SYNTHETIC, Splitter:B:85:0x024d] */
    @Override // com.ss.ttvideoengine.selector.Selector
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.ttvideoengine.selector.SelectedInfo select(com.ss.ttvideoengine.model.IVideoModel r19, java.util.Map<java.lang.Integer, java.lang.Object> r20) {
        /*
        // Method dump skipped, instructions count: 974
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.selector.gracie.GracieSelector.select(com.ss.ttvideoengine.model.IVideoModel, java.util.Map):com.ss.ttvideoengine.selector.SelectedInfo");
    }

    private static int getBitrate(int i, int i2, Map<Integer, Object> map, IVideoModel iVideoModel) {
        int i3;
        Object obj = map.get(Integer.valueOf(i));
        if (obj instanceof Integer) {
            i3 = ((Integer) obj).intValue();
        } else {
            i3 = -1;
        }
        Object obj2 = map.get(Integer.valueOf(i2));
        if ((i3 == -1 || i3 == Resolution.Auto.getIndex()) && obj2 == null) {
            return -1;
        }
        HashMap hashMap = new HashMap();
        hashMap.clear();
        if (obj2 instanceof String) {
            hashMap.put(32, (String) obj2);
        }
        VideoInfo videoInfo = iVideoModel.getVideoInfo(Resolution.valueOf(i3), (Map<Integer, String>) hashMap, true);
        if (videoInfo != null) {
            return videoInfo.getValueInt(3);
        }
        return -1;
    }
}
