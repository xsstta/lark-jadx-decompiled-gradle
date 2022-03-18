package com.bytedance.ee.bear.sheet.borderline;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.borderline.c */
public class C11063c extends RecyclerView.Adapter<C11066b> {

    /* renamed from: a */
    public String[] f29725a;

    /* renamed from: b */
    public AbstractC11065a f29726b;

    /* renamed from: c */
    private String f29727c;

    /* renamed from: com.bytedance.ee.bear.sheet.borderline.c$a */
    public interface AbstractC11065a {
        void onBorderStyleSelected(String str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        String[] strArr = this.f29725a;
        if (strArr == null) {
            return 0;
        }
        return strArr.length;
    }

    /* renamed from: a */
    public void mo42148a(AbstractC11065a aVar) {
        this.f29726b = aVar;
    }

    /* renamed from: a */
    public void mo42150a(String[] strArr, String str) {
        this.f29725a = strArr;
        this.f29727c = str;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.borderline.c$b */
    public class C11066b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f29730a;

        C11066b(View view) {
            super(view);
            this.f29730a = (ImageView) view.findViewById(R.id.border_style_icon);
        }
    }

    /* renamed from: a */
    public C11066b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C11066b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sheet_border_style_item, (ViewGroup) null));
    }

    /* renamed from: a */
    public void onBindViewHolder(C11066b bVar, int i) {
        final String str = this.f29725a[i];
        if (!TextUtils.isEmpty(str)) {
            bVar.f29730a.setImageDrawable(bVar.itemView.getContext().getResources().getDrawable(BorderStyleEnum.valueOf(str).iconRes));
            bVar.itemView.setSelected(TextUtils.equals(str, this.f29727c));
            bVar.itemView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.sheet.borderline.C11063c.C110641 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    C11063c cVar = C11063c.this;
                    cVar.mo42150a(cVar.f29725a, str);
                    if (C11063c.this.f29726b != null) {
                        C11063c.this.f29726b.onBorderStyleSelected(str);
                    }
                }
            });
        }
    }
}
