package com.bytedance.ee.larkbrand.permission;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.permission.p662a.C13282a;
import com.tt.miniapp.permission.C66578b;

/* renamed from: com.bytedance.ee.larkbrand.permission.g */
public class C13296g {
    /* renamed from: a */
    public static String m54138a(int i) {
        if (i == 12) {
            return "userLocation";
        }
        if (i == 13) {
            return "record";
        }
        if (i == 16) {
            return "writePhotosAlbum";
        }
        if (i == 19) {
            return "clipboard";
        }
        if (i == 20) {
            return "appBadge";
        }
        if (i == 21) {
            return "client:run_data:readonly";
        }
        if (i == 11) {
            return "client:user_info:readonly";
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m54139a(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -266803431:
                if (str.equals("userInfo")) {
                    c = 0;
                    break;
                }
                break;
            case 40561902:
                if (str.equals("contactInfo")) {
                    c = 1;
                    break;
                }
                break;
            case 1109191153:
                if (str.equals("deviceID")) {
                    c = 2;
                    break;
                }
                break;
            case 1437073446:
                if (str.equals("chatInfo")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 1:
            case 2:
            case 3:
                return true;
            case 0:
                if (LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.scope.add_user_info")) {
                    return false;
                }
                return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C66578b.C66579a m54137a(String str, IAppContext iAppContext) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1819938263:
                if (str.equals("client:user_info:readonly")) {
                    c = 0;
                    break;
                }
                break;
            case -1600397930:
                if (str.equals("clipboard")) {
                    c = 1;
                    break;
                }
                break;
            case -934908847:
                if (str.equals("record")) {
                    c = 2;
                    break;
                }
                break;
            case 439657327:
                if (str.equals("client:run_data:readonly")) {
                    c = 3;
                    break;
                }
                break;
            case 1133114528:
                if (str.equals("userLocation")) {
                    c = 4;
                    break;
                }
                break;
            case 1140481538:
                if (str.equals("appBadge")) {
                    c = 5;
                    break;
                }
                break;
            case 2009738511:
                if (str.equals("writePhotosAlbum")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C66578b.C66579a.m260109a(iAppContext);
            case 1:
                return C66578b.C66579a.m260125j(iAppContext);
            case 2:
                return C66578b.C66579a.m260118d(iAppContext);
            case 3:
                return C66578b.C66579a.m260116c(iAppContext);
            case 4:
                return C66578b.C66579a.m260113b(iAppContext);
            case 5:
                return C66578b.C66579a.m260126k(iAppContext);
            case 6:
                return C13282a.C13283a.f35180a;
            default:
                return null;
        }
    }
}
