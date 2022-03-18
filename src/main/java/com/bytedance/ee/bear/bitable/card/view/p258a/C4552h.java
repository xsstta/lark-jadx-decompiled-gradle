package com.bytedance.ee.bear.bitable.card.view.p258a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e;
import com.bytedance.ee.bear.bitable.card.view.record.DeleteViewHolder;
import com.bytedance.ee.bear.bitable.card.viewmodel.C4771b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.C13655e;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.a.h */
public class C4552h extends AbstractC4540a implements DeleteViewHolder.IDeleteDelegate {

    /* renamed from: g */
    protected String f13395g = "BaseCellAdapter";

    /* renamed from: h */
    private final int f13396h = C13655e.m55411a(60);

    /* renamed from: i */
    private final RecyclerView f13397i;

    /* renamed from: j */
    private int f13398j = 0;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4540a
    /* renamed from: a */
    public int mo17888a() {
        return R.layout.bitable_cell_title_layout;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4540a, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return super.getItemCount() + 1;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.record.DeleteViewHolder.IDeleteDelegate
    /* renamed from: b */
    public void mo17905b() {
        if (this.f13379d != null) {
            this.f13378c.deleteRecord(this.f13379d.mo17705a(), this.f13379d.mo17707b());
        }
    }

    /* renamed from: c */
    private void m18907c() {
        int i;
        if (this.f13381f == 0) {
            int size = this.f13380e.size();
            int i2 = 0;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f13397i.getLayoutManager();
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int min = Math.min(linearLayoutManager.findLastVisibleItemPosition(), size - 1);
            if (findFirstVisibleItemPosition >= 0) {
                for (int i3 = findFirstVisibleItemPosition; i3 <= min; i3++) {
                    View childAt = linearLayoutManager.getChildAt(i3);
                    if (childAt != null) {
                        i2 += linearLayoutManager.getDecoratedMeasuredHeight(childAt);
                    }
                }
            }
            int measuredHeight = this.f13397i.getMeasuredHeight();
            if (findFirstVisibleItemPosition > 0) {
                i = this.f13396h;
            } else {
                i = Math.max(this.f13396h, (measuredHeight - i2) - C13655e.m55411a(94));
            }
            int i4 = this.f13398j;
            String str = this.f13395g;
            C13479a.m54772d(str, "parent height: " + measuredHeight + "; recycler height: " + i2);
            if (i != i4) {
                C13742g.m55705a(new Runnable(i) {
                    /* class com.bytedance.ee.bear.bitable.card.view.p258a.$$Lambda$h$MOBNQnW8iKLUMKYpVTCtwsvcS1k */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C4552h.lambda$MOBNQnW8iKLUMKYpVTCtwsvcS1k(C4552h.this, this.f$1);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m18909e(int i) {
        if (this.f13398j != i) {
            this.f13398j = i;
            notifyItemChanged(this.f13380e.size());
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4540a, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == getItemCount() - 2) {
            return -2;
        }
        return super.getItemViewType(i);
    }

    /* renamed from: a */
    private void m18906a(View view, C4537a aVar) {
        ((ImageView) view.findViewById(R.id.cell_title_icon)).setImageResource(aVar.mo17829a().mo17752i().iconRes);
        ((TextView) view.findViewById(R.id.cell_title_name)).setText(aVar.mo17829a().mo17750h());
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4540a, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        if (viewHolder instanceof AbstractC4609e) {
            m18906a(viewHolder.itemView, (C4537a) this.f13380e.get(mo17889a(i)));
        } else if (viewHolder instanceof DeleteViewHolder) {
            DeleteViewHolder cVar = (DeleteViewHolder) viewHolder;
            if (this.f13379d == null || !this.f13379d.mo17712f()) {
                z = false;
            } else {
                z = true;
            }
            cVar.mo17904a(z);
            cVar.mo17901a(this.f13398j);
        }
        super.onBindViewHolder(viewHolder, i);
    }

    public C4552h(C4771b bVar, AbstractC4712d dVar, RecyclerView recyclerView) {
        super(bVar, dVar, recyclerView);
        this.f13397i = recyclerView;
        recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.bytedance.ee.bear.bitable.card.view.p258a.$$Lambda$h$shISxzj7tiUuzHSilFWnebhnik4 */

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C4552h.lambda$shISxzj7tiUuzHSilFWnebhnik4(C4552h.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4540a
    /* renamed from: a */
    public RecyclerView.ViewHolder mo17891a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        if (i != -2) {
            return null;
        }
        DeleteViewHolder cVar = new DeleteViewHolder(layoutInflater.inflate(R.layout.bitable_cell_delete_layout, viewGroup, false));
        cVar.mo17903a(this);
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m18905a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m18907c();
    }
}
