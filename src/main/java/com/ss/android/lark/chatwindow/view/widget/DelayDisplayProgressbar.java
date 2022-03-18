package com.ss.android.lark.chatwindow.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.larksuite.suite.R;

public class DelayDisplayProgressbar extends ProgressBar {

    /* renamed from: a */
    private Runnable f91313a = new Runnable() {
        /* class com.ss.android.lark.chatwindow.view.widget.$$Lambda$DelayDisplayProgressbar$Cwxa28H7BAUksShALKUtU79ToCw */

        public final void run() {
            DelayDisplayProgressbar.this.m138033b();
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m138033b() {
        Object tag = getTag(R.id.delay_progress_visible_tag);
        if (tag != null && ((Boolean) tag).booleanValue()) {
            setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo129995a() {
        setTag(R.id.delay_progress_visible_tag, false);
        removeCallbacks(this.f91313a);
        setVisibility(8);
    }

    public DelayDisplayProgressbar(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo129996a(int i) {
        setTag(R.id.delay_progress_visible_tag, true);
        setVisibility(4);
        postDelayed(this.f91313a, (long) i);
    }

    public DelayDisplayProgressbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DelayDisplayProgressbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
