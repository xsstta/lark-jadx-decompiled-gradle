package com.ss.android.lark.widget.recyclerview;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.recyclerview.AbstractC58983c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.widget.recyclerview.d */
public class C58984d<Value, A extends RecyclerView.Adapter & AbstractC58983c<Value>> extends RecyclerView.AdapterDataObserver {

    /* renamed from: a */
    private Map<Integer, Value> f146167a = new LinkedHashMap();

    /* renamed from: b */
    private SparseArray<Value> f146168b = new SparseArray<>();

    /* renamed from: c */
    A f146169c;

    /* renamed from: d */
    private boolean f146170d;

    /* renamed from: e */
    private AbstractC58986b f146171e;

    /* renamed from: f */
    private AbstractC58985a f146172f;

    /* renamed from: com.ss.android.lark.widget.recyclerview.d$a */
    public interface AbstractC58985a {
        /* renamed from: a */
        void mo190524a();

        /* renamed from: a */
        void mo190525a(int i);
    }

    /* renamed from: com.ss.android.lark.widget.recyclerview.d$b */
    public interface AbstractC58986b {
        /* renamed from: a */
        void mo31263a();

        /* renamed from: a */
        void mo31264a(boolean z);
    }

    /* renamed from: c */
    public boolean mo200107c() {
        return this.f146170d;
    }

    /* renamed from: d */
    private void m228935d() {
        AbstractC58986b bVar = this.f146171e;
        if (bVar != null) {
            bVar.mo31263a();
        }
    }

    /* renamed from: e */
    private void m228937e() {
        AbstractC58985a aVar = this.f146172f;
        if (aVar != null) {
            aVar.mo190524a();
        } else {
            this.f146169c.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public int mo200104b() {
        return this.f146167a.size();
    }

    /* renamed from: a */
    public List<Value> mo200097a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, Value> entry : this.f146167a.entrySet()) {
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo200100a(AbstractC58985a aVar) {
        this.f146172f = aVar;
    }

    /* renamed from: b */
    private void m228933b(boolean z) {
        AbstractC58986b bVar = this.f146171e;
        if (bVar != null) {
            bVar.mo31264a(z);
        }
    }

    /* renamed from: a */
    public void mo200101a(AbstractC58986b bVar) {
        this.f146171e = bVar;
    }

    /* renamed from: c */
    private boolean m228934c(int i) {
        if (i < 0 || i >= ((AbstractC58983c) this.f146169c).getItemCount()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m228936d(int i) {
        AbstractC58985a aVar = this.f146172f;
        if (aVar != null) {
            aVar.mo190525a(i);
        } else {
            this.f146169c.notifyItemChanged(i);
        }
    }

    /* renamed from: a */
    public boolean mo123399a(Value value) {
        return mo200107c();
    }

    public C58984d(A a) {
        this.f146169c = a;
    }

    /* renamed from: b */
    public boolean mo200105b(int i) {
        return this.f146167a.containsKey(Integer.valueOf(((AbstractC58983c) this.f146169c).mo31276a(i).hashCode()));
    }

    /* renamed from: b */
    public boolean mo200106b(Value value) {
        return this.f146167a.containsKey(Integer.valueOf(value.hashCode()));
    }

    /* renamed from: a */
    public void mo200098a(int i) {
        if (m228934c(i)) {
            mo200099a(i, !this.f146167a.containsKey(Integer.valueOf(((AbstractC58983c) this.f146169c).mo31276a(i).hashCode())));
            return;
        }
        Log.m165382e(String.format("position %d out of index", Integer.valueOf(i)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: android.util.SparseArray<Value> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo200102a(List<Value> list) {
        int size = this.f146167a.size();
        this.f146167a.clear();
        for (Value value : list) {
            this.f146167a.put(Integer.valueOf(value.hashCode()), value);
        }
        for (int i = 0; i < ((AbstractC58983c) this.f146169c).getItemCount(); i++) {
            Object a = ((AbstractC58983c) this.f146169c).mo31276a(i);
            if (this.f146167a.containsKey(Integer.valueOf(a.hashCode()))) {
                this.f146168b.put(i, a);
            }
        }
        m228937e();
        if (size != this.f146167a.size()) {
            m228935d();
        }
    }

    /* renamed from: a */
    public void mo200103a(boolean z) {
        if (this.f146170d != z) {
            this.f146170d = z;
            this.f146167a.clear();
            this.f146168b.clear();
            m228937e();
            m228933b(this.f146170d);
            if (z) {
                this.f146169c.registerAdapterDataObserver(this);
            } else {
                this.f146169c.unregisterAdapterDataObserver(this);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeRemoved(int i, int i2) {
        for (int i3 = (i2 + i) - 1; i3 >= i; i3--) {
            Value value = this.f146168b.get(i3);
            if (value != null) {
                this.f146167a.remove(Integer.valueOf(value.hashCode()));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: java.util.Map<java.lang.Integer, Value> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: android.util.SparseArray<Value> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo200099a(int i, boolean z) {
        if (!m228934c(i)) {
            Log.m165382e(String.format("position %d out of index", Integer.valueOf(i)));
            return;
        }
        int size = this.f146167a.size();
        Object a = ((AbstractC58983c) this.f146169c).mo31276a(i);
        if (z) {
            this.f146167a.put(Integer.valueOf(a.hashCode()), a);
            this.f146168b.put(i, a);
        } else {
            this.f146167a.remove(Integer.valueOf(a.hashCode()));
            this.f146168b.remove(i);
        }
        m228936d(i);
        if (size != this.f146167a.size()) {
            m228935d();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.util.SparseArray<Value> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeMoved(int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 + i4;
            this.f146168b.put(i5, ((AbstractC58983c) this.f146169c).mo31276a(i5));
            this.f146168b.remove(i + i4);
        }
    }
}
