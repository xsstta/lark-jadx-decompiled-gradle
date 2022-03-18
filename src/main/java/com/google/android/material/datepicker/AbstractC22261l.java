package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.l */
abstract class AbstractC22261l<S> extends Fragment {

    /* renamed from: l */
    protected final LinkedHashSet<AbstractC22260k<S>> f54439l = new LinkedHashSet<>();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo77437g() {
        this.f54439l.clear();
    }

    AbstractC22261l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo77436a(AbstractC22260k<S> kVar) {
        return this.f54439l.add(kVar);
    }
}
