package com.ss.android.lark.mail.impl.p2165d;

import android.view.View;
import com.larksuite.component.universe_design.notice.UDNotice;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mail.impl.d.i */
public final class C42048i {

    /* renamed from: a */
    private final UDNotice f106703a;

    /* renamed from: a */
    public UDNotice mo151063a() {
        return this.f106703a;
    }

    private C42048i(UDNotice uDNotice) {
        this.f106703a = uDNotice;
    }

    /* renamed from: a */
    public static C42048i m167241a(View view) {
        Objects.requireNonNull(view, "rootView");
        return new C42048i((UDNotice) view);
    }
}
