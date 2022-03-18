package com.ss.android.lark.setting.export;

import android.view.View;

/* renamed from: com.ss.android.lark.setting.export.c */
public class C54127c {

    /* renamed from: a */
    private AbstractC54128a f134014a;

    /* renamed from: com.ss.android.lark.setting.export.c$a */
    public interface AbstractC54128a {
        void selectComponent(String str, View view);
    }

    /* renamed from: a */
    public void mo185302a(AbstractC54128a aVar) {
        this.f134014a = aVar;
    }

    /* renamed from: a */
    public void mo185301a(View view, boolean z) {
        view.setSelected(z);
        if (z) {
            this.f134014a.selectComponent(getClass().getSimpleName(), view);
        }
    }
}
