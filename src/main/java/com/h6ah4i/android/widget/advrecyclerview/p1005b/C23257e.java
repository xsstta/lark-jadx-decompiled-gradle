package com.h6ah4i.android.widget.advrecyclerview.p1005b;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.view.C0924x;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.C23252d;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23247h;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.C23249j;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23298h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.e */
public class C23257e extends C23250b {

    /* renamed from: a */
    public static final Interpolator f57331a = new AccelerateDecelerateInterpolator();

    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.AbstractC23251c, com.h6ah4i.android.widget.advrecyclerview.p1005b.C23252d, com.h6ah4i.android.widget.advrecyclerview.p1005b.C23250b
    /* renamed from: c */
    public void mo80649c() {
        mo80650a(new C23252d.C23253a(this));
        mo80653a(new C23258a(this));
        mo80651a(new C23252d.C23254b(this));
        mo80652a(new C23252d.C23255c(this));
        setRemoveDuration(150);
        setMoveDuration(150);
    }

    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.e$a */
    protected static class C23258a extends AbstractC23247h {

        /* renamed from: a */
        protected static final Interpolator f57332a = new AccelerateDecelerateInterpolator();

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo80601a(C23249j jVar, RecyclerView.ViewHolder viewHolder) {
        }

        public C23258a(AbstractC23236a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        protected static boolean m84338a(C23249j jVar) {
            return jVar instanceof C23259b;
        }

        /* renamed from: b */
        protected static boolean m84339b(RecyclerView.ViewHolder viewHolder) {
            if (!(viewHolder instanceof AbstractC23298h)) {
                return false;
            }
            AbstractC23298h hVar = (AbstractC23298h) viewHolder;
            int b = hVar.mo80839b();
            int c = hVar.mo80842c();
            if ((b == 2 || b == 3 || b == 4 || b == 5) && c == 1) {
                return true;
            }
            return false;
        }

        @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23247h
        /* renamed from: a */
        public boolean mo80625a(RecyclerView.ViewHolder viewHolder) {
            if (m84339b(viewHolder)) {
                View view = viewHolder.itemView;
                mo80619f(viewHolder);
                view.setTranslationX((float) ((int) (view.getTranslationX() + 0.5f)));
                view.setTranslationY((float) ((int) (view.getTranslationY() + 0.5f)));
                mo80608c(new C23259b(viewHolder));
                return true;
            }
            mo80619f(viewHolder);
            mo80608c(new C23249j(viewHolder));
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo80600a(C23249j jVar) {
            C0924x xVar;
            if (m84339b(jVar.f57325a)) {
                xVar = ViewCompat.m4103r(jVar.f57325a.itemView);
                xVar.mo4724a(mo80646h());
            } else {
                xVar = ViewCompat.m4103r(jVar.f57325a.itemView);
                xVar.mo4724a(mo80646h());
                xVar.mo4725a(f57332a);
                xVar.mo4723a(BitmapDescriptorFactory.HUE_RED);
            }
            mo80602a(jVar, jVar.f57325a, xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo80609c(C23249j jVar, RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (m84338a(jVar)) {
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                return;
            }
            view.setAlpha(1.0f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo80606b(C23249j jVar, RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (m84338a(jVar)) {
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                return;
            }
            view.setAlpha(1.0f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.e$b */
    public static class C23259b extends C23249j {
        public C23259b(RecyclerView.ViewHolder viewHolder) {
            super(viewHolder);
        }
    }
}
