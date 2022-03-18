package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.util.C0845f;
import com.google.android.material.p989j.C22375b;
import com.google.android.material.p990k.AbstractC22377b;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.e */
public class C22303e extends C22290d {
    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C22290d
    /* renamed from: j */
    public void mo77635j() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C22290d
    /* renamed from: s */
    public boolean mo77644s() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C22290d
    /* renamed from: x */
    public void mo77649x() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C22290d
    /* renamed from: n */
    public void mo77639n() {
        mo77640o();
    }

    @Override // com.google.android.material.floatingactionbutton.C22290d
    /* renamed from: a */
    public float mo77601a() {
        return this.f54563v.getElevation();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C22290d
    /* renamed from: u */
    public MaterialShapeDrawable mo77646u() {
        return new C22304a((C22398l) C0845f.m3991a(this.f54549b));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C22290d
    /* renamed from: p */
    public boolean mo77641p() {
        if (this.f54564w.mo77571a() || !mo77633h()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.e$a */
    public static class C22304a extends MaterialShapeDrawable {
        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public boolean isStateful() {
            return true;
        }

        C22304a(C22398l lVar) {
            super(lVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C22290d
    /* renamed from: b */
    public void mo77620b(ColorStateList colorStateList) {
        if (this.f54551d instanceof RippleDrawable) {
            ((RippleDrawable) this.f54551d).setColor(C22375b.m81040b(colorStateList));
        } else {
            super.mo77620b(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C22290d
    /* renamed from: a */
    public void mo77609a(Rect rect) {
        if (this.f54564w.mo77571a()) {
            super.mo77609a(rect);
        } else if (!mo77633h()) {
            int sizeDimension = (this.f54559l - this.f54563v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C22290d
    /* renamed from: a */
    public void mo77615a(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f54563v.isEnabled()) {
            this.f54563v.setElevation(this.f54556i);
            if (this.f54563v.isPressed()) {
                this.f54563v.setTranslationZ(this.f54558k);
            } else if (this.f54563v.isFocused() || this.f54563v.isHovered()) {
                this.f54563v.setTranslationZ(this.f54557j);
            } else {
                this.f54563v.setTranslationZ(BitmapDescriptorFactory.HUE_RED);
            }
        } else {
            this.f54563v.setElevation(BitmapDescriptorFactory.HUE_RED);
            this.f54563v.setTranslationZ(BitmapDescriptorFactory.HUE_RED);
        }
    }

    C22303e(FloatingActionButton floatingActionButton, AbstractC22377b bVar) {
        super(floatingActionButton, bVar);
    }

    /* renamed from: a */
    private Animator m80747a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f54563v, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f54563v, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(f54530a);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C22287c mo77661a(int i, ColorStateList colorStateList) {
        Context context = this.f54563v.getContext();
        C22287c cVar = new C22287c((C22398l) C0845f.m3991a(this.f54549b));
        cVar.mo77586a(ContextCompat.getColor(context, R.color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, R.color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_outer_color));
        cVar.mo77585a((float) i);
        cVar.mo77587a(colorStateList);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C22290d
    /* renamed from: a */
    public void mo77603a(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f54563v.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f54531p, m80747a(f, f3));
            stateListAnimator.addState(f54532q, m80747a(f, f2));
            stateListAnimator.addState(f54533r, m80747a(f, f2));
            stateListAnimator.addState(f54534s, m80747a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f54563v, "elevation", f).setDuration(0L));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.f54563v, View.TRANSLATION_Z, this.f54563v.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f54563v, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f54530a);
            stateListAnimator.addState(f54535t, animatorSet);
            stateListAnimator.addState(f54536u, m80747a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
            this.f54563v.setStateListAnimator(stateListAnimator);
        }
        if (mo77641p()) {
            mo77640o();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C22290d
    /* renamed from: a */
    public void mo77607a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        this.f54550c = mo77646u();
        this.f54550c.setTintList(colorStateList);
        if (mode != null) {
            this.f54550c.setTintMode(mode);
        }
        this.f54550c.mo77965a(this.f54563v.getContext());
        if (i > 0) {
            this.f54552e = mo77661a(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) C0845f.m3991a(this.f54552e), (Drawable) C0845f.m3991a(this.f54550c)});
        } else {
            this.f54552e = null;
            drawable = this.f54550c;
        }
        this.f54551d = new RippleDrawable(C22375b.m81040b(colorStateList2), drawable, null);
        this.f54553f = this.f54551d;
    }
}
