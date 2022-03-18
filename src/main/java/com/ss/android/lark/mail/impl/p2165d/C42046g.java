package com.ss.android.lark.mail.impl.p2165d;

import android.view.View;
import com.larksuite.component.universe_design.notice.UDNotice;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mail.impl.d.g */
public final class C42046g {

    /* renamed from: a */
    private final UDNotice f106701a;

    /* renamed from: a */
    public UDNotice mo151061a() {
        return this.f106701a;
    }

    private C42046g(UDNotice uDNotice) {
        this.f106701a = uDNotice;
    }

    /* renamed from: a */
    public static C42046g m167237a(View view) {
        Objects.requireNonNull(view, "rootView");
        return new C42046g((UDNotice) view);
    }
}
