package com.ss.android.lark.search.impl.func.global.p2619a;

import com.ss.android.lark.search.impl.hitpoint.SearchHitPoint;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.rxjava.C57865c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.search.impl.func.global.a.a */
public class C53626a {
    /* renamed from: a */
    public static void m207597a(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, String str7, int i3) {
        C57865c.m224576a(new Runnable(str2, str3, str4, str, i, str5, str6, i2, str7, i3) {
            /* class com.ss.android.lark.search.impl.func.global.p2619a.$$Lambda$a$8Nm3Q_CgOjUOtOLvNE74Zwf4H04 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ int f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ String f$6;
            public final /* synthetic */ int f$7;
            public final /* synthetic */ String f$8;
            public final /* synthetic */ int f$9;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
                this.f$9 = r10;
            }

            public final void run() {
                C53626a.lambda$8Nm3Q_CgOjUOtOLvNE74Zwf4H04(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m207598a(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, String str7, int i3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("file_id", C57859q.m224565a(str));
            jSONObject.put("file_type", str2);
            jSONObject.put("search_id", str3);
        } catch (JSONException unused) {
        }
        SearchHitPoint.m206543a(str4, "mobile_all", i + 1, jSONObject, str5, str6, Integer.valueOf(i2), str7, i3 + 1);
    }
}
