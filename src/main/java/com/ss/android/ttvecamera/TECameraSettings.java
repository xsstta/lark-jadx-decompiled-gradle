package com.ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TECameraSettings {

    /* renamed from: a */
    public static final String[] f150646a = {"auto", "portrait", "party", "sunset", "candlelight", "night", "hdr", "action", "landscape", "snow"};
    public static final int[] aj = {2, 0, 1, 3};
    public static final int[] ak = {1, 2, 0, 3};

    /* renamed from: A */
    public int f150647A = 1;

    /* renamed from: B */
    public Bundle f150648B = new Bundle();

    /* renamed from: C */
    public byte f150649C = 1;

    /* renamed from: D */
    public String f150650D = "auto";

    /* renamed from: E */
    public String f150651E = "0";

    /* renamed from: F */
    public String f150652F = "-1";

    /* renamed from: G */
    public C60295b f150653G = new C60295b();

    /* renamed from: H */
    public boolean f150654H = true;

    /* renamed from: I */
    public boolean f150655I = false;

    /* renamed from: J */
    public int f150656J = 0;

    /* renamed from: K */
    public int f150657K = 0;

    /* renamed from: L */
    public boolean f150658L = false;

    /* renamed from: M */
    public boolean f150659M = false;

    /* renamed from: N */
    public boolean f150660N = false;

    /* renamed from: O */
    public boolean f150661O = false;

    /* renamed from: P */
    public int f150662P = 50;

    /* renamed from: Q */
    public boolean f150663Q = false;

    /* renamed from: R */
    public boolean f150664R = false;

    /* renamed from: S */
    public int f150665S = 2500;

    /* renamed from: T */
    public int f150666T = 0;

    /* renamed from: U */
    public int f150667U = 30;

    /* renamed from: V */
    public boolean f150668V = false;

    /* renamed from: W */
    public boolean f150669W = false;

    /* renamed from: X */
    public boolean f150670X = false;

    /* renamed from: Y */
    public String f150671Y = "";

    /* renamed from: Z */
    public int f150672Z = 0;
    public String aa = "auto";
    public int ab = 1;
    public boolean ac = false;
    public boolean ad = false;
    public boolean ae = false;
    public boolean af = false;
    public final int ag = 5;
    public boolean ah = false;

    /* renamed from: ai  reason: collision with root package name */
    public boolean f175458ai = false;
    public ARConfig al = null;

    /* renamed from: b */
    public Context f150673b;

    /* renamed from: c */
    public int f150674c = 1;

    /* renamed from: d */
    public C60424p f150675d = new C60424p(7, 30);

    /* renamed from: e */
    public int f150676e = 0;

    /* renamed from: f */
    public int f150677f = 0;

    /* renamed from: g */
    public int f150678g = -1;

    /* renamed from: h */
    public int f150679h = 17;

    /* renamed from: i */
    public boolean f150680i = false;

    /* renamed from: j */
    public boolean f150681j = true;

    /* renamed from: k */
    public boolean f150682k = false;

    /* renamed from: l */
    public boolean f150683l = false;

    /* renamed from: m */
    public boolean f150684m = false;

    /* renamed from: n */
    public float f150685n = -1.0f;

    /* renamed from: o */
    public TEFrameSizei f150686o = new TEFrameSizei(1280, 720);

    /* renamed from: p */
    public TEFrameSizei f150687p = new TEFrameSizei(1920, 1080);

    /* renamed from: q */
    public TEFrameSizei f150688q = new TEFrameSizei(1920, 1080);

    /* renamed from: r */
    public int f150689r = 1;

    /* renamed from: s */
    public int f150690s = 0;

    /* renamed from: t */
    public int f150691t = 0;

    /* renamed from: u */
    public int f150692u = 0;

    /* renamed from: v */
    public int f150693v = 1;

    /* renamed from: w */
    public boolean f150694w = false;

    /* renamed from: x */
    public boolean f150695x = false;

    /* renamed from: y */
    public int f150696y = 0;

    /* renamed from: z */
    public int f150697z = 1;

    public static final class ARConfig {

        /* renamed from: a */
        public AugmentedFaceMode f150698a;

        /* renamed from: b */
        public CloudAnchorMode f150699b;

        /* renamed from: c */
        public DepthMode f150700c;

        /* renamed from: d */
        public FocusMode f150701d;

        /* renamed from: e */
        public LightEstimationMode f150702e;

        /* renamed from: f */
        public PlaneFindingMode f150703f;

        public enum AugmentedFaceMode {
            DISABLED,
            MESH3D
        }

        public enum CloudAnchorMode {
            DISABLED,
            ENABLED
        }

        public enum DepthMode {
            DISABLED,
            AUTOMATIC
        }

        public enum FocusMode {
            FIXED,
            AUTO
        }

        public enum LightEstimationMode {
            DISABLED,
            AMBIENT_INTENSITY,
            ENVIRONMENTAL_HDR
        }

        public enum PlaneFindingMode {
            DISABLED,
            HORIZONTAL,
            VERTICAL,
            HORIZONTAL_AND_VERTICAL
        }
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface CameraFacing {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface CameraFrameRateStrategy {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface CameraType {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface CaptureFlashStrategy {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface FPS {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface FlashMode {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface WhiteBalanceValue {
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraSettings$a */
    public interface AbstractC60294a {
        /* renamed from: a */
        void mo206523a(float[] fArr);
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraSettings$c */
    public interface AbstractC60296c {
        /* renamed from: a */
        void mo206526a(float[] fArr);
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraSettings$e */
    public interface AbstractC60298e {
        /* renamed from: a */
        void mo206527a(int i);

        /* renamed from: a */
        void mo206528a(int[] iArr);
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraSettings$f */
    public interface AbstractC60299f {
        /* renamed from: a */
        void mo206529a(float f);
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraSettings$i */
    public interface AbstractC60302i {
        /* renamed from: a */
        void mo206531a(TECameraFrame tECameraFrame, AbstractC60396i iVar);

        /* renamed from: a */
        void mo206532a(Exception exc);
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraSettings$j */
    public interface AbstractC60303j {
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraSettings$k */
    public interface AbstractC60304k {
        /* renamed from: a */
        void mo206533a(float f);
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraSettings$l */
    public interface AbstractC60305l {
        /* renamed from: a */
        void mo206534a(long[] jArr);
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraSettings$m */
    public interface AbstractC60306m {
        /* renamed from: a */
        void mo206535a(int i, float f, boolean z);

        /* renamed from: a */
        void mo206536a(int i, boolean z, boolean z2, float f, List<Integer> list);

        /* renamed from: a */
        boolean mo206537a();
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraSettings$g */
    public static class C60300g {

        /* renamed from: a */
        private int f150710a;

        /* renamed from: a */
        public int mo206530a() {
            return this.f150710a;
        }
    }

    /* renamed from: a */
    public TEFrameSizei mo206521a() {
        return this.f150686o;
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraSettings$d */
    public static final class C60297d {

        /* renamed from: a */
        private static final Map<String, Class> f150708a;

        /* renamed from: b */
        private static final Map<String, Integer> f150709b;

        /* renamed from: a */
        public static Set<String> m234222a() {
            return f150709b.keySet();
        }

        static {
            HashMap hashMap = new HashMap();
            f150708a = hashMap;
            hashMap.put("facing", Integer.class);
            hashMap.put("support_light_soft", Boolean.class);
            hashMap.put("device_support_wide_angle", Boolean.class);
            hashMap.put("device_support_anti_shake", Boolean.class);
            hashMap.put("device_support_camera", Boolean.class);
            hashMap.put("device_wide_angle_camera_id", String.class);
            hashMap.put("support_wide_angle", Boolean.class);
            hashMap.put("support_telephoto", Boolean.class);
            hashMap.put("support_body_beauty", Boolean.class);
            hashMap.put("support_anti_shake", Boolean.class);
            hashMap.put("support_fps_480", Boolean.class);
            hashMap.put("support_fps_120", Boolean.class);
            hashMap.put("support_fps_60", Boolean.class);
            hashMap.put("support_preview_sizes", ArrayList.class);
            hashMap.put("support_picture_sizes", ArrayList.class);
            hashMap.put("camera_preview_size", TEFrameSizei.class);
            hashMap.put("camera_focus_parameters", TEFocusParameters.class);
            hashMap.put("camera_torch_supported", Boolean.class);
            hashMap.put("support_video_sizes", ArrayList.class);
            HashMap hashMap2 = new HashMap();
            f150709b = hashMap2;
            hashMap2.put("support_depth_output", 8);
        }

        /* renamed from: a */
        public static Class m234221a(String str) {
            Map<String, Class> map = f150708a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        }

        /* renamed from: b */
        public static Integer m234223b(String str) {
            Map<String, Integer> map = f150709b;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        }
    }

    /* renamed from: b */
    public void mo206522b() {
        this.f150673b = null;
        this.f150648B.clear();
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraSettings$b */
    public static class C60295b {

        /* renamed from: a */
        public int f150704a;

        /* renamed from: b */
        public int f150705b;

        /* renamed from: c */
        public int f150706c;

        /* renamed from: d */
        public float f150707d;

        /* renamed from: a */
        public boolean mo206524a() {
            if (this.f150704a <= this.f150706c || this.f150707d <= 0.001f) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "ExposureCompensationInfo{max = " + this.f150704a + ", exposure = " + this.f150705b + ", min = " + this.f150706c + ", step = " + this.f150707d + "}";
        }
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraSettings$h */
    public static final class C60301h {

        /* renamed from: a */
        private static final Map<String, Class> f150711a;

        static {
            HashMap hashMap = new HashMap();
            f150711a = hashMap;
            hashMap.put("enable_body_beauty", Boolean.class);
            hashMap.put("enable_light_soft", Boolean.class);
            hashMap.put("enable_anti_shake", Boolean.class);
            hashMap.put("video_path", String.class);
            hashMap.put("body_beauty_level", Integer.class);
            hashMap.put("enable_dim_light_quality", Boolean.class);
            hashMap.put("enable_ai_night_video", Boolean.class);
            hashMap.put("enable_video_stabilization", Boolean.class);
            hashMap.put("enable_super_Stabilization", Boolean.class);
            hashMap.put("enable_video_hdr", Boolean.class);
        }

        /* renamed from: a */
        public static boolean m234228a(String str, Object obj) {
            Map<String, Class> map = f150711a;
            if (!map.containsKey(str) || (obj != null && obj.getClass() != map.get(str))) {
                return false;
            }
            return true;
        }
    }

    public TECameraSettings(Context context) {
        this.f150673b = context;
    }

    public TECameraSettings(Context context, int i) {
        this.f150673b = context;
        this.f150674c = i;
    }
}
