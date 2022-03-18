package com.bytedance.ee.bear.document.darkmode;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.darkmode.BinderIDarkModeChangedListener;
import com.bytedance.ee.log.C13479a;

/* access modifiers changed from: package-private */
public class DarkModeWebService$1 extends BinderIDarkModeChangedListener.Stub {
    final /* synthetic */ C5738a this$0;

    DarkModeWebService$1(C5738a aVar) {
        this.this$0 = aVar;
    }

    @Override // com.bytedance.ee.bear.contract.darkmode.AbstractC5128c.AbstractC5129a
    public void onChanged(int i) {
        if (this.this$0.f16195a != null && this.this$0.f16195a.f16197a != null) {
            JSONObject parseObject = JSONObject.parseObject(C5738a.m23205a(i));
            C13479a.m54772d("DarkModeWebService", "DarkModeWebService onChanged callback = " + parseObject);
            this.this$0.f16195a.f16197a.mo17188a(parseObject);
        }
    }
}
