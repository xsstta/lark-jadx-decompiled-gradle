package com.ss.android.lark.thirdshare.base.export.p2741c;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a;
import java.util.List;

/* renamed from: com.ss.android.lark.thirdshare.base.export.c.a */
public abstract class AbstractC55713a<T extends AbstractC55713a<T>> {

    /* renamed from: a */
    private static final SparseIntArray f137413a = new SparseIntArray();

    /* renamed from: b */
    private static final SparseArray<View> f137414b = new SparseArray<>();

    /* renamed from: c */
    private int f137415c;

    /* renamed from: h */
    public boolean f137416h;

    /* renamed from: i */
    C55718b<T> f137417i;

    /* renamed from: j */
    public AbstractC55716a<T> f137418j;

    /* renamed from: k */
    public AbstractC55717b<T> f137419k;

    /* renamed from: com.ss.android.lark.thirdshare.base.export.c.a$a */
    public interface AbstractC55716a<T> {
        /* renamed from: a */
        void mo130641a(C55719c cVar, T t, int i);
    }

    /* renamed from: com.ss.android.lark.thirdshare.base.export.c.a$b */
    public interface AbstractC55717b<T> {
        /* renamed from: a */
        boolean mo189854a(C55719c cVar, T t, int i);
    }

    /* renamed from: a */
    public abstract void mo130630a(C55719c cVar, int i);

    /* renamed from: a */
    public void mo189844a(C55719c cVar, int i, List<Object> list) {
    }

    /* renamed from: c */
    public long mo189845c() {
        return -1;
    }

    /* renamed from: d */
    public int mo189848d() {
        return this.f137415c;
    }

    /* renamed from: e */
    public C55718b<T> mo189849e() {
        return this.f137417i;
    }

    /* renamed from: f */
    public int mo189850f() {
        return mo189849e().getItemCount();
    }

    /* renamed from: g */
    public int mo189851g() {
        return mo189849e().mo189857a().indexOf(this);
    }

    /* renamed from: a */
    public T mo189843a(AbstractC55716a<T> aVar) {
        this.f137418j = aVar;
        return this;
    }

    public AbstractC55713a(int i) {
        int a = mo145992a(i);
        this.f137415c = a;
        f137413a.put(a, i);
    }

    /* renamed from: a */
    private int mo145992a(int i) {
        return i + getClass().hashCode();
    }

    /* renamed from: c */
    public boolean mo189847c(int i) {
        if (this.f137415c == mo145992a(i)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo130633b(C55719c cVar, int i) {
        this.f137416h = false;
    }

    /* renamed from: a */
    static C55719c m215775a(ViewGroup viewGroup, int i) {
        int i2 = f137413a.get(i, -1);
        if (i2 != -1) {
            return new C55719c(LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false));
        }
        View view = f137414b.get(i);
        if (view != null) {
            return new C55719c(view);
        }
        throw new RuntimeException("onCreateViewHolder: get holder from view type failed.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo189846c(final C55719c cVar, int i) {
        if (this.f137418j != null) {
            cVar.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a.View$OnClickListenerC557141 */

                /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: com.ss.android.lark.thirdshare.base.export.c.a$a<T extends com.ss.android.lark.thirdshare.base.export.c.a<T>> */
                /* JADX WARN: Multi-variable type inference failed */
                public void onClick(View view) {
                    if (AbstractC55713a.this.f137418j != null) {
                        C55719c cVar = cVar;
                        AbstractC55713a aVar = AbstractC55713a.this;
                        AbstractC55713a.this.f137418j.mo130641a(cVar, aVar, aVar.mo189851g());
                    }
                }
            });
        } else {
            cVar.itemView.setOnClickListener(null);
        }
        if (this.f137419k != null) {
            cVar.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a.View$OnLongClickListenerC557152 */

                /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: com.ss.android.lark.thirdshare.base.export.c.a$b<T extends com.ss.android.lark.thirdshare.base.export.c.a<T>> */
                /* JADX WARN: Multi-variable type inference failed */
                public boolean onLongClick(View view) {
                    if (AbstractC55713a.this.f137419k == null) {
                        return false;
                    }
                    C55719c cVar = cVar;
                    AbstractC55713a aVar = AbstractC55713a.this;
                    return AbstractC55713a.this.f137419k.mo189854a(cVar, aVar, aVar.mo189851g());
                }
            });
        } else {
            cVar.itemView.setOnLongClickListener(null);
        }
        this.f137416h = true;
        mo130630a(cVar, i);
    }
}
