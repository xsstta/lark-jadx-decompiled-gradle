package com.ss.android.appcenter.business.tab.fragmentv3.component;

import android.view.View;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.engine.AbstractC28246e;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.a */
public class View$OnClickListenerC28043a implements View.OnClickListener {

    /* renamed from: a */
    private WeakReference<AbstractC28246e> f70149a;

    /* renamed from: b */
    private String f70150b;

    public void onClick(View view) {
        C28184h.m103250d("ComponentErrorClickList", "onClick>>> key:" + this.f70150b);
        WeakReference<AbstractC28246e> weakReference = this.f70149a;
        if (weakReference != null && weakReference.get() != null) {
            this.f70149a.get().mo100598d().mo99987a(this.f70150b);
        }
    }

    public View$OnClickListenerC28043a(AbstractC28246e eVar, String str) {
        this.f70149a = new WeakReference<>(eVar);
        this.f70150b = str;
    }
}
