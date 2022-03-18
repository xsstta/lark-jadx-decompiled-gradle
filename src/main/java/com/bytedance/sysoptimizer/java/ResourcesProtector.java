package com.bytedance.sysoptimizer.java;

import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import me.ele.lancet.base.Origin;

public class ResourcesProtector {
    private static final List<Config> sConfigs = new ArrayList();

    public static final class Builder {
        private final Config mConfig = new Config();

        public Config build() {
            return this.mConfig;
        }

        public Builder maxStep(int i) {
            if (i <= 0) {
                i = 0;
            }
            this.mConfig.mMaxStep = i;
            return this;
        }

        public Builder mockCrash(boolean z) {
            this.mConfig.mockCrash = z;
            return this;
        }

        public Builder protectClassName(String str) {
            this.mConfig.mProtectClassName = str;
            return this;
        }

        public Builder protectMethodName(String str) {
            this.mConfig.mProtectMethodName = str;
            return this;
        }

        public Builder resId(int i) {
            this.mConfig.mResId = i;
            return this;
        }

        public Builder returnId(int i) {
            this.mConfig.mReturnIdWhenException = i;
            return this;
        }

        public Builder protectApis(int... iArr) {
            if (iArr == null) {
                return this;
            }
            this.mConfig.mProtectApiLevels = new ArrayList(iArr.length);
            for (int i : iArr) {
                if (i >= 14) {
                    this.mConfig.mProtectApiLevels.add(Integer.valueOf(i));
                }
            }
            return this;
        }

        public Builder protectModels(String... strArr) {
            if (strArr == null) {
                return this;
            }
            this.mConfig.mProtectModels = new ArrayList(strArr.length);
            for (String str : strArr) {
                if (str != null) {
                    this.mConfig.mProtectModels.add(str);
                }
            }
            return this;
        }
    }

    public static final class Config {
        public int mMaxStep;
        public List<Integer> mProtectApiLevels;
        public String mProtectClassName;
        public String mProtectMethodName;
        public List<String> mProtectModels;
        public int mResId;
        public int mReturnIdWhenException;
        public boolean mockCrash;

        private Config() {
        }

        public boolean isValid() {
            if (!isMachineMatch() || this.mResId < 0 || this.mMaxStep <= 0 || TextUtils.isEmpty(this.mProtectClassName) || TextUtils.isEmpty(this.mProtectMethodName)) {
                return false;
            }
            return true;
        }

        private boolean isMachineMatch() {
            List<String> list;
            List<Integer> list2 = this.mProtectApiLevels;
            if (list2 == null || list2.isEmpty() || (list = this.mProtectModels) == null || list.isEmpty()) {
                return true;
            }
            boolean contains = this.mProtectApiLevels.contains(Integer.valueOf(Build.VERSION.SDK_INT));
            boolean contains2 = this.mProtectModels.contains(Build.MANUFACTURER + " " + Build.MODEL);
            if (!contains || !contains2) {
                return false;
            }
            return true;
        }
    }

    public static void registerConfig(Config config) {
        if (config != null) {
            sConfigs.add(config);
        }
    }

    public static Config getMatchConfig(int i) {
        for (Config config : sConfigs) {
            if (config.mResId == i && config.isValid()) {
                return config;
            }
        }
        return null;
    }

    public int getInteger(int i) throws Resources.NotFoundException {
        Config matchConfig = getMatchConfig(i);
        if (matchConfig == null) {
            return ((Integer) Origin.call()).intValue();
        }
        try {
            if (!matchConfig.mockCrash) {
                return ((Integer) Origin.call()).intValue();
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return ((Integer) Origin.call()).intValue();
        }
    }
}
