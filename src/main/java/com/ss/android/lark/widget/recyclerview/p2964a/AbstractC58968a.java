package com.ss.android.lark.widget.recyclerview.p2964a;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.recyclerview.a.a */
public abstract class AbstractC58968a<T extends AbstractC58968a> {

    /* renamed from: a */
    private static final SparseIntArray f146115a = new SparseIntArray();

    /* renamed from: b */
    private static final SparseArray<View> f146116b = new SparseArray<>();

    /* renamed from: c */
    C58973b<T> f146117c;

    /* renamed from: d */
    public AbstractC58971a<T> f146118d;

    /* renamed from: e */
    public AbstractC58972b<T> f146119e;

    /* renamed from: f */
    private int f146120f;

    /* renamed from: com.ss.android.lark.widget.recyclerview.a.a$a */
    public interface AbstractC58971a<T> {
        /* renamed from: a */
        void mo200072a(C58974c cVar, T t, int i);
    }

    /* renamed from: com.ss.android.lark.widget.recyclerview.a.a$b */
    public interface AbstractC58972b<T> {
        /* renamed from: a */
        boolean mo200073a(C58974c cVar, T t, int i);
    }

    /* renamed from: a */
    public abstract void mo101671a(C58974c cVar, int i);

    /* renamed from: a */
    public void mo200060a(C58974c cVar, int i, List<Object> list) {
    }

    /* renamed from: c */
    public long mo200062c() {
        return -1;
    }

    /* renamed from: d */
    public void mo200065d(C58974c cVar, int i) {
    }

    /* renamed from: d */
    public int mo200064d() {
        return this.f146120f;
    }

    /* renamed from: e */
    public C58973b<T> mo200066e() {
        return this.f146117c;
    }

    /* renamed from: f */
    public List<T> mo200067f() {
        return mo200066e().mo200076a();
    }

    /* renamed from: g */
    public int mo200068g() {
        return mo200066e().getItemCount();
    }

    /* renamed from: h */
    public int mo200069h() {
        return mo200066e().mo200076a().indexOf(this);
    }

    public AbstractC58968a(int i) {
        int b = m228877b(i);
        this.f146120f = b;
        f146115a.put(b, i);
    }

    /* renamed from: b */
    private int m228877b(int i) {
        return i + getClass().hashCode();
    }

    /* renamed from: a */
    public boolean mo200061a(int i) {
        if (this.f146120f == m228877b(i)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static C58974c m228876a(ViewGroup viewGroup, int i) {
        int i2 = f146115a.get(i, -1);
        if (i2 != -1) {
            return new C58974c(LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false));
        }
        View view = f146116b.get(i);
        if (view != null) {
            return new C58974c(view);
        }
        throw new RuntimeException("onCreateViewHolder: get holder from view type failed.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo200063c(final C58974c cVar, int i) {
        if (this.f146118d != null) {
            cVar.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a.View$OnClickListenerC589691 */

                /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: com.ss.android.lark.widget.recyclerview.a.a$a<T extends com.ss.android.lark.widget.recyclerview.a.a> */
                /* JADX WARN: Multi-variable type inference failed */
                public void onClick(View view) {
                    if (AbstractC58968a.this.f146118d != null) {
                        C58974c cVar = cVar;
                        AbstractC58968a aVar = AbstractC58968a.this;
                        AbstractC58968a.this.f146118d.mo200072a(cVar, aVar, aVar.mo200069h());
                    }
                }
            });
        } else {
            cVar.itemView.setOnClickListener(null);
        }
        if (this.f146119e != null) {
            cVar.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a.View$OnLongClickListenerC589702 */

                /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: com.ss.android.lark.widget.recyclerview.a.a$b<T extends com.ss.android.lark.widget.recyclerview.a.a> */
                /* JADX WARN: Multi-variable type inference failed */
                public boolean onLongClick(View view) {
                    if (AbstractC58968a.this.f146119e == null) {
                        return false;
                    }
                    C58974c cVar = cVar;
                    AbstractC58968a aVar = AbstractC58968a.this;
                    return AbstractC58968a.this.f146119e.mo200073a(cVar, aVar, aVar.mo200069h());
                }
            });
        } else {
            cVar.itemView.setOnLongClickListener(null);
        }
        mo101671a(cVar, i);
    }
}
