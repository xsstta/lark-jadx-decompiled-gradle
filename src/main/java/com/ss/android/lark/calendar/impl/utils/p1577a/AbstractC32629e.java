package com.ss.android.lark.calendar.impl.utils.p1577a;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.lark.ui.IActionTitlebar;

/* renamed from: com.ss.android.lark.calendar.impl.utils.a.e */
public abstract class AbstractC32629e extends IActionTitlebar.TextAction {

    /* renamed from: a */
    private long f83724a;

    /* renamed from: a */
    public abstract void mo109419a(View view);

    public AbstractC32629e(String str) {
        super(str);
    }

    @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
    public void performAction(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f83724a > 1000) {
            mo109419a(view);
            this.f83724a = uptimeMillis;
        }
    }

    public AbstractC32629e(String str, int i) {
        super(str, i);
    }
}
