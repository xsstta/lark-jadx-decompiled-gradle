package com.ss.android.lark.sticker.ui.p2716a;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.lark.ui.IActionTitlebar;

/* renamed from: com.ss.android.lark.sticker.ui.a.b */
public abstract class AbstractC55085b extends IActionTitlebar.TextAction {

    /* renamed from: a */
    long f136043a = 1000;

    /* renamed from: b */
    private long f136044b;

    /* renamed from: a */
    public abstract void mo187990a(View view);

    @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
    public void performAction(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f136044b > this.f136043a) {
            mo187990a(view);
            this.f136044b = uptimeMillis;
        }
    }

    public AbstractC55085b(String str, int i, int i2) {
        super(str, i, i2);
    }
}
