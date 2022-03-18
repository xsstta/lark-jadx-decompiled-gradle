package com.ss.android.vesdk.runtime;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.VEVideoEncodeSettings;

public class VEPublishSettingManager {

    /* renamed from: a */
    VEVideoEncodeSettings f161721a;

    private native int nativeGetEnableRemuxErrorCode();

    private native boolean nativeIsCanRemuxVideo();

    private native boolean nativeIsUseFilterProcess();

    private native int nativeSetEditorStatus(long j);

    private native int nativeSetVideoEncodeSettings(VEVideoEncodeSettings vEVideoEncodeSettings, long j);

    private native void nativeUpdateVideoEncodeSettings();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vesdk.runtime.VEPublishSettingManager$a */
    public enum EnumC64050a {
        INSTANCE;
        
        private VEPublishSettingManager vePublishSettingManager = new VEPublishSettingManager();

        public VEPublishSettingManager getInstance() {
            return this.vePublishSettingManager;
        }

        private EnumC64050a() {
        }
    }

    static {
        TENativeLibsLoader.m234143a();
    }

    private VEPublishSettingManager() {
    }

    /* renamed from: a */
    public static VEPublishSettingManager m251376a() {
        return EnumC64050a.INSTANCE.getInstance();
    }

    /* renamed from: b */
    public boolean mo221768b() {
        return nativeIsCanRemuxVideo();
    }

    /* renamed from: d */
    public int mo221770d() {
        return nativeGetEnableRemuxErrorCode();
    }

    /* renamed from: c */
    public VEVideoEncodeSettings mo221769c() {
        this.f161721a.setEnableRemuxVideo(nativeIsCanRemuxVideo());
        nativeUpdateVideoEncodeSettings();
        return this.f161721a;
    }

    /* renamed from: a */
    public int mo221766a(long j) {
        return nativeSetEditorStatus(j);
    }

    /* renamed from: a */
    public int mo221767a(VEVideoEncodeSettings vEVideoEncodeSettings, long j) {
        int nativeSetVideoEncodeSettings = nativeSetVideoEncodeSettings(vEVideoEncodeSettings, j);
        if (nativeSetVideoEncodeSettings != 0) {
            return nativeSetVideoEncodeSettings;
        }
        this.f161721a = vEVideoEncodeSettings;
        return 0;
    }
}
