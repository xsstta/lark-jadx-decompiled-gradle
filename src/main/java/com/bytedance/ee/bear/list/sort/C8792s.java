package com.bytedance.ee.bear.list.sort;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.sort.s */
public class C8792s extends RecyclerView.Adapter<C8795b> {

    /* renamed from: a */
    public int f23700a;

    /* renamed from: b */
    public boolean f23701b = true;

    /* renamed from: c */
    public AbstractC8794a f23702c;

    /* renamed from: d */
    private Context f23703d;

    /* renamed from: e */
    private List<SortType> f23704e = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.list.sort.s$a */
    interface AbstractC8794a {
        void onItemClick(int i, SortType rVar);
    }

    /* renamed from: a */
    public List<SortType> mo33852a() {
        return this.f23704e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo33859c() {
        return this.f23700a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f23704e.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public SortType mo33858b() {
        return this.f23704e.get(this.f23700a);
    }

    /* renamed from: a */
    public void mo33853a(int i) {
        this.f23700a = i;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo33854a(AbstractC8794a aVar) {
        this.f23702c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.list.sort.s$b */
    public static class C8795b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        LinearLayout f23708a;

        /* renamed from: b */
        ImageView f23709b;

        /* renamed from: c */
        TextView f23710c;

        C8795b(View view) {
            super(view);
            this.f23708a = (LinearLayout) view.findViewById(R.id.ll_item);
            this.f23709b = (ImageView) view.findViewById(R.id.iv_icon);
            this.f23710c = (TextView) view.findViewById(R.id.tv_name);
        }
    }

    /* renamed from: a */
    public void mo33856a(List<SortType> list) {
        this.f23704e.clear();
        if (list != null && list.size() > 0) {
            this.f23704e.addAll(list);
        }
    }

    /* renamed from: a */
    public void mo33857a(boolean z) {
        this.f23701b = z;
    }

    /* renamed from: a */
    public C8795b onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.f23703d = context;
        return new C8795b(LayoutInflater.from(context).inflate(R.layout.list_filter_sort_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C8795b bVar, final int i) {
        Drawable drawable;
        final SortType rVar = this.f23704e.get(i);
        bVar.f23710c.setText(rVar.mo33842a());
        int i2 = 8;
        if (this.f23700a == i) {
            ImageView imageView = bVar.f23709b;
            if (this.f23701b) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
            bVar.f23710c.setTextColor(this.f23703d.getResources().getColor(R.color.primary_pri_500));
            bVar.f23708a.setBackgroundResource(R.drawable.list_edit_filter_selected_bg);
            ImageView imageView2 = bVar.f23709b;
            if (rVar.mo33846c()) {
                drawable = this.f23703d.getDrawable(R.drawable.ud_icon_space_up_outlined);
            } else {
                drawable = this.f23703d.getDrawable(R.drawable.ud_icon_space_down_outlined);
            }
            imageView2.setBackground(drawable);
            C13747j.m55726a((View) bVar.f23709b, (int) R.color.primary_pri_500);
        } else {
            bVar.f23709b.setVisibility(8);
            bVar.f23710c.setTextColor(this.f23703d.getResources().getColor(R.color.text_caption));
            bVar.f23708a.setBackgroundResource(R.drawable.list_edit_filter_default_bg);
            bVar.f23709b.setBackground(null);
        }
        bVar.f23708a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.sort.C8792s.C87931 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8792s.this.f23701b) {
                    if (C8792s.this.f23700a == i) {
                        SortType rVar = rVar;
                        rVar.mo33844a(!rVar.mo33846c());
                    } else {
                        rVar.mo33844a(false);
                    }
                }
                C8792s.this.f23700a = i;
                if (C8792s.this.f23702c != null) {
                    C8792s.this.f23702c.onItemClick(i, rVar);
                }
                C8792s.this.notifyDataSetChanged();
            }
        });
    }
}
