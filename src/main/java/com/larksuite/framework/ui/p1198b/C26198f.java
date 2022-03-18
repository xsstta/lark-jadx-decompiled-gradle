package com.larksuite.framework.ui.p1198b;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.p1198b.p1199a.AbstractC26184a;
import com.larksuite.framework.ui.p1198b.p1199a.C26185b;
import com.larksuite.framework.ui.p1198b.p1200b.C26189a;
import com.larksuite.framework.ui.p1198b.p1201c.C26193a;
import com.larksuite.framework.ui.p1198b.p1202d.AbstractC26196b;
import com.larksuite.framework.ui.p1198b.p1202d.C26195a;

/* renamed from: com.larksuite.framework.ui.b.f */
public class C26198f extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    protected final AbstractC26197e f64681a;

    /* renamed from: b */
    protected final SparseArray<Rect> f64682b;

    /* renamed from: c */
    protected final AbstractC26184a f64683c;

    /* renamed from: d */
    protected final AbstractC26196b f64684d;

    /* renamed from: e */
    protected final C26190c f64685e;

    /* renamed from: f */
    protected final C26193a f64686f;

    /* renamed from: g */
    private final AbstractC26194d f64687g;

    /* renamed from: h */
    private final C26189a f64688h;

    /* renamed from: i */
    private final Rect f64689i;

    /* renamed from: a */
    public void mo93182a() {
        this.f64683c.mo93162a();
        this.f64682b.clear();
    }

    public C26198f(AbstractC26197e eVar) {
        this(eVar, new C26195a(), new C26189a(), null);
    }

    /* renamed from: a */
    public View mo93181a(RecyclerView recyclerView, int i) {
        return this.f64683c.mo93161a(recyclerView, i);
    }

    /* renamed from: a */
    public int mo93180a(int i, int i2) {
        int i3 = -1;
        for (int i4 = 0; i4 < this.f64682b.size(); i4++) {
            SparseArray<Rect> sparseArray = this.f64682b;
            if (sparseArray.get(sparseArray.keyAt(i4)).contains(i, i2)) {
                int keyAt = this.f64682b.keyAt(i4);
                AbstractC26194d dVar = this.f64687g;
                if (dVar == null || dVar.mo93173a(keyAt)) {
                    i3 = keyAt;
                }
            }
        }
        return i3;
    }

    /* renamed from: a */
    private void m94750a(Rect rect, View view, int i) {
        this.f64688h.mo93165a(this.f64689i, view);
        if (i == 1) {
            rect.top = view.getHeight() + this.f64689i.top + this.f64689i.bottom;
        } else {
            rect.left = view.getWidth() + this.f64689i.left + this.f64689i.right;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        boolean a;
        super.onDrawOver(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        if (childCount > 0 && this.f64681a.getItemCount() > 0) {
            this.f64682b.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1 && ((a = this.f64685e.mo93168a(childAt, this.f64684d.mo93174a(recyclerView), childAdapterPosition)) || this.f64685e.mo93167a(childAdapterPosition, this.f64684d.mo93175b(recyclerView)))) {
                    View a2 = this.f64683c.mo93161a(recyclerView, childAdapterPosition);
                    Rect rect = this.f64682b.get(childAdapterPosition);
                    if (rect == null) {
                        rect = new Rect();
                        this.f64682b.put(childAdapterPosition, rect);
                    }
                    this.f64685e.mo93166a(rect, recyclerView, a2, childAt, a);
                    this.f64686f.mo93172a(recyclerView, canvas, a2, rect);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && this.f64685e.mo93167a(childAdapterPosition, this.f64684d.mo93175b(recyclerView))) {
            m94750a(rect, mo93181a(recyclerView, childAdapterPosition), this.f64684d.mo93174a(recyclerView));
        }
    }

    private C26198f(AbstractC26197e eVar, AbstractC26196b bVar, C26189a aVar, AbstractC26194d dVar) {
        this(eVar, bVar, aVar, new C26193a(bVar), new C26185b(eVar, bVar), dVar);
    }

    private C26198f(AbstractC26197e eVar, AbstractC26196b bVar, C26189a aVar, C26193a aVar2, AbstractC26184a aVar3, AbstractC26194d dVar) {
        this(eVar, aVar2, bVar, aVar, aVar3, new C26190c(eVar, aVar3, bVar, aVar), dVar);
    }

    private C26198f(AbstractC26197e eVar, C26193a aVar, AbstractC26196b bVar, C26189a aVar2, AbstractC26184a aVar3, C26190c cVar, AbstractC26194d dVar) {
        this.f64682b = new SparseArray<>();
        this.f64689i = new Rect();
        this.f64681a = eVar;
        this.f64683c = aVar3;
        this.f64684d = bVar;
        this.f64686f = aVar;
        this.f64688h = aVar2;
        this.f64685e = cVar;
        this.f64687g = dVar;
    }
}
