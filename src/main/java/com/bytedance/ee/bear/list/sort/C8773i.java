package com.bytedance.ee.bear.list.sort;

import android.content.Context;
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

/* renamed from: com.bytedance.ee.bear.list.sort.i */
public class C8773i extends RecyclerView.Adapter<C8776b> {

    /* renamed from: a */
    public int f23620a;

    /* renamed from: b */
    public final boolean f23621b;

    /* renamed from: c */
    public AbstractC8775a f23622c;

    /* renamed from: d */
    private Context f23623d;

    /* renamed from: e */
    private final List<SortType> f23624e = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.list.sort.i$a */
    interface AbstractC8775a {
        void onItemClick(int i, SortType rVar);
    }

    /* renamed from: a */
    public List<SortType> mo33823a() {
        return this.f23624e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f23624e.size();
    }

    /* renamed from: a */
    public void mo33824a(int i) {
        this.f23620a = i;
        notifyDataSetChanged();
    }

    public C8773i(boolean z) {
        this.f23621b = z;
    }

    /* renamed from: a */
    public void mo33825a(AbstractC8775a aVar) {
        this.f23622c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.list.sort.i$b */
    public static class C8776b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        LinearLayout f23628a;

        /* renamed from: b */
        TextView f23629b;

        /* renamed from: c */
        ImageView f23630c;

        /* renamed from: d */
        View f23631d;

        C8776b(View view) {
            super(view);
            this.f23628a = (LinearLayout) view.findViewById(R.id.ll_item);
            this.f23629b = (TextView) view.findViewById(R.id.tv_sort);
            this.f23630c = (ImageView) view.findViewById(R.id.iv_sort);
            this.f23631d = view.findViewById(R.id.divider);
        }
    }

    /* renamed from: a */
    public void mo33827a(List<SortType> list) {
        this.f23624e.clear();
        if (list != null && list.size() > 0) {
            this.f23624e.addAll(list);
        }
    }

    /* renamed from: a */
    public C8776b onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.f23623d = context;
        return new C8776b(LayoutInflater.from(context).inflate(R.layout.list_sort_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C8776b bVar, final int i) {
        int i2;
        final SortType rVar = this.f23624e.get(i);
        bVar.f23629b.setText(rVar.mo33842a());
        m36814a(bVar, i, rVar);
        if (this.f23620a == i) {
            bVar.f23629b.setTextColor(this.f23623d.getResources().getColor(R.color.primary_pri_500));
            if (this.f23621b) {
                if (rVar.mo33846c()) {
                    i2 = R.drawable.ud_icon_space_up_bold_outlined;
                } else {
                    i2 = R.drawable.ud_icon_space_down_bold_outlined;
                }
                bVar.f23630c.setImageResource(i2);
                C13747j.m55728a(bVar.f23630c, (int) R.color.primary_pri_500);
            }
        } else {
            bVar.f23629b.setTextColor(this.f23623d.getResources().getColor(R.color.text_title));
            bVar.f23630c.setImageDrawable(null);
        }
        if (i == this.f23624e.size() - 1) {
            bVar.f23631d.setVisibility(8);
        } else {
            bVar.f23631d.setVisibility(0);
        }
        bVar.f23628a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.sort.C8773i.C87741 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8773i.this.f23621b) {
                    if (C8773i.this.f23620a == i) {
                        SortType rVar = rVar;
                        rVar.mo33844a(!rVar.mo33846c());
                    } else {
                        rVar.mo33844a(false);
                    }
                }
                C8773i.this.f23620a = i;
                if (C8773i.this.f23622c != null) {
                    C8773i.this.f23622c.onItemClick(i, rVar);
                }
                C8773i.this.notifyDataSetChanged();
            }
        });
    }

    /* renamed from: a */
    private void m36814a(C8776b bVar, int i, SortType rVar) {
        boolean z;
        boolean z2;
        int i2;
        int itemCount = getItemCount();
        boolean z3 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == itemCount - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            i2 = R.drawable.facade_round_around_m;
        } else if (z) {
            i2 = R.drawable.facade_round_top_m;
        } else if (z2) {
            i2 = R.drawable.facade_round_bottom_m;
        } else {
            i2 = R.drawable.facade_rectangle;
        }
        bVar.itemView.setBackgroundResource(i2);
        bVar.itemView.setBackgroundTintList(this.f23623d.getResources().getColorStateList(R.color.facade_selector_item_body_overlay));
    }
}
