package com.huawei.hms.framework.network.grs.p1015c;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.network.grs.p1015c.p1017b.C23563a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.huawei.hms.framework.network.grs.c.f */
public class RunnableC23569f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f58114a;

    /* renamed from: b */
    final /* synthetic */ Context f58115b;

    /* renamed from: c */
    final /* synthetic */ ArrayList f58116c;

    /* renamed from: d */
    final /* synthetic */ JSONArray f58117d;

    RunnableC23569f(long j, Context context, ArrayList arrayList, JSONArray jSONArray) {
        this.f58114a = j;
        this.f58115b = context;
        this.f58116c = arrayList;
        this.f58117d = jSONArray;
    }

    public void run() {
        boolean z;
        C23563a aVar = new C23563a();
        aVar.put("total_time", this.f58114a);
        aVar.put("network_type", (long) NetworkUtil.getNetworkType(this.f58115b));
        Iterator it = this.f58116c.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C23568e eVar = (C23568e) it.next();
            if (eVar.mo82909m()) {
                aVar.put(C23570g.m85509b(eVar));
                it.remove();
                z = true;
                break;
            }
        }
        if (!z && this.f58116c.size() > 0) {
            ArrayList arrayList = this.f58116c;
            C23568e eVar2 = (C23568e) arrayList.get(arrayList.size() - 1);
            aVar.put(C23570g.m85509b(eVar2));
            this.f58116c.remove(eVar2);
        }
        if (this.f58116c.size() > 0) {
            Iterator it2 = this.f58116c.iterator();
            while (it2.hasNext()) {
                this.f58117d.put(new JSONObject(C23570g.m85509b((C23568e) it2.next())));
            }
        }
        if (this.f58117d.length() > 0) {
            aVar.put("failed_info", this.f58117d.toString());
        }
        Logger.m85367d("HaReportHelper", "grssdk report data to aiops is: %s", new JSONObject(aVar.get()));
        HianalyticsHelper.getInstance().onEvent(aVar.get(), "networkkit_grs");
    }
}
