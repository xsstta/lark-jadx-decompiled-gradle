package com.bytedance.ee.bear.document.offline.sync;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.SubBlockModel;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.SubBlockType;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.json.JSONArray;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.e */
public class C5987e extends AbstractC5983c {
    public C5987e() {
        this.f16764a = "DocPreloadStrategy";
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5983c, com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24217a(AccountService.Account account) {
        super.mo24217a(account);
        this.f16770g = account.f14592i + "_" + account.f14584a + "_CLIENT_VARS";
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public JSONObject mo24216a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, (Object) "DOC");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("member_id", (Object) this.f16772i);
            jSONObject2.put("base_rev", (Object) 0);
            jSONObject2.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, (Object) 0);
            jSONObject2.put(ShareHitPoint.f121869d, (Object) "CLIENT_VARS");
            jSONObject2.put("token", (Object) str);
            jSONObject2.put("open_type", (Object) 1);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) jSONObject2);
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, (Object) 2);
            return jSONObject;
        } catch (Exception e) {
            String str2 = this.f16764a;
            C13479a.m54758a(str2, "consumeDoc()... e = " + e);
            return null;
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: c */
    public C5968f mo24219c(String str) {
        if (TextUtils.isEmpty(this.f16770g)) {
            return new C5968f();
        }
        C5968f d = C5955d.m24025b().mo24098d(this.f16770g, str);
        if (d == null || d.mo24137d() == null) {
            return d;
        }
        if (d.mo24152l().mo24332a() || !mo24224a(d)) {
            String str2 = this.f16764a;
            C13479a.m54764b(str2, "no need for preloading ObjToken = " + C13598b.m55197d(str));
            return d;
        }
        String str3 = this.f16764a;
        C13479a.m54764b(str3, "need preload subblocks : " + C13598b.m55197d(str) + " current statucode=" + d.mo24151k());
        org.json.JSONObject b = C5890a.m23708b(d.mo24137d());
        if (b == null) {
            return null;
        }
        m24237a(b, str, d);
        return d;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public void mo24218a(String str, String str2) {
        org.json.JSONObject b = C5890a.m23708b(str);
        C5968f c = C5955d.m24025b().mo24091c(this.f16770g, str2);
        if (b != null) {
            m24237a(b, str2, c);
        }
    }

    /* renamed from: a */
    private void m24237a(org.json.JSONObject jSONObject, String str, C5968f fVar) {
        try {
            if (jSONObject.optJSONArray("sheets") == null) {
                fVar.mo24152l().mo24331a(64);
            } else if (!fVar.mo24152l().mo24335b(SubBlockType.INNER_SHEET)) {
                C6005m.m24312a().mo24271a(C8275a.f22372e.mo32555b()).mo24223a(((org.json.JSONObject) jSONObject.optJSONArray("sheets").get(0)).optString("token"), str, this.f16770g);
            }
            if (jSONObject.optJSONArray("comments") == null) {
                fVar.mo24152l().mo24331a(16);
            } else if (!fVar.mo24152l().mo24335b(SubBlockType.COMMENTS_DATA)) {
                SubBlockModel subBlockModel = new SubBlockModel(str, C8275a.f22371d.mo32555b(), SubBlockType.COMMENTS_DATA);
                subBlockModel.setOwnerResKey(this.f16770g);
                C6002l.m24300a().mo24266a(subBlockModel);
            }
            if (jSONObject.optJSONArray("polls") == null) {
                fVar.mo24152l().mo24331a(4);
            } else if (!fVar.mo24152l().mo24335b(SubBlockType.POLL_DATA)) {
                JSONArray optJSONArray = jSONObject.optJSONArray("polls");
                String str2 = this.f16764a;
                C13479a.m54764b(str2, "preload polls data, objToken = " + C13598b.m55197d(str) + ", polls size = " + optJSONArray.length());
                ArrayList arrayList = new ArrayList();
                int min = Math.min(optJSONArray.length(), 5);
                for (int i = 0; i < min; i++) {
                    arrayList.add(((org.json.JSONObject) optJSONArray.get(i)).optString("token"));
                }
                SubBlockModel subBlockModel2 = new SubBlockModel(str, C8275a.f22371d.mo32555b(), SubBlockType.POLL_DATA, arrayList);
                subBlockModel2.setOwnerResKey(this.f16770g);
                C6002l.m24300a().mo24266a(subBlockModel2);
            }
            if (jSONObject.optJSONArray("images") == null) {
                fVar.mo24152l().mo24331a(1);
            } else if (!fVar.mo24152l().mo24335b(SubBlockType.IMAGE_DATA)) {
                JSONArray optJSONArray2 = jSONObject.optJSONArray("images");
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    arrayList2.add(new SubBlockModel(str, C8275a.f22371d.mo32555b(), SubBlockType.IMAGE_DATA, URLDecoder.decode(((org.json.JSONObject) optJSONArray2.get(i2)).optString("src"), "UTF-8")));
                }
                C6002l.m24300a().mo24264a(this.f16770g, str, C8275a.f22371d.mo32555b(), arrayList2);
            }
            if (this.f16773j != null) {
                this.f16773j.mo24233a(str, System.currentTimeMillis());
            }
            C5955d.m24025b().mo24083b(fVar);
        } catch (Exception e) {
            String str3 = this.f16764a;
            C13479a.m54758a(str3, "preloadSubBlock()... e = " + e);
        }
    }
}
