package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.d */
public abstract class AbstractC31820d extends BaseAdapter {

    /* renamed from: a */
    protected boolean[] f81046a;

    /* renamed from: b */
    protected Context f81047b;

    /* renamed from: c */
    protected int f81048c;

    /* renamed from: d */
    private int f81049d;

    /* renamed from: a */
    public String getItem(int i) {
        return null;
    }

    /* renamed from: b */
    public void mo116028b(int i) {
    }

    public int getCount() {
        return 0;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public int mo116025a() {
        return this.f81048c;
    }

    /* renamed from: b */
    public void mo116027b() {
        int i = 0;
        while (true) {
            boolean[] zArr = this.f81046a;
            if (i < zArr.length) {
                zArr[i] = false;
                i++;
            } else {
                notifyDataSetChanged();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo116029c() {
        boolean[] zArr;
        boolean z = false;
        int i = 0;
        while (true) {
            zArr = this.f81046a;
            if (i >= zArr.length) {
                z = true;
                break;
            } else if (zArr[i]) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            zArr[this.f81048c] = true;
        }
    }

    /* renamed from: d */
    public void mo116031d(int i) {
        this.f81048c = i;
    }

    /* renamed from: c */
    public boolean mo116030c(int i) {
        if (i < 0) {
            return false;
        }
        boolean[] zArr = this.f81046a;
        if (i < zArr.length) {
            return zArr[i];
        }
        return false;
    }

    public AbstractC31820d(Context context, int i, int i2) {
        this.f81047b = context;
        int count = getCount() / i;
        this.f81049d = Math.round((((float) i2) - (((float) (count - 1)) * context.getResources().getDimension(R.dimen.dp_05))) / ((float) count));
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        TextView textView2;
        Resources resources;
        int i2 = R.color.lkui_N400;
        if (view == null) {
            TextView textView3 = new TextView(viewGroup.getContext());
            AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, this.f81049d);
            textView3.setBackgroundColor(viewGroup.getContext().getResources().getColor(R.color.lkui_N00));
            textView3.setTextColor(viewGroup.getContext().getResources().getColor(R.color.lkui_N400));
            textView3.setLayoutParams(layoutParams);
            textView3.setGravity(17);
            textView3.setTextSize(16.0f);
            textView3.setVisibility(0);
            textView = textView3;
            textView2 = textView3;
        } else {
            textView = (TextView) view;
            textView2 = view;
        }
        Context context = textView2.getContext();
        if (i >= 0 && i < this.f81046a.length) {
            textView.setText(getItem(i));
            if (this.f81046a[i]) {
                resources = context.getResources();
                i2 = R.color.lkui_B500;
            } else {
                resources = context.getResources();
            }
            textView.setTextColor(resources.getColor(i2));
        }
        return textView2;
    }
}
