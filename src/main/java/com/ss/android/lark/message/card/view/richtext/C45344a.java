package com.ss.android.lark.message.card.view.richtext;

import android.view.View;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.message.card.view.richtext.a */
public class C45344a {
    /* renamed from: a */
    public static boolean m180061a(View view) {
        return m180062a(view, 500);
    }

    /* renamed from: a */
    public static boolean m180062a(View view, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        Object tag = view.getTag(R.id.last_click_time);
        boolean z = false;
        if (tag == null) {
            view.setTag(R.id.last_click_time, Long.valueOf(currentTimeMillis));
            return false;
        }
        if (currentTimeMillis - ((Long) tag).longValue() < j) {
            z = true;
        }
        if (!z) {
            view.setTag(R.id.last_click_time, Long.valueOf(currentTimeMillis));
        }
        return z;
    }
}
