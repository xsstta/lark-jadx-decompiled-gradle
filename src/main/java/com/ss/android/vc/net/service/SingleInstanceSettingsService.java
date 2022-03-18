package com.ss.android.vc.net.service;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\bH\u0002J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/vc/net/service/SingleInstanceSettingsService;", "", "()V", "TAG", "", "lastConfigStr", "romType", "settingsOpen", "", "getSettingsOpen", "()Z", "setSettingsOpen", "(Z)V", "specialConfig", "Lcom/ss/android/vc/net/service/SingleInstanceSettingsService$InstanceSpecialConfig;", "getSettings", "", "specialConfigOpen", "updateConfig", "config", "InstanceSpecialConfig", "SingleInstanceConfig", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class SingleInstanceSettingsService {
    public static final SingleInstanceSettingsService INSTANCE = new SingleInstanceSettingsService();
    private static String lastConfigStr;
    private static String romType;
    private static boolean settingsOpen;
    private static InstanceSpecialConfig specialConfig;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020\u000bH\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001a\u0010\u0017\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\t¨\u0006&"}, d2 = {"Lcom/ss/android/vc/net/service/SingleInstanceSettingsService$InstanceSpecialConfig;", "", "()V", "blackApiLevelList", "", "", "getBlackApiLevelList", "()Ljava/util/List;", "setBlackApiLevelList", "(Ljava/util/List;)V", "blackCpuList", "", "getBlackCpuList", "setBlackCpuList", "blackModelList", "getBlackModelList", "setBlackModelList", "blackRomList", "getBlackRomList", "setBlackRomList", "cpus", "getCpus", "setCpus", "maxApiLevel", "getMaxApiLevel", "()I", "setMaxApiLevel", "(I)V", "minApiLevel", "getMinApiLevel", "setMinApiLevel", "models", "getModels", "setModels", "roms", "getRoms", "setRoms", "toString", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class InstanceSpecialConfig {
        private List<Integer> blackApiLevelList;
        private List<String> blackCpuList;
        private List<String> blackModelList;
        private List<String> blackRomList;
        private List<String> cpus;
        private int maxApiLevel;
        private int minApiLevel;
        private List<String> models;
        private List<String> roms;

        public final List<Integer> getBlackApiLevelList() {
            return this.blackApiLevelList;
        }

        public final List<String> getBlackCpuList() {
            return this.blackCpuList;
        }

        public final List<String> getBlackModelList() {
            return this.blackModelList;
        }

        public final List<String> getBlackRomList() {
            return this.blackRomList;
        }

        public final List<String> getCpus() {
            return this.cpus;
        }

        public final int getMaxApiLevel() {
            return this.maxApiLevel;
        }

        public final int getMinApiLevel() {
            return this.minApiLevel;
        }

        public final List<String> getModels() {
            return this.models;
        }

        public final List<String> getRoms() {
            return this.roms;
        }

        public String toString() {
            return "RenderConfig{models=" + this.models + ", blackModelList=" + this.blackModelList + ", " + "cpus=" + this.cpus + ", blackCpuList=" + this.blackCpuList + ", " + "roms=" + this.roms + ", blackRomList=" + this.blackRomList + ", " + "blackApiLevelList=" + this.blackApiLevelList + ", " + "minApiLevel=" + this.minApiLevel + ", maxApiLevel=" + this.maxApiLevel + '}';
        }

        public final void setBlackApiLevelList(List<Integer> list) {
            this.blackApiLevelList = list;
        }

        public final void setBlackCpuList(List<String> list) {
            this.blackCpuList = list;
        }

        public final void setBlackModelList(List<String> list) {
            this.blackModelList = list;
        }

        public final void setBlackRomList(List<String> list) {
            this.blackRomList = list;
        }

        public final void setCpus(List<String> list) {
            this.cpus = list;
        }

        public final void setMaxApiLevel(int i) {
            this.maxApiLevel = i;
        }

        public final void setMinApiLevel(int i) {
            this.minApiLevel = i;
        }

        public final void setModels(List<String> list) {
            this.models = list;
        }

        public final void setRoms(List<String> list) {
            this.roms = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/net/service/SingleInstanceSettingsService$SingleInstanceConfig;", "", "()V", "instanceSpecialConfig", "Lcom/ss/android/vc/net/service/SingleInstanceSettingsService$InstanceSpecialConfig;", "getInstanceSpecialConfig", "()Lcom/ss/android/vc/net/service/SingleInstanceSettingsService$InstanceSpecialConfig;", "setInstanceSpecialConfig", "(Lcom/ss/android/vc/net/service/SingleInstanceSettingsService$InstanceSpecialConfig;)V", "useSingleInstance", "", "getUseSingleInstance", "()Ljava/lang/Boolean;", "setUseSingleInstance", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    private static final class SingleInstanceConfig {
        private InstanceSpecialConfig instanceSpecialConfig;
        private Boolean useSingleInstance;

        public final InstanceSpecialConfig getInstanceSpecialConfig() {
            return this.instanceSpecialConfig;
        }

        public final Boolean getUseSingleInstance() {
            return this.useSingleInstance;
        }

        public final void setInstanceSpecialConfig(InstanceSpecialConfig instanceSpecialConfig2) {
            this.instanceSpecialConfig = instanceSpecialConfig2;
        }

        public final void setUseSingleInstance(Boolean bool) {
            this.useSingleInstance = bool;
        }
    }

    private SingleInstanceSettingsService() {
    }

    public final boolean getSettingsOpen() {
        return settingsOpen;
    }

    @JvmStatic
    public static final void getSettings() {
        VCSettingsService.getSettings("vc_single_instance", new SingleInstanceSettingsService$getSettings$1());
    }

    static {
        long currentTimeMillis = System.currentTimeMillis();
        RomUtils.C26241a i = RomUtils.m94954i();
        Intrinsics.checkExpressionValueIsNotNull(i, "RomUtils.getRomInfo()");
        romType = i.mo93347d().toString();
        C60700b.m235851b("SingleInstanceSettingsService", "[init]", "romType： " + romType + ", duration: " + (System.currentTimeMillis() - currentTimeMillis));
    }

    private final boolean specialConfigOpen() {
        List<Integer> blackApiLevelList;
        boolean z;
        List<String> blackModelList;
        List<String> models;
        InstanceSpecialConfig instanceSpecialConfig = specialConfig;
        if (instanceSpecialConfig != null) {
            String model = DeviceUtils.getModel();
            C60700b.m235851b("SingleInstanceSettingsService", "specialConfigOpen", "Device model: " + model);
            if (CollectionUtils.isEmpty(instanceSpecialConfig.getModels()) || TextUtils.isEmpty(model)) {
                C60700b.m235864f("SingleInstanceSettingsService", "specialConfigOpen", "[specialConfigOpen] model invalid");
            } else {
                Intrinsics.checkExpressionValueIsNotNull(model, "model");
                Locale locale = Locale.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
                if (model != null) {
                    String lowerCase = model.toLowerCase(locale);
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    List<String> models2 = instanceSpecialConfig.getModels();
                    if ((models2 != null && models2.contains("all")) || ((models = instanceSpecialConfig.getModels()) != null && models.contains(lowerCase))) {
                        C60700b.m235851b("SingleInstanceSettingsService", "specialConfigOpen", "[specialConfigOpen] model list ok");
                        if (!CollectionUtils.isEmpty(instanceSpecialConfig.getBlackModelList()) && (blackModelList = instanceSpecialConfig.getBlackModelList()) != null && blackModelList.contains(lowerCase)) {
                            C60700b.m235851b("SingleInstanceSettingsService", "specialConfigOpen", "[specialConfigOpen] model black list not ok");
                            return false;
                        } else if (CollectionUtils.isEmpty(instanceSpecialConfig.getRoms()) || TextUtils.isEmpty(romType)) {
                            C60700b.m235864f("SingleInstanceSettingsService", "specialConfigOpen", "roms invalid");
                        } else {
                            List<String> roms = instanceSpecialConfig.getRoms();
                            if (roms == null || !roms.contains("all")) {
                                List<String> roms2 = instanceSpecialConfig.getRoms();
                                if (roms2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                Iterator<String> it = roms2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    String next = it.next();
                                    String str = romType;
                                    if (str != null && StringsKt.contains$default((CharSequence) str, (CharSequence) next, false, 2, (Object) null)) {
                                        z = true;
                                        break;
                                    }
                                }
                                if (!z) {
                                    return false;
                                }
                            } else {
                                C60700b.m235851b("SingleInstanceSettingsService", "specialConfigOpen", "roms contains all");
                            }
                            if (!CollectionUtils.isEmpty(instanceSpecialConfig.getBlackRomList())) {
                                List<String> blackRomList = instanceSpecialConfig.getBlackRomList();
                                if (blackRomList == null) {
                                    Intrinsics.throwNpe();
                                }
                                for (String str2 : blackRomList) {
                                    String str3 = romType;
                                    if (str3 != null && StringsKt.contains$default((CharSequence) str3, (CharSequence) str2, false, 2, (Object) null)) {
                                        return false;
                                    }
                                }
                            }
                            int i = Build.VERSION.SDK_INT;
                            if (instanceSpecialConfig.getMinApiLevel() >= 0 && instanceSpecialConfig.getMinApiLevel() > i) {
                                return false;
                            }
                            C60700b.m235851b("SingleInstanceSettingsService", "specialConfigOpen", "api min level ok");
                            if (instanceSpecialConfig.getMaxApiLevel() >= 0 && instanceSpecialConfig.getMaxApiLevel() < i) {
                                return false;
                            }
                            C60700b.m235851b("SingleInstanceSettingsService", "specialConfigOpen", "api max level ok");
                            if (CollectionUtils.isEmpty(instanceSpecialConfig.getBlackApiLevelList()) || (blackApiLevelList = instanceSpecialConfig.getBlackApiLevelList()) == null || !blackApiLevelList.contains(Integer.valueOf(i))) {
                                return true;
                            }
                            C60700b.m235851b("SingleInstanceSettingsService", "specialConfigOpen", "api level black level not ok");
                            return false;
                        }
                    }
                    return false;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    public final void setSettingsOpen(boolean z) {
        settingsOpen = z;
    }

    public final void updateConfig(String str) {
        String str2 = str;
        if (TextUtils.equals(str2, lastConfigStr)) {
            C60700b.m235851b("SingleInstanceSettingsService", "updateConfig1", "config equals last config: " + str);
            return;
        }
        C60700b.m235851b("SingleInstanceSettingsService", "updateConfig2", "New config: " + str);
        lastConfigStr = str;
        if (TextUtils.isEmpty(str2)) {
            specialConfig = null;
        } else {
            try {
                SingleInstanceConfig singleInstanceConfig = (SingleInstanceConfig) JSON.parseObject(str, SingleInstanceConfig.class);
                if (singleInstanceConfig != null) {
                    specialConfig = singleInstanceConfig.getInstanceSpecialConfig();
                    if (!Intrinsics.areEqual((Object) singleInstanceConfig.getUseSingleInstance(), (Object) true)) {
                        settingsOpen = false;
                    } else {
                        settingsOpen = specialConfigOpen();
                    }
                }
                C60700b.m235851b("SingleInstanceSettingsService", "updateConfig3", "device config: " + specialConfig);
            } catch (Exception e) {
                C60700b.m235864f("SingleInstanceSettingsService", "[updateConfig3.5]", e.getMessage());
            }
        }
        C60700b.m235851b("SingleInstanceSettingsService", "updateConfig4", "singleInstanceOpen = " + settingsOpen);
    }
}
