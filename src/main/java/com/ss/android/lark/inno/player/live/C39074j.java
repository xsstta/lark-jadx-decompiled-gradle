package com.ss.android.lark.inno.player.live;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.lark.inno.player.core.C39007h;
import com.ss.android.lark.inno.player.core.C39008i;
import com.ss.android.lark.inno.player.live.p1997b.C39064b;

/* renamed from: com.ss.android.lark.inno.player.live.j */
public class C39074j extends AbstractC39021a {
    /* renamed from: c */
    public void mo142903c() {
        this.f100222d.mo142911d();
    }

    /* renamed from: e */
    private void m154286e() {
        this.f100219a = C39007h.m153966a(mo142782b(), this.f100222d);
    }

    /* renamed from: d */
    public void mo142904d() {
        this.f100222d.mo142911d();
        this.f100222d.mo142912e();
        this.f100219a.mo142898l();
    }

    /* renamed from: a */
    public void mo142900a(C39064b bVar) {
        mo142781a().mo142896a(bVar);
    }

    /* renamed from: a */
    public void mo142901a(String str) {
        this.f100222d.mo142910c(str);
    }

    /* renamed from: b */
    public void mo142902b(String str) {
        this.f100222d.mo142909b(str);
        this.f100222d.mo142894b();
    }

    public C39074j(Context context) {
        super(context);
        this.f100222d = C39008i.m153968b(context);
        this.f100220b = new FrameLayout(context);
        this.f100222d.mo142905a(this.f100220b);
        this.f100222d.mo142907a(true);
        m154286e();
    }
}
