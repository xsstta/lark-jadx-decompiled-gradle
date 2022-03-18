package com.bytedance.ee.larkbrand.permission.p662a;

import android.content.Context;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12887b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3362a.p3367e.C67462h;
import com.tt.miniapphost.util.C67590h;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.permission.a.a */
public class C13282a {

    /* renamed from: com.bytedance.ee.larkbrand.permission.a.a$a */
    public static class C13283a {

        /* renamed from: a */
        public static final C66578b.C66579a f35180a = new C66578b.C66579a(0, 16, (int) R.string.microapp_m_album, C67590h.m263073a((int) R.string.lark_brand_permission_msg_write_photos_album), (String) null, "scope.writePhotosAlbum", new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});

        /* renamed from: b */
        private static final Map<AppType, List<C66578b.C66579a>> f35181b = new HashMap();

        /* renamed from: c */
        private static final Map<AppType, Map<Integer, C66578b.C66579a>> f35182c = new HashMap();

        /* renamed from: a */
        public static C66578b.C66579a m54097a(IAppContext iAppContext) {
            return m54098b(11, iAppContext);
        }

        /* renamed from: b */
        public static C66578b.C66579a m54099b(IAppContext iAppContext) {
            return m54098b(12, iAppContext);
        }

        /* renamed from: c */
        public static C66578b.C66579a m54100c(IAppContext iAppContext) {
            return m54098b(21, iAppContext);
        }

        /* renamed from: d */
        public static C66578b.C66579a m54101d(IAppContext iAppContext) {
            return m54098b(19, iAppContext);
        }

        /* renamed from: e */
        public static C66578b.C66579a m54102e(IAppContext iAppContext) {
            return m54098b(13, iAppContext);
        }

        /* renamed from: f */
        public static C66578b.C66579a m54103f(IAppContext iAppContext) {
            return m54098b(20, iAppContext);
        }

        /* renamed from: g */
        public static List<C66578b.C66579a> m54104g(IAppContext iAppContext) {
            Map<AppType, List<C66578b.C66579a>> map = f35181b;
            if (map.containsKey(iAppContext.getAppType())) {
                return map.get(iAppContext.getAppType());
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m54099b(iAppContext));
            arrayList.add(m54102e(iAppContext));
            arrayList.add(m54101d(iAppContext));
            arrayList.add(f35180a);
            if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("gadget.open_app.badge")) {
                arrayList.add(m54103f(iAppContext));
            }
            if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.setting.scope_run_data")) {
                arrayList.add(m54100c(iAppContext));
            }
            if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.scope.add_user_info")) {
                arrayList.add(m54097a(iAppContext));
            }
            map.put(iAppContext.getAppType(), arrayList);
            return arrayList;
        }

        /* renamed from: b */
        private static C66578b.C66579a m54098b(int i, IAppContext iAppContext) {
            Map<AppType, Map<Integer, C66578b.C66579a>> map = f35182c;
            if (map.containsKey(iAppContext.getAppType())) {
                Map<Integer, C66578b.C66579a> map2 = map.get(iAppContext.getAppType());
                if (map2 != null && map2.containsKey(Integer.valueOf(i))) {
                    return map2.get(Integer.valueOf(i));
                }
                C66578b.C66579a a = m54096a(i, iAppContext);
                if (map2 == null) {
                    map2 = new HashMap<>();
                    map.put(iAppContext.getAppType(), map2);
                }
                map2.put(Integer.valueOf(i), a);
                return a;
            }
            HashMap hashMap = new HashMap();
            C66578b.C66579a a2 = m54096a(i, iAppContext);
            hashMap.put(Integer.valueOf(i), a2);
            map.put(iAppContext.getAppType(), hashMap);
            return a2;
        }

        /* renamed from: a */
        private static C66578b.C66579a m54096a(int i, IAppContext iAppContext) {
            switch (i) {
                case 11:
                    return new C66578b.C66579a(0, 11, R.string.microapp_m_user_info, C67590h.m263073a((int) R.string.LittleApp_UserInfoPermission_PermissionDesc), null, iAppContext);
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return new C66578b.C66579a(0, 12, R.string.microapp_m_geo_location, C67590h.m263073a((int) R.string.lark_brand_permission_msg_location), new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, iAppContext);
                case 13:
                    return new C66578b.C66579a(0, 13, R.string.microapp_m_REQUEST_PERMISSION_DESCRIPT_RECORD_AUDIO, C67590h.m263073a((int) R.string.lark_brand_permission_msg_record), new String[]{"android.permission.RECORD_AUDIO"}, iAppContext);
                default:
                    switch (i) {
                        case 19:
                            return new C66578b.C66579a(0, 19, R.string.LittleApp_GadgetAndriod_PermissionName_Clipboard, C67590h.m263073a((int) R.string.LittleApp_GadgetAndriod_PermissionMsg_Clipboard), null, iAppContext);
                        case 20:
                            return new C66578b.C66579a(0, 20, R.string.OpenPlatform_AppCenter_BadgeTab, C67590h.m263073a((int) R.string.OpenPlatform_AppCenter_BadgeTtl), null, iAppContext);
                        case 21:
                            return new C66578b.C66579a(0, 21, R.string.LittleApp_StepsApi_ScopeName, C67590h.m263073a((int) R.string.LittleApp_StepsApi_ScopeNameSubTtl), new String[]{"android.permission.ACTIVITY_RECOGNITION"}, iAppContext);
                        default:
                            return null;
                    }
            }
        }
    }

    /* renamed from: a */
    public static List<C66578b.C66579a> m54093a(IAppContext iAppContext) {
        return m54094a((String) null, iAppContext);
    }

    /* renamed from: a */
    public static List<C66578b.C66579a> m54094a(String str, IAppContext iAppContext) {
        return C13283a.m54104g(iAppContext);
    }

    /* renamed from: a */
    public static C66578b.C66579a m54092a(int i, IAppContext iAppContext) {
        switch (i) {
            case 11:
                return C66578b.C66579a.m260109a(iAppContext);
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return C66578b.C66579a.m260113b(iAppContext);
            case 13:
                return C66578b.C66579a.m260118d(iAppContext);
            case 14:
            case 15:
            case 17:
            case 18:
            default:
                return null;
            case 16:
                return C13283a.f35180a;
            case 19:
                return C66578b.C66579a.m260125j(iAppContext);
            case 20:
                return C66578b.C66579a.m260126k(iAppContext);
            case 21:
                return C66578b.C66579a.m260116c(iAppContext);
        }
    }

    /* renamed from: a */
    public static void m54095a(JSONObject jSONObject, IAppContext iAppContext) throws JSONException {
        if (!LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.scope.add_user_info")) {
            jSONObject.put("scope.userInfo", true);
        }
        AbstractC67733a aVar = (AbstractC67733a) iAppContext.findServiceByInterface(AbstractC67733a.class);
        for (C66578b.C66579a aVar2 : m54093a(iAppContext)) {
            if (aVar.mo50184b(aVar2.mo232177a())) {
                switch (aVar2.mo232177a()) {
                    case 11:
                        if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.scope.add_user_info")) {
                            jSONObject.put("scope.userInfo", aVar.mo50179a(aVar2.mo232177a(), false));
                            break;
                        } else {
                            continue;
                        }
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        jSONObject.put("scope.userLocation", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                    case 13:
                        jSONObject.put("scope.record", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                    case 16:
                        jSONObject.put("scope.writePhotosAlbum", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                    case 19:
                        jSONObject.put("scope.clipboard", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                    case 20:
                        jSONObject.put("scope.appBadge", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                    case 21:
                        jSONObject.put("scope.runData", aVar.mo50179a(aVar2.mo232177a(), false));
                        continue;
                }
            }
        }
    }

    /* renamed from: a */
    public static IAppContext m54091a(Context context, String str, AppType appType) {
        AbstractC12887b a = C67440a.m262344a(appType, str);
        if (appType == AppType.GadgetAPP) {
            AbstractC67433a b = C67448a.m262353a().mo234181b(a);
            if (b == null) {
                b = C67448a.m262353a().mo234192k();
            }
            if (b == null) {
                return C67448a.m262353a().mo234190i();
            }
            return b;
        } else if (appType != AppType.WebAPP) {
            return null;
        } else {
            C67462h hVar = new C67462h(context);
            hVar.setAppId(str);
            return hVar;
        }
    }
}
