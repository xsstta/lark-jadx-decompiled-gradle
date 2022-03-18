package com.ss.android.lark.widget.recyclerview.hive;

import android.util.SparseArray;
import android.view.View;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;

/* renamed from: com.ss.android.lark.widget.recyclerview.hive.c */
public abstract class AbstractView$OnClickListenerC59005c<Value, VH extends C59008d> extends AbstractC59004b<Value, VH> implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: a */
    private AbstractC59004b<Value, ? extends AbstractC59010e> f146201a;

    /* renamed from: d */
    SparseArray<AbstractC59004b> f146202d = new SparseArray<>();

    /* renamed from: e */
    AbstractC59012g<Value> f146203e = new AbstractC59012g<Value>() {
        /* class com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c.C590061 */

        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g
        /* renamed from: d */
        public boolean mo122581d(AbstractC59004b bVar, AbstractC59010e eVar, Value value) {
            C59011f a = AbstractView$OnClickListenerC58999a.m228991a(eVar.f146209n);
            if (a != null) {
                return AbstractView$OnClickListenerC59005c.this.mo122755b((AbstractC59010e) ((C59008d) a.f146211a), (Object) value);
            }
            return false;
        }

        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g
        /* renamed from: e */
        public void mo123401e(AbstractC59004b bVar, AbstractC59010e eVar, Value value) {
            C59011f a = AbstractView$OnClickListenerC58999a.m228991a(eVar.f146209n);
            if (a != null) {
                AbstractView$OnClickListenerC59005c.this.mo122683c((C59008d) a.f146211a, value);
            }
        }
    };

    /* renamed from: b */
    public abstract void mo122718b(VH vh, Value value);

    /* renamed from: f */
    public AbstractC59004b<Value, ? extends AbstractC59010e> mo200139f() {
        return this.f146201a;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class<?> mo122646a() {
        AbstractC59004b<Value, ? extends AbstractC59010e> bVar = this.f146201a;
        if (bVar != null) {
            return bVar.mo200136g();
        }
        return super.mo122646a();
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    public int ao_() {
        AbstractC59004b<Value, ? extends AbstractC59010e> bVar = this.f146201a;
        if (bVar != null) {
            return bVar.ao_();
        }
        return super.ao_();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public VH mo200137h() {
        VH vh = (VH) ((C59008d) super.mo200137h());
        vh.mo200143a(this.f146202d);
        return vh;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: com.ss.android.lark.widget.recyclerview.hive.b */
    /* JADX WARN: Multi-variable type inference failed */
    public void onClick(View view) {
        int id = view.getId();
        C59011f a = AbstractView$OnClickListenerC58999a.m228991a(view);
        if (a != null && a.f146211a != null) {
            C59008d dVar = (C59008d) a.f146211a;
            dVar.f146207m.get(id).mo122683c(dVar.f146206l.get(id), a.f146213c);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: com.ss.android.lark.widget.recyclerview.hive.b */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean onLongClick(View view) {
        int id = view.getId();
        C59011f a = AbstractView$OnClickListenerC58999a.m228991a(view);
        if (a == null || a.f146211a == null) {
            return false;
        }
        C59008d dVar = (C59008d) a.f146211a;
        return dVar.f146207m.get(id).mo122755b(dVar.f146206l.get(id), a.f146213c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122700a(VH vh) {
        super.mo122700a((AbstractC59010e) vh);
        int size = this.f146202d.size();
        for (int i = 0; i < size; i++) {
            this.f146202d.valueAt(i).mo122700a(vh.f146206l.get(this.f146202d.keyAt(i)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractView$OnClickListenerC59005c mo200138a(int i, AbstractC59004b bVar) {
        if (this.f146202d.indexOfKey(i) < 0) {
            this.f146202d.put(i, bVar);
            if (bVar.f146200f == null) {
                bVar.mo200134a(this.f146203e);
            }
            if (this.f146201a == null) {
                this.f146201a = bVar;
            }
            return this;
        }
        throw new IllegalStateException("multi child component with same layout id");
    }

    /* renamed from: a */
    public void mo122649a(VH vh, Value value) {
        int size = this.f146202d.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.f146202d.keyAt(i);
            AbstractC59004b valueAt = this.f146202d.valueAt(i);
            valueAt.mo122649a(vh.f146206l.get(keyAt), value);
            View findViewById = ((C59008d) vh).f146209n.findViewById(keyAt);
            if (((C59008d) vh).f146209n != findViewById) {
                findViewById.setOnClickListener(this);
                findViewById.setOnLongClickListener(this);
                valueAt.mo200134a(new AbstractC59012g<Value>() {
                    /* class com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c.C590072 */

                    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g
                    /* renamed from: e */
                    public void mo123401e(AbstractC59004b bVar, AbstractC59010e eVar, Value value) {
                        C59011f a = AbstractView$OnClickListenerC58999a.m228991a(eVar.f146209n);
                        if (a != null) {
                            AbstractView$OnClickListenerC59005c.this.mo122683c(a.f146211a, value);
                        }
                    }

                    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g
                    /* renamed from: d */
                    public boolean mo122581d(AbstractC59004b bVar, AbstractC59010e eVar, Value value) {
                        C59011f a = AbstractView$OnClickListenerC58999a.m228991a(eVar.f146209n);
                        if (a != null) {
                            return AbstractView$OnClickListenerC59005c.this.mo122755b(a.f146211a, value);
                        }
                        return false;
                    }
                });
            }
        }
        mo122718b((C59008d) vh, (Object) value);
    }
}
