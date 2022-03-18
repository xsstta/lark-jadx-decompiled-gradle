package com.bytedance.ee.bear.document.offline.sync;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.eenet.util.ComplexConnect;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.g */
public class C5989g extends AbstractC5982a {
    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public JSONObject mo24216a(String str) {
        return null;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public void mo24218a(String str, String str2) {
    }

    public C5989g() {
        this.f16764a = "DocxPreloadStrategy";
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public boolean mo24225a(org.json.JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.optInt("code", 0) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: c */
    public C5968f mo24219c(String str) {
        if (TextUtils.isEmpty(this.f16770g)) {
            return new C5968f();
        }
        return C5955d.m24025b().mo24098d(this.f16770g, str);
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public Response mo24220a(OfflineDoc offlineDoc) {
        Request.Builder builder = new Request.Builder();
        return this.f16766c.mo20120a(builder.url(this.f16771h + offlineDoc.getObj_token() + "&open_type=1").addHeader("EENet-Request-Enable-Complex-Connect", ComplexConnect.TRUE.toString()).get().build());
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24217a(AccountService.Account account) {
        super.mo24217a(account);
        if (this.f16765b != null) {
            this.f16771h = "https://" + C6313i.f17510b + "/space/api/docx/pages/client_vars?id=";
            this.f16770g = account.f14592i + "_" + account.f14584a + "_CLIENT_VARS";
        }
    }
}
