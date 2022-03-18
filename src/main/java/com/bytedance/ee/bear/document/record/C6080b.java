package com.bytedance.ee.bear.document.record;

import android.text.TextUtils;
import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4918a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.record.b */
public class C6080b extends C4918a {

    /* renamed from: com.bytedance.ee.bear.document.record.b$a */
    class C6081a implements AbstractC7945d<RecordModel> {
        C6081a() {
        }

        /* renamed from: a */
        public void handle(RecordModel recordModel, AbstractC7947h hVar) {
            boolean z;
            StringBuilder sb = new StringBuilder();
            sb.append("data is null? = ");
            if (recordModel == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54772d("RecordWebService", sb.toString());
            if (recordModel == null || TextUtils.isEmpty(recordModel.getToken())) {
                hVar.mo17189a(new RecordResultModel(false, new RecordModel()));
                return;
            }
            RecordModel a = C6078a.m24584a().mo24573a(recordModel.getToken());
            if (a == null) {
                hVar.mo17189a(new RecordResultModel(false, new RecordModel()));
            } else {
                hVar.mo17189a(new RecordResultModel(true, a));
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.record.b$b */
    class C6082b implements AbstractC7945d<RecordModel> {
        C6082b() {
        }

        /* renamed from: a */
        public void handle(RecordModel recordModel, AbstractC7947h hVar) {
            if (recordModel == null) {
                C13479a.m54772d("RecordWebService", "handle()... data is null");
            } else if (!TextUtils.isEmpty(recordModel.getToken())) {
                C6078a.m24584a().mo24574a(recordModel.getToken(), recordModel);
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19340a(AbstractC4928g gVar, AbstractC4931i iVar) {
        super.mo19340a(gVar, iVar);
        mo19344a("biz.record.setRecordData", new C6082b());
        mo19344a("biz.record.getRecordData", new C6081a());
    }
}
