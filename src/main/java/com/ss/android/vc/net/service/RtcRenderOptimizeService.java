package com.ss.android.vc.net.service;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.service.C63634c;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class RtcRenderOptimizeService {
    private static RtcRenderOptimizeService INSTANCE = new RtcRenderOptimizeService();
    private String mCpuModel = "";
    private boolean mIsRenderOptimizeOK;
    private String mLastConfigStr;
    private RenderConfig mRenderConfig;

    /* access modifiers changed from: private */
    public static class RenderConfig {
        public List<Integer> blackApiLevelList;
        public List<String> blackCpuList;
        public List<String> blackModelList;
        public List<String> cpus;
        public int maxApiLevel;
        public int minApiLevel;
        public List<String> models;
        public boolean useSurfaceView;

        private RenderConfig() {
        }

        public List<Integer> getBlackApiLevelList() {
            return this.blackApiLevelList;
        }

        public List<String> getBlackCpuList() {
            return this.blackCpuList;
        }

        public List<String> getBlackModelList() {
            return this.blackModelList;
        }

        public List<String> getCpus() {
            return this.cpus;
        }

        public int getMaxApiLevel() {
            return this.maxApiLevel;
        }

        public int getMinApiLevel() {
            return this.minApiLevel;
        }

        public List<String> getModels() {
            return this.models;
        }

        public boolean isUseSurfaceView() {
            return this.useSurfaceView;
        }

        public String toString() {
            return "RenderConfig{models=" + this.models + ", blackModelList=" + this.blackModelList + ", cpus=" + this.cpus + ", blackCpuList=" + this.blackCpuList + ", blackApiLevelList=" + this.blackApiLevelList + ", minApiLevel=" + this.minApiLevel + ", maxApiLevel=" + this.maxApiLevel + ", useSurfaceView=" + this.useSurfaceView + '}';
        }

        public void setBlackApiLevelList(List<Integer> list) {
            this.blackApiLevelList = list;
        }

        public void setBlackCpuList(List<String> list) {
            this.blackCpuList = list;
        }

        public void setBlackModelList(List<String> list) {
            this.blackModelList = list;
        }

        public void setCpus(List<String> list) {
            this.cpus = list;
        }

        public void setMaxApiLevel(int i) {
            this.maxApiLevel = i;
        }

        public void setMinApiLevel(int i) {
            this.minApiLevel = i;
        }

        public void setModels(List<String> list) {
            this.models = list;
        }

        public void setUseSurfaceView(boolean z) {
            this.useSurfaceView = z;
        }
    }

    private static class RtcConfig {
        public RenderConfig renderConfig;
        private boolean useArrayPool;

        private RtcConfig() {
        }

        public RenderConfig getRenderConfig() {
            return this.renderConfig;
        }

        public boolean isUseArrayPool() {
            return this.useArrayPool;
        }

        public void setRenderConfig(RenderConfig renderConfig2) {
            this.renderConfig = renderConfig2;
        }

        public void setUseArrayPool(boolean z) {
            this.useArrayPool = z;
        }
    }

    public static RtcRenderOptimizeService getInstance() {
        return INSTANCE;
    }

    public boolean isRenderOptimizeDevice() {
        boolean b = C63634c.m249496b("byteview.meeting.android.rtc.is_render_optimize");
        if (!this.mIsRenderOptimizeOK || !b) {
            return false;
        }
        return true;
    }

    public boolean isUseSurfaceView() {
        RenderConfig renderConfig = this.mRenderConfig;
        if (renderConfig == null || !renderConfig.useSurfaceView) {
            return false;
        }
        return true;
    }

    public boolean isValidDevice() {
        return !TextUtils.isEmpty(this.mCpuModel);
    }

    public static boolean isHwDevice() {
        if ((TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase(Locale.getDefault()).startsWith("hua")) && (TextUtils.isEmpty(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase(Locale.getDefault()).startsWith("hua"))) {
            return false;
        }
        return true;
    }

    private RtcRenderOptimizeService() {
        long currentTimeMillis = System.currentTimeMillis();
        String cpuModel = getCpuModel();
        this.mCpuModel = cpuModel;
        if (!TextUtils.isEmpty(cpuModel)) {
            this.mCpuModel = this.mCpuModel.toLowerCase(Locale.getDefault());
        }
        C60700b.m235851b("RtcRenderOptimizeService", "[RtcRenderOptimizeService]", "Cpu model: " + this.mCpuModel + ", duration: " + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x0011 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:0x0011 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.String] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060 A[SYNTHETIC, Splitter:B:29:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073 A[SYNTHETIC, Splitter:B:36:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091 A[SYNTHETIC, Splitter:B:47:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCpuModel() {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.net.service.RtcRenderOptimizeService.getCpuModel():java.lang.String");
    }

    private boolean updatePerf() {
        boolean z;
        RenderConfig renderConfig = this.mRenderConfig;
        if (renderConfig == null) {
            return false;
        }
        String model = DeviceUtils.getModel();
        C60700b.m235851b("RtcRenderOptimizeService", "[updatePerf]", "Device model: " + model);
        if (CollectionUtils.isEmpty(renderConfig.models) || TextUtils.isEmpty(model)) {
            C60700b.m235864f("RtcRenderOptimizeService", "[updatePerf2]", "model invalid");
            return false;
        }
        String lowerCase = model.toLowerCase(Locale.getDefault());
        if (!(renderConfig.models.contains("all") || renderConfig.models.contains(lowerCase))) {
            return false;
        }
        C60700b.m235851b("RtcRenderOptimizeService", "[updatePerf3]", "model list ok");
        if (!CollectionUtils.isEmpty(renderConfig.blackModelList) && renderConfig.blackModelList.contains(lowerCase)) {
            C60700b.m235851b("RtcRenderOptimizeService", "[updatePerf4]", "model black list not ok");
            return false;
        } else if (CollectionUtils.isEmpty(renderConfig.cpus) || TextUtils.isEmpty(this.mCpuModel)) {
            C60700b.m235864f("RtcRenderOptimizeService", "[updatePerf5]", "cpu invalid");
            return false;
        } else {
            if (renderConfig.cpus.contains("all")) {
                C60700b.m235851b("RtcRenderOptimizeService", "[updatePerf6]", "cpu contains all");
            } else {
                Iterator<String> it = renderConfig.cpus.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (this.mCpuModel.contains(it.next())) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
            }
            if (!CollectionUtils.isEmpty(renderConfig.blackCpuList)) {
                for (String str : renderConfig.blackCpuList) {
                    if (this.mCpuModel.contains(str)) {
                        return false;
                    }
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (renderConfig.minApiLevel >= 0 && renderConfig.minApiLevel > i) {
                return false;
            }
            C60700b.m235851b("RtcRenderOptimizeService", "[updatePerf7]", "api min level ok");
            if (renderConfig.maxApiLevel >= 0 && renderConfig.maxApiLevel < i) {
                return false;
            }
            C60700b.m235851b("RtcRenderOptimizeService", "[updatePerf8]", "api max level ok");
            if (CollectionUtils.isEmpty(renderConfig.blackApiLevelList) || !renderConfig.blackApiLevelList.contains(Integer.valueOf(i))) {
                return true;
            }
            C60700b.m235851b("RtcRenderOptimizeService", "[updatePerf9]", "api level black level not ok");
            return false;
        }
    }

    public void updateConfig(String str) {
        if (!TextUtils.equals(str, this.mLastConfigStr)) {
            C60700b.m235851b("RtcRenderOptimizeService", "[updateConfig]", "New config: " + str);
            this.mLastConfigStr = str;
            if (TextUtils.isEmpty(str)) {
                this.mRenderConfig = null;
            } else {
                try {
                    RtcConfig rtcConfig = (RtcConfig) JSON.parseObject(str, RtcConfig.class);
                    if (rtcConfig != null) {
                        this.mRenderConfig = rtcConfig.renderConfig;
                    }
                    C60700b.m235851b("RtcRenderOptimizeService", "[updateConfig2]", "Perf device config: " + this.mRenderConfig);
                } catch (Exception e) {
                    C60700b.m235864f("RtcRenderOptimizeService", "[updateConfig3]", e.getMessage());
                }
            }
            this.mIsRenderOptimizeOK = updatePerf();
            C60700b.m235851b("RtcRenderOptimizeService", "[updateConfig4]", "mIsRenderOptimizeOK = " + this.mIsRenderOptimizeOK);
        }
    }
}
