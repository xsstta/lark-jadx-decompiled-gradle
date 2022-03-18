package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.larksuite.suite.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.e */
class C22240e extends BaseAdapter {

    /* renamed from: d */
    private static final int f54386d;

    /* renamed from: a */
    private final Calendar f54387a;

    /* renamed from: b */
    private final int f54388b;

    /* renamed from: c */
    private final int f54389c;

    public long getItemId(int i) {
        return 0;
    }

    public int getCount() {
        return this.f54388b;
    }

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        } else {
            i = 1;
        }
        f54386d = i;
    }

    public C22240e() {
        Calendar c = C22265o.m80550c();
        this.f54387a = c;
        this.f54388b = c.getMaximum(7);
        this.f54389c = c.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m80490b(int i) {
        int i2 = i + this.f54389c;
        int i3 = this.f54388b;
        if (i2 > i3) {
            return i2 - i3;
        }
        return i2;
    }

    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f54388b) {
            return null;
        }
        return Integer.valueOf(m80490b(i));
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f54387a.set(7, m80490b(i));
        textView.setText(this.f54387a.getDisplayName(7, f54386d, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f54387a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
