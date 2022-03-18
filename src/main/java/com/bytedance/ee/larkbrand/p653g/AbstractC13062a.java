package com.bytedance.ee.larkbrand.p653g;

import androidx.fragment.app.Fragment;
import com.ss.android.lark.maincore.ITitleController;
import com.tt.refer.impl.business.p3433d.AbstractC67905a;

/* renamed from: com.bytedance.ee.larkbrand.g.a */
public abstract class AbstractC13062a extends Fragment {

    /* renamed from: a */
    protected ITitleController f34717a;

    /* renamed from: b */
    protected AbstractC67905a f34718b;

    /* renamed from: c */
    private boolean f34719c;

    /* renamed from: a */
    public abstract void mo49111a();

    /* renamed from: b */
    public abstract void mo49115b();

    /* renamed from: a */
    public void mo49112a(ITitleController iTitleController) {
        this.f34717a = iTitleController;
    }

    /* renamed from: a */
    public void mo49113a(AbstractC67905a aVar) {
        this.f34718b = aVar;
    }

    /* renamed from: a */
    public void mo49114a(boolean z) {
        if (!this.f34719c) {
            this.f34719c = true;
        } else if (z) {
            mo49111a();
        } else {
            mo49115b();
        }
    }
}
