package com.larksuite.framework.ui.p1198b.p1201c;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.p1198b.p1200b.C26189a;
import com.larksuite.framework.ui.p1198b.p1202d.AbstractC26196b;

/* renamed from: com.larksuite.framework.ui.b.c.a */
public class C26193a {

    /* renamed from: a */
    private final C26189a f64678a;

    /* renamed from: b */
    private final AbstractC26196b f64679b;

    /* renamed from: c */
    private final Rect f64680c;

    public C26193a(AbstractC26196b bVar) {
        this(bVar, new C26189a());
    }

    private C26193a(AbstractC26196b bVar, C26189a aVar) {
        this.f64680c = new Rect();
        this.f64679b = bVar;
        this.f64678a = aVar;
    }

    /* renamed from: a */
    private void m94739a(Rect rect, RecyclerView recyclerView, View view) {
        this.f64678a.mo93165a(rect, view);
        if (this.f64679b.mo93174a(recyclerView) == 1) {
            rect.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), (recyclerView.getWidth() - recyclerView.getPaddingRight()) - rect.right, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            rect.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - rect.bottom);
        }
    }

    /* renamed from: a */
    public void mo93172a(RecyclerView recyclerView, Canvas canvas, View view, Rect rect) {
        canvas.save();
        if (recyclerView.getLayoutManager().getClipToPadding()) {
            m94739a(this.f64680c, recyclerView, view);
            canvas.clipRect(this.f64680c);
        }
        canvas.translate((float) rect.left, (float) rect.top);
        view.draw(canvas);
        canvas.restore();
    }
}
