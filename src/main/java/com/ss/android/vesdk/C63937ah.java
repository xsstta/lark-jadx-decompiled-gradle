package com.ss.android.vesdk;

import android.content.Context;
import android.os.Build;
import com.bef.effectsdk.ResourceFinder;
import com.ss.android.ttve.log.C60193a;
import com.ss.android.ttve.monitor.C60217b;
import com.ss.android.ttve.monitor.C60229h;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESensService;
import com.ss.android.vesdk.runtime.C64056a;
import com.ss.android.vesdk.runtime.VERuntime;

/* renamed from: com.ss.android.vesdk.ah */
public class C63937ah {

    /* renamed from: a */
    public static int f161433a = C60229h.f150339a;

    /* renamed from: a */
    private static void m250991a() {
        if (((Integer) VEConfigCenter.m250617a().mo220632a("use_open_gl_three", (Object) 1)).intValue() == 1) {
            m251007e(true);
        } else {
            C63929ab.m250974a("VESDK", "No gles config");
        }
        VERuntime.m251385a(((Boolean) VEConfigCenter.m250617a().mo220632a("aeabtest_v2api", (Object) false)).booleanValue());
        VERuntime.m251386b(((Boolean) VEConfigCenter.m250617a().mo220632a("crossplat_glbase_fbo", (Object) false)).booleanValue());
        VERuntime.m251387c(((Boolean) VEConfigCenter.m250617a().mo220632a("enable_render_lib", (Object) false)).booleanValue());
        m251001b();
    }

    /* renamed from: b */
    private static void m251001b() {
        VESensService.getInstance().init();
        int registerSensCheckObject = VESensService.getInstance().registerSensCheckObject(VESensService.SENS_SERVICE_TYPE_MIC);
        int registerSensCheckObject2 = VESensService.getInstance().registerSensCheckObject(VESensService.SENS_SERVICE_TYPE_CAMERA);
        VESensService.getInstance().setStatusAbnormalAction(registerSensCheckObject, VESensService.ACTION_TYPE.ACTION_TYPE_ALOG);
        VESensService.getInstance().setStatusAbnormalAction(registerSensCheckObject2, VESensService.ACTION_TYPE.ACTION_TYPE_ALOG);
        C63929ab.m250974a("VESDK", "error action type default value:ACTION_TYPE_ALOG");
        VEConfigCenter.C63827a a = VEConfigCenter.m250617a().mo220631a("privacy_error_action");
        if (!(a == null || a.mo220637a() == null || !(a.mo220637a() instanceof Integer))) {
            int intValue = ((Integer) a.mo220637a()).intValue();
            VESensService.ACTION_TYPE[] values = VESensService.ACTION_TYPE.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                VESensService.ACTION_TYPE action_type = values[i];
                if (intValue == action_type.getActionType()) {
                    VESensService.getInstance().setStatusAbnormalAction(registerSensCheckObject, action_type);
                    VESensService.getInstance().setStatusAbnormalAction(registerSensCheckObject2, action_type);
                    break;
                }
                i++;
            }
            C63929ab.m250974a("VESDK", "error action type value:" + intValue);
        }
        VEConfigCenter.C63827a a2 = VEConfigCenter.m250617a().mo220631a("privacy_error_check_interval");
        if (!(a2 == null || a2.mo220637a() == null || !(a2.mo220637a() instanceof Integer))) {
            int intValue2 = ((Integer) a2.mo220637a()).intValue();
            VESensService.getInstance().setObjectStatusCheckInterval(intValue2);
            C63929ab.m250974a("VESDK", "error monitor time out value:" + intValue2);
        }
        VEConfigCenter.C63827a a3 = VEConfigCenter.m250617a().mo220631a("privacy_error_check_threshold");
        if (a3 != null && a3.mo220637a() != null && (a3.mo220637a() instanceof Integer)) {
            int intValue3 = ((Integer) a3.mo220637a()).intValue();
            VESensService.getInstance().setObjectStatusCheckThreshold(registerSensCheckObject, intValue3);
            VESensService.getInstance().setObjectStatusCheckThreshold(registerSensCheckObject2, intValue3);
            C63929ab.m250974a("VESDK", "error threshold time out value:" + intValue3);
        }
    }

    /* renamed from: a */
    public static void m250998a(boolean z) {
        C60229h.m234100a(z);
    }

    /* renamed from: b */
    public static void m251002b(boolean z) {
        C60217b.m234047a(z);
    }

    /* renamed from: a */
    public static void m250992a(byte b) {
        C63929ab.m250972a((String) null, b);
    }

    /* renamed from: d */
    public static void m251006d(boolean z) {
        VERuntime.m251382a().mo221785e(z);
    }

    /* renamed from: a */
    public static void m250994a(ResourceFinder resourceFinder) {
        VERuntime.m251382a().mo221777a(resourceFinder);
    }

    /* renamed from: c */
    public static boolean m251005c(boolean z) {
        return VERuntime.m251382a().mo221787f(z);
    }

    /* renamed from: e */
    public static void m251007e(boolean z) {
        if (Build.VERSION.SDK_INT >= 18) {
            VERuntime.m251382a().mo221783d(z);
            C63959c.m251064b(z);
            return;
        }
        VERuntime.m251382a().mo221783d(false);
        C63959c.m251064b(false);
    }

    /* renamed from: f */
    public static void m251008f(boolean z) {
        int g = VERuntime.m251382a().mo221788g(z);
        if (g == -108) {
            throw new VEException(g, "please set VEEnv or VEEnv#init");
        }
    }

    /* renamed from: a */
    public static void m250995a(VEListener.AbstractC63860c cVar) {
        VERuntime.m251382a().mo221775a(cVar);
    }

    /* renamed from: a */
    public static void m250996a(VEListener.AbstractC63881x xVar) {
        VERuntime.m251382a().mo221776a(xVar);
    }

    /* renamed from: a */
    public static void m250993a(Context context, String str) {
        an.m251029a(false);
        VERuntime.m251382a().mo221774a(context, str);
        C64056a.m251411a().mo221794a(str);
        VEConfigCenter.m250617a().mo220633b();
        m250991a();
    }

    /* renamed from: b */
    public static void m251003b(boolean z, int i) throws VEException {
        int b = VERuntime.m251382a().mo221778b(z, i);
        if (b == -108) {
            throw new VEException(b, "please set VEEnv or VEEnv#init");
        }
    }

    /* renamed from: a */
    public static void m250997a(AbstractC63928aa aaVar, boolean z) {
        C60193a.m233974a(aaVar);
        C60193a.m233972a();
        C60193a.m233975a(z);
    }

    /* renamed from: a */
    public static void m250999a(boolean z, int i) throws VEException {
        int a = VERuntime.m251382a().mo221772a(z, i);
        if (a == -108) {
            throw new VEException(a, "please set VEEnv or VEEnv#init");
        }
    }

    /* renamed from: b */
    public static void m251004b(boolean z, int i, int i2) throws VEException {
        int b = VERuntime.m251382a().mo221779b(z, i, i2);
        if (b == -108) {
            throw new VEException(b, "please set VEEnv or VEEnv#init");
        }
    }

    /* renamed from: a */
    public static void m251000a(boolean z, int i, int i2) throws VEException {
        int a = VERuntime.m251382a().mo221773a(z, i, i2);
        if (a == -108) {
            throw new VEException(a, "please set VEEnv or VEEnv#init");
        }
    }
}
