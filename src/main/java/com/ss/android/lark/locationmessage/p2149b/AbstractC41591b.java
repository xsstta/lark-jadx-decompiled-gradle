package com.ss.android.lark.locationmessage.p2149b;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.lark.ui.IActionTitlebar;

/* renamed from: com.ss.android.lark.locationmessage.b.b */
public abstract class AbstractC41591b extends IActionTitlebar.TextAction {

    /* renamed from: a */
    private long f105679a;

    /* renamed from: a */
    public abstract void mo149708a(View view);

    @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
    public void performAction(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f105679a > 1000) {
            mo149708a(view);
            this.f105679a = uptimeMillis;
        }
    }

    public AbstractC41591b(String str, int i) {
        super(str, i);
    }
}
