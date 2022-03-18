package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.hms.api.a */
class C23458a {

    /* renamed from: b */
    static final C23458a f57862b = new C23458a();

    /* renamed from: a */
    List<Activity> f57863a = new ArrayList(1);

    C23458a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo82097b(Activity activity) {
        this.f57863a.remove(activity);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo82096a(Activity activity) {
        for (Activity activity2 : this.f57863a) {
            if (!(activity2 == null || activity2 == activity || activity2.isFinishing())) {
                activity2.finish();
            }
        }
        this.f57863a.add(activity);
    }
}
