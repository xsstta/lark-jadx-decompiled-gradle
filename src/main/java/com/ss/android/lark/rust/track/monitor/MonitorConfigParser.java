package com.ss.android.lark.rust.track.monitor;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.rust.track.C53165b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/rust/track/monitor/MonitorConfigParser;", "", "()V", "KEY_DATA", "", "TAG", "cpuConfig", "Lcom/ss/android/lark/rust/track/monitor/MonitorConfigParser$GearConfig;", "getCpuConfig", "()Lcom/ss/android/lark/rust/track/monitor/MonitorConfigParser$GearConfig;", "setCpuConfig", "(Lcom/ss/android/lark/rust/track/monitor/MonitorConfigParser$GearConfig;)V", "frameConfig", "getFrameConfig", "setFrameConfig", "initConfig", "", "parsePushMonitorConfig", "Lcom/ss/android/lark/rust/track/monitor/MonitorConfigParser$PushMonitorReportConfig;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "GearConfig", "PushMonitorReportConfig", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class MonitorConfigParser {
    public static final MonitorConfigParser INSTANCE = new MonitorConfigParser();
    private static GearConfig cpuConfig;
    private static GearConfig frameConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/rust/track/monitor/MonitorConfigParser$GearConfig;", "Ljava/io/Serializable;", "slightlyLevel", "", "moderatelyLevel", "severelyLevel", "fatallyLevel", "(FFFF)V", "getFatallyLevel", "()F", "setFatallyLevel", "(F)V", "getModeratelyLevel", "setModeratelyLevel", "getSeverelyLevel", "setSeverelyLevel", "getSlightlyLevel", "setSlightlyLevel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class GearConfig implements Serializable {
        private float fatallyLevel;
        private float moderatelyLevel;
        private float severelyLevel;
        private float slightlyLevel;

        public GearConfig() {
            this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15, null);
        }

        public static /* synthetic */ GearConfig copy$default(GearConfig gearConfig, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = gearConfig.slightlyLevel;
            }
            if ((i & 2) != 0) {
                f2 = gearConfig.moderatelyLevel;
            }
            if ((i & 4) != 0) {
                f3 = gearConfig.severelyLevel;
            }
            if ((i & 8) != 0) {
                f4 = gearConfig.fatallyLevel;
            }
            return gearConfig.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.slightlyLevel;
        }

        public final float component2() {
            return this.moderatelyLevel;
        }

        public final float component3() {
            return this.severelyLevel;
        }

        public final float component4() {
            return this.fatallyLevel;
        }

        public final GearConfig copy(@JSONField(name = "slightly") float f, @JSONField(name = "moderately") float f2, @JSONField(name = "severely") float f3, @JSONField(name = "fatally") float f4) {
            return new GearConfig(f, f2, f3, f4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GearConfig)) {
                return false;
            }
            GearConfig gearConfig = (GearConfig) obj;
            return Float.compare(this.slightlyLevel, gearConfig.slightlyLevel) == 0 && Float.compare(this.moderatelyLevel, gearConfig.moderatelyLevel) == 0 && Float.compare(this.severelyLevel, gearConfig.severelyLevel) == 0 && Float.compare(this.fatallyLevel, gearConfig.fatallyLevel) == 0;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.slightlyLevel) * 31) + Float.floatToIntBits(this.moderatelyLevel)) * 31) + Float.floatToIntBits(this.severelyLevel)) * 31) + Float.floatToIntBits(this.fatallyLevel);
        }

        public final float getFatallyLevel() {
            return this.fatallyLevel;
        }

        public final float getModeratelyLevel() {
            return this.moderatelyLevel;
        }

        public final float getSeverelyLevel() {
            return this.severelyLevel;
        }

        public final float getSlightlyLevel() {
            return this.slightlyLevel;
        }

        public String toString() {
            return "GearConfig(slightlyLevel=" + this.slightlyLevel + ", moderatelyLevel=" + this.moderatelyLevel + ", severelyLevel=" + this.severelyLevel + ", fatallyLevel=" + this.fatallyLevel + ')';
        }

        public final void setFatallyLevel(float f) {
            this.fatallyLevel = f;
        }

        public final void setModeratelyLevel(float f) {
            this.moderatelyLevel = f;
        }

        public final void setSeverelyLevel(float f) {
            this.severelyLevel = f;
        }

        public final void setSlightlyLevel(float f) {
            this.slightlyLevel = f;
        }

        public GearConfig(@JSONField(name = "slightly") float f, @JSONField(name = "moderately") float f2, @JSONField(name = "severely") float f3, @JSONField(name = "fatally") float f4) {
            this.slightlyLevel = f;
            this.moderatelyLevel = f2;
            this.severelyLevel = f3;
            this.fatallyLevel = f4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GearConfig(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f, (i & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f2, (i & 4) != 0 ? BitmapDescriptorFactory.HUE_RED : f3, (i & 8) != 0 ? BitmapDescriptorFactory.HUE_RED : f4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/rust/track/monitor/MonitorConfigParser$PushMonitorReportConfig;", "Ljava/io/Serializable;", "cpuConfig", "Lcom/ss/android/lark/rust/track/monitor/MonitorConfigParser$GearConfig;", "frameConfig", "(Lcom/ss/android/lark/rust/track/monitor/MonitorConfigParser$GearConfig;Lcom/ss/android/lark/rust/track/monitor/MonitorConfigParser$GearConfig;)V", "getCpuConfig", "()Lcom/ss/android/lark/rust/track/monitor/MonitorConfigParser$GearConfig;", "setCpuConfig", "(Lcom/ss/android/lark/rust/track/monitor/MonitorConfigParser$GearConfig;)V", "getFrameConfig", "setFrameConfig", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class PushMonitorReportConfig implements Serializable {
        private GearConfig cpuConfig;
        private GearConfig frameConfig;

        public PushMonitorReportConfig() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ PushMonitorReportConfig copy$default(PushMonitorReportConfig pushMonitorReportConfig, GearConfig gearConfig, GearConfig gearConfig2, int i, Object obj) {
            if ((i & 1) != 0) {
                gearConfig = pushMonitorReportConfig.cpuConfig;
            }
            if ((i & 2) != 0) {
                gearConfig2 = pushMonitorReportConfig.frameConfig;
            }
            return pushMonitorReportConfig.copy(gearConfig, gearConfig2);
        }

        public final GearConfig component1() {
            return this.cpuConfig;
        }

        public final GearConfig component2() {
            return this.frameConfig;
        }

        public final PushMonitorReportConfig copy(@JSONField(name = "cpu") GearConfig gearConfig, @JSONField(name = "frame") GearConfig gearConfig2) {
            return new PushMonitorReportConfig(gearConfig, gearConfig2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PushMonitorReportConfig)) {
                return false;
            }
            PushMonitorReportConfig pushMonitorReportConfig = (PushMonitorReportConfig) obj;
            return Intrinsics.areEqual(this.cpuConfig, pushMonitorReportConfig.cpuConfig) && Intrinsics.areEqual(this.frameConfig, pushMonitorReportConfig.frameConfig);
        }

        public int hashCode() {
            GearConfig gearConfig = this.cpuConfig;
            int i = 0;
            int hashCode = (gearConfig != null ? gearConfig.hashCode() : 0) * 31;
            GearConfig gearConfig2 = this.frameConfig;
            if (gearConfig2 != null) {
                i = gearConfig2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "PushMonitorReportConfig(cpuConfig=" + this.cpuConfig + ", frameConfig=" + this.frameConfig + ")";
        }

        public final GearConfig getCpuConfig() {
            return this.cpuConfig;
        }

        public final GearConfig getFrameConfig() {
            return this.frameConfig;
        }

        public final void setCpuConfig(GearConfig gearConfig) {
            this.cpuConfig = gearConfig;
        }

        public final void setFrameConfig(GearConfig gearConfig) {
            this.frameConfig = gearConfig;
        }

        public PushMonitorReportConfig(@JSONField(name = "cpu") GearConfig gearConfig, @JSONField(name = "frame") GearConfig gearConfig2) {
            this.cpuConfig = gearConfig;
            this.frameConfig = gearConfig2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PushMonitorReportConfig(GearConfig gearConfig, GearConfig gearConfig2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : gearConfig, (i & 2) != 0 ? null : gearConfig2);
        }
    }

    private MonitorConfigParser() {
    }

    public final GearConfig getCpuConfig() {
        return cpuConfig;
    }

    public final GearConfig getFrameConfig() {
        return frameConfig;
    }

    @JvmStatic
    public static final void initConfig() {
        GearConfig gearConfig;
        if (cpuConfig == null || frameConfig == null) {
            String b = C53165b.m205769a().mo178124b();
            PushMonitorReportConfig parsePushMonitorConfig = parsePushMonitorConfig(b);
            GearConfig gearConfig2 = null;
            if (parsePushMonitorConfig != null) {
                gearConfig = parsePushMonitorConfig.getCpuConfig();
            } else {
                gearConfig = null;
            }
            cpuConfig = gearConfig;
            if (parsePushMonitorConfig != null) {
                gearConfig2 = parsePushMonitorConfig.getFrameConfig();
            }
            frameConfig = gearConfig2;
            Log.m165389i("PushMonitor", "monitor push status —— config: " + b + ", cpuConfig = " + String.valueOf(cpuConfig) + ", " + "frameConfig = " + String.valueOf(frameConfig));
        }
    }

    public final void setCpuConfig(GearConfig gearConfig) {
        cpuConfig = gearConfig;
    }

    public final void setFrameConfig(GearConfig gearConfig) {
        frameConfig = gearConfig;
    }

    @JvmStatic
    public static final PushMonitorReportConfig parsePushMonitorConfig(String str) {
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            Log.m165389i("PushMonitor", "SampleConfigParser: " + str);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (PushMonitorReportConfig) JSONObject.parseObject(JSONObject.parseObject(str).getString("android_push_downgrade_app_lag_config"), PushMonitorReportConfig.class);
        } catch (Exception e) {
            Log.m165383e("PushMonitor", "error: +" + e.getMessage() + ')');
            return null;
        }
    }
}
