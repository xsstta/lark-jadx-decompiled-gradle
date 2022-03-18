package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import androidx.core.util.C0845f;
import com.google.android.material.p980a.C22117b;
import com.google.android.material.p980a.C22123h;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.b */
public abstract class AbstractC22286b implements AbstractC22305f {

    /* renamed from: a */
    private final Context f54507a;

    /* renamed from: b */
    private final ExtendedFloatingActionButton f54508b;

    /* renamed from: c */
    private final ArrayList<Animator.AnimatorListener> f54509c = new ArrayList<>();

    /* renamed from: d */
    private final C22285a f54510d;

    /* renamed from: e */
    private C22123h f54511e;

    /* renamed from: f */
    private C22123h f54512f;

    @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
    /* renamed from: b */
    public final List<Animator.AnimatorListener> mo77582b() {
        return this.f54509c;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
    /* renamed from: c */
    public C22123h mo77583c() {
        return this.f54512f;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
    /* renamed from: d */
    public void mo77487d() {
        this.f54510d.mo77578b();
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
    /* renamed from: e */
    public void mo77492e() {
        this.f54510d.mo77578b();
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
    /* renamed from: f */
    public AnimatorSet mo77488f() {
        return mo77581b(mo77579a());
    }

    /* renamed from: a */
    public final C22123h mo77579a() {
        C22123h hVar = this.f54512f;
        if (hVar != null) {
            return hVar;
        }
        if (this.f54511e == null) {
            this.f54511e = C22123h.m79717a(this.f54507a, mo77490h());
        }
        return (C22123h) C0845f.m3991a(this.f54511e);
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
    /* renamed from: a */
    public final void mo77580a(C22123h hVar) {
        this.f54512f = hVar;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
    /* renamed from: a */
    public void mo77485a(Animator animator) {
        this.f54510d.mo77577a(animator);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AnimatorSet mo77581b(C22123h hVar) {
        ArrayList arrayList = new ArrayList();
        if (hVar.mo76294c("opacity")) {
            arrayList.add(hVar.mo76289a("opacity", this.f54508b, View.ALPHA));
        }
        if (hVar.mo76294c("scale")) {
            arrayList.add(hVar.mo76289a("scale", this.f54508b, View.SCALE_Y));
            arrayList.add(hVar.mo76289a("scale", this.f54508b, View.SCALE_X));
        }
        if (hVar.mo76294c("width")) {
            arrayList.add(hVar.mo76289a("width", this.f54508b, ExtendedFloatingActionButton.f54453h));
        }
        if (hVar.mo76294c("height")) {
            arrayList.add(hVar.mo76289a("height", this.f54508b, ExtendedFloatingActionButton.f54454i));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C22117b.m79707a(animatorSet, arrayList);
        return animatorSet;
    }

    AbstractC22286b(ExtendedFloatingActionButton extendedFloatingActionButton, C22285a aVar) {
        this.f54508b = extendedFloatingActionButton;
        this.f54507a = extendedFloatingActionButton.getContext();
        this.f54510d = aVar;
    }
}
