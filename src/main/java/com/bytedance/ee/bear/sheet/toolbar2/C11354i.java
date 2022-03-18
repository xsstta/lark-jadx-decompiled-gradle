package com.bytedance.ee.bear.sheet.toolbar2;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.model.toolbar.ItemV2;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7605c;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.sheet.selectcolor.C11304b;
import com.bytedance.ee.bear.sheet.selectcolor.SheetSelectColorData;
import com.bytedance.ee.bear.sheet.toolbar2.C11346h;
import com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.toolbar2.i */
public class C11354i extends AbstractC7610d<SheetBlockToolbarV2> {

    /* renamed from: a */
    static final /* synthetic */ boolean f30505a = true;

    /* renamed from: h */
    private C11304b f30506h;

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m47116g() {
        mo29945d().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    /* renamed from: b */
    public AbstractC7605c mo29923b() {
        C11346h hVar = new C11346h(mo29941a((SheetBlockToolbarV2) mo22161a().getToolbar().mo5927b()));
        hVar.mo43464a((C11346h.AbstractC11353b) new C11346h.AbstractC11353b() {
            /* class com.bytedance.ee.bear.sheet.toolbar2.C11354i.C113551 */

            @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7605c.AbstractC7607b
            public void onItemClicked(ItemV2 itemV2) {
                if (SheetBlockPrimaryItemId.EnumC11326c.foreColor.name().equals(itemV2.getId())) {
                    C11354i.this.mo43466a(itemV2);
                } else {
                    C11354i.this.mo29922a(itemV2, (Object) "");
                }
            }

            @Override // com.bytedance.ee.bear.sheet.toolbar2.C11346h.AbstractC11353b
            /* renamed from: a */
            public void mo43465a(ItemV2 itemV2, String str) {
                C11354i.this.mo29922a(itemV2, (Object) str);
            }
        });
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C11359k mo22161a() {
        if (f30505a || getActivity() != null) {
            return (C11359k) C4950k.m20474a(this, C11359k.class);
        }
        throw new AssertionError();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30506h = (C11304b) C4950k.m20474a(this, C11304b.class);
    }

    /* renamed from: a */
    public void mo43466a(ItemV2 itemV2) {
        mo22161a().getAnalytic().mo42274d();
        FragmentActivity activity = getActivity();
        if (f30505a || activity != null) {
            this.f30506h.openSelectColorPanel(this, new C11304b.AbstractC11305a(itemV2) {
                /* class com.bytedance.ee.bear.sheet.toolbar2.$$Lambda$i$Ec3OKaUa132SXgirrThKhdMyyZE */
                public final /* synthetic */ ItemV2 f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.sheet.selectcolor.C11304b.AbstractC11305a
                public final void onColorSelected(String str) {
                    C11354i.lambda$Ec3OKaUa132SXgirrThKhdMyyZE(C11354i.this, this.f$1, str);
                }
            });
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    /* renamed from: a */
    public void mo29940a(ItemV2[] itemV2Arr) {
        C11304b bVar;
        if (f30505a || itemV2Arr != null) {
            for (ItemV2 itemV2 : itemV2Arr) {
                if (SheetBlockPrimaryItemId.EnumC11326c.foreColor.name().equals(itemV2.getId()) && (bVar = this.f30506h) != null) {
                    bVar.getSelectColorData().mo5929b(new SheetSelectColorData(getString(R.string.Doc_Doc_ToolbarCellTxtColor), itemV2.getValue(), itemV2.getList()));
                }
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47115a(ItemV2 itemV2, String str) {
        mo29922a(itemV2, (Object) str);
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e, com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        super.onKeyboardHeightChanged(fVar, i, i2);
        if (this.f20642d != null && i == 0) {
            this.f20642d.post(new Runnable() {
                /* class com.bytedance.ee.bear.sheet.toolbar2.$$Lambda$i$9aklcmErGTwsOBw6gfb1R0U9n0 */

                public final void run() {
                    C11354i.m269966lambda$9aklcmErGTwsOBw6gfb1R0U9n0(C11354i.this);
                }
            });
        }
    }
}
