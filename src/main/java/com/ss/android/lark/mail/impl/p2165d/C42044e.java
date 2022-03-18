package com.ss.android.lark.mail.impl.p2165d;

import android.view.View;
import com.larksuite.component.universe_design.notice.UDNotice;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mail.impl.d.e */
public final class C42044e {

    /* renamed from: a */
    private final UDNotice f106693a;

    /* renamed from: a */
    public UDNotice mo151059a() {
        return this.f106693a;
    }

    private C42044e(UDNotice uDNotice) {
        this.f106693a = uDNotice;
    }

    /* renamed from: a */
    public static C42044e m167233a(View view) {
        Objects.requireNonNull(view, "rootView");
        return new C42044e((UDNotice) view);
    }
}
