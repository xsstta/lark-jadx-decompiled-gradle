package com.ss.android.lark.inno.player.p1974b.p1976b;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.lark.inno.utils.C39091a;
import com.ss.android.lark.inno.utils.C39094d;

/* renamed from: com.ss.android.lark.inno.player.b.b.a */
public class C38946a {

    /* renamed from: a */
    private ViewGroup f100103a;

    /* renamed from: b */
    private ViewGroup f100104b;

    /* renamed from: a */
    public void mo142545a(Context context) {
        C39094d.m154348a(this.f100103a);
        C39094d.m154349a(this.f100104b, this.f100103a);
        C39091a.m154339a(C39094d.m154346a(context), true);
        C39094d.m154347a(context, 0);
    }

    public C38946a(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        this.f100104b = frameLayout;
        C39094d.m154349a((ViewGroup) C39094d.m154346a(viewGroup.getContext()).findViewById(16908290), frameLayout);
        this.f100103a = viewGroup;
    }

    /* renamed from: a */
    public void mo142546a(ViewGroup viewGroup) {
        C39094d.m154348a(this.f100103a);
        C39094d.m154349a(viewGroup, this.f100103a);
        C39094d.m154347a(viewGroup.getContext(), 1);
    }
}
