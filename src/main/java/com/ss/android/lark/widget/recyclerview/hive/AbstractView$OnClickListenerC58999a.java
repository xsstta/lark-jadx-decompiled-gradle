package com.ss.android.lark.widget.recyclerview.hive;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.recyclerview.AbstractC58983c;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.widget.recyclerview.hive.a */
public abstract class AbstractView$OnClickListenerC58999a<Value> extends RecyclerView.Adapter<C59011f> implements View.OnClickListener, View.OnLongClickListener, AbstractC58983c<Value> {

    /* renamed from: b */
    public static boolean f146191b;

    /* renamed from: a */
    private SparseArray<AbstractC59004b> f146192a = new SparseArray<>();

    /* renamed from: c */
    public AbstractC59002b<Value> f146193c = $$Lambda$vlrYz1JTd7t_WGzTm6sDNL2ejg.INSTANCE;

    /* renamed from: d */
    private List<AbstractC59001a<Value>> f146194d = new ArrayList();

    /* renamed from: e */
    private AbstractView$OnClickListenerC58999a<Value>.C59003c f146195e = null;

    /* renamed from: com.ss.android.lark.widget.recyclerview.hive.a$a */
    public interface AbstractC59001a<Value> {
        AbstractC59004b mapToCell(Value value);
    }

    /* renamed from: com.ss.android.lark.widget.recyclerview.hive.a$b */
    public interface AbstractC59002b<Value> {
        Class typeOf(Value value);
    }

    @Override // com.ss.android.lark.widget.recyclerview.AbstractC58983c
    /* renamed from: a */
    public abstract Value mo31276a(int i);

    /* renamed from: a */
    public void mo200122a(AbstractC59002b<Value> bVar) {
        this.f146193c = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.recyclerview.hive.a$c */
    public class C59003c implements AbstractC59001a<Value> {

        /* renamed from: b */
        private Map<Class, AbstractC59001a<Value>> f146197b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ AbstractC59004b m229004a(AbstractC59004b bVar, Object obj) {
            return bVar;
        }

        private C59003c() {
            this.f146197b = new HashMap();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo200132a(AbstractC59004b<Value, ?> bVar) {
            Class<?> g = bVar.mo200136g();
            m229005a(g);
            this.f146197b.put(g, new AbstractC59001a() {
                /* class com.ss.android.lark.widget.recyclerview.hive.$$Lambda$a$c$9CrGyY2RrD4Fn8I1xzywiYl9_o */

                @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a.AbstractC59001a
                public final AbstractC59004b mapToCell(Object obj) {
                    return AbstractView$OnClickListenerC58999a.C59003c.m229004a(AbstractC59004b.this, obj);
                }
            });
        }

        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a.AbstractC59001a
        public AbstractC59004b mapToCell(Value value) {
            AbstractC59001a<Value> aVar = this.f146197b.get(AbstractView$OnClickListenerC58999a.this.f146193c.typeOf(value));
            if (aVar != null) {
                return aVar.mapToCell(value);
            }
            return null;
        }

        /* renamed from: a */
        private void m229005a(Class cls) {
            if (this.f146197b.containsKey(cls) && AbstractView$OnClickListenerC58999a.f146191b) {
                Log.m165382e("multi hive cell map to " + cls.getSimpleName());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo200133a(Class cls, AbstractC59001a<Value> aVar) {
            m229005a(cls);
            this.f146197b.put(cls, aVar);
        }
    }

    /* renamed from: a */
    public void mo200121a(AbstractC59001a<Value> aVar) {
        if (aVar != null) {
            this.f146195e = null;
            this.f146194d.add(aVar);
        }
    }

    /* renamed from: b */
    public void onViewDetachedFromWindow(C59011f fVar) {
        if (fVar.f146212b != null && fVar.f146211a != null) {
            fVar.f146212b.mo200135c(fVar.f146211a);
        }
    }

    /* renamed from: c */
    public void onViewRecycled(C59011f fVar) {
        if (fVar.f146212b != null && fVar.f146211a != null) {
            fVar.f146212b.mo122700a(fVar.f146211a);
        }
    }

    /* renamed from: a */
    static C59011f m228991a(View view) {
        RecyclerView.ViewHolder findContainingViewHolder;
        RecyclerView b = m228992b(view);
        if (b == null || (findContainingViewHolder = b.findContainingViewHolder(view)) == null || !(findContainingViewHolder instanceof C59011f)) {
            return null;
        }
        return (C59011f) findContainingViewHolder;
    }

    /* renamed from: b */
    private static RecyclerView m228992b(View view) {
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof RecyclerView) {
            return (RecyclerView) parent;
        }
        if (parent instanceof View) {
            return m228992b((View) parent);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.lark.widget.recyclerview.hive.b */
    /* JADX WARN: Multi-variable type inference failed */
    public void onClick(View view) {
        C59011f a = m228991a(view);
        if (a == null) {
            throw new IllegalStateException("Could not find RecyclerView holder for clicked view");
        } else if (a.getAdapterPosition() != -1) {
            a.f146212b.mo122683c(a.f146211a, a.f146213c);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.lark.widget.recyclerview.hive.b */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean onLongClick(View view) {
        C59011f a = m228991a(view);
        if (a == null) {
            throw new IllegalStateException("Could not find RecyclerView holder for clicked view");
        } else if (a.getAdapterPosition() != -1) {
            return a.f146212b.mo122755b(a.f146211a, a.f146213c);
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public void mo200123a(AbstractC59004b<Value, ?> bVar) {
        if (this.f146195e == null) {
            AbstractView$OnClickListenerC58999a<Value>.C59003c cVar = new C59003c();
            this.f146195e = cVar;
            this.f146194d.add(cVar);
        }
        this.f146195e.mo200132a(bVar);
    }

    /* renamed from: a */
    public void onViewAttachedToWindow(C59011f fVar) {
        if (fVar.f146212b != null && fVar.f146211a != null) {
            fVar.f146212b.mo191549b(fVar.f146211a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0011  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getItemViewType(int r6) {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a.getItemViewType(int):int");
    }

    /* renamed from: a */
    public void mo200127a(boolean z) {
        f146191b = z;
    }

    /* renamed from: a */
    public C59011f onCreateViewHolder(ViewGroup viewGroup, int i) {
        PerfLog.start("onCreateViewHolder_" + i, "");
        AbstractC59004b bVar = this.f146192a.get(i);
        C59011f fVar = new C59011f(bVar.mo122823a(viewGroup), bVar);
        PerfLog.end("onCreateViewHolder_" + i, "");
        return fVar;
    }

    /* renamed from: a */
    public void onBindViewHolder(C59011f fVar, int i) {
        PerfLog.start("onBindViewHolder_" + i, "");
        Value a = mo31276a(i);
        fVar.mo200149a(a);
        fVar.itemView.setOnClickListener(this);
        fVar.itemView.setOnLongClickListener(this);
        AbstractC59004b bVar = fVar.f146212b;
        if (fVar.f146211a == null) {
            fVar.f146211a = (VH) bVar.mo200137h();
            fVar.f146211a.mo200145a(fVar);
            fVar.f146211a.mo200146f(fVar.itemView);
        }
        bVar.mo122649a(fVar.f146211a, a);
        PerfLog.end("onBindViewHolder_" + i, "");
    }

    /* renamed from: a */
    public void mo200126a(Class cls, AbstractC59001a<Value> aVar) {
        if (this.f146195e == null) {
            AbstractView$OnClickListenerC58999a<Value>.C59003c cVar = new C59003c();
            this.f146195e = cVar;
            this.f146194d.add(cVar);
        }
        this.f146195e.mo200133a(cls, aVar);
    }
}
