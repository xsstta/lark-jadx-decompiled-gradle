package com.ss.android.lark.inno.player.core;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.lark.inno.player.p1978c.AbstractC38995d;
import com.ss.android.lark.inno.player.p1978c.C38997f;

/* renamed from: com.ss.android.lark.inno.player.core.d */
public abstract class AbstractC39003d {

    /* renamed from: a */
    protected C38997f f100189a;

    /* renamed from: b */
    protected FrameLayout f100190b;

    /* renamed from: c */
    protected Context f100191c;

    /* renamed from: d */
    protected C39009j f100192d;

    /* renamed from: a */
    public C38997f mo142711a() {
        return this.f100189a;
    }

    /* renamed from: b */
    public FrameLayout mo142713b() {
        return this.f100190b;
    }

    /* renamed from: a */
    public void mo142712a(AbstractC38995d dVar) {
        this.f100192d.mo142719a(dVar);
    }

    /* renamed from: b */
    public void mo142714b(AbstractC38995d dVar) {
        this.f100192d.mo142726b(dVar);
    }

    public AbstractC39003d(Context context) {
        this.f100191c = context.getApplicationContext();
    }
}
