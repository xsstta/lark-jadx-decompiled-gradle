package com.ss.android.lark.feed.app.binder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.entity.ExtraHeaderPreview;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;

/* renamed from: com.ss.android.lark.feed.app.binder.f */
public class C37391f implements AbstractC37406i<ExtraHeaderPreview, C37392a, AbstractC37628k> {

    /* renamed from: a */
    private Context f95933a;

    /* renamed from: com.ss.android.lark.feed.app.binder.f$a */
    public static class C37392a extends RecyclerView.ViewHolder {
        public C37392a(View view) {
            super(view);
        }
    }

    /* renamed from: b */
    public C37392a mo137224a(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC37305b bVar) {
        this.f95933a = viewGroup.getContext();
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        return new C37392a(view);
    }

    /* renamed from: a */
    public void mo137226a(C37392a aVar, ExtraHeaderPreview extraHeaderPreview, AbstractC37628k kVar, int i) {
        View view = aVar.itemView;
        view.setBackgroundColor(this.f95933a.getResources().getColor(R.color.bg_body));
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, kVar.mo138039f()));
    }
}
