package com.ss.android.lark.passport.infra.widget.p2445c;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.passport.infra.widget.p2445c.p2446a.AbstractC49256a;
import com.ss.android.lark.passport.infra.widget.p2445c.p2446a.C49257b;
import com.ss.android.lark.passport.infra.widget.p2445c.p2447b.C49259a;
import com.ss.android.lark.passport.infra.widget.p2445c.p2448c.C49261a;
import com.ss.android.lark.passport.infra.widget.p2445c.p2449d.AbstractC49264b;
import com.ss.android.lark.passport.infra.widget.p2445c.p2449d.C49263a;

/* renamed from: com.ss.android.lark.passport.infra.widget.c.d */
public class C49262d extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private final AbstractC49260c f123646a;

    /* renamed from: b */
    private final AbstractC49258b f123647b;

    /* renamed from: c */
    private final SparseArray<Rect> f123648c;

    /* renamed from: d */
    private final AbstractC49256a f123649d;

    /* renamed from: e */
    private final AbstractC49264b f123650e;

    /* renamed from: f */
    private final C49255a f123651f;

    /* renamed from: g */
    private final C49261a f123652g;

    /* renamed from: h */
    private final C49259a f123653h;

    /* renamed from: i */
    private final Rect f123654i;

    public C49262d(AbstractC49260c cVar) {
        this(cVar, new C49263a(), new C49259a(), null);
    }

    /* renamed from: a */
    public View mo171820a(RecyclerView recyclerView, int i) {
        return this.f123649d.mo171813a(recyclerView, i);
    }

    /* renamed from: a */
    private void m194131a(Rect rect, View view, int i) {
        this.f123653h.mo171814a(this.f123654i, view);
        if (i == 1) {
            rect.top = view.getHeight() + this.f123654i.top + this.f123654i.bottom;
        } else {
            rect.left = view.getWidth() + this.f123654i.left + this.f123654i.right;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        boolean a;
        super.onDrawOver(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        if (childCount > 0 && this.f123646a.getItemCount() > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1 && ((a = this.f123651f.mo171812a(childAt, this.f123650e.mo171821a(recyclerView), childAdapterPosition)) || this.f123651f.mo171811a(childAdapterPosition, this.f123650e.mo171822b(recyclerView)))) {
                    View a2 = this.f123649d.mo171813a(recyclerView, childAdapterPosition);
                    Rect rect = this.f123648c.get(childAdapterPosition);
                    if (rect == null) {
                        rect = new Rect();
                        this.f123648c.put(childAdapterPosition, rect);
                    }
                    this.f123651f.mo171810a(rect, recyclerView, a2, childAt, a);
                    this.f123652g.mo171819a(recyclerView, canvas, a2, rect);
                }
            }
        }
    }

    private C49262d(AbstractC49260c cVar, AbstractC49264b bVar, C49259a aVar, AbstractC49258b bVar2) {
        this(cVar, bVar, aVar, new C49261a(bVar), new C49257b(cVar, bVar), bVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && this.f123651f.mo171811a(childAdapterPosition, this.f123650e.mo171822b(recyclerView))) {
            m194131a(rect, mo171820a(recyclerView, childAdapterPosition), this.f123650e.mo171821a(recyclerView));
        }
    }

    private C49262d(AbstractC49260c cVar, AbstractC49264b bVar, C49259a aVar, C49261a aVar2, AbstractC49256a aVar3, AbstractC49258b bVar2) {
        this(cVar, aVar2, bVar, aVar, aVar3, new C49255a(cVar, aVar3, bVar, aVar), bVar2);
    }

    private C49262d(AbstractC49260c cVar, C49261a aVar, AbstractC49264b bVar, C49259a aVar2, AbstractC49256a aVar3, C49255a aVar4, AbstractC49258b bVar2) {
        this.f123648c = new SparseArray<>();
        this.f123654i = new Rect();
        this.f123646a = cVar;
        this.f123649d = aVar3;
        this.f123650e = bVar;
        this.f123652g = aVar;
        this.f123653h = aVar2;
        this.f123651f = aVar4;
        this.f123647b = bVar2;
    }
}
