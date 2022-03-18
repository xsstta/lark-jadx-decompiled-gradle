package com.bytedance.ee.bear.debug.bugtool;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.debug.bugtool.a */
public class C5254a extends ArrayAdapter<String> {
    public int getCount() {
        return Math.max(super.getCount() - 1, 0);
    }

    public C5254a(Context context, int i, List<String> list) {
        super(context, i, list);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (i == getCount()) {
            ((TextView) view2).setTextColor(-3223858);
        }
        return view2;
    }
}
