package com.lynx.tasm.behavior.ui;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.ui.utils.C26834g;
import com.lynx.tasm.p1225c.p1226a.AbstractC26862a;

public class LynxFlattenUI extends LynxBaseUI {

    /* renamed from: a */
    private float f66250a;

    /* renamed from: b */
    private AbstractC26862a f66251b;

    /* renamed from: c */
    private boolean f66252c;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: G */
    public float mo94924G() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: H */
    public float mo94925H() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: I */
    public float mo94926I() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo53300d() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void an() {
        super.an();
        mo95041w();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.AbstractC26757c
    /* renamed from: v */
    public void mo95040v() {
        this.f66252c = false;
        if (this.f66241v != null) {
            this.f66241v.mo95040v();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.AbstractC26757c
    /* renamed from: w */
    public void mo95041w() {
        this.f66252c = false;
        if (this.f66241v != null) {
            this.f66241v.mo95041w();
        }
    }

    /* renamed from: e */
    private boolean mo53301e() {
        int M = mo94930M();
        if (M != 3 && (M & 1) == 0 && (M & 2) == 0) {
            return false;
        }
        return true;
    }

    public LynxFlattenUI(AbstractC26684l lVar) {
        this(lVar, null);
    }

    /* renamed from: d */
    private boolean m96990d(Canvas canvas) {
        return canvas.isHardwareAccelerated();
    }

    @LynxProp(defaultFloat = 1.0f, name = "opacity")
    public void setAlpha(float f) {
        this.f66250a = f;
        mo95041w();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @LynxProp(name = "transform")
    public void setTransform(ReadableArray readableArray) {
        super.setTransform(readableArray);
        mo95041w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo95048a(Canvas canvas) {
        boolean z = this.f66252c;
        this.f66252c = true;
        if (this.f66251b == null || !m96990d(canvas)) {
            mo95051b(canvas);
            return;
        }
        if (!z || !this.f66251b.mo95620d()) {
            mo95050a(this.f66251b);
        }
        if (this.f66251b.mo95620d()) {
            this.f66251b.mo95617a(canvas);
        }
    }

    /* renamed from: c */
    public void mo95052c(Canvas canvas) {
        BackgroundDrawable c = this.f66243x.mo95533c();
        if (c != null) {
            c.setBounds(0, 0, mo94937T(), mo94938U());
            c.draw(canvas);
            if (this.f66239t.mo94671a()) {
                for (LynxBaseUI lynxBaseUI : this.f66242w) {
                    if (lynxBaseUI instanceof LynxFlattenUI) {
                        mo95049a((LynxFlattenUI) lynxBaseUI, canvas);
                    }
                }
            }
        } else if (this.f66239t.mo94671a()) {
            for (LynxBaseUI lynxBaseUI2 : this.f66242w) {
                if (lynxBaseUI2 instanceof LynxFlattenUI) {
                    mo95049a((LynxFlattenUI) lynxBaseUI2, canvas);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95050a(AbstractC26862a aVar) {
        int W = mo94940W() + mo94937T();
        int V = mo94939V() + mo94938U();
        if (mo53301e()) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) mo94920C();
            if (lynxBaseUI instanceof UIGroup) {
                UIGroup uIGroup = (UIGroup) lynxBaseUI;
                W = Math.max(W, uIGroup.mo94937T());
                V = Math.max(V, uIGroup.mo94938U());
                int aF = uIGroup.aF();
                while (true) {
                    aF--;
                    if (aF <= -1) {
                        break;
                    }
                    LynxBaseUI a = uIGroup.mo95122a(aF);
                    W = Math.max(W, a.mo94940W() + a.mo94937T() + a.mo94943Z() + uIGroup.f66195A);
                    V = Math.max(V, a.mo94939V() + a.mo94938U() + a.aa() + uIGroup.f66197C);
                }
            }
        }
        aVar.mo95616a(0, 0, W, V);
        Canvas a2 = aVar.mo95615a(W, V);
        mo95051b(a2);
        aVar.mo95618b(a2);
    }

    /* renamed from: b */
    public void mo95051b(Canvas canvas) {
        String str = mo94919B() + ".flatten.draw";
        TraceEvent.m96443a(str);
        if (this.f66250a <= BitmapDescriptorFactory.HUE_RED) {
            TraceEvent.m96444b(str);
            return;
        }
        int W = mo94940W();
        int V = mo94939V();
        int i = 0;
        if (this.f66250a >= 1.0f) {
            if ((W | V) == 0) {
                if (this.f66210P != null) {
                    int save = canvas.save();
                    m96989a(canvas, false);
                    i = save;
                }
                mo95052c(canvas);
                if (this.f66210P != null) {
                    canvas.restoreToCount(i);
                }
            } else {
                int save2 = canvas.save();
                m96989a(canvas, true);
                if (mo94930M() != 0) {
                    Rect N = mo94931N();
                    if (N != null) {
                        canvas.clipRect(N);
                    }
                } else {
                    canvas.clipRect(new Rect(0, 0, mo94937T(), mo94938U()));
                }
                mo95052c(canvas);
                canvas.restoreToCount(save2);
            }
        } else if ((W | V) == 0) {
            canvas.saveLayerAlpha(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) mo94937T(), (float) mo94938U(), (int) (this.f66250a * 255.0f), 31);
            m96989a(canvas, false);
            mo95052c(canvas);
            canvas.restore();
        } else {
            m96989a(canvas, true);
            canvas.saveLayerAlpha(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) mo94937T(), (float) mo94938U(), (int) (this.f66250a * 255.0f), 31);
            mo95052c(canvas);
            canvas.restore();
            canvas.translate((float) (-W), (float) (-V));
        }
        TraceEvent.m96444b(str);
    }

    /* renamed from: a */
    public void mo95049a(LynxFlattenUI lynxFlattenUI, Canvas canvas) {
        lynxFlattenUI.mo95048a(canvas);
    }

    public LynxFlattenUI(AbstractC26684l lVar, Object obj) {
        super(lVar, obj);
        this.f66250a = 1.0f;
        if (AbstractC26862a.m97639a() && mo53300d()) {
            this.f66251b = AbstractC26862a.m97640b();
        }
    }

    /* renamed from: a */
    private void m96989a(Canvas canvas, boolean z) {
        C26834g a = C26834g.m97547a(this.f66211Q, (float) mo94937T(), (float) mo94938U());
        C26834g a2 = C26834g.m97548a(this.f66210P, this.f66239t.mo94692n().ad(), ad(), (float) this.f66239t.mo94692n().mo94937T(), (float) this.f66239t.mo94692n().mo94938U(), (float) mo94937T(), (float) mo94938U());
        if (mo94920C() instanceof UIShadowProxy) {
            ((UIShadowProxy) mo94920C()).mo53305i();
        }
        if (z) {
            canvas.translate((float) mo94940W(), (float) mo94939V());
        }
        if (this.f66210P != null && a2 != null) {
            canvas.concat(a2.mo95554a(a.mo95576j(), a.mo95578k()));
        }
    }
}
