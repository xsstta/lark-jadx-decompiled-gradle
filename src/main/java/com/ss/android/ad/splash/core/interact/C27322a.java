package com.ss.android.ad.splash.core.interact;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.model.C27349o;
import com.ss.android.ad.splash.core.video2.AbstractC27436f;
import com.ss.android.ad.splash.core.video2.AbstractC27437g;
import com.ss.android.ad.splash.core.video2.BDASplashVideoView;
import com.ss.android.ad.splash.core.video2.C27430c;
import com.ss.android.ad.splash.core.video2.C27431d;
import com.ss.android.ad.splash.core.video2.C27433e;
import com.ss.android.ad.splash.utils.C27478h;
import com.ss.android.ad.splash.utils.C27480i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.core.interact.a */
public class C27322a extends PagerAdapter {

    /* renamed from: a */
    public C27431d f68114a = new C27431d();

    /* renamed from: b */
    private C27331b f68115b;

    /* renamed from: c */
    private Context f68116c;

    /* renamed from: d */
    private C27431d f68117d = new C27431d();

    /* renamed from: e */
    private List<AbstractC27437g> f68118e = new ArrayList(2);

    /* renamed from: f */
    private boolean f68119f;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: a */
    public void mo97411a() {
        C27431d dVar = this.f68117d;
        if (dVar != null) {
            dVar.mo97933k();
            this.f68117d = null;
        }
        C27431d dVar2 = this.f68114a;
        if (dVar2 != null) {
            dVar2.mo97933k();
            this.f68114a = null;
        }
    }

    /* renamed from: a */
    public AbstractC27436f mo97410a(int i) {
        if (i == 1) {
            return this.f68117d;
        }
        return this.f68114a;
    }

    /* renamed from: a */
    public void mo97412a(ViewGroup.LayoutParams layoutParams) {
        for (AbstractC27437g gVar : this.f68118e) {
            gVar.setSurfaceLayoutParams(layoutParams);
        }
    }

    public C27322a(Context context, C27331b bVar) {
        this.f68116c = context;
        this.f68115b = bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        C27349o oVar;
        C27431d dVar;
        BDASplashVideoView bDASplashVideoView = new BDASplashVideoView(this.f68116c);
        bDASplashVideoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewGroup.addView(bDASplashVideoView);
        this.f68118e.add(bDASplashVideoView);
        if (i == 1) {
            this.f68117d.mo97968a(bDASplashVideoView);
            dVar = this.f68117d;
            oVar = this.f68115b.mo97445K();
        } else {
            this.f68114a.mo97968a(bDASplashVideoView);
            dVar = this.f68114a;
            oVar = this.f68115b.mo97446L();
            this.f68114a.mo97918a(new C27430c() {
                /* class com.ss.android.ad.splash.core.interact.C27322a.C273231 */

                @Override // com.ss.android.ad.splash.core.video2.AbstractC27429b, com.ss.android.ad.splash.core.video2.C27430c
                /* renamed from: b */
                public void mo97225b(int i) {
                    C27322a.this.f68114a.mo97931i();
                }
            });
        }
        String b = C27478h.m100365b(oVar);
        if (C27480i.m100385a(b)) {
            return bDASplashVideoView;
        }
        if (dVar.mo97924b(b, oVar.mo97579h())) {
            if (!this.f68119f) {
                C27433e.m100134a().mo97977a(this.f68115b, C27287e.m99221T());
                this.f68119f = true;
            }
            if (i == 0) {
                this.f68114a.mo97921a(true);
            }
        }
        C27433e.m100134a().mo97978a(dVar, this.f68115b.ak(), this.f68115b.mo97486c());
        return bDASplashVideoView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
        if (obj instanceof AbstractC27437g) {
            this.f68118e.remove(obj);
        }
        if (i == 1) {
            C27431d dVar = this.f68117d;
            if (dVar != null) {
                dVar.mo97933k();
                this.f68117d = null;
                return;
            }
            return;
        }
        C27431d dVar2 = this.f68114a;
        if (dVar2 != null) {
            dVar2.mo97933k();
            this.f68114a = null;
        }
    }
}
