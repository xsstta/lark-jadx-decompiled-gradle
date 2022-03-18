package com.chad.library.adapter.base;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.chad.library.adapter.base.C20923c;
import com.chad.library.adapter.base.entity.AbstractC20929b;
import com.chad.library.adapter.base.entity.AbstractC20930c;
import java.util.List;

/* renamed from: com.chad.library.adapter.base.b */
public abstract class AbstractC20921b<T extends AbstractC20930c, K extends C20923c> extends BaseQuickAdapter<T, K> {

    /* renamed from: a */
    private SparseIntArray f51241a;

    public AbstractC20921b(List<T> list) {
        super(list);
    }

    /* renamed from: b */
    private int mo33373b(int i) {
        return this.f51241a.get(i, -404);
    }

    /* access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public int mo32796a(int i) {
        AbstractC20930c cVar = (AbstractC20930c) this.f51214t.get(i);
        if (cVar != null) {
            return cVar.getItemType();
        }
        return -255;
    }

    /* renamed from: b */
    public boolean mo70671a(AbstractC20930c cVar) {
        if (cVar == null || !(cVar instanceof AbstractC20929b)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.chad.library.adapter.base.b<T extends com.chad.library.adapter.base.entity.c, K extends com.chad.library.adapter.base.c> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: c */
    public void mo70682c(int i) {
        if (this.f51214t != null && i >= 0 && i < this.f51214t.size()) {
            AbstractC20930c cVar = (AbstractC20930c) this.f51214t.get(i);
            if (cVar instanceof AbstractC20929b) {
                mo70727a((AbstractC20929b) cVar, i);
            }
            mo70728a(cVar);
            super.mo70682c(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70728a(T t) {
        int c = mo70680c(t);
        if (c >= 0) {
            ((AbstractC20929b) this.f51214t.get(c)).getSubItems().remove(t);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public K mo32344a(ViewGroup viewGroup, int i) {
        return mo70684d(viewGroup, mo33373b(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70726a(int i, int i2) {
        if (this.f51241a == null) {
            this.f51241a = new SparseIntArray();
        }
        this.f51241a.put(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70727a(AbstractC20929b bVar, int i) {
        List subItems;
        if (!(!bVar.isExpanded() || (subItems = bVar.getSubItems()) == null || subItems.size() == 0)) {
            int size = subItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo70682c(i + 1);
            }
        }
    }
}
