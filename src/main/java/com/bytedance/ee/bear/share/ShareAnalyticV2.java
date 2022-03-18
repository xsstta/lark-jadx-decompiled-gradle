package com.bytedance.ee.bear.share;

import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jv\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0002J\u0018\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J(\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J(\u0010)\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J(\u0010*\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J(\u0010+\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J0\u0010,\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u0004H\u0002J(\u0010.\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J(\u0010/\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J(\u00100\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J8\u00101\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004H\u0002J(\u00103\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J(\u00104\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J(\u00105\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J(\u00106\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J(\u00107\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J(\u00108\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J0\u00109\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u000fH\u0007J(\u0010;\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J(\u0010<\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0007J0\u0010=\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH\u0002J6\u0010>\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/bytedance/ee/bear/share/ShareAnalyticV2;", "", "()V", "EVENT_COPY_LINK_CLICK", "", "EVENT_COPY_LINK_VIEW", "EVENT_SHARE_CLICK", "EVENT_SHARE_VIEW", "EVENT_SHARE_WECHAT_CLICK", "EVENT_SHARE_WECHAT_VIEW", "FORM_VC", "PARAM_NULL", "TAG", "TARGET_NONE", "isFromVc", "", "module", "publicPerm", "subModule", "userPerm", "appendCommonParams", "", "params", "Lorg/json/JSONObject;", "file_id", "file_type", "", "app_form", "sub_file_type", "sub_module", "user_permission", "file_permission", "container_id", "container_type", "isWiki", "doReport", "eventName", "reportCopyLinkAndPasswordClick", "token", ShareHitPoint.f121869d, "subType", "reportCopyLinkCancelClick", "reportCopyLinkClick", "reportCopyLinkView", "reportCopyLinkWithPasswordClick", "click", "reportImageShareClick", "reportOnlyCopyLinkClick", "reportShareByteMomentsClick", "reportShareClick", "target", "reportShareLarkClick", "reportShareMoreClick", "reportShareQQClick", "reportShareView", "reportShareWeChatClick", "reportShareWeChatMomentsClick", "reportShareWeChatTipPanelClick", "confirm", "reportShareWeChatView", "reportShareWeiBoClick", "reportViewEvent", "setCommonParams", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.share.d */
public final class ShareAnalyticV2 {

    /* renamed from: a */
    public static final ShareAnalyticV2 f29618a = new ShareAnalyticV2();

    /* renamed from: b */
    private static String f29619b = "";

    /* renamed from: c */
    private static String f29620c = "";

    /* renamed from: d */
    private static boolean f29621d;

    /* renamed from: e */
    private static String f29622e = "none";

    /* renamed from: f */
    private static String f29623f = "none";

    private ShareAnalyticV2() {
    }

    /* renamed from: a */
    private final void m45780a(String str, JSONObject jSONObject) {
        try {
            C5234y.m21391b().mo21081a(str, jSONObject, "");
            C13479a.m54772d("ShareAnalyticV2", "eventName:" + str + ", params : " + jSONObject);
        } catch (Throwable th) {
            C13479a.m54759a("ShareAnalyticV2", "doReport()...failed", th);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m45774a(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45778a("ccm_permission_share_view", str, i, str2, z);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m45782b(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45778a("ccm_permission_share_wechat_view", str, i, str2, z);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m45783c(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45778a("ccm_permission_copy_link_view", str, i, str2, z);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m45784d(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45776a(str, i, str2, z, "share_lark", "none");
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m45785e(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45776a(str, i, str2, z, "copy_link", "ccm_permission_copy_link_view");
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m45786f(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45776a(str, i, str2, z, "image_share", "none");
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m45787g(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45776a(str, i, str2, z, "share_wechat", "ccm_permission_share_wechat_view");
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m45788h(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45776a(str, i, str2, z, "share_wechat_moments", "none");
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m45789i(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45776a(str, i, str2, z, "share_qq", "none");
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m45790j(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45776a(str, i, str2, z, "share_weibo", "none");
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m45791k(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45776a(str, i, str2, z, "share_bytedance_moments", "none");
    }

    @JvmStatic
    /* renamed from: l */
    public static final void m45792l(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45776a(str, i, str2, z, "share_more", "none");
    }

    @JvmStatic
    /* renamed from: m */
    public static final void m45793m(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45775a(str, i, str2, z, "copy_link_and_password");
    }

    @JvmStatic
    /* renamed from: n */
    public static final void m45794n(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45775a(str, i, str2, z, "copy_link");
    }

    @JvmStatic
    /* renamed from: o */
    public static final void m45795o(String str, int i, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        f29618a.m45775a(str, i, str2, z, "cancel");
    }

    /* renamed from: a */
    private final void m45775a(String str, int i, String str2, boolean z, String str3) {
        String str4;
        JSONObject jSONObject = new JSONObject();
        if (f29621d) {
            str4 = "vc";
        } else {
            str4 = "none";
        }
        m45781a(jSONObject, str, i, str4, str2, f29622e, f29623f, f29619b, f29620c, "none", "none", z);
        jSONObject.put("click", str3);
        jSONObject.put("target", "none");
        m45780a("ccm_permission_copy_link_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m45777a(String str, int i, String str2, boolean z, boolean z2) {
        String str3;
        String str4;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "subType");
        JSONObject jSONObject = new JSONObject();
        ShareAnalyticV2 dVar = f29618a;
        if (f29621d) {
            str3 = "vc";
        } else {
            str3 = "none";
        }
        dVar.m45781a(jSONObject, str, i, str3, str2, f29622e, f29623f, f29619b, f29620c, "none", "none", z);
        if (z2) {
            str4 = "share";
        } else {
            str4 = "cancel";
        }
        jSONObject.put("click", str4);
        jSONObject.put("target", "none");
        dVar.m45780a("ccm_permission_share_wechat_click", jSONObject);
    }

    /* renamed from: a */
    private final void m45778a(String str, String str2, int i, String str3, boolean z) {
        String str4;
        JSONObject jSONObject = new JSONObject();
        if (f29621d) {
            str4 = "vc";
        } else {
            str4 = "none";
        }
        m45781a(jSONObject, str2, i, str4, str3, f29622e, f29623f, f29619b, f29620c, "none", "none", z);
        m45780a(str, jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m45779a(String str, String str2, boolean z, String str3, String str4) {
        String str5;
        Intrinsics.checkParameterIsNotNull(str, "userPerm");
        f29619b = str;
        String str6 = "";
        if (str2 == null) {
            str2 = str6;
        }
        f29620c = str2;
        f29621d = z;
        if (str3 != null) {
            str5 = str3;
        } else {
            str5 = str6;
        }
        f29622e = str5;
        if (str4 != null) {
            str6 = str4;
        }
        f29623f = str6;
        C13479a.m54764b("ShareAnalyticV2", "setCommonParams()...userPerm:" + str + ", " + "isFromVc:" + z + ", " + "module:" + str3 + ", " + "subModule: " + str4);
    }

    /* renamed from: a */
    private final void m45776a(String str, int i, String str2, boolean z, String str3, String str4) {
        String str5;
        JSONObject jSONObject = new JSONObject();
        if (f29621d) {
            str5 = "vc";
        } else {
            str5 = "none";
        }
        m45781a(jSONObject, str, i, str5, str2, f29622e, f29623f, f29619b, f29620c, "none", "none", z);
        jSONObject.put("click", str3);
        jSONObject.put("target", str4);
        m45780a("ccm_permission_share_click", jSONObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r5 == true) goto L_0x005f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m45781a(org.json.JSONObject r4, java.lang.String r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.share.ShareAnalyticV2.m45781a(org.json.JSONObject, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
