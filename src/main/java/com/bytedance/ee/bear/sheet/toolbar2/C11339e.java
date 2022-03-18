package com.bytedance.ee.bear.sheet.toolbar2;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.model.toolbar.ItemV2;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7605c;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.sheet.borderline.BorderLineData;
import com.bytedance.ee.bear.sheet.borderline.C11061b;
import com.bytedance.ee.bear.sheet.selectcolor.C11304b;
import com.bytedance.ee.bear.sheet.selectcolor.SheetSelectColorData;
import com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.toolbar2.e */
public class C11339e extends AbstractC7610d<SheetBlockToolbarV2> {

    /* renamed from: a */
    static final /* synthetic */ boolean f30472a;

    /* renamed from: h */
    private C11338d f30473h;

    /* renamed from: i */
    private C11304b f30474i;

    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m47084g() {
        mo29945d().notifyDataSetChanged();
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    /* renamed from: b */
    public AbstractC7605c mo29923b() {
        return new C11332c(mo29941a((SheetBlockToolbarV2) mo22161a().getToolbar().mo5927b()));
    }

    /* renamed from: f */
    public C11359k mo22161a() {
        if (f30472a || getActivity() != null) {
            return (C11359k) C4950k.m20474a(this, C11359k.class);
        }
        throw new AssertionError();
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    /* renamed from: c */
    public void mo29944c() {
        super.mo29944c();
        if (f30472a || getContext() != null) {
            this.f30473h = new C11338d(getContext(), mo29941a((SheetBlockToolbarV2) mo22161a().getToolbar().mo5927b()));
            this.f20642d.addItemDecoration(this.f30473h);
            this.f20642d.setPadding(0, 0, 0, 0);
            return;
        }
        throw new AssertionError();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30474i = (C11304b) C4950k.m20474a(this, C11304b.class);
    }

    /* renamed from: a */
    private void m47081a(ItemV2 itemV2) {
        mo22161a().getAnalytic().mo42277e();
        FragmentActivity activity = getActivity();
        if (f30472a || activity != null) {
            this.f30474i.openSelectColorPanel(this, new C11304b.AbstractC11305a(itemV2) {
                /* class com.bytedance.ee.bear.sheet.toolbar2.$$Lambda$e$DoIygxazgen9C7Ty9U0xauCrDs */
                public final /* synthetic */ ItemV2 f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.sheet.selectcolor.C11304b.AbstractC11305a
                public final void onColorSelected(String str) {
                    C11339e.m269963lambda$DoIygxazgen9C7Ty9U0xauCrDs(C11339e.this, this.f$1, str);
                }
            });
            return;
        }
        throw new AssertionError();
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    /* renamed from: b */
    public void mo29943b(ItemV2 itemV2) {
        if (SheetBlockPrimaryItemId.EnumC11325b.backColor.name().equals(itemV2.getId())) {
            m47081a(itemV2);
        } else if (SheetBlockPrimaryItemId.EnumC11325b.borderLine.name().equals(itemV2.getId())) {
            m47083c(itemV2);
        } else {
            super.mo29943b(itemV2);
        }
    }

    /* renamed from: c */
    private void m47083c(final ItemV2 itemV2) {
        super.mo29943b(new ItemV2(new ItemIdV2() {
            /* class com.bytedance.ee.bear.sheet.toolbar2.C11339e.C113401 */

            @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
            public ItemIdV2[] children() {
                return new ItemIdV2[0];
            }

            @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
            public ItemIdV2.DisplayMode displayMode() {
                return null;
            }

            @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
            public String name() {
                return "borderLineEnter";
            }
        }));
        FragmentActivity activity = getActivity();
        if (f30472a || activity != null) {
            ((C11061b) C4950k.m20474a(this, C11061b.class)).openBorderLinePanel(this, new BorderLineData(itemV2.getId(), getString(R.string.Doc_Doc_ToolbarCellBorderLine), itemV2.getList()[0]), new C11061b.AbstractC11062a() {
                /* class com.bytedance.ee.bear.sheet.toolbar2.C11339e.C113412 */

                @Override // com.bytedance.ee.bear.sheet.borderline.C11061b.AbstractC11062a
                /* renamed from: a */
                public <V> void mo42146a(V v) {
                    C11339e.this.mo29922a(itemV2, (Object) v);
                }
            });
            return;
        }
        throw new AssertionError();
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    /* renamed from: a */
    public void mo29940a(ItemV2[] itemV2Arr) {
        C11304b bVar;
        C11338d dVar = this.f30473h;
        if (!(dVar == null || itemV2Arr == null)) {
            dVar.mo43461a(itemV2Arr);
        }
        if (f30472a || itemV2Arr != null) {
            for (ItemV2 itemV2 : itemV2Arr) {
                if (SheetBlockPrimaryItemId.EnumC11325b.backColor.name().equals(itemV2.getId()) && (bVar = this.f30474i) != null) {
                    bVar.getSelectColorData().mo5929b(new SheetSelectColorData(getString(R.string.Doc_Doc_ToolbarCellBgColor), itemV2.getValue(), itemV2.getList()));
                }
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m47082a(ItemV2 itemV2, String str) {
        mo29922a(itemV2, (Object) str);
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e, com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        super.onKeyboardHeightChanged(fVar, i, i2);
        if (this.f20642d != null && i == 0) {
            this.f20642d.post(new Runnable() {
                /* class com.bytedance.ee.bear.sheet.toolbar2.$$Lambda$e$9UbBnkUgg7EVgbRxG218khgQOR8 */

                public final void run() {
                    C11339e.lambda$9UbBnkUgg7EVgbRxG218khgQOR8(C11339e.this);
                }
            });
        }
    }
}
