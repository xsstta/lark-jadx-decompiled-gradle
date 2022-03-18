package com.ss.android.lark.widget.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.widget.recyclerview.e */
public abstract class AbstractView$OnClickListenerC58987e<Value> extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener, View.OnLongClickListener, AbstractC58983c<Value> {

    /* renamed from: a */
    private AbstractC58989b<Value> f146173a;

    /* renamed from: b */
    private AbstractC58990c<Value> f146174b;

    /* renamed from: c */
    private AbstractC58991d<Value> f146175c;

    /* renamed from: com.ss.android.lark.widget.recyclerview.e$b */
    public interface AbstractC58989b<Value> {
        /* renamed from: a */
        int mo31301a(Value value);

        /* renamed from: a */
        AbstractC58992f<? extends Value, ? extends RecyclerView.ViewHolder> mo31302a(int i);
    }

    /* renamed from: com.ss.android.lark.widget.recyclerview.e$c */
    public interface AbstractC58990c<Value> {
        void onItemClicked(View view, int i, Value value);
    }

    /* renamed from: com.ss.android.lark.widget.recyclerview.e$d */
    public interface AbstractC58991d<Value> {
        boolean onItemLongClicked(View view, int i, Value value);
    }

    @Override // com.ss.android.lark.widget.recyclerview.AbstractC58983c
    /* renamed from: a */
    public abstract Value mo31276a(int i);

    /* renamed from: a */
    public void mo200108a(AbstractC58989b<Value> bVar) {
        this.f146173a = bVar;
    }

    /* renamed from: a */
    public void mo200109a(AbstractC58990c<Value> cVar) {
        this.f146174b = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f146173a.mo31301a(mo31276a(i));
    }

    /* renamed from: a */
    public void mo200110a(AbstractC58991d<Value> dVar) {
        this.f146175c = dVar;
    }

    public void onClick(View view) {
        if (this.f146174b != null) {
            C58988a aVar = (C58988a) view.getTag(R.id.multi_type_item_data);
            this.f146174b.onItemClicked(view, aVar.f146176a, aVar.f146177b);
        }
    }

    public boolean onLongClick(View view) {
        if (this.f146175c == null) {
            return false;
        }
        C58988a aVar = (C58988a) view.getTag(R.id.multi_type_item_data);
        return this.f146175c.onItemLongClicked(view, aVar.f146176a, aVar.f146177b);
    }

    /* renamed from: com.ss.android.lark.widget.recyclerview.e$a */
    private static class C58988a<Value> {

        /* renamed from: a */
        public int f146176a;

        /* renamed from: b */
        public Value f146177b;

        public C58988a(int i, Value value) {
            this.f146176a = i;
            this.f146177b = value;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC58992f<? extends Value, ? extends RecyclerView.ViewHolder> a = this.f146173a.mo31302a(i);
        RecyclerView.ViewHolder a2 = a.mo200113a(viewGroup);
        a2.itemView.setTag(R.id.multi_type_item_holder, a);
        return a2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Value a = mo31276a(i);
        View view = viewHolder.itemView;
        view.setTag(R.id.multi_type_item_data, new C58988a(i, a));
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        AbstractC58992f fVar = (AbstractC58992f) view.getTag(R.id.multi_type_item_holder);
        fVar.mo200114a(this.f146175c);
        fVar.mo31174a(viewHolder, i, mo31276a(i));
    }
}
