package com.bytedance.ee.bear.sheet.toolbar2;

import android.content.Context;
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
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.toolbar2.c */
public class C11332c extends AbstractC7605c {

    /* renamed from: c */
    public int f30460c = -1;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.toolbar2.c$2 */
    public static /* synthetic */ class C113342 {

        /* renamed from: a */
        static final /* synthetic */ int[] f30463a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$b[] r0 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11325b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.sheet.toolbar2.C11332c.C113342.f30463a = r0
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$b r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11325b.merge     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11332c.C113342.f30463a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$b r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11325b.autoWrap     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11332c.C113342.f30463a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$b r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11325b.overflow     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11332c.C113342.f30463a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$b r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11325b.clip     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11332c.C113342.f30463a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$b r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11325b.borderLine     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11332c.C113342.f30463a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId$b r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.EnumC11325b.backColor     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.toolbar2.C11332c.C113342.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.ee.bear.sheet.toolbar2.c$c */
    static class C11337c extends RecyclerView.ViewHolder {
        C11337c(View view) {
            super(view);
        }
    }

    public C11332c(ItemV2[] itemV2Arr) {
        super(itemV2Arr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.toolbar2.c$a */
    public static class C11335a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        View f30464a;

        /* renamed from: b */
        TextView f30465b;

        /* renamed from: c */
        ImageView f30466c;

        C11335a(View view) {
            super(view);
            this.f30464a = view.findViewById(R.id.itemRectColor);
            this.f30465b = (TextView) view.findViewById(R.id.itemDesc);
            ImageView imageView = (ImageView) view.findViewById(R.id.itemIcon);
            this.f30466c = imageView;
            C13747j.m55728a(imageView, (int) R.color.icon_n1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.toolbar2.c$b */
    public static class C11336b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f30467a;

        /* renamed from: b */
        TextView f30468b;

        C11336b(View view) {
            super(view);
            this.f30467a = (ImageView) view.findViewById(R.id.itemIcon);
            this.f30468b = (TextView) view.findViewById(R.id.itemDesc);
            C13747j.m55728a(this.f30467a, (int) R.color.icon_n1);
        }
    }

    /* renamed from: a */
    private int m47072a(ItemIdV2 itemIdV2) {
        if (!(itemIdV2 instanceof SheetBlockPrimaryItemId.EnumC11325b)) {
            return 0;
        }
        int i = C113342.f30463a[((SheetBlockPrimaryItemId.EnumC11325b) itemIdV2).ordinal()];
        if (i == 1) {
            return R.drawable.ud_icon_mergecells_outlined;
        }
        if (i == 2) {
            return R.drawable.ud_icon_wrap_outlined;
        }
        if (i == 3) {
            return R.drawable.ud_icon_wrapping_outlined;
        }
        if (i == 4) {
            return R.drawable.ud_icon_clip_outlined;
        }
        if (i != 5) {
            return 0;
        }
        return R.drawable.ud_icon_borders_outlined;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f20633a == null) {
            return 0;
        }
        ItemV2 itemV2 = this.f20633a[i];
        if (SheetBlockPrimaryItemId.EnumC11325b.separator.name().equals(itemV2.getId())) {
            return 2;
        }
        if (SheetBlockPrimaryItemId.EnumC11325b.backColor.name().equals(itemV2.getId())) {
            return 5;
        }
        return 0;
    }

    /* renamed from: a */
    private void m47074a(TextView textView) {
        boolean z;
        int i;
        if (this.f30460c == -1) {
            Context context = textView.getContext();
            ItemV2[] itemV2Arr = this.f20633a;
            int length = itemV2Arr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                ItemV2 itemV2 = itemV2Arr[i2];
                if (SheetBlockPrimaryItemId.EnumC11325b.merge.name().equals(itemV2.getId())) {
                    z = itemV2.isSelected();
                    break;
                }
                i2++;
            }
            String[] strArr = new String[5];
            if (z) {
                i = R.string.Doc_Doc_ToolbarCellSplit;
            } else {
                i = R.string.Doc_Doc_ToolbarCellMerge;
            }
            strArr[0] = context.getString(i);
            strArr[1] = context.getString(R.string.Doc_Doc_ToolbarCellAutoWrap);
            strArr[2] = context.getString(R.string.Doc_Doc_ToolbarCellOverflow);
            strArr[3] = context.getString(R.string.Doc_Doc_ToolbarCellClip);
            strArr[4] = context.getString(R.string.Doc_Doc_ToolbarCellBgColor);
            String str = "";
            for (int i3 = 0; i3 < 5; i3++) {
                String str2 = strArr[i3];
                if (!TextUtils.isEmpty(str2) && str2.length() > str.length()) {
                    str = str2;
                }
            }
            this.f30460c = (int) textView.getPaint().measureText(str);
        }
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7605c, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(viewHolder instanceof C11337c) && this.f20633a != null) {
            final ItemV2 itemV2 = this.f20633a[i];
            if (viewHolder instanceof C11336b) {
                m47076a((C11336b) viewHolder, itemV2, i);
            } else if (viewHolder instanceof C11335a) {
                m47075a((C11335a) viewHolder, itemV2, i);
            }
            viewHolder.itemView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.sheet.toolbar2.C11332c.C113331 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    if (C11332c.this.f20634b != null) {
                        if (SheetBlockPrimaryItemId.EnumC11325b.merge.name().equals(itemV2.getId())) {
                            C11332c.this.f30460c = -1;
                        }
                        C11332c.this.f20634b.onItemClicked(itemV2);
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return new C11337c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sheet_sub_toolbar_item_divider_horizontal, viewGroup, false));
        }
        if (i == 5) {
            return new C11335a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sheet_sub_toolbar_item_cell_attr_bg, viewGroup, false));
        }
        return new C11336b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sheet_sub_toolbar_item_cell_attr, viewGroup, false));
    }

    /* renamed from: a */
    private String m47073a(RecyclerView.ViewHolder viewHolder, ItemV2 itemV2) {
        int i;
        if (!(itemV2.id() instanceof SheetBlockPrimaryItemId.EnumC11325b)) {
            return "";
        }
        switch (C113342.f30463a[((SheetBlockPrimaryItemId.EnumC11325b) itemV2.id()).ordinal()]) {
            case 1:
                if (itemV2.isSelected()) {
                    i = R.string.Doc_Doc_ToolbarCellSplit;
                } else {
                    i = R.string.Doc_Doc_ToolbarCellMerge;
                }
                return viewHolder.itemView.getResources().getString(i);
            case 2:
                return viewHolder.itemView.getResources().getString(R.string.Doc_Doc_ToolbarCellAutoWrap);
            case 3:
                return viewHolder.itemView.getResources().getString(R.string.Doc_Doc_ToolbarCellOverflow);
            case 4:
                return viewHolder.itemView.getResources().getString(R.string.Doc_Doc_ToolbarCellClip);
            case 5:
                return viewHolder.itemView.getResources().getString(R.string.Doc_Doc_ToolbarCellBorderLine);
            case 6:
                return viewHolder.itemView.getResources().getString(R.string.Doc_Doc_ToolbarCellBgColor);
            default:
                return "";
        }
    }

    /* renamed from: a */
    private void m47075a(C11335a aVar, ItemV2 itemV2, int i) {
        int i2;
        aVar.f30465b.setText(m47073a(aVar, itemV2));
        if (!itemV2.isEnable()) {
            i2 = R.color.text_disable;
        } else if (itemV2.isSelected()) {
            i2 = R.color.primary_pri_500;
        } else {
            i2 = R.color.text_title;
        }
        aVar.f30465b.setTextColor(aVar.f30465b.getResources().getColor(i2));
        m47074a(aVar.f30465b);
        aVar.f30465b.setWidth(this.f30460c);
        int a = mo29933a(itemV2.getValue());
        if (a == Integer.MIN_VALUE) {
            aVar.f30464a.setBackground(aVar.itemView.getResources().getDrawable(R.drawable.space_kit_rect_border));
            return;
        }
        aVar.f30464a.setBackgroundColor(a);
    }

    /* renamed from: a */
    private void m47076a(C11336b bVar, ItemV2 itemV2, int i) {
        boolean z;
        int i2;
        View view = bVar.itemView;
        boolean z2 = true;
        if (!itemV2.isEnable() || !itemV2.isSelected()) {
            z = false;
        } else {
            z = true;
        }
        view.setSelected(z);
        bVar.itemView.setEnabled(itemV2.isEnable());
        bVar.f30467a.setImageTintList(bVar.f30467a.getResources().getColorStateList(R.color.toolbar_item_tint));
        bVar.f30467a.setImageResource(m47072a(itemV2.id()));
        ImageView imageView = bVar.f30467a;
        if (!itemV2.isEnable() || !itemV2.isSelected()) {
            z2 = false;
        }
        imageView.setSelected(z2);
        bVar.f30467a.setEnabled(itemV2.isEnable());
        bVar.f30468b.setText(m47073a(bVar, itemV2));
        m47074a(bVar.f30468b);
        bVar.f30468b.setWidth(this.f30460c);
        if (!itemV2.isEnable()) {
            i2 = R.color.text_disable;
        } else if (itemV2.isSelected()) {
            i2 = R.color.primary_pri_500;
        } else {
            i2 = R.color.text_title;
        }
        bVar.f30468b.setTextColor(bVar.f30468b.getResources().getColor(i2));
    }
}
