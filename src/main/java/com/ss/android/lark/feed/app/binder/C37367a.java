package com.ss.android.lark.feed.app.binder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.banner.C37312a;
import com.ss.android.lark.feed.app.banner.base.AbstractC37318c;
import com.ss.android.lark.feed.app.banner.base.IBanner;
import com.ss.android.lark.feed.app.entity.BannerPreview;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;

/* renamed from: com.ss.android.lark.feed.app.binder.a */
public class C37367a implements AbstractC37406i<BannerPreview, RecyclerView.ViewHolder, AbstractC37628k> {

    /* renamed from: com.ss.android.lark.feed.app.binder.a$a */
    public static class C37369a extends RecyclerView.ViewHolder {
        public C37369a(View view) {
            super(view);
        }
    }

    @Override // com.ss.android.lark.feed.app.binder.AbstractC37406i
    /* renamed from: a */
    public RecyclerView.ViewHolder mo137224a(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC37305b bVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(layoutParams);
        return new C37369a(frameLayout);
    }

    /* renamed from: a */
    public void mo137226a(final RecyclerView.ViewHolder viewHolder, final BannerPreview bannerPreview, final AbstractC37628k kVar, int i) {
        IBanner a = C37312a.m146962a().mo137149a(bannerPreview.getBannerStyle());
        if (a == null || a.mo137158d() == null) {
            viewHolder.itemView.setVisibility(8);
            return;
        }
        viewHolder.itemView.setVisibility(0);
        FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
        View view = a.mo137158d().getView();
        view.setVisibility(0);
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view, -1, -2);
        a.mo137158d().mo137145a("banner_holder", new AbstractC37318c.AbstractC37319a() {
            /* class com.ss.android.lark.feed.app.binder.C37367a.C373681 */

            @Override // com.ss.android.lark.feed.app.banner.base.AbstractC37318c.AbstractC37319a
            /* renamed from: a */
            public void mo137169a() {
                kVar.mo138034a().mo138951b(viewHolder, bannerPreview);
            }

            @Override // com.ss.android.lark.feed.app.banner.base.AbstractC37318c.AbstractC37319a
            /* renamed from: b */
            public void mo137170b() {
                kVar.mo138034a().mo138951b(viewHolder, bannerPreview);
            }
        });
    }
}
