package com.ss.android.lark.calendar.impl.utils.p1577a;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;

/* renamed from: com.ss.android.lark.calendar.impl.utils.a.c */
public abstract class AbstractC32627c implements LinkEmojiTextView.AbstractC58521f {

    /* renamed from: a */
    private long f83722a;

    /* renamed from: a */
    public abstract void mo117506a(View view, String str, String str2);

    @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
    /* renamed from: c */
    public void mo120297c(View view, String str, String str2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f83722a > 1000) {
            mo117506a(view, str, str2);
            this.f83722a = uptimeMillis;
        }
    }
}
