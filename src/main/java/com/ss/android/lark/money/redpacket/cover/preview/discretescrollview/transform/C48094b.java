package com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform;

import android.view.View;
import com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.Pivot;

/* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.b */
public class C48094b implements AbstractC48093a {

    /* renamed from: a */
    public Pivot f121059a = Pivot.EnumC48085X.CENTER.create();

    /* renamed from: b */
    public Pivot f121060b = Pivot.EnumC48089Y.CENTER.create();

    /* renamed from: c */
    public float f121061c = 0.8f;

    /* renamed from: d */
    public float f121062d = 0.2f;

    /* renamed from: e */
    public float f121063e = 1.0f;

    /* renamed from: f */
    public float f121064f;

    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.b$a */
    public static class C48095a {

        /* renamed from: a */
        private C48094b f121065a = new C48094b();

        /* renamed from: b */
        private float f121066b = 1.0f;

        /* renamed from: a */
        public C48094b mo168399a() {
            C48094b bVar = this.f121065a;
            bVar.f121062d = this.f121066b - bVar.f121061c;
            C48094b bVar2 = this.f121065a;
            bVar2.f121064f = 1.0f - bVar2.f121063e;
            return this.f121065a;
        }

        /* renamed from: a */
        public C48095a mo168398a(float f) {
            this.f121065a.f121061c = f;
            return this;
        }

        /* renamed from: b */
        public C48095a mo168400b(float f) {
            this.f121065a.f121063e = f;
            return this;
        }
    }

    @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.AbstractC48093a
    /* renamed from: a */
    public void mo168397a(View view, float f) {
        this.f121059a.mo168394a(view);
        this.f121060b.mo168394a(view);
        float abs = 1.0f - Math.abs(f);
        float f2 = this.f121061c + (this.f121062d * abs);
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setAlpha(this.f121063e + (this.f121064f * abs));
    }
}
