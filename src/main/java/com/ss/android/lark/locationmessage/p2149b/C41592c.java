package com.ss.android.lark.locationmessage.p2149b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: com.ss.android.lark.locationmessage.b.c */
public class C41592c {
    /* renamed from: a */
    public static void m165056a(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int i = 0;
            for (int i2 = 0; i2 < adapter.getCount(); i2++) {
                View view = adapter.getView(i2, null, listView);
                view.measure(0, 0);
                i += view.getMeasuredHeight();
            }
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = i + (listView.getDividerHeight() * adapter.getCount());
            listView.setLayoutParams(layoutParams);
        }
    }
}
