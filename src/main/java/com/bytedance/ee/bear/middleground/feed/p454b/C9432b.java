package com.bytedance.ee.bear.middleground.feed.p454b;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9495h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.middleground.feed.b.b */
public class C9432b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private Map<Class<?>, AbstractC9431a<? extends RecyclerView.ViewHolder, ? extends AbstractC9495h>> f25352a = new HashMap();

    /* renamed from: b */
    private SparseArray<AbstractC9431a<? extends RecyclerView.ViewHolder, ? extends AbstractC9495h>> f25353b = new SparseArray<>();

    /* renamed from: c */
    private List<AbstractC9495h> f25354c = new ArrayList();

    /* renamed from: b */
    public List<AbstractC9495h> mo35948b() {
        return this.f25354c;
    }

    /* renamed from: a */
    public void mo35945a() {
        this.f25354c.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f25354c.size();
    }

    /* renamed from: a */
    public AbstractC9431a<? extends RecyclerView.ViewHolder, ? extends AbstractC9495h> mo35944a(Class<? extends AbstractC9495h> cls) {
        return this.f25352a.get(cls);
    }

    /* renamed from: a */
    public void mo35947a(List<AbstractC9495h> list) {
        this.f25354c.clear();
        this.f25354c.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f25352a.get(this.f25354c.get(i).getClass()).mo35941a();
    }

    /* renamed from: a */
    public void mo35946a(Class<? extends AbstractC9495h> cls, AbstractC9431a<? extends RecyclerView.ViewHolder, ? extends AbstractC9495h> aVar) {
        C13479a.m54764b("MultiAdapter", "add type:" + cls.getName() + " adapter:" + aVar.toString());
        this.f25352a.put(cls, aVar);
        this.f25353b.put(aVar.mo35941a(), aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        try {
            AbstractC9431a<? extends RecyclerView.ViewHolder, ? extends AbstractC9495h> aVar = this.f25353b.get(getItemViewType(i));
            if (aVar != null) {
                aVar.mo35943a(this, viewHolder, i, this.f25354c.get(i));
            }
        } catch (Exception e) {
            SparseArray<AbstractC9431a<? extends RecyclerView.ViewHolder, ? extends AbstractC9495h>> sparseArray = this.f25353b;
            if (sparseArray != null) {
                C13479a.m54758a("MultiAdapter", sparseArray.toString());
            }
            C13606d.m55245a("MultiAdapter", e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC9431a<? extends RecyclerView.ViewHolder, ? extends AbstractC9495h> aVar = this.f25353b.get(i);
        if (aVar != null) {
            return aVar.mo35942a(this, viewGroup);
        }
        throw new RuntimeException("Can't found viewType = " + i + " . Please add this type");
    }
}
