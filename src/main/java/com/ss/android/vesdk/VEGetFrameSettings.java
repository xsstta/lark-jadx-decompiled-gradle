package com.ss.android.vesdk;

public class VEGetFrameSettings {

    /* renamed from: a */
    public VEGetFrameType f161282a = VEGetFrameType.NORMAL_GET_FRAME_MODE;

    /* renamed from: b */
    public VESize f161283b = new VESize(576, 1024);

    /* renamed from: c */
    public VEGetFrameEffectType f161284c = VEGetFrameEffectType.NO_EFFECT;

    /* renamed from: d */
    public boolean f161285d;

    /* renamed from: e */
    public VEGetFrameFitMode f161286e = VEGetFrameFitMode.CENTER_CROP;

    /* renamed from: f */
    public VEMirrorMode f161287f = VEMirrorMode.NO_MIRROR;

    /* renamed from: g */
    public int f161288g = 0;

    /* renamed from: h */
    public int f161289h;

    /* renamed from: i */
    public boolean f161290i = false;

    /* renamed from: j */
    public String f161291j = "";

    /* renamed from: k */
    public VEResultType f161292k = VEResultType.RGBA_ARRAY;

    /* renamed from: l */
    public String f161293l = "";

    /* renamed from: m */
    public int f161294m = -1;

    public enum VEGetFrameEffectType {
        NO_EFFECT,
        SOME_EFFECT,
        FULL_EFFECT
    }

    public enum VEGetFrameFitMode {
        NONE,
        CENTER_INSIDE,
        CENTER_CROP
    }

    public enum VEGetFrameType {
        NORMAL_GET_FRAME_MODE,
        HD_GET_FRAME_MODE,
        RENDER_PICTURE_MODE,
        FOLLOW_SHOT_FRAME_MODE,
        SEQUENCE_FRAME_MODE,
        NO_FRAME_MODE
    }

    public enum VEMirrorMode {
        NO_MIRROR,
        X_MIRROR,
        Y_MIRROR
    }

    public enum VEResultType {
        RGBA_ARRAY,
        IMAGE_FILE
    }

    private VEGetFrameSettings() {
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof VEGetFrameSettings)) {
            return false;
        }
        VEGetFrameSettings vEGetFrameSettings = (VEGetFrameSettings) obj;
        if (this.f161282a == vEGetFrameSettings.f161282a && this.f161284c == vEGetFrameSettings.f161284c && this.f161285d == vEGetFrameSettings.f161285d && this.f161286e == vEGetFrameSettings.f161286e && this.f161283b.equals(vEGetFrameSettings.f161283b) && this.f161286e == vEGetFrameSettings.f161286e && this.f161287f == vEGetFrameSettings.f161287f && this.f161288g == vEGetFrameSettings.f161288g && this.f161289h == vEGetFrameSettings.f161289h && this.f161290i == vEGetFrameSettings.f161290i && this.f161291j.equals(vEGetFrameSettings.f161291j) && this.f161292k == vEGetFrameSettings.f161292k && this.f161293l.equals(vEGetFrameSettings.f161293l) && this.f161294m == vEGetFrameSettings.f161294m) {
            return true;
        }
        return false;
    }
}
