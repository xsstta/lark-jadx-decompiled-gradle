package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.h */
public final class C22254h<S> extends AbstractC22261l<S> {

    /* renamed from: a */
    private DateSelector<S> f54423a;

    /* renamed from: b */
    private CalendarConstraints f54424b;

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f54423a = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f54424b = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f54423a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f54424b);
    }

    /* renamed from: a */
    static <T> C22254h<T> m80511a(DateSelector<T> dateSelector, CalendarConstraints calendarConstraints) {
        C22254h<T> hVar = new C22254h<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        hVar.setArguments(bundle);
        return hVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f54423a.mo77314a(layoutInflater, viewGroup, bundle, this.f54424b, new AbstractC22260k<S>() {
            /* class com.google.android.material.datepicker.C22254h.C222551 */

            /* access modifiers changed from: package-private */
            @Override // com.google.android.material.datepicker.AbstractC22260k
            /* renamed from: a */
            public void mo77354a() {
                Iterator it = C22254h.this.f54439l.iterator();
                while (it.hasNext()) {
                    ((AbstractC22260k) it.next()).mo77354a();
                }
            }

            @Override // com.google.android.material.datepicker.AbstractC22260k
            /* renamed from: a */
            public void mo77355a(S s) {
                Iterator it = C22254h.this.f54439l.iterator();
                while (it.hasNext()) {
                    ((AbstractC22260k) it.next()).mo77355a(s);
                }
            }
        });
    }
}
