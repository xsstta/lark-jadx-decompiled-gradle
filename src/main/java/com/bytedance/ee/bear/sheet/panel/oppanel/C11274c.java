package com.bytedance.ee.bear.sheet.panel.oppanel;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a;
import com.bytedance.ee.bear.sheet.panel.panelcell.SheetColorView;
import com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView;
import com.bytedance.ee.bear.sheet.panel.panelcell.SheetRegulatorView;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.panel.oppanel.c */
public class C11274c extends RecyclerView.Adapter<C11275a> {

    /* renamed from: a */
    private SheetItem[] f30315a;

    /* renamed from: b */
    private AbstractC11276b f30316b;

    /* renamed from: c */
    private AbstractC11286a.AbstractC11287a f30317c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.panel.oppanel.c$b */
    public interface AbstractC11276b {
        boolean showBadge(String str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        SheetItem[] sheetItemArr = this.f30315a;
        if (sheetItemArr == null) {
            return 0;
        }
        return sheetItemArr.length;
    }

    /* renamed from: a */
    public void mo43217a(AbstractC11276b bVar) {
        this.f30316b = bVar;
    }

    /* renamed from: a */
    public void mo43218a(AbstractC11286a.AbstractC11287a aVar) {
        this.f30317c = aVar;
    }

    /* renamed from: a */
    public void mo43219a(SheetItem[] sheetItemArr) {
        this.f30315a = sheetItemArr;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        OperationEnum valueOf = OperationEnum.valueOf(this.f30315a[i].getId());
        if (valueOf == OperationEnum.foreColor || valueOf == OperationEnum.backColor) {
            return 1;
        }
        if (valueOf == OperationEnum.fontSize) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.panel.oppanel.c$a */
    public class C11275a extends RecyclerView.ViewHolder {
        C11275a(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public C11275a onCreateViewHolder(ViewGroup viewGroup, int i) {
        SheetListItemView sheetListItemView;
        if (i == 1) {
            sheetListItemView = new SheetColorView(viewGroup.getContext());
        } else if (i != 2) {
            sheetListItemView = new SheetListItemView(viewGroup.getContext());
        } else {
            sheetListItemView = new SheetRegulatorView(viewGroup.getContext());
        }
        sheetListItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new C11275a(sheetListItemView);
    }

    /* renamed from: a */
    public void onBindViewHolder(C11275a aVar, int i) {
        Drawable drawable;
        boolean z;
        AbstractC11276b bVar;
        SheetListItemView sheetListItemView = (SheetListItemView) aVar.itemView;
        SheetItem sheetItem = this.f30315a[i];
        sheetListItemView.setContentDescription(sheetItem.getId());
        int i2 = OperationEnum.valueOf(sheetItem.getId()).iconResId;
        Drawable drawable2 = null;
        if (i2 != -1) {
            drawable = sheetListItemView.getContext().getDrawable(i2);
        } else {
            drawable = null;
        }
        sheetListItemView.setIcon(drawable);
        sheetListItemView.setShowNext(OperationEnum.valueOf(sheetItem.getId()).hasNext);
        if (!sheetItem.isEnable() || (bVar = this.f30316b) == null || !bVar.showBadge(sheetItem.getId())) {
            z = false;
        } else {
            z = true;
        }
        sheetListItemView.mo43223a(z);
        sheetListItemView.setClickListener(this.f30317c);
        if (TextUtils.equals(sheetItem.getId(), OperationEnum.borderLine.name())) {
            drawable2 = sheetListItemView.getContext().getDrawable(R.drawable.ud_icon_borders_outlined);
        }
        sheetListItemView.setIndicator(drawable2);
        sheetListItemView.mo43222a(sheetItem);
    }
}
