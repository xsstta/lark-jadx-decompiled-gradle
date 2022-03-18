package com.tt.miniapp.permission;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.miniapphost.util.C67590h;
import com.tt.option.p3394o.C67663c;
import com.tt.p3257c.C65680a;
import com.tt.refer.common.base.AppType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.permission.b */
public final class C66578b {

    /* renamed from: a */
    private static final List<Integer> f168114a;

    /* renamed from: com.tt.miniapp.permission.b$a */
    public static class C66579a {

        /* renamed from: d */
        private static final Map<AppType, Map<Integer, C66579a>> f168115d = new HashMap();

        /* renamed from: e */
        private static final Map<AppType, List<C66579a>> f168116e = new HashMap();

        /* renamed from: f */
        private static final Map<AppType, List<C66579a>> f168117f = new HashMap();

        /* renamed from: g */
        private static final Map<AppType, List<C66579a>> f168118g = new HashMap();

        /* renamed from: a */
        public final int f168119a;

        /* renamed from: b */
        public int f168120b;

        /* renamed from: c */
        public String f168121c;

        /* renamed from: h */
        private int f168122h;

        /* renamed from: i */
        private String f168123i;

        /* renamed from: j */
        private String f168124j;

        /* renamed from: k */
        private String[] f168125k;

        /* renamed from: a */
        public int mo232177a() {
            return this.f168120b;
        }

        /* renamed from: c */
        public String mo232179c() {
            return this.f168121c;
        }

        /* renamed from: d */
        public String mo232180d() {
            return this.f168123i;
        }

        /* renamed from: e */
        public String mo232181e() {
            return this.f168124j;
        }

        /* renamed from: f */
        public String[] mo232182f() {
            return this.f168125k;
        }

        /* renamed from: b */
        public String mo232178b() {
            return C67590h.m263073a(this.f168122h);
        }

        /* renamed from: a */
        public static C66579a m260109a(IAppContext iAppContext) {
            return m260117d(11, iAppContext);
        }

        /* renamed from: b */
        public static C66579a m260113b(IAppContext iAppContext) {
            return m260117d(12, iAppContext);
        }

        /* renamed from: c */
        public static C66579a m260116c(IAppContext iAppContext) {
            return m260117d(21, iAppContext);
        }

        /* renamed from: d */
        public static C66579a m260118d(IAppContext iAppContext) {
            return m260117d(13, iAppContext);
        }

        /* renamed from: e */
        public static C66579a m260120e(IAppContext iAppContext) {
            return m260117d(14, iAppContext);
        }

        /* renamed from: f */
        public static C66579a m260121f(IAppContext iAppContext) {
            return m260117d(17, iAppContext);
        }

        /* renamed from: g */
        public static C66579a m260122g(IAppContext iAppContext) {
            return m260117d(15, iAppContext);
        }

        /* renamed from: h */
        public static C66579a m260123h(IAppContext iAppContext) {
            return m260117d(16, iAppContext);
        }

        /* renamed from: i */
        public static C66579a m260124i(IAppContext iAppContext) {
            return m260117d(18, iAppContext);
        }

        /* renamed from: j */
        public static C66579a m260125j(IAppContext iAppContext) {
            return m260117d(19, iAppContext);
        }

        /* renamed from: k */
        public static C66579a m260126k(IAppContext iAppContext) {
            return m260117d(20, iAppContext);
        }

        /* renamed from: m */
        public static List<C66579a> m260128m(IAppContext iAppContext) {
            Map<AppType, List<C66579a>> map = f168118g;
            if (map.containsKey(iAppContext.getAppType())) {
                return map.get(iAppContext.getAppType());
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m260109a(iAppContext));
            arrayList.add(m260122g(iAppContext));
            arrayList.add(m260123h(iAppContext));
            map.put(iAppContext.getAppType(), arrayList);
            return arrayList;
        }

        /* renamed from: l */
        public static List<C66579a> m260127l(IAppContext iAppContext) {
            Map<AppType, List<C66579a>> map = f168116e;
            if (map.containsKey(iAppContext.getAppType())) {
                return map.get(iAppContext.getAppType());
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m260109a(iAppContext));
            arrayList.add(m260113b(iAppContext));
            arrayList.add(m260120e(iAppContext));
            arrayList.add(m260121f(iAppContext));
            arrayList.add(m260118d(iAppContext));
            arrayList.add(m260122g(iAppContext));
            map.put(iAppContext.getAppType(), arrayList);
            return arrayList;
        }

        /* renamed from: a */
        public static boolean m260112a(C66579a aVar, IAppContext iAppContext) {
            List<C66579a> list;
            Map<AppType, List<C66579a>> map = f168117f;
            if (map.containsKey(iAppContext.getAppType()) && (list = map.get(iAppContext.getAppType())) != null) {
                return list.contains(aVar);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m260123h(iAppContext));
            map.put(iAppContext.getAppType(), arrayList);
            return arrayList.contains(aVar);
        }

        /* renamed from: a */
        public static String m260111a(int i, IAppContext iAppContext) {
            String empty = CharacterUtils.empty();
            C67663c permissionCustomDialogMsgEntity = HostDependManager.getInst().getPermissionCustomDialogMsgEntity(iAppContext);
            if (permissionCustomDialogMsgEntity == null) {
                return empty;
            }
            switch (i) {
                case 11:
                    return permissionCustomDialogMsgEntity.mo234916a();
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return permissionCustomDialogMsgEntity.mo234917b();
                case 13:
                    return permissionCustomDialogMsgEntity.mo234918c();
                case 14:
                    return permissionCustomDialogMsgEntity.mo234919d();
                case 15:
                    return permissionCustomDialogMsgEntity.mo234921f();
                case 16:
                    return permissionCustomDialogMsgEntity.mo234922g();
                case 17:
                    return permissionCustomDialogMsgEntity.mo234920e();
                case 18:
                default:
                    return empty;
                case 19:
                    return permissionCustomDialogMsgEntity.mo234923h();
                case 20:
                    return permissionCustomDialogMsgEntity.mo234924i();
                case 21:
                    return permissionCustomDialogMsgEntity.mo234925j();
            }
        }

        /* renamed from: c */
        public static C66579a m260115c(int i, IAppContext iAppContext) {
            switch (i) {
                case 11:
                    return m260109a(iAppContext);
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return m260113b(iAppContext);
                case 13:
                    return m260118d(iAppContext);
                case 14:
                    return m260120e(iAppContext);
                case 15:
                    return m260122g(iAppContext);
                case 16:
                    return m260123h(iAppContext);
                case 17:
                    return m260121f(iAppContext);
                case 18:
                    return m260124i(iAppContext);
                case 19:
                    return m260125j(iAppContext);
                case 20:
                    return m260126k(iAppContext);
                case 21:
                    return m260116c(iAppContext);
                default:
                    return null;
            }
        }

        /* renamed from: d */
        private static C66579a m260117d(int i, IAppContext iAppContext) {
            Map<AppType, Map<Integer, C66579a>> map = f168115d;
            if (map.containsKey(iAppContext.getAppType())) {
                Map<Integer, C66579a> map2 = map.get(iAppContext.getAppType());
                if (map2 != null && map2.containsKey(Integer.valueOf(i))) {
                    return map2.get(Integer.valueOf(i));
                }
                C66579a e = m260119e(i, iAppContext);
                if (map2 == null) {
                    map2 = new HashMap<>();
                    map.put(iAppContext.getAppType(), map2);
                }
                map2.put(Integer.valueOf(i), e);
                return e;
            }
            HashMap hashMap = new HashMap();
            C66579a e2 = m260119e(i, iAppContext);
            hashMap.put(Integer.valueOf(i), e2);
            map.put(iAppContext.getAppType(), hashMap);
            return e2;
        }

        /* renamed from: b */
        public static String m260114b(int i, IAppContext iAppContext) {
            AppbrandApplicationImpl inst;
            AppConfig appConfig;
            String empty = CharacterUtils.empty();
            if (C65680a.m257567a(iAppContext) || iAppContext == null || (inst = AppbrandApplicationImpl.getInst(iAppContext)) == null || (appConfig = inst.getAppConfig()) == null || appConfig.mo230044e() == null) {
                return empty;
            }
            switch (i) {
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return appConfig.mo230044e().mo230052a();
                case 13:
                    return appConfig.mo230044e().mo230054c();
                case 14:
                    return appConfig.mo230044e().mo230056e();
                case 15:
                    return appConfig.mo230044e().mo230053b();
                case 16:
                case 18:
                default:
                    return empty;
                case 17:
                    return appConfig.mo230044e().mo230055d();
                case 19:
                    return appConfig.mo230044e().mo230057f();
                case 20:
                    return appConfig.mo230044e().mo230058g();
                case 21:
                    return appConfig.mo230044e().mo230059h();
            }
        }

        /* renamed from: e */
        private static C66579a m260119e(int i, IAppContext iAppContext) {
            switch (i) {
                case 11:
                    return new C66579a(4, 11, R.string.microapp_m_user_info, "scope.userInfo", null, iAppContext);
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return new C66579a(32, 12, R.string.microapp_m_geo_location, "scope.userLocation", new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, iAppContext);
                case 13:
                    return new C66579a(8, 13, R.string.microapp_m_REQUEST_PERMISSION_DESCRIPT_RECORD_AUDIO, "scope.record", new String[]{"android.permission.RECORD_AUDIO"}, iAppContext);
                case 14:
                    return new C66579a(1, 14, R.string.microapp_m_REQUEST_PERMISSION_DESCRIPT_CAMERA, "scope.camera", new String[]{"android.permission.CAMERA"}, iAppContext);
                case 15:
                    return new C66579a(16, 15, R.string.microapp_m_address_receive_mail, "scope.address", null, iAppContext);
                case 16:
                    return new C66579a(0, 16, R.string.microapp_m_phone_number, null, null, iAppContext);
                case 17:
                    return new C66579a(2, 17, R.string.microapp_m_album, "scope.album", new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, iAppContext);
                case 18:
                    return new C66579a(64, 18, R.string.microapp_m_screen_record, "scope.screenRecord", null, iAppContext);
                case 19:
                    return new C66579a(0, 19, R.string.LittleApp_GadgetAndriod_PermissionName_Clipboard, "scope.clipboard", null, iAppContext);
                case 20:
                    return new C66579a(SmActions.ACTION_ONTHECALL_EXIT, 20, R.string.OpenPlatform_AppCenter_BadgeTab, "scope.appBadge", null, iAppContext);
                case 21:
                    return new C66579a(0, 21, R.string.LittleApp_StepsApi_ScopeName, "scope.runData", new String[]{"android.permission.ACTIVITY_RECOGNITION"}, iAppContext);
                default:
                    return null;
            }
        }

        /* renamed from: a */
        public static C66579a m260110a(String str, IAppContext iAppContext) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1025075588:
                    if (str.equals("scope.clipboard")) {
                        c = 0;
                        break;
                    }
                    break;
                case -653473286:
                    if (str.equals("scope.userLocation")) {
                        c = 1;
                        break;
                    }
                    break;
                case -21617665:
                    if (str.equals("scope.camera")) {
                        c = 2;
                        break;
                    }
                    break;
                case 330013499:
                    if (str.equals("scope.runData")) {
                        c = 3;
                        break;
                    }
                    break;
                case 411225387:
                    if (str.equals("scope.record")) {
                        c = 4;
                        break;
                    }
                    break;
                case 583039347:
                    if (str.equals("scope.userInfo")) {
                        c = 5;
                        break;
                    }
                    break;
                case 786754871:
                    if (str.equals("scope.screenRecord")) {
                        c = 6;
                        break;
                    }
                    break;
                case 986629481:
                    if (str.equals("scope.writePhotosAlbum")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1244699221:
                    if (str.equals("scope.album")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1927763546:
                    if (str.equals("scope.address")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1990324316:
                    if (str.equals("scope.appBadge")) {
                        c = '\n';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return m260125j(iAppContext);
                case 1:
                    return m260113b(iAppContext);
                case 2:
                    return m260120e(iAppContext);
                case 3:
                    return m260116c(iAppContext);
                case 4:
                    return m260118d(iAppContext);
                case 5:
                    return m260109a(iAppContext);
                case 6:
                    return m260124i(iAppContext);
                case 7:
                case '\b':
                    return m260121f(iAppContext);
                case '\t':
                    return m260122g(iAppContext);
                case '\n':
                    return m260126k(iAppContext);
                default:
                    return null;
            }
        }

        public C66579a(int i, int i2, int i3, String str, String[] strArr, IAppContext iAppContext) {
            this(i, i2, i3, m260114b(i2, iAppContext), str, strArr, iAppContext);
        }

        public C66579a(int i, int i2, int i3, String str, String str2, String[] strArr, IAppContext iAppContext) {
            this(i, i2, i3, m260111a(i2, iAppContext), str, str2, strArr);
        }

        public C66579a(int i, int i2, int i3, String str, String str2, String str3, String[] strArr) {
            this.f168119a = i;
            this.f168120b = i2;
            this.f168122h = i3;
            this.f168121c = str;
            this.f168123i = str2;
            this.f168124j = str3;
            this.f168125k = strArr;
            if (TextUtils.isEmpty(str)) {
                switch (i2) {
                    case 11:
                        this.f168121c = "- " + C67590h.m263073a((int) R.string.LittleApp_UserInfoPermission_PermissionName);
                        break;
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        this.f168121c = "- " + C67590h.m263073a((int) R.string.microapp_m_acquire_geo_info);
                        break;
                    case 13:
                        this.f168121c = "- " + C67590h.m263073a((int) R.string.microapp_m_acquire_microphone);
                        break;
                    case 14:
                        this.f168121c = "- " + C67590h.m263073a((int) R.string.microapp_m_acquire_camera);
                        break;
                    case 15:
                        this.f168121c = "- " + C67590h.m263073a((int) R.string.microapp_m_acquire_your_receive_address);
                        break;
                    case 16:
                        this.f168121c = "- " + C67590h.m263073a((int) R.string.microapp_m_acquire_your_binding_phonenum);
                        break;
                    case 17:
                        this.f168121c = "- " + C67590h.m263073a((int) R.string.microapp_m_acquire_album);
                        break;
                    case 19:
                        this.f168121c = "- " + C67590h.m263073a((int) R.string.LittleApp_GadgetAndriod_PermissionName_Clipboard);
                        break;
                    case 20:
                        this.f168121c = "- " + C67590h.m263073a((int) R.string.OpenPlatform_AppCenter_BadgeTab);
                    case 21:
                        this.f168121c = "- " + C67590h.m263073a((int) R.string.LittleApp_StepsApi_ScopeNameDetail);
                        break;
                }
            }
            if (TextUtils.isEmpty(str2)) {
                switch (i2) {
                    case 11:
                        this.f168123i = C67590h.m263073a((int) R.string.LittleApp_UserInfoPermission_PermissionDescForClient);
                        return;
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        this.f168123i = C67590h.m263073a((int) R.string.mircoapp_m_user_location_authorize_description);
                        return;
                    case 13:
                        this.f168123i = C67590h.m263073a((int) R.string.mircoapp_m_record_authorize_description);
                        return;
                    case 14:
                        this.f168123i = C67590h.m263073a((int) R.string.mircoapp_m_camera_authorize_description);
                        return;
                    case 15:
                        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                        if (applicationContext != null) {
                            this.f168123i = C67590h.m263073a((int) R.string.mircoapp_m_address_authorize_description_prefix) + "“" + AppbrandUtil.getApplicationName(applicationContext) + "”" + C67590h.m263073a((int) R.string.mircoapp_m_address_authorize_description_suffix);
                            return;
                        }
                        return;
                    case 16:
                    case 18:
                    default:
                        return;
                    case 17:
                        this.f168123i = C67590h.m263073a((int) R.string.mircoapp_m_album_authorize_description);
                        return;
                    case 19:
                        this.f168123i = C67590h.m263073a((int) R.string.LittleApp_GadgetAndriod_PermissionMsg_Clipboard);
                        return;
                    case 20:
                        this.f168123i = C67590h.m263073a((int) R.string.OpenPlatform_AppCenter_BadgeTtl);
                        return;
                    case 21:
                        this.f168123i = C67590h.m263073a((int) R.string.LittleApp_StepsApi_ScopeDescForClient);
                        return;
                }
            }
        }
    }

    /* renamed from: a */
    public static List<Integer> m260106a() {
        return f168114a;
    }

    static {
        ArrayList arrayList = new ArrayList();
        f168114a = arrayList;
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(16);
        arrayList.add(17);
        arrayList.add(18);
        arrayList.add(19);
        arrayList.add(20);
        arrayList.add(21);
    }

    /* renamed from: c */
    public static boolean m260108c(String str) {
        return str.contains("permission");
    }

    /* renamed from: a */
    public static String m260105a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str + ":fail " + "auth deny");
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "BrandPermissionUtils", e.getStackTrace());
            return "";
        }
    }

    /* renamed from: b */
    public static String m260107b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str + ":fail " + "system auth deny");
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "BrandPermissionUtils", e.getStackTrace());
            return "";
        }
    }
}
