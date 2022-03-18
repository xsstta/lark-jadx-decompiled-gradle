package com.ss.android.lark.calendar.impl.p1436a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import java.util.Objects;

/* renamed from: com.ss.android.lark.calendar.impl.a.h */
public final class C30074h {

    /* renamed from: a */
    public final LinearLayout f74980a;

    /* renamed from: b */
    private final LinearLayout f74981b;

    /* renamed from: a */
    public LinearLayout mo108420a() {
        return this.f74981b;
    }

    /* renamed from: a */
    public static C30074h m111286a(View view) {
        Objects.requireNonNull(view, "rootView");
        LinearLayout linearLayout = (LinearLayout) view;
        return new C30074h(linearLayout, linearLayout);
    }

    private C30074h(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.f74981b = linearLayout;
        this.f74980a = linearLayout2;
    }

    /* renamed from: a */
    public static C30074h m111285a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_meeting_room_load_more, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111286a(inflate);
    }
}
