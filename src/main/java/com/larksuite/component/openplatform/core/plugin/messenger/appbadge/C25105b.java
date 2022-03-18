package com.larksuite.component.openplatform.core.plugin.messenger.appbadge;

import com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode;
import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
import com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppBadgeNodeResponse;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.refer.common.base.AppType;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.appbadge.b */
public class C25105b {

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.appbadge.b$1 */
    public static /* synthetic */ class C251061 {

        /* renamed from: a */
        static final /* synthetic */ int[] f61351a;

        /* renamed from: b */
        static final /* synthetic */ int[] f61352b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        static {
            /*
                com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode[] r0 = com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25105b.C251061.f61352b = r0
                r1 = 1
                com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode r2 = com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode.UNKNOWN_BADGE_CODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25105b.C251061.f61352b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode r3 = com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode.CODE_SUCCESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25105b.C251061.f61352b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode r4 = com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode.CODE_INVALID_PARAMS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25105b.C251061.f61352b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode r4 = com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode.CODE_NONEXISTENT_NODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.tt.refer.common.base.AppType[] r3 = com.tt.refer.common.base.AppType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25105b.C251061.f61351a = r3
                com.tt.refer.common.base.AppType r4 = com.tt.refer.common.base.AppType.GadgetAPP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25105b.C251061.f61351a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.tt.refer.common.base.AppType r3 = com.tt.refer.common.base.AppType.WebGadgetAPP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25105b.C251061.f61351a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.WebAPP     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25105b.C251061.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static ApiCode m90438a(UpdateOpenAppBadgeNodeResponse updateOpenAppBadgeNodeResponse) {
        return m90437a(updateOpenAppBadgeNodeResponse.code);
    }

    /* renamed from: a */
    public static ApiCode m90436a(int i) {
        return m90437a(BadgeNodeActionCode.fromValue(i));
    }

    /* renamed from: a */
    public static CommonEnum.OpenAppFeatureType m90435a(AppType appType) {
        int i = C251061.f61351a[appType.ordinal()];
        if (i == 1 || i == 2) {
            return CommonEnum.OpenAppFeatureType.MiniApp;
        }
        if (i != 3) {
            return null;
        }
        return CommonEnum.OpenAppFeatureType.H5;
    }

    /* renamed from: a */
    public static ApiCode m90437a(BadgeNodeActionCode badgeNodeActionCode) {
        if (badgeNodeActionCode == null) {
            return ApiCode.GENERAL_UNKONW_ERROR;
        }
        ApiCode apiCode = ApiCode.GENERAL_UNKONW_ERROR;
        int i = C251061.f61352b[badgeNodeActionCode.ordinal()];
        if (i == 1) {
            return ApiCode.AUTHORIZE_INVALID_SCOPE;
        }
        if (i == 2) {
            return ApiCode.GENERAL_OK;
        }
        if (i == 3) {
            return ApiCode.GENERAL_PARAM;
        }
        if (i != 4) {
            return apiCode;
        }
        return ApiCode.UPDATEBADGE_NONEXISTENT_BADGE;
    }

    /* renamed from: a */
    public static String m90439a(String str, Boolean bool, Integer num, CommonEnum.OpenAppFeatureType openAppFeatureType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", str);
            jSONObject.put(ShareHitPoint.f121869d, openAppFeatureType);
            if (num != null) {
                jSONObject.put("num", num);
            }
            if (bool != null) {
                jSONObject.put("show", bool);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
