package com.ss.android.lark.base.adapter;

import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class LarkRecyclerViewBaseAdapter<VH extends RecyclerView.ViewHolder, Data> extends RecyclerView.Adapter<VH> {
    public List<Data> items = new ArrayList();

    public List<Data> getItems() {
        return this.items;
    }

    /* renamed from: com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter$a */
    public class C29526a extends C1374g.AbstractC1376a {

        /* renamed from: b */
        private List<Data> f73818b;

        /* renamed from: c */
        private List<Data> f73819c;

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public boolean mo7383b(int i, int i2) {
            return true;
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public int mo7380a() {
            return this.f73818b.size();
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public int mo7382b() {
            return this.f73819c.size();
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public boolean mo7381a(int i, int i2) {
            return this.f73818b.get(i).equals(this.f73819c.get(i2));
        }

        public C29526a(List<Data> list, List<Data> list2) {
            this.f73818b = list;
            this.f73819c = list2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    public LarkRecyclerViewBaseAdapter() {
        setHasStableIds(true);
    }

    public void clear() {
        this.items.clear();
        notifyDataSetChanged();
    }

    public void addAll(Data... dataArr) {
        addAll(Arrays.asList(dataArr));
    }

    public int getIndex(Data data) {
        return this.items.indexOf(data);
    }

    public Data getItem(int i) {
        return this.items.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return (long) getItem(i).hashCode();
    }

    public void notifyItemChanged(Data data) {
        notifyItemChanged(this.items.indexOf(data));
    }

    public void add(Data data) {
        getItems().add(data);
        notifyItemInserted(getItems().size() - 1);
    }

    public void addAll(Collection<? extends Data> collection) {
        if (collection != null && collection != null && !collection.isEmpty()) {
            this.items.addAll(collection);
            notifyDataSetChanged();
        }
    }

    public void resetAll(Collection<? extends Data> collection) {
        this.items.clear();
        if (collection != null && !collection.isEmpty()) {
            this.items.addAll(collection);
        }
        notifyDataSetChanged();
    }

    public void diff(Collection<? extends Data> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (this.items.size() == 0) {
            this.items.addAll(arrayList);
            notifyDataSetChanged();
            return;
        }
        C1374g.m6298a(new C29526a(this.items, arrayList), false).mo7412a(this);
        this.items.clear();
        this.items.addAll(arrayList);
    }

    public void remove(Data data) {
        if (getItems().contains(data)) {
            int indexOf = getItems().indexOf(data);
            getItems().remove(data);
            notifyItemRemoved(indexOf);
        }
    }

    public void add(int i, Data data) {
        this.items.add(i, data);
        notifyDataSetChanged();
    }

    public void remove(int i, int i2) {
        if (i >= 0 && i2 < getItemCount()) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                remove(getItem(i3));
            }
        }
    }
}
