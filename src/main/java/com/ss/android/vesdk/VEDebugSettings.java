package com.ss.android.vesdk;

import java.io.File;

public class VEDebugSettings {

    /* renamed from: a */
    public boolean f161107a;

    /* renamed from: b */
    public EnumC63830b f161108b;

    /* renamed from: c */
    public String f161109c;

    /* renamed from: d */
    public String f161110d;

    /* renamed from: e */
    public String f161111e;

    /* renamed from: com.ss.android.vesdk.VEDebugSettings$b */
    enum EnumC63830b {
        CAPTURE,
        PREVIEW,
        BOTH
    }

    /* renamed from: com.ss.android.vesdk.VEDebugSettings$a */
    public static final class C63829a {

        /* renamed from: a */
        private final VEDebugSettings f161112a = new VEDebugSettings();

        /* renamed from: a */
        public VEDebugSettings mo220657a() {
            return this.f161112a;
        }
    }

    /* renamed from: a */
    public String mo220654a() {
        return this.f161110d;
    }

    /* renamed from: b */
    public boolean mo220655b() {
        if (!this.f161107a) {
            return false;
        }
        if (this.f161108b == EnumC63830b.BOTH || this.f161108b == EnumC63830b.CAPTURE) {
            return true;
        }
        return false;
    }

    private VEDebugSettings() {
        this.f161108b = EnumC63830b.CAPTURE;
        this.f161109c = "sdcard/vemo";
        this.f161110d = this.f161109c + File.separator + "capture";
        this.f161111e = this.f161109c + File.separator + "preview";
    }

    public String toString() {
        return "DebugSettings{mEnableImageDump=" + this.f161107a + ", mImageDumpType=" + this.f161108b + ", mImageDumpDir=" + this.f161109c + ", mCaptureDir=" + this.f161110d + ", mPreviewDir=" + this.f161111e + "}";
    }
}
