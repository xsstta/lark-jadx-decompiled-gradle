package com.bytedance.ee.bear.wiki.wikitree.tree;

import android.content.Intent;
import com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12131a;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.AbstractC12132a;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.i */
public class C12150i<HOST extends AbstractC12131a> {

    /* renamed from: a */
    protected String f32719a;

    /* renamed from: b */
    protected String f32720b;

    /* renamed from: c */
    private HOST f32721c;

    /* renamed from: a */
    public void mo46437a() {
    }

    /* renamed from: a */
    public void mo46438a(int i, int i2, Intent intent) {
    }

    /* renamed from: b */
    public void mo46445b() {
    }

    /* renamed from: c */
    public void mo46448c() {
    }

    /* renamed from: i */
    public void mo46471i() {
    }

    /* renamed from: j */
    public boolean mo46472j() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public HOST mo46473k() {
        return this.f32721c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public AbstractC12132a mo46474l() {
        return mo46473k().getModel();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public AbstractC12177b mo46475m() {
        return mo46473k().getView();
    }

    public C12150i(HOST host, String str) {
        this.f32721c = host;
        this.f32720b = str;
        this.f32719a = String.format("%s_%s_%s", "Wiki", getClass().getSimpleName(), str);
    }
}
