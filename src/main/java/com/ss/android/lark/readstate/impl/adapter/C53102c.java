package com.ss.android.lark.readstate.impl.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.readstate.impl.detail.C53123f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.readstate.impl.adapter.c */
public class C53102c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private SparseArray<IBinder> f131318a = new SparseArray<>(4);

    /* renamed from: b */
    private List<C53123f> f131319b = new ArrayList();

    /* renamed from: c */
    private Context f131320c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f131319b.size();
    }

    /* renamed from: a */
    public void mo181381a() {
        this.f131319b.clear();
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo181383b(List<C53123f> list) {
        this.f131319b.clear();
        this.f131319b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo181382a(List<C53123f> list) {
        this.f131319b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.f131319b.get(i).f131382g;
        if (i2 == 5 || i2 == 6) {
            return 2;
        }
        if (i2 != 8) {
            return 1;
        }
        return 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f131318a.get(i).mo181379b(this.f131320c, viewGroup);
    }

    public C53102c(Context context, String str) {
        this.f131320c = context;
        this.f131318a.put(1, new ChatterBinder(str));
        this.f131318a.put(2, new ShowTipBinder());
        this.f131318a.put(3, new SectionTipBinder());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C53123f fVar = this.f131319b.get(i);
        IBinder bVar = this.f131318a.get(getItemViewType(i));
        boolean z = true;
        if (i != getItemCount() - 1) {
            z = false;
        }
        bVar.mo181377a(viewHolder, fVar, z);
    }
}
