package com.h6ah4i.android.widget.advrecyclerview.p1005b;

import android.view.View;
import androidx.core.view.C0924x;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23243d;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23244e;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23245f;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23246g;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23247h;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.C23238a;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.C23242c;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.C23248i;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.C23249j;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.d */
public class C23252d extends AbstractC23251c {
    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.AbstractC23251c
    /* renamed from: e */
    public void mo80655e() {
        mo80656f();
    }

    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.AbstractC23251c
    /* renamed from: c */
    public void mo80649c() {
        mo80650a(new C23253a(this));
        mo80653a(new C23256d(this));
        mo80651a(new C23254b(this));
        mo80652a(new C23255c(this));
    }

    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.d$a */
    protected static class C23253a extends AbstractC23243d {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo80609c(C23238a aVar, RecyclerView.ViewHolder viewHolder) {
        }

        public C23253a(AbstractC23236a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo80600a(C23238a aVar) {
            C0924x r = ViewCompat.m4103r(aVar.f57302a.itemView);
            r.mo4723a(1.0f);
            r.mo4724a(mo80629h());
            mo80602a(aVar, aVar.f57302a, r);
        }

        @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23243d
        /* renamed from: a */
        public boolean mo80625a(RecyclerView.ViewHolder viewHolder) {
            mo80622g(viewHolder);
            viewHolder.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            mo80608c(new C23238a(viewHolder));
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo80606b(C23238a aVar, RecyclerView.ViewHolder viewHolder) {
            viewHolder.itemView.setAlpha(1.0f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo80601a(C23238a aVar, RecyclerView.ViewHolder viewHolder) {
            viewHolder.itemView.setAlpha(1.0f);
        }
    }

    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.d$b */
    protected static class C23254b extends AbstractC23245f {
        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo80601a(C23242c cVar, RecyclerView.ViewHolder viewHolder) {
        }

        public C23254b(AbstractC23236a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23245f
        /* renamed from: a */
        public void mo80630a(C23242c cVar) {
            C0924x r = ViewCompat.m4103r(cVar.f57315b.itemView);
            r.mo4724a(mo80637h());
            r.mo4728b((float) (cVar.f57318e - cVar.f57316c));
            r.mo4731c((float) (cVar.f57319f - cVar.f57317d));
            r.mo4723a(BitmapDescriptorFactory.HUE_RED);
            mo80602a(cVar, cVar.f57315b, r);
        }

        /* access modifiers changed from: protected */
        @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23245f
        /* renamed from: b */
        public void mo80632b(C23242c cVar) {
            C0924x r = ViewCompat.m4103r(cVar.f57314a.itemView);
            r.mo4728b(BitmapDescriptorFactory.HUE_RED);
            r.mo4731c(BitmapDescriptorFactory.HUE_RED);
            r.mo4724a(mo80637h());
            r.mo4723a(1.0f);
            mo80602a(cVar, cVar.f57314a, r);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo80609c(C23242c cVar, RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            view.setAlpha(1.0f);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo80606b(C23242c cVar, RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            view.setAlpha(1.0f);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }

        @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23245f
        /* renamed from: a */
        public boolean mo80631a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            float translationX = viewHolder.itemView.getTranslationX();
            float translationY = viewHolder.itemView.getTranslationY();
            float alpha = viewHolder.itemView.getAlpha();
            mo80622g(viewHolder);
            int i5 = (int) (((float) (i3 - i)) - translationX);
            int i6 = (int) (((float) (i4 - i2)) - translationY);
            viewHolder.itemView.setTranslationX(translationX);
            viewHolder.itemView.setTranslationY(translationY);
            viewHolder.itemView.setAlpha(alpha);
            if (viewHolder2 != null) {
                mo80622g(viewHolder2);
                viewHolder2.itemView.setTranslationX((float) (-i5));
                viewHolder2.itemView.setTranslationY((float) (-i6));
                viewHolder2.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            mo80608c((AbstractC23244e) new C23242c(viewHolder, viewHolder2, i, i2, i3, i4));
            return true;
        }
    }

    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.d$c */
    protected static class C23255c extends AbstractC23246g {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo80609c(C23248i iVar, RecyclerView.ViewHolder viewHolder) {
        }

        public C23255c(AbstractC23236a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo80600a(C23248i iVar) {
            View view = iVar.f57324e.itemView;
            int i = iVar.f57322c - iVar.f57320a;
            int i2 = iVar.f57323d - iVar.f57321b;
            if (i != 0) {
                ViewCompat.m4103r(view).mo4728b(BitmapDescriptorFactory.HUE_RED);
            }
            if (i2 != 0) {
                ViewCompat.m4103r(view).mo4731c(BitmapDescriptorFactory.HUE_RED);
            }
            C0924x r = ViewCompat.m4103r(view);
            r.mo4724a(mo80642h());
            mo80602a(iVar, iVar.f57324e, r);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo80606b(C23248i iVar, RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo80601a(C23248i iVar, RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            int i = iVar.f57322c - iVar.f57320a;
            int i2 = iVar.f57323d - iVar.f57321b;
            if (i != 0) {
                ViewCompat.m4103r(view).mo4728b(BitmapDescriptorFactory.HUE_RED);
            }
            if (i2 != 0) {
                ViewCompat.m4103r(view).mo4731c(BitmapDescriptorFactory.HUE_RED);
            }
            if (i != 0) {
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            }
            if (i2 != 0) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
        }

        @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23246g
        /* renamed from: a */
        public boolean mo80638a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            View view = viewHolder.itemView;
            int translationX = (int) (((float) i) + viewHolder.itemView.getTranslationX());
            int translationY = (int) (((float) i2) + viewHolder.itemView.getTranslationY());
            mo80622g(viewHolder);
            int i5 = i3 - translationX;
            int i6 = i4 - translationY;
            C23248i iVar = new C23248i(viewHolder, translationX, translationY, i3, i4);
            if (i5 == 0 && i6 == 0) {
                mo80617e(iVar, iVar.f57324e);
                iVar.mo80598a(iVar.f57324e);
                return false;
            }
            if (i5 != 0) {
                view.setTranslationX((float) (-i5));
            }
            if (i6 != 0) {
                view.setTranslationY((float) (-i6));
            }
            mo80608c(iVar);
            return true;
        }
    }

    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.d$d */
    protected static class C23256d extends AbstractC23247h {
        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo80601a(C23249j jVar, RecyclerView.ViewHolder viewHolder) {
        }

        public C23256d(AbstractC23236a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo80600a(C23249j jVar) {
            C0924x r = ViewCompat.m4103r(jVar.f57325a.itemView);
            r.mo4724a(mo80646h());
            r.mo4723a(BitmapDescriptorFactory.HUE_RED);
            mo80602a(jVar, jVar.f57325a, r);
        }

        @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23247h
        /* renamed from: a */
        public boolean mo80625a(RecyclerView.ViewHolder viewHolder) {
            mo80622g(viewHolder);
            mo80608c(new C23249j(viewHolder));
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo80606b(C23249j jVar, RecyclerView.ViewHolder viewHolder) {
            viewHolder.itemView.setAlpha(1.0f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo80609c(C23249j jVar, RecyclerView.ViewHolder viewHolder) {
            viewHolder.itemView.setAlpha(1.0f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        if (!list.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, list)) {
            return true;
        }
        return false;
    }
}
