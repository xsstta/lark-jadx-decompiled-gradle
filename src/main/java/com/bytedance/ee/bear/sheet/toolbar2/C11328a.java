package com.bytedance.ee.bear.sheet.toolbar2;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.model.toolbar.ItemV2;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7605c;
import com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.toolbar2.a */
public class C11328a extends AbstractC7605c {

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.toolbar2.a$2 */
    public static /* synthetic */ class C113302 {

        /* renamed from: a */
        static final /* synthetic */ int[] f30458a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$a[] r0 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11324a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.sheet.toolbar2.C11328a.C113302.f30458a = r0
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$a r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11324a.horizontalLeft     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11328a.C113302.f30458a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$a r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11324a.horizontalCenter     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11328a.C113302.f30458a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$a r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11324a.horizontalRight     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11328a.C113302.f30458a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$a r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11324a.verticalTop     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11328a.C113302.f30458a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$a r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11324a.verticalCenter     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11328a.C113302.f30458a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$a r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11324a.verticalBottom     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.toolbar2.C11328a.C113302.<clinit>():void");
        }
    }

    public C11328a(ItemV2[] itemV2Arr) {
        super(itemV2Arr);
    }

    /* renamed from: a */
    private int m47067a(ItemIdV2 itemIdV2) {
        if (!(itemIdV2 instanceof SheetBlockPrimaryItemId.EnumC11324a)) {
            return 0;
        }
        switch (C113302.f30458a[((SheetBlockPrimaryItemId.EnumC11324a) itemIdV2).ordinal()]) {
            case 1:
                return R.drawable.ud_icon_left_alignment_outlined;
            case 2:
                return R.drawable.ud_icon_center_alignment_outlined;
            case 3:
                return R.drawable.ud_icon_right_alignment_outlined;
            case 4:
                return R.drawable.ud_icon_top_align_outlined;
            case 5:
                return R.drawable.ud_icon_vertical_align_outlined;
            case 6:
                return R.drawable.ud_icon_bottom_align_outlined;
            default:
                return 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            i2 = R.layout.doc_sub_toolbar_item_divider;
        } else {
            i2 = R.layout.doc_sub_toolbar_item_horizontal;
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        if (z) {
            return new AbstractC7605c.C7606a(inflate);
        }
        return new AbstractC7605c.C7608c(inflate);
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7605c, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        Drawable drawable;
        if (!(viewHolder instanceof AbstractC7605c.C7606a) && this.f20633a != null) {
            final ItemV2 itemV2 = this.f20633a[i];
            AbstractC7605c.C7608c cVar = (AbstractC7605c.C7608c) viewHolder;
            cVar.f20635a.setImageTintList(cVar.f20635a.getResources().getColorStateList(R.color.toolbar_item_tint));
            cVar.f20635a.setImageResource(m47067a(itemV2.id()));
            ImageView imageView = cVar.f20635a;
            if (!itemV2.isEnable() || !itemV2.isSelected()) {
                z = false;
            } else {
                z = true;
            }
            imageView.setSelected(z);
            cVar.f20635a.setEnabled(itemV2.isEnable());
            if (itemV2.isEnable()) {
                drawable = cVar.f20635a.getResources().getDrawable(R.drawable.doc_toolbar_v2_subitem_all_selector).mutate();
            } else {
                drawable = null;
            }
            cVar.f20635a.setBackground(drawable);
            cVar.itemView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.sheet.toolbar2.C11328a.C113291 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    if (C11328a.this.f20634b != null) {
                        C11328a.this.f20634b.onItemClicked(itemV2);
                    }
                }
            });
        }
    }
}
