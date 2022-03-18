package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.larksuite.suite.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* renamed from: com.google.android.material.datepicker.c */
abstract class AbstractC22238c implements TextWatcher {

    /* renamed from: a */
    private final String f54381a;

    /* renamed from: b */
    private final DateFormat f54382b;

    /* renamed from: c */
    private final TextInputLayout f54383c;

    /* renamed from: d */
    private final CalendarConstraints f54384d;

    /* renamed from: e */
    private final String f54385e;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77377a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo77378a(Long l);

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    AbstractC22238c(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f54381a = str;
        this.f54382b = dateFormat;
        this.f54383c = textInputLayout;
        this.f54384d = calendarConstraints;
        this.f54385e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f54383c.setError(null);
            mo77378a(null);
            return;
        }
        try {
            Date parse = this.f54382b.parse(charSequence.toString());
            this.f54383c.setError(null);
            long time = parse.getTime();
            if (!this.f54384d.mo77287a().mo77303a(time) || !this.f54384d.mo77289a(time)) {
                this.f54383c.setError(String.format(this.f54385e, C22239d.m80489e(time)));
                mo77377a();
                return;
            }
            mo77378a(Long.valueOf(parse.getTime()));
        } catch (ParseException unused) {
            String string = this.f54383c.getContext().getString(R.string.mtrl_picker_invalid_format);
            String format = String.format(this.f54383c.getContext().getString(R.string.mtrl_picker_invalid_format_use), this.f54381a);
            String format2 = String.format(this.f54383c.getContext().getString(R.string.mtrl_picker_invalid_format_example), this.f54382b.format(new Date(C22265o.m80547b().getTimeInMillis())));
            TextInputLayout textInputLayout = this.f54383c;
            textInputLayout.setError(string + "\n" + format + "\n" + format2);
            mo77377a();
        }
    }
}
