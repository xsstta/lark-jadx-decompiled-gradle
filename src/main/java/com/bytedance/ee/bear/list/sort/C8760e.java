package com.bytedance.ee.bear.list.sort;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.sort.e */
public class C8760e extends RecyclerView.Adapter<C8763b> {

    /* renamed from: a */
    public int f23612a;

    /* renamed from: b */
    public AbstractC8762a f23613b;

    /* renamed from: c */
    private Context f23614c;

    /* renamed from: d */
    private List<FilterType> f23615d = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.list.sort.e$a */
    interface AbstractC8762a {
        void onItemClick(int i, FilterType filterType);
    }

    /* renamed from: a */
    public List<FilterType> mo33806a() {
        return this.f23615d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo33812c() {
        return this.f23612a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f23615d.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public FilterType mo33811b() {
        return this.f23615d.get(this.f23612a);
    }

    /* renamed from: a */
    public void mo33807a(int i) {
        this.f23612a = i;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.list.sort.e$b */
    public static class C8763b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f23619a;

        C8763b(View view) {
            super(view);
            this.f23619a = (TextView) view.findViewById(R.id.tv_item);
        }
    }

    /* renamed from: a */
    public void mo33808a(AbstractC8762a aVar) {
        this.f23613b = aVar;
    }

    /* renamed from: a */
    public void mo33810a(List<FilterType> list) {
        this.f23615d.clear();
        if (list != null && list.size() > 0) {
            this.f23615d.addAll(list);
        }
    }

    /* renamed from: a */
    public C8763b onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.f23614c = context;
        return new C8763b(LayoutInflater.from(context).inflate(R.layout.list_filter_type_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C8763b bVar, final int i) {
        final FilterType filterType = this.f23615d.get(i);
        bVar.f23619a.setText(filterType.getResId());
        if (this.f23612a == i) {
            bVar.f23619a.setTextColor(this.f23614c.getResources().getColor(R.color.primary_pri_500));
            bVar.f23619a.setBackgroundResource(R.drawable.list_edit_filter_selected_bg);
        } else {
            bVar.f23619a.setTextColor(this.f23614c.getResources().getColor(R.color.text_caption));
            bVar.f23619a.setBackgroundResource(R.drawable.list_edit_filter_default_bg);
        }
        bVar.f23619a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.sort.C8760e.C87611 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C8760e.this.f23612a = i;
                if (C8760e.this.f23613b != null) {
                    C8760e.this.f23613b.onItemClick(i, filterType);
                }
                C8760e.this.notifyDataSetChanged();
            }
        });
    }
}
