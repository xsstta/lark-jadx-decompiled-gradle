package com.ss.android.lark.mail.impl.uiframework.view.webview;

import android.content.Context;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42351b;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42352c;

/* renamed from: com.ss.android.lark.mail.impl.uiframework.view.webview.a */
public class C43713a {

    /* renamed from: a */
    private int f110937a;

    /* renamed from: b */
    private Context f110938b;

    /* renamed from: c */
    public int mo155832c() {
        return this.f110937a;
    }

    /* renamed from: b */
    public void mo155831b() {
        this.f110937a++;
    }

    /* renamed from: a */
    public void mo155830a() {
        if (this.f110937a > 0) {
            ((C42351b) C42344d.m169091a(C42351b.class, this.f110938b)).mo152465b(0);
            ((C42352c) C42344d.m169091a(C42352c.class, this.f110938b)).mo152465b(0);
        }
    }

    public C43713a(Context context) {
        this.f110938b = context;
    }
}
