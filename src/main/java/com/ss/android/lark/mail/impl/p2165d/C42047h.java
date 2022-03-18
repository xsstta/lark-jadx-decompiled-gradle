package com.ss.android.lark.mail.impl.p2165d;

import android.view.View;
import com.larksuite.component.universe_design.notice.UDNotice;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mail.impl.d.h */
public final class C42047h {

    /* renamed from: a */
    private final UDNotice f106702a;

    /* renamed from: a */
    public UDNotice mo151062a() {
        return this.f106702a;
    }

    private C42047h(UDNotice uDNotice) {
        this.f106702a = uDNotice;
    }

    /* renamed from: a */
    public static C42047h m167239a(View view) {
        Objects.requireNonNull(view, "rootView");
        return new C42047h((UDNotice) view);
    }
}
