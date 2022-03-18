package com.bytedance.ee.bear.document.toolbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.toolbar.b */
public abstract class AbstractC6205b extends AbstractC6207c {

    /* renamed from: c */
    private String f17272c = "BaseAttrSubToolbarFragment";

    public static /* synthetic */ void lambda$roEHLqVq65STgQ5CUH7KhW9LT8g(AbstractC6205b bVar, View view, Item[] itemArr) {
        bVar.m25021a(view, itemArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo22132f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract ItemId mo22133g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract AbstractC6212e mo22134h();

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6207c
    /* renamed from: i */
    public View mo22135i() {
        View inflate = LayoutInflater.from(getContext()).inflate(mo22132f(), (ViewGroup) null);
        mo22134h().getSubToolbar(mo22133g()).mo5923a(this, new AbstractC1178x(inflate) {
            /* class com.bytedance.ee.bear.document.toolbar.$$Lambda$b$roEHLqVq65STgQ5CUH7KhW9LT8g */
            public final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC6205b.lambda$roEHLqVq65STgQ5CUH7KhW9LT8g(AbstractC6205b.this, this.f$1, (Item[]) obj);
            }
        });
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Item mo25095a(ItemId itemId) {
        Item[] b = mo22134h().getSubToolbar(mo22133g()).mo5927b();
        if (b == null) {
            return null;
        }
        for (Item item : b) {
            if (item.id() == itemId) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private /* synthetic */ void m25021a(View view, Item[] itemArr) {
        if (itemArr != null) {
            mo22131a(itemArr, view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22131a(Item[] itemArr, View view) {
        for (Item item : itemArr) {
            final ItemId id = item.id();
            final View findViewWithTag = view.findViewWithTag(id.name());
            if (findViewWithTag == null) {
                C13479a.m54758a(this.f17272c, "Item view not found:" + item);
            } else {
                findViewWithTag.setSelected(item.isSelected());
                findViewWithTag.setEnabled(item.isEnable());
                if (findViewWithTag instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) findViewWithTag;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        viewGroup.getChildAt(i).setEnabled(item.isEnable());
                    }
                }
                findViewWithTag.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                    /* class com.bytedance.ee.bear.document.toolbar.AbstractC6205b.C62061 */

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                    /* renamed from: a */
                    public void mo16698a(View view) {
                        if (!ItemId.BusinessId.insertSeparator.name().equals(id.name())) {
                            findViewWithTag.setSelected(true);
                        }
                        AbstractC6205b.this.mo22134h().processToolbarItemClick(id, String.valueOf(view.isSelected()));
                    }
                });
            }
        }
    }
}
