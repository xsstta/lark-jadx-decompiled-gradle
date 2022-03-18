package com.ss.android.lark.guide.landing.vc.p1930b;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.guide.landing.vc.mvp.C38666b;
import com.ss.android.lark.guide.landing.vc.mvp.C38667c;
import com.ss.android.lark.guide.landing.vc.mvp.SingleWelcomeView;
import com.ss.android.lark.guide.landing.vc.p1929a.C38653a;

/* renamed from: com.ss.android.lark.guide.landing.vc.b.a */
public class C38654a extends BaseFragment {

    /* renamed from: a */
    public C38653a f99363a;

    /* renamed from: b */
    public AbstractC38658b f99364b;

    /* renamed from: c */
    public View f99365c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guide.landing.vc.b.a$a */
    public class C38656a implements C38667c.AbstractC38669b {
        @Override // com.ss.android.lark.guide.landing.vc.mvp.C38667c.AbstractC38669b
        /* renamed from: a */
        public Context mo141579a() {
            return C38654a.this.getActivity();
        }

        @Override // com.ss.android.lark.guide.landing.vc.mvp.C38667c.AbstractC38669b
        /* renamed from: b */
        public C38653a mo141580b() {
            return C38654a.this.f99363a;
        }

        @Override // com.ss.android.lark.guide.landing.vc.mvp.C38667c.AbstractC38669b
        /* renamed from: c */
        public void mo141581c() {
            if (C38654a.this.f99364b != null) {
                C38654a.this.f99364b.mo141577a();
            }
        }

        @Override // com.ss.android.lark.guide.landing.vc.mvp.C38667c.AbstractC38669b
        /* renamed from: d */
        public void mo141582d() {
            if (C38654a.this.f99364b != null) {
                C38654a.this.f99364b.mo141578b();
            }
        }

        private C38656a() {
        }
    }

    /* renamed from: a */
    private void m152531a() {
        new C38667c(new C38666b(), new SingleWelcomeView(new C38657b()), new C38656a()).create();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guide.landing.vc.b.a$b */
    public class C38657b implements SingleWelcomeView.AbstractC38661a {
        private C38657b() {
        }

        @Override // com.ss.android.lark.guide.landing.vc.mvp.SingleWelcomeView.AbstractC38661a
        /* renamed from: a */
        public void mo141583a(SingleWelcomeView singleWelcomeView) {
            ButterKnife.bind(singleWelcomeView, C38654a.this.f99365c);
        }
    }

    public C38654a(C38653a aVar, AbstractC38658b bVar) {
        this.f99363a = aVar;
        this.f99364b = bVar;
    }

    /* renamed from: a */
    public static C38654a m152530a(C38653a aVar, AbstractC38658b bVar) {
        return new C38654a(aVar, bVar);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f99365c = layoutInflater.inflate(R.layout.activity_single_welcome_page, viewGroup, false);
        m152531a();
        return this.f99365c;
    }
}
