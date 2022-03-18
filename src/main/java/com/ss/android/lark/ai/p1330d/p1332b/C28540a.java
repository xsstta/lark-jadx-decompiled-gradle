package com.ss.android.lark.ai.p1330d.p1332b;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.ai.d.b.a */
public class C28540a extends BaseHitPoint {
    /* renamed from: a */
    public void mo101585a() {
        Statistics.sendEvent("learn_more_from_lookup_results");
    }

    /* renamed from: b */
    public void mo101589b() {
        Statistics.sendEvent("click_on_like_mobile");
    }

    /* renamed from: c */
    public void mo101591c() {
        Statistics.sendEvent("click_on_dislike_mobile");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.ai.d.b.a$1 */
    public static /* synthetic */ class C285411 {

        /* renamed from: a */
        static final /* synthetic */ int[] f71689a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest$Scene[] r0 = com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest.Scene.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.ai.p1330d.p1332b.C28540a.C285411.f71689a = r0
                com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest$Scene r1 = com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest.Scene.MESSENGER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.ai.p1330d.p1332b.C28540a.C285411.f71689a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest$Scene r1 = com.ss.android.lark.pb.ai.GetEnterpriseTopicRequest.Scene.DOCS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.ai.p1330d.p1332b.C28540a.C285411.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m104606a(GetEnterpriseTopicRequest.Scene scene) {
        if (scene == null) {
            return "unknown";
        }
        int i = C285411.f71689a[scene.ordinal()];
        if (i == 1) {
            return "im_card";
        }
        if (i != 2) {
            return "unknown";
        }
        return "doc_feed";
    }

    /* renamed from: b */
    public void mo101590b(String str) {
        try {
            Statistics.sendEvent("click_on_moreinformation", new JSONObject().put("entity_id", str));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: c */
    public void mo101592c(String str) {
        try {
            Statistics.sendEvent("click_on_moreresults", new JSONObject().put("entity_id", str));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public void mo101587a(String str) {
        try {
            Statistics.sendEvent("click_on_highlight_entity_mobile", new JSONObject().put("chat_id", str));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public void mo101586a(GetEnterpriseTopicRequest.Scene scene, long j) {
        try {
            Statistics.sendEvent("asl_abbr_client_time_cost", new JSONObject().put("card_source", m104606a(scene)).put("card_scene", scene.getValue()).put(ShareHitPoint.f121869d, 2).put(HiAnalyticsConstant.BI_KEY_COST_TIME, j));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public void mo101588a(String str, GetEnterpriseTopicRequest.Scene scene, String str2, String str3) {
        try {
            Statistics.sendEvent("asl_abbr_card_view", new JSONObject().put("abbr_id", str).put("card_source", m104606a(scene)).put("card_scene", scene.getValue()).put("result_type", str2).put("chat_id", str3));
        } catch (JSONException unused) {
        }
    }
}
