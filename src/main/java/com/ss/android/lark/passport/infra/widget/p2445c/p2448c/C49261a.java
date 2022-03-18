package com.ss.android.lark.passport.infra.widget.p2445c.p2448c;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.passport.infra.widget.p2445c.p2447b.C49259a;
import com.ss.android.lark.passport.infra.widget.p2445c.p2449d.AbstractC49264b;

/* renamed from: com.ss.android.lark.passport.infra.widget.c.c.a */
public class C49261a {

    /* renamed from: a */
    private final C49259a f123643a;

    /* renamed from: b */
    private final AbstractC49264b f123644b;

    /* renamed from: c */
    private final Rect f123645c;

    public C49261a(AbstractC49264b bVar) {
        this(bVar, new C49259a());
    }

    private C49261a(AbstractC49264b bVar, C49259a aVar) {
        this.f123645c = new Rect();
        this.f123644b = bVar;
        this.f123643a = aVar;
    }

    /* renamed from: a */
    private void m194129a(Rect rect, RecyclerView recyclerView, View view) {
        this.f123643a.mo171814a(rect, view);
        if (this.f123644b.mo171821a(recyclerView) == 1) {
            rect.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), (recyclerView.getWidth() - recyclerView.getPaddingRight()) - rect.right, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            rect.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - rect.bottom);
        }
    }

    /* renamed from: a */
    public void mo171819a(RecyclerView recyclerView, Canvas canvas, View view, Rect rect) {
        canvas.save();
        if (recyclerView.getLayoutManager().getClipToPadding()) {
            m194129a(this.f123645c, recyclerView, view);
            canvas.clipRect(this.f123645c);
        }
        canvas.translate((float) rect.left, (float) rect.top);
        view.draw(canvas);
        canvas.restore();
    }
}
