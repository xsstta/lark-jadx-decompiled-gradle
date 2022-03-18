package com.bytedance.ee.bear.bitable.card.view.p258a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.ui.ColorUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.a.i */
public class C4553i {

    /* renamed from: a */
    private Context f13399a;

    /* renamed from: b */
    private C4525a f13400b;

    /* renamed from: c */
    private AbstractC4549f f13401c;

    /* renamed from: d */
    private int f13402d;

    /* renamed from: e */
    private boolean f13403e = true;

    /* renamed from: a */
    public AbstractC4549f mo17931a() {
        return this.f13401c;
    }

    /* renamed from: b */
    public C4525a mo17933b() {
        return this.f13400b;
    }

    /* renamed from: d */
    private C4537a m18913d() {
        List<C4537a> h = this.f13400b.mo17714h();
        String c = this.f13400b.mo17708c();
        for (C4537a aVar : h) {
            if (TextUtils.equals(c, aVar.mo17829a().mo17749g())) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    private int m18914e() {
        List<C4537a> h = this.f13400b.mo17714h();
        String h2 = this.f13400b.mo17705a().mo17782h();
        for (int i = 0; i < h.size(); i++) {
            if (TextUtils.equals(h2, h.get(i).mo17829a().mo17749g())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public void mo17934c() {
        View rootView = this.f13401c.getRootView();
        rootView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        rootView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        rootView.setScaleX(0.95f);
        rootView.setScaleY(0.95f);
        rootView.setAlpha(0.8f);
        this.f13402d = this.f13401c.getCurrentScrollPosition();
    }

    public C4553i(AbstractC4549f fVar) {
        this.f13401c = fVar;
        this.f13399a = fVar.getRootView().getContext();
    }

    /* renamed from: a */
    public void mo17932a(C4525a aVar) {
        C13479a.m54772d("RecordPresenter_record", "setRecord: " + aVar);
        this.f13400b = aVar;
        if (TextUtils.equals(aVar.mo17707b(), aVar.mo17705a().mo17785j()) && this.f13403e) {
            int k = aVar.mo17705a().mo17786k();
            int e = m18914e();
            this.f13402d = e;
            if (e > -1) {
                aVar.mo17714h().get(this.f13402d).mo17831a(k);
                this.f13401c.mo17911a(this.f13402d);
            }
            this.f13403e = false;
        }
        int color = this.f13399a.getResources().getColor(R.color.primary_pri_500);
        if (!TextUtils.isEmpty(aVar.mo17709d())) {
            try {
                color = ColorUtils.m55697a(aVar.mo17709d());
            } catch (IllegalArgumentException e2) {
                C13479a.m54759a("RecordPresenter", "parse color error", e2);
            }
        }
        this.f13401c.setHeaderColor(color);
        this.f13401c.setFiltered(aVar.mo17710e());
        this.f13401c.setTitle(m18913d());
        this.f13401c.setAddRecordTitleBarVisibility(Boolean.valueOf(aVar.mo17705a().mo17789n()));
        this.f13401c.setVisitPermission(aVar.mo17713g());
        this.f13401c.mo17912a(aVar);
    }
}
