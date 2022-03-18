package com.bytedance.ee.bear.more;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.more.b */
public class C10196b {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m42468a(java.lang.String r12, android.os.Bundle r13, java.lang.String r14, int r15, java.lang.String r16, boolean r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.more.C10196b.m42468a(java.lang.String, android.os.Bundle, java.lang.String, int, java.lang.String, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m42469a(java.lang.String r12, android.os.Bundle r13, java.lang.String r14, int r15, java.lang.String r16, boolean r17, boolean r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.more.C10196b.m42469a(java.lang.String, android.os.Bundle, java.lang.String, int, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058 A[Catch:{ all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a A[Catch:{ all -> 0x0090 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m42464a(com.bytedance.ee.bear.more.export.IMoreInfo r4) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.more.C10196b.m42464a(com.bytedance.ee.bear.more.export.d):void");
    }

    /* renamed from: a */
    private static String m42461a(int i, boolean z) {
        if (z) {
            return "wiki";
        }
        if (i == C8275a.f22375h.mo32555b()) {
            return "drive";
        }
        return C8275a.m34050a(i);
    }

    /* renamed from: a */
    public static void m42462a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("file_type", C8275a.m34050a(i));
        hashMap.put("file_id", C13598b.m55197d(str));
        C5234y.m21391b().mo21079a("click_copy_doc", hashMap);
    }

    /* renamed from: a */
    public static void m42465a(IMoreInfo dVar, String str) {
        String str2;
        if (dVar != null) {
            AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
            if (f == null || TextUtils.isEmpty(f.f14584a)) {
                str2 = "";
            } else {
                str2 = f.f14584a;
            }
            boolean z = !TextUtils.equals(str2, dVar.mo39046m());
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121868c, "innerpage_more");
            hashMap.put("file_id", C13598b.m55197d(dVar.mo39041h()));
            hashMap.put("file_type", C8275a.m34050a(dVar.mo39036e()));
            hashMap.put("action", str);
            if (!TextUtils.isEmpty(dVar.mo39056w())) {
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, dVar.mo39056w());
            }
            if (TextUtils.equals(str, "rename")) {
                hashMap.put("file_is_cross_tenant", String.valueOf(z));
                hashMap.put("file_tenant_id", C13598b.m55197d(dVar.mo39046m()));
            }
            if (TextUtils.equals(str, "contact")) {
                String m = dVar.mo39046m();
                String d = C13598b.m55197d(dVar.mo39045l());
                String d2 = C13598b.m55197d(dVar.mo39043j());
                hashMap.put("file_is_cross_tenant", String.valueOf(z));
                hashMap.put("file_tenant_id", C13598b.m55197d(m));
                hashMap.put("create_uid", d);
                hashMap.put("owner_id", d2);
                hashMap.put("is_owner", String.valueOf(dVar.mo39048o()));
            }
            C13479a.m54772d("MoreAnalytic", "more: reportMoreEvent, params = " + hashMap);
            C5234y.m21391b().mo21079a("client_content_management", hashMap);
        }
    }

    /* renamed from: a */
    public static void m42466a(IMoreInfo dVar, String str, String str2) {
        if (dVar != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(ShareHitPoint.f121868c, str);
                hashMap.put("file_id", C13598b.m55197d(dVar.mo39041h()));
                hashMap.put("file_type", C8275a.m34050a(dVar.mo39036e()));
                hashMap.put("action", "copy_link");
                hashMap.put("module", str2);
                if (dVar.mo39036e() == C8275a.f22375h.mo32555b() && !TextUtils.isEmpty(dVar.mo39038f())) {
                    hashMap.put("sub_file_type", dVar.mo39038f());
                }
                if (!TextUtils.isEmpty(dVar.mo39056w())) {
                    hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, dVar.mo39056w());
                }
                C13479a.m54772d("MoreAnalytic", "more: reportMoreEvent, params = " + hashMap);
                C5234y.m21391b().mo21079a("client_content_management", hashMap);
            } catch (Throwable th) {
                C13479a.m54759a("MoreAnalytic", "reportCopyLinkEvent()...error", th);
            }
        }
    }

    /* renamed from: a */
    public static void m42467a(String str, int i, String str2, boolean z, boolean z2, boolean z3) {
        String str3;
        String str4;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("module", m42461a(i, z2));
            jSONObject.put("sub_module", "null");
            if (z3) {
                str3 = "vc";
            } else {
                str3 = "null";
            }
            jSONObject.put("app_form", str3);
            jSONObject.put("container_id", "null");
            jSONObject.put("container_type", "null");
            if (TextUtils.isEmpty(str)) {
                str4 = "null";
            } else {
                str4 = C13598b.m55197d(str);
            }
            jSONObject.put("file_id", str4);
            jSONObject.put("file_type", C8275a.m34050a(i));
            if (TextUtils.isEmpty(str2)) {
                str2 = "null";
            }
            jSONObject.put("sub_file_type", str2);
            jSONObject.put("is_follow_update", String.valueOf(z));
            new C10917c(new C10929e());
            C5234y.m21391b().mo21081a("ccm_space_docs_more_menu_view", jSONObject, "");
        } catch (JSONException e) {
            C13479a.m54758a("MoreAnalytic", "reportSpaceMoreItemClick()...error = " + e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m42463a(android.os.Bundle r16, java.lang.String r17, int r18, boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, boolean r27) {
        /*
        // Method dump skipped, instructions count: 270
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.more.C10196b.m42463a(android.os.Bundle, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
