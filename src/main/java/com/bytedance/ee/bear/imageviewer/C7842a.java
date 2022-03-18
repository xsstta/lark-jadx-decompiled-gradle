package com.bytedance.ee.bear.imageviewer;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.imageviewer.a */
public class C7842a {

    /* renamed from: a */
    private AbstractC5233x f21160a;

    public C7842a(AbstractC5233x xVar) {
        this.f21160a = xVar;
    }

    /* renamed from: a */
    public void mo30647a(String str, long j, long j2) {
        mo30646a(LocationRequest.PRIORITY_HD_ACCURACY, "success", str, j, j2, -1);
    }

    /* renamed from: a */
    public void mo30648a(String str, long j, long j2, String str2) {
        mo30646a(-1, str2, str, j, j2, -1);
    }

    /* renamed from: a */
    public void mo30646a(int i, String str, String str2, long j, long j2, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", Integer.toString(i));
        hashMap.put("msg", str);
        hashMap.put("pic_from", str2);
        hashMap.put("pic_size", Long.toString(j));
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Long.toString(j2));
        hashMap.put("image_type", Integer.toString(i2));
        C13479a.m54764b("DownloadImageAnalytic", hashMap.toString());
        AbstractC5233x xVar = this.f21160a;
        if (xVar != null) {
            xVar.mo21079a("dev_performance_native_pic_download_result", hashMap);
        }
    }
}
