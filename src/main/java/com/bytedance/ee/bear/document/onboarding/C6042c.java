package com.bytedance.ee.bear.document.onboarding;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10396b;
import com.bytedance.ee.bear.onboarding.export.ui.C10403a;

/* renamed from: com.bytedance.ee.bear.document.onboarding.c */
public class C6042c extends C10403a {

    /* renamed from: a */
    private TitleBar f16915a;

    /* renamed from: b */
    private View f16916b;

    /* renamed from: b */
    public TitleBar mo24402b() {
        return this.f16915a;
    }

    /* renamed from: c */
    public View mo24403c() {
        return this.f16916b;
    }

    @Override // com.bytedance.ee.bear.onboarding.export.ui.C10403a
    /* renamed from: a */
    public boolean mo22171a() {
        if (this.f16916b == null || this.f16915a == null) {
            return false;
        }
        return true;
    }

    public C6042c(AbstractC10396b bVar, FragmentActivity fragmentActivity, TitleBar titleBar, View view) {
        super(fragmentActivity, bVar);
        this.f16915a = titleBar;
        this.f16916b = view;
    }
}
