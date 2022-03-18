package com.bytedance.ee.bear.mindnote.toolbar;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.log.C13479a;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.mindnote.toolbar.a */
public class C10189a {

    /* renamed from: a */
    private AbstractC5233x f27485a;

    public C10189a(AbstractC5233x xVar) {
        this.f27485a = xVar;
    }

    /* renamed from: a */
    public void mo38952a(String str, BearUrl bearUrl, String str2) {
        if (this.f27485a != null) {
            C13479a.m54772d("MindNoteToolbarAnalytic", "report:event = " + str);
            HashMap hashMap = new HashMap();
            hashMap.put("mindnote_mode", "outline");
            hashMap.put("is_block", "FALSE");
            hashMap.put("block_id", "null");
            hashMap.put("file_type", "mindnote");
            hashMap.put("module", "mindnote");
            hashMap.put("sub_module", "null");
            if (str2 != null) {
                hashMap.put("page_token", str2);
            } else {
                hashMap.put("page_token", bearUrl.f17447b);
            }
            if ("vc".equals(bearUrl.f17453h)) {
                hashMap.put("app_from", bearUrl.f17453h);
            } else {
                hashMap.put("app_from", "null");
            }
            hashMap.put("file_id", bearUrl.f17447b);
            this.f27485a.mo21084b(str, hashMap);
        }
    }
}
