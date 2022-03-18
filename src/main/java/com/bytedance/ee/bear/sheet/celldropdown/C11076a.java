package com.bytedance.ee.bear.sheet.celldropdown;

import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.sheet.celldropdown.DropdownData;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.ee.util.ui.ColorUtils;
import com.larksuite.suite.R;
import java.util.Arrays;

/* renamed from: com.bytedance.ee.bear.sheet.celldropdown.a */
public class C11076a extends RecyclerView.Adapter<C11078b> {

    /* renamed from: a */
    public AbstractC11077a f29755a;

    /* renamed from: b */
    private DropdownData.C11072a[] f29756b;

    /* renamed from: c */
    private String f29757c;

    /* renamed from: com.bytedance.ee.bear.sheet.celldropdown.a$a */
    public interface AbstractC11077a {
        void onItemSelected(String str);
    }

    /* renamed from: a */
    private boolean m46051a() {
        DropdownData.C11072a[] aVarArr = this.f29756b;
        if (aVarArr == null || aVarArr.length == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (m46051a()) {
            return 1;
        }
        return this.f29756b.length;
    }

    /* renamed from: a */
    public void mo42224a(AbstractC11077a aVar) {
        this.f29755a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return !m46051a();
    }

    /* renamed from: a */
    public void mo42226a(DropdownData.C11072a[] aVarArr, String str) {
        if (!Arrays.deepEquals(this.f29756b, aVarArr)) {
            this.f29756b = aVarArr;
            this.f29757c = str;
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.celldropdown.a$b */
    public class C11078b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        View f29758a;

        /* renamed from: b */
        TextView f29759b;

        /* renamed from: c */
        ImageView f29760c;

        /* renamed from: d */
        View f29761d;

        C11078b(View view) {
            super(view);
            this.f29758a = view;
            this.f29759b = (TextView) view.findViewById(R.id.tv_spinner_item);
            this.f29760c = (ImageView) view.findViewById(R.id.iv_selected_item);
            this.f29761d = view.findViewById(R.id.view_divider);
            this.f29758a.setOnClickListener(new AbstractView$OnClickListenerC11839e(C11076a.this) {
                /* class com.bytedance.ee.bear.sheet.celldropdown.C11076a.C11078b.C110791 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    Object tag = view.getTag();
                    if ((tag instanceof DropdownData.C11072a) && C11076a.this.f29755a != null) {
                        C11076a.this.f29755a.onItemSelected(((DropdownData.C11072a) tag).mo42209b());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public C11078b onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if (i == 0) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sheet_cell_dropdown_empty, viewGroup, false);
        } else {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sheet_cell_dropdown_item, viewGroup, false);
        }
        return new C11078b(view);
    }

    /* renamed from: a */
    public void onBindViewHolder(C11078b bVar, int i) {
        int i2;
        boolean z = true;
        if (getItemViewType(i) == 1) {
            DropdownData.C11072a aVar = this.f29756b[i];
            bVar.f29759b.setText(aVar.mo42209b());
            if (!TextUtils.isEmpty(aVar.mo42208a())) {
                bVar.f29759b.setBackground(bVar.f29758a.getContext().getDrawable(R.drawable.sheet_cell_dropdown_item_text_bg));
                bVar.f29759b.setBackgroundTintList(ColorStateList.valueOf(ColorUtils.m55697a(aVar.mo42208a())));
            } else {
                bVar.f29759b.setBackground(null);
            }
            if (this.f29757c == null) {
                bVar.f29759b.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(bVar.f29759b.getContext(), R.color.text_title)));
            } else {
                bVar.f29759b.setTextColor(ColorUtils.m55697a(this.f29757c));
            }
            ImageView imageView = bVar.f29760c;
            int i3 = 0;
            if (aVar.mo42210c()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            bVar.f29758a.setTag(aVar);
            if (i != this.f29756b.length - 1) {
                z = false;
            }
            ViewGroup.LayoutParams layoutParams = bVar.itemView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z) {
                    i3 = C13749l.m55750b(bVar.itemView.getContext(), R.dimen.space_kit_len_32);
                }
                marginLayoutParams.bottomMargin = i3;
                bVar.itemView.setLayoutParams(layoutParams);
            }
        }
    }
}
