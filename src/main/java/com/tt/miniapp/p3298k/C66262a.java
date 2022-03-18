package com.tt.miniapp.p3298k;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.larksuite.suite.R;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.p3382c.C67602b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.k.a */
public class C66262a {

    /* renamed from: a */
    public String f167244a;

    /* renamed from: b */
    public boolean f167245b;

    /* renamed from: c */
    public final List<String> f167246c = new ArrayList();

    /* renamed from: d */
    public long f167247d;

    /* renamed from: e */
    public long f167248e;

    /* renamed from: a */
    public static C66262a m259263a() {
        return new C66262a();
    }

    /* renamed from: b */
    public static boolean m259264b() {
        C67602b hostCustomFavoriteEntity = HostDependManager.getInst().getHostCustomFavoriteEntity(AppbrandContext.getInst().getApplicationContext());
        if (AppbrandContext.getInst().isGame()) {
            return hostCustomFavoriteEntity.mo234867p();
        }
        return hostCustomFavoriteEntity.mo234866o();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m259265c() {
        /*
            java.lang.String r0 = com.tt.miniapphost.process.C67556a.m262950g()
            java.lang.String r1 = "FavoriteConfig"
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0028
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x001e }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x001e }
            java.lang.String r0 = "tma"
            int r0 = r4.optInt(r0, r3)     // Catch:{ JSONException -> 0x001e }
            java.lang.String r5 = "tmg"
            int r4 = r4.optInt(r5, r3)     // Catch:{ JSONException -> 0x001c }
            goto L_0x002a
        L_0x001c:
            r4 = move-exception
            goto L_0x0020
        L_0x001e:
            r4 = move-exception
            r0 = 0
        L_0x0020:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r4
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r1, r5)
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r4 = 0
        L_0x002a:
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = "isDisplayFavoriteEnter"
            r6[r3] = r7
            java.lang.String r8 = "tmaFavoritesSwitch == "
            r6[r2] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r9 = 2
            r6[r9] = r8
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52828d(r1, r6)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r7
            java.lang.String r6 = "tmgFavoritesSwitch == "
            r5[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5[r9] = r6
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52828d(r1, r5)
            com.tt.miniapphost.AppbrandContext r1 = com.tt.miniapphost.AppbrandContext.getInst()
            boolean r1 = r1.isGame()
            if (r1 == 0) goto L_0x005d
            if (r2 != r4) goto L_0x0060
            goto L_0x0061
        L_0x005d:
            if (r2 != r0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.p3298k.C66262a.m259265c():boolean");
    }

    private C66262a() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        boolean z = true;
        JSONObject b = C12738a.m52729b(applicationContext, Settings.BDP_FAVORITES);
        if (b != null) {
            this.f167244a = b.optString("tip_str");
            this.f167245b = b.optInt("enable_cp_tip_str", 0) == 0 ? false : z;
            JSONArray optJSONArray = b.optJSONArray("feed_scene_list");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.f167246c.add(optJSONArray.optString(i));
                }
            }
            JSONObject optJSONObject = b.optJSONObject("interval");
            if (optJSONObject != null) {
                this.f167247d = (long) (optJSONObject.optDouble("bubble") * 1000.0d);
                this.f167248e = (long) (optJSONObject.optDouble("floating") * 1000.0d);
            }
        }
        if (TextUtils.isEmpty(this.f167244a)) {
            this.f167244a = applicationContext.getResources().getString(R.string.microapp_m_favorite_guide_tip);
        }
        if (this.f167247d <= 0) {
            this.f167247d = 259200000;
        }
        if (this.f167248e <= 0) {
            this.f167248e = 604800000;
        }
    }
}
