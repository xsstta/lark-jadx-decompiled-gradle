package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.util.C0844e;
import com.google.android.material.internal.C22332d;
import com.google.android.material.internal.C22365r;
import com.google.android.material.p988i.C22312b;
import com.google.android.material.textfield.TextInputLayout;
import com.larksuite.suite.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

public class RangeDateSelector implements DateSelector<C0844e<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new Parcelable.Creator<RangeDateSelector>() {
        /* class com.google.android.material.datepicker.RangeDateSelector.C222333 */

        /* renamed from: a */
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }

        /* renamed from: a */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f54350a = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f54351b = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }
    };

    /* renamed from: a */
    public Long f54350a;

    /* renamed from: b */
    public Long f54351b;

    /* renamed from: c */
    public Long f54352c;

    /* renamed from: d */
    public Long f54353d;

    /* renamed from: e */
    private String f54354e;

    /* renamed from: f */
    private final String f54355f = " ";

    /* renamed from: a */
    private boolean m80440a(long j, long j2) {
        return j <= j2;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C0844e<Long, Long> mo77315a() {
        return new C0844e<>(this.f54350a, this.f54351b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: b */
    public boolean mo77319b() {
        Long l = this.f54350a;
        if (l == null || this.f54351b == null || !m80440a(l.longValue(), this.f54351b.longValue())) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: c */
    public Collection<Long> mo77320c() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f54350a;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f54351b;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: d */
    public Collection<C0844e<Long, Long>> mo77321d() {
        if (this.f54350a == null || this.f54351b == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0844e(this.f54350a, this.f54351b));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: b */
    public int mo77318b(Context context) {
        int i;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis)) {
            i = R.attr.materialCalendarTheme;
        } else {
            i = R.attr.materialCalendarFullscreenTheme;
        }
        return C22312b.m80789a(context, i, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: a */
    public String mo77316a(Context context) {
        Resources resources = context.getResources();
        Long l = this.f54350a;
        if (l == null && this.f54351b == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f54351b;
        if (l2 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, C22239d.m80489e(l.longValue()));
        } else if (l == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, C22239d.m80489e(l2.longValue()));
        } else {
            C0844e<String, String> a = C22239d.m80478a(l, l2);
            return resources.getString(R.string.mtrl_picker_range_header_selected, a.f3317a, a.f3318b);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: a */
    public void mo77317a(long j) {
        Long l = this.f54350a;
        if (l == null) {
            this.f54350a = Long.valueOf(j);
        } else if (this.f54351b != null || !m80440a(l.longValue(), j)) {
            this.f54351b = null;
            this.f54350a = Long.valueOf(j);
        } else {
            this.f54351b = Long.valueOf(j);
        }
    }

    /* renamed from: b */
    private void m80441b(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f54354e);
        textInputLayout2.setError(" ");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f54350a);
        parcel.writeValue(this.f54351b);
    }

    /* renamed from: a */
    private void m80439a(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f54354e.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError(null);
        }
    }

    /* renamed from: a */
    public void mo77373a(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, AbstractC22260k<C0844e<Long, Long>> kVar) {
        Long l = this.f54352c;
        if (l == null || this.f54353d == null) {
            m80439a(textInputLayout, textInputLayout2);
            kVar.mo77354a();
        } else if (m80440a(l.longValue(), this.f54353d.longValue())) {
            this.f54350a = this.f54352c;
            this.f54351b = this.f54353d;
            kVar.mo77355a(mo77315a());
        } else {
            m80441b(textInputLayout, textInputLayout2);
            kVar.mo77354a();
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: a */
    public View mo77314a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, final AbstractC22260k<C0844e<Long, Long>> kVar) {
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        final TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (C22332d.m80917d()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f54354e = inflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat d = C22265o.m80552d();
        Long l = this.f54350a;
        if (l != null) {
            editText.setText(d.format(l));
            this.f54352c = this.f54350a;
        }
        Long l2 = this.f54351b;
        if (l2 != null) {
            editText2.setText(d.format(l2));
            this.f54353d = this.f54351b;
        }
        String a = C22265o.m80541a(inflate.getResources(), d);
        editText.addTextChangedListener(new AbstractC22238c(a, d, calendarConstraints, textInputLayout) {
            /* class com.google.android.material.datepicker.RangeDateSelector.C222311 */

            /* access modifiers changed from: package-private */
            @Override // com.google.android.material.datepicker.AbstractC22238c
            /* renamed from: a */
            public void mo77377a() {
                RangeDateSelector.this.f54352c = null;
                RangeDateSelector.this.mo77373a(textInputLayout, textInputLayout2, kVar);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.android.material.datepicker.AbstractC22238c
            /* renamed from: a */
            public void mo77378a(Long l) {
                RangeDateSelector.this.f54352c = l;
                RangeDateSelector.this.mo77373a(textInputLayout, textInputLayout2, kVar);
            }
        });
        editText2.addTextChangedListener(new AbstractC22238c(a, d, calendarConstraints, textInputLayout2) {
            /* class com.google.android.material.datepicker.RangeDateSelector.C222322 */

            /* access modifiers changed from: package-private */
            @Override // com.google.android.material.datepicker.AbstractC22238c
            /* renamed from: a */
            public void mo77377a() {
                RangeDateSelector.this.f54353d = null;
                RangeDateSelector.this.mo77373a(textInputLayout, textInputLayout2, kVar);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.android.material.datepicker.AbstractC22238c
            /* renamed from: a */
            public void mo77378a(Long l) {
                RangeDateSelector.this.f54353d = l;
                RangeDateSelector.this.mo77373a(textInputLayout, textInputLayout2, kVar);
            }
        });
        C22365r.m81025b(editText);
        return inflate;
    }
}
