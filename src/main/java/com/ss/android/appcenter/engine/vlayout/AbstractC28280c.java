package com.ss.android.appcenter.engine.vlayout;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager;
import com.ss.android.appcenter.engine.vlayout.p1301a.C28273h;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.engine.vlayout.c */
public abstract class AbstractC28280c {

    /* renamed from: a */
    public static final C28288h<Integer> f71028a = C28288h.m103770a(Integer.MIN_VALUE, Integer.MAX_VALUE);

    /* renamed from: b */
    public static final C28288h<Integer> f71029b = C28288h.m103770a(-1, -1);

    /* renamed from: c */
    C28288h<Integer> f71030c = f71029b;

    /* renamed from: d */
    protected final List<View> f71031d = new LinkedList();

    /* renamed from: a */
    public abstract int mo100710a(int i, boolean z, boolean z2, AbstractC28282e eVar);

    /* renamed from: a */
    public void mo100774a(int i, int i2, int i3, AbstractC28282e eVar) {
    }

    /* renamed from: a */
    public void mo100775a(int i, AbstractC28282e eVar) {
    }

    /* renamed from: a */
    public abstract void mo100713a(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, AbstractC28282e eVar);

    /* renamed from: a */
    public abstract void mo100726a(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.C28259c cVar, C28273h hVar, AbstractC28282e eVar);

    /* renamed from: a */
    public abstract void mo100727a(RecyclerView.Recycler recycler, RecyclerView.State state, AbstractC28282e eVar);

    /* renamed from: a */
    public void mo100714a(RecyclerView.State state, VirtualLayoutManager.C28257a aVar, AbstractC28282e eVar) {
    }

    /* renamed from: a */
    public void mo100741a(AbstractC28282e eVar) {
    }

    /* renamed from: a */
    public boolean mo100715a(int i, int i2, int i3, AbstractC28282e eVar, boolean z) {
        return true;
    }

    /* renamed from: b */
    public abstract int mo100730b();

    /* renamed from: b */
    public abstract void mo100732b(int i);

    /* renamed from: b */
    public void mo100743b(int i, int i2) {
    }

    /* renamed from: b */
    public void mo100776b(int i, AbstractC28282e eVar) {
    }

    /* renamed from: b */
    public void mo100777b(RecyclerView.State state, VirtualLayoutManager.C28257a aVar, AbstractC28282e eVar) {
    }

    /* renamed from: b */
    public abstract void mo100733b(AbstractC28282e eVar);

    /* renamed from: c */
    public abstract boolean mo100735c();

    /* renamed from: a */
    public final C28288h<Integer> mo100772a() {
        return this.f71030c;
    }

    /* renamed from: a */
    public boolean mo100739a(int i) {
        return !this.f71030c.mo100811a(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo100773a(int i, int i2) {
        if (i2 < i) {
            throw new IllegalArgumentException("end should be larger or equeal then start position");
        } else if (i == -1 && i2 == -1) {
            this.f71030c = f71029b;
            mo100743b(i, i2);
        } else if ((i2 - i) + 1 != mo100730b()) {
            throw new MismatchChildCountException("ItemCount mismatch when range: " + this.f71030c.toString() + " childCount: " + mo100730b());
        } else if (i != this.f71030c.mo100812b().intValue() || i2 != this.f71030c.mo100809a().intValue()) {
            this.f71030c = C28288h.m103770a(Integer.valueOf(i), Integer.valueOf(i2));
            mo100743b(i, i2);
        }
    }
}
