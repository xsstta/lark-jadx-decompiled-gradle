package com.bytedance.ee.bear.browser.demo;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4950k;

/* renamed from: com.bytedance.ee.bear.browser.demo.a */
public class C4924a extends Fragment {

    /* renamed from: a */
    private C4925b f14477a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m20297b(WebData webData) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4925b bVar = (C4925b) C4950k.m20474a(this, C4925b.class);
        this.f14477a = bVar;
        bVar.getWebData().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.browser.demo.$$Lambda$a$8epud6ixqOna6gi3t6FkBZLEVM */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C4924a.this.m20297b((WebData) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
