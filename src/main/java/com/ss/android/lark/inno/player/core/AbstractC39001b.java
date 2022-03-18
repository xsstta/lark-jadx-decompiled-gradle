package com.ss.android.lark.inno.player.core;

import android.os.Bundle;
import android.view.View;
import com.ss.android.lark.inno.player.core.AbstractC39005f;
import com.ss.android.lark.inno.player.layer.AbstractC39017c;
import com.ss.android.lark.inno.player.p1973a.C38943b;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.lark.inno.player.core.b */
public abstract class AbstractC39001b<M, T extends View, D extends AbstractC39005f> implements AbstractC39017c {

    /* renamed from: a */
    public T f100186a;

    /* renamed from: b */
    protected D f100187b;

    /* renamed from: c */
    protected Set<Integer> f100188c = new HashSet();

    /* renamed from: a */
    public abstract void mo142589a();

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c
    /* renamed from: a */
    public /* synthetic */ void mo142656a(int i, Bundle bundle) {
        AbstractC39017c.CC.$default$a(this, i, bundle);
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c
    /* renamed from: b */
    public /* synthetic */ void mo142596b(int i, Bundle bundle) {
        AbstractC39017c.CC.$default$b(this, i, bundle);
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c
    /* renamed from: c */
    public /* synthetic */ void mo142590c(int i) {
        AbstractC39017c.CC.$default$c(this, i);
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c
    /* renamed from: d */
    public /* synthetic */ void mo142591d(int i) {
        AbstractC39017c.CC.$default$d(this, i);
    }

    /* renamed from: b */
    public D mo142707b() {
        return this.f100187b;
    }

    /* renamed from: d */
    public T mo142710d() {
        return this.f100186a;
    }

    /* renamed from: c */
    public boolean mo142709c() {
        T t = this.f100186a;
        if (t == null || t.getParent() == null || ((View) this.f100186a.getParent()).getVisibility() == 8) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo142706a(int i) {
        return this.f100188c.contains(Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo142708b(int i) {
        this.f100188c.add(Integer.valueOf(i));
    }

    public AbstractC39001b(D d, T t) {
        this.f100187b = d;
        this.f100186a = t;
        mo142708b(C38943b.f100077b);
        mo142589a();
    }
}
