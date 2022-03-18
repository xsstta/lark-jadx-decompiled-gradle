package com.bytedance.ee.bear.sheet.toolbar2;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.model.toolbar.ItemV2;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7605c;
import com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.toolbar2.h */
public class C11346h extends AbstractC7605c {

    /* renamed from: c */
    public AbstractC11353b f30490c;

    /* renamed from: com.bytedance.ee.bear.sheet.toolbar2.h$b */
    interface AbstractC11353b extends AbstractC7605c.AbstractC7607b {
        /* renamed from: a */
        void mo43465a(ItemV2 itemV2, String str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.toolbar2.h$5 */
    public static /* synthetic */ class C113515 {

        /* renamed from: a */
        static final /* synthetic */ int[] f30501a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$c[] r0 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11326c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.sheet.toolbar2.C11346h.C113515.f30501a = r0
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$c r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11326c.bold     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11346h.C113515.f30501a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$c r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11326c.italic     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11346h.C113515.f30501a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$c r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11326c.underline     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11346h.C113515.f30501a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$c r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11326c.strikethrough     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.toolbar2.C11346h.C113515.<clinit>():void");
        }
    }

    public C11346h(ItemV2[] itemV2Arr) {
        super(itemV2Arr);
    }

    /* renamed from: a */
    public void mo43464a(AbstractC11353b bVar) {
        this.f30490c = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.toolbar2.h$a */
    public static class C11352a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        UDButton f30502a;

        /* renamed from: b */
        TextView f30503b;

        /* renamed from: c */
        UDButton f30504c;

        C11352a(View view) {
            super(view);
            this.f30502a = (UDButton) view.findViewById(R.id.textSizeMinus);
            this.f30503b = (TextView) view.findViewById(R.id.textSize);
            this.f30504c = (UDButton) view.findViewById(R.id.textSizePlus);
        }
    }

    /* renamed from: a */
    private int m47104a(ItemIdV2 itemIdV2) {
        if (!(itemIdV2 instanceof SheetBlockPrimaryItemId.EnumC11326c)) {
            return 0;
        }
        int i = C113515.f30501a[((SheetBlockPrimaryItemId.EnumC11326c) itemIdV2).ordinal()];
        if (i == 1) {
            return R.drawable.ud_icon_bold_outlined;
        }
        if (i == 2) {
            return R.drawable.ud_icon_italic_outlined;
        }
        if (i == 3) {
            return R.drawable.ud_icon_underline_outlined;
        }
        if (i != 4) {
            return 0;
        }
        return R.drawable.ud_icon_horizontal_line_outlined;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f20633a == null) {
            return 0;
        }
        ItemV2 itemV2 = this.f20633a[i];
        if (SheetBlockPrimaryItemId.EnumC11326c.separator.name().equals(itemV2.getId())) {
            return 1;
        }
        if (SheetBlockPrimaryItemId.EnumC11326c.foreColor.name().equals(itemV2.getId())) {
            return 4;
        }
        if (SheetBlockPrimaryItemId.EnumC11326c.fontSize.name().equals(itemV2.getId())) {
            return 3;
        }
        return 0;
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7605c, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(viewHolder instanceof AbstractC7605c.C7606a) && this.f20633a != null) {
            ItemV2 itemV2 = this.f20633a[i];
            if (viewHolder instanceof AbstractC7605c.C7608c) {
                m47105a((AbstractC7605c.C7608c) viewHolder, itemV2);
            } else if (viewHolder instanceof AbstractC7605c.C7609d) {
                m47106a((AbstractC7605c.C7609d) viewHolder, itemV2);
            } else if (viewHolder instanceof C11352a) {
                m47107a((C11352a) viewHolder, itemV2);
            }
        }
    }

    /* renamed from: a */
    private void m47105a(AbstractC7605c.C7608c cVar, final ItemV2 itemV2) {
        boolean z;
        Drawable drawable;
        cVar.f20635a.setImageResource(m47104a(itemV2.id()));
        cVar.f20635a.setImageTintList(cVar.f20635a.getResources().getColorStateList(R.color.toolbar_item_tint));
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
            /* class com.bytedance.ee.bear.sheet.toolbar2.C11346h.C113471 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C11346h.this.f30490c != null) {
                    C11346h.this.f30490c.onItemClicked(itemV2);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new AbstractC7605c.C7606a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_sub_toolbar_item_divider, viewGroup, false));
        }
        if (i == 4) {
            return new AbstractC7605c.C7609d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_sub_toolbar_item_text_color, viewGroup, false));
        }
        if (i == 3) {
            return new C11352a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sheet_sub_toolbar_item_text_size, viewGroup, false));
        }
        return new AbstractC7605c.C7608c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_sub_toolbar_item_horizontal, viewGroup, false));
    }

    /* renamed from: a */
    private void m47106a(AbstractC7605c.C7609d dVar, final ItemV2 itemV2) {
        boolean z;
        try {
            int a = mo29934a(itemV2.getValue(), dVar.itemView.getResources().getColor(R.color.space_kit_n800));
            if (a == -1) {
                dVar.f20636a.setBackground(dVar.itemView.getResources().getDrawable(R.drawable.space_kit_rect_border));
            } else {
                dVar.f20636a.setBackgroundColor(a);
            }
            dVar.f20637b.setImageResource(R.drawable.ud_icon_style_fontcolor_outlined);
            View view = dVar.itemView;
            if (!itemV2.isEnable() || !itemV2.isSelected()) {
                z = false;
            } else {
                z = true;
            }
            view.setSelected(z);
            dVar.itemView.setEnabled(itemV2.isEnable());
            dVar.itemView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.sheet.toolbar2.C11346h.C113482 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    if (C11346h.this.f30490c != null) {
                        C11346h.this.f30490c.onItemClicked(itemV2);
                    }
                }
            });
        } catch (Throwable th) {
            C13479a.m54761a("SheetTextAttrAdapter", th);
        }
    }

    /* renamed from: a */
    private void m47107a(final C11352a aVar, final ItemV2 itemV2) {
        String str;
        if (TextUtils.isEmpty(itemV2.getValue())) {
            str = "10";
        } else {
            str = itemV2.getValue();
        }
        aVar.f30503b.setText(str);
        mo43463a(aVar, itemV2, str);
        aVar.f30502a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.sheet.toolbar2.C11346h.C113493 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                String str;
                if (C11346h.this.f30490c != null) {
                    CharSequence text = aVar.f30503b.getText();
                    ItemV2 itemV2 = itemV2;
                    if (text == null) {
                        str = "";
                    } else {
                        str = text.toString();
                    }
                    String nextValueInList = itemV2.nextValueInList(str, false);
                    aVar.f30503b.setText(nextValueInList);
                    C11346h.this.mo43463a(aVar, itemV2, nextValueInList);
                    C11346h.this.f30490c.mo43465a(itemV2, nextValueInList);
                }
            }
        });
        aVar.f30504c.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.sheet.toolbar2.C11346h.C113504 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                String str;
                if (C11346h.this.f30490c != null) {
                    CharSequence text = aVar.f30503b.getText();
                    ItemV2 itemV2 = itemV2;
                    if (text == null) {
                        str = "";
                    } else {
                        str = text.toString();
                    }
                    String nextValueInList = itemV2.nextValueInList(str, true);
                    aVar.f30503b.setText(nextValueInList);
                    C11346h.this.mo43463a(aVar, itemV2, nextValueInList);
                    C11346h.this.f30490c.mo43465a(itemV2, nextValueInList);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo43463a(C11352a aVar, ItemV2 itemV2, String str) {
        int i;
        int valueIndexInList = itemV2.valueIndexInList(str);
        if (itemV2.getList() == null) {
            i = 0;
        } else {
            i = itemV2.getList().length;
        }
        if (valueIndexInList == 0) {
            aVar.f30502a.setEnabled(false);
            aVar.f30504c.setEnabled(true);
        } else if (i == 0 || valueIndexInList != i - 1) {
            aVar.f30502a.setEnabled(true);
            aVar.f30504c.setEnabled(true);
        } else {
            aVar.f30502a.setEnabled(true);
            aVar.f30504c.setEnabled(false);
        }
    }
}
