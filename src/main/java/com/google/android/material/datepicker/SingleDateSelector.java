package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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

public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new Parcelable.Creator<SingleDateSelector>() {
        /* class com.google.android.material.datepicker.SingleDateSelector.C222352 */

        /* renamed from: a */
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }

        /* renamed from: a */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f54364a = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }
    };

    /* renamed from: a */
    public Long f54364a;

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo77384e() {
        this.f54364a = null;
    }

    /* renamed from: f */
    public Long mo77315a() {
        return this.f54364a;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: b */
    public boolean mo77319b() {
        if (this.f54364a != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: d */
    public Collection<C0844e<Long, Long>> mo77321d() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: c */
    public Collection<Long> mo77320c() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f54364a;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: a */
    public void mo77317a(long j) {
        this.f54364a = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: b */
    public int mo77318b(Context context) {
        return C22312b.m80789a(context, (int) R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: a */
    public String mo77316a(Context context) {
        Resources resources = context.getResources();
        Long l = this.f54364a;
        if (l == null) {
            return resources.getString(R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(R.string.mtrl_picker_date_header_selected, C22239d.m80480a(l.longValue()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f54364a);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: a */
    public View mo77314a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, final AbstractC22260k<Long> kVar) {
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (C22332d.m80917d()) {
            editText.setInputType(17);
        }
        SimpleDateFormat d = C22265o.m80552d();
        String a = C22265o.m80541a(inflate.getResources(), d);
        Long l = this.f54364a;
        if (l != null) {
            editText.setText(d.format(l));
        }
        editText.addTextChangedListener(new AbstractC22238c(a, d, textInputLayout, calendarConstraints) {
            /* class com.google.android.material.datepicker.SingleDateSelector.C222341 */

            /* access modifiers changed from: package-private */
            @Override // com.google.android.material.datepicker.AbstractC22238c
            /* renamed from: a */
            public void mo77377a() {
                kVar.mo77354a();
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.android.material.datepicker.AbstractC22238c
            /* renamed from: a */
            public void mo77378a(Long l) {
                if (l == null) {
                    SingleDateSelector.this.mo77384e();
                } else {
                    SingleDateSelector.this.mo77317a(l.longValue());
                }
                kVar.mo77355a(SingleDateSelector.this.mo77315a());
            }
        });
        C22365r.m81025b(editText);
        return inflate;
    }
}
