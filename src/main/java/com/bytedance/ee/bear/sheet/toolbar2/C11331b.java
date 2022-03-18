package com.bytedance.ee.bear.sheet.toolbar2;

import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7605c;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;

/* renamed from: com.bytedance.ee.bear.sheet.toolbar2.b */
public class C11331b extends AbstractC7610d<SheetBlockToolbarV2> {

    /* renamed from: a */
    static final /* synthetic */ boolean f30459a = true;

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m47069f() {
        mo29945d().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    /* renamed from: a */
    public AbstractC7616f<SheetBlockToolbarV2> mo22161a() {
        if (f30459a || getActivity() != null) {
            return (AbstractC7616f) C4950k.m20474a(this, C11359k.class);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    /* renamed from: b */
    public AbstractC7605c mo29923b() {
        return new C11328a(mo29941a(mo22161a().getToolbar().mo5927b()));
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e, com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        super.onKeyboardHeightChanged(fVar, i, i2);
        if (this.f20642d != null && i == 0) {
            this.f20642d.post(new Runnable() {
                /* class com.bytedance.ee.bear.sheet.toolbar2.$$Lambda$b$934lbvesvdvxgay0Mlew_6ucRU */

                public final void run() {
                    C11331b.m269962lambda$934lbvesvdvxgay0Mlew_6ucRU(C11331b.this);
                }
            });
        }
    }
}
