package com.ss.android.lark.sticker.ui.p2716a;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.lark.ui.IActionTitlebar;

/* renamed from: com.ss.android.lark.sticker.ui.a.a */
public abstract class AbstractC55084a extends IActionTitlebar.C57573a {

    /* renamed from: a */
    private long f136042a;

    /* renamed from: a */
    public abstract void mo187989a(View view);

    public AbstractC55084a(int i) {
        super(i);
    }

    @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
    public void performAction(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f136042a > 1000) {
            mo187989a(view);
            this.f136042a = uptimeMillis;
        }
    }
}
