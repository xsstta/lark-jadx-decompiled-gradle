package com.ss.android.vesdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.vesdk.VEConfigCenter;
import java.util.HashMap;
import java.util.Map;

public class VECameraSettings implements Parcelable {
    public static final Parcelable.Creator<VECameraSettings> CREATOR = new Parcelable.Creator<VECameraSettings>() {
        /* class com.ss.android.vesdk.VECameraSettings.C638161 */

        /* renamed from: a */
        public VECameraSettings[] newArray(int i) {
            return new VECameraSettings[i];
        }

        /* renamed from: a */
        public VECameraSettings createFromParcel(Parcel parcel) {
            return new VECameraSettings(parcel);
        }
    };

    /* renamed from: a */
    public static final String f161044a = "VECameraSettings";

    /* renamed from: d */
    public static final String[] f161045d = {"auto", "action", "barcode", "beach", "candlelight", "fireworks", "hdr", "landscape", "night", "night-portrait", "party", "portrait", "snow", "sports", "steadyphoto", "sunset", "theatre"};

    /* renamed from: A */
    public boolean f161046A;

    /* renamed from: B */
    public int f161047B;

    /* renamed from: C */
    public int f161048C;

    /* renamed from: D */
    public boolean f161049D;

    /* renamed from: E */
    public boolean f161050E;

    /* renamed from: F */
    public String f161051F;

    /* renamed from: G */
    public int f161052G;

    /* renamed from: H */
    public Bundle f161053H;

    /* renamed from: I */
    public CAMERA_CAPTURE_FLASH_STRATEGY f161054I;

    /* renamed from: J */
    public boolean f161055J;

    /* renamed from: K */
    public boolean f161056K;

    /* renamed from: L */
    public boolean f161057L;

    /* renamed from: M */
    public boolean f161058M;

    /* renamed from: N */
    public boolean f161059N;

    /* renamed from: O */
    private CAMERA_TYPE f161060O;

    /* renamed from: P */
    private CAMERA_FRAMERATE_STRATEGY f161061P;

    /* renamed from: Q */
    private boolean f161062Q;

    /* renamed from: R */
    private boolean f161063R;

    /* renamed from: S */
    private boolean f161064S;

    /* renamed from: T */
    private boolean f161065T;

    /* renamed from: U */
    private boolean f161066U;

    /* renamed from: V */
    private int f161067V;

    /* renamed from: W */
    private int f161068W;

    /* renamed from: X */
    private int f161069X;

    /* renamed from: Y */
    private boolean f161070Y;

    /* renamed from: Z */
    private boolean f161071Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;

    /* renamed from: b */
    int[] f161072b;

    /* renamed from: c */
    int[] f161073c;

    /* renamed from: e */
    public int f161074e;

    /* renamed from: f */
    public VESize f161075f;

    /* renamed from: g */
    public int[] f161076g;

    /* renamed from: h */
    public CAMERA_HW_LEVEL f161077h;

    /* renamed from: i */
    public CAMERA_TYPE f161078i;

    /* renamed from: j */
    public boolean f161079j;

    /* renamed from: k */
    public CAMERA_TYPE f161080k;

    /* renamed from: l */
    public CAMERA_FACING_ID f161081l;

    /* renamed from: m */
    public String f161082m;

    /* renamed from: n */
    public String f161083n;

    /* renamed from: o */
    public boolean f161084o;

    /* renamed from: p */
    public int f161085p;

    /* renamed from: q */
    public boolean f161086q;

    /* renamed from: r */
    public int f161087r;

    /* renamed from: s */
    public boolean f161088s;

    /* renamed from: t */
    public byte f161089t;

    /* renamed from: u */
    public VESize f161090u;

    /* renamed from: v */
    public CAMERA_OUTPUT_MODE f161091v;

    /* renamed from: w */
    public boolean f161092w;

    /* renamed from: x */
    public CAMERA_MODE_TYPE f161093x;

    /* renamed from: y */
    public boolean f161094y;

    /* renamed from: z */
    public float f161095z;

    public enum CAMERA_FRAMERATE_STRATEGY {
        DYNAMIC_FRAMERATE,
        FIXED_FRAMERATE_FOR_ALL,
        FIXED_FRAMERATE_FOR_REAR,
        DYNAMIC_FRAMERATE_WITHOUT_SELECT
    }

    public enum CAMERA_OUTPUT_AND_UPDATE_STRATEGY {
        STRATEGY_DEFAULT,
        STRATEGY_ONETHREAD_ONEOUT,
        STRATEGY_ONETHREAD_TWOOUT,
        STRATEGY_TWOTHREAD_ONEOUT,
        STRATEGY_TWOTHREAD_TWOOUT
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.vesdk.VECameraSettings$a */
    public static class C63824a {

        /* renamed from: a */
        private VECameraSettings f161097a = new VECameraSettings();

        /* renamed from: a */
        public VECameraSettings mo220615a() {
            return this.f161097a;
        }

        /* renamed from: a */
        public C63824a mo220609a(int i) {
            this.f161097a.f161087r = i;
            return this;
        }

        /* renamed from: b */
        public C63824a mo220616b(boolean z) {
            this.f161097a.f161084o = z;
            return this;
        }

        /* renamed from: c */
        public C63824a mo220617c(boolean z) {
            this.f161097a.f161086q = z;
            return this;
        }

        /* renamed from: a */
        public C63824a mo220611a(CAMERA_FACING_ID camera_facing_id) {
            this.f161097a.f161082m = (String) VEConfigCenter.m250617a().mo220632a("wide_camera_id", "-1");
            this.f161097a.f161081l = camera_facing_id;
            return this;
        }

        /* renamed from: a */
        public C63824a mo220612a(CAMERA_TYPE camera_type) {
            this.f161097a.f161078i = camera_type;
            this.f161097a.f161079j = false;
            return this;
        }

        /* renamed from: a */
        public C63824a mo220613a(String str) {
            this.f161097a.f161083n = str;
            return this;
        }

        /* renamed from: a */
        public C63824a mo220614a(boolean z) {
            this.f161097a.f161079j = z;
            return this;
        }

        /* renamed from: a */
        public C63824a mo220610a(int i, int i2) {
            this.f161097a.f161075f = new VESize(i, i2);
            return this;
        }
    }

    /* renamed from: A */
    public Bundle mo220513A() {
        return this.f161053H;
    }

    /* renamed from: B */
    public boolean mo220514B() {
        return this.f161049D;
    }

    /* renamed from: C */
    public boolean mo220515C() {
        return this.f161050E;
    }

    /* renamed from: D */
    public String mo220516D() {
        return this.f161051F;
    }

    /* renamed from: G */
    public CAMERA_MODE_TYPE mo220519G() {
        return this.f161093x;
    }

    /* renamed from: P */
    public CAMERA_CAPTURE_FLASH_STRATEGY mo220528P() {
        return this.f161054I;
    }

    /* renamed from: Q */
    public boolean mo220529Q() {
        return this.f161056K;
    }

    /* renamed from: R */
    public boolean mo220530R() {
        return this.aa;
    }

    /* renamed from: S */
    public boolean mo220531S() {
        return this.ab;
    }

    /* renamed from: T */
    public boolean mo220532T() {
        return this.ac;
    }

    /* renamed from: a */
    public CAMERA_FACING_ID mo220533a() {
        return this.f161081l;
    }

    /* renamed from: b */
    public String mo220536b() {
        return this.f161082m;
    }

    /* renamed from: d */
    public VESize mo220538d() {
        return this.f161075f;
    }

    /* renamed from: h */
    public int mo220543h() {
        return this.f161074e;
    }

    /* renamed from: i */
    public CAMERA_HW_LEVEL mo220544i() {
        return this.f161077h;
    }

    /* renamed from: j */
    public String mo220545j() {
        return this.f161083n;
    }

    /* renamed from: k */
    public byte mo220546k() {
        return this.f161089t;
    }

    /* renamed from: m */
    public int mo220548m() {
        return this.f161052G;
    }

    /* renamed from: o */
    public int mo220550o() {
        return this.f161087r;
    }

    /* renamed from: p */
    public CAMERA_OUTPUT_MODE mo220551p() {
        return this.f161091v;
    }

    /* renamed from: q */
    public boolean mo220552q() {
        return this.f161084o;
    }

    /* renamed from: r */
    public boolean mo220553r() {
        return this.f161086q;
    }

    /* renamed from: s */
    public boolean mo220554s() {
        return this.f161092w;
    }

    /* renamed from: t */
    public boolean mo220555t() {
        return this.f161046A;
    }

    /* renamed from: u */
    public boolean mo220556u() {
        return this.f161071Z;
    }

    /* renamed from: v */
    public boolean mo220557v() {
        return this.f161094y;
    }

    /* renamed from: x */
    public boolean mo220560x() {
        return this.f161058M;
    }

    /* renamed from: y */
    public boolean mo220561y() {
        return this.f161059N;
    }

    /* renamed from: z */
    public float mo220562z() {
        return this.f161095z;
    }

    /* renamed from: F */
    public boolean mo220518F() {
        boolean booleanValue = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_wide_fov_for_samsung", Boolean.valueOf(this.f161062Q))).booleanValue();
        this.f161062Q = booleanValue;
        return booleanValue;
    }

    /* renamed from: I */
    public boolean mo220521I() {
        boolean booleanValue = ((Boolean) VEConfigCenter.m250617a().mo220632a("is_use_setrecordinghint", Boolean.valueOf(this.f161063R))).booleanValue();
        this.f161063R = booleanValue;
        return booleanValue;
    }

    /* renamed from: J */
    public boolean mo220522J() {
        boolean booleanValue = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_camera_open_close_sync", Boolean.valueOf(this.f161064S))).booleanValue();
        this.f161064S = booleanValue;
        return booleanValue;
    }

    /* renamed from: K */
    public boolean mo220523K() {
        boolean booleanValue = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_force_close_camera_when_timeout", Boolean.valueOf(this.f161065T))).booleanValue();
        this.f161065T = booleanValue;
        return booleanValue;
    }

    /* renamed from: L */
    public boolean mo220524L() {
        boolean booleanValue = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_vboost", Boolean.valueOf(this.f161066U))).booleanValue();
        this.f161066U = booleanValue;
        return booleanValue;
    }

    /* renamed from: M */
    public int mo220525M() {
        int intValue = ((Integer) VEConfigCenter.m250617a().mo220632a("ve_vboost_timeout", Integer.valueOf((int) ParticipantRepo.f117150c))).intValue();
        this.f161067V = intValue;
        return intValue;
    }

    /* renamed from: N */
    public int mo220526N() {
        int intValue = ((Integer) VEConfigCenter.m250617a().mo220632a("ve_camera_focus_timeout", (Object) 2500)).intValue();
        this.f161068W = intValue;
        return intValue;
    }

    /* renamed from: O */
    public int mo220527O() {
        int intValue = ((Integer) VEConfigCenter.m250617a().mo220632a("ve_enable_gc_for_camera_metadata", (Object) 0)).intValue();
        this.f161069X = intValue;
        return intValue;
    }

    /* renamed from: c */
    public CAMERA_TYPE mo220537c() {
        if (!this.f161079j) {
            return this.f161078i;
        }
        if (this.f161060O == CAMERA_TYPE.NULL) {
            this.f161060O = m250540U();
        }
        return this.f161060O;
    }

    /* renamed from: g */
    public boolean mo220542g() {
        if (this.f161070Y || ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_camera_scene_diff_fps_opt", (Object) false)).booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public int mo220547l() {
        int intValue = ((Integer) VEConfigCenter.m250617a().mo220632a("ve_retry_count", (Object) 0)).intValue();
        if (intValue != 0) {
            this.f161047B = intValue;
        }
        return this.f161047B;
    }

    /* renamed from: n */
    public int mo220549n() {
        int intValue = ((Integer) VEConfigCenter.m250617a().mo220632a("ve_retry_start_preview_count", (Object) 0)).intValue();
        if (intValue != 0) {
            this.f161048C = intValue;
        }
        return this.f161048C;
    }

    /* renamed from: w */
    public boolean mo220558w() {
        boolean z = false;
        if (this.f161057L || ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_refactor_camera_focus", (Object) false)).booleanValue()) {
            z = true;
        }
        this.f161057L = z;
        return z;
    }

    /* renamed from: E */
    public boolean mo220517E() {
        if (!this.f161088s) {
            boolean booleanValue = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_face_detection", Boolean.valueOf(this.f161088s))).booleanValue();
            this.f161088s = booleanValue;
            this.f161053H.putBoolean("useCameraFaceDetect", booleanValue);
        }
        return this.f161088s;
    }

    /* renamed from: H */
    public CAMERA_FRAMERATE_STRATEGY mo220520H() {
        Integer num = (Integer) VEConfigCenter.m250617a().mo220632a("frame_rate_strategy", (Object) 0);
        if (num.intValue() == 1) {
            this.f161061P = CAMERA_FRAMERATE_STRATEGY.FIXED_FRAMERATE_FOR_ALL;
        } else if (num.intValue() == 2) {
            this.f161061P = CAMERA_FRAMERATE_STRATEGY.FIXED_FRAMERATE_FOR_REAR;
        } else if (num.intValue() == 3) {
            this.f161061P = CAMERA_FRAMERATE_STRATEGY.DYNAMIC_FRAMERATE_WITHOUT_SELECT;
        } else {
            this.f161061P = CAMERA_FRAMERATE_STRATEGY.DYNAMIC_FRAMERATE;
        }
        return this.f161061P;
    }

    /* renamed from: e */
    public int[] mo220540e() {
        int intValue;
        if (this.f161076g[0] == 7 && (intValue = ((Integer) VEConfigCenter.m250617a().mo220632a("ve_camera_fps_range", (Object) 7)).intValue()) != 0) {
            this.f161076g[0] = intValue;
        }
        return this.f161076g;
    }

    /* renamed from: f */
    public int mo220541f() {
        VEConfigCenter.C63827a a;
        if (this.f161085p == 30 && (a = VEConfigCenter.m250617a().mo220631a("ve_camera_fps_max")) != null && (a.mo220637a() instanceof Integer)) {
            this.f161085p = ((Integer) a.mo220637a()).intValue();
        }
        return this.f161085p;
    }

    public static final class Parameters {

        /* renamed from: a */
        private static final Map<String, Class> f161096a;

        public @interface NoiseReduce {
        }

        static {
            HashMap hashMap = new HashMap();
            f161096a = hashMap;
            hashMap.put("enable_body_beauty", Boolean.class);
            hashMap.put("body_beauty_level", Integer.class);
            hashMap.put("video_path", String.class);
            hashMap.put("enable_light_soft", Boolean.class);
            hashMap.put("enable_anti_shake", Boolean.class);
            hashMap.put("forceRunUpdateTexImg", String.class);
            hashMap.put("enable_dim_light_quality", Boolean.class);
            hashMap.put("enable_ai_night_video", Boolean.class);
            hashMap.put("enable_video_stabilization", Boolean.class);
            hashMap.put("enable_super_Stabilization", Boolean.class);
            hashMap.put("enable_video_hdr", Boolean.class);
            hashMap.put("noise_reduce", String.class);
        }
    }

    /* renamed from: U */
    private CAMERA_TYPE m250540U() {
        CAMERA_TYPE camera_type = this.f161080k;
        VEConfigCenter.C63827a a = VEConfigCenter.m250617a().mo220631a("ve_camera_type");
        if (a == null || a.mo220637a() == null || !(a.mo220637a() instanceof Integer)) {
            return camera_type;
        }
        int intValue = ((Integer) a.mo220637a()).intValue();
        String str = f161044a;
        C63929ab.m250974a(str, "getCameraTypeFromConfigCenter, cameraType = " + intValue);
        if (intValue != 0) {
            return m250541a(intValue);
        }
        VEConfigCenter.C63827a a2 = VEConfigCenter.m250617a().mo220631a("ve_is_in_camera2_blocklist");
        if (a2 == null || a2.mo220637a() == null || !(a2.mo220637a() instanceof Boolean)) {
            return camera_type;
        }
        if (((Boolean) a2.mo220637a()).booleanValue()) {
            return CAMERA_TYPE.TYPE1;
        }
        return CAMERA_TYPE.TYPE2;
    }

    private VECameraSettings() {
        this.f161072b = new int[]{2, 0, 1, 3};
        this.f161073c = new int[]{1, 2, 0, 3};
        this.f161074e = 30;
        this.f161075f = new VESize(720, 1280);
        this.f161076g = new int[]{7, 30};
        this.f161077h = CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEGACY;
        this.f161078i = CAMERA_TYPE.TYPE1;
        this.f161060O = CAMERA_TYPE.NULL;
        this.f161079j = false;
        this.f161080k = CAMERA_TYPE.TYPE2;
        this.f161081l = CAMERA_FACING_ID.FACING_FRONT;
        this.f161082m = "-1";
        this.f161083n = "auto";
        this.f161084o = false;
        this.f161061P = CAMERA_FRAMERATE_STRATEGY.DYNAMIC_FRAMERATE;
        this.f161062Q = false;
        this.f161063R = false;
        this.f161064S = true;
        this.f161065T = false;
        this.f161066U = false;
        this.f161067V = 50;
        this.f161068W = 2500;
        this.f161069X = 0;
        this.f161085p = 30;
        this.f161070Y = false;
        this.f161086q = false;
        this.f161087r = 0;
        this.f161088s = false;
        this.f161089t = 1;
        this.f161090u = new VESize(-1, -1);
        this.f161091v = CAMERA_OUTPUT_MODE.SURFACE;
        this.f161092w = true;
        this.f161093x = CAMERA_MODE_TYPE.VIDEO_MODE;
        this.f161094y = false;
        this.f161095z = -1.0f;
        this.f161046A = false;
        this.f161071Z = true;
        this.f161047B = 0;
        this.f161048C = 0;
        this.f161049D = false;
        this.f161050E = false;
        this.f161051F = "";
        this.f161052G = 1;
        this.f161054I = CAMERA_CAPTURE_FLASH_STRATEGY.TorchFakeStrategy;
        this.f161055J = false;
        this.f161056K = false;
        this.aa = false;
        this.ab = false;
        this.ac = false;
        this.f161057L = false;
        this.f161058M = false;
        this.f161059N = false;
        this.ad = false;
        this.f161078i = CAMERA_TYPE.TYPE1;
        this.f161081l = CAMERA_FACING_ID.FACING_FRONT;
        this.f161074e = 30;
        this.f161075f.width = 720;
        this.f161075f.height = 1280;
        this.f161053H = new Bundle();
    }

    /* renamed from: a */
    public void mo220534a(CAMERA_FACING_ID camera_facing_id) {
        this.f161081l = camera_facing_id;
    }

    /* renamed from: a */
    public void mo220535a(CAMERA_OUTPUT_MODE camera_output_mode) {
        this.f161091v = camera_output_mode;
    }

    /* renamed from: a */
    private static CAMERA_TYPE m250541a(int i) {
        CAMERA_TYPE camera_type;
        switch (i) {
            case 1:
                camera_type = CAMERA_TYPE.TYPE_OGXM;
                break;
            case 2:
                camera_type = CAMERA_TYPE.TYPE_GNOB;
                break;
            case 3:
                camera_type = CAMERA_TYPE.TYPE_CamKit;
                break;
            case 4:
                camera_type = CAMERA_TYPE.TYPE_BEWO;
                break;
            case 5:
                camera_type = CAMERA_TYPE.TYPE_GNOB_Unit;
                break;
            case 6:
                camera_type = CAMERA_TYPE.TYPE_GNOB_MEDIA;
                break;
            case 7:
                camera_type = CAMERA_TYPE.TYPE_VENDOR_RDHW;
                break;
            case 8:
                camera_type = CAMERA_TYPE.TYPE_VENDOR_GNOB;
                break;
            case 9:
                camera_type = CAMERA_TYPE.TYPE_OGXM_V2;
                break;
            default:
                camera_type = CAMERA_TYPE.TYPE2;
                break;
        }
        String str = f161044a;
        C63929ab.m250974a(str, "cameraTypeConverter type = " + i + " return type = " + camera_type);
        return camera_type;
    }

    protected VECameraSettings(Parcel parcel) {
        CAMERA_HW_LEVEL camera_hw_level;
        CAMERA_TYPE camera_type;
        CAMERA_TYPE camera_type2;
        boolean z;
        CAMERA_FACING_ID camera_facing_id;
        boolean z2;
        CAMERA_FRAMERATE_STRATEGY camera_framerate_strategy;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        CAMERA_OUTPUT_MODE camera_output_mode;
        boolean z10;
        CAMERA_MODE_TYPE camera_mode_type;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        this.f161072b = new int[]{2, 0, 1, 3};
        this.f161073c = new int[]{1, 2, 0, 3};
        this.f161074e = 30;
        this.f161075f = new VESize(720, 1280);
        this.f161076g = new int[]{7, 30};
        this.f161077h = CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEGACY;
        this.f161078i = CAMERA_TYPE.TYPE1;
        this.f161060O = CAMERA_TYPE.NULL;
        boolean z20 = false;
        this.f161079j = false;
        this.f161080k = CAMERA_TYPE.TYPE2;
        this.f161081l = CAMERA_FACING_ID.FACING_FRONT;
        this.f161082m = "-1";
        this.f161083n = "auto";
        this.f161084o = false;
        this.f161061P = CAMERA_FRAMERATE_STRATEGY.DYNAMIC_FRAMERATE;
        this.f161062Q = false;
        this.f161063R = false;
        this.f161064S = true;
        this.f161065T = false;
        this.f161066U = false;
        this.f161067V = 50;
        this.f161068W = 2500;
        this.f161069X = 0;
        this.f161085p = 30;
        this.f161070Y = false;
        this.f161086q = false;
        this.f161087r = 0;
        this.f161088s = false;
        this.f161089t = 1;
        this.f161090u = new VESize(-1, -1);
        this.f161091v = CAMERA_OUTPUT_MODE.SURFACE;
        this.f161092w = true;
        this.f161093x = CAMERA_MODE_TYPE.VIDEO_MODE;
        this.f161094y = false;
        this.f161095z = -1.0f;
        this.f161046A = false;
        this.f161071Z = true;
        this.f161047B = 0;
        this.f161048C = 0;
        this.f161049D = false;
        this.f161050E = false;
        this.f161051F = "";
        this.f161052G = 1;
        this.f161054I = CAMERA_CAPTURE_FLASH_STRATEGY.TorchFakeStrategy;
        this.f161055J = false;
        this.f161056K = false;
        this.aa = false;
        this.ab = false;
        this.ac = false;
        this.f161057L = false;
        this.f161058M = false;
        this.f161059N = false;
        this.ad = false;
        this.f161072b = parcel.createIntArray();
        this.f161073c = parcel.createIntArray();
        this.f161074e = parcel.readInt();
        this.f161075f = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.f161076g = parcel.createIntArray();
        int readInt = parcel.readInt();
        CAMERA_CAPTURE_FLASH_STRATEGY camera_capture_flash_strategy = null;
        if (readInt == -1) {
            camera_hw_level = null;
        } else {
            camera_hw_level = CAMERA_HW_LEVEL.values()[readInt];
        }
        this.f161077h = camera_hw_level;
        int readInt2 = parcel.readInt();
        if (readInt2 == -1) {
            camera_type = null;
        } else {
            camera_type = CAMERA_TYPE.values()[readInt2];
        }
        this.f161078i = camera_type;
        int readInt3 = parcel.readInt();
        if (readInt3 == -1) {
            camera_type2 = null;
        } else {
            camera_type2 = CAMERA_TYPE.values()[readInt3];
        }
        this.f161060O = camera_type2;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f161079j = z;
        int readInt4 = parcel.readInt();
        if (readInt4 == -1) {
            camera_facing_id = null;
        } else {
            camera_facing_id = CAMERA_FACING_ID.values()[readInt4];
        }
        this.f161081l = camera_facing_id;
        this.f161082m = parcel.readString();
        this.f161083n = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f161084o = z2;
        int readInt5 = parcel.readInt();
        if (readInt5 == -1) {
            camera_framerate_strategy = null;
        } else {
            camera_framerate_strategy = CAMERA_FRAMERATE_STRATEGY.values()[readInt5];
        }
        this.f161061P = camera_framerate_strategy;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f161062Q = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f161063R = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f161064S = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f161065T = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f161066U = z7;
        this.f161067V = parcel.readInt();
        this.f161068W = parcel.readInt();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f161086q = z8;
        this.f161087r = parcel.readInt();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f161088s = z9;
        this.f161089t = parcel.readByte();
        this.f161090u = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        int readInt6 = parcel.readInt();
        if (readInt6 == -1) {
            camera_output_mode = null;
        } else {
            camera_output_mode = CAMERA_OUTPUT_MODE.values()[readInt6];
        }
        this.f161091v = camera_output_mode;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f161092w = z10;
        int readInt7 = parcel.readInt();
        if (readInt7 == -1) {
            camera_mode_type = null;
        } else {
            camera_mode_type = CAMERA_MODE_TYPE.values()[readInt7];
        }
        this.f161093x = camera_mode_type;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f161094y = z11;
        this.f161095z = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f161046A = z12;
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f161071Z = z13;
        this.f161047B = parcel.readInt();
        this.f161048C = parcel.readInt();
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f161049D = z14;
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f161050E = z15;
        this.f161051F = parcel.readString();
        this.f161052G = parcel.readInt();
        this.f161053H = parcel.readBundle();
        int readInt8 = parcel.readInt();
        this.f161054I = readInt8 != -1 ? CAMERA_CAPTURE_FLASH_STRATEGY.values()[readInt8] : camera_capture_flash_strategy;
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.f161055J = z16;
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.f161056K = z17;
        if (parcel.readByte() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.f161057L = z18;
        if (parcel.readByte() != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.f161058M = z19;
        this.f161059N = parcel.readByte() != 0 ? true : z20;
    }

    public enum CAMERA_CAPTURE_FLASH_STRATEGY implements Parcelable {
        PreAndMainStrategy,
        TorchFakeStrategy,
        FlashOnRealStrategy,
        FlashOnSimulatedStrategy;
        
        public static final Parcelable.Creator<CAMERA_CAPTURE_FLASH_STRATEGY> CREATOR = new Parcelable.Creator<CAMERA_CAPTURE_FLASH_STRATEGY>() {
            /* class com.ss.android.vesdk.VECameraSettings.CAMERA_CAPTURE_FLASH_STRATEGY.C638171 */

            /* renamed from: a */
            public CAMERA_CAPTURE_FLASH_STRATEGY[] newArray(int i) {
                return new CAMERA_CAPTURE_FLASH_STRATEGY[i];
            }

            /* renamed from: a */
            public CAMERA_CAPTURE_FLASH_STRATEGY createFromParcel(Parcel parcel) {
                return CAMERA_CAPTURE_FLASH_STRATEGY.values()[parcel.readInt()];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum CAMERA_FACING_ID implements Parcelable {
        FACING_BACK,
        FACING_FRONT,
        FACING_WIDE_ANGLE,
        FACING_TELEPHOTO,
        FACING_3RD;
        
        public static final Parcelable.Creator<CAMERA_FACING_ID> CREATOR = new Parcelable.Creator<CAMERA_FACING_ID>() {
            /* class com.ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID.C638181 */

            /* renamed from: a */
            public CAMERA_FACING_ID[] newArray(int i) {
                return new CAMERA_FACING_ID[i];
            }

            /* renamed from: a */
            public CAMERA_FACING_ID createFromParcel(Parcel parcel) {
                return CAMERA_FACING_ID.values()[parcel.readInt()];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum CAMERA_FLASH_MODE implements Parcelable {
        CAMERA_FLASH_OFF,
        CAMERA_FLASH_ON,
        CAMERA_FLASH_TORCH,
        CAMERA_FLASH_AUTO,
        CAMERA_FLASH_RED_EYE;
        
        public static final Parcelable.Creator<CAMERA_FLASH_MODE> CREATOR = new Parcelable.Creator<CAMERA_FLASH_MODE>() {
            /* class com.ss.android.vesdk.VECameraSettings.CAMERA_FLASH_MODE.C638191 */

            /* renamed from: a */
            public CAMERA_FLASH_MODE[] newArray(int i) {
                return new CAMERA_FLASH_MODE[i];
            }

            /* renamed from: a */
            public CAMERA_FLASH_MODE createFromParcel(Parcel parcel) {
                return CAMERA_FLASH_MODE.values()[parcel.readInt()];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum CAMERA_HW_LEVEL implements Parcelable {
        CAMERA_HW_LEVEL_LEGACY,
        CAMERA_HW_LEVEL_LIMITED,
        CAMERA_HW_LEVEL_FULL,
        CAMERA_HW_LEVEL_LEVEL_3;
        
        public static final Parcelable.Creator<CAMERA_HW_LEVEL> CREATOR = new Parcelable.Creator<CAMERA_HW_LEVEL>() {
            /* class com.ss.android.vesdk.VECameraSettings.CAMERA_HW_LEVEL.C638201 */

            /* renamed from: a */
            public CAMERA_HW_LEVEL[] newArray(int i) {
                return new CAMERA_HW_LEVEL[i];
            }

            /* renamed from: a */
            public CAMERA_HW_LEVEL createFromParcel(Parcel parcel) {
                return CAMERA_HW_LEVEL.values()[parcel.readInt()];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum CAMERA_MODE_TYPE implements Parcelable {
        VIDEO_MODE,
        IMAGE_MODE,
        AR_MODE;
        
        public static final Parcelable.Creator<CAMERA_MODE_TYPE> CREATOR = new Parcelable.Creator<CAMERA_MODE_TYPE>() {
            /* class com.ss.android.vesdk.VECameraSettings.CAMERA_MODE_TYPE.C638211 */

            /* renamed from: a */
            public CAMERA_MODE_TYPE[] newArray(int i) {
                return new CAMERA_MODE_TYPE[i];
            }

            /* renamed from: a */
            public CAMERA_MODE_TYPE createFromParcel(Parcel parcel) {
                return CAMERA_MODE_TYPE.values()[parcel.readInt()];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum CAMERA_OUTPUT_MODE implements Parcelable {
        SURFACE,
        FRAME,
        SURFACE_FRAME,
        TWO_SURFACES;
        
        public static final Parcelable.Creator<CAMERA_OUTPUT_MODE> CREATOR = new Parcelable.Creator<CAMERA_OUTPUT_MODE>() {
            /* class com.ss.android.vesdk.VECameraSettings.CAMERA_OUTPUT_MODE.C638221 */

            /* renamed from: a */
            public CAMERA_OUTPUT_MODE[] newArray(int i) {
                return new CAMERA_OUTPUT_MODE[i];
            }

            /* renamed from: a */
            public CAMERA_OUTPUT_MODE createFromParcel(Parcel parcel) {
                return CAMERA_OUTPUT_MODE.values()[parcel.readInt()];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum CAMERA_TYPE implements Parcelable {
        NULL,
        TYPE1,
        TYPE2,
        TYPE_OGXM,
        TYPE_GNOB,
        TYPE_CamKit,
        TYPE_BEWO,
        TYPE_GNOB_Unit,
        TYPE_OGXM_V2,
        TYPE_GNOB_MEDIA,
        TYPE_VENDOR_RDHW,
        TYPE_VENDOR_GNOB;
        
        public static final Parcelable.Creator<CAMERA_TYPE> CREATOR = new Parcelable.Creator<CAMERA_TYPE>() {
            /* class com.ss.android.vesdk.VECameraSettings.CAMERA_TYPE.C638231 */

            /* renamed from: a */
            public CAMERA_TYPE[] newArray(int i) {
                return new CAMERA_TYPE[i];
            }

            /* renamed from: a */
            public CAMERA_TYPE createFromParcel(Parcel parcel) {
                return CAMERA_TYPE.values()[parcel.readInt()];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        parcel.writeIntArray(this.f161072b);
        parcel.writeIntArray(this.f161073c);
        parcel.writeInt(this.f161074e);
        parcel.writeParcelable(this.f161075f, i);
        parcel.writeIntArray(this.f161076g);
        CAMERA_HW_LEVEL camera_hw_level = this.f161077h;
        int i9 = -1;
        if (camera_hw_level == null) {
            i2 = -1;
        } else {
            i2 = camera_hw_level.ordinal();
        }
        parcel.writeInt(i2);
        CAMERA_TYPE camera_type = this.f161078i;
        if (camera_type == null) {
            i3 = -1;
        } else {
            i3 = camera_type.ordinal();
        }
        parcel.writeInt(i3);
        CAMERA_TYPE camera_type2 = this.f161060O;
        if (camera_type2 == null) {
            i4 = -1;
        } else {
            i4 = camera_type2.ordinal();
        }
        parcel.writeInt(i4);
        parcel.writeByte(this.f161079j ? (byte) 1 : 0);
        CAMERA_FACING_ID camera_facing_id = this.f161081l;
        if (camera_facing_id == null) {
            i5 = -1;
        } else {
            i5 = camera_facing_id.ordinal();
        }
        parcel.writeInt(i5);
        parcel.writeString(this.f161082m);
        parcel.writeString(this.f161083n);
        parcel.writeByte(this.f161084o ? (byte) 1 : 0);
        CAMERA_FRAMERATE_STRATEGY camera_framerate_strategy = this.f161061P;
        if (camera_framerate_strategy == null) {
            i6 = -1;
        } else {
            i6 = camera_framerate_strategy.ordinal();
        }
        parcel.writeInt(i6);
        parcel.writeByte(this.f161062Q ? (byte) 1 : 0);
        parcel.writeByte(this.f161063R ? (byte) 1 : 0);
        parcel.writeByte(this.f161064S ? (byte) 1 : 0);
        parcel.writeByte(this.f161065T ? (byte) 1 : 0);
        parcel.writeByte(this.f161066U ? (byte) 1 : 0);
        parcel.writeInt(this.f161067V);
        parcel.writeInt(this.f161068W);
        parcel.writeByte(this.f161086q ? (byte) 1 : 0);
        parcel.writeInt(this.f161087r);
        parcel.writeByte(this.f161088s ? (byte) 1 : 0);
        parcel.writeByte(this.f161089t);
        parcel.writeParcelable(this.f161090u, i);
        CAMERA_OUTPUT_MODE camera_output_mode = this.f161091v;
        if (camera_output_mode == null) {
            i7 = -1;
        } else {
            i7 = camera_output_mode.ordinal();
        }
        parcel.writeInt(i7);
        parcel.writeByte(this.f161092w ? (byte) 1 : 0);
        CAMERA_MODE_TYPE camera_mode_type = this.f161093x;
        if (camera_mode_type == null) {
            i8 = -1;
        } else {
            i8 = camera_mode_type.ordinal();
        }
        parcel.writeInt(i8);
        parcel.writeByte(this.f161094y ? (byte) 1 : 0);
        parcel.writeFloat(this.f161095z);
        parcel.writeByte(this.f161046A ? (byte) 1 : 0);
        parcel.writeByte(this.f161071Z ? (byte) 1 : 0);
        parcel.writeInt(this.f161047B);
        parcel.writeInt(this.f161048C);
        parcel.writeByte(this.f161049D ? (byte) 1 : 0);
        parcel.writeByte(this.f161050E ? (byte) 1 : 0);
        parcel.writeString(this.f161051F);
        parcel.writeInt(this.f161052G);
        parcel.writeBundle(this.f161053H);
        CAMERA_CAPTURE_FLASH_STRATEGY camera_capture_flash_strategy = this.f161054I;
        if (camera_capture_flash_strategy != null) {
            i9 = camera_capture_flash_strategy.ordinal();
        }
        parcel.writeInt(i9);
        parcel.writeByte(this.f161055J ? (byte) 1 : 0);
        parcel.writeByte(this.f161056K ? (byte) 1 : 0);
        parcel.writeByte(this.f161057L ? (byte) 1 : 0);
        parcel.writeByte(this.f161058M ? (byte) 1 : 0);
        parcel.writeByte(this.f161059N ? (byte) 1 : 0);
    }
}
