package com.ss.android.lark.feed.app.binder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.banner.p1852c.AbstractC37366e;
import com.ss.android.lark.feed.app.entity.UGBannerPreview;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;

/* renamed from: com.ss.android.lark.feed.app.binder.o */
public class C37425o implements AbstractC37406i<UGBannerPreview, C37426a, AbstractC37628k> {

    /* renamed from: com.ss.android.lark.feed.app.binder.o$a */
    public static class C37426a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public long f96024a;

        public C37426a(View view) {
            super(view);
        }
    }

    /* renamed from: b */
    public C37426a mo137224a(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC37305b bVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, UIUtils.dp2px(viewGroup.getContext(), 12.0f), 0, 0);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(layoutParams);
        return new C37426a(frameLayout);
    }

    /* renamed from: a */
    public void mo137226a(C37426a aVar, UGBannerPreview uGBannerPreview, AbstractC37628k kVar, int i) {
        if (aVar.f96024a != ((long) uGBannerPreview.hashCode())) {
            aVar.f96024a = (long) uGBannerPreview.hashCode();
            AbstractC37366e ugBannerView = uGBannerPreview.getUgBannerView();
            if (ugBannerView == null) {
                aVar.itemView.setVisibility(8);
                return;
            }
            View a = ugBannerView.mo137175a();
            if (a == null) {
                aVar.itemView.setVisibility(8);
                return;
            }
            if (a.getParent() != null) {
                ((ViewGroup) a.getParent()).removeView(a);
            }
            FrameLayout frameLayout = (FrameLayout) aVar.itemView;
            frameLayout.removeAllViews();
            frameLayout.setVisibility(0);
            frameLayout.addView(a, -1, -2);
        }
    }
}
