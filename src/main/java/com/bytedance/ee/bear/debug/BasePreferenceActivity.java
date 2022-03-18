package com.bytedance.ee.bear.debug;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.preference.PreferenceActivity;
import com.bytedance.ee.bear.p288d.C5240a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;

public class BasePreferenceActivity extends PreferenceActivity {

    /* renamed from: a */
    private C10917c f15003a;

    /* renamed from: a */
    public C10917c mo21144a() {
        return this.f15003a;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        if (C10929e.f29412b.get()) {
            this.f15003a = new C10917c(new C10929e());
            C5240a.AbstractC5241a a = C5240a.m21422a();
            if (a != null) {
                context = a.injectBaseContext(context);
            }
        }
        super.attachBaseContext(context);
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        if (this.f15003a == null) {
            C13479a.m54758a("BasePreferenceActivity", "mServiceContext == null!!!");
            finish();
        }
    }
}
