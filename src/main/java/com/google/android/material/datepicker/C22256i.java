package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.datepicker.i */
class C22256i extends BaseAdapter {

    /* renamed from: a */
    static final int f54426a = C22265o.m80550c().getMaximum(4);

    /* renamed from: b */
    final Month f54427b;

    /* renamed from: c */
    final DateSelector<?> f54428c;

    /* renamed from: d */
    C22237b f54429d;

    /* renamed from: e */
    final CalendarConstraints f54430e;

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo77416a() {
        return this.f54427b.mo77359b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo77419b() {
        return (this.f54427b.mo77359b() + this.f54427b.f54346d) - 1;
    }

    public int getCount() {
        return this.f54427b.f54346d + mo77416a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo77421c(int i) {
        return mo77416a() + (i - 1);
    }

    public long getItemId(int i) {
        return (long) (i / this.f54427b.f54345c);
    }

    /* renamed from: a */
    private void m80514a(Context context) {
        if (this.f54429d == null) {
            this.f54429d = new C22237b(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo77422d(int i) {
        if (i < mo77416a() || i > mo77419b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo77423e(int i) {
        if (i % this.f54427b.f54345c == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo77424f(int i) {
        if ((i + 1) % this.f54427b.f54345c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Long getItem(int i) {
        if (i < this.f54427b.mo77359b() || i > mo77419b()) {
            return null;
        }
        return Long.valueOf(this.f54427b.mo77358a(mo77420b(i)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo77420b(int i) {
        return (i - this.f54427b.mo77359b()) + 1;
    }

    C22256i(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f54427b = month;
        this.f54428c = dateSelector;
        this.f54430e = calendarConstraints;
    }

    /* renamed from: a */
    public TextView getView(int i, View view, ViewGroup viewGroup) {
        m80514a(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a = i - mo77416a();
        if (a < 0 || a >= this.f54427b.f54346d) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i2 = a + 1;
            textView.setTag(this.f54427b);
            textView.setText(String.valueOf(i2));
            long a2 = this.f54427b.mo77358a(i2);
            if (this.f54427b.f54344b == Month.m80427a().f54344b) {
                textView.setContentDescription(C22239d.m80485c(a2));
            } else {
                textView.setContentDescription(C22239d.m80487d(a2));
            }
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long a3 = getItem(i);
        if (a3 == null) {
            return textView;
        }
        if (this.f54430e.mo77287a().mo77303a(a3.longValue())) {
            textView.setEnabled(true);
            for (Long l : this.f54428c.mo77320c()) {
                if (C22265o.m80537a(a3.longValue()) == C22265o.m80537a(l.longValue())) {
                    this.f54429d.f54374b.mo77392a(textView);
                    return textView;
                }
            }
            if (C22265o.m80547b().getTimeInMillis() == a3.longValue()) {
                this.f54429d.f54375c.mo77392a(textView);
                return textView;
            }
            this.f54429d.f54373a.mo77392a(textView);
            return textView;
        }
        textView.setEnabled(false);
        this.f54429d.f54379g.mo77392a(textView);
        return textView;
    }
}
