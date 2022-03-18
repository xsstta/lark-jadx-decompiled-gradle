package com.bytedance.ee.bear.sheet.inputbar.toolbar;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.sheet.inputbar.editor.SheetInputData;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p701d.C13630j;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.toolbar.a */
public class C11244a extends RecyclerView.Adapter<C11248b> {

    /* renamed from: a */
    public AbstractC11247a f30259a;

    /* renamed from: b */
    private List<SheetInputData.SheetToolbarItem> f30260b = new ArrayList();

    /* renamed from: c */
    private int f30261c = -1;

    /* renamed from: com.bytedance.ee.bear.sheet.inputbar.toolbar.a$a */
    public interface AbstractC11247a {
        /* renamed from: a */
        void mo42928a(ToolbarItemEnum toolbarItemEnum);

        /* renamed from: b */
        void mo42929b(ToolbarItemEnum toolbarItemEnum);
    }

    /* renamed from: a */
    public List<SheetInputData.SheetToolbarItem> mo43111a() {
        return this.f30260b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f30260b.size();
    }

    /* renamed from: b */
    public SheetInputData.SheetToolbarItem mo43116b() {
        int i = this.f30261c;
        if (i < 0 || i >= this.f30260b.size()) {
            return null;
        }
        return this.f30260b.get(this.f30261c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.inputbar.toolbar.a$b */
    public static class C11248b extends RecyclerView.ViewHolder {
        C11248b(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public void mo43113a(AbstractC11247a aVar) {
        this.f30259a = aVar;
    }

    /* renamed from: a */
    public void mo43115a(List<SheetInputData.SheetToolbarItem> list) {
        this.f30260b.clear();
        this.f30260b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo43112a(int i) {
        if (i >= 0 && i < getItemCount() && i != this.f30261c) {
            SheetInputData.SheetToolbarItem sheetToolbarItem = this.f30260b.get(i);
            if (sheetToolbarItem.isHasSelectedState()) {
                int i2 = this.f30261c;
                this.f30261c = i;
                notifyItemChanged(i);
                if (i2 != -1) {
                    notifyItemChanged(i2);
                }
                AbstractC11247a aVar = this.f30259a;
                if (aVar != null) {
                    aVar.mo42929b(ToolbarItemEnum.getToolbarItemEnumByName(sheetToolbarItem.getId()));
                }
            }
        }
    }

    /* renamed from: a */
    public C11248b onCreateViewHolder(ViewGroup viewGroup, int i) {
        ToolbarItemView toolbarItemView = new ToolbarItemView(viewGroup.getContext());
        toolbarItemView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new C11248b(toolbarItemView);
    }

    /* renamed from: a */
    public void onBindViewHolder(C11248b bVar, final int i) {
        float f;
        int i2;
        if (bVar.itemView instanceof ToolbarItemView) {
            final ToolbarItemView toolbarItemView = (ToolbarItemView) bVar.itemView;
            SheetInputData.SheetToolbarItem sheetToolbarItem = this.f30260b.get(i);
            final ToolbarItemEnum valueOf = ToolbarItemEnum.valueOf(sheetToolbarItem.getId());
            ViewGroup.LayoutParams layoutParams = toolbarItemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = ((C13749l.m55736a() - toolbarItemView.getResources().getDimensionPixelSize(R.dimen.sheet_toolbar_first_item_margin_start)) - toolbarItemView.getResources().getDimensionPixelSize(R.dimen.sheet_toolbar_shortcut_width)) / 6;
                toolbarItemView.setLayoutParams(layoutParams);
            }
            toolbarItemView.setIconDrawable(toolbarItemView.getContext().getDrawable(valueOf.iconRes));
            if (valueOf.adminLimit) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            toolbarItemView.setAlpha(f);
            if (valueOf.adminLimit) {
                toolbarItemView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                    /* class com.bytedance.ee.bear.sheet.inputbar.toolbar.C11244a.C112451 */

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                    /* renamed from: a */
                    public void mo16698a(View view) {
                        Toast.showText(toolbarItemView.getContext(), (int) R.string.CreationMobile_ECM_AdminDisableToast);
                    }
                });
                return;
            }
            boolean z = false;
            if (sheetToolbarItem.isBadged()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            toolbarItemView.setBadgeVisibility(i2);
            if (i == this.f30261c && valueOf.selectable) {
                z = true;
            }
            toolbarItemView.setSelected(z);
            toolbarItemView.setTag(sheetToolbarItem.getId());
            toolbarItemView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.sheet.inputbar.toolbar.C11244a.C112462 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    C13630j.m55310a(toolbarItemView.getContext(), 10, 50);
                    C11244a.this.mo43112a(i);
                    if (C11244a.this.f30259a != null) {
                        C11244a.this.f30259a.mo42928a(valueOf);
                    }
                }
            });
        }
    }
}
