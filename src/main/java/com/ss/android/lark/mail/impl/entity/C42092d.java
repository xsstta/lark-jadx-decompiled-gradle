package com.ss.android.lark.mail.impl.entity;

import com.larksuite.component.ui.dialog.LKUIListItemData;

/* renamed from: com.ss.android.lark.mail.impl.entity.d */
public class C42092d extends LKUIListItemData {

    /* renamed from: a */
    private Runnable f107042a;

    /* renamed from: b */
    private boolean f107043b = true;

    /* renamed from: d */
    public boolean mo151842d() {
        return this.f107043b;
    }

    /* renamed from: c */
    public void mo151841c() {
        Runnable runnable = this.f107042a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public C42092d(CharSequence charSequence, Runnable runnable, boolean z) {
        super(charSequence);
        this.f107042a = runnable;
        this.f107043b = z;
    }
}
