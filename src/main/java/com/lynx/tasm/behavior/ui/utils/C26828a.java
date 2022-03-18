package com.lynx.tasm.behavior.ui.utils;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.utils.C26945b;
import com.lynx.tasm.utils.C26953h;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.utils.a */
public class C26828a extends C26830c {

    /* renamed from: c */
    private WeakReference<LynxUI> f66629c;

    /* renamed from: d */
    private C26953h.C26954a f66630d;

    /* renamed from: e */
    private PointF f66631e;

    /* renamed from: f */
    private float f66632f;

    /* renamed from: b */
    public float mo95520b() {
        return this.f66632f;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.utils.C26830c
    /* renamed from: a */
    public BackgroundDrawable mo95516a() {
        LynxUI lynxUI = this.f66629c.get();
        if (lynxUI == null) {
            return null;
        }
        BackgroundDrawable a = super.mo95516a();
        Drawable background = lynxUI.av().getBackground();
        C26837i.m97587a(lynxUI.av(), null);
        if (background == null) {
            C26837i.m97587a(lynxUI.av(), a);
        } else {
            C26837i.m97587a(lynxUI.av(), new LayerDrawable(new Drawable[]{a, background}));
        }
        return a;
    }

    /* renamed from: h */
    private void m97502h() {
        LynxUI lynxUI = this.f66629c.get();
        if (lynxUI != null) {
            lynxUI.av().setTranslationX(BitmapDescriptorFactory.HUE_RED);
            lynxUI.av().setTranslationY(BitmapDescriptorFactory.HUE_RED);
            lynxUI.av().setRotation(BitmapDescriptorFactory.HUE_RED);
            lynxUI.av().setRotationX(BitmapDescriptorFactory.HUE_RED);
            lynxUI.av().setRotationY(BitmapDescriptorFactory.HUE_RED);
            lynxUI.av().setScaleX(1.0f);
            lynxUI.av().setScaleY(1.0f);
            this.f66630d = null;
            m97503i();
        }
    }

    /* renamed from: i */
    private void m97503i() {
        float f;
        LynxUI lynxUI = this.f66629c.get();
        if (lynxUI != null) {
            PointF pointF = this.f66631e;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (pointF != null) {
                f2 = pointF.x + BitmapDescriptorFactory.HUE_RED;
                f = BitmapDescriptorFactory.HUE_RED + this.f66631e.y;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            C26953h.C26954a aVar = this.f66630d;
            if (aVar != null) {
                f2 += C26945b.m97907a(aVar.mo95806b());
                f += C26945b.m97907a(this.f66630d.mo95807c());
            }
            lynxUI.av().setTranslationX(f2);
            lynxUI.av().setTranslationY(f);
        }
    }

    /* renamed from: a */
    public void mo95517a(PointF pointF) {
        this.f66631e = pointF;
        m97503i();
    }

    /* renamed from: a */
    public static float m97501a(String str) {
        if (str.endsWith("deg")) {
            return Float.valueOf(str.substring(0, str.length() - 3)).floatValue();
        }
        if (str.endsWith("rad")) {
            return (Float.valueOf(str.substring(0, str.length() - 3)).floatValue() * 180.0f) / 3.1415927f;
        }
        if (str.endsWith("turn")) {
            return Float.valueOf(str.substring(0, str.length() - 4)).floatValue() * 360.0f;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: a */
    public void mo95518a(C26833f fVar) {
        LynxUI lynxUI = this.f66629c.get();
        if (lynxUI != null && fVar != null) {
            C26834g a = C26834g.m97547a(fVar, (float) lynxUI.mo94937T(), (float) lynxUI.mo94938U());
            lynxUI.av().setPivotX(a.mo95576j());
            lynxUI.av().setPivotY(a.mo95578k());
            lynxUI.av().invalidate();
        }
    }

    /* renamed from: a */
    public void mo95519a(List<C26836h> list) {
        LynxUI lynxUI = this.f66629c.get();
        if (lynxUI != null) {
            m97502h();
            if (list != null) {
                C26953h.C26954a aVar = new C26953h.C26954a();
                this.f66630d = aVar;
                aVar.mo95805a();
                double[] dArr = new double[16];
                C26834g.m97548a(list, this.f66633a.mo94692n().ad(), this.f66634b, (float) this.f66633a.mo94692n().mo94937T(), (float) this.f66633a.mo94692n().mo94938U(), (float) lynxUI.mo94937T(), (float) lynxUI.mo94938U()).mo95558a(dArr);
                C26953h.m97924a(dArr, this.f66630d);
                m97503i();
                if (Build.VERSION.SDK_INT >= 21) {
                    lynxUI.av().setOutlineProvider(null);
                    ViewCompat.m4095l(lynxUI.av(), C26945b.m97907a(this.f66630d.mo95808d()));
                } else {
                    float d = this.f66630d.mo95808d();
                    this.f66632f = d;
                    lynxUI.setZIndex(Math.round(d));
                }
                lynxUI.av().setRotation(C26945b.m97907a(this.f66630d.mo95811g()));
                lynxUI.av().setRotationX(C26945b.m97907a(this.f66630d.mo95809e()));
                lynxUI.av().setRotationY(C26945b.m97907a(this.f66630d.mo95810f()));
                lynxUI.av().setScaleX(C26945b.m97907a(this.f66630d.mo95812h()));
                lynxUI.av().setScaleY(C26945b.m97907a(this.f66630d.mo95813i()));
                lynxUI.av().invalidate();
            }
        }
    }

    public C26828a(LynxUI lynxUI, AbstractC26684l lVar) {
        super(lVar);
        this.f66629c = new WeakReference<>(lynxUI);
    }
}
